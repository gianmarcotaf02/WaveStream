package com.google.android.gms.internal.play_billing;

import android.os.Build;
import com.revenuecat.purchases.api.BuildConfig;

public final class r1 extends AbstractC1877v0 {
    private static final r1 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        r1 r1Var = new r1();
        zzb = r1Var;
        AbstractC1877v0.f(r1.class, r1Var);
    }

    public static void A(r1 r1Var, int i3) {
        r1Var.zzd |= 128;
        r1Var.zzl = i3;
    }

    public static void B(r1 r1Var, int i3) {
        r1Var.zzd |= 256;
        r1Var.zzm = i3;
    }

    public static void C(r1 r1Var, int i3) {
        r1Var.zzd |= 8;
        r1Var.zzh = i3;
    }

    public static void D(r1 r1Var, long j) {
        r1Var.zzd |= 16;
        r1Var.zzi = j;
    }

    public static void E(r1 r1Var, long j) {
        r1Var.zzd |= 32;
        r1Var.zzj = j;
    }

    public static void p(r1 r1Var) {
        r1Var.zzd |= 512;
        r1Var.zzn = 846465066L;
    }

    public static void q(r1 r1Var, String str) {
        str.getClass();
        r1Var.zzd |= 4;
        r1Var.zzg = str;
    }

    public static void r(r1 r1Var) {
        String str = Build.BRAND;
        str.getClass();
        r1Var.zzd |= 1024;
        r1Var.zzo = str;
    }

    public static void s(r1 r1Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        r1Var.zzd |= 8192;
        r1Var.zzr = str;
    }

    public static void t(r1 r1Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        r1Var.zzd |= 4096;
        r1Var.zzq = str;
    }

    public static void u(r1 r1Var) {
        String str = Build.MODEL;
        str.getClass();
        r1Var.zzd |= 2048;
        r1Var.zzp = str;
    }

    public static void v(r1 r1Var, int i3) {
        r1Var.zzd |= 16384;
        r1Var.zzs = i3;
    }

    public static void w(r1 r1Var) {
        r1Var.zzd |= 64;
        r1Var.zzk = false;
    }

    public static void x(r1 r1Var) {
        r1Var.zzd |= 1;
        r1Var.zze = BuildConfig.BILLING_CLIENT_VERSION;
    }

    public static void y(r1 r1Var, String str) {
        r1Var.zzd |= 2;
        r1Var.zzf = str;
    }

    public static q1 z() {
        return (q1) zzb.k();
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i9 == 3) {
            return new r1();
        }
        if (i9 == 4) {
            return new q1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
