package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1835e0 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.C1835e0 zzb;
    private int zzd;
    private java.lang.String zze = "";

    static {
        com.google.android.gms.internal.play_billing.C1835e0 c1835e0 = new com.google.android.gms.internal.play_billing.C1835e0();
        zzb = c1835e0;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.C1835e0.class, c1835e0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"zzd", "zze"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.C1835e0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.Z(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
