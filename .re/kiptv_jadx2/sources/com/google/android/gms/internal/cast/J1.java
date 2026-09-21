package com.google.android.gms.internal.cast;

public final class J1 extends E2 {
    private static final J1 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        J1 j9 = new J1();
        zzb = j9;
        E2.f(J1.class, j9);
    }

    public static I1 n() {
        return (I1) zzb.l();
    }

    public static void o(J1 j9, String str) {
        str.getClass();
        j9.zzd |= 8;
        j9.zzh = str;
    }

    public static void p(J1 j9, String str) {
        str.getClass();
        j9.zzd |= 16;
        j9.zzi = str;
    }

    public static void q(J1 j9, String str) {
        str.getClass();
        j9.zzd |= 1;
        j9.zze = str;
    }

    public static void r(J1 j9, String str) {
        str.getClass();
        j9.zzd |= 2;
        j9.zzf = str;
    }

    public static void s(J1 j9, String str) {
        str.getClass();
        j9.zzd |= 4;
        j9.zzg = str;
    }

    public static void t(J1 j9, String str) {
        str.getClass();
        j9.zzd |= 32;
        j9.zzj = str;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new J1();
        }
        if (i9 == 4) {
            return new I1(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
