package com.google.android.gms.internal.cast;

import java.util.ArrayList;

public final class T0 extends E2 {
    private static final T0 zzb;
    private int zzd;
    private C1737e1 zze;
    private long zzf;
    private int zzg;
    private I2 zzh;
    private I2 zzi;
    private I2 zzj;
    private I2 zzk;
    private I2 zzl;
    private int zzm;

    static {
        T0 t9 = new T0();
        zzb = t9;
        E2.f(T0.class, t9);
    }

    public T0() {
        V2 v6 = V2.f18829k;
        this.zzh = v6;
        this.zzi = v6;
        this.zzj = v6;
        this.zzk = v6;
        this.zzl = v6;
    }

    public static S0 n() {
        return (S0) zzb.l();
    }

    public static void o(T0 t9, ArrayList arrayList) {
        I2 i3 = t9.zzh;
        if (!((AbstractC1805v2) i3).f19160h) {
            t9.zzh = E2.c(i3);
        }
        AbstractC1801u2.b(arrayList, t9.zzh);
    }

    public static void p(T0 t9, ArrayList arrayList) {
        I2 i3 = t9.zzi;
        if (!((AbstractC1805v2) i3).f19160h) {
            t9.zzi = E2.c(i3);
        }
        AbstractC1801u2.b(arrayList, t9.zzi);
    }

    public static void q(T0 t9, ArrayList arrayList) {
        I2 i3 = t9.zzl;
        if (!((AbstractC1805v2) i3).f19160h) {
            t9.zzl = E2.c(i3);
        }
        AbstractC1801u2.b(arrayList, t9.zzl);
    }

    public static void r(T0 t9, ArrayList arrayList) {
        I2 i3 = t9.zzj;
        if (!((AbstractC1805v2) i3).f19160h) {
            t9.zzj = E2.c(i3);
        }
        AbstractC1801u2.b(arrayList, t9.zzj);
    }

    public static void s(T0 t9, ArrayList arrayList) {
        I2 i3 = t9.zzk;
        if (!((AbstractC1805v2) i3).f19160h) {
            t9.zzk = E2.c(i3);
        }
        AbstractC1801u2.b(arrayList, t9.zzk);
    }

    public static void t(T0 t9, C1737e1 c1737e1) {
        t9.zze = c1737e1;
        t9.zzd |= 1;
    }

    public static void u(T0 t9, int i3) {
        t9.zzd |= 8;
        t9.zzm = i3;
    }

    public static void v(T0 t9, long j) {
        t9.zzd |= 2;
        t9.zzf = j;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0005\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003᠌\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b\b\u001b\tင\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", C1787r0.f19055x, "zzh", R0.class, "zzi", N0.class, "zzj", X0.class, "zzk", V0.class, "zzl", P0.class, "zzm"});
        }
        if (i9 == 3) {
            return new T0();
        }
        if (i9 == 4) {
            return new S0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
