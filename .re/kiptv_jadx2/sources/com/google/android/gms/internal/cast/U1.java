package com.google.android.gms.internal.cast;

public final class U1 extends E2 {
    private static final U1 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        U1 u1 = new U1();
        zzb = u1;
        E2.f(U1.class, u1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", C1787r0.f19033D, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new U1();
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
