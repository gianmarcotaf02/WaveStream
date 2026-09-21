package com.google.android.gms.internal.cast;

public final class H1 extends E2 {
    private static final H1 zzb;
    private int zzd;
    private C1819z0 zze;

    static {
        H1 h9 = new H1();
        zzb = h9;
        E2.f(H1.class, h9);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new H1();
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
