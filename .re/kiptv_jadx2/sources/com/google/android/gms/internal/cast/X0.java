package com.google.android.gms.internal.cast;

public final class X0 extends E2 {
    private static final X0 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        X0 x9 = new X0();
        zzb = x9;
        E2.f(X0.class, x9);
    }

    public static W0 n() {
        return (W0) zzb.l();
    }

    public static void o(X0 x9, int i3) {
        x9.zzd |= 2;
        x9.zzf = i3;
    }

    public static void p(X0 x9, int i3) {
        x9.zze = i3 - 1;
        x9.zzd |= 1;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", C1787r0.y, "zzf"});
        }
        if (i9 == 3) {
            return new X0();
        }
        if (i9 == 4) {
            return new W0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
