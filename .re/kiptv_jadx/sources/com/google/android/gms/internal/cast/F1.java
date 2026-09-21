package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.F1 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private com.google.android.gms.internal.cast.I2 zzg = com.google.android.gms.internal.cast.V2.f18829k;

    static {
        com.google.android.gms.internal.cast.F1 f9 = new com.google.android.gms.internal.cast.F1();
        zzb = f9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.F1.class, f9);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.cast.G1.class});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.F1();
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
