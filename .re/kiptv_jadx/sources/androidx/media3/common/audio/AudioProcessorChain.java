package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessorChain {
    androidx.media3.common.PlaybackParameters applyPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters);

    boolean applySkipSilenceEnabled(boolean z6);

    androidx.media3.common.audio.AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long j);

    long getSkippedOutputFrameCount();
}
