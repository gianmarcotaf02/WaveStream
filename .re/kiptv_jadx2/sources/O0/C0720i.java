package O0;

public final class C0720i implements Q {

    public final int f7645h;

    public final Q f7646i;
    public final Enum j;

    public final Enum f7647k;

    public C0720i(Q q9, Enum r9, Enum r10, int i3) {
        this.f7645h = i3;
        this.f7646i = q9;
        this.j = r9;
        this.f7647k = r10;
    }

    @Override
    public final g0 C(long j) {
        switch (this.f7645h) {
            case 0:
                EnumC0729s enumC0729s = EnumC0729s.f7686h;
                r rVar = (r) this.j;
                EnumC0729s enumC0729s2 = (EnumC0729s) this.f7647k;
                Q q9 = this.f7646i;
                if (enumC0729s2 == enumC0729s) {
                    return new C0722k(rVar == r.f7685i ? q9.z(p113n1.a.g(j)) : q9.n(p113n1.a.g(j)), p113n1.a.c(j) ? p113n1.a.g(j) : 32767, 0);
                }
                return new C0722k(p113n1.a.d(j) ? p113n1.a.h(j) : 32767, rVar == r.f7685i ? q9.a(p113n1.a.h(j)) : q9.Z(p113n1.a.h(j)), 0);
            case 1:
                W w6 = W.f7614h;
                V v6 = (V) this.j;
                W w9 = (W) this.f7647k;
                Q q10 = this.f7646i;
                if (w9 == w6) {
                    return new C0722k(v6 == V.f7613i ? q10.z(p113n1.a.g(j)) : q10.n(p113n1.a.g(j)), p113n1.a.c(j) ? p113n1.a.g(j) : 32767, 1);
                }
                return new C0722k(p113n1.a.d(j) ? p113n1.a.h(j) : 32767, v6 == V.f7613i ? q10.a(p113n1.a.h(j)) : q10.Z(p113n1.a.h(j)), 1);
            default:
                Q0.i0 i0Var = Q0.i0.f8440h;
                Q0.h0 h0Var = (Q0.h0) this.j;
                Q0.i0 i0Var2 = (Q0.i0) this.f7647k;
                Q q11 = this.f7646i;
                if (i0Var2 == i0Var) {
                    return new C0722k(h0Var == Q0.h0.f8439i ? q11.z(p113n1.a.g(j)) : q11.n(p113n1.a.g(j)), p113n1.a.c(j) ? p113n1.a.g(j) : 32767, 2);
                }
                return new C0722k(p113n1.a.d(j) ? p113n1.a.h(j) : 32767, h0Var == Q0.h0.f8439i ? q11.a(p113n1.a.h(j)) : q11.Z(p113n1.a.h(j)), 2);
        }
    }

    @Override
    public final Object E() {
        switch (this.f7645h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7646i.E();
    }

    @Override
    public final int Z(int i3) {
        switch (this.f7645h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7646i.Z(i3);
    }

    @Override
    public final int a(int i3) {
        switch (this.f7645h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7646i.a(i3);
    }

    @Override
    public final int n(int i3) {
        switch (this.f7645h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7646i.n(i3);
    }

    @Override
    public final int z(int i3) {
        switch (this.f7645h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7646i.z(i3);
    }
}
