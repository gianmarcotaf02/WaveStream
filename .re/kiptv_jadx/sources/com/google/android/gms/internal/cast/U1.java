package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class U1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.U1 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        com.google.android.gms.internal.cast.U1 u1 = new com.google.android.gms.internal.cast.U1();
        zzb = u1;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.U1.class, u1);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.C1787r0.f19033D, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.U1();
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
