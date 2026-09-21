package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.F1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        com.google.android.gms.internal.play_billing.F1 f9 = new com.google.android.gms.internal.play_billing.F1();
        zzb = f9;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.F1.class, f9);
    }

    public static com.google.android.gms.internal.play_billing.E1 p() {
        return (com.google.android.gms.internal.play_billing.E1) zzb.k();
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.play_billing.F1 f9, boolean z6) {
        f9.zzd |= 8;
        f9.zzh = z6;
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.play_billing.F1 f9) {
        f9.zzd |= 16;
        f9.zzi = 0;
    }

    public static /* synthetic */ void s(com.google.android.gms.internal.play_billing.F1 f9, long j) {
        f9.zzd |= 4;
        f9.zzg = j;
    }

    public static /* synthetic */ void t(com.google.android.gms.internal.play_billing.F1 f9) {
        f9.zzd |= 32;
        f9.zzj = 0;
    }

    public static /* synthetic */ void u(com.google.android.gms.internal.play_billing.F1 f9) {
        f9.zzd |= 2;
        f9.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.F1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.E1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
