package X7;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f10922a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(X7.j.class, java.lang.Object.class, "_cur$volatile");
    private volatile /* synthetic */ java.lang.Object _cur$volatile = new X7.l(8, false);

    public final boolean a(java.lang.Runnable runnable) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10922a;
            X7.l lVar = (X7.l) atomicReferenceFieldUpdater.get(this);
            int iA = lVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                X7.l lVarC = lVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10922a;
            X7.l lVar = (X7.l) atomicReferenceFieldUpdater.get(this);
            if (lVar.b()) {
                return;
            }
            X7.l lVarC = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }

    public final int c() {
        X7.l lVar = (X7.l) f10922a.get(this);
        lVar.getClass();
        long j = X7.l.f10925f.get(lVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final java.lang.Object d() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10922a;
            X7.l lVar = (X7.l) atomicReferenceFieldUpdater.get(this);
            java.lang.Object objD = lVar.d();
            if (objD != X7.l.g) {
                return objD;
            }
            X7.l lVarC = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVarC) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }
}
