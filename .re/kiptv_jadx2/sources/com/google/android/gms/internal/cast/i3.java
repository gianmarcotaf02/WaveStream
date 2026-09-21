package com.google.android.gms.internal.cast;

public final class i3 extends E2 {
    private static final i3 zzb;
    private int zzd;
    private double zze;
    private int zzf;
    private int zzg;

    static {
        i3 i3Var = new i3();
        zzb = i3Var;
        E2.f(i3.class, i3Var);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", C1799u0.f19102p, "zzg", C1799u0.f19101o});
        }
        if (i9 == 3) {
            return new i3();
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
