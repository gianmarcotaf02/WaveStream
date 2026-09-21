package X7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f10904h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(X7.b.class, java.lang.Object.class, "_next$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f10905i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(X7.b.class, java.lang.Object.class, "_prev$volatile");
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;

    public b(X7.q qVar) {
        this._prev$volatile = qVar;
    }

    public final void a() {
        f10905i.set(this, null);
    }

    public final X7.b c() {
        java.lang.Object obj = f10904h.get(this);
        if (obj == X7.a.f10898a) {
            return null;
        }
        return (X7.b) obj;
    }

    public abstract boolean d();

    public final void e() {
        X7.b bVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10905i;
            X7.b bVar = (X7.b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.d()) {
                bVar = (X7.b) atomicReferenceFieldUpdater.get(bVar);
            }
            X7.b bVarC2 = c();
            kotlin.jvm.internal.m.b(bVarC2);
            while (bVarC2.d() && (bVarC = bVarC2.c()) != null) {
                bVarC2 = bVarC;
            }
            while (true) {
                java.lang.Object obj = atomicReferenceFieldUpdater.get(bVarC2);
                X7.b bVar2 = ((X7.b) obj) == null ? null : bVar;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(bVarC2, obj, bVar2)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(bVarC2) != obj) {
                    }
                }
            }
            if (bVar != null) {
                f10904h.set(bVar, bVarC2);
            }
            if (!bVarC2.d() || bVarC2.c() == null) {
                if (bVar == null || !bVar.d()) {
                    return;
                }
            }
        }
    }
}
