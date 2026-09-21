package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1819z0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C1819z0 zzb;
    private int zzd;
    private int zze;
    private double zzf;
    private double zzg;
    private double zzh;
    private double zzi;

    static {
        com.google.android.gms.internal.cast.C1819z0 c1819z0 = new com.google.android.gms.internal.cast.C1819z0();
        zzb = c1819z0;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C1819z0.class, c1819z0);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.C1819z0();
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
