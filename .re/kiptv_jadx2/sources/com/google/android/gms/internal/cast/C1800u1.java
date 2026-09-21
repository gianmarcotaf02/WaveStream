package com.google.android.gms.internal.cast;

public final class C1800u1 extends E2 {
    private static final C1800u1 zzb;
    private int zzd;
    private long zze;
    private H2 zzf;
    private H2 zzg;

    static {
        C1800u1 c1800u1 = new C1800u1();
        zzb = c1800u1;
        E2.f(C1800u1.class, c1800u1);
    }

    public C1800u1() {
        M2 m8 = M2.f18795k;
        this.zzf = m8;
        this.zzg = m8;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001စ\u0000\u0002\u0017\u0003\u0017", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i9 == 3) {
            return new C1800u1();
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
