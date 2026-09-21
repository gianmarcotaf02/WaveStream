package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.F0 zzb;
    private int zzd;
    private com.google.android.gms.internal.cast.C1737e1 zze;
    private boolean zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private com.google.android.gms.internal.cast.D1 zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    static {
        com.google.android.gms.internal.cast.F0 f9 = new com.google.android.gms.internal.cast.F0();
        zzb = f9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.F0.class, f9);
    }

    public static com.google.android.gms.internal.cast.E0 n() {
        return (com.google.android.gms.internal.cast.E0) zzb.l();
    }

    public static com.google.android.gms.internal.cast.E0 o(com.google.android.gms.internal.cast.F0 f9) {
        com.google.android.gms.internal.cast.D2 d2L = zzb.l();
        com.google.android.gms.internal.cast.E2 e6 = d2L.f18765h;
        if (!e6.equals(f9)) {
            if (!d2L.f18766i.i()) {
                com.google.android.gms.internal.cast.E2 e9 = (com.google.android.gms.internal.cast.E2) e6.j(4, null);
                com.google.android.gms.internal.cast.U2.f18826c.a(e9.getClass()).c(e9, d2L.f18766i);
                d2L.f18766i = e9;
            }
            com.google.android.gms.internal.cast.E2 e10 = d2L.f18766i;
            com.google.android.gms.internal.cast.U2.f18826c.a(e10.getClass()).c(e10, f9);
        }
        return (com.google.android.gms.internal.cast.E0) d2L;
    }

    public static com.google.android.gms.internal.cast.F0 p() {
        return zzb;
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.cast.F0 f9, com.google.android.gms.internal.cast.C1737e1 c1737e1) {
        f9.zze = c1737e1;
        f9.zzd |= 1;
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.cast.F0 f9, int i3) {
        f9.zzd |= 1024;
        f9.zzo = i3;
    }

    public static /* synthetic */ void s(com.google.android.gms.internal.cast.F0 f9, int i3) {
        f9.zzd |= 128;
        f9.zzl = i3;
    }

    public static /* synthetic */ void t(com.google.android.gms.internal.cast.F0 f9, boolean z6) {
        f9.zzd |= 2048;
        f9.zzp = z6;
    }

    public static /* synthetic */ void u(com.google.android.gms.internal.cast.F0 f9, boolean z6) {
        f9.zzd |= 16384;
        f9.zzs = z6;
    }

    public static /* synthetic */ void v(com.google.android.gms.internal.cast.F0 f9, boolean z6) {
        f9.zzd |= 2;
        f9.zzf = z6;
    }

    public static /* synthetic */ void w(com.google.android.gms.internal.cast.F0 f9, int i3) {
        f9.zzd |= 64;
        f9.zzk = i3;
    }

    public static /* synthetic */ void x(com.google.android.gms.internal.cast.F0 f9, long j) {
        f9.zzd |= 4;
        f9.zzg = j;
    }

    public static /* synthetic */ void y(com.google.android.gms.internal.cast.F0 f9, int i3) {
        f9.zzd |= 8192;
        f9.zzr = i3;
    }

    public static /* synthetic */ void z(com.google.android.gms.internal.cast.F0 f9, int i3) {
        f9.zzd |= 4096;
        f9.zzq = i3;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0004ဆ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007င\u0006\bင\u0007\tဉ\b\n᠌\t\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", com.google.android.gms.internal.cast.C1762k2.f18959l, "zzj", com.google.android.gms.internal.cast.C1762k2.f18958k, "zzk", "zzl", "zzm", "zzn", com.google.android.gms.internal.cast.C1762k2.y, "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.F0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.E0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
