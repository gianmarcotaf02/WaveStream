package it.wavestream.app.data.entity

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PersonInfo(
    val id: Int,
    val name: String,
    val character: String? = null,
    val job: String? = null,
    val profilePath: String? = null
) {
    val profileUrl: String?
        get() = profilePath?.let { "https://image.tmdb.org/t/p/w185$it" }

    val roleLabel: String?
        get() = character ?: job
}

object PersonInfoParser {
    fun parse(jsonArray: String?): List<PersonInfo> {
        if (jsonArray.isNullOrEmpty()) return emptyList()
        return try {
            val array = org.json.JSONArray(jsonArray)
            (0 until array.length()).map { i ->
                val obj = array.getJSONObject(i)
                PersonInfo(
                    id = obj.optInt("id"),
                    name = obj.optString("name"),
                    character = obj.optString("character", "").takeIf { it.isNotEmpty() },
                    job = obj.optString("job", "").takeIf { it.isNotEmpty() },
                    profilePath = obj.optString("profile_path", "").takeIf { it.isNotEmpty() }
                )
            }
        } catch (e: Exception) {
            emptyList()
        }
    }
}
