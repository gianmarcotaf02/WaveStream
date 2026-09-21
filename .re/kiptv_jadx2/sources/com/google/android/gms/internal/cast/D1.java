package com.google.android.gms.internal.cast;

public final class D1 extends E2 {
    private static final D1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        D1 d4 = new D1();
        zzb = d4;
        E2.f(D1.class, d4);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            C1787r0 c1787r0 = C1787r0.j;
            return new W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", c1787r0, "zzf", c1787r0});
        }
        if (i9 == 3) {
            return new D1();
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
