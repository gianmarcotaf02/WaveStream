package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.D1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.cast.D1 d4 = new com.google.android.gms.internal.cast.D1();
        zzb = d4;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.D1.class, d4);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            com.google.android.gms.internal.cast.C1787r0 c1787r0 = com.google.android.gms.internal.cast.C1787r0.j;
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new java.lang.Object[]{"zzd", "zze", c1787r0, "zzf", c1787r0});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.D1();
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
