package com.google.android.gms.internal.cast;

public final class L1 extends E2 {
    private static final L1 zzb;
    private int zzd;
    private C1737e1 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private int zzm;
    private int zzn;
    private String zze = "";
    private G2 zzo = F2.f18771k;

    static {
        L1 l2 = new L1();
        zzb = l2;
        E2.f(L1.class, l2);
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဉ\u0001\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဇ\u0004\u0005ဂ\u0006\u0006ဂ\u0007\u0007င\b\bင\t\t'\nဈ\u0000\u000bဇ\u0005", new Object[]{"zzd", "zzf", "zzg", "zzh", "zzi", "zzk", "zzl", "zzm", "zzn", "zzo", "zze", "zzj"});
        }
        if (i9 == 3) {
            return new L1();
        }
        if (i9 == 4) {
            return new C1808w1(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
