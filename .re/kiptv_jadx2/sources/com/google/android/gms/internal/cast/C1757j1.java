package com.google.android.gms.internal.cast;

public final class C1757j1 extends E2 {
    private static final C1757j1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private G2 zzg;
    private G2 zzh;
    private I2 zzi;
    private I2 zzj;
    private int zzk;

    static {
        C1757j1 c1757j1 = new C1757j1();
        zzb = c1757j1;
        E2.f(C1757j1.class, c1757j1);
    }

    public C1757j1() {
        F2 f9 = F2.f18771k;
        this.zzg = f9;
        this.zzh = f9;
        V2 v6 = V2.f18829k;
        this.zzi = v6;
        this.zzj = v6;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001င\u0000\u0002᠌\u0001\u0003\u0016\u0004\u0016\u0005\u001a\u0006\u001a\u0007᠌\u0002", new Object[]{"zzd", "zze", "zzf", C1762k2.f18947B, "zzg", "zzh", "zzi", "zzj", "zzk", C1762k2.f18971x});
        }
        if (i9 == 3) {
            return new C1757j1();
        }
        if (i9 == 4) {
            return new C1772n0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
