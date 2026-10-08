import fs from 'node:fs'
import path from 'node:path'
import { fileURLToPath } from 'node:url'

export const ROOT = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..')
export const CONFIG_PATH = path.join(ROOT, 'config.json')
export const EXAMPLE_PATH = path.join(ROOT, 'config.example.json')

/** Valori di default: servono per non rompersi quando config.json è più vecchio. */
const DEFAULTS = {
  botToken: '',
  botName: 'WaveStream',
  repo: 'gianmarcotaf02/WaveStream',
  githubToken: '',
  adminIds: [],
  channelId: '',
  autoPoll: true,
  pollMinutes: 10,
  announceOnFirstRun: false,
  includePrerelease: false,
  apkAssetName: 'WaveStream.apk',
  dataDir: 'data',
  logFile: 'data/bot.log',
  logLevel: 'info',
}

export class ConfigError extends Error {
  constructor(message) {
    super(message)
    this.name = 'ConfigError'
  }
}

function readJson(file) {
  return JSON.parse(fs.readFileSync(file, 'utf8'))
}

function toInt(value, fallback) {
  const n = Number.parseInt(String(value ?? ''), 10)
  return Number.isFinite(n) ? n : fallback
}

function toBool(value, fallback) {
  if (value === undefined || value === null || value === '') return fallback
  if (typeof value === 'boolean') return value
  return ['1', 'true', 'yes', 'on', 'si', 'sì'].includes(String(value).toLowerCase())
}

function parseAdmins(value) {
  if (Array.isArray(value)) return value.map((v) => String(v).trim()).filter(Boolean)
  if (value === undefined || value === null || value === '') return []
  return String(value)
    .split(/[,\s]+/)
    .map((v) => v.trim())
    .filter(Boolean)
}

/**
 * Carica config.json (creandolo dal template se manca) e applica gli override
 * delle variabili d'ambiente. Le env vincono sempre sul file.
 */
export function loadConfig({ env = process.env, requireToken = true } = {}) {
  let createdFromTemplate = false
  if (!fs.existsSync(CONFIG_PATH)) {
    if (!fs.existsSync(EXAMPLE_PATH)) {
      throw new ConfigError(`config.json non trovato e template mancante (${EXAMPLE_PATH})`)
    }
    fs.copyFileSync(EXAMPLE_PATH, CONFIG_PATH)
    createdFromTemplate = true
  }

  let fileCfg
  try {
    fileCfg = readJson(CONFIG_PATH)
  } catch (err) {
    throw new ConfigError(`config.json non è un JSON valido: ${err.message}`)
  }

  const merged = { ...DEFAULTS, ...fileCfg }

  // Override da variabili d'ambiente
  if (env.TELEGRAM_BOT_TOKEN) merged.botToken = env.TELEGRAM_BOT_TOKEN
  if (env.GITHUB_TOKEN) merged.githubToken = env.GITHUB_TOKEN
  if (env.GITHUB_REPO) merged.repo = env.GITHUB_REPO
  if (env.TELEGRAM_CHANNEL_ID) merged.channelId = env.TELEGRAM_CHANNEL_ID
  if (env.TELEGRAM_ADMIN_IDS) merged.adminIds = parseAdmins(env.TELEGRAM_ADMIN_IDS)
  if (env.POLL_MINUTES) merged.pollMinutes = toInt(env.POLL_MINUTES, merged.pollMinutes)
  if (env.AUTO_POLL !== undefined) merged.autoPoll = toBool(env.AUTO_POLL, merged.autoPoll)
  if (env.LOG_LEVEL) merged.logLevel = env.LOG_LEVEL

  const cfg = {
    ...merged,
    botToken: String(merged.botToken ?? '').trim(),
    repo: String(merged.repo ?? DEFAULTS.repo).trim().replace(/^https?:\/\/github\.com\//, '').replace(/\.git$/, '').replace(/^\/+|\/+$/g, ''),
    adminIds: parseAdmins(merged.adminIds),
    channelId: merged.channelId === null || merged.channelId === undefined ? '' : String(merged.channelId).trim(),
    pollMinutes: Math.max(1, toInt(merged.pollMinutes, DEFAULTS.pollMinutes)),
    autoPoll: toBool(merged.autoPoll, DEFAULTS.autoPoll),
    announceOnFirstRun: toBool(merged.announceOnFirstRun, DEFAULTS.announceOnFirstRun),
    includePrerelease: toBool(merged.includePrerelease, DEFAULTS.includePrerelease),
    dataDir: path.isAbsolute(merged.dataDir) ? merged.dataDir : path.join(ROOT, merged.dataDir),
    logFile: merged.logFile ? (path.isAbsolute(merged.logFile) ? merged.logFile : path.join(ROOT, merged.logFile)) : null,
  }

  if (!/^\d+:.+/.test(cfg.botToken)) {
    if (requireToken) {
      throw new ConfigError(
        [
          createdFromTemplate ? 'Ho creato telegram-bot/config.json dal template.' : 'Token del bot mancante o non valido.',
          `Apri ${CONFIG_PATH} e inserisci in "botToken" il token di @BotFather (formato <id>:<segreto>), poi riavvia.`,
          'In alternativa puoi esportare la variabile d\'ambiente TELEGRAM_BOT_TOKEN.',
        ].join('\n')
      )
    }
  }

  if (!/^[\w.-]+\/[\w.-]+$/.test(cfg.repo)) {
    throw new ConfigError(`"repo" deve essere nel formato owner/name, trovato: "${cfg.repo}"`)
  }

  return cfg
}

export function isAdmin(cfg, userId) {
  if (!cfg.adminIds.length) return false
  return cfg.adminIds.includes(String(userId))
}

export function subscribersFile(cfg) {
  return path.join(cfg.dataDir, 'subscribers.json')
}

export function stateFile(cfg) {
  return path.join(cfg.dataDir, 'state.json')
}
