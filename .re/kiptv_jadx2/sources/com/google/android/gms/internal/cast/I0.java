package com.google.android.gms.internal.cast;

public final class I0 extends E2 {
    private static final I0 zzb;
    private int zzd;
    private int zze;

    static {
        I0 i3 = new I0();
        zzb = i3;
        E2.f(I0.class, i3);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C1762k2.f18962o});
        }
        if (i9 == 3) {
            return new I0();
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
