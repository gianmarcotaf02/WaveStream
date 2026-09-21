package com.google.android.gms.internal.cast;

public final class H0 extends E2 {
    private static final H0 zzb;
    private I2 zzd = V2.f18829k;

    static {
        H0 h9 = new H0();
        zzb = h9;
        E2.f(H0.class, h9);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i9 == 3) {
            return new H0();
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
