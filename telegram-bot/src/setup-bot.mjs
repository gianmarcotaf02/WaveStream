#!/usr/bin/env node
/**
 * Configura il profilo del bot via API: nome, descrizione breve, descrizione,
 * comandi, menu e (opzionalmente) foto profilo.
 *
 *   node src/setup-bot.mjs
 *   node src/setup-bot.mjs --photo ../public/banner.png
 *   node src/setup-bot.mjs --dry-run
 *
 * Gli stessi testi sono elencati in BOTFATHER.md per l'inserimento manuale.
 */
import fs from 'node:fs'
import path from 'node:path'
import { ConfigError, loadConfig, ROOT } from './config.mjs'
import { createLogger } from './logger.mjs'
import { Telegram } from './telegram.mjs'
import { BOT_NAME, COMMANDS, DESCRIPTION, SHORT_DESCRIPTION, validateProfileTexts } from './profile.mjs'

function parseArgs(argv) {
  const flags = new Set()
  const values = {}
  for (let i = 0; i < argv.length; i += 1) {
    const arg = argv[i]
    if (arg === '--photo' || arg === '--remove-photo') {
      if (arg === '--remove-photo') {
        values[arg] = true
      } else {
        values[arg] = argv[i + 1]
        i += 1
      }
    } else if (arg.startsWith('--')) {
      flags.add(arg)
    }
  }
  return { flags, values }
}

async function main() {
  const { flags, values } = parseArgs(process.argv.slice(2))
  const dryRun = flags.has('--dry-run')

  let cfg
  try {
    cfg = loadConfig({ requireToken: !dryRun })
  } catch (err) {
    if (err instanceof ConfigError) {
      console.error(`\n⚠️  ${err.message}\n`)
      return 1
    }
    throw err
  }

  const problems = validateProfileTexts()
  if (problems.length) {
    console.warn(`⚠️  Testi fuori limite: ${problems.join(', ')} (Telegram li rifiuterà)`)
  }

  const logger = createLogger({ logFile: null, level: 'info' })
  const tg = dryRun ? null : new Telegram(cfg.botToken, { logger })
  const me = tg ? await tg.getMe() : { username: '(dry-run)', id: 0 }

  console.log(`\n🤖 Bot: @${me.username} (${me.id})${dryRun ? ' — DRY RUN' : ''}\n`)

  const steps = [
    ['setMyName', () => tg.setMyName(BOT_NAME)],
    ['setMyShortDescription', () => tg.setMyShortDescription(SHORT_DESCRIPTION)],
    ['setMyDescription', () => tg.setMyDescription(DESCRIPTION)],
    ['setMyCommands', () => tg.setMyCommands(COMMANDS)],
  ]

  if (values['--remove-photo']) {
    steps.push(['removeMyProfilePhoto', () => tg.call('removeMyProfilePhoto')])
  } else if (values['--photo']) {
    const photo = path.isAbsolute(values['--photo']) ? values['--photo'] : path.resolve(process.cwd(), values['--photo'])
    if (!fs.existsSync(photo)) {
      console.warn(`⚠️  Foto non trovata: ${photo} (salto)`)
    } else {
      steps.push(['setMyProfilePhoto', () => tg.setMyProfilePhoto(photo)])
    }
  }

  if (dryRun) {
    console.log(`Nome bot: ${BOT_NAME}`)
    console.log(`\nDescrizione breve (${SHORT_DESCRIPTION.length}/120):\n${SHORT_DESCRIPTION}`)
    console.log(`\nDescrizione (${DESCRIPTION.length}/512):\n${DESCRIPTION}`)
    console.log(`\nComandi: ${COMMANDS.map((c) => `/${c.command}`).join(' ')}`)
    return 0
  }

  let failures = 0
  for (const [name, run] of steps) {
    try {
      await run()
      console.log(`✅ ${name}`)
    } catch (err) {
      failures += 1
      console.log(`⚠️  ${name} non riuscita: ${err.description ?? err.message}`)
      if (name === 'setMyProfilePhoto') {
        console.log('   → imposta la foto a mano da @BotFather (/setuserpic) con il file public/banner.png')
      }
    }
  }

  console.log(`\nProfilo aggiornato. Dettagli manuali da completare su @BotFather: ${path.join(ROOT, 'BOTFATHER.md')}\n`)
  return failures && failures === steps.length ? 1 : 0
}

const invokedDirectly = process.argv[1] && process.argv[1].replace(/\\/g, '/').endsWith('/setup-bot.mjs')
if (invokedDirectly) {
  // process.exit() dopo fetch fa crashare Node ≥ 22 su Windows (assertion libuv
  // `UV_HANDLE_CLOSING`): usare `exitCode` e lasciare che Node chiuda gli handle.
  main()
    .then((code) => {
      process.exitCode = code ?? 0
    })
    .catch((err) => {
      console.error('❌ Errore:', err?.description ?? err?.message ?? err)
      process.exitCode = 1
    })
}
