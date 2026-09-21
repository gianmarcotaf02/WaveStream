package v;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f29011a = new java.util.concurrent.atomic.AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p028c8.d f29012b = new p028c8.d();

    public static final void a(v.s0 s0Var, v.p0 p0Var) {
        while (true) {
            java.util.concurrent.atomic.AtomicReference atomicReference = s0Var.f29011a;
            v.p0 p0Var2 = (v.p0) atomicReference.get();
            if (p0Var2 != null && p0Var.f28981a.compareTo(p0Var2.f28981a) < 0) {
                throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
            }
            do {
                if (atomicReference.compareAndSet(p0Var2, p0Var)) {
                    if (p0Var2 != null) {
                        p0Var2.f28982b.e(new v.o0("Mutation interrupted", 0));
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == p0Var2);
        }
    }
}
