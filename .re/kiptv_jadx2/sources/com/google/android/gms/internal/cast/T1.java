package com.google.android.gms.internal.cast;

public final class T1 extends E2 {
    private static final T1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private I2 zzg;
    private I2 zzh;
    private int zzi;
    private G2 zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        T1 t9 = new T1();
        zzb = t9;
        E2.f(T1.class, t9);
    }

    public T1() {
        V2 v6 = V2.f18829k;
        this.zzg = v6;
        this.zzh = v6;
        this.zzj = F2.f18771k;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            C1787r0 c1787r0 = C1787r0.f19030A;
            return new W2(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u001b\u0004\u001b\u0005᠌\u0002\u0006ࠬ\u0007ဇ\u0003\bဇ\u0004", new Object[]{"zzd", "zze", c1787r0, "zzf", C1787r0.f19031B, "zzg", C1737e1.class, "zzh", C1737e1.class, "zzi", C1762k2.f18971x, "zzj", c1787r0, "zzk", "zzl"});
        }
        if (i9 == 3) {
            return new T1();
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
