package com.google.android.gms.internal.cast;

public final class C1769m1 extends E2 {
    private static final C1769m1 zzb;
    private int zzd;
    private I2 zze = V2.f18829k;
    private boolean zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;

    static {
        C1769m1 c1769m1 = new C1769m1();
        zzb = c1769m1;
        E2.f(C1769m1.class, c1769m1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\u0005", new Object[]{"zzd", "zze", C1753i1.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i9 == 3) {
            return new C1769m1();
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
