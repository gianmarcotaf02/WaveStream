package it.wavestream.app.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Persistent session cache for HomeViewModel tab content.
 * Replaces in-memory ConcurrentHashMap to survive ViewModel recreation.
 * TTL: 30 minutes (enforced in ContentCache.get).
 */
@Entity(tableName = "home_session_cache")
data class HomeSessionCacheEntity(
    @PrimaryKey val key: String,
    val valueJson: String,
    val updatedAt: Long
)
