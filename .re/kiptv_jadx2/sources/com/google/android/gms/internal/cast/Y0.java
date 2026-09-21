package com.google.android.gms.internal.cast;

public final class Y0 extends E2 {
    private static final Y0 zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        Y0 y9 = new Y0();
        zzb = y9;
        E2.f(Y0.class, y9);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new Y0();
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
