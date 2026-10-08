import fs from 'node:fs'
import path from 'node:path'

const SCHEMA_VERSION = 1

function emptySubscribers() {
  return { version: SCHEMA_VERSION, updatedAt: null, users: {} }
}

function emptyState() {
  return {
    version: SCHEMA_VERSION,
    updateOffset: 0,
    lastAnnouncedTag: null,
    lastAnnouncedAt: null,
    lastCheckAt: null,
    lastSeenTag: null,
    commandsHash: null,
    pendingSends: {},
  }
}

/**
 * Persistenza su file JSON (nessun database): iscritti + stato del bot.
 * Le scritture sono atomiche (tmp + rename) e ritardate di 400 ms per non
 * martellare il disco durante un broadcast.
 */
export class Store {
  #logger
  #subscribersFile
  #stateFile
  #subscribers
  #state
  #timer = null

  constructor({ dataDir, logger = console }) {
    this.#logger = logger
    this.#subscribersFile = path.join(dataDir, 'subscribers.json')
    this.#stateFile = path.join(dataDir, 'state.json')
    fs.mkdirSync(dataDir, { recursive: true })
    this.#subscribers = this.#read(this.#subscribersFile, emptySubscribers)
    this.#state = this.#read(this.#stateFile, emptyState)
    if (!this.#subscribers.users || typeof this.#subscribers.users !== 'object') {
      this.#subscribers = emptySubscribers()
    }
  }

  #read(file, fallback) {
    try {
      if (!fs.existsSync(file)) return fallback()
      const parsed = JSON.parse(fs.readFileSync(file, 'utf8'))
      return { ...fallback(), ...parsed }
    } catch (err) {
      this.#logger.error?.(`[store] impossibile leggere ${file}: ${err.message}`)
      return fallback()
    }
  }

  #write(file, data) {
    const tmp = `${file}.tmp`
    fs.writeFileSync(tmp, `${JSON.stringify(data, null, 2)}\n`, 'utf8')
    fs.renameSync(tmp, file)
  }

  #schedulePersist() {
    if (this.#timer) return
    this.#timer = setTimeout(() => {
      this.#timer = null
      this.flush()
    }, 400)
    this.#timer.unref?.()
  }

  flush() {
    if (this.#timer) {
      clearTimeout(this.#timer)
      this.#timer = null
    }
    try {
      this.#subscribers.updatedAt = new Date().toISOString()
      this.#write(this.#subscribersFile, this.#subscribers)
      this.#write(this.#stateFile, this.#state)
    } catch (err) {
      this.#logger.error?.(`[store] scrittura fallita: ${err.message}`)
    }
  }

  // --- Iscritti ----------------------------------------------------------

  get subscribersCount() {
    return Object.keys(this.#subscribers.users).length
  }

  getSubscriber(userId) {
    return this.#subscribers.users[String(userId)] ?? null
  }

  /** Aggiunge o aggiorna un iscritto. Ritorna true se è una nuova iscrizione. */
  addSubscriber(user, { source = 'start' } = {}) {
    if (!user?.id) return false
    const id = String(user.id)
    const now = new Date().toISOString()
    const existing = this.#subscribers.users[id]
    const base = existing ?? {
      id: user.id,
      startedAt: now,
      releasesReceived: 0,
      firstSource: source,
    }
    this.#subscribers.users[id] = {
      ...base,
      firstName: user.first_name ?? base.firstName ?? null,
      lastName: user.last_name ?? base.lastName ?? null,
      username: user.username ?? base.username ?? null,
      languageCode: user.language_code ?? base.languageCode ?? null,
      enabled: true,
      blocked: false,
      blockedReason: null,
      lastSeenAt: now,
    }
    this.#schedulePersist()
    return !existing
  }

  setSubscriberEnabled(userId, enabled, { reason = null } = {}) {
    const id = String(userId)
    const sub = this.#subscribers.users[id]
    if (!sub) return false
    sub.enabled = Boolean(enabled)
    if (enabled) {
      sub.blocked = false
      sub.blockedReason = null
    } else if (reason) {
      sub.blockedReason = reason
    }
    this.#schedulePersist()
    return true
  }

  markUnreachable(userId, reason) {
    const sub = this.#subscribers.users[String(userId)]
    if (!sub) return
    sub.enabled = false
    sub.blocked = true
    sub.blockedReason = reason ?? 'unreachable'
    this.#schedulePersist()
  }

  countReleaseFor(ids) {
    for (const id of ids) {
      const sub = this.#subscribers.users[String(id)]
      if (sub) sub.releasesReceived = (sub.releasesReceived ?? 0) + 1
    }
    this.#schedulePersist()
  }

  activeSubscribers() {
    return Object.values(this.#subscribers.users).filter((s) => s.enabled && !s.blocked)
  }

  stats() {
    const all = Object.values(this.#subscribers.users)
    const blocked = all.filter((s) => s.blocked).length
    return {
      total: all.length,
      active: all.filter((s) => s.enabled && !s.blocked).length,
      paused: all.filter((s) => !s.enabled && !s.blocked).length,
      blocked,
      newest: all
        .map((s) => s.startedAt)
        .filter(Boolean)
        .sort()
        .pop() ?? null,
    }
  }

  // --- Stato -------------------------------------------------------------

  getState() {
    return this.#state
  }

  setState(patch) {
    this.#state = { ...this.#state, ...patch }
    this.#schedulePersist()
    return this.#state
  }
}
