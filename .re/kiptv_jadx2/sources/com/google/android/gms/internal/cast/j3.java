package com.google.android.gms.internal.cast;

public final class j3 extends E2 {
    private static final j3 zzb;
    private I2 zzd;
    private I2 zze;
    private I2 zzf;
    private I2 zzg;

    static {
        j3 j3Var = new j3();
        zzb = j3Var;
        E2.f(j3.class, j3Var);
    }

    public j3() {
        V2 v6 = V2.f18829k;
        this.zzd = v6;
        this.zze = v6;
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
            return new W2(zzb, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"zzd", i3.class, "zze", h3.class, "zzf", i3.class, "zzg", h3.class});
        }
        if (i9 == 3) {
            return new j3();
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
