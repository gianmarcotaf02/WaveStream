import { buildReleaseText, buildReleaseKeyboard } from './src/message.mjs'
import { DIVIDER } from './src/markdown.mjs'
import { stripTags } from './src/telegram.mjs'
import { readFileSync } from 'node:fs'

const body = readFileSync('../release/.notes-1.1.15.md', 'utf8')
const size = Number(process.argv[2] ?? 126226260)

const release = {
  tag: '1.1.15',
  title: 'WaveStream 1.1.15',
  body,
  url: 'https://github.com/gianmarcotaf02/WaveStream/releases/tag/1.1.15',
  publishedAt: new Date().toISOString(),
  isPrerelease: false,
  isDraft: false,
  apk: { name: 'WaveStream.apk', size },
  apkUrl: 'https://github.com/gianmarcotaf02/WaveStream/releases/download/1.1.15/WaveStream.apk',
}

const text = buildReleaseText(release, { variant: 'announce', botName: 'WaveStream' })

console.log(`--- HTML ---\n${text}\n`)
console.log(`--- testo semplice ---\n${stripTags(text)}\n`)
console.log('--- tastiera ---')
console.log(JSON.stringify(buildReleaseKeyboard(release, { allowUnsubscribe: true, botName: 'WaveStream' })))
console.log(`\nlunghezza: ${text.length}/4096`)
