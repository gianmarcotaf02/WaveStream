package com.google.android.gms.internal.cast;

public final class C1737e1 extends E2 {
    private static final C1737e1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C1737e1 c1737e1 = new C1737e1();
        zzb = c1737e1;
        E2.f(C1737e1.class, c1737e1);
    }

    public static C1733d1 n() {
        return (C1733d1) zzb.l();
    }

    public static void o(C1737e1 c1737e1, String str) {
        str.getClass();
        c1737e1.zzd |= 1;
        c1737e1.zze = str;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new C1737e1();
        }
        if (i9 == 4) {
            return new C1733d1(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
