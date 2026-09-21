package Z7;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f13056b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(Z7.m.class, java.lang.Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f13057c = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(Z7.m.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f13058d = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(Z7.m.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f13059e = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(Z7.m.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceArray f13060a = new java.util.concurrent.atomic.AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final Z7.i a(Z7.i iVar) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13057c;
        if (atomicIntegerFieldUpdater.get(this) - f13058d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f13048i) {
            f13059e.incrementAndGet(this);
        }
        int i3 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f13060a;
            if (atomicReferenceArray.get(i3) == null) {
                atomicReferenceArray.lazySet(i3, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            java.lang.Thread.yield();
        }
    }

    public final Z7.i b() {
        Z7.i iVar;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f13058d;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 - f13057c.get(this) == 0) {
                return null;
            }
            int i9 = i3 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 + 1) && (iVar = (Z7.i) this.f13060a.getAndSet(i9, null)) != null) {
                if (iVar.f13048i) {
                    f13059e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final Z7.i c(int i3, boolean z6) {
        int i9 = i3 & 127;
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.f13060a;
        Z7.i iVar = (Z7.i) atomicReferenceArray.get(i9);
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
