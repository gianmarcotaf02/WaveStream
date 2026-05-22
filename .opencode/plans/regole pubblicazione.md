# Regole Pubblicazione Google Play — WaveStream (SandTV)

**App:** IPTV player per Android TV  
**Package attuale:** `it.sandtv.app`  
**Target:** Google Play Store, maggio 2026  

---

## Indice

1. [Stato attuale — Gap Analysis](#1-stato-attuale--gap-analysis)
2. [Privacy Policy](#2-privacy-policy)
3. [Termini e Condizioni](#3-termini-e-condizioni)
4. [Data Safety Section](#4-data-safety-section)
5. [Permessi](#5-permessi)
6. [Sicurezza dei dati](#6-sicurezza-dei-dati)
7. [Requisiti tecnici](#7-requisiti-tecnici)
8. [Policy specifiche IPTV / Streaming](#8-policy-specifiche-iptv--streaming)
9. [Content Rating (IARC)](#9-content-rating-iarc)
10. [Store Listing](#10-store-listing)
11. [GDPR / EAA / Normative europee](#11-gdpr--eaa--normative-europee)
12. [Piano d'azione priorizzato](#12-piano-dazione-priorizzato)
13. [Checklist finale](#13-checklist-finale)

---

## 1. Stato attuale — Gap Analysis

Ogni sezione analizza: cosa richiede la policy Google Play → cosa fa ORA l'app → gap → azione correttiva.

### 1.1 Privacy Policy e documenti legali

| Requisito | Stato attuale | Gap | Azione | Priorità |
|-----------|--------------|-----|--------|----------|
| Privacy Policy pubblicata e linkata | ❌ Assente | Nessuna privacy policy nell'app né in Play Console | Creare policy, hostare su URL HTTPS, linkare in Play Console + in-app | 🔴 Bloccante |
| Termini e Condizioni | ❌ Assente | Nessun documento | Creare ToS con disclaimer IPTV, linkare in-app | 🔴 Bloccante |
| Licenze Open Source | ❌ Assente | Nessuna attribuzione librerie terze parti | Aggiungere sezione in About con licenze (Coil, OkHttp, Retrofit, Room, Hilt, Media3, Moshi, ZXing) | 🟡 Media |
| Contatto sviluppatore | ✅ Email nell'account Play | Presente in Play Console | Verificare che sia aggiornata e visibile | ✅ OK |

### 1.2 Permessi (AndroidManifest.xml)

| Permesso | Stato | Policy | Azione | Priorità |
|----------|-------|--------|--------|----------|
| `INTERNET` | ✅ OK | Essenziale per IPTV | — | ✅ OK |
| `ACCESS_NETWORK_STATE` | ✅ OK | Essenziale | — | ✅ OK |
| `READ_EXTERNAL_STORAGE` | ❌ **Da rimuovere** | Dal 2025-2026 Google è molto restrittiva: ammesso solo per app con core functionality di gestione libreria media | **Rimuovere** — usa SAF/File Picker per backup | 🔴 Bloccante |
| `WRITE_EXTERNAL_STORAGE` (maxSdk=28) | ✅ OK | Limitato ad API <29 | — | ✅ OK |
| `FOREGROUND_SERVICE` | ✅ OK | Per download/sync | — | ✅ OK |
| `FOREGROUND_SERVICE_DATA_SYNC` | ✅ OK | Per data sync | — | ✅ OK |
| `RECEIVE_BOOT_COMPLETED` | ✅ OK | Per EPG programmato | — | ✅ OK |
| `REQUEST_INSTALL_PACKAGES` | 🔴 **Da rimuovere** | Google Play respinge se non per app di aggiornamento APK con core functionality di installazione | **Rimuovere** — se serve auto-update, va giustificato e dichiarato | 🔴 Bloccante |

### 1.3 Sicurezza dati

| Aspetto | Stato attuale | Gap | Azione | Priorità |
|---------|--------------|-----|--------|----------|
| `usesCleartextTraffic="true"` | ❌ Globale | Tutto il traffico HTTP è permesso, incluso verso API non IPTV | Sostituire con **Network Security Config** che permette cleartext SOLO per server IPTV dell'utente, HTTPS per il resto | 🔴 Bloccante |
| Password Xtream in Room DB | ❌ In plaintext | `Playlist.kt:19` — `val password: String?` non cifrato | Usare `EncryptedRoomDatabase` con `security-crypto` | 🔴 Alta |
| API Keys (TMDB/OMDb) in DataStore | ❌ In plaintext | `UserPreferences.kt:33,76` — chiavi in DataStore non cifrato | Migrare a `EncryptedSharedPreferences` (già in uso per OpenSubtitles) | 🟡 Media |
| Backup JSON con password/chiavi | ❌ In plaintext | `BackupRepository.kt:59-60,68` — password e API key esportate in chiaro | Cifrare il backup con password derivata da Keystore, o almeno avvisare l'utente | 🟡 Media |
| `allowBackup="true"` | ⚠️ Rischioso | Android 12+ backup cloud automatico include DB con password | Impostare `android:allowBackup="false"` o configurare `fullBackupContent` per escludere dati sensibili | 🟡 Media |
| Certificate pinning | ❌ Assente | Nessun pinning per API TMDB/OMDb | Opzionale, migliora sicurezza | 🟢 Bassa |
| Obfuscazione R8/ProGuard | ✅ OK | `isMinifyEnabled = true` | — | ✅ OK |

### 1.4 Aspetti IPTV-specifici

| Aspetto | Stato | Note |
|---------|-------|------|
| Playlist precaricate | ✅ OK | Nessuna — utente inserisce tutto |
| Suggerimenti automatici | ✅ OK | Assenti |
| Riferimenti a brand pirata | ✅ OK | Nessuno |
| Disclaimers su copyright | ❌ Assente | Manca nei Termini e nella descrizione store |
| Condivisione playlist tra utenti | ✅ OK | Nessuna, tutto locale |

### 1.5 Data Safety

| Tipo dato | Raccolto? | Stato dichiarazione |
|-----------|-----------|-------------------|
| Credenziali IPTV (username/password) | ✅ Sì, locali | ✅ Da dichiarare come "Authentication info" — uso "App functionality", non condivisi |
| Cronologia visione | ✅ Sì, locale | ✅ Da dichiarare come "App activity" — uso "App functionality", non condivisi |
| Preferiti / Watchlist | ✅ Sì, locale | ✅ Da dichiarare come "App preferences" |
| API Key TMDB/OMDb | ✅ Sì, locale | ✅ Da dichiarare come "Authentication info" |
| Dati backup JSON | ✅ Sì, locale | ✅ Da dichiarare come "Files and docs" — non condivisi |
| Firebase (versione app) | ✅ Solo metadati | ❌ Da verificare se Firebase SDK raccoglie identificatori |
| Analytics / Tracking | ❌ No | ✅ OK |
| Pubblicità | ❌ No | ✅ OK |
| Posizione / Contatti / SMS | ❌ No | ✅ OK |

### 1.6 Store Listing

| Elemento | Stato | Azione |
|----------|-------|--------|
| Descrizione chiara "player only" | ⚠️ Parziale | Descrizione attuale: "App per Android TV per streaming IPTV con supporto EPG, film e serie TV" — va aggiunto disclaimer esplicito "non fornisce contenuti" |
| Disclaimers su contenuti terze parti | ❌ Assente | Aggiungere in descrizione |
| Screenshot senza IP di terzi | ✅ OK | Da verificare |
| "Contains ads" = No | ✅ OK | Nessuna pubblicità |

---

## 2. Privacy Policy

**Stato:** ❌ **OBBLIGATORIO — Assente**  
**Policy Google Play:** User Data policy — "Data collection and use"  
**Conseguenza se assente:** Rigetto dell'app o rimozione dallo store

### 2.1 Cosa deve contenere

La Privacy Policy **deve** essere pubblicata su un URL HTTPS accessibile (GitHub Pages, sito statico, iubenda, Termly) e linkata sia in Play Console che in-app (es. schermata About).

| Voce | Contenuto specifico per WaveStream |
|------|------------------------------------|
| **Titolare del trattamento** | Nome sviluppatore / azienda, email di contatto |
| **Tipologie di dati raccolti** | Credenziali IPTV (username/password), URL playlist, cronologia visione, preferiti, impostazioni app, API keys (TMDB/OMDb/OpenSubtitles), metadati versione app via Firebase |
| **Finalità del trattamento** | Solo funzionamento app (riproduzione playlist) e personalizzazione locale. **Nessuna profilazione, nessun marketing, nessuna condivisione con terze parti** |
| **Base giuridica (GDPR)** | Esecuzione del contratto (fornitura servizio), legittimo interesse (sicurezza), consenso (solo per eventuali future feature opzionali) |
| **Luogo di trattamento** | Prevalentemente locale sul dispositivo. Comunicazioni remote solo verso: server IPTV scelto dall'utente, TMDB/OMDb (per metadati film/serie), Firebase (solo controllo versione) |
| **Condivisione con terze parti** | Nessuna. TMDB/OMDb ricevono solo richieste API anonime. Firebase riceve solo metadati versione app |
| **Conservazione dati** | Finché l'utente non disinstalla l'app o usa la funzione di cancellazione dati. I backup JSON sono controllati dall'utente |
| **Diritti dell'utente** | Accesso (esportazione JSON backup), rettifica (modifica playlist nelle impostazioni), cancellazione (reset dati in Impostazioni → Archiviazione, o disinstallazione), portabilità (export JSON), reclamo presso autorità GDPR |
| **Sicurezza** | Cifratura credenziali in locale (EncryptedSharedPreferences / EncryptedRoom), HTTPS per API, Network Security Config |
| **Aggiornamenti policy** | Data ultimo aggiornamento, diritto di modifica con notifica |
| **Contatti per reclami** | Email sviluppatore, DPO se applicabile |

### 2.2 Checklist

- [ ] Redatta privacy policy completa che copre TUTTI i punti sopra
- [ ] Pubblicata su URL HTTPS stabile (es. `https://tuosito.it/privacy` o GitHub Pages)
- [ ] URL inserito in Play Console → App content → Privacy Policy
- [ ] Link visibile nell'app (es. schermata About → "Privacy Policy" cliccabile)
- [ ] Coerente con dichiarazioni Data Safety

---

## 3. Termini e Condizioni

**Stato:** ❌ **RACCOMANDATO — Assente**  
**Policy Google Play:** Intellectual Property policy, Developer Distribution Agreement  
**Conseguenza se assente:** Rischio sospensione in caso di segnalazioni copyright

### 3.1 Clausole minime per IPTV player

| Clausola | Contenuto |
|----------|-----------|
| **Natura dell'app** | "WaveStream è un player IPTV. NON fornisce, ospita, vende né distribuisce contenuti IPTV, playlist, abbonamenti o canali. L'utente deve inserire unicamente playlist e credenziali di cui ha diritto d'uso." |
| **Responsabilità contenuti terze parti** | L'utente è l'unico responsabile dei contenuti che visualizza tramite i server IPTV da lui configurati. Lo sviluppatore non ha controllo né responsabilità su tali contenuti. |
| **Divieto di uso illecito** | È vietato utilizzare WaveStream per accedere a contenuti protetti da copyright senza autorizzazione, violare termini di servizio di terze parti, o infrangere leggi locali/internazionali. |
| **DMCA / Reclami copyright** | Indicare email per segnalazioni. In caso di reclamo valido, lo sviluppatore si riserva di rimuovere l'app o collaborare con le autorità. |
| **Limitazione di responsabilità** | L'app è fornita "AS IS". Lo sviluppatore non è responsabile per: perdita dati, interruzioni server IPTV terzi, metadata errati, danni derivanti dall'uso dell'app. |
| **Legge applicabile e foro** | Legge italiana (se sviluppatore italiano). |

### 3.2 Checklist

- [ ] Creato documento Termini e Condizioni
- [ ] Link visibile nell'app (es. schermata About → "Termini e Condizioni")
- [ ] Copre natura player, disclaimer, DMCA, uso illecito

---

## 4. Data Safety Section

**Stato:** ⚠️ **OBBLIGATORIO — Da compilare in Play Console**  
**Policy Google Play:** User Data — Data Safety  
**Conseguenza se errato:** Rimozione per incongruenza tra dichiarazioni e comportamento reale

### 4.1 Come compilare per WaveStream

| Categoria | Dato | Raccolto? | Scopo | Condiviso con terze parti? | Obbligatorio? |
|-----------|------|-----------|-------|---------------------------|---------------|
| **Informazioni personali** | Nome profilo (utente può sceglierlo) | ✅ Sì, locale | Funzionalità app | ❌ No | Sì |
| **Informazioni personali** | Credenziali IPTV (username) | ✅ Sì, locale | Funzionalità app (autenticazione provider IPTV) | ❌ No | Sì |
| **Dati di autenticazione** | Password IPTV | ✅ Sì, locale | Funzionalità app | ❌ No | Sì |
| **Dati di autenticazione** | API Keys (TMDB/OMDb) | ✅ Sì, locale | Funzionalità app | ❌ No | Opzionale |
| **Attività app** | Cronologia visione, preferiti, playlist | ✅ Sì, locale | Personalizzazione / Funzionalità app | ❌ No | No |
| **Preferenze app** | Tema, lingua, impostazioni player | ✅ Sì, locale | Funzionalità app | ❌ No | No |
| **Diagnostica** | Log player (solo locali) | ✅ Sì, locale | Funzionalità app | ❌ No | No |
| **File e documenti** | Backup JSON (esportati dall'utente) | ✅ Sì, locale (SAF picker) | Funzionalità app (backup/ripristino) | ❌ No | No |
| **ID dispositivo** | Nessuno | ❌ No | — | — | — |
| **Posizione** | Nessuna | ❌ No | — | — | — |
| **Tracking / Analytics** | Nessuno | ❌ No | — | — | — |
| **Pubblicità** | Nessuna | ❌ No | — | — | — |

### 4.2 Sezione "Sicurezza dei dati"

- **Cifratura in transito:** ✅ Sì (HTTPS per TMDB/OMDb/Firebase, Network Security Config)
- **Cifratura a riposo:** ⚠️ Parziale (OpenSubtitles sì, IPTV/Room/DataStore no — DA IMPLEMENTARE)
- **Utente può cancellare dati:** ✅ Sì (clear data di sistema + funzione reset in app DA AGGIUNGERE)

### 4.3 Checklist

- [ ] Completato questionario Data Safety in Play Console
- [ ] Tutti i tipi di dati dichiarati corrispondono al comportamento reale
- [ ] Sezione sicurezza dati coerente con implementazione effettiva

---

## 5. Permessi

**Stato:** ❌ **2 permessi da rimuovere prima della pubblicazione**  
**Policy Google Play:** Permissions & Sensitive APIs policy  
**Conseguenza:** Rigetto se permessi non giustificati o superflui

### 5.1 Permessi da rimuovere

| Permesso | File | Azione |
|----------|------|--------|
| `READ_EXTERNAL_STORAGE` | `AndroidManifest.xml:8` | **Rimuovere** — su API 33+ non serve. Per backup usa SAF File Picker (già implementato in BackupRepository) |
| `REQUEST_INSTALL_PACKAGES` | `AndroidManifest.xml:14` | **Rimuovere** — Google Play lo considera sensibile e lo respinge se non per app di aggiornamento APK. Al momento non c'è auto-update funzionante |

### 5.2 Permessi da mantenere

| Permesso | Giustificazione |
|----------|----------------|
| `INTERNET` | Necessario per connettersi a server IPTV, TMDB, OMDb, Firebase |
| `ACCESS_NETWORK_STATE` | Necessario per verificare connettività e mostrare errori |
| `WRITE_EXTERNAL_STORAGE` (maxSdk=28) | Solo per retrocompatibilità Android 8-9. Non richiesto su API 29+ |
| `FOREGROUND_SERVICE` | Per download video in background |
| `FOREGROUND_SERVICE_DATA_SYNC` | Per sincronizzazione EPG e playlist |
| `RECEIVE_BOOT_COMPLETED` | Per riprogrammare aggiornamenti EPG dopo riavvio |

### 5.3 Giustificazione in Play Console

Nella pagina **App content → Permissions**, per ogni permesso dichiarato va fornita una spiegazione chiara in italiano/inglese:

> **INTERNET**: "Necessario per riprodurre flussi IPTV dai server configurati dall'utente e per scaricare metadati (copertine, descrizioni) da TMDB e OMDb."
>
> **FOREGROUND_SERVICE + DATA_SYNC**: "Necessario per scaricare aggiornamenti EPG e playlist in background anche quando l'app è in secondo piano."
>
> **RECEIVE_BOOT_COMPLETED**: "Necessario per riprogrammare gli aggiornamenti automatici EPG e playlist dopo un riavvio del dispositivo."

### 5.4 Checklist

- [ ] RIMOSSO `READ_EXTERNAL_STORAGE` dal Manifest
- [ ] RIMOSSO `REQUEST_INSTALL_PACKAGES` dal Manifest
- [ ] Giustificazioni scritte per ogni permesso rimasto

---

## 6. Sicurezza dei dati

**Stato:** ❌ **Multiple vulnerabilità critiche da risolvere**  
**Policy Google Play:** User Data — "Security practices"  
**Conseguenza:** Rischio sospensione per false dichiarazioni Data Safety + vulnerabilità reali

### 6.1 Network Security Config

**Problema:** `AndroidManifest.xml:59` — `android:usesCleartextTraffic="true"` abilita HTTP non cifrato globalmente.

**Soluzione:** Creare `app/src/main/res/xml/network_security_config.xml`:

```xml
<?xml version="1.0" encoding="utf-8"?>
<network-security-config>
    <!-- API di terze parti: solo HTTPS -->
    <domain-config cleartextTrafficPermitted="false">
        <domain includeSubdomains="true">api.themoviedb.org</domain>
        <domain includeSubdomains="true">img.omdbapi.com</domain>
        <domain includeSubdomains="true">www.omdbapi.com</domain>
        <domain includeSubdomains="true">api.opensubtitles.com</domain>
        <domain includeSubdomains="true">sandtv-581c1-default-rtdb.europe-west1.firebasedatabase.app</domain>
    </domain-config>
    <!-- Server IPTV utente: cleartext permesso (non controlliamo i provider) -->
    <base-config cleartextTrafficPermitted="true">
        <trust-anchors>
            <certificates src="system" />
        </trust-anchors>
    </base-config>
</network-security-config>
```

Poi nel Manifest:
```xml
android:usesCleartextTraffic="true"
```
→
```xml
android:networkSecurityConfig="@xml/network_security_config"
android:usesCleartextTraffic="false"
```

### 6.2 Cifratura credenziali nel database Room

**Problema:** `Playlist.kt:19` — password Xtream in chiaro nel database SQLite.

**Soluzione:** Usare `security-crypto` (già presente in `libs.security.crypto`):

1. Creare helper per cifratura/decifratura con Android Keystore + AES/GCM
2. Aggiungere convertitore Room per cifrare/decifrare automaticamente il campo `password`
3. In alternativa, migrare a `EncryptedRoomDatabase`:

```kotlin
// SupportFactory per cifratura automatica del database Room
val passphrase = MasterKey.Builder(context)
    .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
    .build()

val factory = SupportFactory(passphrase)

val db = Room.databaseBuilder(context, AppDatabase::class.java, "sandtv_database")
    .openHelperFactory(factory)
    .build()
```

### 6.3 Cifratura API Keys (TMDB/OMDb)

**Problema:** `UserPreferences.kt:33,76` — chiavi in DataStore in chiaro.

**Soluzione:** Migrare TMDB e OMDb API keys a `EncryptedSharedPreferences` (già usato per OpenSubtitles in `OpenSubtitlesRepository.kt:80-88`):

```kotlin
private val encryptedPrefs by lazy {
    EncryptedSharedPreferences.create(
        context, "encrypted_api_prefs",
        MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build(),
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )
}
```

### 6.4 Backup sicuro

**Problema:** `BackupRepository.kt:59-60` — password esportate in chiaro nel JSON di backup.

**Soluzione 1 (forte):** Cifrare i dati sensibili prima di esportarli:
- Usare una chiave derivata dal Keystor per cifrare i campi `password` e `omdbApiKey` nel JSON
- In import, decifrare con la stessa chiave

**Soluzione 2 (minima):** Aggiungere un avviso chiaro all'utente prima dell'esportazione:
> "Il file di backup contiene le password dei tuoi provider IPTV e le chiavi API in formato leggibile. Non condividerlo con nessuno."

### 6.5 Disabilitare backup automatico Android

**Problema:** `AndroidManifest.xml:53` — `android:allowBackup="true"` permette backup cloud automatico che include DB con password.

**Soluzione:** Impostare `allowBackup="false"` o configurare `fullBackupContent` per escludere dati sensibili:

```xml
<application
    android:allowBackup="false"
    ...
>
```

Oppure, più granularmente:
```xml
<application
    android:allowBackup="true"
    android:fullBackupContent="@xml/backup_rules"
    ...
>
```

Con `res/xml/backup_rules.xml`:
```xml
<?xml version="1.0" encoding="utf-8"?>
<full-backup-content>
    <!-- Escludi database con credenziali -->
    <exclude domain="database" path="sandtv_database" />
    <exclude domain="sharedpref" path="sandtv_preferences" />
</full-backup-content>
```

### 6.6 Checklist

- [ ] Creato `network_security_config.xml` e aggiornato Manifest
- [ ] Implementata cifratura password Xtream in Room (EncryptedRoomDatabase o TypeConverter)
- [ ] API Keys (TMDB/OMDb) migrate a EncryptedSharedPreferences
- [ ] Backup JSON: password cifrate o avviso utente aggiunto
- [ ] `allowBackup` impostato su `false` o configurato con exclude dei dati sensibili
- [ ] R8/ProGuard attivo (già presente)

---

## 7. Requisiti tecnici

### 7.1 Target SDK e compatibilità

| Parametro | Valore attuale | Note |
|-----------|---------------|------|
| `compileSdk` | 34 | ✅ OK per maggio 2026 (Android 14). Valutare aggiornamento a 35/36 |
| `targetSdk` | 34 | ✅ OK |
| `minSdk` | 26 | ✅ Android 8.0, buona copertura |
| `versionCode` | 53 | ✅ OK |
| `versionName` | 1.4.3 | ✅ OK |
| Java | 17 | ✅ OK |
| R8 / minifyEnabled | true | ✅ OK |

### 7.2 Play App Signing

**Stato:** ❌ **Da attivare al primo upload**  
Google Play richiede App Signing per tutte le nuove app.

**Azione:** Al primo upload in Play Console:
1. Generare una chiave di upload (keystore)
2. Caricare l'AAB in Play Console
3. Google genera e gestisce la chiave di firma dell'app

### 7.3 Play Integrity API

**Stato:** 🟡 **RACCOMANDATO**  
Protegge l'app da:
- Installazioni su dispositivi rooted
- Versioni modificate/tampered
- Esecuzione non autorizzata

**Integrazione:** Aggiungere dipendenza `play-integrity` e verificare token all'avvio.

### 7.4 Test su versioni recenti

Testare l'app su:
- Android TV 12 (API 31)
- Android TV 13 (API 33)
- Android TV 14 (API 34)
- Emulatore Android TV con API 34

Check specifici:
- [ ] Permessi runtime gestiti correttamente
- [ ] Foreground service funziona su API 34
- [ ] Picture-in-Picture conforme su API 34
- [ ] Nessun crash all'avvio
- [ ] Download/backup funzionano su scoped storage

### 7.5 Checklist

- [ ] compileSdk e targetSdk aggiornati all'ultimo stabile (almeno 34)
- [ ] App testata su Android TV 12/13/14
- [ ] AAB firmato con chiave di upload (Play App Signing)
- [ ] (Opzionale) Play Integrity API integrata

---

## 8. Policy specifiche IPTV / Streaming

### 8.1 Rischi e mitigazioni

| Rischio | Policy | Mitigazione |
|---------|--------|-------------|
| App percepita come strumento per pirateria | Intellectual Property policy | ✅ Playlist precaricate: NO ❌ Disclaimers in descrizione: DA AGGIUNGERE |
| Contenuti sensibili visualizzabili tramite IPTV | Content policy | ✅ Screenshot senza contenuti protetti ✅ Nessuna promozione di contenuti illeciti |
| UGC (User Generated Content) | User Generated Content policy | ✅ Tutto locale, nessuna condivisione tra utenti — NON è UGC |
| Spam / Minimum functionality | Spam & Minimum Functionality | ✅ App completa, UI curata, funzionalità reali |

### 8.2 Regole d'oro per app IPTV

1. **Nessuna playlist precaricata** — l'app parte vuota ✅
2. **Nessuna ricerca/suggerimento** di playlist o canali ✅
3. **Nessun logo TV, canale o brand** senza autorizzazione in screenshot ✅
4. **Disclaimers chiari** nella descrizione store e nei Termini ❌ DA AGGIUNGERE
5. **Descrizione store neutra** — non promettere "1000 canali", "film gratis", ecc. ❌ OK attuale
6. **Nome e icona neutri** — niente riferimenti a pirateria ✅

### 8.3 Checklist

- [ ] Attenersi alle 6 regole d'oro sopra
- [ ] Descrizione store aggiornata con disclaimer esplicito
- [ ] Nessun brand protetto in screenshot/icona

---

## 9. Content Rating (IARC)

**Stato:** ❌ **OBBLIGATORIO — Da compilare in Play Console**  
**Conseguenza se assente:** App marcata "Unrated" e possibile rimozione

### 9.1 Come rispondere al questionario

| Domanda | Risposta consigliata |
|---------|---------------------|
| L'app contiene violenza? | No (è un player, non produce contenuti) |
| L'app contiene contenuti sessuali? | No |
| L'app contiene linguaggio volgare? | No |
| L'app contiene contenuti di gioco d'azzardo? | No |
| L'app promuove uso di droghe/alcol? | No |
| L'app può accedere a contenuti generati dagli utenti? | No (solo playlist locali inserite dall'utente, non UGC visibile ad altri) |
| L'app può accedere a internet? | Sì (per streaming IPTV) |
| Ci sono acquisti in-app? | No |

**Risultato atteso:** PEGI 3 / ESRB Everyone (E) — rating minimo, come un media player generico.

### 9.2 Checklist

- [ ] Completato questionario IARC in Play Console
- [ ] Rating coerente con funzionalità dell'app

---

## 10. Store Listing

### 10.1 Descrizione

**Stato:** ⚠️ **DA AGGIORNARE**

Descrizione attuale in `strings.xml:360`:
```
"SandTV è un player IPTV per Android TV.\nSviluppato con ❤️ in Italia."
```
e in `SettingsActivity.kt:2152`:
```
"App per Android TV per streaming IPTV con supporto EPG, film e serie TV."
```

**Nuova descrizione (inglese + italiano):**

> **Italiano:**
> WaveStream è un player IPTV per Android TV. Collega la tua playlist M3U o Xtream Codes e goditi i tuoi contenuti in streaming su TV.
>
> **Caratteristiche:**
> - Lettore IPTV per playlist M3U e Xtream Codes
> - EPG (Electronic Program Guide) integrata
> - Supporto per film, serie TV e canali live
> - Streaming adattivo HLS, MPEG-TS
> - Multi-profilo
> - Download per la visione offline
> - Sottotitoli OpenSubtitles integrati
> - Picture-in-Picture
>
> **Importante: WaveStream non fornisce playlist, canali o contenuti IPTV. Devi avere una playlist valida da un provider IPTV di cui hai diritto d'uso per utilizzare questa app.**
>
> **English:**
> WaveStream is an IPTV player for Android TV. Connect your M3U or Xtream Codes playlist and enjoy your streaming content on TV.
>
> **Features:**
> - IPTV player for M3U and Xtream Codes playlists
> - EPG (Electronic Program Guide) support
> - Movies, TV series and live channels support
> - Adaptive streaming HLS, MPEG-TS
> - Multi-profile
> - Offline download
> - OpenSubtitles integration
> - Picture-in-Picture
>
> **Important: WaveStream does not provide playlists, channels or IPTV content. You must have a valid playlist from an IPTV provider you are authorized to use.**

### 10.2 Icona e screenshot

- **Icona:** design neutro, senza riferimenti a brand/canali TV
- **Screenshot:** mostrare UI generica con liste di contenuti fittizi (es. "Film 1", "Canale 1")
- **Nessuna copertina** di film/serie riconoscibile protetta da copyright
- **Banner:** stesso design dell'icona, coerente

### 10.3 Store listing settings

| Campo | Valore |
|-------|--------|
| Contains ads | No |
| Categoria | Entertainment |
| Tags | IPTV, Player, Android TV, Streaming |
| Contatto email | tua@email.com |
| Sito web | opzionale |
| Indirizzo fisico | opzionale (richiesto se vendite/pagamenti) |
| Privacy Policy URL | Inserire URL della privacy policy |
| Termini URL | Opzionale ma raccomandato |

### 10.4 Checklist

- [ ] Descrizione aggiornata con disclaimer "non fornisce contenuti"
- [ ] Versione inglese e italiana
- [ ] Screenshot senza IP di terzi
- [ ] Icona neutra
- [ ] Privacy Policy URL inserito

---

## 11. GDPR / EAA / Normative europee

### 11.1 Consenso

WaveStream **non usa tracking, analytics, pubblicità o profilazione**, quindi non serve un banner cookie/CMP complesso. La base giuridica del trattamento è:
- **Esecuzione del contratto** — dati necessari al funzionamento del player
- **Legittimo interesse** — sicurezza e debug

Se in futuro verranno aggiunte analytics (es. Firebase Crashlytics), servirà consenso esplicito.

### 11.2 Data deletion

Requisito GDPR: l'utente deve poter cancellare i propri dati.

**Stato attuale:**
- ✅ Delete profilo singolo: presente in `ProfileSelectionActivity.kt:250`
- ❌ Delete TUTTI i dati: assente

**Azione:** Aggiungere in Impostazioni → Archiviazione un pulsante "Cancella tutti i dati" che:
1. Elimina tutti i profili e playlist
2. Pulisce preferenze
3. Elimina cronologia, preferiti, watch progress
4. Mostra messaggio di conferma

### 11.3 Portabilità

- ✅ Export JSON backup già implementato in `BackupRepository.kt`
- ✅ Può essere presentato come forma di portabilità dati nella privacy policy

### 11.4 Diritti utente

Nella privacy policy, indicare:
- Email per esercitare diritti (accesso, rettifica, cancellazione, portabilità, reclamo)
- Tempi di risposta (entro 30 giorni)
- Diritto di reclamo al Garante Privacy

### 11.5 Checklist

- [ ] Funzione "Cancella tutti i dati" aggiunta in Impostazioni → Archiviazione
- [ ] Export JSON documentato come portabilità
- [ ] Contatto GDPR nella privacy policy
- [ ] Nessun tracking/analytics (✅ già ok)

---

## 12. Piano d'azione priorizzato

### 🔴 Bloccanti (da fare PRIMA di pubblicare — senza l'app non passa la review)

| # | Cosa | Dove | Tempo stimato |
|---|------|------|---------------|
| 1 | Creare **Privacy Policy** e linkarla in app + Play Console | Documento esterno + About screen | 2-4 ore |
| 2 | Creare **Termini e Condizioni** e linkarli in app | Documento esterno + About screen | 1-2 ore |
| 3 | **Rimuovere** `READ_EXTERNAL_STORAGE` dal Manifest | `AndroidManifest.xml:8` | 5 min |
| 4 | **Rimuovere** `REQUEST_INSTALL_PACKAGES` dal Manifest | `AndroidManifest.xml:14` | 5 min |
| 5 | **Sostituire** `usesCleartextTraffic="true"` con Network Security Config | `AndroidManifest.xml:59` + nuovo file XML | 30 min |
| 6 | **Completare** Data Safety section in Play Console | Play Console | 1 ora |
| 7 | **Completare** Content Rating (IARC) | Play Console | 30 min |

### 🟡 Necessari (rischio medio-alto — da fare prima possibile)

| # | Cosa | Dove | Tempo |
|---|------|------|-------|
| 8 | **Cifrare** password Xtream in Room database | `Playlist.kt`, `AppDatabase.kt` + TypeConverter | 4-6 ore |
| 9 | **Cifrare** API Keys (TMDB/OMDb) in EncryptedSharedPreferences | `UserPreferences.kt` | 2-3 ore |
| 10 | **Aggiungere** sezione "Informazioni Legali" in About screen | `SettingsActivity.kt` — Privacy, Termini, Licenze | 2-3 ore |
| 11 | **Aggiungere** funzione "Cancella tutti i dati" | Impostazioni → Archiviazione | 3-4 ore |
| 12 | **Disabilitare/configurare** `allowBackup` | `AndroidManifest.xml:53` + backup_rules.xml | 30 min |
| 13 | **Aggiornare** descrizione store con disclaimer | Play Console | 1 ora |
| 14 | **Rivedere** backup JSON (avviso password in chiaro o cifratura) | `BackupRepository.kt` | 2-3 ore |

### 🟢 Raccomandati (best practice)

| # | Cosa | Tempo |
|---|------|-------|
| 15 | Integrare Play Integrity API | 4-6 ore |
| 16 | Aggiungere Firebase Crashlytics | 2-3 ore |
| 17 | Aggiungere lingua inglese all'app | 4-8 ore |
| 18 | Test su Android TV 14/15 | 2-4 ore |
| 19 | Certificate pinning per API TMDB/OMDb | 1-2 ore |

### Timeline consigliata

```
Settimana 1: 🔴 Bloccanti (1-7)
Settimana 2: 🟡 Necessari primi 3 (8-10)
Settimana 3: 🟡 Necessari restanti (11-14)
Settimana 4: 🟢 Raccomandati + test finale + upload AAB
```

---

## 13. Checklist finale

### Documentazione legale
- [ ] Privacy Policy pubblicata su URL HTTPS, linkata in Play Console e in-app
- [ ] Termini e Condizioni pubblicati, linkati in-app
- [ ] Sezione "Informazioni Legali" in About screen con link a Privacy, Termini, Licenze
- [ ] Data Safety section completata e coerente
- [ ] Content Rating (IARC) completato

### Permessi e sicurezza
- [ ] `READ_EXTERNAL_STORAGE` rimosso
- [ ] `REQUEST_INSTALL_PACKAGES` rimosso
- [ ] `usesCleartextTraffic="true"` rimpiazzato da Network Security Config
- [ ] `allowBackup` disabilitato o configurato
- [ ] Password Xtream cifrate in Room (EncryptedRoomDatabase o TypeConverter)
- [ ] API Keys (TMDB/OMDb) in EncryptedSharedPreferences
- [ ] Backup JSON: password protette o avviso utente

### Funzionalità GDPR
- [ ] Pulsante "Cancella tutti i dati" presente
- [ ] Export JSON documentato come portabilità
- [ ] Contatto GDPR nella privacy policy

### Store listing
- [ ] Descrizione chiara: "player only, no contenuti forniti"
- [ ] Disclaimer su responsabilità utente presente
- [ ] Screenshot e icona senza IP di terzi
- [ ] "Contains ads" = No
- [ ] Contatto sviluppatore valido
- [ ] Privacy Policy URL inserito

### Tecnici
- [ ] compileSdk / targetSdk ≥ 34
- [ ] R8 / minifyEnabled = true (✅ già ok)
- [ ] App testata su Android TV 12/13/14
- [ ] AAB firmato con Play App Signing
- [ ] (Opzionale) Play Integrity API integrata

---

*Documento generato il ${new Date().toISOString().split('T')[0]} — basato su analisi del codice sorgente e policy Google Play aggiornate a maggio 2026.*
