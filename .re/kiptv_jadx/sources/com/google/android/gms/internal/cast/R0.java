package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.R0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;

    static {
        com.google.android.gms.internal.cast.R0 r9 = new com.google.android.gms.internal.cast.R0();
        zzb = r9;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.R0.class, r9);
    }

    public static com.google.android.gms.internal.cast.Q0 n() {
        return (com.google.android.gms.internal.cast.Q0) zzb.l();
    }

    public static /* synthetic */ void o(com.google.android.gms.internal.cast.R0 r9, boolean z6) {
        r9.zzd |= 8;
        r9.zzh = z6;
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.cast.R0 r9, int i3) {
        r9.zzd |= 4;
        r9.zzg = i3;
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.cast.R0 r9, long j) {
        r9.zzd |= 16;
        r9.zzi = j;
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.cast.R0 r9, int i3) {
        r9.zzd |= 2;
        r9.zzf = i3;
    }

    public static /* synthetic */ void s(com.google.android.gms.internal.cast.R0 r9, int i3) {
        r9.zze = i3 - 1;
        r9.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဂ\u0004", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.cast.C1787r0.f19052u, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.R0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.Q0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
