package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1799u0 implements com.google.android.gms.internal.cast.P2, p013b3.d, F3.l, com.google.android.gms.internal.cast.T {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f19096i = new com.google.android.gms.internal.cast.C1799u0(0);
    public static final com.google.android.gms.internal.cast.C1799u0 j = new com.google.android.gms.internal.cast.C1799u0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f19097k = new com.google.android.gms.internal.cast.C1799u0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f19098l = new com.google.android.gms.internal.cast.C1799u0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f19099m = new com.google.android.gms.internal.cast.C1799u0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f19100n = new com.google.android.gms.internal.cast.C1799u0(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f19101o = new com.google.android.gms.internal.cast.C1799u0(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f19102p = new com.google.android.gms.internal.cast.C1799u0(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19103h;

    public /* synthetic */ C1799u0(int i3) {
        this.f19103h = i3;
    }

    @Override // F3.l
    public void K(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.cast.I i3 = new com.google.android.gms.internal.cast.I((p059g4.d) obj2);
        com.google.android.gms.internal.cast.P p2 = (com.google.android.gms.internal.cast.P) ((com.google.android.gms.internal.cast.S) obj).p();
        android.os.Parcel parcelY = p2.Y();
        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, i3);
        p2.a0(parcelY, 2);
    }

    @Override // com.google.android.gms.internal.cast.P2
    public com.google.android.gms.internal.cast.W2 a(java.lang.Class cls) {
        switch (this.f19103h) {
            case 3:
                if (!com.google.android.gms.internal.cast.E2.class.isAssignableFrom(cls)) {
                    throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (com.google.android.gms.internal.cast.W2) com.google.android.gms.internal.cast.E2.m(cls.asSubclass(com.google.android.gms.internal.cast.E2.class)).j(3, null);
                } catch (java.lang.Exception e6) {
                    throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new java.lang.IllegalStateException("This should never be called.");
        }
    }

    @Override // p013b3.d
    public java.lang.Object apply(java.lang.Object obj) {
        com.google.android.gms.internal.cast.L0 l2 = (com.google.android.gms.internal.cast.L0) obj;
        try {
            int iK = l2.k();
            byte[] bArr = new byte[iK];
            com.google.android.gms.internal.cast.A2 a2 = new com.google.android.gms.internal.cast.A2(bArr, iK);
            com.google.android.gms.internal.cast.X2 x2A = com.google.android.gms.internal.cast.U2.f18826c.a(com.google.android.gms.internal.cast.L0.class);
            com.google.android.gms.internal.cast.N2 n3 = a2.f18741k;
            if (n3 == null) {
                n3 = new com.google.android.gms.internal.cast.N2(a2);
            }
            x2A.d(l2, n3);
            if (iK - a2.f18744n == 0) {
                return bArr;
            }
            throw new java.lang.IllegalStateException("Did not write as much data as expected.");
        } catch (java.io.IOException e6) {
            throw new java.lang.RuntimeException(Y6.f.h("Serializing ", com.google.android.gms.internal.cast.L0.class.getName(), " to a byte array threw an IOException (should never happen)."), e6);
        }
    }

    @Override // com.google.android.gms.internal.cast.P2
    public boolean b(java.lang.Class cls) {
        switch (this.f19103h) {
            case 3:
                return com.google.android.gms.internal.cast.E2.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.cast.T
    public java.lang.Object c() {
        switch (this.f19103h) {
            case 10:
                throw new java.lang.IllegalStateException();
            default:
                B3.C0089b c0089b = com.google.android.gms.internal.cast.m3.f18982u;
                B3.C0089b c0089b2 = p191x3.C3100a.j;
                H3.q.d();
                p191x3.C3100a c3100a = p191x3.C3100a.f31157l;
                H3.q.g(c3100a);
                H3.q.d();
                return c3100a.f31161d.f31168h;
        }
    }

    public /* synthetic */ C1799u0(com.google.android.gms.internal.cast.J j9) {
        this.f19103h = 9;
    }
}
