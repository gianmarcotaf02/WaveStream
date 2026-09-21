package com.google.android.gms.internal.cast;

public final class A1 extends E2 {
    private static final A1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        A1 a2 = new A1();
        zzb = a2;
        E2.f(A1.class, a2);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", C1787r0.g, "zzg"});
        }
        if (i9 == 3) {
            return new A1();
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
