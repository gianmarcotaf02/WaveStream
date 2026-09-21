package R8;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements P8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f9092a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f9093b = new java.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.LinkedBlockingQueue f9094c = new java.util.concurrent.LinkedBlockingQueue();

    @Override // P8.a
    public final synchronized P8.b a(java.lang.String str) {
        R8.f fVar;
        fVar = (R8.f) this.f9093b.get(str);
        if (fVar == null) {
            fVar = new R8.f(str, this.f9094c, this.f9092a);
            this.f9093b.put(str, fVar);
        }
        return fVar;
    }
}
