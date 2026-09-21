package com.google.android.gms.internal.play_billing;

public final class C1835e0 extends AbstractC1877v0 {
    private static final C1835e0 zzb;
    private int zzd;
    private String zze = "";

    static {
        C1835e0 c1835e0 = new C1835e0();
        zzb = c1835e0;
        AbstractC1877v0.f(C1835e0.class, c1835e0);
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new C1835e0();
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
