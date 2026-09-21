package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.k3 zzb;
    private com.google.android.gms.internal.cast.I2 zzd = com.google.android.gms.internal.cast.V2.f18829k;

    static {
        com.google.android.gms.internal.cast.k3 k3Var = new com.google.android.gms.internal.cast.k3();
        zzb = k3Var;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.k3.class, k3Var);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzd", com.google.android.gms.internal.cast.l3.class});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.k3();
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
