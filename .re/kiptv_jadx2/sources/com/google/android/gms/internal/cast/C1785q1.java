package com.google.android.gms.internal.cast;

public final class C1785q1 extends E2 {
    private static final C1785q1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private byte zzh = 2;

    static {
        C1785q1 c1785q1 = new C1785q1();
        zzb = c1785q1;
        E2.f(C1785q1.class, c1785q1);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᴌ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", C1787r0.f19035b, "zzf", "zzg", C1799u0.f19097k});
        }
        if (i9 == 3) {
            return new C1785q1();
        }
        if (i9 == 4) {
            return new C1772n0(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzh = e6 == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
