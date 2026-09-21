package com.google.android.gms.internal.play_billing;

public final class u1 extends AbstractC1877v0 {
    private static final u1 zzb;
    private int zzd;
    private int zze;

    static {
        u1 u1Var = new u1();
        zzb = u1Var;
        AbstractC1877v0.f(u1.class, u1Var);
    }

    public static t1 p() {
        return (t1) zzb.k();
    }

    public static void q(u1 u1Var, int i3) {
        u1Var.zze = i3 - 1;
        u1Var.zzd |= 1;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", C1838f0.g});
        }
        if (i9 == 3) {
            return new u1();
        }
        if (i9 == 4) {
            return new t1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
