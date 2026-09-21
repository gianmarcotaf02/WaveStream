package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1785q1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C1785q1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        com.google.android.gms.internal.cast.C1785q1 c1785q1 = new com.google.android.gms.internal.cast.C1785q1();
        zzb = c1785q1;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C1785q1.class, c1785q1);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return java.lang.Byte.valueOf(this.zzh);
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.C1787r0.f19035b, "zzf", "zzg", com.google.android.gms.internal.cast.C1799u0.f19097k});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.C1785q1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.C1772n0(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzh = e6 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
