package p179v4;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p179v4.h f29167b = new p179v4.h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f29168a = new java.util.concurrent.atomic.AtomicReference(new p179v4.n(new p005a5.R2(1)));

    public final java.lang.Class a(java.lang.Class cls) {
        java.util.HashMap map = ((p179v4.n) this.f29168a.get()).f29178b;
        if (map.containsKey(cls)) {
            return ((o4.m) map.get(cls)).a();
        }
        throw new java.security.GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public final synchronized void b(p179v4.l lVar) {
        p005a5.R2 r9 = new p005a5.R2((p179v4.n) this.f29168a.get());
        r9.b(lVar);
        this.f29168a.set(new p179v4.n(r9));
    }
}
