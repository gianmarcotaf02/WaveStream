package x;

import p020c0.AbstractC1703s;
import p020c0.C1681g0;

public final class C3058o implements Q0 {

    public final p194x6.j f30960a;

    public final C3056n f30961b = new C3056n(this);

    public final v.s0 f30962c = new v.s0();

    public final C1681g0 f30963d;

    public final C1681g0 f30964e;

    public final C1681g0 f30965f;

    public C3058o(p194x6.j jVar) {
        this.f30960a = jVar;
        Boolean bool = Boolean.FALSE;
        this.f30963d = AbstractC1703s.y(bool);
        this.f30964e = AbstractC1703s.y(bool);
        this.f30965f = AbstractC1703s.y(bool);
    }

    @Override
    public final boolean a() {
        return ((Boolean) this.f30963d.getValue()).booleanValue();
    }

    @Override
    public final Object c(v.n0 n0Var, p194x6.m mVar, p100l6.c cVar) {
        Object objM = S7.C.m(new C3054m(this, n0Var, mVar, null), cVar);
        return objM == p109m6.a.f25430h ? objM : p070h6.A.f22523a;
    }

    @Override
    public final float e(float f9) {
        return ((Number) this.f30960a.invoke(Float.valueOf(f9))).floatValue();
    }
}
