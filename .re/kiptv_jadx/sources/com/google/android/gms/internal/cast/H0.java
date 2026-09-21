package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.H0 zzb;
    private com.google.android.gms.internal.cast.I2 zzd = com.google.android.gms.internal.cast.V2.f18829k;

    static {
        com.google.android.gms.internal.cast.H0 h9 = new com.google.android.gms.internal.cast.H0();
        zzb = h9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.H0.class, h9);
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"zzd"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.H0();
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
