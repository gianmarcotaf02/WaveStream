package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class G1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.G1 zzb;
    private int zzd;
    private java.lang.String zze = "";
    private com.google.android.gms.internal.cast.I2 zzf;
    private com.google.android.gms.internal.cast.I2 zzg;
    private boolean zzh;

    static {
        com.google.android.gms.internal.cast.G1 g9 = new com.google.android.gms.internal.cast.G1();
        zzb = g9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.G1.class, g9);
    }

    public G1() {
        com.google.android.gms.internal.cast.V2 v6 = com.google.android.gms.internal.cast.V2.f18829k;
        this.zzf = v6;
        this.zzg = v6;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf", com.google.android.gms.internal.cast.C1765l1.class, "zzg", com.google.android.gms.internal.cast.C1737e1.class, "zzh"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.G1();
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
