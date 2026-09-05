package it.wavestream.app.data.database.entity

import androidx.room.Entity

/**
 * Mapping persistente squadra → canali che la trasmettono. Salvato automaticamente
 * dopo ogni ricerca per alias: alla successiva apertura della schermata partita i
 * canali sono immediatamente disponibili senza nuova ricerca, e il salvataggio si
 * auto-aggiorna quando la playlist cambia (nuovi canali col nome squadra entrano,
 * quelli rimossi escono). Chiave composita (squadra + stream URL): gli stream URL
 * sono stabili tra i refresh playlist.
 */
@Entity(
    tableName = "serie_a_team_channels",
    primaryKeys = ["teamTla", "channelStreamUrl"]
)
data class SerieATeamChannelEntity(
    val teamTla: String,                 // es. "INT"
    val channelStreamUrl: String,        // url dello stream (stabile)
    val teamShortName: String = "",      // es. "Inter" (informativo)
    val channelName: String = "",        // nome canale al momento del salvataggio
    val savedAt: Long = System.currentTimeMillis()
)
