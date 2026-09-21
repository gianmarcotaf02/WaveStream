package com.google.android.gms.internal.cast;

public final class C1816y1 extends E2 {
    private static final C1816y1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C1816y1 c1816y1 = new C1816y1();
        zzb = c1816y1;
        E2.f(C1816y1.class, c1816y1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new C1816y1();
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
