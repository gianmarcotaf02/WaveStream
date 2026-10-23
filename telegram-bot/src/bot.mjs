#!/usr/bin/env node
import { ConfigError, loadConfig, isAdmin } from './config.mjs'
import { createLogger } from './logger.mjs'
import { Telegram, isUnreachableUserError } from './telegram.mjs'
import { GitHub } from './github.mjs'
import { Store } from './store.mjs'
import { broadcastToSubscribers, sendReleaseToChannel } from './broadcast.mjs'
import { DIVIDER, escapeHtml } from './markdown.mjs'
import {
  ADMIN_COMMANDS,
  USER_COMMANDS,
  buildAppText,
  buildHelpText,
  buildReleaseKeyboard,
  buildReleaseText,
  buildStatusText,
  buildSubscribedAgainText,
  buildUnsubscribedText,
  buildWelcomeText,
  formatRelativeDateIt,
  TELEGRAM_TEXT_LIMIT,
} from './message.mjs'
import { truncateHtml } from './markdown.mjs'

const sleep = (ms) => new Promise((resolve) => setTimeout(resolve, ms))

/** Estrae comando ed eventuali argomenti da "/cmd@Bot argomenti". */
export function parseCommand(text, botUsername = '') {
  const match = String(text ?? '')
    .trim()
    .match(/^\/([a-zA-Z0-9_]{1,32})(?:@([A-Za-z0-9_]{3,32}))?(?:\s+([\s\S]*))?$/)
  if (!match) return null
  const [, command, target, args] = match
  if (target && botUsername && target.toLowerCase() !== botUsername.toLowerCase()) return null
  return { command: command.toLowerCase(), args: (args ?? '').trim() }
}

class WaveStreamBot {
  #cfg
  #logger
  #tg
  #gh
  #store
  #me
  #stopping = false
  #broadcasting = false
  #lastCommandAt = new Map()
  #releaseCache = { release: null, at: 0 }

  constructor({ cfg, logger, tg, gh, store, me }) {
    this.#cfg = cfg
    this.#logger = logger
    this.#tg = tg
    this.#gh = gh
    this.#store = store
    this.#me = me
  }

  async start() {
    const cfg = this.#cfg
    const logger = this.#logger
    logger.info(`[bot] avviato @${this.#me.username} (id ${this.#me.id}) · repo ${cfg.repo} · admin: ${cfg.adminIds.join(', ') || 'nessuno'}`)
    this.#store.setState({ botUsername: this.#me.username, botId: this.#me.id })
    await this.#syncCommands()
    if (cfg.autoPoll) {
      this.#releaseLoop().catch((err) => logger.error('[bot] release loop interrotto', err))
    } else {
      logger.info('[bot] autoPoll disattivato: nessun controllo automatico delle release')
    }
    await this.#pollLoop()
  }

  stop() {
    this.#stopping = true
  }

  // --- Setup -------------------------------------------------------------

  async #syncCommands() {
    const cfg = this.#cfg
    const logger = this.#logger
    const hash = `${USER_COMMANDS.length}|${ADMIN_COMMANDS.length}|${cfg.adminIds.join(',')}`
    if (this.#store.getState().commandsHash !== hash) {
      try {
        await this.#tg.setMyCommands(USER_COMMANDS)
        await this.#tg.setChatMenuButton({ type: 'commands' })
        for (const adminId of cfg.adminIds) {
          const chatId = Number.parseInt(adminId, 10)
          if (!Number.isFinite(chatId)) continue
          await this.#tg
            .setMyCommands(ADMIN_COMMANDS, { scope: { type: 'chat', chat_id: chatId } })
            .catch((err) => logger.warn(`[bot] comandi admin non impostati per ${adminId}: ${err.description ?? err.message}`))
        }
        this.#store.setState({ commandsHash: hash })
        logger.info('[bot] menu comandi aggiornato')
      } catch (err) {
        logger.warn(`[bot] impossibile aggiornare i comandi: ${err.description ?? err.message}`)
      }
    }
  }

  // --- Loop di polling ---------------------------------------------------

  async #pollLoop() {
    const logger = this.#logger
    let offset = this.#store.getState().updateOffset ?? 0
    let failures = 0

    while (!this.#stopping) {
      try {
        const updates = await this.#tg.getUpdates({ offset })
        failures = 0
        for (const update of updates) {
          offset = update.update_id + 1
          this.#store.setState({ updateOffset: offset })
          try {
            await this.#handleUpdate(update)
          } catch (err) {
            logger.error(`[bot] errore gestendo update ${update.update_id}`, err)
          }
        }
      } catch (err) {
        if (this.#stopping) break
        failures += 1
        const waitMs = Math.min(1000 * 2 ** Math.min(failures, 5), 60000)
        logger.warn(`[bot] getUpdates fallita (${err.description ?? err.message}); riprovo tra ${waitMs}ms`)
        await sleep(waitMs)
      }
    }
  }

  async #releaseLoop() {
    const cfg = this.#cfg
    const logger = this.#logger
    await sleep(5000)
    while (!this.#stopping) {
      try {
        const result = await this.checkForNewRelease()
        if (result.announced) logger.info(`[bot] annunciata la versione ${result.release.tag}`)
      } catch (err) {
        logger.warn(`[bot] controllo release fallito: ${err.message}`)
      }
      await sleep(cfg.pollMinutes * 60_000)
    }
  }

  // --- Update dispatch ---------------------------------------------------

  async #handleUpdate(update) {
    if (update.message) return this.#handleMessage(update.message)
    if (update.callback_query) return this.#handleCallback(update.callback_query)
    if (update.my_chat_member) {
      const chat = update.my_chat_member.chat
      this.#logger.info(`[bot] aggiunto/rimosso dal chat ${chat.id} (${chat.type}${chat.title ? ` — ${chat.title}` : ''})`)
    }
    return null
  }

  async #handleMessage(msg) {
    const chatId = msg.chat.id
    const user = msg.from
    const chatType = msg.chat.type

    if (!user) return null

    if (!msg.text) {
      if (chatType === 'private') {
        await this.#tg.sendMessage(chatId, 'ℹ️ Posso leggere solo messaggi di testo: usa /help per l\'elenco dei comandi.')
      }
      return null
    }

    const parsed = parseCommand(msg.text, this.#me.username)
    if (!parsed) {
      if (chatType === 'private') {
        this.#store.addSubscriber(user, { source: 'message' })
        await this.#tg.sendMessage(chatId, buildHelpText({ isAdminUser: isAdmin(this.#cfg, user.id), botName: this.#cfg.botName }))
      } else {
        this.#logger.debug(`[bot] messaggio ignorato dal chat ${chatId}: ${msg.text.slice(0, 60)}`)
      }
      return null
    }

    if (chatType !== 'private' && parsed.command !== 'id') {
      if (parsed.command === 'start') {
        await this.#tg.sendMessage(chatId, '👋 Ciao! Scrivimi in privato con /start per ricevere le notifiche delle nuove versioni.')
      }
      return null
    }

    // anti-flood molto semplice
    const now = Date.now()
    const last = this.#lastCommandAt.get(user.id) ?? 0
    if (now - last < 1200) {
      this.#logger.debug(`[bot] comando troppo frequente da ${user.id}`)
      return null
    }
    this.#lastCommandAt.set(user.id, now)

    const args = parsed.args
    switch (parsed.command) {
      case 'start':
        return this.#cmdStart(chatId, user)
      case 'stop':
      case 'disattiva':
        return this.#cmdStop(chatId, user)
      case 'latest':
      case 'versione':
        return this.#cmdLatest(chatId)
      case 'app':
      case 'download':
        return this.#cmdApp(chatId)
      case 'status':
        return this.#cmdStatus(chatId, user)
      case 'id':
      case 'chatid':
        return this.#cmdId(chatId, user, msg.chat)
      case 'help':
      case 'aiuto':
        return this.#cmdHelp(chatId, user)
      case 'release':
        return this.#assertAdmin(chatId, user) && this.#cmdRelease(chatId, user, args)
      case 'broadcast':
        return this.#assertAdmin(chatId, user) && this.#cmdBroadcast(chatId, user, args)
      case 'check':
        return this.#assertAdmin(chatId, user) && this.#cmdCheck(chatId)
      case 'stats':
        return this.#assertAdmin(chatId, user) && this.#cmdStats(chatId)
      case 'test':
        return this.#assertAdmin(chatId, user) && this.#cmdTest(chatId)
      default:
        return this.#tg.sendMessage(chatId, `🤔 Comando <code>/${escapeHtml(parsed.command)}</code> non riconosciuto. Usa /help.`)
    }
  }

  async #handleCallback(query) {
    const data = String(query.data ?? '')
    const userId = query.from?.id
    const chatId = query.message?.chat?.id
    const messageId = query.message?.message_id
    const isPrivate = query.message?.chat?.type === 'private'

    if (data === 'unsub') {
      const existed = this.#store.setSubscriberEnabled(userId, false)
      if (!existed) this.#store.addSubscriber(query.from, { source: 'callback' })
      this.#store.setSubscriberEnabled(userId, false)
      this.#store.flush()
      await this.#tg.answerCallbackQuery(query.id, { text: '🔕 Notifiche disattivate', showAlert: false })
      if (isPrivate && messageId) {
        await this.#tg
          .editMessageReplyMarkup(chatId, messageId, { inline_keyboard: [[{ text: '🔔 Riattiva notifiche', callback_data: 'sub' }]] })
          .catch(() => null)
      }
      return null
    }

    if (data === 'sub') {
      const existed = this.#store.getSubscriber(userId)
      if (!existed) this.#store.addSubscriber(query.from, { source: 'callback' })
      this.#store.setSubscriberEnabled(userId, true)
      this.#store.flush()
      await this.#tg.answerCallbackQuery(query.id, { text: '🔔 Notifiche riattivate' })
      if (isPrivate && messageId) {
        await this.#tg.editMessageReplyMarkup(chatId, messageId, { inline_keyboard: [] }).catch(() => null)
      }
      await this.#tg.sendMessage(chatId, buildSubscribedAgainText()).catch(() => null)
      return null
    }

    if (data === 'cancel') {
      const allowed = isAdmin(this.#cfg, userId)
      if (!allowed) return this.#tg.answerCallbackQuery(query.id, { text: 'Solo gli admin possono annullare', showAlert: true })
      await this.#tg.answerCallbackQuery(query.id, { text: '❌ Invio annullato' })
      if (messageId) {
        await this.#tg.editMessageText(chatId, messageId, '❌ <b>Invio annullato.</b>', { replyMarkup: { inline_keyboard: [] } }).catch(() => null)
      }
      return null
    }

    const sendMatch = data.match(/^send:(.+)$/)
    if (sendMatch) {
      if (!isAdmin(this.#cfg, userId)) {
        return this.#tg.answerCallbackQuery(query.id, { text: 'Solo gli admin possono inviare', showAlert: true })
      }
      const tag = sendMatch[1].slice(0, 64)
      await this.#tg.answerCallbackQuery(query.id, { text: '🚀 Invio in corso…' })
      const release = await this.#gh.resolve(tag, { includePrerelease: true, apkAssetName: this.#cfg.apkAssetName })
      if (!release) {
        if (messageId) await this.#tg.editMessageText(chatId, messageId, `⚠️ Release <code>${escapeHtml(tag)}</code> non trovata su GitHub.`).catch(() => null)
        return null
      }
      await this.#runBroadcast({ chatId, messageId, release, updateBaseline: true })
      return null
    }

    return this.#tg.answerCallbackQuery(query.id, { text: 'Azione sconosciuta' }).catch(() => null)
  }

  // --- Comandi utente ----------------------------------------------------

  async #cmdStart(chatId, user) {
    const isNew = this.#store.addSubscriber(user, { source: 'start' })
    this.#store.flush()
    this.#logger.info(`[bot] /start da ${user.id} (@${user.username ?? '—'}) — ${isNew ? 'nuovo iscritto' : 'già iscritto'}`)
    await this.#tg.sendMessage(chatId, buildWelcomeText(user, { botName: this.#cfg.botName, isNew }))

    const release = await this.#latestRelease().catch(() => null)
    if (release) {
      await this.#tg.sendMessage(chatId, buildReleaseText(release, { variant: 'info', botName: this.#cfg.botName }), {
        replyMarkup: buildReleaseKeyboard(release, { allowUnsubscribe: true, botName: this.#cfg.botName }),
      })
    }
  }

  async #cmdStop(chatId, user) {
    const existed = this.#store.setSubscriberEnabled(user.id, false)
    if (!existed) this.#store.addSubscriber(user, { source: 'stop' })
    this.#store.setSubscriberEnabled(user.id, false)
    this.#store.flush()
    this.#logger.info(`[bot] /stop da ${user.id}`)
    await this.#tg.sendMessage(chatId, buildUnsubscribedText(), {
      replyMarkup: { inline_keyboard: [[{ text: '🔔 Riattiva notifiche', callback_data: 'sub' }]] },
    })
  }

  async #cmdLatest(chatId) {
    const release = await this.#latestRelease()
    if (!release) {
      await this.#tg.sendMessage(chatId, '⚠️ Non trovo release pubblicate su GitHub per il momento.')
      return
    }
    await this.#tg.sendMessage(chatId, buildReleaseText(release, { variant: 'info', botName: this.#cfg.botName }), {
      replyMarkup: buildReleaseKeyboard(release, { allowUnsubscribe: true, botName: this.#cfg.botName }),
    })
  }

  async #cmdApp(chatId) {
    const release = await this.#latestRelease().catch(() => null)
    await this.#tg.sendMessage(chatId, buildAppText(release, { botName: this.#cfg.botName }), {
      replyMarkup: release ? buildReleaseKeyboard(release, { allowUnsubscribe: false, botName: this.#cfg.botName }) : undefined,
    })
  }

  async #cmdStatus(chatId, user) {
    const subscriber = this.#store.getSubscriber(user.id)
    await this.#tg.sendMessage(chatId, buildStatusText({ subscriber, state: this.#store.getState(), botName: this.#cfg.botName }), {
      replyMarkup: subscriber?.enabled
        ? { inline_keyboard: [[{ text: '🔕 Disattiva notifiche', callback_data: 'unsub' }]] }
        : { inline_keyboard: [[{ text: '🔔 Riattiva notifiche', callback_data: 'sub' }]] },
    })
  }

  async #cmdId(chatId, user, chat) {
    await this.#tg.sendMessage(
      chatId,
      [
        '🆔 <b>Identificativi</b>',
        '',
        `• Il tuo ID utente: <code>${user.id}</code>`,
        `• ID di questa chat: <code>${chat.id}</code>`,
        chat.type !== 'private' ? '\nUn admin può usare l\'ID della chat come <code>channelId</code> per pubblicare qui le release.' : '',
      ]
        .filter(Boolean)
        .join('\n')
    )
  }

  async #cmdHelp(chatId, user) {
    await this.#tg.sendMessage(chatId, buildHelpText({ isAdminUser: isAdmin(this.#cfg, user.id), botName: this.#cfg.botName }))
  }

  // --- Comandi admin -----------------------------------------------------

  #assertAdmin(chatId, user) {
    if (isAdmin(this.#cfg, user.id)) return true
    this.#tg
      .sendMessage(chatId, `⛔️ Questo comando è riservato agli admin.\nIl tuo ID è <code>${user.id}</code>: aggiungilo in <code>adminIds</code> nel file config.json.`)
      .catch(() => null)
    return false
  }

  async #cmdRelease(chatId, user, args) {
    const tag = args || 'latest'
    const release = await this.#gh.resolve(tag, { includePrerelease: true, apkAssetName: this.#cfg.apkAssetName })
    if (!release) {
      await this.#tg.sendMessage(chatId, `⚠️ Nessuna release trovata per <code>${escapeHtml(tag)}</code>.`)
      return
    }
    const stats = this.#store.stats()
    const previewCard = buildReleaseText(release, {
      variant: 'announce',
      botName: this.#cfg.botName,
      limit: TELEGRAM_TEXT_LIMIT - 260,
    })
    const previewText = truncateHtml(
      [
        '🔎 <b>Anteprima broadcast</b>',
        `Destinatari attivi: <b>${stats.active}</b> (${stats.total} iscritti totali)`,
        DIVIDER,
        '',
        previewCard,
      ].join('\n'),
      TELEGRAM_TEXT_LIMIT
    )
    await this.#tg.sendMessage(chatId, previewText, {
      replyMarkup: {
        inline_keyboard: [
          [{ text: '✅ Invia a tutti', callback_data: `send:${release.tag}` }],
          [{ text: '❌ Annulla', callback_data: 'cancel' }],
        ],
      },
    })
    this.#logger.info(`[bot] anteprima release ${release.tag} richiesta da ${user.id}`)
  }

  async #cmdBroadcast(chatId, user, args) {
    if (!args) {
      await this.#tg.sendMessage(chatId, 'Uso: <code>/broadcast testo del messaggio</code>')
      return
    }
    const text = truncateHtml(['📣 <b>Comunicazione da WaveStream</b>', '', escapeHtml(args).replace(/\\n/g, '\n')].join('\n'), TELEGRAM_TEXT_LIMIT)
    const stats = this.#store.stats()
    const message = await this.#tg.sendMessage(chatId, `🚀 Invio a <b>${stats.active}</b> iscritti…`)
    this.#logger.info(`[bot] /broadcast da ${user.id} (${args.length} caratteri)`)
    await this.#runBroadcast({ chatId, messageId: message.message_id, text, updateBaseline: false })
  }

  async #cmdCheck(chatId) {
    const result = await this.checkForNewRelease({ force: true })
    if (result.announced) {
      await this.#tg.sendMessage(chatId, `✅ Nuova versione trovata e annunciata: <b>${escapeHtml(result.release.tag)}</b>`)
    } else if (result.release) {
      await this.#tg.sendMessage(chatId, `ℹ️ Nessuna novità: l'ultima versione è <b>${escapeHtml(result.release.tag)}</b> (già annunciata).`)
    } else {
      await this.#tg.sendMessage(chatId, 'ℹ️ Nessuna release pubblica trovata su GitHub.')
    }
  }

  async #cmdStats(chatId) {
    const stats = this.#store.stats()
    const state = this.#store.getState()
    await this.#tg.sendMessage(
      chatId,
      [
        '📊 <b>Statistiche bot</b>',
        '',
        `• Iscritti attivi: <b>${stats.active}</b>`,
        `• Notifiche in pausa: <b>${stats.paused}</b>`,
        `• Bloccati / non raggiungibili: <b>${stats.blocked}</b>`,
        `• Totale iscritti storici: <b>${stats.total}</b>`,
        `• Ultimo iscritto: ${stats.newest ? formatRelativeDateIt(stats.newest) ?? stats.newest : '—'}`,
        '',
        `• Ultima versione annunciata: <code>${escapeHtml(state.lastAnnouncedTag ?? '—')}</code>`,
        `• Ultimo controllo GitHub: ${state.lastCheckAt ? new Date(state.lastCheckAt).toISOString().replace('T', ' ').slice(0, 16) + ' UTC' : '—'}`,
        `• Repo: <code>${escapeHtml(this.#cfg.repo)}</code>`,
        `• Canale: <code>${escapeHtml(this.#cfg.channelId || '—')}</code>`,
        `• Polling: ${this.#cfg.autoPoll ? `ogni ${this.#cfg.pollMinutes} min` : 'disattivato'}`,
      ].join('\n')
    )
  }

  async #cmdTest(chatId) {
    const release = await this.#latestRelease()
    if (!release) {
      await this.#tg.sendMessage(chatId, '⚠️ Nessuna release disponibile su GitHub.')
      return
    }
    await this.#tg.sendMessage(chatId, buildReleaseText(release, { variant: 'announce', botName: this.#cfg.botName }), {
      replyMarkup: buildReleaseKeyboard(release, { allowUnsubscribe: true, botName: this.#cfg.botName }),
    })
  }

  // --- Release -----------------------------------------------------------

  async #latestRelease() {
    const cached = this.#releaseCache
    if (cached.release && Date.now() - cached.at < 60_000) return cached.release
    const release = await this.#gh.getLatestRelease({
      includePrerelease: this.#cfg.includePrerelease,
      apkAssetName: this.#cfg.apkAssetName,
    })
    this.#releaseCache = { release, at: Date.now() }
    return release
  }

  /**
   * Confronta l'ultima release GitHub con l'ultima annunciata.
   * Al primo avvio imposta solo la baseline (per non spammare una release vecchia).
   */
  async checkForNewRelease({ force = false } = {}) {
    const cfg = this.#cfg
    const logger = this.#logger
    const release = await this.#gh.getLatestRelease({ includePrerelease: cfg.includePrerelease, apkAssetName: cfg.apkAssetName })
    this.#store.setState({ lastCheckAt: new Date().toISOString() })
    if (!release) return { release: null, announced: false, reason: 'nessuna release' }

    this.#store.setState({ lastSeenTag: release.tag })
    const state = this.#store.getState()

    if (!state.lastAnnouncedTag) {
      if (!cfg.announceOnFirstRun) {
        this.#store.setState({ lastAnnouncedTag: release.tag, lastAnnouncedAt: new Date().toISOString() })
        this.#store.flush()
        logger.info(`[bot] primo avvio: baseline impostata su ${release.tag} (nessun invio)`)
        return { release, announced: false, reason: 'baseline' }
      }
    } else if (state.lastAnnouncedTag === release.tag && !force) {
      return { release, announced: false, reason: 'già annunciata' }
    }

    const summary = await this.#runBroadcast({ release, updateBaseline: true, context: 'auto' })
    return { release, announced: true, summary }
  }

  /** Invia la card della release a tutti (con guardia contro invii concorrenti). */
  async #runBroadcast({ chatId = null, messageId = null, release = null, text = null, updateBaseline = false, context = 'manual' }) {
    const cfg = this.#cfg
    const logger = this.#logger
    if (this.#broadcasting) {
      logger.warn('[bot] broadcast già in corso: richiesta ignorata')
      if (chatId) await this.#tg.sendMessage(chatId, '⏳ Un invio è già in corso, riprova tra qualche secondo.').catch(() => null)
      return null
    }
    this.#broadcasting = true
    try {
      const payload = text ?? buildReleaseText(release, { variant: 'announce', botName: cfg.botName })
      const keyboardFor = release
        ? ({ allowUnsubscribe }) => buildReleaseKeyboard(release, { allowUnsubscribe, botName: cfg.botName })
        : undefined

      const summary = await broadcastToSubscribers(this.#tg, this.#store, cfg, {
        release,
        text: payload,
        keyboardFor,
        logger,
        onProgress: (done, total) => {
          if (chatId && messageId && (done === total || done % 25 === 0)) {
            this.#tg
              .editMessageText(chatId, messageId, `🚀 Invio in corso… <b>${done}/${total}</b>`, { replyMarkup: { inline_keyboard: [] } })
              .catch(() => null)
          }
        },
      })

      if (release) await sendReleaseToChannel(this.#tg, cfg, release, { logger })

      if (release && updateBaseline) {
        this.#store.setState({ lastAnnouncedTag: release.tag, lastAnnouncedAt: new Date().toISOString() })
      }
      this.#store.flush()

      const report = [
        '✅ <b>Invio completato</b>',
        release ? `🏷 Versione: <b>${escapeHtml(release.title || release.tag)}</b>` : '📣 Messaggio libero',
        '',
        `• Destinatari: <b>${summary.total}</b>`,
        `• Consegnati: <b>${summary.sent}</b>`,
        summary.blocked ? `• Bloccati / irraggiungibili: <b>${summary.blocked}</b>` : null,
        summary.failed ? `• Errori: <b>${summary.failed}</b>` : null,
        `• Modalità: ${context === 'auto' ? 'automatica' : 'manuale'}`,
      ]
        .filter(Boolean)
        .join('\n')

      if (chatId && messageId) {
        await this.#tg.editMessageText(chatId, messageId, report, { replyMarkup: { inline_keyboard: [] } }).catch(() => null)
      } else if (chatId) {
        await this.#tg.sendMessage(chatId, report).catch(() => null)
      }
      return summary
    } finally {
      this.#broadcasting = false
    }
  }
}

async function main() {
  let cfg
  try {
    cfg = loadConfig()
  } catch (err) {
    if (err instanceof ConfigError) {
      console.error(`\n⚠️  ${err.message}\n`)
      process.exit(2)
    }
    throw err
  }

  const logger = createLogger({ logFile: cfg.logFile, level: cfg.logLevel })
  const tg = new Telegram(cfg.botToken, { logger })
  const gh = new GitHub({ repo: cfg.repo, token: cfg.githubToken, logger })
  const store = new Store({ dataDir: cfg.dataDir, logger })

  let me
  try {
    me = await tg.getMe()
  } catch (err) {
    logger.error(`[bot] token non valido o Telegram irraggiungibile: ${err.description ?? err.message}`)
    process.exit(1)
  }

  if (!cfg.adminIds.length) {
    logger.warn('[bot] nessun admin configurato: i comandi /release, /broadcast, /check, /stats e /test sono disabilitati')
  }

  const bot = new WaveStreamBot({ cfg, logger, tg, gh, store, me })

  let shuttingDown = false
  const shutdown = (signal) => {
    if (shuttingDown) return
    shuttingDown = true
    logger.info(`[bot] ${signal} ricevuto: chiusura…`)
    bot.stop()
    store.flush()
    logger.close()
    // `exitCode` + chiusura naturale: process.exit() dopo fetch crasha su Node ≥ 22/Windows
    setTimeout(() => {
      process.exitCode = 0
    }, 300)
  }
  process.on('SIGINT', () => shutdown('SIGINT'))
  process.on('SIGTERM', () => shutdown('SIGTERM'))
  process.on('unhandledRejection', (reason) => logger.error('[bot] promise rifiutata', reason))

  await bot.start()
}

const invokedDirectly = process.argv[1] && process.argv[1].replace(/\\/g, '/').endsWith('/bot.mjs')
if (invokedDirectly) {
  main().catch((err) => {
    console.error('❌ Errore fatale:', err?.description ?? err?.message ?? err)
    if (err?.stack) console.error(err.stack)
    process.exit(1)
  })
}

export { WaveStreamBot, isUnreachableUserError }
