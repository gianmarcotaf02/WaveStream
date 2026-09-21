package com.google.android.gms.internal.cast;

public final class l3 extends E2 {
    private static final l3 zzb;
    private int zzd;
    private long zze;
    private long zzf;
    private int zzg;

    static {
        l3 l3Var = new l3();
        zzb = l3Var;
        E2.f(l3.class, l3Var);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new l3();
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
