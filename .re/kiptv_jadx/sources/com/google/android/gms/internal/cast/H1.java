package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class H1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.H1 zzb;
    private int zzd;
    private com.google.android.gms.internal.cast.C1819z0 zze;

    static {
        com.google.android.gms.internal.cast.H1 h9 = new com.google.android.gms.internal.cast.H1();
        zzb = h9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.H1.class, h9);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.H1();
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
