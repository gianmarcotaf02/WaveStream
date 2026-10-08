# WaveStream · Bot Telegram

Bot Telegram che avvisa **tutti gli utenti iscritti** (quelli che fanno `/start`) ogni volta che
esce una **nuova versione di WaveStream**, con le release notes di GitHub riformattate per
Telegram: emoji, elenchi leggibili, pulsante per scaricare l'APK e link alla release.

- Zero dipendenze: solo Node.js ≥ 18 (usa `fetch`, `FormData` e `node:test` nativi).
- Nessun servizio esterno e nessun webhook: il bot usa il **long polling** e controlla le release
  di GitHub ogni `pollMinutes` minuti.
- Persistenza su file JSON (`data/`), token in `config.json` (entrambi in `.gitignore`).

```
telegram-bot/
├── src/
│   ├── bot.mjs              # processo principale: polling, comandi, invio notifiche
│   ├── notify-release.mjs   # CLI per annunciare una release (anche a mano)
│   ├── setup-bot.mjs        # configura nome, descrizioni, comandi e foto via API
│   ├── profile.mjs          # testi del profilo (fonte di verità di BOTFATHER.md)
│   ├── markdown.mjs         # Markdown GitHub → HTML Telegram (emoji, truncate, escape)
│   ├── message.mjs          # testi delle card/comandi
│   ├── broadcast.mjs        # invio massivo con rate limit e pulizia utenti bloccati
│   ├── telegram.mjs         # client Bot API (retry su 429/5xx, fallback testo semplice)
│   ├── github.mjs           # client REST GitHub (releases)
│   ├── store.mjs            # iscritti + stato su JSON (scritture atomiche)
│   ├── config.mjs           # config.json + variabili d'ambiente
│   └── logger.mjs           # log su console e file con rotazione
├── test/                    # test JVM-free: node --test
├── deploy/                  # systemd, Docker, docker-compose
├── BOTFATHER.md             # testi e passaggi per @BotFather
├── config.example.json      # template → copiato in config.json al primo avvio
└── start-bot.bat / notify-release.bat / setup-bot.bat
```

---

## 1. Crea il bot su Telegram

1. Apri [@BotFather](https://t.me/BotFather) → `/newbot`.
2. Scegli un **nome** (es. `WaveStream`) e un **username** che finisca con `bot`
   (es. `@WaveStreamUpdatesBot`).
3. Copia il **token** (`123456789:AAE...`).

Testi, descrizioni, elenco comandi e passaggi facoltativi (foto, privacy policy, ecc.) sono già
pronti in [`BOTFATHER.md`](./BOTFATHER.md): puoi incollarli a mano oppure lasciar fare all'API:

```bash
node src/setup-bot.mjs --photo ../public/banner.png   # nome, descrizioni, comandi, menu, foto
node src/setup-bot.mjs --dry-run                      # mostra i testi senza inviarli
```

---

## 2. Configura

Al primo avvio il bot crea `config.json` dal template: aprilo e compila **`botToken`**.

```jsonc
{
  "botToken": "123456789:AAE...",   // obbligatorio
  "adminIds": ["123456789"],        // tuoi ID Telegram: abilitano /release, /broadcast, /stats…
  "channelId": "-1001234567890",    // opzionale: pubblica la card anche su un canale
  "repo": "gianmarcotaf02/WaveStream",
  "githubToken": "",                // opzionale: alza il rate limit della API GitHub
  "pollMinutes": 10,                // ogni quanto controllare le release
  "autoPoll": true,                 // false = solo invio manuale
  "announceOnFirstRun": false,      // true = annuncia subito la release corrente al primo avvio
  "includePrerelease": false,       // true = notifica anche le prerelease
  "apkAssetName": "WaveStream.apk"
}
```

Per conoscere il tuo ID Telegram avvia il bot e invia `/id` (oppure aggiungi il comando `id` a
BotFather e usalo in chat). Senza `adminIds` il bot funziona comunque, ma i comandi di invio
manuale rispondono "riservato agli admin".

Ogni valore può essere sovrascritto da variabili d'ambiente (utili per Docker/CI):

| Variabile | Corrisponde a |
|---|---|
| `TELEGRAM_BOT_TOKEN` | `botToken` |
| `TELEGRAM_ADMIN_IDS` | `adminIds` (separati da virgola) |
| `TELEGRAM_CHANNEL_ID` | `channelId` |
| `GITHUB_TOKEN` / `GITHUB_REPO` | `githubToken` / `repo` |
| `POLL_MINUTES` / `AUTO_POLL` / `LOG_LEVEL` | `pollMinutes` / `autoPoll` / `logLevel` |

---

## 3. Avvia

```bash
npm start                 # oppure: node src/bot.mjs
start-bot.bat             # doppio click su Windows
```

All'avvio il bot registra il menu comandi, scandisce i vecchi update e imposta la **baseline**:
la versione già pubblicata *non* viene annunciata (evita di spammare una release vecchia).
Metti `"announceOnFirstRun": true` se invece vuoi annunciarla subito a chi fa `/start`.

---

## 4. Come partono le notifiche

### Automatico (consigliato)

Il bot controlla `GET /repos/<repo>/releases` ogni `pollMinutes` minuti: quando il `tag` cambia
rispetto a `lastAnnouncedTag` (in `data/state.json`) invia la card a tutti gli iscritti attivi e
memorizza il nuovo tag. Non serve modificare la pipeline di release.

### Manuale / immediato

Dopo aver pubblicato la release su GitHub:

```bash
node src/notify-release.mjs                  # ultima release non ancora annunciata
node src/notify-release.mjs 1.1.12           # tag specifico
node src/notify-release.mjs latest --dry-run # anteprima senza inviare
node src/notify-release.mjs --to 123456      # test: invia solo a un utente
node src/notify-release.mjs --force          # rinvia anche se già annunciata
node src/notify-release.mjs --channel-only   # solo canale
node src/notify-release.mjs --text "Manutenzione programmata alle 21:00"
```

Codici di uscita: `0` inviato · `2` saltato (già annunciata) · `1` errore.
È pensato per essere concatenato alla pipeline di release già documentata in `AGENTS.md`
(step 4b, dopo la pubblicazione su GitHub e prima/dopo l'aggiornamento di Firebase RTDB).

Dalla chat, un admin può anche usare `/release 1.1.12`: il bot manda un'anteprima al admin e
invia a tutti solo dopo la conferma con il pulsante ✅.

---

## Comandi del bot

| Comando | Chi | Descrizione |
|---|---|---|
| `/start` | tutti | Iscrizione alle notifiche + card dell'ultima versione |
| `/latest` | tutti | Ultima versione disponibile |
| `/app` | tutti | Come aggiornare WaveStream (con pulsante APK) |
| `/status` | tutti | Stato dell'iscrizione |
| `/stop` | tutti | Disattiva le notifiche (riattivabili con `/start`) |
| `/id` | tutti | Mostra il proprio ID utente e l'ID della chat |
| `/help` | tutti | Elenco comandi |
| `/release [tag]` | admin | Anteprima + invio di una release |
| `/broadcast <testo>` | admin | Messaggio libero a tutti gli iscritti |
| `/check` | admin | Controlla subito se è uscita una nuova versione |
| `/stats` | admin | Statistiche iscritti e stato del bot |
| `/test` | admin | Manda a te stesso la card dell'ultima versione |

Ogni card di release ha i pulsanti **📥 Scarica WaveStream.apk**, **🐙 Note su GitHub** e
**🔕 Disattiva notifiche**. Gli utenti che bloccano il bot vengono marcati e non ricevono più
invii (nessun errore che blocca il broadcast).

---

## Test e verifiche

```bash
npm test                                  # 17 test su formattazione, card e parsing comandi
node src/notify-release.mjs latest --dry-run   # anteprima della card reale, senza inviare
curl -s https://api.telegram.org/bot<TOKEN>/getMe   # controllo rapido del token
```

---

## Deploy

### Windows (Task Scheduler)

1. Crea `C:\wavestream-bot\` (o usa questa cartella) e assicurati che `config.json` sia presente.
2. Task Scheduler → *Create Task*: trigger *At startup*, azione
   *Start a program* → `...\telegram-bot\start-bot.bat`, spunta **Run whether user is logged on
   or not**. In alternativa, in una cartella di lavoro con `nssm`/`pm2-windows-service` per il
   restart automatico.

### Linux (systemd)

```bash
sudo cp -r telegram-bot /opt/wavestream-telegram-bot
sudo cp /opt/wavestream-telegram-bot/deploy/wavestream-bot.service /etc/systemd/system/
sudo systemctl enable --now wavestream-bot
journalctl -u wavestream-bot -f
```

### Docker

```bash
cd telegram-bot
docker compose -f deploy/docker-compose.yml up -d --build
```

I dati (`data/`) e `config.json` vanno montati come volumi, altrimenti si perdono iscritti e
baseline a ogni riavvio del container.

---

## Manutenzione

- **Iscritti:** `data/subscribers.json` (ID, nome, data iscrizione, notifiche ricevute, bloccati).
- **Stato:** `data/state.json` (offset update, `lastAnnouncedTag`, ultimo controllo, hash comandi).
- **Log:** `data/bot.log` (rotazione a 5 MB → `bot.log.1`).
- **Backup:** basta copiare `data/` e `config.json`. Sono file piccoli e leggibili.
- **Ripristinare la baseline:** svuota `lastAnnouncedTag` in `state.json` per far riannunciare
  l'ultima release al prossimo controllo (oppure usa `--force`).
- **Rate limit:** l'invio massivo va a ~12 messaggi/secondo (pausa 80 ms) e ritenta
  automaticamente se Telegram risponde `429 retry_after`.
- **Messaggi lunghi:** le note vengono accorciate automaticamente entro i 4096 caratteri con
  HTML bilanciato e link "Leggi le note complete su GitHub".

## Problemi comuni

| Sintomo | Causa / Soluzione |
|---|---|
| `Token del bot mancante o non valido` | `config.json` non compilato oppure env `TELEGRAM_BOT_TOKEN` assente |
| Il bot non risponde | un altro processo sta usando lo stesso token (`getUpdates` in conflitto): chiudi l'altra istanza |
| Nessuna notifica alla nuova release | `autoPoll: false`, oppure tag già in `lastAnnouncedTag` (usa `--force`) |
| `Bad Request: can't parse entities` | il testo è stato inviato dal fallback automatico; verifica le note con `--dry-run` |
| I messaggi arrivano solo a pochi | il bot è bloccato dagli altri utenti: guarda `/stats` (bloccati) |
