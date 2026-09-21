package com.google.android.gms.internal.cast;

public final class F1 extends E2 {
    private static final F1 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private I2 zzg = V2.f18829k;

    static {
        F1 f9 = new F1();
        zzb = f9;
        E2.f(F1.class, f9);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", G1.class});
        }
        if (i9 == 3) {
            return new F1();
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
