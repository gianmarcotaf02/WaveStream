package Y1;

/* JADX INFO: loaded from: classes.dex */
public final class q extends E8.l implements androidx.lifecycle.k0, p019c.v, p165t2.e, Y1.H {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.google.android.gms.auth.api.signin.internal.SignInHubActivity f11336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.google.android.gms.auth.api.signin.internal.SignInHubActivity f11337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final android.os.Handler f11338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Y1.D f11339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.auth.api.signin.internal.SignInHubActivity f11340v;

    public q(com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity) {
        this.f11340v = signInHubActivity;
        android.os.Handler handler = new android.os.Handler();
        this.f11339u = new Y1.D();
        this.f11336r = signInHubActivity;
        this.f11337s = signInHubActivity;
        this.f11338t = handler;
    }

    @Override // E8.l
    public final android.view.View F(int i3) {
        return this.f11340v.findViewById(i3);
    }

    @Override // E8.l
    public final boolean G() {
        android.view.Window window = this.f11340v.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p019c.v
    public final p019c.u a() {
        return this.f11340v.a();
    }

    @Override // androidx.lifecycle.k0
    public final androidx.lifecycle.j0 e() {
        return this.f11340v.e();
    }

    @Override // p165t2.e
    public final p079i7.f g() {
        return (p079i7.f) this.f11340v.f18051k.j;
    }

    @Override // androidx.lifecycle.InterfaceC1540w
    public final androidx.lifecycle.AbstractC1534p getLifecycle() {
        return this.f11340v.f18609C;
    }

    @Override // Y1.H
    public final void b() {
    }
}
