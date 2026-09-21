package com.google.android.gms.internal.cast;

public final class B1 extends E2 {
    private static final B1 zzb;
    private int zzd;
    private I2 zze;
    private I2 zzf;
    private H1 zzg;

    static {
        B1 b9 = new B1();
        zzb = b9;
        E2.f(B1.class, b9);
    }

    public B1() {
        V2 v6 = V2.f18829k;
        this.zze = v6;
        this.zzf = v6;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zzd", "zze", R1.class, "zzf", C1729c1.class, "zzg"});
        }
        if (i9 == 3) {
            return new B1();
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
