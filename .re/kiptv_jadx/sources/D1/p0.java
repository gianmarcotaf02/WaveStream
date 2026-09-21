package D1;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends D1.s0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.WindowInsets.Builder f2052c;

    public p0() {
        this.f2052c = D1.o0.h();
    }

    @Override // D1.s0
    public D1.E0 b() {
        a();
        D1.E0 e0C = D1.E0.c(null, this.f2052c.build());
        e0C.f1967a.r(this.f2056b);
        return e0C;
    }

    @Override // D1.s0
    public void d(p182w1.b bVar) {
        this.f2052c.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // D1.s0
    public void e(p182w1.b bVar) {
        this.f2052c.setStableInsets(bVar.d());
    }

    @Override // D1.s0
    public void f(p182w1.b bVar) {
        this.f2052c.setSystemGestureInsets(bVar.d());
    }

    @Override // D1.s0
    public void g(p182w1.b bVar) {
        this.f2052c.setSystemWindowInsets(bVar.d());
    }

    @Override // D1.s0
    public void h(p182w1.b bVar) {
        this.f2052c.setTappableElementInsets(bVar.d());
    }

    public p0(D1.E0 e6) {
        android.view.WindowInsets.Builder builderH;
        super(e6);
        android.view.WindowInsets windowInsetsB = e6.b();
        if (windowInsetsB != null) {
            builderH = D1.o0.i(windowInsetsB);
        } else {
            builderH = D1.o0.h();
        }
        this.f2052c = builderH;
    }
}
