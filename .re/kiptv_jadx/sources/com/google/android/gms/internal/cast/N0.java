package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.N0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        com.google.android.gms.internal.cast.N0 n3 = new com.google.android.gms.internal.cast.N0();
        zzb = n3;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.N0.class, n3);
    }

    public static com.google.android.gms.internal.cast.M0 n() {
        return (com.google.android.gms.internal.cast.M0) zzb.l();
    }

    public static /* synthetic */ void o(com.google.android.gms.internal.cast.N0 n3, int i3) {
        n3.zzd |= 16;
        n3.zzi = i3;
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.cast.N0 n3, int i3) {
        n3.zzd |= 2;
        n3.zzf = i3;
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.cast.N0 n3, int i3) {
        n3.zzd |= 8;
        n3.zzh = i3;
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.cast.N0 n3, int i3) {
        n3.zzd |= 4;
        n3.zzg = i3;
    }

    public static /* synthetic */ void s(com.google.android.gms.internal.cast.N0 n3, int i3) {
        n3.zze = i3 - 1;
        n3.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.C1787r0.f19050s, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.N0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.M0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
