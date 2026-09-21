package com.google.android.gms.internal.cast;

public final class k3 extends E2 {
    private static final k3 zzb;
    private I2 zzd = V2.f18829k;

    static {
        k3 k3Var = new k3();
        zzb = k3Var;
        E2.f(k3.class, k3Var);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", l3.class});
        }
        if (i9 == 3) {
            return new k3();
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
