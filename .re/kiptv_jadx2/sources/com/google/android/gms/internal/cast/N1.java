package com.google.android.gms.internal.cast;

public final class N1 extends E2 {
    private static final N1 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private I2 zzg;
    private I2 zzh;
    private I2 zzi;

    static {
        N1 n3 = new N1();
        zzb = n3;
        E2.f(N1.class, n3);
    }

    public N1() {
        V2 v6 = V2.f18829k;
        this.zzg = v6;
        this.zzh = v6;
        this.zzi = v6;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b", new Object[]{"zzd", "zze", C1787r0.f19047p, "zzf", "zzg", J1.class, "zzh", N0.class, "zzi", M1.class});
        }
        if (i9 == 3) {
            return new N1();
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
