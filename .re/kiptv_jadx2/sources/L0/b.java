package L0;

public final class b {

    public final d f7041a;

    public final d f7042b;

    public long f7043c;

    public b() {
        c cVar = c.f7044h;
        this.f7041a = new d();
        this.f7042b = new d();
    }

    public final void a(long j, long j9) {
        this.f7041a.a(j, Float.intBitsToFloat((int) (j9 >> 32)));
        this.f7042b.a(j, Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }
}
