package com.google.android.gms.internal.play_billing;

public final class w1 extends AbstractC1877v0 {
    private static final w1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        w1 w1Var = new w1();
        zzb = w1Var;
        AbstractC1877v0.f(w1.class, w1Var);
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C1838f0.f19328h, "zzf"});
        }
        if (i9 == 3) {
            return new w1();
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
