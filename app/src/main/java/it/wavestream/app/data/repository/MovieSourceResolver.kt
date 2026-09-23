package it.wavestream.app.data.repository

import it.wavestream.app.data.database.dao.StreamProviderDao
import it.wavestream.app.data.database.entity.Movie
import it.wavestream.app.data.database.entity.StreamProvider
import it.wavestream.app.data.parser.ContentNameParser
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Risolve le sorgenti riproducibili di un film unificato.
 *
 * Se il film ha sorgenti registrate le restituisce (già ordinate per qualità);
 * altrimenti crea una sorgente "sintetica" dai dati del [Movie] stesso, così il
 * playback funziona anche per i contenuti non ancora passati dall'unificazione
 * (es. M3U appena importati).
 */
@Singleton
class MovieSourceResolver @Inject constructor(
    private val streamProviderDao: StreamProviderDao,
    private val contentNameParser: ContentNameParser
) {

    suspend fun resolve(movie: Movie): List<StreamProvider> {
        val providers = streamProviderDao.getProvidersForMovieList(movie.id)
        if (providers.isNotEmpty()) return providers
        return listOf(synthetic(movie))
    }

    /** Registra che una sorgente è stata usata (per ordinarla per ultima scelta). */
    suspend fun markUsed(providerId: Long) {
        if (providerId > 0) runCatching { streamProviderDao.updateLastUsed(providerId) }
    }

    /**
     * Sorgente scelta l'ultima volta dall'utente, se ne esiste una.
     *
     * Serve al "Riprendi": riproporre il menu delle versioni a ogni ripresa non ha
     * senso, si riparte dalla versione già vista. Attenzione: la lista è ordinata per
     * qualità, quindi non basta prendere il primo elemento — va cercato il `lastUsedAt`
     * più recente.
     *
     * @return la sorgente usata più di recente, oppure null se l'utente non ha mai
     *         scelto (in quel caso il menu ha senso eccome).
     */
    fun lastUsedProvider(providers: List<StreamProvider>): StreamProvider? =
        providers.filter { it.lastUsedAt != null }.maxByOrNull { it.lastUsedAt ?: 0L }

    private fun synthetic(movie: Movie): StreamProvider {
        val quality = contentNameParser.detectQuality(movie.name)
        return StreamProvider(
            movieId = movie.id,
            playlistId = movie.playlistId,
            streamUrl = movie.streamUrl,
            originalName = movie.cleanName?.takeIf { it.isNotBlank() } ?: movie.name,
            category = movie.category,
            categoryId = movie.categoryId,
            xtreamStreamId = movie.xtreamStreamId,
            containerExtension = movie.containerExtension,
            logoUrl = movie.logoUrl,
            year = movie.year,
            quality = quality,
            qualityRank = contentNameParser.qualityRank(quality),
            resolution = contentNameParser.detectResolution(movie.name),
            durationSeconds = movie.duration,
            playlistOrder = movie.playlistOrder,
            isPrimary = true,
            addedAt = movie.addedAt
        )
    }
}
