package D1;

/* JADX INFO: renamed from: D1.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0216c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f2000a;

    public C0216c0(android.view.View view) {
        this.f2000a = new java.lang.ref.WeakReference(view);
    }

    public final void a(float f9) {
        android.view.View view = (android.view.View) this.f2000a.get();
        if (view != null) {
            view.animate().alpha(f9);
        }
    }

    public final void b() {
        android.view.View view = (android.view.View) this.f2000a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        android.view.View view = (android.view.View) this.f2000a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(D1.InterfaceC0218d0 interfaceC0218d0) {
        android.view.View view = (android.view.View) this.f2000a.get();
        if (view != null) {
            if (interfaceC0218d0 != null) {
                view.animate().setListener(new D1.C0214b0(interfaceC0218d0, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f9) {
        android.view.View view = (android.view.View) this.f2000a.get();
        if (view != null) {
            view.animate().translationY(f9);
        }
    }
}
