package it.wavestream.app.data.database.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Serie A match from football-data.org, cached locally.
 * The hero on the Home screen shows every match in its "hero window"
 * (kickoff - 30 min → kickoff + 2h), one hero per match (simultaneous matches supported).
 */
@Entity(
    tableName = "serie_a_matches",
    indices = [Index("utcDateMillis")]
)
data class SerieAMatchEntity(
    @PrimaryKey val id: Long,                    // football-data.org match id
    val utcDateMillis: Long,                     // kickoff time (UTC millis)
    val status: String,                          // SCHEDULED / TIMED / IN_PLAY / PAUSED / FINISHED / POSTPONED / ...
    val matchday: Int? = null,
    val homeName: String,
    val homeShortName: String,
    val homeTla: String,
    val homeCrest: String? = null,               // crest URL from football-data.org
    val awayName: String,
    val awayShortName: String,
    val awayTla: String,
    val awayCrest: String? = null,
    val homeScore: Int? = null,                  // full-time score (only when available)
    val awayScore: Int? = null,
    val lastUpdated: Long = System.currentTimeMillis()
) {

    val isLive: Boolean get() = status in LIVE_STATUSES

    /** Hero window: starts 30 min before kickoff, ends 2h after kickoff. */
    fun isInHeroWindow(now: Long = System.currentTimeMillis()): Boolean {
        if (status == "POSTPONED" || status == "CANCELLED") return false
        val windowStart = utcDateMillis - HERO_WINDOW_BEFORE_MILLIS
        val windowEnd = utcDateMillis + HERO_WINDOW_AFTER_MILLIS
        return now in windowStart..windowEnd
    }

    companion object {
        val LIVE_STATUSES = setOf(
            "LIVE", "IN_PLAY", "PAUSED", "SUSPENDED"
        )

        const val HERO_WINDOW_BEFORE_MILLIS = 30L * 60 * 1000        // 30 min before kickoff
        const val HERO_WINDOW_AFTER_MILLIS = 2L * 60 * 60 * 1000     // 2h after kickoff
    }
}
