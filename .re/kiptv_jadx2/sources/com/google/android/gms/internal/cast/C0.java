package com.google.android.gms.internal.cast;

public final class C0 extends E2 {
    private static final C0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C0 c9 = new C0();
        zzb = c9;
        E2.f(C0.class, c9);
    }

    public static B0 n() {
        return (B0) zzb.l();
    }

    public static void o(C0 c9, String str) {
        str.getClass();
        c9.zzd |= 1;
        c9.zze = str;
    }

    public static void p(C0 c9, String str) {
        str.getClass();
        c9.zzd |= 2;
        c9.zzf = str;
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
            return new C0();
        }
        if (i9 == 4) {
            return new B0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
