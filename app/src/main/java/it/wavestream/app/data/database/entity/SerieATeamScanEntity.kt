package it.wavestream.app.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Stato dell'ultima ricognizione "squadra → canali" della playlist.
 *
 * Serve a NON ripetere la ricerca ogni volta che si apre il match center: una
 * volta trovati, i canali di una squadra restano in cache e vengono riproposti
 * anche nelle partite successive. La ricognizione si rifà solo quando:
 *  - la squadra non è mai stata cercata;
 *  - la playlist è cambiata (`playlistFingerprint` diverso: nuovi canali, canali
 *    nascosti/mostrati, nomi di lunghezza diversa);
 *  - è scaduto il TTL di sicurezza (riallineamento periodico).
 *
 * [channelsCount] = quanti canali aveva trovato quella ricognizione. A 0
 * corrisponde "cercato, nessun canale per la squadra": senza questo valore una
 * squadra genuinamente senza canali verrebbe riscansita a ogni apertura.
 */
@Entity(tableName = "serie_a_team_scan")
data class SerieATeamScanEntity(
    @PrimaryKey val teamTla: String,
    /** Timestamp (ms) dell'ultima ricognizione per questa squadra. */
    val scannedAt: Long,
    /** Canali trovati in quell'ultima ricognizione (0 = nessuno). */
    val channelsCount: Int,
    /** Impronta del catalogo canali al momento della ricognizione. */
    val playlistFingerprint: String
)
