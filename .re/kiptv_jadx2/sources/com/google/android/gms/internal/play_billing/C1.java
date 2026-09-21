package com.google.android.gms.internal.play_billing;

public final class C1 extends AbstractC1877v0 {
    private static final C1 zzb;
    private int zzd;
    private C1860m1 zze;
    private long zzf;

    static {
        C1 c9 = new C1();
        zzb = c9;
        AbstractC1877v0.f(C1.class, c9);
    }

    public static B1 p() {
        return (B1) zzb.k();
    }

    public static void q(C1 c9, C1860m1 c1860m1) {
        c9.zze = c1860m1;
        c9.zzd |= 1;
    }

    public static void r(C1 c9, long j) {
        c9.zzd |= 2;
        c9.zzf = j;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new C1();
        }
        if (i9 == 4) {
            return new B1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
