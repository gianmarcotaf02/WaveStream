package S7;

/* JADX INFO: renamed from: S7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0880c extends S7.k0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9569o = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(S7.C0880c.class, java.lang.Object.class, "_disposer$volatile");
    private volatile /* synthetic */ java.lang.Object _disposer$volatile;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final S7.C0895k f9570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public S7.O f9571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S7.C0884e f9572n;

    public C0880c(S7.C0884e c0884e, S7.C0895k c0895k) {
        this.f9572n = c0884e;
        this.f9570l = c0895k;
    }

    @Override // S7.k0
    public final boolean i() {
        return false;
    }

    @Override // S7.k0
    public final void j(java.lang.Throwable th) throws S7.J {
        S7.C0895k c0895k = this.f9570l;
        if (th != null) {
            c0895k.getClass();
            N6.A aC = c0895k.C(new S7.C0903t(th, false), null);
            if (aC != null) {
                c0895k.o(aC);
                S7.C0882d c0882d = (S7.C0882d) f9569o.get(this);
                if (c0882d != null) {
                    c0882d.a();
                    return;
                }
                return;
            }
            return;
        }
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = S7.C0884e.f9575b;
        S7.C0884e c0884e = this.f9572n;
        if (atomicIntegerFieldUpdater.decrementAndGet(c0884e) == 0) {
            S7.F[] fArr = c0884e.f9576a;
            java.util.ArrayList arrayList = new java.util.ArrayList(fArr.length);
            for (S7.F f9 : fArr) {
                arrayList.add(f9.i());
            }
            c0895k.resumeWith(arrayList);
        }
    }
}
