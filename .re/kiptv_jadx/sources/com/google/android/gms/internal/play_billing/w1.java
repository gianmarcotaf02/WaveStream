package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class w1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.w1 zzb;
    private int zzd;
    private int zze;
    private java.lang.String zzf = "";

    static {
        com.google.android.gms.internal.play_billing.w1 w1Var = new com.google.android.gms.internal.play_billing.w1();
        zzb = w1Var;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.w1.class, w1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.C1838f0.f19328h, "zzf"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.w1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.Z(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
