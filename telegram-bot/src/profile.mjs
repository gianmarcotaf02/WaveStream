/**
 * Testi del profilo del bot (nome, descrizioni, comandi).
 * Sono gli stessi valori che BOTFATHER.md riporta per l'inserimento manuale:
 * qui sono la fonte di verità usata da `node src/setup-bot.mjs`.
 */

export const BOT_NAME = 'WaveStream'

export const SHORT_DESCRIPTION =
  'Notifiche ufficiali delle nuove versioni di WaveStream per Android TV: novità, fix e APK sempre aggiornato.'

export const DESCRIPTION = [
  '🎬 WaveStream — aggiornamenti ufficiali',
  '',
  'Questo bot ti avvisa ogni volta che esce una nuova versione di WaveStream, il player IPTV per Android TV: ricevi le novità già scritte e impaginate per Telegram, con il pulsante per scaricare subito l\'APK firmato.',
  '',
  'Cosa ricevi:',
  '✨ release notes ordinate, con emoji e punti elenco',
  '📥 link diretto all\'ultima versione (APK)',
  '🐛 fix, miglioramenti e funzioni nuove evidenziati',
  '',
  'Comandi:',
  '/start — iscriviti alle notifiche',
  '/latest — ultima versione disponibile',
  '/app — come aggiornare WaveStream',
  '/stop — disattiva le notifiche',
  '',
  'Zero spam: solo quando esce davvero una nuova versione.',
].join('\n')

export const COMMANDS = [
  { command: 'start', description: 'Iscriviti alle notifiche di nuove versioni' },
  { command: 'latest', description: 'Ultima versione disponibile' },
  { command: 'app', description: 'Come aggiornare WaveStream' },
  { command: 'status', description: 'Stato della tua iscrizione' },
  { command: 'stop', description: 'Disattiva le notifiche' },
  { command: 'help', description: 'Tutti i comandi' },
]

export const LIMITS = {
  name: 64,
  shortDescription: 120,
  description: 512,
}

export const USERNAME_SUGGESTIONS = [
  '@WaveStreamUpdatesBot',
  '@WaveStreamReleaseBot',
  '@WaveStreamTVBot',
  '@WaveStreamAppBot',
  '@WaveStreamNewsBot',
]

/** URL pubblico usato come foto profilo (banner ospitato su Firebase Hosting). */
export const DEFAULT_PROFILE_PHOTO_URL = 'https://wavestream-d3972.web.app/banner.png'

export function validateProfileTexts() {
  const problems = []
  for (const [key, limit] of Object.entries(LIMITS)) {
    const value = key === 'name' ? BOT_NAME : key === 'shortDescription' ? SHORT_DESCRIPTION : DESCRIPTION
    if (value.length > limit) problems.push(`${key}: ${value.length}/${limit} caratteri`)
  }
  return problems
}
