package it.wavestream.app.vpn

import android.content.ContentUris
import android.content.Context
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import java.io.File

/**
 * Risultato di una ricerca: un file .conf trovato sulla TV.
 * Può essere accessibile via percorso (File) e/o via MediaStore (Uri).
 */
data class FoundConfig(
    val displayName: String,
    val source: String,
    val uri: Uri?,
    val file: File?
)

/**
 * Cerca file `.conf` sulla memoria della TV.
 *
 * Pensato per importare la config VPN trasferita sulla TV con app tipo
 * "Send Files to TV" o scaricata da browser: il file finisce tipicamente
 * nella cartella Download o in quella dell'app di trasferimento.
 *
 * Strategia (nessun permesso runtime richiesto):
 *  1. Query a MediaStore.Downloads (Android 11+ accessibile senza permessi)
 *  2. Query a MediaStore.Files (fallback generico)
 *  3. Scansione diretta di cartelle note (funziona su Android ≤ 10 / storage legacy)
 */
object VpnConfigFinder {

    private val KNOWN_DIRS = listOf(
        "/storage/emulated/0/Download",
        "/storage/emulated/0/Downloads",
        "/storage/emulated/0/",
        "/sdcard/Download",
        "/sdcard/Downloads",
        // Send Files to TV (com.yorimoto.sendfilestotv)
        "/storage/emulated/0/Android/data/com.yorimoto.sendfilestotv/files",
        "/storage/emulated/0/Android/data/com.yorimoto.sendfilestotv/files/Download",
        "/storage/emulated/0/SendFilestoTV"
    )

    fun findConfigFiles(context: Context): List<FoundConfig> {
        val results = LinkedHashMap<String, FoundConfig>()

        // 1) MediaStore.Downloads (solo API 29+; su API < 29 la classe non esiste)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            try {
                queryMediaStore(context, MediaStore.Downloads.EXTERNAL_CONTENT_URI, results)
            } catch (_: Throwable) {
            }
        }

        // 2) MediaStore.Files (fallback)
        try {
            queryMediaStore(context, MediaStore.Files.getContentUri("external"), results)
        } catch (_: Throwable) {
        }

        // 3) Scansione diretta
        for (dirPath in KNOWN_DIRS) {
            val dir = File(dirPath)
            if (!dir.exists() || !dir.isDirectory) continue
            val files = dir.listFiles() ?: continue
            for (f in files) {
                if (f.isFile && f.name.lowercase().endsWith(".conf")) {
                    results[f.absolutePath] = FoundConfig(
                        displayName = f.name,
                        source = dirPath,
                        uri = null,
                        file = f
                    )
                }
            }
        }

        return results.values.toList()
    }

    private fun queryMediaStore(
        context: Context,
        uri: Uri,
        results: MutableMap<String, FoundConfig>
    ) {
        val projection = arrayOf(
            MediaStore.Files.FileColumns._ID,
            MediaStore.Files.FileColumns.DISPLAY_NAME,
            MediaStore.Files.FileColumns.DATA
        )
        val selection = "${MediaStore.Files.FileColumns.DISPLAY_NAME} LIKE ?"
        val args = arrayOf("%.conf")
        context.contentResolver.query(uri, projection, selection, args, null)?.use { cursor ->
            val idCol = cursor.getColumnIndexOrThrow(MediaStore.Files.FileColumns._ID)
            val nameCol = cursor.getColumnIndexOrThrow(MediaStore.Files.FileColumns.DISPLAY_NAME)
            val dataCol = cursor.getColumnIndexOrThrow(MediaStore.Files.FileColumns.DATA)
            while (cursor.moveToNext()) {
                val id = cursor.getLong(idCol)
                val name = cursor.getString(nameCol) ?: continue
                val path = cursor.getString(dataCol)
                val itemUri = ContentUris.withAppendedId(uri, id)
                val key = path ?: itemUri.toString()
                if (results.containsKey(key)) continue
                results[key] = FoundConfig(
                    displayName = name,
                    source = path ?: "MediaStore",
                    uri = itemUri,
                    file = path?.let { File(it) }
                )
            }
        }
    }

    /** Legge il contenuto del file selezionato (prova percorso diretto, poi MediaStore). */
    fun readConfig(context: Context, found: FoundConfig): String? {
        return try {
            val file = found.file
            if (file != null && file.exists() && file.canRead()) {
                file.readText()
            } else if (found.uri != null) {
                context.contentResolver.openInputStream(found.uri)
                    ?.bufferedReader()?.use { it.readText() }
            } else {
                null
            }
        } catch (_: Throwable) {
            null
        }
    }
}
