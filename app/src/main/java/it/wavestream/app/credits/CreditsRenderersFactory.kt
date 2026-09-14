package it.wavestream.app.credits

import android.content.Context
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.DefaultRenderersFactory
import androidx.media3.exoplayer.audio.AudioSink
import androidx.media3.exoplayer.audio.DefaultAudioSink
import androidx.media3.exoplayer.audio.TeeAudioProcessor

/**
 * RenderersFactory che inserisce un [TeeAudioProcessor] nella catena audio di Media3.
 *
 * Il tee è un pass-through: copia ogni buffer PCM verso un sink passivo (il
 * [CreditsAudioMonitor]) senza alterare l'audio riprodotto. Tutto il lavoro pesante
 * (FFT, RMS, ...) avviene su un worker separato, mai sul thread di playback.
 */
@UnstableApi
class CreditsRenderersFactory(
    context: Context,
    private val audioBufferSink: TeeAudioProcessor.AudioBufferSink
) : DefaultRenderersFactory(context) {

    override fun buildAudioSink(
        context: Context,
        enableFloatOutput: Boolean,
        enableAudioTrackPlaybackParams: Boolean
    ): AudioSink? {
        return DefaultAudioSink.Builder(context)
            .setEnableFloatOutput(enableFloatOutput)
            .setEnableAudioTrackPlaybackParams(enableAudioTrackPlaybackParams)
            .setAudioProcessors(arrayOf(TeeAudioProcessor(audioBufferSink)))
            .build()
    }
}
