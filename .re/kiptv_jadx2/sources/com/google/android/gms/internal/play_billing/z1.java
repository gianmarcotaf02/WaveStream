package com.google.android.gms.internal.play_billing;

public final class z1 extends AbstractC1877v0 {
    private static final z1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private r1 zzg;
    private s1 zzh;

    static {
        z1 z1Var = new z1();
        zzb = z1Var;
        AbstractC1877v0.f(z1.class, z1Var);
    }

    public static void p(z1 z1Var, D1 d4) {
        z1Var.zzf = d4;
        z1Var.zze = 4;
    }

    public static y1 q() {
        return (y1) zzb.k();
    }

    public static void r(z1 z1Var, C1845h1 c1845h1) {
        z1Var.zzf = c1845h1;
        z1Var.zze = 2;
    }

    public static void s(z1 z1Var, C1854k1 c1854k1) {
        z1Var.zzf = c1854k1;
        z1Var.zze = 3;
    }

    public static void t(z1 z1Var, n1 n1Var) {
        n1Var.getClass();
        z1Var.zzf = n1Var;
        z1Var.zze = 7;
    }

    public static void u(z1 z1Var, r1 r1Var) {
        r1Var.getClass();
        z1Var.zzg = r1Var;
        z1Var.zzd |= 1;
    }

    public static void v(z1 z1Var, C1 c9) {
        z1Var.zzf = c9;
        z1Var.zze = 8;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C1845h1.class, C1854k1.class, D1.class, p1.class, "zzh", n1.class, C1.class});
        }
        if (i9 == 3) {
            return new z1();
        }
        if (i9 == 4) {
            return new y1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
