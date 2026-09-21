package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.i3 zzb;
    private int zzd;
    private double zze;
    private int zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.cast.i3 i3Var = new com.google.android.gms.internal.cast.i3();
        zzb = i3Var;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.i3.class, i3Var);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002᠌\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", com.google.android.gms.internal.cast.C1799u0.f19102p, "zzg", com.google.android.gms.internal.cast.C1799u0.f19101o});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.i3();
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
