package com.google.android.gms.internal.cast;

public final class C1749h1 extends E2 {
    private static final C1749h1 zzb;
    private int zzd;
    private boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private C1796t1 zzi;
    private int zzj;
    private boolean zzk;

    static {
        C1749h1 c1749h1 = new C1749h1();
        zzb = c1749h1;
        E2.f(C1749h1.class, c1749h1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006᠌\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", C1762k2.f18971x, "zzg", C1762k2.f18972z, "zzh", C1762k2.f18960m, "zzi", "zzj", C1762k2.y, "zzk"});
        }
        if (i9 == 3) {
            return new C1749h1();
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
