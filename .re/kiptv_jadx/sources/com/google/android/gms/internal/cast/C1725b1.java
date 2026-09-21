package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1725b1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C1725b1 zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private long zzg;

    static {
        com.google.android.gms.internal.cast.C1725b1 c1725b1 = new com.google.android.gms.internal.cast.C1725b1();
        zzb = c1725b1;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C1725b1.class, c1725b1);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001စ\u0000\u0002:\u0000\u00035\u0000\u00048\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.C1725b1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.C1772n0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
