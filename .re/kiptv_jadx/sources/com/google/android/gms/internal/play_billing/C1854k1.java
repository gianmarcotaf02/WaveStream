package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1854k1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.C1854k1 zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private int zzg;
    private int zzh;

    static {
        com.google.android.gms.internal.play_billing.C1854k1 c1854k1 = new com.google.android.gms.internal.play_billing.C1854k1();
        zzb = c1854k1;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.C1854k1.class, c1854k1);
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.play_billing.C1854k1 c1854k1, int i3) {
        c1854k1.zzg = i3 - 1;
        c1854k1.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.C1848i1 q() {
        return (com.google.android.gms.internal.play_billing.C1848i1) zzb.k();
    }

    public static void s(com.google.android.gms.internal.play_billing.C1854k1 c1854k1, com.google.android.gms.internal.play_billing.o1 o1Var) {
        c1854k1.zzh = o1Var.f19368h;
        c1854k1.zzd |= 2;
    }

    public static /* synthetic */ void t(com.google.android.gms.internal.play_billing.C1854k1 c1854k1, com.google.android.gms.internal.play_billing.u1 u1Var) {
        c1854k1.zzf = u1Var;
        c1854k1.zze = 2;
    }

    public static /* synthetic */ void u(com.google.android.gms.internal.play_billing.C1854k1 c1854k1, com.google.android.gms.internal.play_billing.x1 x1Var) {
        c1854k1.zzf = x1Var;
        c1854k1.zze = 4;
    }

    public static /* synthetic */ void v(com.google.android.gms.internal.play_billing.C1854k1 c1854k1, com.google.android.gms.internal.play_billing.F1 f9) {
        c1854k1.zzf = f9;
        c1854k1.zze = 3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.C1838f0.f19324c, com.google.android.gms.internal.play_billing.u1.class, com.google.android.gms.internal.play_billing.F1.class, com.google.android.gms.internal.play_billing.x1.class, "zzh", com.google.android.gms.internal.play_billing.C1838f0.f19326e});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.C1854k1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.C1848i1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }

    public final com.google.android.gms.internal.play_billing.x1 r() {
        return this.zze == 4 ? (com.google.android.gms.internal.play_billing.x1) this.zzf : com.google.android.gms.internal.play_billing.x1.p();
    }
}
