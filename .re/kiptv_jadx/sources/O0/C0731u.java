package O0;

/* JADX INFO: renamed from: O0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0731u implements O0.U, O0.InterfaceC0728q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O0.InterfaceC0728q f7694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p113n1.n f7695i;

    public C0731u(O0.InterfaceC0728q interfaceC0728q, p113n1.n nVar) {
        this.f7694h = interfaceC0728q;
        this.f7695i = nVar;
    }

    @Override // p113n1.c
    public final long G(float f9) {
        return this.f7694h.G(f9);
    }

    @Override // p113n1.c
    public final float K(int i3) {
        return this.f7694h.K(i3);
    }

    @Override // p113n1.c
    public final float N(float f9) {
        return this.f7694h.N(f9);
    }

    @Override // p113n1.c
    public final float S() {
        return this.f7694h.S();
    }

    @Override // O0.InterfaceC0728q
    public final boolean V() {
        return this.f7694h.V();
    }

    @Override // p113n1.c
    public final float Y(float f9) {
        return this.f7694h.Y(f9);
    }

    @Override // p113n1.c
    public final float getDensity() {
        return this.f7694h.getDensity();
    }

    @Override // O0.InterfaceC0728q
    public final p113n1.n getLayoutDirection() {
        return this.f7695i;
    }

    @Override // p113n1.c
    public final int k0(float f9) {
        return this.f7694h.k0(f9);
    }

    @Override // p113n1.c
    public final long l(float f9) {
        return this.f7694h.l(f9);
    }

    @Override // p113n1.c
    public final long m(long j) {
        return this.f7694h.m(j);
    }

    @Override // p113n1.c
    public final long o0(long j) {
        return this.f7694h.o0(j);
    }

    @Override // p113n1.c
    public final float s0(long j) {
        return this.f7694h.s0(j);
    }

    @Override // p113n1.c
    public final float t(long j) {
        return this.f7694h.t(j);
    }

    @Override // O0.U
    public final O0.T w(int i3, int i9, java.util.Map map, A0.b bVar, p194x6.j jVar) {
        if (i3 < 0) {
            i3 = 0;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i9) != 0) {
            N0.a.b("Size(" + i3 + " x " + i9 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new O0.C0730t(i3, i9, map, bVar);
    }
}
