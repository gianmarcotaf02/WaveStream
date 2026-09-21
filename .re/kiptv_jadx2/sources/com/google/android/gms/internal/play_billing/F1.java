package com.google.android.gms.internal.play_billing;

public final class F1 extends AbstractC1877v0 {
    private static final F1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        F1 f9 = new F1();
        zzb = f9;
        AbstractC1877v0.f(F1.class, f9);
    }

    public static E1 p() {
        return (E1) zzb.k();
    }

    public static void q(F1 f9, boolean z6) {
        f9.zzd |= 8;
        f9.zzh = z6;
    }

    public static void r(F1 f9) {
        f9.zzd |= 16;
        f9.zzi = 0;
    }

    public static void s(F1 f9, long j) {
        f9.zzd |= 4;
        f9.zzg = j;
    }

    public static void t(F1 f9) {
        f9.zzd |= 32;
        f9.zzj = 0;
    }

    public static void u(F1 f9) {
        f9.zzd |= 2;
        f9.zzf = true;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new F1();
        }
        if (i9 == 4) {
            return new E1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
