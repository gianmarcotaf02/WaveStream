import { strict as assert } from 'node:assert'
import test from 'node:test'
import { parseCommand } from '../src/bot.mjs'
import {
  TELEGRAM_TEXT_LIMIT,
  buildAppText,
  buildHelpText,
  buildReleaseKeyboard,
  buildReleaseText,
  buildStatusText,
  buildWelcomeText,
  formatBytesIt,
  formatRelativeDateIt,
} from '../src/message.mjs'

const RELEASE = {
  tag: '1.1.11',
  title: 'WaveStream 1.1.11',
  url: 'https://github.com/gianmarcotaf02/WaveStream/releases/tag/1.1.11',
  publishedAt: new Date().toISOString(),
  isPrerelease: false,
  assets: [{ name: 'WaveStream.apk', size: 25_500_000, downloadUrl: 'https://example.com/WaveStream.apk' }],
  apk: { name: 'WaveStream.apk', size: 25_500_000, downloadUrl: 'https://example.com/WaveStream.apk' },
  apkUrl: 'https://example.com/WaveStream.apk',
  body: [
    '**Novità della 1.1.11**',
    '',
    '- **Titolo dell\'episodio sempre completo nel player:** in alto ora compare sempre "Nome serie • Titolo episodio".',
    '- **Niente più episodi saltati:** il passaggio automatico è protetto da un lock.',
    '- **Countdown "Prossimo episodio" a 15 secondi:** più tempo per decidere.',
    '',
    'Grazie a tutti per i feedback!',
  ].join('\n'),
}

test('la card di release contiene intestazione, emoji, APK e footer', () => {
  const text = buildReleaseText(RELEASE)
  assert.ok(text.includes('🎬 <b>Nuova versione di WaveStream!</b>'))
  assert.ok(text.includes('🏷 <b>WaveStream 1.1.11</b>'))
  assert.ok(text.includes('📦 24,3 MB'), 'dimensione APK formattata in italiano')
  assert.ok(!text.includes('Novità della 1.1.11'), 'titolo ridondante rimosso')
  assert.ok(text.includes('🐛 <b>Titolo dell\'episodio sempre completo nel player:</b>'))
  assert.ok(text.includes('/stop'))
  assert.ok(text.length <= TELEGRAM_TEXT_LIMIT, `lunghezza ${text.length}`)
})

test('la variante info cambia solo l\'intestazione', () => {
  const text = buildReleaseText(RELEASE, { variant: 'info' })
  assert.ok(text.includes('🔎 <b>Ultima versione disponibile</b>'))
  assert.ok(!text.includes('Nuova versione'))
})

test('una release con note lunghissime resta entro il limite di Telegram', () => {
  const long = {
    ...RELEASE,
    body: Array.from({ length: 260 }, (_, i) => `- **Voce ${i}:** descrizione molto lunga della modifica numero ${i} con parole a volontà`).join('\n'),
  }
  const text = buildReleaseText(long)
  assert.ok(text.length <= TELEGRAM_TEXT_LIMIT, `lunghezza ${text.length}`)
  assert.ok((text.match(/<b>/g) ?? []).length === (text.match(/<\/b>/g) ?? []).length)
})

test('la tastiera contiene APK, GitHub e disattivazione', () => {
  const keyboard = buildReleaseKeyboard(RELEASE)
  const texts = keyboard.inline_keyboard.flat().map((b) => b.text)
  assert.ok(texts.some((t) => t.includes('Scarica WaveStream.apk')))
  assert.ok(texts.some((t) => t.includes('GitHub')))
  assert.ok(texts.some((t) => t.includes('Disattiva')))

  const channelKeyboard = buildReleaseKeyboard(RELEASE, { allowUnsubscribe: false })
  assert.ok(channelKeyboard.inline_keyboard.flat().every((b) => b.callback_data === undefined))
})

test('testi utente: welcome, status, app e help', () => {
  assert.ok(buildWelcomeText({ first_name: 'Marco' }).includes('Ciao Marco'))
  const status = buildStatusText({ subscriber: { id: 42, enabled: true, startedAt: new Date().toISOString(), releasesReceived: 3 }, state: { lastAnnouncedTag: '1.1.11' } })
  assert.ok(status.includes('✅ attiva'))
  assert.ok(status.includes('<code>1.1.11</code>'))
  assert.ok(buildAppText(RELEASE).includes('Impostazioni → Aggiornamenti'))
  assert.ok(buildHelpText({ isAdminUser: true }).includes('/release'))
  assert.ok(!buildHelpText({ isAdminUser: false }).includes('/broadcast'))
})

test('utility di formattazione', () => {
  assert.equal(formatBytesIt(25_500_000), '24,3 MB')
  assert.equal(formatBytesIt(0), null)
  assert.equal(formatRelativeDateIt(new Date().toISOString()), 'oggi')
})

test('parseCommand gestisce bot name e argomenti', () => {
  assert.deepEqual(parseCommand('/start'), { command: 'start', args: '' })
  assert.deepEqual(parseCommand('/release@WaveStreamBot 1.1.11'), { command: 'release', args: '1.1.11' })
  assert.deepEqual(parseCommand('/broadcast ciao a tutti'), { command: 'broadcast', args: 'ciao a tutti' })
  assert.equal(parseCommand('/start@AltroBot'), null)
  assert.equal(parseCommand('ciao, come va?'), null)
})
