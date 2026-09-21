package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1737e1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C1737e1 zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";

    static {
        com.google.android.gms.internal.cast.C1737e1 c1737e1 = new com.google.android.gms.internal.cast.C1737e1();
        zzb = c1737e1;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C1737e1.class, c1737e1);
    }

    public static com.google.android.gms.internal.cast.C1733d1 n() {
        return (com.google.android.gms.internal.cast.C1733d1) zzb.l();
    }

    public static /* synthetic */ void o(com.google.android.gms.internal.cast.C1737e1 c1737e1, java.lang.String str) {
        str.getClass();
        c1737e1.zzd |= 1;
        c1737e1.zze = str;
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
            return new com.google.android.gms.internal.cast.C1737e1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.C1733d1(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
