package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1800u1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C1800u1 zzb;
    private int zzd;
    private long zze;
    private com.google.android.gms.internal.cast.H2 zzf;
    private com.google.android.gms.internal.cast.H2 zzg;

    static {
        com.google.android.gms.internal.cast.C1800u1 c1800u1 = new com.google.android.gms.internal.cast.C1800u1();
        zzb = c1800u1;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C1800u1.class, c1800u1);
    }

    public C1800u1() {
        com.google.android.gms.internal.cast.M2 m8 = com.google.android.gms.internal.cast.M2.f18795k;
        this.zzf = m8;
        this.zzg = m8;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.C1800u1();
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
