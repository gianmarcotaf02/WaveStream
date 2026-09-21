package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1860m1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.C1860m1 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.play_billing.C1860m1 c1860m1 = new com.google.android.gms.internal.play_billing.C1860m1();
        zzb = c1860m1;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.C1860m1.class, c1860m1);
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.play_billing.C1860m1 c1860m1, int i3) {
        c1860m1.zzd |= 1;
        c1860m1.zze = i3;
    }

    public static com.google.android.gms.internal.play_billing.C1857l1 q() {
        return (com.google.android.gms.internal.play_billing.C1857l1) zzb.k();
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.play_billing.C1860m1 c1860m1, java.lang.String str) {
        c1860m1.zzd |= 8;
        c1860m1.zzh = str;
    }

    public static /* synthetic */ void s(com.google.android.gms.internal.play_billing.C1860m1 c1860m1, java.lang.String str) {
        str.getClass();
        c1860m1.zzd |= 2;
        c1860m1.zzf = str;
    }

    public static /* synthetic */ void t(com.google.android.gms.internal.play_billing.C1860m1 c1860m1) {
        c1860m1.zzd |= 32;
        c1860m1.zzj = 0;
    }

    public static /* synthetic */ void u(com.google.android.gms.internal.play_billing.C1860m1 c1860m1, int i3) {
        c1860m1.zzd |= 16;
        c1860m1.zzi = i3;
    }

    public static void v(com.google.android.gms.internal.play_billing.C1860m1 c1860m1, int i3) {
        c1860m1.zzg = com.google.android.gms.internal.play_billing.M0.b(i3);
        c1860m1.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.play_billing.C1838f0.f19325d, "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.C1860m1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.C1857l1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
