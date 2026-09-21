package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class C1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.C1 zzb;
    private int zzd;
    private com.google.android.gms.internal.play_billing.C1860m1 zze;
    private long zzf;

    static {
        com.google.android.gms.internal.play_billing.C1 c9 = new com.google.android.gms.internal.play_billing.C1();
        zzb = c9;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.C1.class, c9);
    }

    public static com.google.android.gms.internal.play_billing.B1 p() {
        return (com.google.android.gms.internal.play_billing.B1) zzb.k();
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.play_billing.C1 c9, com.google.android.gms.internal.play_billing.C1860m1 c1860m1) {
        c9.zze = c1860m1;
        c9.zzd |= 1;
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.play_billing.C1 c9, long j) {
        c9.zzd |= 2;
        c9.zzf = j;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.C1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.B1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
