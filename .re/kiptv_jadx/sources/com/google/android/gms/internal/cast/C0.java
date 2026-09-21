package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class C0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C0 zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";

    static {
        com.google.android.gms.internal.cast.C0 c9 = new com.google.android.gms.internal.cast.C0();
        zzb = c9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C0.class, c9);
    }

    public static com.google.android.gms.internal.cast.B0 n() {
        return (com.google.android.gms.internal.cast.B0) zzb.l();
    }

    public static /* synthetic */ void o(com.google.android.gms.internal.cast.C0 c9, java.lang.String str) {
        str.getClass();
        c9.zzd |= 1;
        c9.zze = str;
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.cast.C0 c9, java.lang.String str) {
        str.getClass();
        c9.zzd |= 2;
        c9.zzf = str;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.C0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.B0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
