package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class A1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.A1 zzb;
    private int zzd;
    private int zzf;
    private com.google.android.gms.internal.play_billing.InterfaceC1885z0 zze = com.google.android.gms.internal.play_billing.R0.f19280l;
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.play_billing.A1 a2 = new com.google.android.gms.internal.play_billing.A1();
        zzb = a2;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.A1.class, a2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.A1();
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
