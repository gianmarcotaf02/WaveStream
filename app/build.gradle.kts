import java.util.Properties

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.google.services)
}

// Signing: legge le credenziali da keystore.properties (gitignored) nella root del progetto
val keystorePropertiesFile = rootProject.file("keystore.properties")
val keystoreProperties = Properties().apply {
    if (keystorePropertiesFile.exists()) {
        keystorePropertiesFile.inputStream().use { load(it) }
    }
}

// Chiave OpenRouter preconfigurata (file .env GITIGNORED, oppure variabile d'ambiente).
// Iniettata come BuildConfig.OPENROUTER_API_KEY: l'app è già pronta per gli amici,
// ma chiunque può impostarne una propria dalle impostazioni (ha la precedenza).
val envFile = rootProject.file(".env")
val envProperties = Properties().apply {
    if (envFile.exists()) envFile.inputStream().use { load(it) }
}
val openRouterApiKey: String = (
    envProperties.getProperty("OPENROUTER_API_KEY")
        ?: System.getenv("OPENROUTER_API_KEY")
        ?: ""
).trim().replace("\\", "\\\\").replace("\"", "\\\"")

android {
    namespace = "it.wavestream.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "it.wavestream.app"
        minSdk = 26
        targetSdk = 34
        versionCode = 29
        versionName = "1.1.4"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        // Canale di aggiornamento (Firebase RTDB)
        buildConfigField("String", "RTDB_URL", "\"https://wavestream-d3972-default-rtdb.europe-west1.firebasedatabase.app\"")
        buildConfigField("String", "UPDATE_NODE", "\"app_update\"")

        // Chiave OpenRouter preconfigurata da .env (vuota se il file non esiste).
        buildConfigField("String", "OPENROUTER_API_KEY", "\"$openRouterApiKey\"")
    }

    signingConfigs {
        create("release") {
            if (keystorePropertiesFile.exists()) {
                storeFile = rootProject.file(keystoreProperties["storeFile"] as String)
                storePassword = keystoreProperties["storePassword"] as String
                keyAlias = keystoreProperties["keyAlias"] as String
                keyPassword = keystoreProperties["keyPassword"] as String
            }
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("release")

            // Fire TV / Android TV sono dispositivi ARM: includere le lib native x86/x86_64
            // (onnxruntime di sherpa-onnx + wg-go) aggiunge ~90 MB inutili all'APK e fa
            // fallire l'update in-place per spazio insufficiente. Debug resta multi-ABI
            // per supportare gli emulatori.
            ndk {
                abiFilters.clear()
                abiFilters += listOf("arm64-v8a", "armeabi-v7a")
            }
        }
    }
    compileOptions {
        // Nessun core library desugaring: minSdk 26 garantisce java.time,
        // java.util.stream e java.util.Optional nativi (Java 8+ API).
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }

    // L'APK di release mantiene il nome storico "WaveStream.apk".
    applicationVariants.all {
        val isRelease = name == "release"
        outputs.all {
            val output = this as? com.android.build.gradle.internal.api.BaseVariantOutputImpl ?: return@all
            if (isRelease) output.outputFileName = "WaveStream.apk"
        }
    }
}

dependencies {
    // Core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.core.splashscreen)

    // Baseline Profile — pre-compilation of hot paths for 30-50% faster startup
    implementation("androidx.profileinstaller:profileinstaller:1.3.1")

    // Leanback / TV
    implementation(libs.androidx.leanback)
    implementation(libs.androidx.leanback.paging)
    implementation(libs.androidx.leanback.preference)

    // Compose TV
    implementation(libs.compose.tv.foundation)
    implementation(libs.compose.tv.material)
    
    // Compose
    implementation(platform(libs.compose.bom))
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    implementation(libs.compose.material.icons)
    implementation(libs.compose.runtime)
    implementation(libs.compose.foundation)
    implementation(libs.activity.compose)
    implementation(libs.lifecycle.runtime.compose)
    implementation(libs.lifecycle.viewmodel.compose)
    implementation(libs.navigation.compose)

    // Media3 (ExoPlayer)
    implementation(libs.androidx.media3.exoplayer)
    implementation(libs.androidx.media3.exoplayer.hls)
    implementation(libs.androidx.media3.exoplayer.dash)
    implementation(libs.androidx.media3.ui)
    implementation(libs.androidx.media3.ui.leanback)
    implementation(libs.androidx.media3.session)
    implementation(libs.androidx.media3.datasource.okhttp)

    // Room
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.paging)
    ksp(libs.androidx.room.compiler)

    // DataStore
    implementation(libs.androidx.datastore.preferences)

    // WorkManager
    implementation(libs.androidx.work.runtime.ktx)

    // Paging 3 (FASE 4.5)
    implementation(libs.androidx.paging.runtime.ktx)
    implementation(libs.androidx.paging.compose)

    // Network / API
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.moshi)
    implementation(libs.retrofit.converter.gson)
    implementation(libs.okhttp)
    implementation(libs.okhttp.logging)
    implementation(libs.moshi)
    ksp(libs.moshi.codegen)
    implementation(libs.gson)

    // Image Loading (Coil only - unified cache)
    implementation(libs.coil)
    implementation(libs.coil.compose)

    // Hilt / DI
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.hilt.work)
    ksp(libs.hilt.work.compiler)
    implementation(libs.hilt.navigation.compose)

    // Firebase
    implementation(libs.firebase.database)

    // Security
    implementation(libs.security.crypto)

    // WireGuard (in-app VPN)
    implementation(libs.wireguard.tunnel)

    // NanoHTTPD (local HTTP relay for phone→TV VPN config transfer)
    implementation(libs.nanohttpd)

    // Coroutines
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)

    // Utils
    implementation(libs.zxing.core)

    // Nova voice — sherpa-onnx (TTS neurale on-device, licenza Apache 2.0)
    implementation(files("libs/sherpa-onnx-1.13.7.aar"))
    implementation("org.apache.commons:commons-compress:1.26.2")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}
