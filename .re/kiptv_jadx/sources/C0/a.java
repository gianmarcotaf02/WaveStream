package C0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public F3.C0371k f863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f864i;
    public p188x0.C3092l j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f865k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p113n1.n f866l = p113n1.n.f25566h;

    public boolean b(float f9) {
        return false;
    }

    public boolean e(p188x0.C3092l c3092l) {
        return false;
    }

    public final void g(Q0.H h9, long j, float f9, p188x0.C3092l c3092l) {
        if (this.f865k != f9) {
            if (!b(f9)) {
                if (f9 == 1.0f) {
                    F3.C0371k c0371k = this.f863h;
                    if (c0371k != null) {
                        c0371k.h(f9);
                    }
                    this.f864i = false;
                } else {
                    F3.C0371k c0371kG = this.f863h;
                    if (c0371kG == null) {
                        c0371kG = p188x0.z.g();
                        this.f863h = c0371kG;
                    }
                    c0371kG.h(f9);
                    this.f864i = true;
                }
            }
            this.f865k = f9;
        }
        if (!kotlin.jvm.internal.m.a(this.j, c3092l)) {
            if (!e(c3092l)) {
                if (c3092l == null) {
                    F3.C0371k c0371k2 = this.f863h;
                    if (c0371k2 != null) {
                        c0371k2.k(null);
                    }
                    this.f864i = false;
                } else {
                    F3.C0371k c0371kG2 = this.f863h;
                    if (c0371kG2 == null) {
                        c0371kG2 = p188x0.z.g();
                        this.f863h = c0371kG2;
                    }
                    c0371kG2.k(c3092l);
                    this.f864i = true;
                }
            }
            this.j = c3092l;
        }
        p113n1.n layoutDirection = h9.getLayoutDirection();
        if (this.f866l != layoutDirection) {
            f(layoutDirection);
            this.f866l = layoutDirection;
        }
        p203z0.b bVar = h9.f8266h;
        int i3 = (int) (j >> 32);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (bVar.d() >> 32)) - java.lang.Float.intBitsToFloat(i3);
        int i9 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (bVar.d() & 4294967295L)) - java.lang.Float.intBitsToFloat(i9);
        ((p191x3.C) bVar.f32128i.f23899i).a(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f9 > 0.0f) {
            try {
                if (java.lang.Float.intBitsToFloat(i3) > 0.0f && java.lang.Float.intBitsToFloat(i9) > 0.0f) {
                    if (this.f864i) {
                        float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat(i3);
                        p181w0.b bVarC = com.google.android.gms.internal.play_billing.V0.c(0L, (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat(i9))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        p188x0.InterfaceC3097q interfaceC3097qJ = h9.f8266h.f32128i.j();
                        F3.C0371k c0371kG3 = this.f863h;
                        if (c0371kG3 == null) {
                            c0371kG3 = p188x0.z.g();
                            this.f863h = c0371kG3;
                        }
                        try {
                            interfaceC3097qJ.n(bVarC, c0371kG3);
                            i(h9);
                            interfaceC3097qJ.p();
                        } catch (java.lang.Throwable th) {
                            interfaceC3097qJ.p();
                            throw th;
                        }
                    } else {
                        i(h9);
                    }
                }
            } catch (java.lang.Throwable th2) {
                ((p191x3.C) bVar.f32128i.f23899i).a(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        ((p191x3.C) bVar.f32128i.f23899i).a(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(Q0.H h9);

    public void f(p113n1.n nVar) {
    }
}
