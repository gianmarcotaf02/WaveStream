package com.google.android.gms.internal.cast;

public final class C1777o1 extends E2 {
    private static final C1777o1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private C1765l1 zzg;

    static {
        C1777o1 c1777o1 = new C1777o1();
        zzb = c1777o1;
        E2.f(C1777o1.class, c1777o1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new C1777o1();
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
