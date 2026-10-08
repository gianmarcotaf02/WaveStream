import fs from 'node:fs'
import path from 'node:path'

const LEVELS = { debug: 10, info: 20, warn: 30, error: 40, silent: 99 }
const MAX_LOG_BYTES = 5 * 1024 * 1024

/**
 * Logger minimale con timestamp, livelli e append su file (con rotazione a 5 MB).
 * Non usa dipendenze esterne.
 */
export function createLogger({ logFile = null, level = 'info' } = {}) {
  const min = LEVELS[level] ?? LEVELS.info
  let stream = null
  let currentSize = 0

  if (logFile) {
    try {
      fs.mkdirSync(path.dirname(logFile), { recursive: true })
      currentSize = fs.existsSync(logFile) ? fs.statSync(logFile).size : 0
      stream = fs.createWriteStream(logFile, { flags: 'a' })
    } catch {
      stream = null
    }
  }

  function rotateIfNeeded() {
    if (!stream || currentSize <= MAX_LOG_BYTES) return
    try {
      stream.end()
      fs.renameSync(logFile, `${logFile}.1`)
      stream = fs.createWriteStream(logFile, { flags: 'a' })
      currentSize = 0
    } catch {
      /* ignora */
    }
  }

  function write(lvl, args) {
    if ((LEVELS[lvl] ?? 20) < min) return
    const stamp = new Date().toISOString().replace('T', ' ').slice(0, 19)
    const prefix = `${stamp} ${lvl.toUpperCase().padEnd(5)}`
    const line = args
      .map((a) => (typeof a === 'string' ? a : a instanceof Error ? (a.stack ?? a.message) : safeJson(a)))
      .join(' ')
    const out = `${prefix} ${line}`
    if (lvl === 'error' || lvl === 'warn') console.error(out)
    else console.log(out)
    if (stream) {
      stream.write(`${out}\n`)
      currentSize += Buffer.byteLength(out) + 1
      rotateIfNeeded()
    }
  }

  function safeJson(value) {
    try {
      return JSON.stringify(value)
    } catch {
      return String(value)
    }
  }

  return {
    debug: (...a) => write('debug', a),
    info: (...a) => write('info', a),
    warn: (...a) => write('warn', a),
    error: (...a) => write('error', a),
    close: () => stream?.end(),
  }
}
