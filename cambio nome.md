# Piano di Rename: SandTV → WaveStream

**Nuovo package:** `it.wavestream.app`
**Nuovo nome:** WaveStream

---

## ⚠️ Premessa Importante

**Firebase**: `google-services.json` è legato al progetto Firebase `sandtv-581c1`.
Servirà **un nuovo progetto Firebase** con package `it.wavestream.app` per:
- Notifiche push
- Crashlytics
- Realtime Database / Firestore

Il rename delle key Firebase **non si fa** — va creato un progetto nuovo e scaricato
un nuovo `google-services.json`.

---

## Fase 1 — Ristrutturazione package (it.sandtv.app → it.wavestream.app)

### 1.1 Spostare directory da vecchio a nuovo package

```
app/src/main/java/it/sandtv/  →  app/src/main/java/it/wavestream/
```

### 1.2 Aggiornare package declaration in tutti i file .kt (~141 file)

- In ogni `.kt` sotto `app/src/main/java/it/wavestream/`, sostituire:
  ```
  package it.sandtv.app
  ```
  con:
  ```
  package it.wavestream.app
  ```

### 1.3 Aggiornare import fully-qualified

- In tutti i `.kt`, sostituire ogni occorrenza di `it.sandtv.app` con `it.wavestream.app`.
  Presente in import, riferimenti inline e BuildConfig.

### 1.4 Aggiornare build.gradle.kts (app)

- **namespace** (riga 10): `it.sandtv.app` → `it.wavestream.app`
- **applicationId** (riga 14): `it.sandtv.app` → `it.wavestream.app`

### 1.5 Aggiornare google-services.json

- **Sostituire** il file intero con uno nuovo da un progetto Firebase con
  package `it.wavestream.app`.
- Le occorrenze di `sandtv-581c1` vanno rimpiazzate col nuovo project ID
  (firebase project, storage bucket, database URL).

### 1.6 (Opzionale) Riavvio Android Studio

Dopo lo spostamento delle directory, Android Studio potrebbe richiedere
un sync di Gradle e un riavvio per aggiornare gli indici.

---

## Fase 2 — Rename nome e branding (SandTV → WaveStream)

### 2.1 File Kotlin — Classi/oggetti/funzioni

| File | Cosa cambiare | Istanze |
|---|---|---|
| `SandTVApplication.kt` | Nome classe: `SandTVApplication` → `WaveStreamApplication` | ~1 |
| `SandTVTheme.kt` | Oggetto `SandTVColors` → `WaveStreamColors` | ~1 def + ~250 usi |
| `SandTVTheme.kt` | Val `SandTVTypography` → `WaveStreamTypography` | ~1 def |
| `SandTVTheme.kt` | Funzione `SandTVTheme` → `WaveStreamTheme` | ~1 def + ~3 usi |
| `SandTVImageLoaderFactory.kt` | Classe `SandTVImageLoaderFactory` → `WaveStreamImageLoaderFactory` | ~1 def + ~1 uso |
| `SandTVApplication.kt` | Log tag `SandTVDebug` → `WaveStreamDebug` | ~2 occorrenze |
| `SandTVApplication.kt` | KDoc/commenti | ~3 |

Tutti i riferimenti a `SandTVColors.*`, `SandTVTheme`, `SandTVTypography`
e `SandTVImageLoaderFactory` nei file `.kt` vanno aggiornati di conseguenza.

### 2.2 File XML

| File | Cosa cambiare |
|---|---|
| `res/values/strings.xml` | `app_name`: `SandTV` → `WaveStream` |
| `res/values/strings.xml` | `welcome_title`: `Benvenuto in SandTV` → `Benvenuto in WaveStream` |
| `res/values/strings.xml` | `about_description`: `SandTV è un player...` → `WaveStream è un player...` |
| `res/values/themes.xml` | `Theme.SandTV` → `Theme.WaveStream` (4 definizioni) |
| `AndroidManifest.xml` | `android:name=".SandTVApplication"` → `android:name=".WaveStreamApplication"` |
| `AndroidManifest.xml` | `@style/Theme.SandTV*` → `@style/Theme.WaveStream*` (18+ occorrenze) |

### 2.3 Build & Config

| File | Cosa cambiare |
|---|---|
| `settings.gradle.kts` | `rootProject.name = "SandTV"` → `rootProject.name = "WaveStream"` |
| `app/build.gradle.kts` | `output.outputFileName = "SandTV.apk"` → `WaveStream.apk` |

### 2.4 Firebase (google-services.json)

Le occorrenze testuali `sandtv` in `google-services.json` vanno sostituite
col nuovo project ID (es. `wavestream-xxxxx`).

### 2.5 Build artifacts (cancellare)

I file in `app/release/` vanno cancellati **prima** di buildare, perché
contengono riferimenti al vecchio nome:

```
app/release/output-metadata.json
app/release/SandTV.apk
app/release/baselineProfiles/0/SandTV.dm
app/release/baselineProfiles/1/SandTV.dm
```

Saranno rigenerati alla prossima build.

---

## Fase 3 — Post-rename

### 3.1 Sync Gradle & rebuild

```bash
./gradlew clean
./gradlew build
```

### 3.2 Verifiche

- [ ] APK generato si chiama `WaveStream.apk`
- [ ] `applicationId` in APK = `it.wavestream.app`
- [ ] App si apre e mostra "WaveStream" come nome
- [ ] Tema e colori funzionano (WaveStreamColors import corretto)
- [ ] Classi DI/Hilt si inizializzano (WaveStreamApplication, non SandTVApplication)
- [ ] Firebase inizializza correttamente (servono keystore SHA e progetto Firebase)

### 3.3 Firebase (se usato)

1. Creare nuovo progetto Firebase (es. `wavestream-...`)
2. Registrare app Android con package `it.wavestream.app`
3. Scaricare `google-services.json` e sostituire
4. Aggiungere impronte SHA1/SHA256 per accesso Google Sign-In/Firebase

---

## Riepilogo operazioni

| Area | File coinvolti | Tipo cambio |
|---|---|---|
| Package (directory) | 141 `.kt` da spostare | Strutturale |
| Package (.kt content) | 141 `.kt` | Testuale |
| Package (build) | `app/build.gradle.kts` (namespace, applicationId) | Testuale |
| Package (Firebase) | `google-services.json` | Sostituzione file |
| Brand (classi Kotlin) | `SandTVApplication`, `SandTVTheme`, `SandTVColors`, `SandTVTypography`, `SandTVImageLoaderFactory` | Rename simboli |
| Brand (temi XML) | `themes.xml` | Rename style name |
| Brand (stringhe) | `strings.xml` (3 stringhe) | Testuale |
| Brand (Manifest) | `AndroidManifest.xml` (className + style) | Testuale |
| Brand (Gradle config) | `settings.gradle.kts`, `app/build.gradle.kts` (APK name) | Testuale |
| Build artifacts | `app/release/*` | Eliminazione |
