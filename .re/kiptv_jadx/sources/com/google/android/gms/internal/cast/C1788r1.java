package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1788r1 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C1788r1 zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";

    static {
        com.google.android.gms.internal.cast.C1788r1 c1788r1 = new com.google.android.gms.internal.cast.C1788r1();
        zzb = c1788r1;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C1788r1.class, c1788r1);
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
            return new com.google.android.gms.internal.cast.C1788r1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.C1772n0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
