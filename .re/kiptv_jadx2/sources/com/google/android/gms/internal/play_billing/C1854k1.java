package com.google.android.gms.internal.play_billing;

public final class C1854k1 extends AbstractC1877v0 {
    private static final C1854k1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        C1854k1 c1854k1 = new C1854k1();
        zzb = c1854k1;
        AbstractC1877v0.f(C1854k1.class, c1854k1);
    }

    public static void p(C1854k1 c1854k1, int i3) {
        c1854k1.zzg = i3 - 1;
        c1854k1.zzd |= 1;
    }

    public static C1848i1 q() {
        return (C1848i1) zzb.k();
    }

    public static void s(C1854k1 c1854k1, o1 o1Var) {
        c1854k1.zzh = o1Var.f19368h;
        c1854k1.zzd |= 2;
    }

    public static void t(C1854k1 c1854k1, u1 u1Var) {
        c1854k1.zzf = u1Var;
        c1854k1.zze = 2;
    }

    public static void u(C1854k1 c1854k1, x1 x1Var) {
        c1854k1.zzf = x1Var;
        c1854k1.zze = 4;
    }

    public static void v(C1854k1 c1854k1, F1 f9) {
        c1854k1.zzf = f9;
        c1854k1.zze = 3;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", C1838f0.f19324c, u1.class, F1.class, x1.class, "zzh", C1838f0.f19326e});
        }
        if (i9 == 3) {
            return new C1854k1();
        }
        if (i9 == 4) {
            return new C1848i1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }

    public final x1 r() {
        return this.zze == 4 ? (x1) this.zzf : x1.p();
    }
}
