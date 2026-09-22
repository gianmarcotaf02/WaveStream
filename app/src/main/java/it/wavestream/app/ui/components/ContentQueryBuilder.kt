package it.wavestream.app.ui.components

/**
 * Costruisce le query SQL dinamiche per l'ordinamento e i filtri delle
 * categorie Film/Serie. Room non supporta ORDER BY dinamico con @Query,
 * quindi usiamo @RawQuery + [androidx.sqlite.db.SimpleSQLiteQuery].
 *
 * I segnaposto `?` e la lista [Sql.args] sono costruiti insieme per restare
 * sempre allineati.
 */
object ContentQueryBuilder {

    /** Query SQL + argomenti posizionali. */
    data class Sql(val sql: String, val args: List<Any?>)

    /**
     * Voto per l'ordinamento/filtro "Voto TMDB": TMDB quando disponibile,
     * con fallback sul voto della playlist/IMDB per i titoli non ancora arricchiti.
     */
    private const val RATING_EXPR =
        "COALESCE(NULLIF(tmdbVoteAverage, 0), " +
            "CAST(NULLIF(xtreamRating, '') AS REAL), " +
            "CAST(NULLIF(omdbImdbRating, '') AS REAL), 0)"

    fun movies(
        category: String?,
        state: SortFilterState,
        limit: Int? = null,
        offset: Int? = null
    ): Sql = build(
        table = "movies",
        titleExpr = "LTRIM(COALESCE(NULLIF(tmdbTitle, ''), name), ' -.:|_#*[]()')",
        // L'anno della playlist (estratto dal nome) ha la precedenza: è il dato atteso
        // dall'utente per "Data di uscita". Fallback sulla data TMDB, poi 0000.
        releaseExpr = "COALESCE(CASE WHEN year IS NULL THEN NULL ELSE printf('%04d-01-01', year) END, " +
            "NULLIF(tmdbReleaseDate, ''), '0000-00-00')",
        ratingExpr = RATING_EXPR,
        category = category,
        state = state,
        limit = limit,
        offset = offset,
        count = false
    )

    fun moviesCount(category: String?, state: SortFilterState): Sql = build(
        table = "movies",
        titleExpr = "",
        releaseExpr = "",
        ratingExpr = "",
        category = category,
        state = state,
        limit = null,
        offset = null,
        count = true
    )

    fun series(
        category: String?,
        state: SortFilterState,
        limit: Int? = null,
        offset: Int? = null
    ): Sql = build(
        table = "series",
        titleExpr = "LTRIM(COALESCE(NULLIF(tmdbName, ''), name), ' -.:|_#*[]()')",
        // Vedi movies(): precedenza all'anno della playlist.
        releaseExpr = "COALESCE(CASE WHEN year IS NULL THEN NULL ELSE printf('%04d-01-01', year) END, " +
            "NULLIF(tmdbFirstAirDate, ''), '0000-00-00')",
        ratingExpr = RATING_EXPR,
        category = category,
        state = state,
        limit = limit,
        offset = offset,
        count = false
    )

    fun seriesCount(category: String?, state: SortFilterState): Sql = build(
        table = "series",
        titleExpr = "",
        releaseExpr = "",
        ratingExpr = "",
        category = category,
        state = state,
        limit = null,
        offset = null,
        count = true
    )

    private fun build(
        table: String,
        titleExpr: String,
        releaseExpr: String,
        ratingExpr: String,
        category: String?,
        state: SortFilterState,
        limit: Int?,
        offset: Int?,
        count: Boolean
    ): Sql {
        val args = mutableListOf<Any?>()
        val sql = StringBuilder()

        sql.append(if (count) "SELECT COUNT(*) FROM " else "SELECT * FROM ")
        sql.append(table)
        sql.append(" WHERE isHidden = 0")

        // Filtro categorie: se l'utente ha selezionato una o più categorie (checkbox)
        // hanno la precedenza; altrimenti si usa la categoria singola della sidebar.
        val selectedCategories = state.filter.categories.toList()
        when {
            selectedCategories.size == 1 -> {
                // Il film può comparire nella categoria primaria (colonna) oppure
                // come appartenenza aggiuntiva (movie_categories).
                sql.append(" AND (category = ? OR id IN (SELECT movieId FROM movie_categories WHERE category = ?))")
                args.add(selectedCategories[0])
                args.add(selectedCategories[0])
            }
            selectedCategories.size > 1 -> {
                val placeholders = selectedCategories.joinToString(",") { "?" }
                sql.append(" AND (category IN (").append(placeholders)
                    .append(") OR id IN (SELECT movieId FROM movie_categories WHERE category IN (")
                    .append(placeholders).append(")))")
                selectedCategories.forEach { args.add(it) }
                selectedCategories.forEach { args.add(it) }
            }
            category != null -> {
                sql.append(" AND (category = ? OR id IN (SELECT movieId FROM movie_categories WHERE category = ?))")
                args.add(category)
                args.add(category)
            }
        }

        state.filter.yearFrom?.let {
            sql.append(" AND year IS NOT NULL AND year >= ?")
            args.add(it)
        }
        state.filter.yearTo?.let {
            sql.append(" AND year IS NOT NULL AND year <= ?")
            args.add(it)
        }
        state.filter.minRating?.let {
            sql.append(" AND ").append(RATING_EXPR).append(" >= ?")
            args.add(it.toDouble())
        }

        if (!count) {
            val orderExpr = when (state.sortField) {
                ContentSortField.RELEASE_DATE -> releaseExpr
                ContentSortField.ALPHABETICAL -> titleExpr
                ContentSortField.TMDB_RATING -> ratingExpr
            }
            val direction = if (state.direction == SortDirection.ASC) "ASC" else "DESC"
            sql.append(" ORDER BY ")
            if (state.sortField == ContentSortField.ALPHABETICAL) {
                // I nomi vuoti / ridotti a soli prefissi (" - ", ecc.) vanno in fondo,
                // prima dell'ordinamento alfabetico che ignora i prefissi.
                sql.append("(CASE WHEN TRIM(").append(orderExpr).append(") = '' THEN 1 ELSE 0 END) ASC, ")
                    .append(orderExpr).append(' ').append(direction)
            } else {
                sql.append(orderExpr).append(' ').append(direction)
            }
            // Tie-breaker stabile per paginazione coerente.
            sql.append(", name COLLATE NOCASE ASC")

            if (limit != null) {
                sql.append(" LIMIT ?")
                args.add(limit)
            }
            if (offset != null) {
                sql.append(" OFFSET ?")
                args.add(offset)
            }
        }

        return Sql(sql.toString(), args)
    }
}
