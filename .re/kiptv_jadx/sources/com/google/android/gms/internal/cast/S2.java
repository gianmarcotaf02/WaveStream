package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class S2 implements com.google.android.gms.internal.cast.X2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.AbstractC1801u2 f18819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.C1799u0 f18820b;

    public S2(com.google.android.gms.internal.cast.C1799u0 c1799u0, com.google.android.gms.internal.cast.AbstractC1801u2 abstractC1801u2) {
        com.google.android.gms.internal.cast.C1799u0 c1799u1 = com.google.android.gms.internal.cast.B2.f18746a;
        this.f18820b = c1799u0;
        this.f18819a = abstractC1801u2;
    }

    @Override // com.google.android.gms.internal.cast.X2
    public final void a(java.lang.Object obj) {
        this.f18820b.getClass();
        com.google.android.gms.internal.cast.Z2 z6 = ((com.google.android.gms.internal.cast.E2) obj).zzc;
        if (z6.f18859d) {
            z6.f18859d = false;
        }
        com.google.android.gms.internal.cast.C1799u0 c1799u0 = com.google.android.gms.internal.cast.B2.f18746a;
        throw p121o0.p.i(obj);
    }

    @Override // com.google.android.gms.internal.cast.X2
    public final int b(com.google.android.gms.internal.cast.E2 e6) {
        com.google.android.gms.internal.cast.Z2 z6 = e6.zzc;
        int i3 = z6.f18858c;
        if (i3 != -1) {
            return i3;
        }
        z6.f18858c = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.cast.X2
    public final void c(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.cast.Y2.n(obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.X2
    public final void d(java.lang.Object obj, com.google.android.gms.internal.cast.N2 n3) {
        throw p121o0.p.i(obj);
    }

    @Override // com.google.android.gms.internal.cast.X2
    public final boolean e(com.google.android.gms.internal.cast.E2 e6, com.google.android.gms.internal.cast.E2 e9) {
        return e6.zzc.equals(e9.zzc);
    }

    @Override // com.google.android.gms.internal.cast.X2
    public final int f(com.google.android.gms.internal.cast.E2 e6) {
        e6.zzc.getClass();
        return 506991;
    }

    @Override // com.google.android.gms.internal.cast.X2
    public final boolean g(java.lang.Object obj) {
        throw p121o0.p.i(obj);
    }

    @Override // com.google.android.gms.internal.cast.X2
    public final com.google.android.gms.internal.cast.E2 h() {
        com.google.android.gms.internal.cast.AbstractC1801u2 abstractC1801u2 = this.f18819a;
        return abstractC1801u2 instanceof com.google.android.gms.internal.cast.E2 ? (com.google.android.gms.internal.cast.E2) ((com.google.android.gms.internal.cast.E2) abstractC1801u2).j(4, null) : ((com.google.android.gms.internal.cast.D2) ((com.google.android.gms.internal.cast.E2) abstractC1801u2).j(5, null)).b();
    }
}
