/**
 * Conversione Markdown → HTML di Telegram.
 *
 * Telegram accetta solo un sottoinsieme di tag (<b>, <i>, <u>, <s>, <a>, <code>, <pre>,
 * <blockquote>): qui il testo delle release di GitHub viene normalizzato, arricchito con
 * emoji e reso sicuro (escape dei caratteri riservati, bilanciamento dei tag).
 */

export const DIVIDER = '───────────────'

const CODE_TOKEN = '\u0000'
const KNOWN_TAGS = new Set(['b', 'i', 'u', 's', 'code', 'pre', 'a'])

const BULLET_EMOJI = [
  [/\b(fix|fixed|fixati|bug|risolt\w*|risolv\w*|corrett\w*|correzion\w*|sistem\w*|patch)\b/i, '🐛'],
  [/\b(sicurezza|privacy|protezion\w*|secur\w*|vpn|cifrat\w*)\b/i, '🔒'],
  [/\b(performance|prestazion\w*|veloc\w*|ottimizz\w*|fluido|lag|memoria|batteria|crash|freeze)\b/i, '⚡'],
  [/\b(grafica|interfaccia|design|layout|ui|ux|estetic\w*|animazion\w*|icon\w*|tema|colori|carousel|overlay)\b/i, '🎨'],
  [/\b(download|offline|scaric\w*|esporta\w*|importa\w*)\b/i, '⬇️'],
  [/\b(sottotitol\w*|subtitle\w*|audio|lingua|tracce|doppiagg\w*)\b/i, '🎧'],
  [/\b(epg|palinsesto|guida (tv|programmi)|canali|live|diretta)\b/i, '📺'],
  [/\b(calcio|serie a|partit\w*|sport|classific\w*|risultat\w*)\b/i, '⚽'],
  [/\b(ricerc\w*|search|filtri|filtro)\b/i, '🔍'],
  [/\b(preferit\w*|profil\w*|watchlist|continua a guardare)\b/i, '⭐'],
  [/\b(aggiornament\w*|update|versione|release)\b/i, '📦'],
  [/\b(miglior\w*|nuov\w*|aggiunt\w*|introduc\w*|support\w*|ora (puoi|si|sono|è|compare))\b/i, '✨'],
]

const HEADING_EMOJI = [
  [/\b(novit\w*|new|feature|aggiunt\w*|cosa cambia|in breve)\b/i, '✨'],
  [/\b(fix|correzion\w*|bug|risol\w*)\b/i, '🐛'],
  [/\b(miglior\w*|improve\w*|ottimizz\w*|performance)\b/i, '⚡'],
  [/\b(nota|note|breaking|attenzione|importante|avviso)\b/i, '⚠️'],
  [/\b(altro|other|misc)\b/i, '📌'],
  [/\b(come aggiornare|installazione|download)\b/i, '📲'],
]

export function escapeHtml(value) {
  return String(value ?? '')
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;')
}

/** Rimuove i tag HTML (per il fallback a testo semplice di Telegram). */
export function stripTags(text) {
  return String(text ?? '')
    .replace(/<br\s*\/?>/gi, '\n')
    .replace(/<\/?[a-z]+(\s[^>]*)?>/gi, '')
    .replace(/&lt;/g, '<')
    .replace(/&gt;/g, '>')
    .replace(/&quot;/g, '"')
    .replace(/&#39;/g, "'")
    .replace(/&amp;/g, '&')
}

/** Emoji legata alla parola chiave del titolo di una sezione. */
export function headingEmoji(text) {
  for (const [re, emoji] of HEADING_EMOJI) {
    if (re.test(text)) return `${emoji} `
  }
  return ''
}

/** Emoji (o punto elenco) scelta in base alla parola chiave di una voce di changelog. */
export function bulletMarker(text, { indented = false } = {}) {
  const label = extractLeadingLabel(text)
  if (indented) return '– '
  for (const [re, emoji] of BULLET_EMOJI) {
    if (re.test(label)) return `${emoji} `
  }
  return '• '
}

function extractLeadingLabel(text) {
  const bold = text.match(/^\s*(?:\*\*|__)(.+?)(?:\*\*|__)/)
  if (bold) return bold[1]
  return String(text).slice(0, 120)
}

/**
 * Converte una porzione di Markdown inline in HTML Telegram.
 * Prima estrae il codice inline (che non deve subire altre trasformazioni).
 */
export function inlineToHtml(text) {
  const codes = []
  let work = String(text ?? '').replace(/`([^`]+)`/g, (_m, code) => {
    codes.push(code)
    return `${CODE_TOKEN}${codes.length - 1}${CODE_TOKEN}`
  })

  work = escapeHtml(work)

  // immagini: resta il testo alternativo
  work = work.replace(/!\[([^\]]*)\]\(([^)\s]+)\)/g, '$1')
  // link
  work = work.replace(/\[([^\]]+)\]\(([^)\s]+)\)/g, (_m, label, url) => {
    const safeUrl = normalizeUrl(url)
    return safeUrl ? `<a href="${safeUrl}">${label}</a>` : label
  })
  // link automatici <https://...> (già escapati in &lt; ... &gt;)
  work = work.replace(/&lt;(https?:\/\/[^\s&]+)&gt;/g, '<a href="$1">$1</a>')

  work = work
    .replace(/\*\*\*(.+?)\*\*\*/g, '<b><i>$1</i></b>')
    .replace(/\*\*(.+?)\*\*/g, '<b>$1</b>')
    .replace(/__([^_]+?)__/g, '<b>$1</b>')
    .replace(/~~(.+?)~~/g, '<s>$1</s>')
    .replace(/(^|[\s(])\*(?=\S)([^*\n]+?)(?<=\S)\*(?=[\s).,;:!?]|$)/g, '$1<i>$2</i>')
    .replace(/(^|[\s(])_(?=\S)([^_\n]+?)(?<=\S)_(?=[\s).,;:!?]|$)/g, '$1<i>$2</i>')

  return work.replace(new RegExp(`${CODE_TOKEN}(\\d+)${CODE_TOKEN}`, 'g'), (_m, index) => `<code>${escapeHtml(codes[Number(index)])}</code>`)
}

function normalizeUrl(url) {
  const value = String(url ?? '').trim()
  if (/^https?:\/\/\S+$/i.test(value) || /^tg:\/\/\S+$/i.test(value) || /^mailto:\S+$/i.test(value)) return value
  return null
}

/** Rimuove la prima riga se ripete solo il titolo ("**Novità della 1.1.11**"). */
export function stripLeadingReleaseTitle(body, tag = '') {
  const lines = String(body ?? '')
    .replace(/\r\n?/g, '\n')
    .split('\n')
  let i = 0
  while (i < lines.length && !lines[i].trim()) i += 1
  if (i >= lines.length) return lines.join('\n')

  const line = lines[i].trim()
  const stripped = line
    .replace(/^#{1,6}\s*/, '')
    .replace(/^(\*\*|__)/, '')
    .replace(/(\*\*|__)$/, '')
    .trim()

  const isTitleLike = /^#{1,6}\s/.test(line) || /^\*\*[^*].*\*\*$/.test(line) || /^__[^_].*__$/.test(line)
  const isGeneric = /novit|changelog|what'?s new|cambiamenti|release notes|aggiornamento|in breve/i.test(stripped)
  const mentionsTag = Boolean(tag) && stripped.includes(tag)

  if (isTitleLike && (isGeneric || mentionsTag)) lines.splice(i, 1)
  return lines.join('\n')
}

/** Markdown completo (titoli, liste, quote, code block) → HTML Telegram. */
export function markdownToTelegramHtml(markdown, { divider = DIVIDER } = {}) {
  const lines = String(markdown ?? '')
    .replace(/\r\n?/g, '\n')
    .split('\n')
  const out = []

  let inFence = false
  let codeLines = []

  const flushCode = () => {
    const code = codeLines.join('\n').replace(/\n+$/, '')
    if (code.trim()) out.push(`<pre>${escapeHtml(code)}</pre>`)
    codeLines = []
  }

  for (const raw of lines) {
    const line = raw.replace(/\s+$/, '')
    const fence = line.match(/^\s{0,3}(`{3,}|~{3,})(.*)$/)
    if (fence) {
      if (inFence) {
        inFence = false
        flushCode()
      } else {
        inFence = true
        codeLines = []
      }
      continue
    }
    if (inFence) {
      codeLines.push(raw)
      continue
    }
    if (!line.trim()) {
      out.push('')
      continue
    }
    if (/^\s*([-*_])\1{2,}\s*$/.test(line)) {
      out.push(divider)
      continue
    }
    const heading = line.match(/^\s{0,3}(#{1,6})\s+(.*)$/)
    if (heading) {
      out.push(`${headingEmoji(heading[2])}<b>${inlineToHtml(heading[2])}</b>`)
      continue
    }
    const quote = line.match(/^\s{0,3}>\s?(.*)$/)
    if (quote) {
      out.push(`▎ ${inlineToHtml(quote[1])}`)
      continue
    }
    const task = line.match(/^(\s*)[-*+]\s+\[([ xX])\]\s+(.*)$/)
    if (task) {
      const box = task[2].toLowerCase() === 'x' ? '☑' : '☐'
      out.push(`${task[1] ? '  ' : ''}${box} ${inlineToHtml(task[3])}`)
      continue
    }
    const bullet = line.match(/^(\s*)[-*+]\s+(.*)$/)
    if (bullet) {
      const indented = Boolean(bullet[1])
      out.push(`${indented ? '  ' : ''}${bulletMarker(bullet[2], { indented })}${inlineToHtml(bullet[2])}`)
      continue
    }
    const ordered = line.match(/^(\s*)(\d{1,3})[.)]\s+(.*)$/)
    if (ordered) {
      out.push(`${ordered[1] ? '  ' : ''}<b>${ordered[2]}.</b> ${inlineToHtml(ordered[3])}`)
      continue
    }
    out.push(inlineToHtml(line))
  }
  if (inFence) flushCode()

  return collapseBlankLines(out).join('\n')
}

function collapseBlankLines(lines) {
  const out = []
  for (const line of lines) {
    if (!line.trim() && (!out.length || !out[out.length - 1].trim())) continue
    out.push(line)
  }
  while (out.length && !out[out.length - 1].trim()) out.pop()
  while (out.length && !out[0].trim()) out.shift()
  return out
}

/** Chiude i tag rimasti aperti (Telegram rifiuta l'HTML non bilanciato). */
export function balanceTags(html) {
  const stack = []
  const re = /<(\/?)([a-z]+)(?:\s[^>]*)?>/g
  let match
  while ((match = re.exec(html))) {
    const [, closing, tag] = match
    if (!KNOWN_TAGS.has(tag)) continue
    if (closing) {
      const index = stack.lastIndexOf(tag)
      if (index >= 0) stack.splice(index, 1)
    } else {
      stack.push(tag)
    }
  }
  return html + stack.reverse().map((tag) => `</${tag}>`).join('')
}

function cutAtBoundary(line, room) {
  if (line.length <= room) return line
  const gt = line.lastIndexOf('>', room)
  if (gt > room * 0.5) return line.slice(0, gt + 1)
  const space = line.lastIndexOf(' ', room)
  return space > 0 ? line.slice(0, space) : line.slice(0, room)
}

/** Tronca l'HTML rispettando le righe e il limite caratteri di Telegram. */
export function truncateHtml(html, limit = 4096, { suffix = '' } = {}) {
  const text = String(html ?? '')
  if (text.length <= limit) return text

  const budget = Math.max(0, limit - suffix.length - 1)
  const lines = text.split('\n')
  const kept = []
  let length = 0

  for (const line of lines) {
    const extra = (kept.length ? 1 : 0) + line.length
    if (length + extra > budget) {
      const room = budget - length - (kept.length ? 1 : 0)
      if (room > 24) kept.push(cutAtBoundary(line, room))
      break
    }
    kept.push(line)
    length += extra
  }

  const head = kept.join('\n').replace(/\s+$/, '')
  return balanceTags(`${head}…${suffix}`)
}
