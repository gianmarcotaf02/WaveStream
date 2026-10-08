import fs from 'node:fs'
import path from 'node:path'

const DEFAULT_API = 'https://api.telegram.org'
const RETRYABLE_CODES = new Set([429, 500, 502, 503, 504])

const sleep = (ms) => new Promise((resolve) => setTimeout(resolve, ms))

export class TelegramError extends Error {
  constructor(description, { method, code, retryAfter, cause } = {}) {
    super(`${method ? `${method}: ` : ''}${description}`, cause ? { cause } : undefined)
    this.name = 'TelegramError'
    this.method = method
    this.code = code
    this.description = description
    this.retryAfter = retryAfter
  }
}

/** True se l'errore indica che l'utente non può più ricevere messaggi. */
export function isUnreachableUserError(err) {
  const d = String(err?.description ?? err?.message ?? '').toLowerCase()
  return (
    d.includes('bot was blocked by the user') ||
    d.includes('user is deactivated') ||
    d.includes('chat not found') ||
    d.includes('bot was kicked') ||
    d.includes('user not found') ||
    d.includes('peer_id_invalid')
  )
}

export function isParseModeError(err) {
  const d = String(err?.description ?? err?.message ?? '').toLowerCase()
  return d.includes("can't parse entities") || d.includes('unsupported parse_mode') || d.includes('entity')
}

/**
 * Client della Bot API di Telegram (zero dipendenze, usa fetch/FormData nativi).
 * Gestisce retry automatico su 429/5xx e fallback a testo semplice se l'HTML non è valido.
 */
export class Telegram {
  #token
  #logger
  #base

  constructor(token, { logger = console, apiBase = DEFAULT_API } = {}) {
    if (!token) throw new Error('Token del bot mancante')
    this.#token = token
    this.#logger = logger
    this.#base = `${apiBase}/bot${token}`
  }

  get tokenHint() {
    return `${this.#token.split(':')[0]}:••••••`
  }

  async call(method, params = {}, { files, timeoutMs = 20000, attempts = 4 } = {}) {
    let lastError
    for (let attempt = 1; attempt <= attempts; attempt += 1) {
      try {
        return await this.#perform(method, params, { files, timeoutMs })
      } catch (err) {
        lastError = err
        const retryable = err instanceof TelegramError ? RETRYABLE_CODES.has(err.code) : true
        if (!retryable || attempt === attempts) break
        const waitMs = err.retryAfter ? err.retryAfter * 1000 + 500 : Math.min(1000 * 2 ** (attempt - 1), 8000)
        this.#logger.warn?.(`[telegram] ${method} → ritento tra ${Math.round(waitMs)}ms (${err.description ?? err.message})`)
        await sleep(waitMs)
      }
    }
    throw lastError
  }

  async #perform(method, params, { files, timeoutMs }) {
    const url = `${this.#base}/${method}`
    const controller = new AbortController()
    const timer = setTimeout(() => controller.abort(), timeoutMs)

    let body
    const headers = {}
    if (files && Object.keys(files).length) {
      const form = new FormData()
      for (const [key, value] of Object.entries(params)) {
        if (value === undefined || value === null) continue
        form.append(key, typeof value === 'object' ? JSON.stringify(value) : String(value))
      }
      for (const [field, file] of Object.entries(files)) {
        const buffer = Buffer.isBuffer(file.data) ? file.data : fs.readFileSync(file.data)
        form.append(field, new Blob([buffer], { type: file.type ?? 'application/octet-stream' }), file.filename ?? path.basename(String(file.data)))
      }
      body = form
    } else {
      headers['content-type'] = 'application/json'
      body = JSON.stringify(cleanParams(params))
    }

    let res
    try {
      res = await fetch(url, { method: 'POST', headers, body, signal: controller.signal })
    } catch (err) {
      throw new TelegramError(`richiesta di rete fallita: ${err.message}`, { method, cause: err })
    } finally {
      clearTimeout(timer)
    }

    let payload
    try {
      payload = await res.json()
    } catch (err) {
      throw new TelegramError(`risposta non JSON (HTTP ${res.status})`, { method, code: res.status, cause: err })
    }

    if (!payload?.ok) {
      throw new TelegramError(payload?.description ?? `HTTP ${res.status}`, {
        method,
        code: payload?.error_code ?? res.status,
        retryAfter: payload?.parameters?.retry_after,
      })
    }
    return payload.result
  }

  // --- Bot profile -------------------------------------------------------

  getMe() {
    return this.call('getMe')
  }

  setMyName(name, { languageCode } = {}) {
    return this.call('setMyName', { name, language_code: languageCode })
  }

  setMyShortDescription(shortDescription, { languageCode } = {}) {
    return this.call('setMyShortDescription', { short_description: shortDescription, language_code: languageCode })
  }

  setMyDescription(description, { languageCode } = {}) {
    return this.call('setMyDescription', { description, language_code: languageCode })
  }

  setMyCommands(commands, { scope, languageCode } = {}) {
    return this.call('setMyCommands', { commands, scope, language_code: languageCode })
  }

  setChatMenuButton(menuButton) {
    return this.call('setChatMenuButton', menuButton ? { menu_button: menuButton } : {})
  }

  /** Richiede Bot API ≥ 9.4: carica una foto profilo dal disco. */
  setMyProfilePhoto(filePath) {
    return this.call(
      'setMyProfilePhoto',
      { photo: { type: 'static', photo: 'attach://profile_photo' } },
      { files: { profile_photo: { data: filePath } } }
    )
  }

  // --- Update flow -------------------------------------------------------

  getUpdates({ offset, timeout = 50, allowedUpdates = ['message', 'callback_query', 'my_chat_member'] } = {}) {
    return this.call(
      'getUpdates',
      {
        offset,
        timeout,
        allowed_updates: allowedUpdates,
      },
      { timeoutMs: (timeout + 20) * 1000, attempts: 2 }
    )
  }

  // --- Messaggi ----------------------------------------------------------

  sendMessage(chatId, text, { parseMode = 'HTML', replyMarkup, disablePreview = true, disableNotification = false, messageThreadId, onSent } = {}) {
    const params = {
      chat_id: chatId,
      text,
      parse_mode: parseMode,
      link_preview_options: { is_disabled: disablePreview },
      reply_markup: replyMarkup,
      disable_notification: disableNotification || undefined,
      message_thread_id: messageThreadId,
    }
    return this.#withPlainFallback('sendMessage', params, text, onSent)
  }

  sendPhoto(chatId, photo, { caption, parseMode = 'HTML', replyMarkup, disableNotification = false } = {}) {
    const params = {
      chat_id: chatId,
      photo,
      caption,
      parse_mode: parseMode,
      reply_markup: replyMarkup,
      disable_notification: disableNotification || undefined,
    }
    return this.#withPlainFallback('sendPhoto', params, caption)
  }

  async #withPlainFallback(method, params, rawText, onSent) {
    try {
      const result = await this.call(method, params)
      onSent?.(result)
      return result
    } catch (err) {
      if (!(err instanceof TelegramError) || !isParseModeError(err)) throw err
      this.#logger.warn?.(`[telegram] ${method}: markup rifiutato, invio senza formattazione`)
      const plain = stripTags(rawText ?? '')
      const fallbackParams = { ...params }
      delete fallbackParams.parse_mode
      if (method === 'sendMessage') fallbackParams.text = plain
      else fallbackParams.caption = plain
      const result = await this.call(method, fallbackParams)
      onSent?.(result)
      return result
    }
  }

  editMessageText(chatId, messageId, text, { parseMode = 'HTML', replyMarkup, disablePreview = true, inlineMessageId } = {}) {
    return this.call('editMessageText', {
      chat_id: inlineMessageId ? undefined : chatId,
      message_id: inlineMessageId ? undefined : messageId,
      inline_message_id: inlineMessageId,
      text,
      parse_mode: parseMode,
      link_preview_options: { is_disabled: disablePreview },
      reply_markup: replyMarkup,
    })
  }

  editMessageReplyMarkup(chatId, messageId, replyMarkup) {
    return this.call('editMessageReplyMarkup', { chat_id: chatId, message_id: messageId, reply_markup: replyMarkup })
  }

  answerCallbackQuery(callbackQueryId, { text, showAlert = false, cacheTime } = {}) {
    return this.call('answerCallbackQuery', {
      callback_query_id: callbackQueryId,
      text,
      show_alert: showAlert || undefined,
      cache_time: cacheTime,
    })
  }

  sendChatAction(chatId, action = 'typing') {
    return this.call('sendChatAction', { chat_id: chatId, action }).catch(() => null)
  }

  getChat(chatId) {
    return this.call('getChat', { chat_id: chatId })
  }
}

function cleanParams(params) {
  const out = {}
  for (const [key, value] of Object.entries(params)) {
    if (value === undefined || value === null) continue
    out[key] = value
  }
  return out
}

/** Rimuove i tag HTML per il fallback in testo semplice. */
export function stripTags(text) {
  return String(text ?? '')
    .replace(/<br\s*\/?>/gi, '\n')
    .replace(/<\/?(b|i|u|s|code|pre|a|blockquote)(\s[^>]*)?>/gi, '')
    .replace(/&lt;/g, '<')
    .replace(/&gt;/g, '>')
    .replace(/&quot;/g, '"')
    .replace(/&#39;/g, "'")
    .replace(/&amp;/g, '&')
}
