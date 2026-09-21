package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.P0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.cast.P0 p2 = new com.google.android.gms.internal.cast.P0();
        zzb = p2;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.P0.class, p2);
    }

    public static com.google.android.gms.internal.cast.O0 n() {
        return (com.google.android.gms.internal.cast.O0) zzb.l();
    }

    public static /* synthetic */ void o(com.google.android.gms.internal.cast.P0 p2, int i3) {
        p2.zzd |= 2;
        p2.zzf = i3;
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.cast.P0 p2, int i3) {
        p2.zze = i3 - 1;
        p2.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.C1787r0.f19051t, "zzf"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.P0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.O0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
