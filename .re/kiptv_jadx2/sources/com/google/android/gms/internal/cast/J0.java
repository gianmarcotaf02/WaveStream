package com.google.android.gms.internal.cast;

public final class J0 extends E2 {
    private static final J0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    static {
        J0 j9 = new J0();
        zzb = j9;
        E2.f(J0.class, j9);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", C1787r0.j, "zzf", C1787r0.f19040h, "zzg", C1787r0.f19041i, "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new J0();
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
