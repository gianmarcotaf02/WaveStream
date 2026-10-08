import { isUnreachableUserError } from './telegram.mjs'
import { buildReleaseKeyboard, buildReleaseText } from './message.mjs'

const sleep = (ms) => new Promise((resolve) => setTimeout(resolve, ms))

/**
 * Invia un messaggio a tutti gli iscritti attivi (più, opzionalmente, al canale).
 * - rispetta il rate limit di Telegram (~20 msg/s) con una pausa tra i messaggi
 * - marca come irraggiungibili gli utenti che hanno bloccato il bot
 * - ritorna un riepilogo numerico
 */
export async function broadcastToSubscribers(tg, store, cfg, { release = null, text, keyboardFor, logger = console, delayMs = 80, onProgress } = {}) {
  const targets = store.activeSubscribers()
  const summary = { total: targets.length, sent: 0, blocked: 0, failed: 0, errors: [], deliveredIds: [] }

  logger.info?.(`[broadcast] invio a ${targets.length} iscritti (${cfg.repo})`)

  for (let i = 0; i < targets.length; i += 1) {
    const sub = targets[i]
    const markup = keyboardFor ? keyboardFor({ release, subscriber: sub, allowUnsubscribe: true }) : undefined
    try {
      await tg.sendMessage(sub.id, text, { replyMarkup: markup })
      summary.sent += 1
      summary.deliveredIds.push(sub.id)
    } catch (err) {
      if (isUnreachableUserError(err)) {
        summary.blocked += 1
        store.markUnreachable(sub.id, err.description ?? 'unreachable')
        logger.info?.(`[broadcast] ${sub.id} non raggiungibile: ${err.description ?? err.message}`)
      } else {
        summary.failed += 1
        if (summary.errors.length < 5) summary.errors.push({ id: sub.id, error: err.description ?? err.message })
        logger.warn?.(`[broadcast] invio a ${sub.id} fallito: ${err.description ?? err.message}`)
      }
    }
    onProgress?.(i + 1, targets.length)
    if (i < targets.length - 1) await sleep(delayMs)
  }

  if (summary.deliveredIds.length) store.countReleaseFor(summary.deliveredIds)
  store.flush()
  logger.info?.(`[broadcast] completato: ${summary.sent} inviati, ${summary.blocked} bloccati, ${summary.failed} errori`)
  return summary
}

/** Invia la card della release anche al canale configurato (senza pulsante di disiscrizione). */
export async function sendReleaseToChannel(tg, cfg, release, { logger = console } = {}) {
  if (!cfg.channelId) return null
  try {
    await tg.sendMessage(cfg.channelId, buildReleaseText(release, { botName: cfg.botName }), {
      replyMarkup: buildReleaseKeyboard(release, { allowUnsubscribe: false, botName: cfg.botName }),
    })
    logger.info?.(`[broadcast] release ${release.tag} pubblicata anche sul canale ${cfg.channelId}`)
    return true
  } catch (err) {
    logger.warn?.(`[broadcast] canale ${cfg.channelId} non raggiungibile: ${err.description ?? err.message}`)
    return false
  }
}
