package com.google.android.gms.internal.cast;

public final class V0 extends E2 {
    private static final V0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        V0 v6 = new V0();
        zzb = v6;
        E2.f(V0.class, v6);
    }

    public static U0 n() {
        return (U0) zzb.l();
    }

    public static void o(V0 v6, int i3) {
        v6.zzd |= 2;
        v6.zzf = i3;
    }

    public static void p(V0 v6, int i3) {
        v6.zzd |= 4;
        v6.zzg = i3;
    }

    public static void q(V0 v6, int i3) {
        v6.zzd |= 8;
        v6.zzh = i3;
    }

    public static void r(V0 v6, int i3) {
        v6.zze = i3 - 1;
        v6.zzd |= 1;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzd", "zze", C1787r0.f19053v, "zzf", "zzg", "zzh"});
        }
        if (i9 == 3) {
            return new V0();
        }
        if (i9 == 4) {
            return new U0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
