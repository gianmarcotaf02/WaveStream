package com.google.android.gms.internal.cast;

public final class S1 extends E2 {
    private static final S1 zzb;
    private int zzd;
    private int zze;
    private I2 zzf;
    private I2 zzg;
    private int zzh;

    static {
        S1 s9 = new S1();
        zzb = s9;
        E2.f(S1.class, s9);
    }

    public S1() {
        V2 v6 = V2.f18829k;
        this.zzf = v6;
        this.zzg = v6;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001᠌\u0000\u0002\u001b\u0003\u001b\u0004င\u0001", new Object[]{"zzd", "zze", C1787r0.f19056z, "zzf", C1816y1.class, "zzg", C1816y1.class, "zzh"});
        }
        if (i9 == 3) {
            return new S1();
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
