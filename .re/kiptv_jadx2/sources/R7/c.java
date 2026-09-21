package R7;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class c {

    public volatile long f9077a;

    static {
        AtomicLongFieldUpdater.newUpdater(c.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY);
    }

    public final String toString() {
        return String.valueOf(this.f9077a);
    }
}
