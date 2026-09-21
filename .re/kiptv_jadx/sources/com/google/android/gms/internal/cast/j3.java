package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.j3 zzb;
    private com.google.android.gms.internal.cast.I2 zzd;
    private com.google.android.gms.internal.cast.I2 zze;
    private com.google.android.gms.internal.cast.I2 zzf;
    private com.google.android.gms.internal.cast.I2 zzg;

    static {
        com.google.android.gms.internal.cast.j3 j3Var = new com.google.android.gms.internal.cast.j3();
        zzb = j3Var;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.j3.class, j3Var);
    }

    public j3() {
        com.google.android.gms.internal.cast.V2 v6 = com.google.android.gms.internal.cast.V2.f18829k;
        this.zzd = v6;
        this.zze = v6;
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
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new java.lang.Object[]{"zzd", com.google.android.gms.internal.cast.i3.class, "zze", com.google.android.gms.internal.cast.h3.class, "zzf", com.google.android.gms.internal.cast.i3.class, "zzg", com.google.android.gms.internal.cast.h3.class});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.j3();
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
