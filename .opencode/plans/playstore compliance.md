# Play Store Compliance — WaveStream (SandTV)

Stato attuale: **NON PUBBLICABILE** — mancano requisiti obbligatori.

---

## 1. Privacy Policy e Documenti Legali (OBBLIGATORI)

| Documento | Stato | Note |
|---|---|---|
| **Privacy Policy** | ❌ Assente | Obbligatoria per Google Play. Deve spiegare: dati raccolti (playlist, credenziali IPTV, cronologia visione, preferenze), come vengono usati, condivisi, conservati. |
| **Termini e Condizioni (EULA)** | ❌ Assente | Obbligatoria per definire responsabilità utente (contenuti IPTV di terze parti). |
| **Informativa sul trattamento dati GDPR** | ❌ Assente | Se pubblicata in EU, serve consenso esplicito per dati personali. |
| **Licenze Open Source** | ❌ Assente | Biblioteche usate (Coil, OkHttp, Retrofit, Room, Hilt, Media3, Moshi, ZXing) richiedono attribuzione. |

**Cosa serve:**
- Creare una **Privacy Policy** (generabile via service come iubenda, Termly, o custom)
- Creare **Termini e Condizioni** con disclaimer su IPTV/contenuti terze parti
- Inserire link in `about_description` o in una schermata "Info Legali"
- Aggiungere sezione "Licenze Open Source" in About (es. `webView` su `file:///android_asset/licenses.html` o libreria `LicensesFragment`)

---

## 2. Data Safety Section (Play Console)

Google Play richiede di dichiarare quali dati l'app raccoglie e condivide.

**Dati raccolti dall'app:**

| Tipo Dato | Raccolto? | Uso | Condiviso? |
|---|---|---|---|
| Credenziali IPTV (username/password) | ✅ Sì | Autenticazione provider IPTV | ❌ No (solo locale) |
| Playlist URL | ✅ Sì | Caricamento contenuti | ❌ No |
| Cronologia visione | ✅ Sì | Funzionalità "Continua a guardare" | ❌ No |
| Preferiti / Watchlist | ✅ Sì | Funzionalità app | ❌ No |
| API Key TMDB/OMDb | ✅ Sì | Arricchimento metadati | ❌ No (solo locale) |
| Credenziali OpenSubtitles | ✅ Sì | Download sottotitoli | ❌ No (solo locale) |
| Dati di navigazione app | ❌ No | — | — |
| Posizione | ❌ No | — | — |
| Contatti | ❌ No | — | — |
| Dispositivo ID / ADID | ❌ No | — | — |

**Attenzione:** Anche se i dati non vengono condivisi con terze parti, vanno comunque dichiarati.

---

## 3. Permessi (da GIUSTIFICARE)

| Permesso | Stato | Problema |
|---|---|---|
| `INTERNET` | ✅ OK | Essenziale per IPTV |
| `ACCESS_NETWORK_STATE` | ✅ OK | Essenziale |
| `READ_EXTERNAL_STORAGE` | ⚠️ Rischio | su Android 13+ (API 33) è deprecato. Se non serve davvero, rimuoverlo. |
| `WRITE_EXTERNAL_STORAGE` | ✅ OK (maxSdk=28) | Limitato a Android 9, ok |
| `FOREGROUND_SERVICE` | ✅ OK | Per download EPG |
| `FOREGROUND_SERVICE_DATA_SYNC` | ✅ OK | Per sync |
| `RECEIVE_BOOT_COMPLETED` | ✅ OK | Per EPG update programmato |
| `REQUEST_INSTALL_PACKAGES` | 🔴 **Critico** | Google Play **respinge** questo permesso se non per app di aggiornamento APK. Serve giustificazione forte. |

**Azioni:**
- Rimuovere `READ_EXTERNAL_STORAGE` (non serve su Android 13+)
- Rimuovere `REQUEST_INSTALL_PACKAGES` **a meno che** l'app non faccia auto-update con download APK. Se non lo fa, va rimosso **obbligatoriamente**.
- Motivare i permessi rimanenti nella sezione "App permissions" del Play Console

---

## 4. Sicurezza Dati (CRITICO per approvazione)

| Issue | Gravità | Cosa fare |
|---|---|---|
| **Traffico cleartext HTTP** | 🔴 Alta | `android:usesCleartextTraffic="true"` abilita HTTP non cifrato. Serve **Network Security Config** con dominio specifico per provider IPTV (non globale). |
| **Password Xtream in plaintext nel DB** | 🔴 Alta | Room database non cifrato. Migrare a `EncryptedRoomDatabase` con `security-crypto` (già presente nelle dipendenze). |
| **API Keys (TMDB/OMDb) in DataStore plaintext** | 🟡 Media | Usare `EncryptedSharedPreferences` (già in uso per OpenSubtitles). |
| **Backup JSON con password in chiaro** | 🟡 Media | Criptare il file di backup o escludere le password. Aggiungere avviso utente. |
| **No certificate pinning** | 🟡 Media | Aggiungere certificate pinning per API TMDB/OMDb (opzionale ma raccomandato). |
| `allowBackup="true"` | 🟡 Media | Android 12+ permette backup cloud automatico dei dati dell'app. Impostare `allowBackup="false"` o aggiungere `android:fullBackupContent` per escludere dati sensibili. |

---

## 5. Target SDK e Requisiti Tecnici

| Requisito | Stato | Azione |
|---|---|---|
| **compileSdk / targetSdk = 34** | ✅ OK | Android 14. Per 2026 potrebbe servire salire a 35/36. |
| **minSdk = 26** | ✅ OK | Android 8.0, buona copertura |
| **R8 / ProGuard (minifyEnabled)** | ✅ OK | Già abilitato in release |
| **App Signing by Google Play** | ✅ Da fare | Va attivato al primo upload in Play Console |
| **Play Integrity API** | 🟡 Raccomandato | Protegge da lato non autorizzato. Integrabile dopo pubblicazione. |
| **Test su Android 14/15** | ❌ Da verificare | Assicurarsi che non ci siano crash su API 34+ |

---

## 6. Contenuti IPTV (RISCHIO PUBBLICAZIONE)

L'app è un player IPTV generico. Google Play ha policy rigide sui contenuti:

**Rischio:** Se l'app viene percepita come "strumento per pirateria", può essere **sospesa**.

**Mitigazioni obbligatorie:**
1. **Disclaimer** nei Termini: l'utente è responsabile dei contenuti che carica
2. **Nessun canale/listino precaricato** — l'app deve partire con 0 playlist
3. **Nessuna funzione di ricerca/scoperta** di playlist non autorizzate
4. **Nessun riferimento a contenuti pirata** in descrizione, screenshot, nome app
5. **DMCA compliance**: aggiungere meccanismo per segnalare violazioni
6. **Solo M3U/XTREAM inseriti dall'utente** — nessun suggerimento automatico

**Verifica attuale:**
- L'app parte vuota ✅ (nessuna playlist precaricata)
- L'utente inserisce manualmente playlist ✅
- Nessuna pubblicità ❌ (non è un problema, ma non genera conflitto)
- App si chiama "SandTV" / "WaveStream" — nome neutro ✅
- Icona/branding neutri ✅

---

## 7. Altre Carenze

| Area | Dettaglio |
|---|---|
| **Crash Reporting** | Assente. In produzione è consigliato Firebase Crashlytics per diagnosticare crash. |
| **Test automatizzati** | Solo boilerplate (JUnit + Espresso). Nessun test reale. |
| **Accessibilità** | Verificare contrasto colori, focus navigation TV, content description |
| **Multi-lingua** | Solo italiano. Per pubblicazione globale serve almeno inglese. |
| **Rating contenuti** | Da compilare in Play Console |

---

## 8. Checklist Riassuntiva — Da fare prima della pubblicazione

### Bloccanti (app non pubblicabile senza)

- [ ] Creare **Privacy Policy** (hostata su web, linkabile)
- [ ] Creare **Termini e Condizioni** (con disclaimer IPTV)
- [ ] Inserire link a Privacy Policy nell'app (es. About screen)
- [ ] Aggiungere sezione **Licenze Open Source** in About
- [ ] Rimuovere `REQUEST_INSTALL_PACKAGES` dal Manifest
- [ ] Rimuovere `READ_EXTERNAL_STORAGE` (API 33+)
- [ ] Sostituire `usesCleartextTraffic="true"` con **Network Security Config** selettiva
- [ ] Compilare **Data Safety** in Play Console
- [ ] Compilare **Rating questionario** in Play Console

### Alte priorità

- [ ] Criptare password Xtream nel database Room
- [ ] Criptare API Keys (TMDB/OMDb) in EncryptedSharedPreferences
- [ ] Aggiungere Play Integrity API
- [ ] Rivedere backup per escludere/esportare dati sensibili
- [ ] Integrare Firebase Crashlytics

### Raccomandazioni

- [ ] Test su Android 14/15 (API 34/35)
- [ ] Aggiungere inglese come lingua
- [ ] Verificare accessibilità TV
- [ ] Attivare Play App Signing
- [ ] Preparare screenshot e grafiche per store listing
