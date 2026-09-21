package p066h2;

/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.lifecycle.G {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p166t3.d f22455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.lifecycle.InterfaceC1540w f22456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B7.l f22457n;

    public a(p166t3.d dVar) {
        this.f22455l = dVar;
        if (dVar.f27769a != null) {
            throw new java.lang.IllegalStateException("There is already a listener registered");
        }
        dVar.f27769a = this;
    }

    @Override // androidx.lifecycle.F
    public final void f() {
        p166t3.d dVar = this.f22455l;
        dVar.f27770b = true;
        dVar.f27772d = false;
        dVar.f27771c = false;
        dVar.f27776i.drainPermits();
        dVar.a();
        dVar.g = new p075i2.a(dVar);
        dVar.c();
    }

    @Override // androidx.lifecycle.F
    public final void g() {
        this.f22455l.f27770b = false;
    }

    @Override // androidx.lifecycle.F
    public final void h(androidx.lifecycle.H h9) {
        super.h(h9);
        this.f22456m = null;
        this.f22457n = null;
    }

    public final void j() {
        androidx.lifecycle.InterfaceC1540w interfaceC1540w = this.f22456m;
        B7.l lVar = this.f22457n;
        if (interfaceC1540w == null || lVar == null) {
            return;
        }
        super.h(lVar);
        d(interfaceC1540w, lVar);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" #0 : ");
        E6.G.i(this.f22455l, sb);
        sb.append("}}");
        return sb.toString();
    }
}
