package com.google.android.gms.internal.cast;

public final class F0 extends E2 {
    private static final F0 zzb;
    private int zzd;
    private C1737e1 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private D1 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        F0 f9 = new F0();
        zzb = f9;
        E2.f(F0.class, f9);
    }

    public static E0 n() {
        return (E0) zzb.l();
    }

    public static E0 o(F0 f9) {
        D2 d2L = zzb.l();
        E2 e6 = d2L.f18765h;
        if (!e6.equals(f9)) {
            if (!d2L.f18766i.i()) {
                E2 e9 = (E2) e6.j(4, null);
                U2.f18826c.a(e9.getClass()).c(e9, d2L.f18766i);
                d2L.f18766i = e9;
            }
            E2 e10 = d2L.f18766i;
            U2.f18826c.a(e10.getClass()).c(e10, f9);
        }
        return (E0) d2L;
    }

    public static F0 p() {
        return zzb;
    }

    public static void q(F0 f9, C1737e1 c1737e1) {
        f9.zze = c1737e1;
        f9.zzd |= 1;
    }

    public static void r(F0 f9, int i3) {
        f9.zzd |= 1024;
        f9.zzo = i3;
    }

    public static void s(F0 f9, int i3) {
        f9.zzd |= 128;
        f9.zzl = i3;
    }

    public static void t(F0 f9, boolean z6) {
        f9.zzd |= 2048;
        f9.zzp = z6;
    }

    public static void u(F0 f9, boolean z6) {
        f9.zzd |= 16384;
        f9.zzs = z6;
    }

    public static void v(F0 f9, boolean z6) {
        f9.zzd |= 2;
        f9.zzf = z6;
    }

    public static void w(F0 f9, int i3) {
        f9.zzd |= 64;
        f9.zzk = i3;
    }

    public static void x(F0 f9, long j) {
        f9.zzd |= 4;
        f9.zzg = j;
    }

    public static void y(F0 f9, int i3) {
        f9.zzd |= 8192;
        f9.zzr = i3;
    }

    public static void z(F0 f9, int i3) {
        f9.zzd |= 4096;
        f9.zzq = i3;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", C1762k2.f18959l, "zzj", C1762k2.f18958k, "zzk", "zzl", "zzm", "zzn", C1762k2.y, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i9 == 3) {
            return new F0();
        }
        if (i9 == 4) {
            return new E0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
