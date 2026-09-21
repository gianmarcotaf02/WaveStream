package R7;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d {

    public static final AtomicReferenceFieldUpdater f9078b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, CmcdData.OBJECT_TYPE_AUDIO_ONLY);

    public volatile Object f9079a;

    public final boolean a(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f9078b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == obj);
        return false;
    }

    public final String toString() {
        return String.valueOf(this.f9079a);
    }
}
