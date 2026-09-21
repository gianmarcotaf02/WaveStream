package F;

import Q0.AbstractC0777k;

public final class C0339d extends p137q0.o {

    public Z0.d f3427v;

    public final C0340e f3428w;

    public C0339d(C0340e c0340e) {
        this.f3428w = c0340e;
    }

    @Override
    public final void F0() {
        C0340e c0340e = this.f3428w;
        c0340e.f3431b = this;
        if (c0340e.f3432c != null) {
            N0();
        }
    }

    @Override
    public final void G0() {
        C0340e c0340e = this.f3428w;
        if (c0340e.f3431b == this) {
            c0340e.f3431b = null;
        }
        Z0.d dVar = this.f3427v;
        if (dVar != null) {
            dVar.b();
        }
        this.f3427v = null;
    }

    public final void N0() {
        B.K k9 = new B.K(this, this.f3428w, 11);
        Q0.F fT = AbstractC0777k.t(this);
        int i3 = fT.f8242i;
        Z0.b rectManager = Q0.I.a(fT).getRectManager();
        Z0.e eVar = rectManager.f12604b;
        eVar.getClass();
        Z0.d dVar = new Z0.d(eVar, i3, this, k9);
        p136q.w wVar = eVar.f12624a;
        Object objB = wVar.b(i3);
        if (objB == null) {
            wVar.h(i3, dVar);
            objB = dVar;
        }
        Z0.d dVar2 = (Z0.d) objB;
        if (dVar2 != dVar) {
            while (true) {
                Z0.d dVar3 = dVar2.f12620d;
                if (dVar3 == null) {
                    break;
                } else {
                    dVar2 = dVar3;
                }
            }
            dVar2.f12620d = dVar;
        }
        if (AbstractC0777k.t(this.f26475h).f8247o) {
            rectManager.f12603a.i(i3, true);
        }
        rectManager.f12606d = true;
        rectManager.i();
        this.f3427v = dVar;
    }
}
