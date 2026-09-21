package S7;

/* JADX INFO: renamed from: S7.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0887f0 extends S7.k0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9581m = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(S7.C0887f0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p194x6.j f9582l;

    public C0887f0(p194x6.j jVar) {
        this.f9582l = jVar;
    }

    @Override // S7.k0
    public final boolean i() {
        return true;
    }

    @Override // S7.k0
    public final void j(java.lang.Throwable th) {
        if (f9581m.compareAndSet(this, 0, 1)) {
            this.f9582l.invoke(th);
        }
    }
}
