package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import androidx.media3.exoplayer.CodecParameters;

public final class m implements Runnable {

    public final int f16605h;

    public final Object f16606i;
    public final Object j;

    public m(Object obj, Object obj2, int i3) {
        this.f16605h = i3;
        this.f16606i = obj;
        this.j = obj2;
    }

    @Override
    public final void run() {
        switch (this.f16605h) {
            case 0:
                ((AudioTrackAudioOutput.OnRoutingChangedListenerApi24) this.f16606i).lambda$onRoutingChanged$0((AudioDeviceInfo) this.j);
                break;
            case 1:
                ((AudioTrackAudioOutput.OnRoutingChangedListenerApi24) this.f16606i).lambda$onRoutingChanged$1((AudioRouting) this.j);
                break;
            case 2:
                ((AudioRendererEventListener.EventDispatcher) this.f16606i).lambda$audioCodecParametersChanged$13((CodecParameters) this.j);
                break;
            default:
                ((AudioRendererEventListener.EventDispatcher) this.f16606i).lambda$decoderReleased$5((String) this.j);
                break;
        }
    }
}
