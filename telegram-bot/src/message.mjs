import { DIVIDER, escapeHtml, markdownToTelegramHtml, stripLeadingReleaseTitle, truncateHtml } from './markdown.mjs'

export const TELEGRAM_TEXT_LIMIT = 4096

const DATE_FORMATTER = new Intl.DateTimeFormat('it-IT', {
  day: 'numeric',
  month: 'long',
  year: 'numeric',
  timeZone: 'Europe/Rome',
})

const DAY_FORMATTER = new Intl.DateTimeFormat('it-IT', {
  day: '2-digit',
  month: '2-digit',
  year: 'numeric',
  timeZone: 'Europe/Rome',
})

export function formatDateIt(isoDate) {
  if (!isoDate) return null
  const date = new Date(isoDate)
  if (Number.isNaN(date.getTime())) return null
  return DATE_FORMATTER.format(date)
}

/** "oggi", "ieri" oppure la data estesa in italiano. */
export function formatRelativeDateIt(isoDate) {
  if (!isoDate) return null
  const date = new Date(isoDate)
  if (Number.isNaN(date.getTime())) return null
  const today = DAY_FORMATTER.format(new Date())
  const value = DAY_FORMATTER.format(date)
  if (value === today) return 'oggi'
  const yesterday = DAY_FORMATTER.format(new Date(Date.now() - 86400000))
  if (value === yesterday) return 'ieri'
  return DATE_FORMATTER.format(date)
}

export function formatBytesIt(bytes) {
  if (!Number.isFinite(bytes) || bytes <= 0) return null
  const mb = bytes / 1048576
  if (mb >= 1) return `${mb.toFixed(1).replace('.', ',')} MB`
  return `${Math.round(bytes / 1024)} KB`
}

export function releaseMetaLine(release) {
  const parts = []
  const date = formatRelativeDateIt(release.publishedAt)
  if (date) parts.push(`📅 ${date}`)
  const size = formatBytesIt(release.apk?.size ?? 0)
  if (size) parts.push(`📦 ${size}`)
  if (release.isPrerelease) parts.push('🧪 beta')
  return parts.join('  ·  ')
}

function stripTrailingPunctuation(value) {
  return String(value ?? '').replace(/[.,;:!]+$/, '')
}

/**
 * Card della release, già pronta per Telegram (HTML + emoji).
 * variant: "announce" (una nuova versione è uscita) | "info" (su richiesta con /latest).
 */
export function buildReleaseText(release, { variant = 'announce', limit = TELEGRAM_TEXT_LIMIT, botName = 'WaveStream' } = {}) {
  const title = stripTrailingPunctuation(release.title || release.tag)
  const body = markdownToTelegramHtml(stripLeadingReleaseTitle(release.body, release.tag))

  const header = [variant === 'announce' ? `🎬 <b>Nuova versione di ${escapeHtml(botName)}!</b>` : '🔎 <b>Ultima versione disponibile</b>', '', `🏷 <b>${escapeHtml(title)}</b>`]
  const meta = releaseMetaLine(release)
  if (meta) header.push(meta)

  const hasBody = body.trim().length > 0
  const content = hasBody ? [DIVIDER, '', body].join('\n') : '📝 Nessuna nota di rilascio pubblicata per questa versione.'

  const footerLines = ['', DIVIDER]
  if (release.apk) {
    footerLines.push(`📲 <b>Aggiorna:</b> apri ${escapeHtml(botName)} → Impostazioni → Aggiornamenti, oppure tocca il pulsante qui sotto.`)
  } else {
    footerLines.push('📲 <b>Aggiorna:</b> apri l\'app → Impostazioni → Aggiornamenti.')
  }
  if (variant === 'announce') {
    footerLines.push('🔔 Notifiche attive · /stop per disattivarle')
  }

  const footer = footerLines.join('\n')
  const moreNote = release.url ? `\n\n<a href="${release.url}">Leggi le note complete su GitHub →</a>` : '\n\n(nota: testo accorciato)'
  const reserve = header.join('\n').length + content.length + footer.length

  let finalText
  if (reserve <= limit) {
    finalText = [header.join('\n'), content, footer].join('\n')
  } else {
    const budget = limit - header.join('\n').length - footer.length - moreNote.length - 4
    const shortContent = truncateHtml(content, Math.max(300, budget))
    finalText = [header.join('\n'), shortContent + moreNote, footer].join('\n')
  }

  return finalText.length <= limit ? finalText : truncateHtml(finalText, limit)
}

/** Tastiera inline: download APK, note su GitHub e disattivazione notifiche. */
export function buildReleaseKeyboard(release, { allowUnsubscribe = true, botName = 'WaveStream' } = {}) {
  const rows = []
  if (release?.apkUrl) {
    const assetName = release.apk?.name ?? 'APK'
    rows.push([{ text: `📥 Scarica ${assetName}`, url: release.apkUrl }])
  }
  const second = []
  if (release?.url) second.push({ text: '🐙 Note su GitHub', url: release.url })
  if (second.length) rows.push(second)
  if (allowUnsubscribe) {
    rows.push([{ text: '🔕 Disattiva notifiche', callback_data: 'unsub' }])
  }
  return rows.length ? { inline_keyboard: rows } : undefined
}

export function buildWelcomeText(user, { botName = 'WaveStream', isNew = true } = {}) {
  const name = escapeHtml(user?.first_name ?? 'ciao')
  const heading = isNew ? `👋 <b>Ciao ${name}, benvenuto in ${escapeHtml(botName)}!</b>` : `👋 <b>Ciao ${name}!</b>`
  return [
    heading,
    '',
    `Da adesso ricevi qui un messaggio <b>ogni volta che esce una nuova versione</b> dell'app: novità, fix e miglioramenti già scritti in italiano, con il pulsante per scaricare subito l'APK aggiornato.`,
    '',
    '📺 App: <b>WaveStream per Android TV</b>',
    '🔔 Stato: <b>notifiche attive</b>',
    '',
    'Comandi rapidi:',
    '• /latest – ultima versione disponibile',
    '• /app – come aggiornare l\'app',
    '• /status – il tuo stato',
    '• /stop – disattiva le notifiche',
    '• /help – tutti i comandi',
    '',
    'Zero spam: scrivo solo quando c\'è davvero qualcosa di nuovo 😉',
  ].join('\n')
}

export function buildUnsubscribedText({ fromButton = false } = {}) {
  return [
    '🔕 <b>Notifiche disattivate.</b>',
    '',
    fromButton
      ? 'Non ti manderò più avvisi di nuove versioni.'
      : 'Non ti manderò più avvisi di nuove versioni.',
    'Puoi riattivarle quando vuoi con /start.',
  ].join('\n')
}

export function buildSubscribedAgainText() {
  return ['🔔 <b>Notifiche riattivate!</b>', '', 'Ti avviserò alla prossima versione di WaveStream. Grazie!'].join('\n')
}

export function buildStatusText({ subscriber, state, botName = 'WaveStream' }) {
  const active = Boolean(subscriber?.enabled) && !subscriber?.blocked
  const lines = [
    `ℹ️ <b>Il tuo stato su ${escapeHtml(botName)}</b>`,
    '',
    `• Iscrizione: ${active ? '✅ attiva' : '🔕 disattivata'}`,
  ]
  const since = formatDateIt(subscriber?.startedAt)
  if (since) lines.push(`• Iscritto dal: ${since}`)
  lines.push(`• Notifiche ricevute: <b>${subscriber?.releasesReceived ?? 0}</b>`)
  if (state?.lastAnnouncedTag) lines.push(`• Ultima versione annunciata: <code>${escapeHtml(state.lastAnnouncedTag)}</code>`)
  if (subscriber?.id) lines.push(`• Il tuo ID Telegram: <code>${subscriber.id}</code>`)
  lines.push('', 'Usa /stop per disattivare le notifiche, /start per riattivarle.')
  return lines.join('\n')
}

export function buildAppText(release, { botName = 'WaveStream' } = {}) {
  const lines = [
    `📲 <b>Come installare o aggiornare ${escapeHtml(botName)}</b>`,
    '',
    '1. Apri l\'app sulla TV',
    '2. Vai in <b>Impostazioni → Aggiornamenti</b>',
    '3. Tocca <b>Scarica</b>: l\'app controlla da sola se c\'è una versione più recente',
    '',
    'In alternativa scarica l\'APK dal pulsante qui sotto e installalo sulla TV (serve un file manager).',
  ]
  if (release) {
    lines.push('', DIVIDER)
    lines.push(`🏷 Ultima versione: <b>${escapeHtml(stripTrailingPunctuation(release.title || release.tag))}</b>`)
    const meta = releaseMetaLine(release)
    if (meta) lines.push(meta)
  }
  return lines.join('\n')
}

export function buildHelpText({ isAdminUser = false, botName = 'WaveStream' } = {}) {
  const lines = [
    '🤖 <b>Comandi disponibili</b>',
    '',
    `<b>Per tutti</b>`,
    '/start – iscriviti alle notifiche di nuove versioni',
    '/latest – mostra l\'ultima versione disponibile',
    '/app – come aggiornare l\'app',
    '/status – stato della tua iscrizione',
    '/stop – disattiva le notifiche',
    '/id – mostra il tuo ID Telegram',
    '/help – questo messaggio',
  ]
  if (isAdminUser) {
    lines.push(
      '',
      '<b>Solo admin</b>',
      '/release [tag] – anteprima e invio di una release agli iscritti',
      '/broadcast &lt;testo&gt; – invia un messaggio libero a tutti',
      '/check – controlla subito se è uscita una nuova versione',
      '/stats – statistiche iscritti',
      '/test – invia a te la card dell\'ultima versione'
    )
  }
  lines.push('', `ℹ️ ${escapeHtml(botName)} è un player IPTV per Android TV. Questo bot serve solo a notificare gli aggiornamenti.`)
  return lines.join('\n')
}

export const USER_COMMANDS = [
  { command: 'start', description: '🔔 Iscriviti alle notifiche di nuove versioni' },
  { command: 'latest', description: '🔎 Ultima versione disponibile' },
  { command: 'app', description: '📲 Come aggiornare WaveStream' },
  { command: 'status', description: 'ℹ️ Stato della tua iscrizione' },
  { command: 'stop', description: '🔕 Disattiva le notifiche' },
  { command: 'help', description: '❓ Tutti i comandi' },
]

export const ADMIN_COMMANDS = [
  ...USER_COMMANDS,
  { command: 'release', description: '🚀 Invia una release agli iscritti' },
  { command: 'broadcast', description: '📣 Messaggio libero a tutti' },
  { command: 'check', description: '🔄 Controlla ora gli aggiornamenti' },
  { command: 'stats', description: '📊 Statistiche iscritti' },
  { command: 'test', description: '🧪 Anteprima card a te stesso' },
]
