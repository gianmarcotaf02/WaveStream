package it.wavestream.app.voice

import java.io.ByteArrayOutputStream

/**
 * Codifica PCM float (-1..1, 16kHz mono) in formato WAV 16-bit,
 * pronto per essere inviato come audio inline a Gemini.
 */
object WavEncoder {

    fun encodeToWav(pcm: FloatArray, sampleRate: Int = AudioRecorder.SAMPLE_RATE): ByteArray {
        val out = ByteArrayOutputStream(pcm.size * 2 + 44)

        fun writeLe16(v: Int) {
            out.write(v and 0xFF)
            out.write((v shr 8) and 0xFF)
        }
        fun writeLe32(v: Int) {
            out.write(v and 0xFF)
            out.write((v shr 8) and 0xFF)
            out.write((v shr 16) and 0xFF)
            out.write((v shr 24) and 0xFF)
        }

        val dataSize = pcm.size * 2

        // Header WAV
        out.write("RIFF".toByteArray(Charsets.US_ASCII))
        writeLe32(36 + dataSize) // chunk size
        out.write("WAVE".toByteArray(Charsets.US_ASCII))
        out.write("fmt ".toByteArray(Charsets.US_ASCII))
        writeLe32(16)            // fmt chunk size
        writeLe16(1)             // PCM
        writeLe16(1)             // mono
        writeLe32(sampleRate)
        writeLe32(sampleRate * 2) // byte rate = sampleRate * channels * 2
        writeLe16(2)             // block align
        writeLe16(16)            // bits per sample
        out.write("data".toByteArray(Charsets.US_ASCII))
        writeLe32(dataSize)

        // Dati PCM
        for (sample in pcm) {
            val s = (sample.coerceIn(-1f, 1f) * Short.MAX_VALUE).toInt()
            writeLe16(s)
        }

        return out.toByteArray()
    }
}
