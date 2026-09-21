package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class N1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.N1 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private com.google.android.gms.internal.cast.I2 zzg;
    private com.google.android.gms.internal.cast.I2 zzh;
    private com.google.android.gms.internal.cast.I2 zzi;

    static {
        com.google.android.gms.internal.cast.N1 n3 = new com.google.android.gms.internal.cast.N1();
        zzb = n3;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.N1.class, n3);
    }

    public N1() {
        com.google.android.gms.internal.cast.V2 v6 = com.google.android.gms.internal.cast.V2.f18829k;
        this.zzg = v6;
        this.zzh = v6;
        this.zzi = v6;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.C1787r0.f19047p, "zzf", "zzg", com.google.android.gms.internal.cast.J1.class, "zzh", com.google.android.gms.internal.cast.N0.class, "zzi", com.google.android.gms.internal.cast.M1.class});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.N1();
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
