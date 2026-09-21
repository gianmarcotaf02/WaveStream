package com.google.android.gms.internal.cast;

public final class C1753i1 extends E2 {
    private static final C1753i1 zzb;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private V1 zzh;
    private boolean zzi;
    private long zzk;
    private long zzl;
    private String zze = "";
    private G2 zzj = F2.f18771k;

    static {
        C1753i1 c1753i1 = new C1753i1();
        zzb = c1753i1;
        E2.f(C1753i1.class, c1753i1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0003\u0004ဇ\u0004\u0005ࠬ\u0006ဇ\u0002\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzd", "zze", "zzf", "zzh", "zzi", "zzj", C1787r0.f19032C, "zzg", "zzk", "zzl"});
        }
        if (i9 == 3) {
            return new C1753i1();
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
