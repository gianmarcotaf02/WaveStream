package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.u1 zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.play_billing.u1 u1Var = new com.google.android.gms.internal.play_billing.u1();
        zzb = u1Var;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.u1.class, u1Var);
    }

    public static com.google.android.gms.internal.play_billing.t1 p() {
        return (com.google.android.gms.internal.play_billing.t1) zzb.k();
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.play_billing.u1 u1Var, int i3) {
        u1Var.zze = i3 - 1;
        u1Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.C1838f0.g});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.u1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.t1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
