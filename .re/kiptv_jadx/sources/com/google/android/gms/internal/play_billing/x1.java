package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class x1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.x1 zzb;
    private int zzd;
    private com.google.android.gms.internal.play_billing.InterfaceC1885z0 zze = com.google.android.gms.internal.play_billing.R0.f19280l;
    private java.lang.String zzf = "";
    private boolean zzg;

    static {
        com.google.android.gms.internal.play_billing.x1 x1Var = new com.google.android.gms.internal.play_billing.x1();
        zzb = x1Var;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.x1.class, x1Var);
    }

    public static com.google.android.gms.internal.play_billing.x1 p() {
        return zzb;
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.play_billing.x1 x1Var, boolean z6) {
        x1Var.zzd |= 2;
        x1Var.zzg = z6;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.w1.class, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.x1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.v1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
