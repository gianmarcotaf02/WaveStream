package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class J1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.J1 zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";
    private java.lang.String zzi = "";
    private java.lang.String zzj = "";

    static {
        com.google.android.gms.internal.cast.J1 j9 = new com.google.android.gms.internal.cast.J1();
        zzb = j9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.J1.class, j9);
    }

    public static com.google.android.gms.internal.cast.I1 n() {
        return (com.google.android.gms.internal.cast.I1) zzb.l();
    }

    public static /* synthetic */ void o(com.google.android.gms.internal.cast.J1 j9, java.lang.String str) {
        str.getClass();
        j9.zzd |= 8;
        j9.zzh = str;
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.cast.J1 j9, java.lang.String str) {
        str.getClass();
        j9.zzd |= 16;
        j9.zzi = str;
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.cast.J1 j9, java.lang.String str) {
        str.getClass();
        j9.zzd |= 1;
        j9.zze = str;
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.cast.J1 j9, java.lang.String str) {
        str.getClass();
        j9.zzd |= 2;
        j9.zzf = str;
    }

    public static /* synthetic */ void s(com.google.android.gms.internal.cast.J1 j9, java.lang.String str) {
        str.getClass();
        j9.zzd |= 4;
        j9.zzg = str;
    }

    public static /* synthetic */ void t(com.google.android.gms.internal.cast.J1 j9, java.lang.String str) {
        str.getClass();
        j9.zzd |= 32;
        j9.zzj = str;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.J1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.I1(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
