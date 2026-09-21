package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class B1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.B1 zzb;
    private int zzd;
    private com.google.android.gms.internal.cast.I2 zze;
    private com.google.android.gms.internal.cast.I2 zzf;
    private com.google.android.gms.internal.cast.H1 zzg;

    static {
        com.google.android.gms.internal.cast.B1 b9 = new com.google.android.gms.internal.cast.B1();
        zzb = b9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.B1.class, b9);
    }

    public B1() {
        com.google.android.gms.internal.cast.V2 v6 = com.google.android.gms.internal.cast.V2.f18829k;
        this.zze = v6;
        this.zzf = v6;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.R1.class, "zzf", com.google.android.gms.internal.cast.C1729c1.class, "zzg"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.B1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.C1808w1(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
