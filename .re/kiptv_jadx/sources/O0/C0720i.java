package O0;

/* JADX INFO: renamed from: O0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0720i implements O0.Q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final O0.Q f7646i;
    public final java.lang.Enum j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Enum f7647k;

    public /* synthetic */ C0720i(O0.Q q9, java.lang.Enum r9, java.lang.Enum r10, int i3) {
        this.f7645h = i3;
        this.f7646i = q9;
        this.j = r9;
        this.f7647k = r10;
    }

    @Override // O0.Q
    public final O0.g0 C(long j) {
        switch (this.f7645h) {
            case 0:
                O0.EnumC0729s enumC0729s = O0.EnumC0729s.f7686h;
                O0.r rVar = (O0.r) this.j;
                O0.EnumC0729s enumC0729s2 = (O0.EnumC0729s) this.f7647k;
                O0.Q q9 = this.f7646i;
                if (enumC0729s2 == enumC0729s) {
                    return new O0.C0722k(rVar == O0.r.f7685i ? q9.z(p113n1.a.g(j)) : q9.n(p113n1.a.g(j)), p113n1.a.c(j) ? p113n1.a.g(j) : 32767, 0);
                }
                return new O0.C0722k(p113n1.a.d(j) ? p113n1.a.h(j) : 32767, rVar == O0.r.f7685i ? q9.a(p113n1.a.h(j)) : q9.Z(p113n1.a.h(j)), 0);
            case 1:
                O0.W w6 = O0.W.f7614h;
                O0.V v6 = (O0.V) this.j;
                O0.W w9 = (O0.W) this.f7647k;
                O0.Q q10 = this.f7646i;
                if (w9 == w6) {
                    return new O0.C0722k(v6 == O0.V.f7613i ? q10.z(p113n1.a.g(j)) : q10.n(p113n1.a.g(j)), p113n1.a.c(j) ? p113n1.a.g(j) : 32767, 1);
                }
                return new O0.C0722k(p113n1.a.d(j) ? p113n1.a.h(j) : 32767, v6 == O0.V.f7613i ? q10.a(p113n1.a.h(j)) : q10.Z(p113n1.a.h(j)), 1);
            default:
                Q0.i0 i0Var = Q0.i0.f8440h;
                Q0.h0 h0Var = (Q0.h0) this.j;
                Q0.i0 i0Var2 = (Q0.i0) this.f7647k;
                O0.Q q11 = this.f7646i;
                if (i0Var2 == i0Var) {
                    return new O0.C0722k(h0Var == Q0.h0.f8439i ? q11.z(p113n1.a.g(j)) : q11.n(p113n1.a.g(j)), p113n1.a.c(j) ? p113n1.a.g(j) : 32767, 2);
                }
                return new O0.C0722k(p113n1.a.d(j) ? p113n1.a.h(j) : 32767, h0Var == Q0.h0.f8439i ? q11.a(p113n1.a.h(j)) : q11.Z(p113n1.a.h(j)), 2);
        }
    }

    @Override // O0.Q
    public final java.lang.Object E() {
        switch (this.f7645h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7646i.E();
    }

    @Override // O0.Q
    public final int Z(int i3) {
        switch (this.f7645h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7646i.Z(i3);
    }

    @Override // O0.Q
    public final int a(int i3) {
        switch (this.f7645h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7646i.a(i3);
    }

    @Override // O0.Q
    public final int n(int i3) {
        switch (this.f7645h) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f7646i.n(i3);
    }

    @Override // O0.Q
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
