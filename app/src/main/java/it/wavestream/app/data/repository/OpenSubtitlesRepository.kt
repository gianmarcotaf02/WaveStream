package it.wavestream.app.data.repository

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import dagger.hilt.android.qualifiers.ApplicationContext
import it.wavestream.app.BuildConfig
import it.wavestream.app.data.api.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONObject
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.io.FileOutputStream
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

/**
 * OpenSubtitles Repository
 * Handles authentication, search, and download of subtitles
 */
@Singleton
class OpenSubtitlesRepository @Inject constructor(
    @ApplicationContext private val context: Context
) {
    companion object {
        private const val TAG = "OpenSubtitles"
        private const val PREFS_NAME = "opensubtitles_secure"
        private const val KEY_TOKEN = "auth_token"
        private const val KEY_USERNAME = "username"
        private const val KEY_PASSWORD = "password"  // Stored securely encrypted
        private const val KEY_USER_ID = "user_id"
        private const val KEY_VIP = "is_vip"
        private const val KEY_REMAINING = "remaining_downloads"
        private const val KEY_TOKEN_EXPIRY = "token_expiry"
        private const val KEY_BASE_URL = "api_base_url"
        private const val KEY_AUTH_FAILED = "auth_failed"

        /** Intervallo minimo tra due richieste generiche (il limite API e' 5/s per IP). */
        private const val REQUEST_MIN_INTERVAL_MS = 250L

        /** /login ha un limite suo: 1 richiesta al secondo, ed e' un'operazione "expensive". */
        private const val LOGIN_MIN_INTERVAL_MS = 1_000L

        /**
         * User-Agent descrittivo: OpenSubtitles richiede "NomeApp vX.Y.Z". Le default
         * delle librerie (es. "okhttp/4") vengono bloccate dal gateway.
         */
        private val USER_AGENT: String = "WaveStream v${BuildConfig.VERSION_NAME}"

        /**
         * Chiave del consumer OpenSubtitles, iniettata a build time da `.env`
         * (app/build.gradle.kts -> BuildConfig.OPENSUBTITLES_API_KEY).
         * E' obbligatoria su OGNI chiamata: senza, l'API risponde 403
         * {"message":"You cannot consume this service"} anche sul login.
         */
        private val API_KEY: String = BuildConfig.OPENSUBTITLES_API_KEY.trim()

        private const val CACHE_DIR = "subtitles"
        private const val MAX_CACHE_SIZE = 50 * 1024 * 1024L // 50MB

        /** Tentativi di richiesta del link di download prima di arrendersi (vedi 503 sotto). */
        private const val DOWNLOAD_LINK_ATTEMPTS = 3

        /** Ripetizioni di una richiesta quando il server risponde 429 (rate limit). */
        private const val RATE_LIMIT_ATTEMPTS = 3

        /**
         * Formati richiedibili a OpenSubtitles, in ordine di preferenza (i supportati sono
         * srt, sub, mpl, webvtt, dfxp, txt). webvtt è il ripiego perché Media3 lo legge
         * nativamente come l'srt.
         */
        private val DOWNLOAD_FORMATS = listOf("srt", "webvtt")
    }
    
    private val httpClient: OkHttpClient
    private val encryptedPrefs by lazy { createEncryptedPrefs() }

    /**
     * Host del gateway API. Resta OpenSubtitlesService.BASE_URL finché non si fa login: la
     * risposta di /login può restituire un `base_url` diverso (per i VIP
     * vip-api.opensubtitles.com) e i doc impongono di proseguire su quell'host, altrimenti i
     * JWT non vengono accettati. Persistito in prefs per sopravvivere al riavvio.
     */
    @Volatile private var cachedBaseUrl: String? = null
    @Volatile private var cachedApi: OpenSubtitlesService? = null

    // Rate limiting
    private var lastRequestTime = 0L

    /**
     * Finestra di attesa imposta dall'ultimo 429: il gateway dice per quanto tempo ancora
     * (header `ratelimit-reset`, in secondi) non accetta richieste, quindi ci si allinea a
     * quello invece di indovinare un backoff.
     */
    @Volatile private var rateLimitUntilMs = 0L
    
    init {
        val logging = HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }
        
        // OpenSubtitles esige `Api-Key` (consumer key) e uno User-Agent descrittivo su ogni
        // chiamata; senza la key risponde 403 "You cannot consume this service" anche sul
        // login. E serve `Accept`, altrimenti POST /download risponde 503 (vedi requestHost).
        // La key viene aggiunta solo verso gli host API: i link dei file di download
        // puntano a CDN di terze parti e non devono riceverla.
        httpClient = OkHttpClient.Builder()
            .addInterceptor { chain ->
                val request = chain.request()
                val builder = request.newBuilder().addHeader("User-Agent", USER_AGENT)

                if (isOpenSubtitlesApiHost(request.url.host)) {
                    builder.header("Accept", "application/json")
                    builder.addHeader("Content-Type", "application/json")
                    // Il gateway legge lo User-Agent anche da X-User-Agent (l'unico dei due
                    // esposto in access-control-allow-headers). Mandarli entrambi evita i
                    // 403 intermittenti segnalati da altri integratori.
                    builder.addHeader("X-User-Agent", USER_AGENT)
                    if (API_KEY.isNotBlank()) builder.addHeader("Api-Key", API_KEY)
                }

                chain.proceed(builder.build())
            }
            .addInterceptor(logging)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    // ========== API client (base_url dinamico) ==========

    private fun currentBaseUrl(): String =
        cachedBaseUrl ?: secureGetString(KEY_BASE_URL) ?: OpenSubtitlesService.BASE_URL

    /**
     * Client Retrofit corrente. Viene ricostruito solo quando cambia l'host, cioè alla prima
     * chiamata dopo un login che ne ha restituito uno diverso dal default.
     */
    private fun api(): OpenSubtitlesService {
        cachedApi?.let { if (cachedBaseUrl == currentBaseUrl()) return it }

        return synchronized(this) {
            val base = currentBaseUrl()
            cachedApi?.let { if (cachedBaseUrl == base) return it }

            Retrofit.Builder()
                .baseUrl(base)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(OpenSubtitlesService::class.java)
                .also {
                    Log.d(TAG, "Client OpenSubtitles su $base")
                    cachedApi = it
                    cachedBaseUrl = base
                }
        }
    }

    /**
     * Adotta il `base_url` restituito da /login. Ignorato se manca o se non è un host
     * OpenSubtitles: meglio restare sul default che puntare a un host sconosciuto.
     */
    private fun adoptBaseUrl(rawBaseUrl: String?) {
        val url = rawBaseUrl?.trim()?.toHttpUrlOrNull() ?: return
        if (!isOpenSubtitlesApiHost(url.host)) return

        val base = "${url.scheme}://${url.host}/api/v1/"
        if (base == currentBaseUrl()) return

        Log.d(TAG, "base_url del gateway aggiornato a $base")
        cachedBaseUrl = base
        cachedApi = null
        securePut { putString(KEY_BASE_URL, base) }
    }

    private fun isOpenSubtitlesApiHost(host: String): Boolean =
        host == "api.opensubtitles.com" || host == "vip-api.opensubtitles.com"

    /**
     * Traduce il body d'errore JSON ({"message":"..."}) in un messaggio mostrabile: prima
     * finiva direttamente in UI il JSON grezzo, `request_id` compreso.
     */
    private fun apiErrorMessage(code: Int, raw: String?, fallback: String): String {
        val apiMessage = raw?.let { body ->
            runCatching { JSONObject(body).optString("message").takeIf { it.isNotBlank() } }
                .getOrNull()
        }

        return when {
            code == 401 -> apiMessage ?: "Username o password non validi"
            code == 403 && apiMessage?.contains("consume this service", ignoreCase = true) == true ->
                "Chiave API OpenSubtitles non abilitata per questo servizio " +
                    "(consumer da sistemare nella pagina API consumers)."
            code == 403 -> apiMessage ?: "Accesso negato (HTTP 403)"
            code == 404 -> "Risorsa non trovata"
            code == 406 -> apiMessage ?: "Quota di download esaurita"
            code == 429 -> "Troppe richieste a OpenSubtitles: riprova tra qualche secondo"
            code >= 500 -> "Server OpenSubtitles non disponibile (HTTP $code)"
            apiMessage != null -> apiMessage
            !raw.isNullOrBlank() -> raw.trim().take(200)
            else -> fallback
        }
    }
    
    private fun createEncryptedPrefs(): SharedPreferences {
        return try {
            EncryptedSharedPreferences.create(
                context,
                PREFS_NAME,
                MasterKey.Builder(context)
                    .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                    .build(),
                EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
            )
        } catch (e: Throwable) {
            // Catch Throwable (not just Exception) because R8/Tink failures can
            // surface as VerifyError / NoClassDefFoundError on release builds.
            Log.w(TAG, "Encrypted prefs unavailable, falling back to plain storage", e)
            context.getSharedPreferences(PREFS_NAME + "_plain", Context.MODE_PRIVATE)
        }
    }

    private fun secureGetString(key: String, default: String? = null): String? = try {
        encryptedPrefs.getString(key, default)
    } catch (e: Throwable) {
        Log.w(TAG, "Failed to read $key", e); default
    }

    private fun secureGetInt(key: String, default: Int = 0): Int = try {
        encryptedPrefs.getInt(key, default)
    } catch (e: Throwable) {
        Log.w(TAG, "Failed to read $key", e); default
    }

    private fun secureGetLong(key: String, default: Long = 0L): Long = try {
        encryptedPrefs.getLong(key, default)
    } catch (e: Throwable) {
        Log.w(TAG, "Failed to read $key", e); default
    }

    private fun secureGetBoolean(key: String, default: Boolean = false): Boolean = try {
        encryptedPrefs.getBoolean(key, default)
    } catch (e: Throwable) {
        Log.w(TAG, "Failed to read $key", e); default
    }

    private fun securePut(block: SharedPreferences.Editor.() -> Unit) {
        try {
            encryptedPrefs.edit().apply { block(); apply() }
        } catch (e: Throwable) {
            Log.w(TAG, "Failed to write preferences", e)
        }
    }
    
    // ========== Authentication ==========
    
    sealed class AuthResult {
        data class Success(val username: String, val remainingDownloads: Int) : AuthResult()
        data class Error(val message: String) : AuthResult()
    }
    
    suspend fun login(username: String, password: String): AuthResult = withContext(Dispatchers.IO) {
        try {
            // Tentativo manuale: azzera il blocco dei tentativi automatici (vedi KEY_AUTH_FAILED).
            securePut { putBoolean(KEY_AUTH_FAILED, false) }

            val response = withRateLimitRetry(LOGIN_MIN_INTERVAL_MS) {
                api().login(LoginRequest(username, password))
            }
            
            if (response.isSuccessful && response.body()?.token != null) {
                val body = response.body()!!
                val token = body.token!!

                // Il gateway può rispondere con un host dedicato (VIP): va adottato subito,
                // altrimenti le chiamate successive userebbero quello sbagliato.
                adoptBaseUrl(body.base_url)

                // Save credentials including password for auto-refresh
                securePut {
                    putString(KEY_TOKEN, token)
                    putString(KEY_USERNAME, username)
                    putString(KEY_PASSWORD, password)
                    putInt(KEY_USER_ID, body.user?.user_id ?: 0)
                    putBoolean(KEY_VIP, body.user?.vip ?: false)
                    putInt(KEY_REMAINING, body.user?.allowed_downloads ?: 0)
                    putLong(KEY_TOKEN_EXPIRY, System.currentTimeMillis() + 24 * 60 * 60 * 1000)
                }
                
                AuthResult.Success(
                    username = username,
                    remainingDownloads = body.user?.allowed_downloads ?: 0
                )
            } else {
                AuthResult.Error(
                    apiErrorMessage(response.code(), response.errorBody()?.string(), "Credenziali errate")
                )
            }
        } catch (e: Exception) {
            Log.e(TAG, "Login failed", e)
            AuthResult.Error("Connessione fallita: ${e.message}")
        }
    }
    
    suspend fun logout(): Boolean = withContext(Dispatchers.IO) {
        try {
            val token = getToken() ?: return@withContext true
            api().logout("Bearer $token")
            clearCredentials()
            true
        } catch (e: Exception) {
            Log.e(TAG, "Logout failed", e)
            clearCredentials()
            true
        }
    }
    
    fun isAuthenticated(): Boolean {
        val token = secureGetString(KEY_TOKEN)
        val expiry = secureGetLong(KEY_TOKEN_EXPIRY)
        val hasCredentials = secureGetString(KEY_PASSWORD) != null
        return token != null && (System.currentTimeMillis() < expiry || hasCredentials)
    }
    
    /**
     * Check if token needs refresh and refresh it automatically
     * Call this before making API requests
     */
    private suspend fun ensureValidToken(): Boolean {
        val token = secureGetString(KEY_TOKEN)
        val expiry = secureGetLong(KEY_TOKEN_EXPIRY)
        
        if (token != null && System.currentTimeMillis() < expiry) {
            return true
        }

        // Credenziali già rifiutate con 401: non ritentare. OpenSubtitles limita i tentativi
        // di login (10 in 24h) e li conta: ritentare a ogni ricerca esaurirebbe il budget
        // senza che l'utente se ne accorga. Si sblocca solo con un login manuale riuscito.
        if (secureGetBoolean(KEY_AUTH_FAILED, false)) {
            Log.w(TAG, "Login automatico sospeso: credenziali rifiutate in precedenza")
            return false
        }
        
        val username = secureGetString(KEY_USERNAME)
        val password = secureGetString(KEY_PASSWORD)
        
        if (username != null && password != null) {
            Log.d(TAG, "Token expired, auto-refreshing...")
            val result = loginInternal(username, password)
            return result is AuthResult.Success
        }
        
        return false
    }
    
    /**
     * Internal login without saving password (used for refresh)
     */
    private suspend fun loginInternal(username: String, password: String): AuthResult = withContext(Dispatchers.IO) {
        try {
            val response = withRateLimitRetry(LOGIN_MIN_INTERVAL_MS) {
                api().login(LoginRequest(username, password))
            }
            
            if (response.isSuccessful && response.body()?.token != null) {
                val body = response.body()!!
                val token = body.token!!

                adoptBaseUrl(body.base_url)

                // Update token and expiry
                securePut {
                    putString(KEY_TOKEN, token)
                    putInt(KEY_USER_ID, body.user?.user_id ?: 0)
                    putBoolean(KEY_VIP, body.user?.vip ?: false)
                    putInt(KEY_REMAINING, body.user?.allowed_downloads ?: 0)
                    putLong(KEY_TOKEN_EXPIRY, System.currentTimeMillis() + 24 * 60 * 60 * 1000)
                }
                
                Log.d(TAG, "Token refreshed successfully")
                AuthResult.Success(
                    username = username,
                    remainingDownloads = body.user?.allowed_downloads ?: 0
                )
            } else {
                Log.w(TAG, "Auto-refresh fallito: HTTP ${response.code()} ${response.errorBody()?.string()}")
                if (response.code() == 401) {
                    // Credenziali non più valide: stop ai tentativi automatici.
                    securePut { putBoolean(KEY_AUTH_FAILED, true) }
                }
                AuthResult.Error("Auto-refresh fallito")
            }
        } catch (e: Exception) {
            Log.e(TAG, "Token refresh failed", e)
            AuthResult.Error("Refresh failed: ${e.message}")
        }
    }
    
    fun getUsername(): String? = secureGetString(KEY_USERNAME)
    
    fun getRemainingDownloads(): Int = secureGetInt(KEY_REMAINING)
    
    private fun getToken(): String? = secureGetString(KEY_TOKEN)
    
    private fun clearCredentials() {
        securePut { clear() }
    }
    
    // ========== Subtitle Search ==========
    
    sealed class SearchResult {
        data class Success(val subtitles: List<SubtitleInfo>) : SearchResult()
        data class Error(val message: String) : SearchResult()
    }
    
    data class SubtitleInfo(
        val id: String,
        val fileId: Int,
        val language: String,
        val languageCode: String,
        val rating: Double,
        val downloadCount: Int,
        val release: String?,
        val fileName: String?,
        val isHearingImpaired: Boolean,
        val isHD: Boolean,
        val uploaderName: String?,
        /** fps dichiarati dalla release: un valore diverso da quello del video = deriva. */
        val fps: Double?
    )
    
    suspend fun searchSubtitles(
        query: String? = null,
        imdbId: String? = null,
        tmdbId: Int? = null,
        language: String = "it,en",
        type: String? = null,
        season: Int? = null,
        episode: Int? = null
    ): SearchResult = withContext(Dispatchers.IO) {
        try {
            // Auto-refresh token if needed
            if (!ensureValidToken()) {
                return@withContext SearchResult.Error("Non autenticato")
            }
            
            val token = getToken() ?: return@withContext SearchResult.Error("Non autenticato")
            
            val response = withRateLimitRetry {
                api().searchSubtitles(
                    token = "Bearer $token",
                    query = normalizeSearchQuery(query),
                    imdbId = imdbId?.trim()?.removePrefix("tt"),
                    tmdbId = tmdbId,
                    languages = language,
                    type = type,
                    seasonNumber = season,
                    episodeNumber = episode
                )
            }
            
            if (response.isSuccessful) {
                val results = response.body()?.data?.mapNotNull { result ->
                    val attr = result.attributes
                    val file = attr.files.firstOrNull() ?: return@mapNotNull null
                    
                    SubtitleInfo(
                        id = result.id,
                        fileId = file.file_id,
                        language = getLanguageName(attr.language),
                        languageCode = attr.language,
                        rating = attr.ratings,
                        downloadCount = attr.download_count,
                        release = attr.release,
                        fileName = file.file_name,
                        isHearingImpaired = attr.hearing_impaired,
                        isHD = attr.hd,
                        uploaderName = attr.uploader?.name,
                        fps = attr.fps
                    )
                } ?: emptyList()
                
                SearchResult.Success(results)
            } else {
                SearchResult.Error(
                    apiErrorMessage(response.code(), response.errorBody()?.string(), "Ricerca fallita")
                )
            }
        } catch (e: Exception) {
            Log.e(TAG, "Search failed", e)
            SearchResult.Error("Errore di connessione: ${e.message}")
        }
    }
    
    // ========== Subtitle Download ==========
    
    sealed class DownloadResult {
        data class Success(val filePath: String) : DownloadResult()
        data class Error(val message: String) : DownloadResult()
        object LimitReached : DownloadResult()
    }
    
    suspend fun downloadSubtitle(
        fileId: Int,
        contentTitle: String
    ): DownloadResult = withContext(Dispatchers.IO) {
        try {
            // Auto-refresh token if needed
            if (!ensureValidToken()) {
                return@withContext DownloadResult.Error("Non autenticato")
            }
            
            val token = getToken() ?: return@withContext DownloadResult.Error("Non autenticato")
            
            // Link + formato effettivamente concesso (srt, con eventuale ripiego su webvtt).
            val (response, subFormat) = requestDownloadLink(fileId, token)
            
            if (response.isSuccessful) {
                val body = response.body()!!
                
                // Update remaining downloads
                body.remaining?.let { remaining ->
                    securePut { putInt(KEY_REMAINING, remaining) }
                }
                
                // Check if limit reached
                if (body.remaining == 0 && body.link == null) {
                    return@withContext DownloadResult.LimitReached
                }
                
                val downloadUrl = body.link ?: return@withContext DownloadResult.Error(
                    "Link non disponibile" + (body.message?.let { ": $it" } ?: "")
                )
                
                // Download file
                val fileName = sanitizeFileName(contentTitle) + "_${fileId}.${formatExtension(subFormat)}"
                val cacheDir = File(context.cacheDir, CACHE_DIR)
                cacheDir.mkdirs()
                
                cleanCacheIfNeeded(cacheDir)
                
                val outputFile = File(cacheDir, fileName)
                
                // Use OkHttp to download — handles gzip transparently via Content-Encoding
                val downloadRequest = Request.Builder()
                    .url(downloadUrl)
                    .addHeader("User-Agent", USER_AGENT)
                    .build()
                
                httpClient.newCall(downloadRequest).execute().use { downloadResponse ->
                    if (!downloadResponse.isSuccessful) {
                        // Il link punta al CDN (www.opensubtitles.com/download/...): un 4xx qui
                        // non dipende dalla Api-Key ma dal file o dalla quota lato CDN.
                        // Logghiamo anche l'host: serve a distinguere un problema del CDN da
                        // uno di rete dell'app.
                        Log.e(
                            TAG,
                            "Download del file fallito: HTTP ${downloadResponse.code} " +
                                "host=${downloadResponse.request.url.host} fileId=$fileId"
                        )
                        return@withContext DownloadResult.Error(
                            "Download non riuscito (HTTP ${downloadResponse.code}): " +
                                downloadHttpHint(downloadResponse.code)
                        )
                    }
                    downloadResponse.body?.byteStream()?.use { input ->
                        FileOutputStream(outputFile).use { output ->
                            input.copyTo(output)
                        }
                    } ?: return@withContext DownloadResult.Error("Body download vuoto")
                }
                
                DownloadResult.Success(outputFile.absolutePath)
            } else {
                val errorBody = response.errorBody()?.string()
                // 406 + "download limit" è la risposta documentata per quota esaurita,
                // 429 copre il rate limit del gateway.
                if (response.code() == 406 ||
                    response.code() == 429 ||
                    errorBody?.contains("download limit", ignoreCase = true) == true
                ) {
                    DownloadResult.LimitReached
                } else {
                    DownloadResult.Error(apiErrorMessage(response.code(), errorBody, "Download fallito"))
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Download failed", e)
            DownloadResult.Error("Errore download: ${e.message}")
        }
    }
    
    // ========== Cache Management ==========
    
    fun getCachedSubtitle(contentTitle: String): File? {
        val cacheDir = File(context.cacheDir, CACHE_DIR)
        val sanitized = sanitizeFileName(contentTitle)
        return cacheDir.listFiles()?.find { it.name.startsWith(sanitized) }
    }
    
    fun getCachedSubtitles(): List<File> {
        val cacheDir = File(context.cacheDir, CACHE_DIR)
        return cacheDir.listFiles()?.toList() ?: emptyList()
    }
    
    private fun cleanCacheIfNeeded(cacheDir: File) {
        val files = cacheDir.listFiles() ?: return
        var totalSize = files.sumOf { it.length() }
        
        if (totalSize > MAX_CACHE_SIZE) {
            // Delete oldest files first
            files.sortedBy { it.lastModified() }.forEach { file ->
                if (totalSize > MAX_CACHE_SIZE * 0.7) {
                    totalSize -= file.length()
                    file.delete()
                }
            }
        }
    }
    
    /**
     * Normalizza la query per l'endpoint /subtitles.
     *
     * L'API applica una regola "canonical" (header `X-OS-Rule: canonical`) e risponde 301
     * riscrivendo l'URL quando la query contiene spazi codificati come %20, maiuscole o
     * caratteri non ASCII; nella riscrittura può danneggiare i byte (la "•" di
     * "Dexter • Album di famiglia" diventava %95, e la richiesta successiva tornava 400,
     * che l'app mostrava come "Nessun sottotitolo trovato").
     *
     * Quindi: minuscole, via i segni diacritici, via i simboli, spazi come "+" (i doc
     * chiedono "+" al posto di %20). Il risultato è già codificato perché la @Query in
     * OpenSubtitlesService è dichiarata `encoded = true`.
     */
    private fun normalizeSearchQuery(raw: String?): String? {
        val base = raw?.trim()?.takeIf { it.isNotEmpty() } ?: return null

        // "Città" -> "citta", "Amélie" -> "amelie": evita che i byte accentati finiscano
        // nella riscrittura dell'URL, dove vengono corrotti.
        val withoutAccents = java.text.Normalizer
            .normalize(base, java.text.Normalizer.Form.NFD)
            .replace(Regex("\\p{Mn}+"), "")

        val asciiOnly = withoutAccents
            .lowercase()
            .replace(Regex("[^a-z0-9]+"), " ")
            .trim()

        return if (asciiOnly.isEmpty()) null
        else java.net.URLEncoder.encode(asciiOnly, "UTF-8") // gli spazi diventano "+"
    }

    /**
     * Estensione del file per un formato OpenSubtitles: `webvtt` non è un'estensione,
     * il file è `.vtt` — ed è l'estensione a decidere il MIME in `SubtitleManager`.
     */
    private fun formatExtension(format: String): String =
        if (format.equals("webvtt", ignoreCase = true)) "vtt" else format

    private fun sanitizeFileName(name: String): String {
        return name.replace(Regex("[^a-zA-Z0-9._-]"), "_").take(50)
    }

    /**
     * Spiegazione del codice HTTP restituito dal CDN di OpenSubtitles quando il link
     * del sottotitolo non è scaricabile: senza questo, in UI arrivava solo "HTTP 404"
     * e non si capiva se fosse quota, file rimosso o blocco.
     */
    private fun downloadHttpHint(code: Int): String = when (code) {
        401, 403 -> "accesso al file negato dal CDN, scegli un altro sottotitolo"
        404 -> "file non più disponibile: scegli un altro sottotitolo"
        406, 429 -> "quota di download esaurita per oggi"
        in 500..599 -> "servizio OpenSubtitles momentaneamente non disponibile"
        else -> "riprova o scegli un altro sottotitolo"
    }
    
    // ========== Helpers ==========
    
    /**
     * Richiede il link di download con due livelli di difesa.
     *
     * 1. Retry sui 5xx: il nodo che serve quel file può essere momentaneamente giù e
     *    OpenSubtitles risponde 503 con una pagina HTML ("Error 503 - Service Temporarily
     *    Unavailable ... high traffic or performing maintenance"). Verificato sul campo: lo
     *    stesso file_id ha dato 503 e poi 200 a distanza di un minuto.
     * 2. Fallback di formato: se l'srt viene rifiutato con un errore definitivo che non sia
     *    quota (406) o autenticazione (401/403/429), si riprova con webvtt invece di far
     *    fallire il download.
     *
     * @return la risposta e il formato effettivamente richiesto (serve per l'estensione del
     *         file: l'estensione decide il MIME con cui Media3 carica il sottotitolo).
     */
    private suspend fun requestDownloadLink(
        fileId: Int,
        token: String
    ): Pair<Response<DownloadResponse>, String> {
        var lastResponse: Response<DownloadResponse>? = null

        for (format in DOWNLOAD_FORMATS) {
            val (authenticated, authServerError) = attemptDownloadLink(fileId, "Bearer $token", format)
            lastResponse = authenticated

            if (authenticated.isSuccessful) return authenticated to format

            // Quota o credenziali non si risolvono cambiando formato né modalità.
            if (isFinalOutcome(authenticated)) return authenticated to format

            if (authServerError) {
                // Il percorso autenticato è indisponibile (5xx su più backend, con la pagina
                // HTML "Error 503 ... high traffic or performing maintenance"). La stessa
                // richiesta senza Authorization viene invece accettata: si ripiega sul
                // download anonimo, che usa la quota per IP della Api-Key. Verificato sul
                // campo: con JWT 503 su ogni tentativo, senza JWT 200.
                Log.w(
                    TAG,
                    "Percorso autenticato non disponibile (HTTP ${authenticated.code()}): " +
                        "riprovo senza Authorization (fileId=$fileId)"
                )

                val (anonymous, anonServerError) = attemptDownloadLink(fileId, null, format)
                lastResponse = anonymous

                if (anonymous.isSuccessful) return anonymous to format
                if (isFinalOutcome(anonymous) || anonServerError) return anonymous to format

                Log.w(
                    TAG,
                    "Link download ($format, anonimo) rifiutato: HTTP ${anonymous.code()} " +
                        "(fileId=$fileId) — provo un altro formato"
                )
                continue
            }

            // Errore definitivo che non è quota né autenticazione: probabile formato non
            // disponibile per quel file.
            Log.w(
                TAG,
                "Link download ($format) rifiutato: HTTP ${authenticated.code()} " +
                    "(fileId=$fileId) — provo un altro formato"
            )
        }

        return lastResponse!! to DOWNLOAD_FORMATS.last()
    }

    /** Esito che non ha senso ritentare in nessun modo (quota esaurita o credenziali). */
    private fun isFinalOutcome(response: Response<DownloadResponse>): Boolean =
        response.code() == 401 || response.code() == 403 ||
            response.code() == 406 || response.code() == 429

    /**
     * Tenta di ottenere il link per un singolo formato, con retry sui 5xx.
     *
     * @param authHeader header Authorization da usare, oppure null per il download anonimo.
     * @return la risposta e true se i tentativi si sono esauriti su un errore di server.
     */
    private suspend fun attemptDownloadLink(
        fileId: Int,
        authHeader: String?,
        format: String
    ): Pair<Response<DownloadResponse>, Boolean> {
        var response: Response<DownloadResponse>? = null
        var serverError = false
        var attempt = 0
        val mode = if (authHeader == null) "anonimo" else "autenticato"

        while (attempt < DOWNLOAD_LINK_ATTEMPTS) {
            if (attempt > 0) kotlinx.coroutines.delay(1_500L * attempt)

            response = withRateLimitRetry {
                api().downloadSubtitle(
                    token = authHeader,
                    request = DownloadRequest(file_id = fileId, sub_format = format)
                )
            }

            if (response.isSuccessful) return response to false

            if (response.code() in 500..599) {
                serverError = true
                Log.w(
                    TAG,
                    "Link download ($format, $mode): HTTP ${response.code()} " +
                        "(tentativo ${attempt + 1}/$DOWNLOAD_LINK_ATTEMPTS, fileId=$fileId)"
                )
                attempt++
                continue
            }

            return response to false
        }

        return response!! to serverError
    }

    /**
     * Esegue una richiesta rispettando i limiti dichiarati dal server: sul 429 legge
     * `ratelimit-reset` (secondi alla riapertura della finestra) e riprova, invece di
     * fallire o martellare a intervalli inventati.
     */
    private suspend fun <T> withRateLimitRetry(
        minIntervalMs: Long = REQUEST_MIN_INTERVAL_MS,
        block: suspend () -> Response<T>
    ): Response<T> {
        var attempt = 0

        while (true) {
            enforceRateLimit(minIntervalMs)
            val response = block()

            if (response.code() != 429 || attempt >= RATE_LIMIT_ATTEMPTS - 1) return response

            rememberRateLimit(response.headers())
            attempt++
        }
    }

    /** Legge dagli header per quanto tempo il gateway non accetta richieste. */
    private fun rememberRateLimit(headers: okhttp3.Headers) {
        val resetSeconds = headers["ratelimit-reset"]?.toLongOrNull()
        val window = (resetSeconds ?: 1L).coerceIn(1L, 60L)
        rateLimitUntilMs = System.currentTimeMillis() + window * 1000L
        Log.w(
            TAG,
            "Rate limit raggiunto (HTTP 429): attendo ${window}s " +
                "(ratelimit-limit=${headers["ratelimit-limit"] ?: "-"})"
        )
    }

    private suspend fun enforceRateLimit(minIntervalMs: Long = REQUEST_MIN_INTERVAL_MS) {
        // Prima l'eventuale finestra imposta dal server (429), poi il ritmo minimo locale.
        val cooldown = rateLimitUntilMs - System.currentTimeMillis()
        if (cooldown > 0) {
            kotlinx.coroutines.delay(cooldown)
        }

        val elapsed = System.currentTimeMillis() - lastRequestTime
        if (elapsed < minIntervalMs) {
            kotlinx.coroutines.delay(minIntervalMs - elapsed)
        }
        lastRequestTime = System.currentTimeMillis()
    }
    
    private fun getLanguageName(code: String): String {
        return when (code.lowercase()) {
            "it" -> "Italiano"
            "en" -> "English"
            "es" -> "Español"
            "fr" -> "Français"
            "de" -> "Deutsch"
            "pt" -> "Português"
            "ru" -> "Русский"
            "ja" -> "日本語"
            "ko" -> "한국어"
            "zh" -> "中文"
            else -> code.uppercase()
        }
    }
}

