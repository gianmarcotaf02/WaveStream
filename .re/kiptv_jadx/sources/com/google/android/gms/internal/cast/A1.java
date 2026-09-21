package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class A1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.A1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.cast.A1 a2 = new com.google.android.gms.internal.cast.A1();
        zzb = a2;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.A1.class, a2);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", com.google.android.gms.internal.cast.C1787r0.g, "zzg"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.A1();
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
