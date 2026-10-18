package it.wavestream.app.data.api

import retrofit2.Response
import retrofit2.http.*

/**
 * OpenSubtitles REST API v1
 * https://api.opensubtitles.com/api/v1/
 */
interface OpenSubtitlesService {
    
    companion object {
        const val BASE_URL = "https://api.opensubtitles.com/api/v1/"
    }
    
    // ========== Authentication ==========
    
    @POST("login")
    suspend fun login(
        @Body request: LoginRequest
    ): Response<LoginResponse>
    
    @DELETE("logout")
    suspend fun logout(
        @Header("Authorization") token: String
    ): Response<Unit>
    
    // ========== Subtitles ==========
    
    @GET("subtitles")
    suspend fun searchSubtitles(
        @Header("Authorization") token: String,
        // Parametri dichiarati in ordine ALFABETICO: l'API applica una regola "canonical"
        // che altrimenti risponde 301 (con URL riscritto) su ogni ricerca, bruciando un
        // round-trip e, in certi casi, alterando i valori (es. la "•" di una query).
        @Query("episode_number") episodeNumber: Int? = null,
        @Query("imdb_id") imdbId: String? = null,
        @Query("languages") languages: String = "it,en", // Comma-separated
        @Query("order_by") orderBy: String = "download_count",
        @Query("order_direction") orderDirection: String = "desc",
        @Query(value = "query", encoded = true) query: String? = null,
        @Query("season_number") seasonNumber: Int? = null,
        @Query("tmdb_id") tmdbId: Int? = null,
        @Query("type") type: String? = null // "movie" or "episode"
    ): Response<SubtitleSearchResponse>
    
    @GET("subtitles/{subtitle_id}")
    suspend fun getSubtitleDetails(
        @Header("Authorization") token: String,
        @Path("subtitle_id") subtitleId: Int
    ): Response<SubtitleDetailsResponse>
    
    @POST("download")
    suspend fun downloadSubtitle(
        // null = download anonimo (quota per IP della Api-Key): usato come ripiego quando
        // il percorso autenticato non è disponibile. Retrofit omette l'header se è null.
        @Header("Authorization") token: String?,
        @Body request: DownloadRequest
    ): Response<DownloadResponse>
    
    // ========== User Info ==========
    
    @GET("infos/user")
    suspend fun getUserInfo(
        @Header("Authorization") token: String
    ): Response<UserInfoResponse>
}

// ========== Request Models ==========

data class LoginRequest(
    val username: String,
    val password: String
)

data class DownloadRequest(
    val file_id: Int,
    val sub_format: String = "srt" // or "webvtt"
)

// ========== Response Models ==========

data class LoginResponse(
    val user: User?,
    val base_url: String?,
    val token: String?,
    val status: Int?
)

data class User(
    val allowed_downloads: Int,
    val allowed_translations: Int,
    val level: String,
    val user_id: Int,
    val ext_installed: Boolean,
    val vip: Boolean
)

data class SubtitleSearchResponse(
    val total_pages: Int,
    val total_count: Int,
    val per_page: Int,
    val page: Int,
    val data: List<SubtitleResult>
)

data class SubtitleResult(
    val id: String,
    val type: String,
    val attributes: SubtitleAttributes
)

data class SubtitleAttributes(
    val subtitle_id: String,
    val language: String,
    val download_count: Int,
    val new_download_count: Int,
    val hearing_impaired: Boolean,
    val hd: Boolean,
    val fps: Double?,
    val votes: Int,
    val ratings: Double,
    val from_trusted: Boolean?,
    val foreign_parts_only: Boolean,
    val upload_date: String?,
    val ai_translated: Boolean,
    val machine_translated: Boolean,
    val release: String?,
    val comments: String?,
    val legacy_subtitle_id: Int?,
    val uploader: Uploader?,
    val feature_details: FeatureDetails?,
    val url: String?,
    val related_links: List<RelatedLink>?,
    val files: List<SubtitleFile>
)

data class Uploader(
    val uploader_id: Int?,
    val name: String?,
    val rank: String?
)

data class FeatureDetails(
    val feature_id: Int?,
    val feature_type: String?,
    val year: Int?,
    val title: String?,
    val movie_name: String?,
    val imdb_id: Int?,
    val tmdb_id: Int?,
    val season_number: Int?,
    val episode_number: Int?,
    val parent_imdb_id: Int?,
    val parent_title: String?,
    val parent_tmdb_id: Int?,
    val parent_feature_id: Int?
)

data class RelatedLink(
    val label: String?,
    val url: String?,
    val img_url: String?
)

data class SubtitleFile(
    val file_id: Int,
    val cd_number: Int?,
    val file_name: String?
)

data class SubtitleDetailsResponse(
    val data: SubtitleResult?
)

data class DownloadResponse(
    val link: String?,
    val file_name: String?,
    val requests: Int?,
    val remaining: Int?,
    val message: String?,
    val reset_time: String?,
    val reset_time_utc: String?
)

data class UserInfoResponse(
    val data: UserData?
)

data class UserData(
    val allowed_downloads: Int?,
    val allowed_translations: Int?,
    val level: String?,
    val user_id: Int?,
    val ext_installed: Boolean?,
    val vip: Boolean?,
    val downloads_count: Int?,
    val remaining_downloads: Int?
)
