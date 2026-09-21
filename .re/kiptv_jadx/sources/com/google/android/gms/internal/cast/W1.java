package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class W1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.W1 zzb;
    private int zzd;
    private java.lang.String zze = "";
    private long zzf;
    private long zzg;
    private com.google.android.gms.internal.cast.X1 zzh;

    static {
        com.google.android.gms.internal.cast.W1 w6 = new com.google.android.gms.internal.cast.W1();
        zzb = w6;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.W1.class, w6);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.W1();
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
