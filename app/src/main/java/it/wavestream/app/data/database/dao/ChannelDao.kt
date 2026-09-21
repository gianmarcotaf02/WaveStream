package it.wavestream.app.data.database.dao

import androidx.room.*
import it.wavestream.app.data.database.entity.Channel
import kotlinx.coroutines.flow.Flow

@Dao
interface ChannelDao {
    
    @Query("SELECT * FROM channels WHERE isHidden = 0 ORDER BY displayOrder, name")
    fun getAllChannels(): Flow<List<Channel>>
    
    @Query("SELECT * FROM channels WHERE isHidden = 0 ORDER BY displayOrder, name")
    suspend fun getAllChannelsList(): List<Channel>
    
    @Query("SELECT * FROM channels WHERE playlistId = :playlistId AND isHidden = 0 ORDER BY displayOrder, name")
    fun getChannelsByPlaylist(playlistId: Long): Flow<List<Channel>>

    @Query("SELECT * FROM channels WHERE playlistId = :playlistId ORDER BY displayOrder, name")
    suspend fun getAllByPlaylistIncludingHidden(playlistId: Long): List<Channel>
    
    @Query("SELECT * FROM channels WHERE category = :category AND isHidden = 0 ORDER BY displayOrder, name")
    fun getChannelsByCategory(category: String): Flow<List<Channel>>
    
    @Query("SELECT * FROM channels WHERE category = :category AND isHidden = 0 ORDER BY displayOrder, name")
    suspend fun getChannelsByCategoryList(category: String): List<Channel>
    
    @Query("SELECT category FROM channels WHERE category IS NOT NULL AND isHidden = 0 GROUP BY category ORDER BY MIN(id)")
    fun getCategories(): Flow<List<String>>
    
    @Query("SELECT category FROM channels WHERE category IS NOT NULL AND isHidden = 0 GROUP BY category ORDER BY MIN(id)")
    suspend fun getCategoriesList(): List<String>
    
    @Query("SELECT * FROM channels WHERE id = :id")
    suspend fun getChannelById(id: Long): Channel?
    
    @Query("SELECT * FROM channels WHERE id IN (:ids) AND isHidden = 0")
    suspend fun getChannelsByIds(ids: List<Long>): List<Channel>

    /** Canali per URL di stream: evita di caricare in memoria l'intera playlist
     *  quando servono solo i canali già mappati a una squadra. */
    @Query("SELECT * FROM channels WHERE streamUrl IN (:urls) AND isHidden = 0")
    suspend fun getChannelsByStreamUrls(urls: List<String>): List<Channel>

    /** Canali "DAZN 1" delle categorie evento (DAZN HERMES/KALI): il nome del
     *  canale non contiene la squadra, quindi il matching per alias non li
     *  troverebbe mai. Vanno sempre proposti per le partite di Serie A.
     *  Il pattern esclude i canali con un numero diverso dietro (es. DAZN 10/11),
     *  perché non sono il canale evento. */
    @Query(
        "SELECT * FROM channels WHERE isHidden = 0 " +
            "AND LOWER(name) LIKE '%dazn 1%' AND LOWER(name) NOT GLOB '*dazn 1[0-9]*' " +
            "AND (LOWER(category) LIKE '%dazn hermes%' OR LOWER(category) LIKE '%dazn kali%')"
    )
    suspend fun getDaznEventChannels(): List<Channel>
    
    // LIMIT 200 — vedi la nota in MovieDao.searchMovies. I canali sono spesso
    // decine di migliaia: senza limite la query corta trascinava tutto il catalogo.
    @Query("SELECT * FROM channels WHERE name LIKE '%' || :query || '%' AND isHidden = 0 ORDER BY name LIMIT 200")
    suspend fun searchChannels(query: String): List<Channel>
    
    @Query("SELECT * FROM channels WHERE name LIKE '%' || :query || '%' AND isHidden = 0 ORDER BY name")
    fun searchChannelsFlow(query: String): Flow<List<Channel>>

    @Query("SELECT * FROM channels WHERE isHidden = 0 ORDER BY name")
    fun pagingChannels(): androidx.paging.PagingSource<Int, Channel>

    @Query("SELECT * FROM channels WHERE (name LIKE '%' || :query1 || '%' OR name LIKE '%' || :query2 || '%') AND isHidden = 0 ORDER BY name")
    suspend fun searchChannelsDual(query1: String, query2: String): List<Channel>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(channel: Channel): Long
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(channels: List<Channel>)
    
    @Update
    suspend fun update(channel: Channel)

    @Update
    suspend fun updateList(channels: List<Channel>)

    @Delete
    suspend fun delete(channel: Channel)

    @Delete
    suspend fun deleteList(channels: List<Channel>)
    
    @Query("DELETE FROM channels WHERE playlistId = :playlistId")
    suspend fun deleteByPlaylist(playlistId: Long)
    
    @Query("SELECT COUNT(*) FROM channels WHERE playlistId = :playlistId")
    suspend fun getCountByPlaylist(playlistId: Long): Int
    
    @Query("UPDATE channels SET isHidden = :hidden WHERE id = :id")
    suspend fun setHidden(id: Long, hidden: Boolean)
    
    @Query("""
        SELECT category as name, COUNT(*) as count 
        FROM channels 
        WHERE category IS NOT NULL AND isHidden = 0 
        GROUP BY category 
        ORDER BY MIN(id)
    """)
    suspend fun getCategoriesWithCount(): List<CategoryWithCount>
}


