package com.google.android.gms.internal.play_billing;

public final class A1 extends AbstractC1877v0 {
    private static final A1 zzb;
    private int zzd;
    private int zzf;
    private InterfaceC1885z0 zze = R0.f19280l;
    private String zzg = "";

    static {
        A1 a2 = new A1();
        zzb = a2;
        AbstractC1877v0.f(A1.class, a2);
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new A1();
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
