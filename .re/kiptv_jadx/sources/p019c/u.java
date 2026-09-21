package p019c;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f18090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p078i6.l f18091b = new p078i6.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p019c.n f18092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.window.OnBackInvokedCallback f18093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public android.window.OnBackInvokedDispatcher f18094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18095f;
    public boolean g;

    public u(java.lang.Runnable runnable) {
        this.f18090a = runnable;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f18093d = i3 >= 34 ? new p019c.r(new p019c.o(this, 0), new p019c.o(this, 1), new p019c.p(this, 0), new p019c.p(this, 1)) : new p019c.q(0, new p019c.p(this, 2));
        }
    }

    public final void a(androidx.lifecycle.InterfaceC1540w owner, p019c.n onBackPressedCallback) {
        kotlin.jvm.internal.m.e(owner, "owner");
        kotlin.jvm.internal.m.e(onBackPressedCallback, "onBackPressedCallback");
        androidx.lifecycle.AbstractC1534p lifecycle = owner.getLifecycle();
        if (((androidx.lifecycle.C1542y) lifecycle).f16379d == androidx.lifecycle.EnumC1533o.f16364h) {
            return;
        }
        onBackPressedCallback.f18073b.add(new p019c.s(this, lifecycle, onBackPressedCallback));
        e();
        onBackPressedCallback.f18074c = new E5.C0313s0(0, this, p019c.u.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 9);
    }

    public final void b() {
        java.lang.Object objPrevious;
        p019c.n nVar = this.f18092c;
        if (nVar == null) {
            p078i6.l lVar = this.f18091b;
            java.util.ListIterator<E> listIterator = lVar.listIterator(lVar.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((p019c.n) objPrevious).f18072a);
            nVar = (p019c.n) objPrevious;
        }
        this.f18092c = null;
        if (nVar != null) {
            nVar.a();
        }
    }

    public final void c() {
        java.lang.Object objPrevious;
        p019c.n nVar = this.f18092c;
        if (nVar == null) {
            p078i6.l lVar = this.f18091b;
            java.util.ListIterator listIterator = lVar.listIterator(lVar.d());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((p019c.n) objPrevious).f18072a);
            nVar = (p019c.n) objPrevious;
        }
        this.f18092c = null;
        if (nVar != null) {
            nVar.b();
        } else {
            this.f18090a.run();
        }
    }

    public final void d(boolean z6) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.f18094e;
        android.window.OnBackInvokedCallback onBackInvokedCallback = this.f18093d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z6 && !this.f18095f) {
            E1.e.h(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f18095f = true;
        } else {
            if (z6 || !this.f18095f) {
                return;
            }
            E1.e.i(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f18095f = false;
        }
    }

    public final void e() {
        boolean z6 = this.g;
        boolean z9 = false;
        p078i6.l lVar = this.f18091b;
        if (lVar == null || !lVar.isEmpty()) {
            java.util.Iterator it = lVar.iterator();
            while (it.hasNext()) {
                if (((p019c.n) it.next()).f18072a) {
                    z9 = true;
                    break;
                }
            }
        }
        this.g = z9;
        if (z9 == z6 || android.os.Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z9);
    }
}
