package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1816y1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C1816y1 zzb;
    private int zzd;
    private int zze;
    private java.lang.String zzf = "";

    static {
        com.google.android.gms.internal.cast.C1816y1 c1816y1 = new com.google.android.gms.internal.cast.C1816y1();
        zzb = c1816y1;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C1816y1.class, c1816y1);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.C1816y1();
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
