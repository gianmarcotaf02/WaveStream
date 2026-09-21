package com.google.android.gms.internal.cast;

public final class O1 extends E2 {
    private static final O1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private I2 zzg;
    private I2 zzh;

    static {
        O1 o8 = new O1();
        zzb = o8;
        E2.f(O1.class, o8);
    }

    public O1() {
        V2 v6 = V2.f18829k;
        this.zzg = v6;
        this.zzh = v6;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", C1787r0.f19048q, "zzf", "zzg", M1.class, "zzh", N1.class});
        }
        if (i9 == 3) {
            return new O1();
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
