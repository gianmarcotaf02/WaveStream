package com.google.android.gms.internal.play_billing;

public final class D1 extends AbstractC1877v0 {
    private static final D1 zzb;
    private int zzd;
    private int zze;

    static {
        D1 d4 = new D1();
        zzb = d4;
        AbstractC1877v0.f(D1.class, d4);
    }

    public static D1 p() {
        return zzb;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C1838f0.f19329i});
        }
        if (i9 == 3) {
            return new D1();
        }
        if (i9 == 4) {
            return new Z(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
