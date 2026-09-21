package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1820z1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C1820z1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private java.lang.String zzh = "";
    private java.lang.String zzk = "";

    static {
        com.google.android.gms.internal.cast.C1820z1 c1820z1 = new com.google.android.gms.internal.cast.C1820z1();
        zzb = c1820z1;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C1820z1.class, c1820z1);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.C1820z1();
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
