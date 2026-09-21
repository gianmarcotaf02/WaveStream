package com.google.android.gms.internal.cast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

public final class C1815y0 extends E2 {
    private static final C1815y0 zzb;
    private int zzd;
    private C0 zze;
    private C1788r1 zzf;
    private I2 zzg = V2.f18829k;
    private G2 zzh = F2.f18771k;

    static {
        C1815y0 c1815y0 = new C1815y0();
        zzb = c1815y0;
        E2.f(C1815y0.class, c1815y0);
    }

    public static C1811x0 n() {
        return (C1811x0) zzb.l();
    }

    public static void o(C1815y0 c1815y0, ArrayList arrayList) {
        RandomAccess randomAccess = c1815y0.zzh;
        if (!((AbstractC1805v2) randomAccess).f19160h) {
            F2 f9 = (F2) randomAccess;
            int i3 = f9.j;
            int i9 = i3 == 0 ? 10 : i3 + i3;
            if (i9 < i3) {
                throw new IllegalArgumentException();
            }
            c1815y0.zzh = new F2(Arrays.copyOf(f9.f18772i, i9), f9.j, true);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((F2) c1815y0.zzh).f(((EnumC1803v0) it.next()).f19159h);
        }
    }

    public static void p(C1815y0 c1815y0, C0 c9) {
        c1815y0.zze = c9;
        c1815y0.zzd |= 1;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ࠞ", new Object[]{"zzd", "zze", "zzf", "zzg", C1781p1.class, "zzh", C1799u0.f19096i});
        }
        if (i9 == 3) {
            return new C1815y0();
        }
        if (i9 == 4) {
            return new C1811x0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
