package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.ListenerSet;

public final class a implements Runnable {

    public final int f16584h;

    public final Object f16585i;

    public a(int i3, Object obj) {
        this.f16584h = i3;
        this.f16585i = obj;
    }

    @Override
    public final void run() {
        switch (this.f16584h) {
            case 0:
                ((AudioCapabilitiesReceiver) this.f16585i).updateCurrentAudioCapabilities();
                break;
            case 1:
                AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$0((ListenerSet) this.f16585i);
                break;
            default:
                ((DefaultAudioSink) this.f16585i).maybeReportSkippedSilence();
                break;
        }
    }
}
