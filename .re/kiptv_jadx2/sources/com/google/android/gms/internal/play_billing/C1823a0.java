package com.google.android.gms.internal.play_billing;

public final class C1823a0 extends AbstractC1877v0 {
    private static final C1823a0 zzb;
    private int zzd;
    private C1835e0 zze;
    private C1835e0 zzf;
    private int zzg;

    static {
        C1823a0 c1823a0 = new C1823a0();
        zzb = c1823a0;
        AbstractC1877v0.f(C1823a0.class, c1823a0);
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", C1838f0.f19323b});
        }
        if (i9 == 3) {
            return new C1823a0();
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
