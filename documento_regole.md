# Guida completa alla compliance Google Play (maggio 2026)

**App target**: IPTV player per Android TV (solo riproduzione di flussi M3U/Xtream inseriti dall’utente, nessun contenuto precaricato, nessuna pubblicità, nessun tracking, nessun login centralizzato).

Questa guida riassume, in chiave pratica, tutti i requisiti Google Play (aggiornati ad aprile–maggio 2026) rilevanti per pubblicare e mantenere compliant un’app IPTV player, con particolare attenzione a privacy, sicurezza, diritti d’autore e compilazione della Play Console.[web:4][web:9][web:22][web:30]

In ogni sezione trovi:
- Stato: **OBBLIGATORIO**, **RACCOMANDATO**, **OPZIONALE** (in ottica Google Play + normativa EU)
- Riferimento a policy/Help ufficiali Google Play (sezione o pagina)
- Conseguenze in caso di mancato rispetto (rigetto, sospensione, rimozione, strike account)

---

## 1. Privacy Policy

Anche se l’app non mostra pubblicità e non fa tracking remoto, **gestisce dati personali e sensibili** (credenziali IPTV, cronologia visione, preferenze), quindi è richiesta una privacy policy completa, pubblicata su URL accessibile (es. sito statico/GitHub Pages/Google Sites) e linkata sia nella Play Console sia in-app.[web:30][web:37][web:40]

### Contenuti minimi obbligatori

| Voce | Descrizione specifica per IPTV player | Stato | Riferimento policy | Conseguenze se assente/errata |
| --- | --- | --- | --- | --- |
| Tipologie di dati raccolti | Elenco dettagliato: credenziali IPTV (username/password), URL server, cronologia visione, canali/playlist salvate, preferiti, impostazioni grafiche, API keys locali (TMDB/OMDb), log tecnici locali, dati di aggiornamento con Firebase Realtime Database (solo metadati versione, nessun identificatore utente).[web:30][web:34] | **OBBLIGATORIO** | User Data policy – sez. "Data collection and use"[web:30] | Rigetto dell’app o rimozione se il Data Safety non è coerente con la privacy policy o con il comportamento reale dell’app. |
| Finalità del trattamento | Spiegare che i dati servono solo per: funzionamento dell’app (riproduzione playlist), personalizzazione locale (preferiti, layout), controllo aggiornamenti via Firebase, debug locale. Nessun uso per profilazione o marketing.[web:30] | **OBBLIGATORIO** | User Data – "Limited use"[web:30] | Possibile rifiuto in review per mancanza di trasparenza; in caso di segnalazioni utenti, sospensione per violazione User Data. |
| Base giuridica (GDPR) | Indicare basi: esecuzione del contratto (fornitura servizio IPTV player), legittimo interesse per sicurezza/antifrode, consenso per eventuale telemetria opzionale (se in futuro aggiunta).[web:30] | **RACCOMANDATO** (ma essenziale per compliance GDPR) | User Data + obblighi privacy locali[web:30] | A livello Google Play di solito non causa rigetto, ma può esporre a rischi normativi in EU. |
| Trattamento locale vs remoto | Specificare che la maggior parte dei dati resta in locale sul dispositivo; unica comunicazione remota è verso: server IPTV dell’utente (da lui inserito), TMDB/OMDb per metadata, Firebase Realtime Database per verifica versione app.[web:30][web:37] | **OBBLIGATORIO** | User Data – "Data sharing"[web:30] | Incongruenze tra dichiarazioni e traffico reale possono portare a sospensione per dichiarazioni false nel Data Safety. |
| Condivisione con terze parti | Dichiarare esplicitamente che: non condividi dati con terze parti per advertising/analytics; TMDB/OMDb ricevono solo richieste tecniche (es. titolo film, senza identificatori utente); Firebase riceve solo info di versione.[web:30][web:34] | **OBBLIGATORIO** | User Data – "Data sharing"[web:30] | Se Google rileva SDK terzi non dichiarati o condivisioni non indicate nel Data Safety, l’app può essere rimossa. |
| Conservazione e retention | Indicare dove sono salvati i dati (storage interno app), durata (finché l’utente non disinstalla o usa la funzione di reset/clear data), e policy di cancellazione per eventuali backend (se in futuro aggiunti).[web:30] | **RACCOMANDATO** | User Data best practices[web:30] | Non dichiarare retention raramente porta a rigetto, ma è un requisito di buona fede e utile in caso di controllo. |
| Diritti utente (GDPR) | Descrivere come esercitare: accesso (es. esportazione JSON), rettifica (modifica playlist), cancellazione (clear data / reset app / disinstallazione), limitazione, portabilità (export JSON), reclamo presso autorità.[web:30][web:40] | **RACCOMANDATO** (GDPR) | User Data + GDPR esterno a Play[web:30] | Mancata informativa può esporre a rischi legali in EU; Google Play può reagire se riceve reclami formali. |
| Sicurezza | Descrivere misure: cifratura credenziali in locale, uso di HTTPS/TLS per IPTV e API TMDB/OMDb, eventuale certificate pinning, protezione da accessi non autorizzati (scoped storage, nessun backup in chiaro).[web:30][web:34] | **OBBLIGATORIO** (se dichiari “data encrypted in transit/at rest” nel Data Safety) | User Data – "Security practices"[web:30][web:34] | Dichiarare cifratura e non implementarla può portare a sospensione per false dichiarazioni. |
| Contatti del titolare | Nome/denominazione sviluppatore, indirizzo email di supporto, eventuale indirizzo fisico richiesto anche in store listing.[web:37] | **OBBLIGATORIO** | Developer contact information[web:37] | Mancanza di contatto valido può causare problemi in review, limitare visibilità o portare a rimozione se Google non riesce a contattarti per violazioni. |

### Checklist Privacy Policy

- [ ] Ho redatto una privacy policy completa, aggiornata a GDPR e User Data policy.
- [ ] La policy elenca **tutti** i dati trattati (inclusi quelli solo locali).
- [ ] La policy è pubblicata online con URL stabile (HTTPS).
- [ ] L’URL è inserito in Play Console (App content → Privacy Policy) e linkato in-app.
- [ ] Le dichiarazioni nella policy coincidono con quelle nel Data Safety.

---

## 2. Termini e Condizioni (ToS)

Anche se Google non richiede esplicitamente dei Termini e Condizioni generali per tutte le app, **per un IPTV player sono fortemente consigliati** per mitigare rischi di copyright e UGC.[web:24][web:46][web:47]

### Clausole minime per IPTV player

| Clausola | Contenuto consigliato | Stato | Riferimento policy | Rischio se assente |
| --- | --- | --- | --- | --- |
| Natura dell’app | Dichiarare che l’app è solo un **player/cliente IPTV**, non fornisce né ospita contenuti, non vende abbonamenti né playlist, l’utente deve inserire credenziali/playlist di cui ha il diritto d’uso.[web:23][web:46] | **RACCOMANDATO** (forte) | IP/Impersonation policy[web:46] | In caso di segnalazioni per violazione copyright, mancando questa chiarezza l’app può essere sospesa come se distribuisse contenuti pirata. |
| Responsabilità contenuti terze parti | Stabilire che l’utente è l’unico responsabile dei contenuti caricati e dei server IPTV usati; lo sviluppatore non ha controllo sui contenuti visualizzati e non è affiliato a provider IPTV terzi.[web:44][web:46] | **RACCOMANDATO** | Intellectual Property – "Apps that induce or encourage copyright infringement"[web:46] | In caso di DMCA/takedown, assenza di tali disclaimer può ridurre margine di difesa; Google può rimuovere l’app. |
| Divieto di uso illecito | Vietare esplicitamente l’uso dell’app per accedere a contenuti pirata, violare copyright, terms of service di terzi, o legge locale.[web:46] | **RACCOMANDATO** | IP & Illegal activities policies[web:46][web:22] | Se l’app diventa nota per uso pirata, Google può sospenderla insieme al dev account. |
| DMCA / Reclami | Indicare contatto per segnalazioni copyright; chiarire che in caso di reclamo valido potresti bloccare l’uso, rimuovere l’app dallo store o suggerire la disinstallazione.[web:44][web:46][web:50] | **RACCOMANDATO** | IP & DMCA – Help Center[web:44][web:46][web:50] | Non obbligatorio per Play, ma utile per gestire reclami e dimostrare buona fede. |
| Limitazione di responsabilità | Limitare responsabilità per: perdita dati locali, interruzioni servizio IPTV di terzi, errori EPG, metadata errati.[web:47] | **OPZIONALE** (legale, non Play-policy) | Developer Distribution Agreement – responsabilità generale[web:47][web:55] | Rischi legali civili, non direttamente legato a rimozione Play. |
| Licenza d’uso | Concedere licenza non esclusiva, revocabile, per usare l’app solo per scopi leciti, e vietare reverse engineering o redistribuzione non autorizzata. | **OPZIONALE** | DDA & pratiche standard[web:47][web:55] | Rischio legale, non tipicamente causa di blocco Play. |

### Checklist Termini e Condizioni

- [ ] Ho un documento ToS separato (o sezione nella privacy policy) che descrive natura e limiti dell’app.
- [ ] Dichiarazione chiara: “L’app NON fornisce né vende contenuti IPTV, è un semplice player.”
- [ ] Clausole su copyright, DMCA e uso lecito presenti.
- [ ] Link ai Termini accessibile dall’app (es. schermata Info / Legal).

---

## 3. Data Safety Section (Play Console)

La **Data Safety** è obbligatoria per tutte le app, anche se non raccolgono dati; nel tuo caso i dati sono principalmente locali ma vanno comunque dichiarati correttamente.[web:2][web:5][web:8][web:34]

### Tipologie di dati nel tuo IPTV player

Per ciascuna categoria devi indicare: se il dato è **raccolto**, per quale scopo, se è **obbligatorio**, se è usato per **tracking** e se è condiviso con terzi.[web:30][web:34]

| Tipo dato | Esempi nel tuo caso | Come dichiarare nel Data Safety | Stato | Riferimento | Rischio se dichiarato male |
| --- | --- | --- | --- | --- | --- |
| Informazioni personali | Nessuna registrazione account centrale; ma credenziali IPTV (username/password) + eventuali nomi profili configurati dall’utente possono essere considerate "personal info" se riconducibili a persona.[web:30] | Segna come **raccolte** (archivio locale) se associate a un utente; uso: "App functionality"; indicare che **non vengono condivise** con terze parti; non usate per tracking.[web:30][web:34] | **OBBLIGATORIO** | User Data – tipo dati personali[web:30] | Incongruenze (es. scansione binario da Google) possono portare a rimozione. |
| Dati di autenticazione | Username/password IPTV salvati in locale.[web:30] | Categoria "Authentication info" o equivalente; scopo: "App functionality"; non condivisi; accesso limitato e cifrato.[web:30] | **OBBLIGATORIO** | User Data – "Authentication information"[web:30] | Maggio 2026: forte attenzione a credenziali e sicurezza, dichiarazioni false → sospensione. |
| Cronologia e attività in-app | Cronologia visione canali, VOD visti, ultime playlist aperte.[web:30] | Categoria "App activity"; uso: "App functionality" o "Personalization"; solo archiviazione locale, non condivise.[web:30][web:34] | **OBBLIGATORIO** | User Data – "App activity"[web:30] | Se usate per suggerimenti in futuro e non dichiarato, possibile violazione. |
| Preferenze e impostazioni | Layout grafico, lingua, modalità player, lista preferiti.[web:30] | Categoria "App preferences"; uso: "App functionality"; solo locale.[web:30] | **OBBLIGATORIO** | User Data – "App info and performance" / "Device or other IDs" se rilevante[web:30] | Tipicamente basso rischio, ma va comunque dichiarato. |
| File di backup JSON | Esportazione/importazione dati su file locale scelto dall’utente.[web:34] | Se i backup restano sul device o in filesystem scelto dall’utente tramite picker, si dichiara come "User-generated content" / "Files and docs" raccolti solo su dispositivo; non condivisi da te.[web:30][web:34] | **RACCOMANDATO** (dichiarare in modo trasparente) | Data Safety – tipologia "Files and docs"[web:34] | Se l’app carica i backup su server e non viene dichiarato → violazione grave. |
| Dati di log/diagnostica | Log player (errori codec, URL non raggiungibile) salvati solo in locale.[web:30] | Categoria "Diagnostics"; se non vengono inviati a server, indica "Not collected" o "Collected but not shared, stored on device only" a seconda delle opzioni disponibili.[web:30][web:34] | **RACCOMANDATO** | User Data – "Diagnostics"[web:30] | Rischio basso se coerente con comportamento reale. |
| Dati Firebase Realtime Database | Verifica versione app, nessun identificatore utente, solo numero versione/build.[web:30] | Se non invii token o ID dispositivo, puoi segnare "No data shared"; altrimenti indicare "App info and performance" → "Crash logs and diagnostics" verso Firebase (terza parte Google).[web:30][web:34] | **OBBLIGATORIO** (se presenti ID o info dispositivo) | User Data – terze parti/SDK[web:30] | Google può incrociare l’uso dell’SDK Firebase e le dichiarazioni Data Safety; incongruenza → rimozione. |
| Identificatori dispositivo | Nel design descritto non li usi; evitare qualunque ID persistente non necessario.[web:30] | Se non accedi ad Advertising ID, Android ID o simili, dichiara "No" alle voci corrispondenti.[web:30] | **OBBLIGATORIO** (dare risposta corretta) | User Data – "Device or other IDs"[web:30] | Dichiarare "No" ma usare ID → violazione grave. |

### Sezione "Sicurezza dei dati" nel Data Safety

- Indica **"Data encrypted in transit"** se tutte le chiamate verso IPTV, TMDB/OMDb e Firebase usano HTTPS/TLS.[web:34]
- Indica **"Data can be deleted by the user"** se offri clear data / reset configurazioni e/o cancellazione selettiva cronologia/preferiti.[web:14][web:34]
- Non selezionare opzioni che non implementi realmente (es. audit di sicurezza indipendenti).

### Checklist Data Safety

- [ ] Ho completato il questionario Data Safety in App content → Data Safety.
- [ ] Tutti i tipi di dati locali (credenziali, cronologia, preferenze) sono dichiarati correttamente.
- [ ] L’uso di Firebase è dichiarato come SDK terza parte, se raccoglie dati.
- [ ] La privacy policy e il Data Safety raccontano la **stessa storia**.

---

## 4. Permessi

Per un IPTV player senza pubblicità/analytics, la regola generale è: **richiedere solo i permessi strettamente necessari al playback e all’accesso file scelti dall’utente**.[web:30][web:42][web:45][web:54]

### Permessi tipicamente accettabili

| Permesso | Uso nel tuo IPTV player | Stato | Riferimento | Note e rischi |
| --- | --- | --- | --- | --- |
| `INTERNET` | Necessario per connettersi ai server IPTV, TMDB/OMDb, Firebase.[web:54] | **OBBLIGATORIO** (per funzionalità) | Permissions & sensitive APIs[web:54] | Permesso base; non causa problemi se coerente con Data Safety. |
| `ACCESS_NETWORK_STATE` | Per sapere se la connessione è disponibile e mostrare errori adeguati. | **RACCOMANDATO** | Network state best practices[web:54] | Non considerato sensibile, ma comunque da dichiarare. |
| `WAKE_LOCK` (se usato) | Per evitare che il device vada in sleep durante la riproduzione.[web:54] | **OPZIONALE/RACCOMANDATO** | Permissions guidelines[web:54] | Usalo solo se realmente necessario; evita foreground services inutili. |

### Permessi da evitare o da rimuovere se non indispensabili

| Permesso | Motivo di rischio | Politica | Esito se ingiustificato |
| --- | --- | --- | --- |
| `READ_EXTERNAL_STORAGE`, `WRITE_EXTERNAL_STORAGE`, `READ_MEDIA_*` | Dal 2025–2026 Google è molto restrittiva: ammessi solo per app che devono gestire l’intera libreria media (gallery, file manager). Per selezione di singoli file usa Photo/File Picker.[web:42][web:45][web:48] | Photo & Video Permissions policy[web:42][web:48][web:54] | Rigetto in review e potenziale sospensione se non rispetti i criteri ("core functionality"). |
| `READ_PHONE_STATE`, SMS/CALL_LOG | Non hanno alcun senso per IPTV player, sono considerati altamente sensibili. | SMS/Call Log & Sensitive permissions policy[web:31][web:54] | Rimozione o rigetto immediato. |
| `ACCESS_FINE_LOCATION` / `ACCESS_COARSE_LOCATION` | Inutile per un player standard; considerato dato sensibile. | Location permissions policy[web:9][web:54] | Richiederli senza giustificazione → rigetto. |
| `READ_CONTACTS` | 2026: soggetto a nuova Contacts Permissions policy, ammesso solo se core feature.[web:1][web:6][web:9][web:54] | Contacts Permissions policy (aprile 2026)[web:9][web:54] | Rigetto/rimozione se usato per funzioni non core. |
| Microfono/Camera | Necessari solo se aggiungi funzioni tipo picture-in-picture con cattura o registrazione; altrimenti da evitare. | Sensitive Permissions policy[web:54] | Reiezione se non strettamente necessari al core. |

### Giustificazione permessi (App content)

Nella pagina **App content → App access/Permissions** devi spiegare ogni permesso sensibile in una frase chiara (es. "`WAKE_LOCK` è usato per mantenere lo schermo acceso durante la riproduzione video su Android TV").[web:37][web:54]

### Checklist permessi

- [ ] Ho rimosso **tutti** i permessi non strettamente necessari (storage legacy, location, contacts, SMS, call log, ecc.).
- [ ] Per accesso a file di backup, uso File Picker/SAF senza chiedere permessi storage globali.
- [ ] Ho documentato nella Play Console l’uso di ogni permesso sensibile.

---

## 5. Sicurezza dei dati

Per un’app che gestisce credenziali IPTV è essenziale dimostrare attenzione alla sicurezza, in linea con User Data policy e con le dichiarazioni nel Data Safety.[web:30][web:34]

### Misure tecniche consigliate

| Misura | Dettaglio per il tuo caso | Stato | Riferimento | Rischio se non implementata |
| --- | --- | --- | --- | --- |
| Cifratura credenziali | Salvare username/password IPTV cifrati, preferibilmente usando Android Keystore + cifratura simmetrica (AES) per dati a riposo.[web:30] | **RACCOMANDATO** (diventa di fatto obbligatorio se dichiari "encrypted at rest") | User Data – Security practices[web:30][web:34] | Se dichiari cifratura nel Data Safety e poi non la applichi, rischio di sospensione per misrepresentation. |
| Cifratura in transito | Forzare HTTPS/TLS per tutte le chiamate a TMDB/OMDb/Firebase. Per i server IPTV utente, consigliare e predefinire URL `https` dove possibile.[web:34] | **OBBLIGATORIO** (per servizi tuoi/terze parti generiche) | Data Safety – security flags[web:34] | HTTP in chiaro verso i tuoi backend può essere considerato cattiva pratica e incompatibile con "data encrypted in transit". |
| Network Security Config | Usare `network_security_config` per disabilitare il cleartext verso i tuoi domini; permettere eventualmente solo IPTV server indicati dall’utente (non controllabili).[web:34] | **RACCOMANDATO** | Android security best practices, User Data[web:30][web:34] | Non critico lato Play, ma migliora posizione in caso di audit. |
| Certificate pinning (per i tuoi backend) | Se in futuro aggiungi backend tuoi (non solo Firebase), considera pinning dei certificati per prevenire MITM.[web:34] | **OPZIONALE/RACCOMANDATO** | Best practices sicurezza[web:34] | Non richiesto esplicitamente da Play, ma aiuta a dimostrare "robust security". |
| Storage sicuro | Usare storage interno app (scoped storage) per database e file di configurazione, evitare external storage per dati sensibili.[web:45] | **OBBLIGATORIO** (se dichiari che i dati non sono accessibili da altre app) | User Data – "Secure data handling"[web:30][web:34] | Salvataggio in external storage accessibile ad altre app può essere visto come data exposure. |
| Backup sicuro JSON | I file di backup contengono credenziali: cifrali o almeno avvisa l’utente chiaramente; idealmente proteggi con password o sconsiglia di condividerli.[web:30] | **RACCOMANDATO** | User Data – sicurezza locale[web:30] | Se il backup viene esfiltrato, pur non essendo responsabilità diretta di Play, può generare reclami. |

### Sicurezza lato codice

- Minimizzare log contenenti URL/credenziali.
- Obfuscazione (R8/ProGuard) attiva, especially per costanti sensibili.[web:30]
- Nessun hard‑coding di API keys TMDB/OMDb in chiaro (eventualmente limitare i privilegi delle chiavi).[web:30]

### Checklist sicurezza

- [ ] Credenziali IPTV in locale sono cifrate o almeno offuscate con Keystore.
- [ ] Tutte le richieste a TMDB/OMDb/Firebase usano HTTPS.
- [ ] Database e file sensibili risiedono solo nello storage interno app.
- [ ] I file di backup JSON sono marcati chiaramente come sensibili e, se possibile, cifrati.

---

## 6. Requisiti tecnici

### Target/Min SDK e compatibilità

- **Target API 34**: in linea con le richieste Google (gli aggiornamenti Play bloccano gradualmente le app con target troppo vecchio).[web:33][web:38]
- **minSdk 26**: accettabile; assicurati di testare su dispositivi con Android TV 8–14.

### App Signing e Integrity

| Requisito | Descrizione | Stato | Riferimento | Rischio se assente |
| --- | --- | --- | --- | --- |
| Play App Signing | Obbligo di fatto per nuove app: l’APK/AAB è firmato da Google, chiavi gestite da loro.[web:37] | **OBBLIGATORIO** per nuove app | Play App Signing requirements[web:37] | Impossibile pubblicare nuove app senza aderire (salvo rarissime eccezioni legacy). |
| Play Integrity API | Fortemente consigliato per prevenire installazioni modificate o non attendibili (soprattutto per app che gestiscono credenziali). | **RACCOMANDATO** | Play Integrity/ SafetyNet successor[web:38] | Non obbligatorio, ma utile per evitare abusi e possibili violazioni UGC/copyright. |
| Test su versioni recenti | Google richiede che le app funzionino su versioni recenti di Android/Android TV e supportino le modifiche alle policy (permessi, privacy). | **OBBLIGATORIO** | Prepare your app for review[web:37][web:4][web:9] | Se l’app crasha ripetutamente o non rispetta nuove policy, può essere rimossa per bassa qualità o non‑compliance. |

### App content page

Devi completare tutte le sezioni: **Privacy Policy**, **Data Safety**, **Content Rating**, **Target audience & content**, **Ads (No)**, **Permissions declaration**, eventuali dichiarazioni aggiuntive.[web:37]

Checklist tecnici

- [ ] Target SDK ≥ 34, build senza warning di deprecazioni critiche.
- [ ] App firmata con Play App Signing.
- [ ] Ho testato l’app su emulatori e device Android TV recenti.
- [ ] App content page completata (nessun item in "Needs attention").

---

## 7. Policy specifiche per IPTV / streaming

Non esiste una policy chiamata "IPTV" ma le app di streaming rientrano in diverse sezioni: **User Generated Content**, **Intellectual Property**, **Violent/sexual content**, **Spam & Minimum Functionality**.[web:22][web:24][web:46][web:27]

### Rischi principali

| Area | Rischio | Policy | Mitigazione |
| --- | --- | --- | --- |
| Copyright/pirateria | L’utente può inserire URL di liste pirata; se l’app viene percepita come strumento per la pirateria, Google può sospenderla.[web:46] | Intellectual Property policy[web:46] | Termini chiari, nessun brand/loghi pirata negli screenshot/descrizione, nessun link a provider illegali, nessuna playlist precaricata. |
| UGC policy | Se considerano le playlist dell’utente come UGC visibile ad altri (es. se in futuro aggiungi sync/cloud), scatterebbero requisiti di moderazione, report, block system.[web:24][web:16][web:27] | User Generated Content policy[web:24] | Con l’architettura descritta (tutto locale, no sharing) l’app **non è UGC**; mantieni questa architettura per evitare obblighi aggiuntivi. |
| Contenuti sensibili | Tramite IPTV si può vedere qualsiasi cosa, ma la policy guarda al **core purpose**: se l’app non promuove contenuti sessuali/violenti e non mostra esempi nei materiali store, di solito è trattata come generico media player.[web:22] | Content policy (sexually explicit, violence)[web:22][web:29] | Evita screenshot con contenuti sensibili; descrizione neutra; nessun riferimento a canali o film protetti. |
| Spam/low quality | App che offrono funzionalità minime o instabili possono essere rimosse come spam/minimum functionality.[web:17][web:22] | Spam and Minimum Functionality policy[web:17][web:22] | Assicurati che l’app sia stabile, con UI curata, e non un semplice wrapper di un WebView. |

### Checklist IPTV-specifica

- [ ] Nessuna playlist, canale o contenuto IPTV è precaricato o suggerito.
- [ ] Nessun riferimento a brand pirata, loghi TV o contenuti protetti negli asset store.
- [ ] L’app non condivide playlist o stream tra utenti (niente UGC nel senso di Play policy).

---

## 8. Content Rating (IARC)

Il questionario Content Rating è **obbligatorio** per tutte le app; quelle senza rating vengono marcate "Unrated" e possono essere rimosse.[web:18][web:21]

### Come compilare per un IPTV player neutro

- Indica che l’app **non contiene** contenuti violenti, sessuali, d’azzardo, uso di droghe, ecc., perché l’app è solo un player e non fornisce contenuti propri.
- Se il questionario chiede se l’app **può accedere** a contenuti di quel tipo tramite internet, di solito puoi rispondere come farebbe un browser generico, indicando che non promuovi tali contenuti e non li presenti nei materiali ufficiali.[web:21][web:26][web:29]
- Non selezionare opzioni che identificano l’app come fornitore di contenuti pornografici o gambling: alcune combinazioni portano direttamente a sospensione.[web:26][web:29]

| Passo | Azione | Stato | Riferimento | Rischio se errato |
| --- | --- | --- | --- | --- |
| Compilare questionario | Accedi a Play Console → App content → Content rating e completa il questionario IARC.[web:21][web:37] | **OBBLIGATORIO** | Content Ratings policy[web:21] | App "Unrated" può essere rimossa o filtrata; rating sbagliato può portare a sospensione. |
| Aggiornare dopo modifiche | Se cambi contenuti o funzionalità (es. aggiungi browsing di cataloghi), devi aggiornare il questionario.[web:21] | **OBBLIGATORIO** | Content Ratings – misrepresentation[web:21][web:29] | Rating inaccurato → rimozione/sospensione. |

Checklist Content Rating

- [ ] Ho completato il questionario IARC in Play Console.
- [ ] Ho risposto coerentemente con il fatto che l’app **non fornisce contenuti propri**.
- [ ] Il rating assegnato (es. PEGI 3/7) è coerente con la descrizione dell’app.

---

## 9. Store Listing (scheda Play Store)

La scheda store deve essere coerente con il comportamento reale dell’app e non violare IP/brand policy.[web:22][web:37][web:46]

### Requisiti descrizione

| Elemento | Linee guida per IPTV player | Stato | Riferimento | Rischio se non conforme |
| --- | --- | --- | --- | --- |
| Descrizione breve e lunga | Spiega chiaramente che l’app è un player IPTV per Android TV, che richiede all’utente di fornire playlist/credenziali proprie, e che **non offre contenuti** né abbonamenti.[web:23][web:46] | **OBBLIGATORIO** (chiarezza) | Metadata, App Description policy[web:22][web:46] | Descrizioni fuorvianti (es. suggerire contenuti inclusi) possono portare a rigetto. |
| Disclaimers | Inserisci in descrizione: "Questa app non fornisce contenuti IPTV né abbonamenti. L’utente deve fornire la propria playlist legale."[web:23][web:46] | **RACCOMANDATO** (forte) | IP / Impersonation policy[web:46] | Aiuta a difenderti in caso di segnalazioni per pirateria. |
| Campo "Contains ads" | Imposta "No" (nessuna pubblicità); se in futuro cambi, aggiorna sia campo sia Data Safety.[web:37] | **OBBLIGATORIO** | Ads policy – app content page[web:37] | Dichiarare "No ads" ma includere ads → sospensione. |
| Campo contatto sviluppatore | Email valida, eventuale sito web e indirizzo fisico se richiesto (specie per pagamenti/abbonamenti, che però qui non ci sono).[web:37] | **OBBLIGATORIO** | Developer contact info[web:37] | Dati di contatto mancanti o falsi possono portare a rimozione. |

### Icona, screenshot, video

- **Nessun logo TV, canale, film, brand famoso** senza autorizzazione scritta.[web:43][web:46][web:49]
- Usa screenshot che mostrano **UI generica** (liste canali con nomi fittizi, nessun contenuto riconoscibile protetto da copyright).
- Non usare copertine di film, immagini promozionali o foto di celebrità senza licenza.[web:46][web:49]

Checklist Store Listing

- [ ] Descrizione chiara: player only, no contenuti forniti.
- [ ] Disclaimers su contenuti di terze parti presenti.
- [ ] Icona e screenshot non usano marchi o contenuti protetti.
- [ ] Campo "Contains ads" impostato correttamente a "No".
- [ ] Dati contatto sviluppatore validi (email, eventualmente sito e indirizzo).[web:37]

---

## 10. GDPR / EAA / normative europee

Google richiede che tu rispetti le leggi privacy locali nei Paesi in cui pubblichi; per un’app disponibile in EU/EAA si applica il GDPR.[web:30][web:39][web:40]

### Consenso

Nel tuo scenario **non usi tracking, pubblicità o analytics**: molte operazioni rientrano in "esecuzione del contratto"/"legittimo interesse" e non richiedono banner cookie complessi.[web:30][web:40]

Tuttavia:
- Se in futuro aggiungi qualsiasi forma di tracking/analytics (anche crash analytics dettagliata associabile a utenti), dovrai gestire il consenso (es. CMP, toggle privacy).[web:30][web:40]
- La privacy policy deve spiegare la base giuridica per ogni trattamento (contratto, legittimo interesse, consenso).[web:40]

### Data deletion e portabilità

Per utenti EU dovresti offrire modalità semplici per:
- **Cancellazione dati**: pulsante in app per resettare configurazioni/cronologia e rimuovere credenziali; spiegare anche che la disinstallazione cancella i dati locali.[web:14][web:30]
- **Portabilità**: export/import JSON già soddisfa bene questo requisito; documentalo nella privacy policy come strumento per ottenere una copia dei dati.[web:30][web:40]

### Diritti utente

- Fornisci un indirizzo email dove gli utenti possono esercitare diritti (accesso, cancellazione, portabilità, reclamo).
- Descrivi le tempistiche di risposta (es. entro 30 giorni) nella privacy policy.[web:30][web:40]

Checklist GDPR/EAA

- [ ] La privacy policy copre basi giuridiche, diritti, contatto DPO/titolare.
- [ ] Esiste una funzione in-app per cancellare dati e/o istruzioni chiare su come farlo.
- [ ] Export JSON è documentato come forma di portabilità dei dati.

---

## 11. Checklist finale prima di pubblicare

### Documentazione legale e dichiarazioni

- [ ] Privacy Policy completa, pubblicata via HTTPS, linkata in Play Console e in-app.[web:30][web:37]
- [ ] Termini e Condizioni con: natura player, disclaimer contenuti terze parti, uso lecito, DMCA/copyright.[web:44][web:46]
- [ ] Data Safety section completata, coerente con comportamento reale dell’app.[web:2][web:30][web:34]
- [ ] Content Rating questionnaire (IARC) completato e approvato.[web:21]

### Implementazione privacy & sicurezza

- [ ] Nessun SDK di analytics/ads/tracking presente.
- [ ] Firebase Realtime Database usato solo per check versione, senza ID utente.
- [ ] Credenziali IPTV e dati sensibili cifrati o comunque protetti in storage interno.
- [ ] Tutte le comunicazioni verso TMDB/OMDb/Firebase via HTTPS.
- [ ] Funzione di reset/cancellazione dati locali presente (o istruzioni chiare su come disinstallare/clear data).

### Permessi e codice

- [ ] Manifest senza permessi superflui (storage legacy, SMS, call log, location, contacts, camera/microfono se non usati).[web:31][web:42][web:54]
- [ ] Per file di backup usi un file picker (SAF) e non richiedi `READ_EXTERNAL_STORAGE`/`READ_MEDIA_*`.[web:42][web:45]
- [ ] Target SDK 34, minSdk 26, build firma con Play App Signing.

### Store listing

- [ ] Descrizione che chiarisce che l’app **non fornisce contenuti** ma solo riproduce quelli forniti dall’utente.[web:23][web:46]
- [ ] Disclaimers su responsabilità dell’utente per i contenuti IPTV.
- [ ] Screenshot e icone privi di IP di terzi non autorizzati.[web:46][web:49]
- [ ] Campo "Contains ads" impostato su "No".
- [ ] Dati contatto sviluppatore validi (email, eventualmente sito e indirizzo).[web:37]

Se rispetti tutti i punti di questa checklist e mantieni coerenza totale tra **comportamento reale dell’app**, **manifest/permessi**, **Data Safety** e **Store Listing**, il tuo IPTV player per Android TV è allineato alle policy Google Play aggiornate a primavera 2026 e riduci al minimo i rischi di rigetto, sospensione o rimozione.