package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.V0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        com.google.android.gms.internal.cast.V0 v6 = new com.google.android.gms.internal.cast.V0();
        zzb = v6;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.V0.class, v6);
    }

    public static com.google.android.gms.internal.cast.U0 n() {
        return (com.google.android.gms.internal.cast.U0) zzb.l();
    }

    public static /* synthetic */ void o(com.google.android.gms.internal.cast.V0 v6, int i3) {
        v6.zzd |= 2;
        v6.zzf = i3;
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.cast.V0 v6, int i3) {
        v6.zzd |= 4;
        v6.zzg = i3;
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.cast.V0 v6, int i3) {
        v6.zzd |= 8;
        v6.zzh = i3;
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.cast.V0 v6, int i3) {
        v6.zze = i3 - 1;
        v6.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.C1787r0.f19053v, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.V0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.U0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
