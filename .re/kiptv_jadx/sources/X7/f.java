package X7;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends S7.L implements p117n6.d, p100l6.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f10909o = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(X7.f.class, java.lang.Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final S7.AbstractC0906w f10910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p117n6.c f10911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.lang.Object f10912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.Object f10913n;

    public f(S7.AbstractC0906w abstractC0906w, p117n6.c cVar) {
        super(-1);
        this.f10910k = abstractC0906w;
        this.f10911l = cVar;
        this.f10912m = X7.a.f10899b;
        this.f10913n = X7.a.m(cVar.getContext());
    }

    @Override // p117n6.d
    public final p117n6.d getCallerFrame() {
        return this.f10911l;
    }

    @Override // p100l6.c
    public final p100l6.h getContext() {
        return this.f10911l.getContext();
    }

    @Override // S7.L
    public final java.lang.Object h() {
        java.lang.Object obj = this.f10912m;
        this.f10912m = X7.a.f10899b;
        return obj;
    }

    @Override // p100l6.c
    public final void resumeWith(java.lang.Object obj) throws S7.J {
        java.lang.Throwable thA = p070h6.n.a(obj);
        java.lang.Object c0903t = thA == null ? obj : new S7.C0903t(thA, false);
        p117n6.c cVar = this.f10911l;
        p100l6.h context = cVar.getContext();
        S7.AbstractC0906w abstractC0906w = this.f10910k;
        if (X7.a.j(abstractC0906w, context)) {
            this.f10912m = c0903t;
            this.j = 0;
            X7.a.i(abstractC0906w, cVar.getContext(), this);
            return;
        }
        S7.X xA = S7.z0.a();
        if (xA.f9563i >= 4294967296L) {
            this.f10912m = c0903t;
            this.j = 0;
            xA.a0(this);
            return;
        }
        xA.c0(true);
        try {
            p100l6.h context2 = cVar.getContext();
            java.lang.Object objN = X7.a.n(context2, this.f10913n);
            try {
                cVar.resumeWith(obj);
                X7.a.g(context2, objN);
                while (xA.e0()) {
                }
            } catch (java.lang.Throwable th) {
                X7.a.g(context2, objN);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                f(th2);
            } finally {
                xA.Z(true);
            }
        }
    }

    public final java.lang.String toString() {
        return "DispatchedContinuation[" + this.f10910k + ", " + S7.C.H(this.f10911l) + ']';
    }

    @Override // S7.L
    public final p100l6.c c() {
        return this;
    }
}
