package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements com.google.android.gms.internal.play_billing.T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.AbstractC1841g0 f19269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.C1873t0 f19270b;

    public O0(com.google.android.gms.internal.play_billing.C1873t0 c1873t0, com.google.android.gms.internal.play_billing.AbstractC1841g0 abstractC1841g0) {
        com.google.android.gms.internal.play_billing.C1873t0 c1873t1 = com.google.android.gms.internal.play_billing.AbstractC1869r0.f19380a;
        this.f19270b = c1873t0;
        this.f19269a = abstractC1841g0;
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final void a(java.lang.Object obj) {
        this.f19270b.getClass();
        com.google.android.gms.internal.play_billing.X0 x9 = ((com.google.android.gms.internal.play_billing.AbstractC1877v0) obj).zzc;
        if (x9.f19305e) {
            x9.f19305e = false;
        }
        com.google.android.gms.internal.play_billing.C1873t0 c1873t0 = com.google.android.gms.internal.play_billing.AbstractC1869r0.f19380a;
        throw p121o0.p.i(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final void b(java.lang.Object obj, com.google.android.gms.internal.play_billing.G0 g9) {
        throw p121o0.p.i(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final int c(com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0) {
        com.google.android.gms.internal.play_billing.X0 x9 = abstractC1877v0.zzc;
        int i3 = x9.f19304d;
        if (i3 != -1) {
            return i3;
        }
        int iX = 0;
        for (int i9 = 0; i9 < x9.f19301a; i9++) {
            int i10 = x9.f19302b[i9] >>> 3;
            com.google.android.gms.internal.play_billing.AbstractC1859m0 abstractC1859m0 = (com.google.android.gms.internal.play_billing.AbstractC1859m0) x9.f19303c[i9];
            int iU = com.google.android.gms.internal.play_billing.C1866p0.U(8);
            int iU2 = com.google.android.gms.internal.play_billing.C1866p0.U(i10) + com.google.android.gms.internal.play_billing.C1866p0.U(16);
            int iU3 = com.google.android.gms.internal.play_billing.C1866p0.U(24);
            int iN = abstractC1859m0.n();
            iX += iU + iU + iU2 + Y6.f.x(iN, iN, iU3);
        }
        x9.f19304d = iX;
        return iX;
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final boolean d(java.lang.Object obj) {
        throw p121o0.p.i(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final int e(com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0) {
        return abstractC1877v0.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final void f(java.lang.Object obj, byte[] bArr, int i3, int i9, com.google.android.gms.internal.play_billing.C1850j0 c1850j0) {
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0 = (com.google.android.gms.internal.play_billing.AbstractC1877v0) obj;
        if (abstractC1877v0.zzc == com.google.android.gms.internal.play_billing.X0.f19300f) {
            abstractC1877v0.zzc = com.google.android.gms.internal.play_billing.X0.b();
        }
        throw p121o0.p.i(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final void g(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.U0.p(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final com.google.android.gms.internal.play_billing.AbstractC1877v0 h() {
        com.google.android.gms.internal.play_billing.AbstractC1841g0 abstractC1841g0 = this.f19269a;
        return abstractC1841g0 instanceof com.google.android.gms.internal.play_billing.AbstractC1877v0 ? ((com.google.android.gms.internal.play_billing.AbstractC1877v0) abstractC1841g0).n() : ((com.google.android.gms.internal.play_billing.AbstractC1875u0) ((com.google.android.gms.internal.play_billing.AbstractC1877v0) abstractC1841g0).j(5)).b();
    }

    @Override // com.google.android.gms.internal.play_billing.T0
    public final boolean i(com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0, com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v1) {
        return abstractC1877v0.zzc.equals(abstractC1877v1.zzc);
    }
}
