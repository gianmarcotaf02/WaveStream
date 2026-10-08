# Testi e configurazione su @BotFather

Questi testi sono la copia leggibile di `src/profile.mjs` (fonte di verità usata da
`node src/setup-bot.mjs`). Puoi incollarli a mano in BotFather oppure lanciare:

```bash
node src/setup-bot.mjs --photo ../public/banner.png
```

---

## 1. Creazione (`/newbot`)

**Nome del bot** (quello mostrato in chat, max 64 caratteri — *non* deve finire con "bot"):

```
WaveStream
```

**Username** (deve finire con `bot`, deve essere libero):

| Suggerimento | Note |
|---|---|
| `@WaveStreamUpdatesBot` | prima scelta, esplicito sulle notifiche |
| `@WaveStreamReleaseBot` | alternativa |
| `@WaveStreamTVBot` | richiama l'app per Android TV |
| `@WaveStreamAppBot` | alternativa |
| `@WaveStreamNewsBot` | se il bot diventerà anche news generiche |

---

## 2. Descrizione breve — `/setshortdescription` (max 120 caratteri)

```
Notifiche ufficiali delle nuove versioni di WaveStream per Android TV: novità, fix e APK sempre aggiornato.
```

---

## 3. Descrizione — `/setdescription` (max 512 caratteri)

```
🎬 WaveStream — aggiornamenti ufficiali

Questo bot ti avvisa quando esce una nuova versione di WaveStream, il player IPTV per Android TV: novità già impaginate per Telegram e APK sempre a un tap.

Cosa ricevi:
✨ release notes ordinate, con emoji
📥 link diretto all'ultima versione (APK)
🐛 fix e miglioramenti evidenziati

Comandi:
/start — iscriviti alle notifiche
/latest — ultima versione
/app — come aggiornare
/stop — disattiva

Zero spam: scrivo solo quando esce davvero una nuova versione.
```

---

## 4. Comandi — `/setcommands`

```
start - 🔔 Iscriviti alle notifiche di nuove versioni
latest - 🔎 Ultima versione disponibile
app - 📲 Come aggiornare WaveStream
status - ℹ️ Stato della tua iscrizione
stop - 🔕 Disattiva le notifiche
help - ❓ Tutti i comandi
```

> I comandi admin (`release`, `broadcast`, `check`, `stats`, `test`) **non** vanno inseriti nel
> menu pubblico: `src/bot.mjs` li registra automaticamente solo nella chat privata degli ID in
> `adminIds`.

---

## 5. Immagine profilo — `/setuserpic`

Usa `public/banner.png` (già presente nel repo, 1,5 MB). In alternativa è ospitato su Firebase
Hosting: <https://wavestream-d3972.web.app/banner.png>.

```bash
node src/setup-bot.mjs --photo ../public/banner.png   # via API (Bot API ≥ 9.4)
```

Se l'API non è disponibile sul tuo client, imposta la foto a mano da BotFather.

---

## 6. Impostazioni consigliate

| Voce BotFather | Valore | Perché |
|---|---|---|
| `/setjoingroups` | **Enable** (o Disable se lo vuoi solo in privato) | se abilitato, rispondi comunque solo in privato |
| `/setprivacy` | **Enable** | il bot deve leggere solo i messaggi che lo citano |
| `/setinline` | **Off** | non serve l'inline mode |
| `/setcommands` | vedi sopra | menu comandi |
| `/setdomain` | `wavestream-d3972.web.app` | abilita i link `tg://` del Login Widget (opzionale) |
| `/setuserpic` | `banner.png` | branding |
| `/setabouttext` | vedi sotto | testo mostrato prima di `/start` |
| `/setdescription` | vedi sopra | schermata "Cos'è questo bot?" |
| Payments | **disabilitato** | non serve |
| Game platform | **nessuna** | non serve |

### About text — `/setabouttext` (max 120 caratteri)

```
Bot ufficiale degli aggiornamenti di WaveStream (Android TV): novità e nuovo APK, senza spam.
```

### Privacy Policy (opzionale, richiesto se il bot gira in gruppi pubblici)

Usa l'informativa già online: <https://wavestream-d3972.web.app/privacy/>

---

## 7. Checklist finale

- [ ] Token copiato in `telegram-bot/config.json` (`botToken`)
- [ ] Il tuo ID Telegram in `adminIds` (scoprilo con `/id`)
- [ ] `node src/setup-bot.mjs` eseguito (nome, descrizioni, comandi, menu, foto)
- [ ] `npm start` e `/start` di prova dal tuo account
- [ ] `/test` per vedere la card reale, `/stats` per controllare
- [ ] (Opzionale) `channelId` impostato e bot amministratore del canale per pubblicare le release
- [ ] (Opzionale) `githubToken` in `config.json` per alzare il rate limit GitHub
