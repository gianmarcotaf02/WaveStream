#!/usr/bin/env node
/**
 * Invia (o solo mostra) la card di una release WaveStream agli iscritti del bot.
 *
 *   node src/notify-release.mjs                 # ultima release non ancora annunciata
 *   node src/notify-release.mjs 1.1.12          # release specifica
 *   node src/notify-release.mjs latest --dry-run
 *   node src/notify-release.mjs --force          # rinvia anche se già annunciata
 *   node src/notify-release.mjs --to 123456      # invia solo a un utente (test)
 *   node src/notify-release.mjs --channel-only   # pubblica solo sul canale configurato
 *   node src/notify-release.mjs --text "Messaggio libero a tutti"
 */
import { ConfigError, loadConfig } from './config.mjs'
import { createLogger } from './logger.mjs'
import { Telegram, stripTags } from './telegram.mjs'
import { GitHub } from './github.mjs'
import { Store } from './store.mjs'
import { broadcastToSubscribers, sendReleaseToChannel } from './broadcast.mjs'
import { buildReleaseKeyboard, buildReleaseText } from './message.mjs'
import { DIVIDER, escapeHtml } from './markdown.mjs'

const OPTIONS_WITH_VALUE = new Set(['--to', '--text', '--channel'])

export function parseArgs(argv) {
  const options = { tag: null, flags: new Set(), values: {} }
  for (let i = 0; i < argv.length; i += 1) {
    const arg = argv[i]
    if (arg.startsWith('--')) {
      if (OPTIONS_WITH_VALUE.has(arg)) {
        options.values[arg] = argv[i + 1] ?? ''
        i += 1
      } else {
        options.flags.add(arg)
      }
    } else if (!options.tag) {
      options.tag = arg
    }
  }
  return options
}

function printUsage() {
  console.log(
    [
      'Uso: node src/notify-release.mjs [tag|latest] [opzioni]',
      '',
      'Opzioni:',
      '  --dry-run         mostra il messaggio senza inviarlo (stampa anche la versione in testo semplice)',
      '  --force           invia anche se la release risulta già annunciata',
      '  --to <id[,id]>    invia solo a questi utenti (test, non aggiorna la baseline)',
      '  --channel-only    invia solo al canale configurato (channelId)',
      '  --text <testo>    invia un messaggio libero invece della card di release',
      '  --json            stampa il riepilogo in JSON',
      '',
      'Codici di uscita: 0 = inviato, 2 = saltato, 1 = errore',
    ].join('\n')
  )
}

async function main() {
  const argv = process.argv.slice(2)
  if (argv.includes('--help') || argv.includes('-h')) {
    printUsage()
    return 0
  }

  const options = parseArgs(argv)
  const dryRun = options.flags.has('--dry-run')

  let cfg
  try {
    cfg = loadConfig({ requireToken: !dryRun })
  } catch (err) {
    if (err instanceof ConfigError) {
      console.error(`\n⚠️  ${err.message}\n`)
      return 1
    }
    throw err
  }

  const logger = createLogger({ logFile: dryRun ? null : cfg.logFile, level: options.values['--json'] ? 'warn' : cfg.logLevel })
  const gh = new GitHub({ repo: cfg.repo, token: cfg.githubToken, logger })

  let release = null
  if (options.values['--text']) {
    // messaggio libero: nessuna release da caricare
  } else {
    release = await gh.resolve(options.tag ?? 'latest', {
      includePrerelease: true,
      apkAssetName: cfg.apkAssetName,
    })
    if (!release) {
      console.error(`⚠️  Nessuna release trovata per "${options.tag ?? 'latest'}" nel repo ${cfg.repo}`)
      return 1
    }
    if (release.isDraft) {
      console.error(`⚠️  La release ${release.tag} è una bozza: non invio nulla.`)
      return 2
    }
  }

  const text = options.values['--text']
    ? ['📣 <b>Comunicazione da WaveStream</b>', '', escapeHtml(options.values['--text'])].join('\n')
    : buildReleaseText(release, { variant: 'announce', botName: cfg.botName })

  if (release) {
    logger.info(`[notify] release ${release.tag} — ${release.title} (${release.publishedAt})`)
  }

  if (dryRun) {
    console.log(`\n${DIVIDER}\nHTML inviato a Telegram:\n${DIVIDER}\n${text}\n`)
    console.log(`${DIVIDER}\nAnteprima in testo semplice:\n${DIVIDER}\n${stripTags(text)}\n`)
    if (release) {
      console.log('Tastiera:', JSON.stringify(buildReleaseKeyboard(release, { allowUnsubscribe: true, botName: cfg.botName }), null, 2))
    }
    return 0
  }

  const tg = new Telegram(cfg.botToken, { logger })
  const store = new Store({ dataDir: cfg.dataDir, logger })
  const state = store.getState()

  const manualRecipients = (options.values['--to'] ?? '')
    .split(/[,\s]+/)
    .map((v) => v.trim())
    .filter(Boolean)

  const alreadyAnnounced = Boolean(release && state.lastAnnouncedTag === release.tag)
  if (alreadyAnnounced && !options.flags.has('--force') && !manualRecipients.length && !options.flags.has('--channel-only')) {
    logger.warn(`[notify] la versione ${release.tag} risulta già annunciata: uso --force per rinviarla`)
    return 2
  }

  const keyboardFor = release
    ? ({ allowUnsubscribe }) => buildReleaseKeyboard(release, { allowUnsubscribe, botName: cfg.botName })
    : undefined

  if (manualRecipients.length) {
    const stats = { total: manualRecipients.length, sent: 0, blocked: 0, failed: 0 }
    for (const id of manualRecipients) {
      try {
        await tg.sendMessage(id, text, { replyMarkup: keyboardFor?.({ allowUnsubscribe: true }) })
        stats.sent += 1
      } catch (err) {
        stats.failed += 1
        logger.warn(`[notify] invio a ${id} fallito: ${err.description ?? err.message}`)
      }
    }
    logger.info(`[notify] test completato: ${stats.sent}/${stats.total} inviati`)
    return stats.sent > 0 ? 0 : 1
  }

  if (options.flags.has('--channel-only')) {
    const ok = await sendReleaseToChannel(tg, cfg, release, { logger })
    return ok ? 0 : 1
  }

  const summary = await broadcastToSubscribers(tg, store, cfg, { release, text, keyboardFor, logger })
  if (release) await sendReleaseToChannel(tg, cfg, release, { logger })

  if (release) {
    store.setState({ lastAnnouncedTag: release.tag, lastAnnouncedAt: new Date().toISOString(), lastSeenTag: release.tag })
  }
  store.flush()

  if (options.values['--json']) {
    console.log(JSON.stringify({ tag: release?.tag ?? null, ...summary }, null, 2))
  }

  logger.info(`[notify] fatto: ${summary.sent} inviati, ${summary.blocked} bloccati, ${summary.failed} errori`)
  return summary.sent > 0 || summary.total === 0 ? 0 : 1
}

const invokedDirectly = process.argv[1] && process.argv[1].replace(/\\/g, '/').endsWith('/notify-release.mjs')
if (invokedDirectly) {
  // ⚠️ NON usare process.exit() qui. Node ≥ 22 su Windows va in crash con
  // `Assertion failed: !(handle->flags & UV_HANDLE_CLOSING), src\win\async.c` se il
  // processo termina con un handle di fetch ancora in chiusura: l'exit code diventava
  // 0xC0000409 (-1073740791) e la notifica risultava FALLITA anche se era stata
  // inviata, con `state.json` già aggiornato. Assegnare `exitCode` lascia che Node
  // chiuda gli handle in modo pulito e l'exit code resta quello vero (0/1/2).
  main()
    .then((code) => {
      process.exitCode = code ?? 0
    })
    .catch((err) => {
      console.error('❌ Errore:', err?.description ?? err?.message ?? err)
      process.exitCode = 1
    })
}

export { main as runNotifyRelease }
