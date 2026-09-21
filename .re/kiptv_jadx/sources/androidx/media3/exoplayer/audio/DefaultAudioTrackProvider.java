package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class DefaultAudioTrackProvider implements androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider {
    private android.media.AudioAttributes getAudioTrackAttributes(androidx.media3.common.AudioAttributes audioAttributes, boolean z6) {
        return z6 ? getAudioTrackTunnelingAttributes() : audioAttributes.getPlatformAudioAttributes();
    }

    private android.media.AudioAttributes getAudioTrackTunnelingAttributes() {
        return new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void setOffloadedPlaybackV29(android.media.AudioTrack.Builder builder, boolean z6) {
        builder.setOffloadedPlayback(z6);
    }

    public android.media.AudioTrack.Builder customizeAudioTrackBuilder(android.media.AudioTrack.Builder builder) {
        return builder;
    }

    @Override // androidx.media3.exoplayer.audio.DefaultAudioSink.AudioTrackProvider
    public final android.media.AudioTrack getAudioTrack(androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig, androidx.media3.common.AudioAttributes audioAttributes, int i3, android.content.Context context) {
        android.media.AudioTrack.Builder sessionId = new android.media.AudioTrack.Builder().setAudioAttributes(getAudioTrackAttributes(audioAttributes, audioTrackConfig.tunneling)).setAudioFormat(androidx.media3.common.util.Util.getAudioFormat(audioTrackConfig.sampleRate, audioTrackConfig.channelConfig, audioTrackConfig.encoding)).setTransferMode(1).setBufferSizeInBytes(audioTrackConfig.bufferSize).setSessionId(i3);
        int i9 = android.os.Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            setOffloadedPlaybackV29(sessionId, audioTrackConfig.offload);
        }
        if (i9 >= 34 && context != null) {
            sessionId.setContext(context);
        }
        return customizeAudioTrackBuilder(sessionId).build();
    }
}
