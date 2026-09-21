package com.google.android.gms.internal.cast;

public final class C1745g1 extends E2 {
    private static final C1745g1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private I2 zzh = V2.f18829k;

    static {
        C1745g1 c1745g1 = new C1745g1();
        zzb = c1745g1;
        E2.f(C1745g1.class, c1745g1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C1741f1.class});
        }
        if (i9 == 3) {
            return new C1745g1();
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
