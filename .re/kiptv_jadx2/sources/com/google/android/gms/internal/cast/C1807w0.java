package com.google.android.gms.internal.cast;

public final class C1807w0 extends E2 {
    private static final C1807w0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private G2 zzg = F2.f18771k;

    static {
        C1807w0 c1807w0 = new C1807w0();
        zzb = c1807w0;
        E2.f(C1807w0.class, c1807w0);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"zzd", "zze", "zzf", "zzg", C1799u0.f19096i});
        }
        if (i9 == 3) {
            return new C1807w0();
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
