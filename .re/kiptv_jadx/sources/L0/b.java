package L0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L0.d f7041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L0.d f7042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7043c;

    public b() {
        L0.c cVar = L0.c.f7044h;
        this.f7041a = new L0.d();
        this.f7042b = new L0.d();
    }

    public final void a(long j, long j9) {
        this.f7041a.a(j, java.lang.Float.intBitsToFloat((int) (j9 >> 32)));
        this.f7042b.a(j, java.lang.Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }
}
