package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1815y0 extends com.google.android.gms.internal.cast.E2 {
    private static final com.google.android.gms.internal.cast.C1815y0 zzb;
    private int zzd;
    private com.google.android.gms.internal.cast.C0 zze;
    private com.google.android.gms.internal.cast.C1788r1 zzf;
    private com.google.android.gms.internal.cast.I2 zzg = com.google.android.gms.internal.cast.V2.f18829k;
    private com.google.android.gms.internal.cast.G2 zzh = com.google.android.gms.internal.cast.F2.f18771k;

    static {
        com.google.android.gms.internal.cast.C1815y0 c1815y0 = new com.google.android.gms.internal.cast.C1815y0();
        zzb = c1815y0;
        com.google.android.gms.internal.cast.E2.f(com.google.android.gms.internal.cast.C1815y0.class, c1815y0);
    }

    public static com.google.android.gms.internal.cast.C1811x0 n() {
        return (com.google.android.gms.internal.cast.C1811x0) zzb.l();
    }

    public static void o(com.google.android.gms.internal.cast.C1815y0 c1815y0, java.util.ArrayList arrayList) {
        java.util.RandomAccess randomAccess = c1815y0.zzh;
        if (!((com.google.android.gms.internal.cast.AbstractC1805v2) randomAccess).f19160h) {
            com.google.android.gms.internal.cast.F2 f9 = (com.google.android.gms.internal.cast.F2) randomAccess;
            int i3 = f9.j;
            int i9 = i3 == 0 ? 10 : i3 + i3;
            if (i9 < i3) {
                throw new java.lang.IllegalArgumentException();
            }
            c1815y0.zzh = new com.google.android.gms.internal.cast.F2(java.util.Arrays.copyOf(f9.f18772i, i9), f9.j, true);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.cast.F2) c1815y0.zzh).f(((com.google.android.gms.internal.cast.EnumC1803v0) it.next()).f19159h);
        }
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.cast.C1815y0 c1815y0, com.google.android.gms.internal.cast.C0 c9) {
        c1815y0.zze = c9;
        c1815y0.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast.E2
    public final java.lang.Object j(int i3, com.google.android.gms.internal.cast.E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.cast.W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.cast.C1781p1.class, "zzh", com.google.android.gms.internal.cast.C1799u0.f19096i});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.cast.C1815y0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.cast.C1811x0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
