package com.google.android.gms.internal.cast;

public final class V1 extends E2 {
    private static final V1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzh;
    private long zzj;
    private G2 zzg = F2.f18771k;
    private I2 zzi = V2.f18829k;

    static {
        V1 v6 = new V1();
        zzb = v6;
        E2.f(V1.class, v6);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠞ\u0005᠌\u0002\u0006\u001b\u0007ဂ\u0003", new Object[]{"zzd", "zze", C1787r0.f19033D, "zzf", C1762k2.f18971x, "zzg", C1787r0.f19032C, "zzh", C1762k2.f18965r, "zzi", U1.class, "zzj"});
        }
        if (i9 == 3) {
            return new V1();
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
