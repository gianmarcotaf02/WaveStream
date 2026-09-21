package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends W7.AbstractC1010d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f10497a = new java.util.concurrent.atomic.AtomicReference(null);

    @Override // W7.AbstractC1010d
    public final boolean a(W7.AbstractC1008b abstractC1008b) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f10497a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(V7.r.f10509c);
        return true;
    }

    @Override // W7.AbstractC1010d
    public final p100l6.c[] b(W7.AbstractC1008b abstractC1008b) {
        this.f10497a.set(null);
        return W7.AbstractC1009c.f10730a;
    }
}
