package it.wavestream.app.util

import android.util.Log
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Orologio corretto col server: molti TV box hanno il clock o il timezone
 * sballati, quindi ogni valutazione temporale sensibile (finestre hero,
 * countdown) usa [now] invece di System.currentTimeMillis().
 *
 * L'offset viene misurato dall'header HTTP `Date` (sempre in GMT) di QUALSIASI
 * risposta che transita per gli OkHttp client con [ServerClockInterceptor] —
 * così resta aggiornato a prescindere da quale API risponde.
 */
object ServerClock {

    @Volatile
    private var offsetMillis: Long = 0L

    /** Tempo corretto secondo i server API. */
    fun now(): Long = System.currentTimeMillis() + offsetMillis

    /** Aggiorna l'offset da un header `Date` HTTP. */
    fun updateFromHeader(dateHeader: String) {
        runCatching {
            val serverMillis = ZonedDateTime
                .parse(dateHeader, DateTimeFormatter.RFC_1123_DATE_TIME)
                .toInstant().toEpochMilli()
            val newOffset = serverMillis - System.currentTimeMillis()
            if (newOffset != offsetMillis) {
                Log.d("SerieA", "Server clock offset: ${newOffset / 1000}s (device vs server)")
                offsetMillis = newOffset
            }
        }
    }
}

/** Interceptor da aggiungere agli OkHttp client: aggiorna [ServerClock] a ogni risposta. */
class ServerClockInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        response.header("Date")?.let { ServerClock.updateFromHeader(it) }
        return response
    }
}
