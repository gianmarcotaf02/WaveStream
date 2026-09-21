package com.google.android.gms.internal.cast;

public final class N0 extends E2 {
    private static final N0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        N0 n3 = new N0();
        zzb = n3;
        E2.f(N0.class, n3);
    }

    public static M0 n() {
        return (M0) zzb.l();
    }

    public static void o(N0 n3, int i3) {
        n3.zzd |= 16;
        n3.zzi = i3;
    }

    public static void p(N0 n3, int i3) {
        n3.zzd |= 2;
        n3.zzf = i3;
    }

    public static void q(N0 n3, int i3) {
        n3.zzd |= 8;
        n3.zzh = i3;
    }

    public static void r(N0 n3, int i3) {
        n3.zzd |= 4;
        n3.zzg = i3;
    }

    public static void s(N0 n3, int i3) {
        n3.zze = i3 - 1;
        n3.zzd |= 1;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzd", "zze", C1787r0.f19050s, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new N0();
        }
        if (i9 == 4) {
            return new M0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
