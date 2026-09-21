package p066h2;

import B7.l;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC1540w;
import p166t3.d;

public final class a extends G {

    public final d f22455l;

    public InterfaceC1540w f22456m;

    public l f22457n;

    public a(d dVar) {
        this.f22455l = dVar;
        if (dVar.f27769a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f27769a = this;
    }

    @Override
    public final void f() {
        d dVar = this.f22455l;
        dVar.f27770b = true;
        dVar.f27772d = false;
        dVar.f27771c = false;
        dVar.f27776i.drainPermits();
        dVar.a();
        dVar.g = new p075i2.a(dVar);
        dVar.c();
    }

    @Override
    public final void g() {
        this.f22455l.f27770b = false;
    }

    @Override
    public final void h(H h9) {
        super.h(h9);
        this.f22456m = null;
        this.f22457n = null;
    }

    public final void j() {
        InterfaceC1540w interfaceC1540w = this.f22456m;
        l lVar = this.f22457n;
        if (interfaceC1540w == null || lVar == null) {
            return;
        }
        super.h(lVar);
        d(interfaceC1540w, lVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        E6.G.i(this.f22455l, sb);
        sb.append("}}");
        return sb.toString();
    }
}
