package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.X0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.cast.X0 x9 = new com.google.android.gms.internal.cast.X0();
        zzb = x9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.X0.class, x9);
    }

    public static com.google.android.gms.internal.cast.W0 n() {
        return (com.google.android.gms.internal.cast.W0) zzb.l();
    }

    public static /* synthetic */ void o(com.google.android.gms.internal.cast.X0 x9, int i3) {
        x9.zzd |= 2;
        x9.zzf = i3;
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.cast.X0 x9, int i3) {
        x9.zze = i3 - 1;
        x9.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.C1787r0.y, "zzf"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.X0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.W0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
