package R7;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class a {

    public volatile int f9075a;

    static {
        AtomicIntegerFieldUpdater.newUpdater(a.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
    }

    public final String toString() {
        return String.valueOf(this.f9075a != 0);
    }
}
