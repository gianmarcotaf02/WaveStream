package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.z1 zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private com.google.android.gms.internal.play_billing.r1 zzg;
    private com.google.android.gms.internal.play_billing.s1 zzh;

    static {
        com.google.android.gms.internal.play_billing.z1 z1Var = new com.google.android.gms.internal.play_billing.z1();
        zzb = z1Var;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.z1.class, z1Var);
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.D1 d4) {
        z1Var.zzf = d4;
        z1Var.zze = 4;
    }

    public static com.google.android.gms.internal.play_billing.y1 q() {
        return (com.google.android.gms.internal.play_billing.y1) zzb.k();
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.C1845h1 c1845h1) {
        z1Var.zzf = c1845h1;
        z1Var.zze = 2;
    }

    public static /* synthetic */ void s(com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.C1854k1 c1854k1) {
        z1Var.zzf = c1854k1;
        z1Var.zze = 3;
    }

    public static /* synthetic */ void t(com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.n1 n1Var) {
        n1Var.getClass();
        z1Var.zzf = n1Var;
        z1Var.zze = 7;
    }

    public static /* synthetic */ void u(com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.r1 r1Var) {
        r1Var.getClass();
        z1Var.zzg = r1Var;
        z1Var.zzd |= 1;
    }

    public static /* synthetic */ void v(com.google.android.gms.internal.play_billing.z1 z1Var, com.google.android.gms.internal.play_billing.C1 c9) {
        z1Var.zzf = c9;
        z1Var.zze = 8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.C1845h1.class, com.google.android.gms.internal.play_billing.C1854k1.class, com.google.android.gms.internal.play_billing.D1.class, com.google.android.gms.internal.play_billing.p1.class, "zzh", com.google.android.gms.internal.play_billing.n1.class, com.google.android.gms.internal.play_billing.C1.class});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.z1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.y1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
