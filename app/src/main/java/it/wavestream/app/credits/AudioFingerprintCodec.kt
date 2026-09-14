package it.wavestream.app.credits

import java.nio.ByteBuffer
import java.nio.ByteOrder

/**
 * Fingerprint audio di un segmento: sequenza di vettori di bande spettrali normalizzate.
 *
 * @param bands numero di bande per frame (es. 16)
 * @param frames numero di frame
 * @param intervalMs intervallo tra due frame (es. 250 ms)
 * @param data bande appiattite, `frames * bands` float normalizzati a norma unitaria
 */
data class AudioFingerprint(
    val bands: Int,
    val frames: Int,
    val intervalMs: Int,
    val data: FloatArray
) {
    val durationMs: Long get() = frames.toLong() * intervalMs

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AudioFingerprint) return false
        return bands == other.bands && frames == other.frames &&
            intervalMs == other.intervalMs && data.contentEquals(other.data)
    }

    override fun hashCode(): Int {
        var result = bands
        result = 31 * result + frames
        result = 31 * result + intervalMs
        result = 31 * result + data.contentHashCode()
        return result
    }
}

/**
 * Serializzazione compatta: header (bands, frames, intervalMs) come int little-endian,
 * poi i float. Va salvata nel BLOB `media_segments.fingerprint`.
 */
object AudioFingerprintCodec {

    private const val HEADER_BYTES = 3 * 4

    fun encode(fp: AudioFingerprint): ByteArray {
        val from = fp.data.size - fp.frames * fp.bands
        val start = if (from > 0) from else 0
        val count = fp.frames * fp.bands
        val needsTrim = fp.data.size != count
        val bb = ByteBuffer.allocate(HEADER_BYTES + count * 4).order(ByteOrder.LITTLE_ENDIAN)
        bb.putInt(fp.bands)
        bb.putInt(fp.frames)
        bb.putInt(fp.intervalMs)
        var i = start
        val end = start + count
        while (i < end) {
            bb.putFloat(fp.data[i])
            i++
        }
        if (needsTrim) {
            // Nessun caso previsto: il chiamante passa sempre data coerente.
        }
        return bb.array()
    }

    fun decode(bytes: ByteArray?): AudioFingerprint? {
        if (bytes == null || bytes.size < HEADER_BYTES) return null
        return try {
            val bb = ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
            val bands = bb.getInt()
            val frames = bb.getInt()
            val intervalMs = bb.getInt()
            if (bands <= 0 || frames <= 0 || intervalMs <= 0) return null
            val total = bands * frames
            if (bytes.size < HEADER_BYTES + total * 4) return null
            val data = FloatArray(total) { bb.getFloat() }
            AudioFingerprint(bands, frames, intervalMs, data)
        } catch (_: Exception) {
            null
        }
    }
}
