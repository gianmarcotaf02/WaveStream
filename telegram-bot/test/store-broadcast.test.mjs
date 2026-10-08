import { strict as assert } from 'node:assert'
import fs from 'node:fs'
import os from 'node:os'
import path from 'node:path'
import test from 'node:test'
import { Store } from '../src/store.mjs'
import { broadcastToSubscribers } from '../src/broadcast.mjs'
import { TelegramError, isUnreachableUserError } from '../src/telegram.mjs'

function makeStore() {
  const dir = fs.mkdtempSync(path.join(os.tmpdir(), 'wavestream-bot-test-'))
  return { dir, store: new Store({ dataDir: dir, logger: silentLogger }) }
}

const silentLogger = { debug() {}, info() {}, warn() {}, error() {} }

test('iscrizione, disiscrizione e statistiche', () => {
  const { dir, store } = makeStore()
  assert.equal(store.addSubscriber({ id: 1, first_name: 'A' }), true)
  assert.equal(store.addSubscriber({ id: 1, first_name: 'A' }), false, 'secondo /start non è nuovo')
  assert.equal(store.getSubscriber(1).enabled, true)

  store.setSubscriberEnabled(1, false)
  assert.equal(store.stats().paused, 1)
  assert.equal(store.activeSubscribers().length, 0)

  store.setSubscriberEnabled(1, true)
  store.addSubscriber({ id: 2, first_name: 'B' })
  store.markUnreachable(2, 'bot was blocked by the user')
  const stats = store.stats()
  assert.equal(stats.total, 2)
  assert.equal(stats.active, 1)
  assert.equal(stats.blocked, 1)

  store.flush()
  assert.ok(fs.existsSync(path.join(dir, 'subscribers.json')))
  assert.ok(fs.existsSync(path.join(dir, 'state.json')))
})

test('lo stato persiste su disco', () => {
  const { dir, store } = makeStore()
  store.setState({ lastAnnouncedTag: '1.1.11' })
  store.addSubscriber({ id: 7, first_name: 'Luca' })
  store.flush()

  const reloaded = new Store({ dataDir: dir, logger: silentLogger })
  assert.equal(reloaded.getState().lastAnnouncedTag, '1.1.11')
  assert.equal(reloaded.getSubscriber(7).firstName, 'Luca')
})

test('il broadcast invia a tutti e marca chi ha bloccato il bot', async () => {
  const { store } = makeStore()
  store.addSubscriber({ id: 10, first_name: 'Uno' })
  store.addSubscriber({ id: 20, first_name: 'Due' })
  store.addSubscriber({ id: 30, first_name: 'Tre' })

  const sent = []
  const tg = {
    async sendMessage(chatId, text, opts) {
      if (chatId === 20) {
        throw new TelegramError('Forbidden: bot was blocked by the user', { method: 'sendMessage', code: 403 })
      }
      sent.push({ chatId, text, opts })
      return { message_id: 1 }
    },
  }

  const summary = await broadcastToSubscribers(tg, store, { repo: 'x/y' }, {
    text: 'ciao',
    keyboardFor: () => ({ inline_keyboard: [[{ text: 'ok', callback_data: 'unsub' }]] }),
    logger: silentLogger,
    delayMs: 0,
  })

  assert.equal(summary.sent, 2)
  assert.equal(summary.blocked, 1)
  assert.equal(summary.failed, 0)
  assert.equal(sent.length, 2)
  assert.equal(store.getSubscriber(20).blocked, true)
  assert.equal(store.getSubscriber(20).enabled, false)
  assert.equal(store.getSubscriber(10).releasesReceived, 1)
  assert.equal(store.activeSubscribers().length, 2)
})

test('isUnreachableUserError riconosce gli errori di blocco', () => {
  assert.equal(isUnreachableUserError(new TelegramError('Forbidden: bot was blocked by the user')), true)
  assert.equal(isUnreachableUserError(new TelegramError('Bad Request: message is too long')), false)
})
