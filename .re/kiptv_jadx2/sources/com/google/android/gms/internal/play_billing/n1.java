package com.google.android.gms.internal.play_billing;

public final class n1 extends AbstractC1877v0 {
    private static final n1 zzb;

    static {
        n1 n1Var = new n1();
        zzb = n1Var;
        AbstractC1877v0.f(n1.class, n1Var);
    }

    public static n1 p() {
        return zzb;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0000", null);
        }
        if (i9 == 3) {
            return new n1();
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
