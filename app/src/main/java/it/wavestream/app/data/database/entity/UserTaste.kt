package it.wavestream.app.data.database.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "user_taste",
    foreignKeys = [
        ForeignKey(
            entity = Profile::class,
            parentColumns = ["id"],
            childColumns = ["profileId"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index("profileId"), Index("profileId", "contentType", "status")]
)
data class UserTaste(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val profileId: Long,
    val contentType: ContentType,
    val tmdbId: Int,
    val title: String,
    val posterPath: String?,
    val year: Int?,
    val status: TasteStatus,
    val addedAt: Long = System.currentTimeMillis()
)
