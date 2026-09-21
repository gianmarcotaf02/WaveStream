package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements g1.q, p020c0.InterfaceC1672c, p163t.I0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2609i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f2610k;

    public x(g1.q qVar, int i3, int i9) {
        this.f2608h = 1;
        this.f2610k = qVar;
        this.f2609i = i3;
        this.j = i9;
    }

    @Override // p163t.I0
    public int A() {
        return this.j;
    }

    @Override // p163t.I0
    public int G() {
        return this.f2609i;
    }

    @Override // p020c0.InterfaceC1672c
    public void c(int i3, java.lang.Object obj) {
        ((p020c0.InterfaceC1672c) this.f2610k).c(i3 + (this.j == 0 ? this.f2609i : 0), obj);
    }

    @Override // p020c0.InterfaceC1672c
    public void d(java.lang.Object obj) {
        this.j++;
        ((p020c0.InterfaceC1672c) this.f2610k).d(obj);
    }

    @Override // p163t.G0
    public p163t.r e(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return ((A7.m) this.f2610k).e(j, rVar, rVar2, rVar3);
    }

    @Override // p020c0.InterfaceC1672c
    public void f() {
        ((p020c0.InterfaceC1672c) this.f2610k).f();
    }

    @Override // p020c0.InterfaceC1672c
    public void g(int i3, int i9, int i10) {
        int i11 = this.j == 0 ? this.f2609i : 0;
        ((p020c0.InterfaceC1672c) this.f2610k).g(i3 + i11, i9 + i11, i10);
    }

    @Override // p020c0.InterfaceC1672c
    public void h(int i3, int i9) {
        ((p020c0.InterfaceC1672c) this.f2610k).h(i3 + (this.j == 0 ? this.f2609i : 0), i9);
    }

    @Override // g1.q
    public int i(int i3) {
        int i9 = ((g1.q) this.f2610k).i(i3);
        if (i3 >= 0 && i3 <= this.j) {
            J.A0.c(i9, this.f2609i, i3);
        }
        return i9;
    }

    @Override // p020c0.InterfaceC1672c
    public void j() {
        if (!(this.j > 0)) {
            p020c0.AbstractC1705t.a("OffsetApplier up called with no corresponding down");
        }
        this.j--;
        ((p020c0.InterfaceC1672c) this.f2610k).j();
    }

    @Override // p020c0.InterfaceC1672c
    public void k(int i3, java.lang.Object obj) {
        ((p020c0.InterfaceC1672c) this.f2610k).k(i3 + (this.j == 0 ? this.f2609i : 0), obj);
    }

    @Override // p020c0.InterfaceC1672c
    public java.lang.Object m() {
        return ((p020c0.InterfaceC1672c) this.f2610k).m();
    }

    @Override // g1.q
    public int n(int i3) {
        int iN = ((g1.q) this.f2610k).n(i3);
        if (i3 >= 0 && i3 <= this.f2609i) {
            J.A0.b(iN, this.j, i3);
        }
        return iN;
    }

    @Override // p020c0.InterfaceC1672c
    public void o(java.lang.Object obj, p194x6.m mVar) {
        ((p020c0.InterfaceC1672c) this.f2610k).o(obj, mVar);
    }

    public Y2.C1040j p() {
        Y2.C1040j c1040j = new Y2.C1040j();
        c1040j.f11477a = this.f2609i;
        c1040j.f11478b = this.j;
        c1040j.f11479c = (java.lang.String) this.f2610k;
        return c1040j;
    }

    public byte q(int i3, int i9) {
        return ((byte[][]) this.f2610k)[i9][i3];
    }

    public void s(int i3, int i9, int i10) {
        ((byte[][]) this.f2610k)[i9][i3] = (byte) i10;
    }

    public java.lang.String toString() {
        switch (this.f2608h) {
            case 2:
                int i3 = this.f2609i;
                int i9 = this.j;
                java.lang.StringBuilder sb = new java.lang.StringBuilder((i3 * 2 * i9) + 2);
                for (int i10 = 0; i10 < i9; i10++) {
                    byte[] bArr = ((byte[][]) this.f2610k)[i10];
                    for (int i11 = 0; i11 < i3; i11++) {
                        byte b9 = bArr[i11];
                        if (b9 == 0) {
                            sb.append(" 0");
                        } else if (b9 != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // p163t.G0
    public p163t.r u(long j, p163t.r rVar, p163t.r rVar2, p163t.r rVar3) {
        return ((A7.m) this.f2610k).u(j, rVar, rVar2, rVar3);
    }

    public x(int i3) {
        this.f2608h = i3;
        switch (i3) {
            case 3:
                break;
            default:
                this.f2610k = new D8.x[256];
                this.f2609i = 0;
                this.j = 0;
                break;
        }
    }

    public x(int i3, int i9, int i10) {
        this.f2608h = i10;
        switch (i10) {
            case 2:
                this.f2610k = (byte[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Byte.TYPE, i9, i3);
                this.f2609i = i3;
                this.j = i9;
                break;
            default:
                this.f2610k = null;
                this.f2609i = i3;
                int i11 = i9 & 7;
                this.j = i11 == 0 ? 8 : i11;
                break;
        }
    }

    public x(p020c0.InterfaceC1672c interfaceC1672c, int i3) {
        this.f2608h = 4;
        this.f2610k = interfaceC1672c;
        this.f2609i = i3;
    }

    public x(int i3, int i9, p163t.InterfaceC2780y interfaceC2780y) {
        this.f2608h = 5;
        this.f2609i = i3;
        this.j = i9;
        this.f2610k = new A7.m(new p163t.D(i3, i9, interfaceC2780y));
    }
}
