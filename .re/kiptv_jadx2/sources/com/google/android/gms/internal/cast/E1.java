package com.google.android.gms.internal.cast;

public final class E1 extends E2 {
    private static final E1 zzb;
    private int zzd;
    private C1737e1 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private I2 zzk = V2.f18829k;

    static {
        E1 e6 = new E1();
        zzb = e6;
        E2.f(E1.class, e6);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007\u001b", new Object[]{"zzd", "zze", "zzf", C1787r0.f19043l, "zzg", C1787r0.f19042k, "zzh", C1762k2.f18971x, "zzi", C1762k2.f18961n, "zzj", "zzk", C1737e1.class});
        }
        if (i9 == 3) {
            return new E1();
        }
        if (i9 == 4) {
            return new C1808w1(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
