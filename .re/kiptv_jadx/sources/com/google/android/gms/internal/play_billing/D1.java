package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.D1 zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.play_billing.D1 d4 = new com.google.android.gms.internal.play_billing.D1();
        zzb = d4;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.D1.class, d4);
    }

    public static com.google.android.gms.internal.play_billing.D1 p() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.C1838f0.f19329i});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.D1();
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
