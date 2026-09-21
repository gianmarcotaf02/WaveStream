package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.r1 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzo = "";
    private java.lang.String zzp = "";
    private java.lang.String zzq = "";
    private java.lang.String zzr = "";

    static {
        com.google.android.gms.internal.play_billing.r1 r1Var = new com.google.android.gms.internal.play_billing.r1();
        zzb = r1Var;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.r1.class, r1Var);
    }

    public static /* synthetic */ void A(com.google.android.gms.internal.play_billing.r1 r1Var, int i3) {
        r1Var.zzd |= 128;
        r1Var.zzl = i3;
    }

    public static /* synthetic */ void B(com.google.android.gms.internal.play_billing.r1 r1Var, int i3) {
        r1Var.zzd |= 256;
        r1Var.zzm = i3;
    }

    public static /* synthetic */ void C(com.google.android.gms.internal.play_billing.r1 r1Var, int i3) {
        r1Var.zzd |= 8;
        r1Var.zzh = i3;
    }

    public static /* synthetic */ void D(com.google.android.gms.internal.play_billing.r1 r1Var, long j) {
        r1Var.zzd |= 16;
        r1Var.zzi = j;
    }

    public static /* synthetic */ void E(com.google.android.gms.internal.play_billing.r1 r1Var, long j) {
        r1Var.zzd |= 32;
        r1Var.zzj = j;
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.play_billing.r1 r1Var) {
        r1Var.zzd |= 512;
        r1Var.zzn = 846465066L;
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.play_billing.r1 r1Var, java.lang.String str) {
        str.getClass();
        r1Var.zzd |= 4;
        r1Var.zzg = str;
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.play_billing.r1 r1Var) {
        java.lang.String str = android.os.Build.BRAND;
        str.getClass();
        r1Var.zzd |= 1024;
        r1Var.zzo = str;
    }

    public static /* synthetic */ void s(com.google.android.gms.internal.play_billing.r1 r1Var) {
        java.lang.String str = android.os.Build.FINGERPRINT;
        str.getClass();
        r1Var.zzd |= 8192;
        r1Var.zzr = str;
    }

    public static /* synthetic */ void t(com.google.android.gms.internal.play_billing.r1 r1Var) {
        java.lang.String str = android.os.Build.MANUFACTURER;
        str.getClass();
        r1Var.zzd |= 4096;
        r1Var.zzq = str;
    }

    public static /* synthetic */ void u(com.google.android.gms.internal.play_billing.r1 r1Var) {
        java.lang.String str = android.os.Build.MODEL;
        str.getClass();
        r1Var.zzd |= 2048;
        r1Var.zzp = str;
    }

    public static /* synthetic */ void v(com.google.android.gms.internal.play_billing.r1 r1Var, int i3) {
        r1Var.zzd |= 16384;
        r1Var.zzs = i3;
    }

    public static /* synthetic */ void w(com.google.android.gms.internal.play_billing.r1 r1Var) {
        r1Var.zzd |= 64;
        r1Var.zzk = false;
    }

    public static /* synthetic */ void x(com.google.android.gms.internal.play_billing.r1 r1Var) {
        r1Var.zzd |= 1;
        r1Var.zze = com.revenuecat.purchases.api.BuildConfig.BILLING_CLIENT_VERSION;
    }

    public static /* synthetic */ void y(com.google.android.gms.internal.play_billing.r1 r1Var, java.lang.String str) {
        r1Var.zzd |= 2;
        r1Var.zzf = str;
    }

    public static com.google.android.gms.internal.play_billing.q1 z() {
        return (com.google.android.gms.internal.play_billing.q1) zzb.k();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new java.lang.Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.r1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.q1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
