package com.google.android.gms.internal.play_billing;

public final class s1 extends AbstractC1877v0 {
    private static final s1 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        s1 s1Var = new s1();
        zzb = s1Var;
        AbstractC1877v0.f(s1.class, s1Var);
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new s1();
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
