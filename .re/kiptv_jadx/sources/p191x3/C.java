package p191x3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements p059g4.a, p206z3.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f31153h;

    public /* synthetic */ C(java.lang.Object obj) {
        this.f31153h = obj;
    }

    @Override // p206z3.a
    public void Q(android.graphics.Bitmap bitmap) {
        ((p206z3.i) this.f31153h).b(bitmap, 3);
    }

    public void a(float f9, float f10, float f11, float f12) {
        j1.l lVar = (j1.l) this.f31153h;
        p188x0.InterfaceC3097q interfaceC3097qJ = lVar.j();
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (lVar.q() >> 32)) - (f11 + f9);
        long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (lVar.q() & 4294967295L)) - (f12 + f10))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            p188x0.C.a("Width and height must be greater than or equal to zero");
        }
        lVar.A(jFloatToRawIntBits);
        interfaceC3097qJ.l(f9, f10);
    }

    public void b(float f9, float f10, long j) {
        p188x0.InterfaceC3097q interfaceC3097qJ = ((j1.l) this.f31153h).j();
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        interfaceC3097qJ.l(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i9));
        interfaceC3097qJ.b(f9, f10);
        interfaceC3097qJ.l(-java.lang.Float.intBitsToFloat(i3), -java.lang.Float.intBitsToFloat(i9));
    }

    public void c(float f9, float f10) {
        ((j1.l) this.f31153h).j().l(f9, f10);
    }

    public void d() {
        p199y3.g gVar = (p199y3.g) this.f31153h;
        java.util.Iterator it = gVar.f31868h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new java.lang.ClassCastException();
        }
        for (p191x3.B b9 : gVar.f31869i) {
            switch (b9.f31151a) {
                case 2:
                    ((p206z3.i) b9.f31152b).c();
                    break;
            }
        }
    }

    @Override // p059g4.a
    public void p(A0.a aVar) {
        p191x3.C3102c.e((p191x3.C3102c) ((p191x3.x) this.f31153h).f31205e, "joinApplication", aVar);
    }
}
