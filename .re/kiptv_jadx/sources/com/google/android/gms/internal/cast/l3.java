package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class l3 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.l3 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.cast.l3 l3Var = new com.google.android.gms.internal.cast.l3();
        zzb = l3Var;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.l3.class, l3Var);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.l3();
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
