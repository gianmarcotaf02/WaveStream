package com.google.android.gms.internal.cast;

public final class A0 extends E2 {
    private static final A0 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private I2 zzi;
    private I2 zzj;
    private String zzk;

    static {
        A0 a2 = new A0();
        zzb = a2;
        E2.f(A0.class, a2);
    }

    public A0() {
        V2 v6 = V2.f18829k;
        this.zzi = v6;
        this.zzj = v6;
        this.zzk = "";
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0007\u001b\b\u001b\tဈ\u0004", new Object[]{"zzd", "zze", C1762k2.j, "zzf", "zzg", C1762k2.f18971x, "zzh", "zzi", C1816y1.class, "zzj", C1816y1.class, "zzk"});
        }
        if (i9 == 3) {
            return new A0();
        }
        if (i9 == 4) {
            return new C1772n0(zzb);
        }
        if (i9 != 5) {
            return null;
        }
        return zzb;
    }
}
