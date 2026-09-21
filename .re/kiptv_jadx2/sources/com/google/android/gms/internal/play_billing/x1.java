package com.google.android.gms.internal.play_billing;

public final class x1 extends AbstractC1877v0 {
    private static final x1 zzb;
    private int zzd;
    private InterfaceC1885z0 zze = R0.f19280l;
    private String zzf = "";
    private boolean zzg;

    static {
        x1 x1Var = new x1();
        zzb = x1Var;
        AbstractC1877v0.f(x1.class, x1Var);
    }

    public static x1 p() {
        return zzb;
    }

    public static void q(x1 x1Var, boolean z6) {
        x1Var.zzd |= 2;
        x1Var.zzg = z6;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", w1.class, "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new x1();
        }
        if (i9 == 4) {
            return new v1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
