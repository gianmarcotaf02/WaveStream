package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.I0 zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.cast.I0 i3 = new com.google.android.gms.internal.cast.I0();
        zzb = i3;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.I0.class, i3);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.C1762k2.f18962o});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.I0();
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
