package com.google.android.gms.internal.cast;

public final class R0 extends E2 {
    private static final R0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;

    static {
        R0 r9 = new R0();
        zzb = r9;
        E2.f(R0.class, r9);
    }

    public static Q0 n() {
        return (Q0) zzb.l();
    }

    public static void o(R0 r9, boolean z6) {
        r9.zzd |= 8;
        r9.zzh = z6;
    }

    public static void p(R0 r9, int i3) {
        r9.zzd |= 4;
        r9.zzg = i3;
    }

    public static void q(R0 r9, long j) {
        r9.zzd |= 16;
        r9.zzi = j;
    }

    public static void r(R0 r9, int i3) {
        r9.zzd |= 2;
        r9.zzf = i3;
    }

    public static void s(R0 r9, int i3) {
        r9.zze = i3 - 1;
        r9.zzd |= 1;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new Object[]{"zzd", "zze", C1787r0.f19052u, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new R0();
        }
        if (i9 == 4) {
            return new Q0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
