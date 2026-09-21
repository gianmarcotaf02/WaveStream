package com.google.android.gms.internal.cast;

public final class C1761k1 extends E2 {
    private static final C1761k1 zzb;
    private int zzd;
    private int zze;

    static {
        C1761k1 c1761k1 = new C1761k1();
        zzb = c1761k1;
        E2.f(C1761k1.class, c1761k1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C1762k2.f18947B});
        }
        if (i9 == 3) {
            return new C1761k1();
        }
        if (i9 == 4) {
            return new C1772n0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
