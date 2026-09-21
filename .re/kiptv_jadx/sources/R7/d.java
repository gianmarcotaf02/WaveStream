package R7;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9078b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(R7.d.class, java.lang.Object.class, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f9079a;

    public final boolean a(java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f9078b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(this) == obj);
        return false;
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.f9079a);
    }
}
