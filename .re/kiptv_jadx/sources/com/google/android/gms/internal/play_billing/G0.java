package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements com.google.android.gms.internal.play_billing.J0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1873t0 f19214b = new com.google.android.gms.internal.play_billing.C1873t0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f19215a;

    public G0(com.google.android.gms.internal.play_billing.J0... j0Arr) {
        this.f19215a = j0Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.J0
    public com.google.android.gms.internal.play_billing.S0 a(java.lang.Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            com.google.android.gms.internal.play_billing.J0 j9 = ((com.google.android.gms.internal.play_billing.J0[]) this.f19215a)[i3];
            if (j9.b(cls)) {
                return j9.a(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.J0
    public boolean b(java.lang.Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((com.google.android.gms.internal.play_billing.J0[]) this.f19215a)[i3].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i3, java.lang.Object obj, com.google.android.gms.internal.play_billing.T0 t9) throws androidx.datastore.preferences.protobuf.C1504k {
        com.google.android.gms.internal.play_billing.AbstractC1841g0 abstractC1841g0 = (com.google.android.gms.internal.play_billing.AbstractC1841g0) obj;
        com.google.android.gms.internal.play_billing.C1866p0 c1866p0 = (com.google.android.gms.internal.play_billing.C1866p0) this.f19215a;
        c1866p0.P(i3, 2);
        c1866p0.R(abstractC1841g0.c(t9));
        t9.b(abstractC1841g0, this);
    }

    public G0() {
        int i3 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
        com.google.android.gms.internal.play_billing.G0 g9 = new com.google.android.gms.internal.play_billing.G0(com.google.android.gms.internal.play_billing.C1873t0.f19389b, f19214b);
        java.nio.charset.Charset charset = com.google.android.gms.internal.play_billing.B0.f19193a;
        this.f19215a = g9;
    }

    public G0(com.google.android.gms.internal.play_billing.C1866p0 c1866p0) {
        java.nio.charset.Charset charset = com.google.android.gms.internal.play_billing.B0.f19193a;
        this.f19215a = c1866p0;
        c1866p0.f19372l = this;
    }
}
