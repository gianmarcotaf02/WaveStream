package com.google.android.gms.internal.play_billing;

public final class C1860m1 extends AbstractC1877v0 {
    private static final C1860m1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        C1860m1 c1860m1 = new C1860m1();
        zzb = c1860m1;
        AbstractC1877v0.f(C1860m1.class, c1860m1);
    }

    public static void p(C1860m1 c1860m1, int i3) {
        c1860m1.zzd |= 1;
        c1860m1.zze = i3;
    }

    public static C1857l1 q() {
        return (C1857l1) zzb.k();
    }

    public static void r(C1860m1 c1860m1, String str) {
        c1860m1.zzd |= 8;
        c1860m1.zzh = str;
    }

    public static void s(C1860m1 c1860m1, String str) {
        str.getClass();
        c1860m1.zzd |= 2;
        c1860m1.zzf = str;
    }

    public static void t(C1860m1 c1860m1) {
        c1860m1.zzd |= 32;
        c1860m1.zzj = 0;
    }

    public static void u(C1860m1 c1860m1, int i3) {
        c1860m1.zzd |= 16;
        c1860m1.zzi = i3;
    }

    public static void v(C1860m1 c1860m1, int i3) {
        c1860m1.zzg = M0.b(i3);
        c1860m1.zzd |= 4;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", C1838f0.f19325d, "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new C1860m1();
        }
        if (i9 == 4) {
            return new C1857l1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
