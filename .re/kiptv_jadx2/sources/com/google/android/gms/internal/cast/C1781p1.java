package com.google.android.gms.internal.cast;

public final class C1781p1 extends E2 {
    private static final C1781p1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C1781p1 c1781p1 = new C1781p1();
        zzb = c1781p1;
        E2.f(C1781p1.class, c1781p1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"zzd", "zze", C1762k2.f18970w, "zzf"});
        }
        if (i9 == 3) {
            return new C1781p1();
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
