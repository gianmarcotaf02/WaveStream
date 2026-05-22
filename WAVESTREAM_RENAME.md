# Piano di Rename: SandTV → WaveStream

**Istruzioni per l'agente AI di opencode**

Questo progetto è una **copia esatta** di `SandTV` (`it.sandtv.app`, v1.4.3).
Deve essere convertito in **WaveStream** (`it.wavestream.app`, v1.0.0)
e pushato su `https://github.com/gianmarcotaf02/WaveStream`.

**Importante:** Mantieni il progetto originale intatto. Lavora solo su questa copia.

---

## Documenti di supporto

Nel progetto sono presenti anche questi documenti utili:

| File | Contenuto |
|------|-----------|
| `cambio nome.md` | Piano rename dettagliato (versione estesa) |
| `documento_regole.md` | Policy Google Play per app IPTV (generato da AI esterna) |
| `.opencode/plans/regole pubblicazione.md` | Guida completa alla pubblicazione + gap analysis del codice |
| `.opencode/plans/playstore compliance.md` | Checklist compliance pre-pubblicazione |

Dopo il rename, usa questi documenti per preparare l'app al **Google Play Store**.

---

## Panoramica modifiche

| Area | Cosa cambiare |
|------|---------------|
| **Package** | `it.sandtv.app` → `it.wavestream.app` (141 file .kt) |
| **Brand classi** | `SandTVColors`, `SandTVTheme`, `SandTVTypography`, `SandTVApplication`, `SandTVImageLoaderFactory`, `SandTVDebug` log tag |
| **Brand XML** | `Theme.SandTV` → `Theme.WaveStream`, stringhe app_name/welcome/about, Manifest |
| **Build** | `namespace`, `applicationId`, `rootProject.name`, APK filename, DataStore name, backup filename |
| **Versione** | `versionCode = 1`, `versionName = "1.0.0"` |
| **Firebase** | Sostituire `google-services.json` con nuovo file del progetto Firebase "WaveStream" |
| **GitHub** | `git remote add origin https://github.com/gianmarcotaf02/WaveStream.git` |

---

## Fase 1 — Rename package: `it.sandtv.app` → `it.wavestream.app`

### 1.1 Spostare directory

```
app/src/main/java/it/sandtv/  →  app/src/main/java/it/wavestream/
```

### 1.2 Aggiornare package declaration e import

In **tutti i 141 file .kt**, sostituire:
- `package it.sandtv.app` → `package it.wavestream.app`
- `import it.sandtv.app` → `import it.wavestream.app` (nei riferimenti fully-qualified)

Comando PowerShell (eseguire dalla root del progetto):
```powershell
Get-ChildItem -Path "app/src/main/java/it/wavestream" -Recurse -Filter *.kt | ForEach-Object {
    (Get-Content $_.FullName) -replace 'it\.sandtv\.app', 'it.wavestream.app' | Set-Content $_.FullName
}
```

### 1.3 Aggiornare app/build.gradle.kts

| Riga | Vecchio | Nuovo |
|------|---------|-------|
| 10 | `namespace = "it.sandtv.app"` | `namespace = "it.wavestream.app"` |
| 14 | `applicationId = "it.sandtv.app"` | `applicationId = "it.wavestream.app"` |

### 1.4 Sostituire google-services.json

Il file attuale è legato al progetto Firebase `sandtv-581c1`.
L'utente ha creato un **nuovo progetto Firebase chiamato "WaveStream"** con package `it.wavestream.app`.

**Azione:** Sostituire `app/google-services.json` con il file scaricato dal nuovo progetto Firebase.

---

## Fase 2 — Branding: `SandTV` → `WaveStream`

### 2.1 File Kotlin

| File | Vecchio | Nuovo |
|------|---------|-------|
| `app/src/main/java/it/wavestream/app/SandTVApplication.kt` | `SandTVApplication` (classe) | `WaveStreamApplication` |
| `app/src/main/java/it/wavestream/app/SandTVApplication.kt` | `"SandTVDebug"` (log tag) | `"WaveStreamDebug"` |
| `app/src/main/java/it/wavestream/app/SandTVApplication.kt` | KDoc "Main Application class for SandTV" | "Main Application class for WaveStream" |
| `app/src/main/java/it/wavestream/app/ui/theme/SandTVTheme.kt` | `SandTVColors` (object) | `WaveStreamColors` |
| `app/src/main/java/it/wavestream/app/ui/theme/SandTVTheme.kt` | `SandTVTypography` (val) | `WaveStreamTypography` |
| `app/src/main/java/it/wavestream/app/ui/theme/SandTVTheme.kt` | `SandTVTheme` (fun) | `WaveStreamTheme` |
| `app/src/main/java/it/wavestream/app/util/SandTVImageLoaderFactory.kt` | `SandTVImageLoaderFactory` (class) | `WaveStreamImageLoaderFactory` |

Dopo aver rinominato le classi, aggiornare **tutti i riferimenti** in tutti i file .kt:
- `SandTVColors.` → `WaveStreamColors.` (usato centinaia di volte)
- `SandTVTheme(` → `WaveStreamTheme(`
- `SandTVImageLoaderFactory` → `WaveStreamImageLoaderFactory`
- Import di `SandTVColors`, `SandTVTheme`, `SandTVImageLoaderFactory` nei file che li usano

### 2.2 File XML

| File | Vecchio | Nuovo |
|------|---------|-------|
| `res/values/strings.xml:4` | `<string name="app_name">SandTV</string>` | `"WaveStream"` |
| `res/values/strings.xml:256` | `"Benvenuto in SandTV"` | `"Benvenuto in WaveStream"` |
| `res/values/strings.xml:360` | `"SandTV è un player IPTV..."` | `"WaveStream è un player IPTV..."` |
| `res/values/themes.xml:6` | `name="Theme.SandTV"` | `name="Theme.WaveStream"` |
| `res/values/themes.xml:18` | `name="Theme.SandTV.FullScreen"` | `name="Theme.WaveStream.FullScreen"` |
| `res/values/themes.xml:25` | `name="Theme.SandTV.Player"` | `name="Theme.WaveStream.Player"` |
| `res/values/themes.xml:240` | `name="Theme.SandTV.Dialog"` | `name="Theme.WaveStream.Dialog"` |
| `AndroidManifest.xml:52` | `android:name=".SandTVApplication"` | `.WaveStreamApplication` |
| `AndroidManifest.xml:58` | `@style/Theme.SandTV` | `@style/Theme.WaveStream` |
| `AndroidManifest.xml:74` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:85` | `@style/Theme.SandTV` | `@style/Theme.WaveStream` |
| `AndroidManifest.xml:89` | `@style/Theme.SandTV` | `@style/Theme.WaveStream` |
| `AndroidManifest.xml:93` | `@style/Theme.SandTV` | `@style/Theme.WaveStream` |
| `AndroidManifest.xml:101` | `@style/Theme.SandTV.Player` | `@style/Theme.WaveStream.Player` |
| `AndroidManifest.xml:108` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:115` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:122` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:129` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:135` | `@style/Theme.SandTV` | `@style/Theme.WaveStream` |
| `AndroidManifest.xml:140` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:147` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:155` | `@style/Theme.SandTV.Player` | `@style/Theme.WaveStream.Player` |
| `AndroidManifest.xml:162` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:169` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:176` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:183` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |
| `AndroidManifest.xml:190` | `@style/Theme.SandTV.FullScreen` | `@style/Theme.WaveStream.FullScreen` |

### 2.3 Build & Config

| File | Riga | Vecchio | Nuovo |
|------|------|---------|-------|
| `settings.gradle.kts` | 23 | `rootProject.name = "SandTV"` | `rootProject.name = "WaveStream"` |
| `app/build.gradle.kts` | 52 | `outputFileName = "SandTV.apk"` | `outputFileName = "WaveStream.apk"` |

### 2.4 DataStore e preferenze (nomi interni)

| File | Riga | Vecchio | Nuovo |
|------|------|---------|-------|
| `UserPreferences.kt` | 14 | `"sandtv_preferences"` | `"wavestream_preferences"` |
| `UserPreferences.kt` | 17 | `"sandtv_sync_prefs"` | `"wavestream_sync_prefs"` |

### 2.5 Backup filename

| File | Riga | Vecchio | Nuovo |
|------|------|---------|-------|
| `BackupRepository.kt` | 107 | `"sandtv_backup_"` | `"wavestream_backup_"` |

---

## Fase 3 — Aggiornare versione

In `app/build.gradle.kts`:

```kotlin
versionCode = 1
versionName = "1.0.0"
```

---

## Fase 4 — Firebase

1. L'utente ha creato un progetto Firebase chiamato **"WaveStream"**
2. Ha registrato un'app Android con package `it.wavestream.app`
3. Scaricare il file `google-services.json` e sostituire quello attuale in `app/google-services.json`

---

## Fase 5 — GitHub

Dopo tutte le modifiche:

```bash
git init
git add .
git commit -m "Initial commit: import from SandTV v1.4.3, rename to WaveStream v1.0.0"
git remote add origin https://github.com/gianmarcotaf02/WaveStream.git
git push -u origin main
```

---

## Fase 6 — Compliance Play Store (dopo il rename)

Documenti di riferimento nella cartella del progetto:

1. **`.opencode/plans/regole pubblicazione.md`** — guida completa con gap analysis del codice
2. **`documento_regole.md`** — policy Google Play aggiornate a maggio 2026 per app IPTV
3. **`cambio nome.md`** — piano rename esteso

Dopo aver completato il rename, apri questi documenti e segui le istruzioni
per la compliance (Privacy Policy, permessi, sicurezza, Data Safety, ecc.).

---

## Fase 7 — Verifica finale

Dopo le modifiche, verificare che:

- [ ] `./gradlew assemble` compila senza errori
- [ ] L'APK generato si chiama `WaveStream.apk`
- [ ] `applicationId` nell'APK è `it.wavestream.app`
- [ ] Nessun riferimento a "SandTV" o "sandtv" nei file .kt e .xml
- [ ] `SandTVApplication` non esiste più (sostituito da `WaveStreamApplication`)
- [ ] `SandTVColors` non esiste più (sostituito da `WaveStreamColors`)
- [ ] `Theme.SandTV` non esiste più (sostituito da `Theme.WaveStream`)
- [ ] `google-services.json` contiene `it.wavestream.app`
- [ ] L'app si apre su Android TV e mostra "WaveStream"

### Consigliato: cerca residui

Prima del commit finale, cercare occorrenze residue:

```powershell
# Cerca "SandTV" in tutti i file (dovrebbe dare 0 risultati)
Get-ChildItem -Recurse -Include *.kt,*.xml,*.kts,*.json,*.properties,*.gradle |
    Select-String -Pattern "SandTV" | Select-Object FileName, LineNumber, Line

# Cerca "sandtv" in tutti i file (dovrebbe dare solo corrispondenze in path/cartelle residue o nel .git)
Get-ChildItem -Recurse -Include *.kt,*.xml,*.kts,*.json |
    Select-String -Pattern "sandtv" | Select-Object FileName, LineNumber, Line
```

---

## Riepilogo file da modificare

| # | Categoria | File | Tipo modifica |
|---|-----------|------|---------------|
| 1 | **Package** | 141 file `.kt` in `app/src/main/java/it/wavestream/` | `it.sandtv.app` → `it.wavestream.app` |
| 2 | **Package** | `app/build.gradle.kts:10` | `namespace` |
| 3 | **Package** | `app/build.gradle.kts:14` | `applicationId` |
| 4 | **Brand** | `SandTVApplication.kt` | Classe + KDoc + log tag |
| 5 | **Brand** | `ui/theme/SandTVTheme.kt` | 3 oggetti (Colors, Theme, Typography) |
| 6 | **Brand** | `util/SandTVImageLoaderFactory.kt` | Nome classe |
| 7 | **Brand** | `res/values/strings.xml` | 3 stringhe |
| 8 | **Brand** | `res/values/themes.xml` | 4 style name |
| 9 | **Brand** | `AndroidManifest.xml` | className + 18 style ref |
| 10 | **Brand** | `settings.gradle.kts:23` | rootProject.name |
| 11 | **Brand** | `app/build.gradle.kts:52` | APK filename |
| 12 | **Brand** | `UserPreferences.kt:14,17` | Nomi DataStore / SharedPrefs |
| 13 | **Brand** | `BackupRepository.kt:107` | Nome file backup |
| 14 | **Versione** | `app/build.gradle.kts:17-18` | versionCode=1, versionName="1.0.0" |
| 15 | **Firebase** | `app/google-services.json` | Sostituire con nuovo file |
| 16 | **Nuovo** | `.gitignore` | Aggiungere `app/release/` se non presente |

---

*Documento generato il 22/05/2026 — per l'agente AI di opencode nel progetto WaveStream.*
*Ultimo aggiornamento: inclusi documenti .opencode/plans/, cambio nome.md e documento_regole.md*
