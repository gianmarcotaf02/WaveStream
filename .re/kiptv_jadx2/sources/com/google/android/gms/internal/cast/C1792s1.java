package com.google.android.gms.internal.cast;

public final class C1792s1 extends E2 {
    private static final C1792s1 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        C1792s1 c1792s1 = new C1792s1();
        zzb = c1792s1;
        E2.f(C1792s1.class, c1792s1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", C1787r0.f19036c, "zzf", "zzg", C1762k2.f18961n});
        }
        if (i9 == 3) {
            return new C1792s1();
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
