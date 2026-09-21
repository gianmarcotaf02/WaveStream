package Q8;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements P8.b, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f8715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public R8.f f8716i;
    public java.util.concurrent.LinkedBlockingQueue j;

    @Override // P8.b
    public final boolean a() {
        return true;
    }

    @Override // P8.b
    public final boolean b() {
        return true;
    }

    @Override // P8.b
    public final void c(java.lang.String str, java.lang.Throwable th) {
        k(1);
    }

    @Override // P8.b
    public final boolean d() {
        return true;
    }

    @Override // P8.b
    public final boolean e() {
        return true;
    }

    @Override // P8.b
    public final boolean f() {
        return true;
    }

    @Override // P8.b
    public final void g(java.lang.String str) {
        k(3);
    }

    @Override // P8.b
    public final java.lang.String getName() {
        return this.f8715h;
    }

    @Override // P8.b
    public final void h(java.lang.String str) {
        k(2);
    }

    @Override // P8.b
    public final void i(java.lang.String str) {
        k(5);
    }

    public final void k(int i3) {
        Q8.b bVar = new Q8.b();
        java.lang.System.currentTimeMillis();
        bVar.f8717a = i3;
        bVar.f8718b = this.f8716i;
        java.lang.Thread.currentThread().getName();
        this.j.add(bVar);
    }
}
