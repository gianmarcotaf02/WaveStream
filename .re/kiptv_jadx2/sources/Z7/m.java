package Z7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class m {

    public static final AtomicReferenceFieldUpdater f13056b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    public static final AtomicIntegerFieldUpdater f13057c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    public static final AtomicIntegerFieldUpdater f13058d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    public static final AtomicIntegerFieldUpdater f13059e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    public final AtomicReferenceArray f13060a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer$volatile;
    private volatile int consumerIndex$volatile;
    private volatile Object lastScheduledTask$volatile;
    private volatile int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13057c;
        if (atomicIntegerFieldUpdater.get(this) - f13058d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f13048i) {
            f13059e.incrementAndGet(this);
        }
        int i3 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f13060a;
            if (atomicReferenceArray.get(i3) == null) {
                atomicReferenceArray.lazySet(i3, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13058d;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 - f13057c.get(this) == 0) {
                return null;
            }
            int i9 = i3 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 + 1) && (iVar = (i) this.f13060a.getAndSet(i9, null)) != null) {
                if (iVar.f13048i) {
                    f13059e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i3, boolean z6) {
        int i9 = i3 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f13060a;
        i iVar = (i) atomicReferenceArray.get(i9);
        if (iVar != null && iVar.f13048i == z6) {
            while (!atomicReferenceArray.compareAndSet(i9, iVar, null)) {
                if (atomicReferenceArray.get(i9) != iVar) {
                }
            }
            if (z6) {
                f13059e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
