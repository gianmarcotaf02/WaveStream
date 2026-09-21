package R7;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class b {

    public volatile int f9076a;

    static {
        AtomicIntegerFieldUpdater.newUpdater(b.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
    }

    public final String toString() {
        return String.valueOf(this.f9076a);
    }
}
