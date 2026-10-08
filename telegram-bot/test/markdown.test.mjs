import { strict as assert } from 'node:assert'
import test from 'node:test'
import {
  DIVIDER,
  balanceTags,
  bulletMarker,
  escapeHtml,
  markdownToTelegramHtml,
  stripLeadingReleaseTitle,
  stripTags,
  truncateHtml,
} from '../src/markdown.mjs'

test('escapeHtml protegge i caratteri riservati', () => {
  assert.equal(escapeHtml('a & b < c > d'), 'a &amp; b &lt; c &gt; d')
})

test('titoli, elenchi e grassetto diventano HTML Telegram', () => {
  const html = markdownToTelegramHtml(
    ['## Novità', '', '- **Fix del player:** ora funziona', '- voce semplice'].join('\n')
  )
  assert.ok(html.includes('✨ <b>Novità</b>'))
  assert.ok(html.includes('🐛 <b>Fix del player:</b> ora funziona'))
  assert.ok(html.includes('• voce semplice'))
  assert.ok(!html.includes('**'), 'nessun marcatore markdown residuo')
})

test('code block e codice inline sono preservati', () => {
  const html = markdownToTelegramHtml(['```', 'a < b && c', '```', '', 'usa `ADB=1` ora'].join('\n'))
  assert.ok(html.includes('<pre>a &lt; b &amp;&amp; c</pre>'))
  assert.ok(html.includes('<code>ADB=1</code>'))
})

test('link sicuri diventano tag <a>, i link relativi diventano testo', () => {
  const html = markdownToTelegramHtml('[note](https://github.com/x/y) e [bozza](#anchor)')
  assert.ok(html.includes('<a href="https://github.com/x/y">note</a>'))
  assert.ok(html.includes('e bozza'))
  assert.ok(!html.includes('#anchor'))
})

test('la riga che ripete il titolo della release viene rimossa', () => {
  const body = '**Novità della 1.1.11**\n\n- Una cosa\n'
  assert.equal(stripLeadingReleaseTitle(body, '1.1.11').trim(), '- Una cosa')
  assert.equal(stripLeadingReleaseTitle('## Changelog\n\ntesto', '1.2.0').trim(), 'testo')
  assert.equal(stripLeadingReleaseTitle('- resta tutto', '1.2.0').trim(), '- resta tutto')
})

test('elenchi, quote e separatori', () => {
  const html = markdownToTelegramHtml(['> nota', '', '---', '', '1. primo', '  - annidato'].join('\n'))
  assert.ok(html.includes('▎ nota'))
  assert.ok(html.includes(DIVIDER))
  assert.ok(html.includes('<b>1.</b> primo'))
  assert.ok(html.includes('– annidato'))
})

test('bulletMarker sceglie emoji coerenti', () => {
  assert.equal(bulletMarker('**Fix del crash:** risolto'), '🐛 ')
  assert.equal(bulletMarker('**Performance:** più veloce'), '⚡ ')
  assert.equal(bulletMarker('testo senza etichetta'), '• ')
  assert.equal(bulletMarker('**qualsiasi cosa**', { indented: true }), '– ')
})

test('balanceTags chiude i tag aperti', () => {
  assert.equal(balanceTags('<b>ciao <i>a'), '<b>ciao <i>a</i></b>')
  assert.equal(balanceTags('<b>ok</b>'), '<b>ok</b>')
})

test('truncateHtml rispetta il limite e resta HTML valido', () => {
  const long = ['✨ <b>Sezione</b>', ...Array.from({ length: 200 }, (_, i) => `🐛 <b>voce ${i}</b> testo di esempio abbastanza lungo`)].join('\n')
  const cut = truncateHtml(long, 400)
  assert.ok(cut.length <= 400, `lunghezza ${cut.length}`)
  assert.ok(cut.endsWith('…</b>') || cut.includes('…'))
  assert.equal((cut.match(/<b>/g) ?? []).length, (cut.match(/<\/b>/g) ?? []).length)
})

test('stripTags produce testo leggibile per il fallback', () => {
  assert.equal(stripTags('<b>ciao</b> &amp; <i>mondo</i>'), 'ciao & mondo')
})
