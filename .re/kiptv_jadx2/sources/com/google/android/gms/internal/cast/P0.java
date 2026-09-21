package com.google.android.gms.internal.cast;

public final class P0 extends E2 {
    private static final P0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        P0 p2 = new P0();
        zzb = p2;
        E2.f(P0.class, p2);
    }

    public static O0 n() {
        return (O0) zzb.l();
    }

    public static void o(P0 p2, int i3) {
        p2.zzd |= 2;
        p2.zzf = i3;
    }

    public static void p(P0 p2, int i3) {
        p2.zze = i3 - 1;
        p2.zzd |= 1;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", C1787r0.f19051t, "zzf"});
        }
        if (i9 == 3) {
            return new P0();
        }
        if (i9 == 4) {
            return new O0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
