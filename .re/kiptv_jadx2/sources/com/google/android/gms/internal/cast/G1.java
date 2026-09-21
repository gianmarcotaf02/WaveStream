package com.google.android.gms.internal.cast;

public final class G1 extends E2 {
    private static final G1 zzb;
    private int zzd;
    private String zze = "";
    private I2 zzf;
    private I2 zzg;
    private boolean zzh;

    static {
        G1 g9 = new G1();
        zzb = g9;
        E2.f(G1.class, g9);
    }

    public G1() {
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
            return new W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001", new Object[]{"zzd", "zze", "zzf", C1765l1.class, "zzg", C1737e1.class, "zzh"});
        }
        if (i9 == 3) {
            return new G1();
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
