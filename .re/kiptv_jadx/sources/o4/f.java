package o4;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o4.f f26115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o4.f f26116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o4.f f26117e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f26119b;

    static {
        int i3 = 0;
        f26115c = new o4.f(i3, "ENABLED");
        f26116d = new o4.f(i3, "DISABLED");
        f26117e = new o4.f(i3, "DESTROYED");
    }

    public /* synthetic */ f(int i3, java.lang.Object obj) {
        this.f26118a = i3;
        this.f26119b = obj;
    }

    public synchronized void a(A4.b0 b0Var) {
        A4.f0 f0VarB;
        synchronized (this) {
            f0VarB = b(o4.n.e(b0Var), b0Var.A());
        }
        A4.d0 d0Var = (A4.d0) this.f26119b;
        d0Var.e();
        A4.g0.x((A4.g0) d0Var.f19594i, f0VarB);
    }

    public synchronized A4.f0 b(A4.Y y, A4.r0 r0Var) {
        int iA;
        synchronized (this) {
            iA = p179v4.t.a();
            while (d(iA)) {
                iA = p179v4.t.a();
            }
        }
        return (A4.f0) e0VarF.b();
        if (r0Var == A4.r0.UNKNOWN_PREFIX) {
            throw new java.security.GeneralSecurityException("unknown output prefix type");
        }
        A4.e0 e0VarF = A4.f0.F();
        e0VarF.e();
        A4.f0.w((A4.f0) e0VarF.f19594i, y);
        e0VarF.e();
        A4.f0.z((A4.f0) e0VarF.f19594i, iA);
        e0VarF.e();
        A4.f0.y((A4.f0) e0VarF.f19594i);
        e0VarF.e();
        A4.f0.x((A4.f0) e0VarF.f19594i, r0Var);
        return (A4.f0) e0VarF.b();
    }

    public synchronized j1.l c() {
        return j1.l.h((A4.g0) ((A4.d0) this.f26119b).b());
    }

    public synchronized boolean d(int i3) {
        java.util.Iterator it = java.util.Collections.unmodifiableList(((A4.g0) ((A4.d0) this.f26119b).f19594i).A()).iterator();
        while (it.hasNext()) {
            if (((A4.f0) it.next()).B() == i3) {
                return true;
            }
        }
        return false;
    }

    public A4.Y e(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j) throws java.security.GeneralSecurityException {
        p179v4.d dVar = (p179v4.d) this.f26119b;
        try {
            D1.AbstractC0220e0 abstractC0220e0E = dVar.e();
            com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906aZ0 = abstractC0220e0E.z0(abstractC1915j);
            abstractC0220e0E.D0(abstractC1906aZ0);
            com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906aP0 = abstractC0220e0E.p0(abstractC1906aZ0);
            A4.W wD = A4.Y.D();
            java.lang.String strC = dVar.c();
            wD.e();
            A4.Y.w((A4.Y) wD.f19594i, strC);
            try {
                int iB = ((com.google.crypto.tink.shaded.protobuf.AbstractC1928x) abstractC1906aP0).b(null);
                byte[] bArr = new byte[iB];
                com.google.crypto.tink.shaded.protobuf.C1918m c1918m = new com.google.crypto.tink.shaded.protobuf.C1918m(bArr, iB);
                abstractC1906aP0.f(c1918m);
                if (c1918m.f19561f - c1918m.g != 0) {
                    throw new java.lang.IllegalStateException("Did not write as much data as expected.");
                }
                com.google.crypto.tink.shaded.protobuf.C1914i c1914i = new com.google.crypto.tink.shaded.protobuf.C1914i(bArr);
                wD.e();
                A4.Y.x((A4.Y) wD.f19594i, c1914i);
                A4.X xF = dVar.f();
                wD.e();
                A4.Y.y((A4.Y) wD.f19594i, xF);
                return (A4.Y) wD.b();
            } catch (java.io.IOException e6) {
                throw new java.lang.RuntimeException(abstractC1906aP0.c("ByteString"), e6);
            }
        } catch (com.google.crypto.tink.shaded.protobuf.D e9) {
            throw new java.security.GeneralSecurityException("Unexpected proto", e9);
        }
    }

    public java.lang.String toString() {
        switch (this.f26118a) {
            case 0:
                return (java.lang.String) this.f26119b;
            default:
                return super.toString();
        }
    }

    public f(p179v4.d dVar, java.lang.Class cls) {
        this.f26118a = 2;
        if (!((java.util.Map) dVar.f29163d).keySet().contains(cls) && !java.lang.Void.class.equals(cls)) {
            throw new java.lang.IllegalArgumentException(B2.a.m("Given internalKeyMananger ", dVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f26119b = dVar;
    }
}
