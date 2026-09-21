package com.google.android.gms.internal.cast;

public final class L0 extends E2 {
    private static final L0 zzb;
    private I2 zzA;
    private I2 zzB;
    private I2 zzC;
    private F1 zzD;
    private int zzE;
    private int zzF;
    private C1737e1 zzG;
    private int zzH;
    private J0 zzI;
    private I2 zzJ;
    private C1737e1 zzK;
    private int zzL;
    private int zzM;
    private int zzN;
    private int zzO;
    private int zzP;
    private int zzQ;
    private T1 zzR;
    private F0 zzS;
    private T0 zzT;
    private C1807w0 zzU;
    private C1785q1 zzV;
    private E1 zzW;
    private C1792s1 zzX;
    private I2 zzY;
    private C1788r1 zzZ;
    private int zzaa;
    private C1812x1 zzab;
    private I2 zzac;
    private boolean zzad;
    private boolean zzae;
    private int zzaf;
    private C1815y0 zzag;
    private B1 zzah;
    private C1769m1 zzai;
    private Z0 zzaj;
    private C1804v1 zzak;
    private K1 zzal;
    private C1721a1 zzam;
    private int zzan;
    private int zzao;
    private int zzap;
    private I2 zzaq;
    private W1 zzar;
    private L1 zzas;
    private J1 zzat;
    private H0 zzau;
    private O1 zzav;
    private C1 zzaw;
    private int zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private C1761k1 zzi;
    private A1 zzj;
    private C1757j1 zzk;
    private C1749h1 zzl;
    private I0 zzm;
    private C1820z1 zzn;
    private A0 zzo;
    private S1 zzp;
    private C1745g1 zzr;
    private C1780p0 zzs;
    private int zzv;
    private C1800u1 zzw;
    private I2 zzz;
    private byte zzax = 2;
    private String zzq = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private G2 zzy = F2.f18771k;

    static {
        L0 l2 = new L0();
        zzb = l2;
        E2.f(L0.class, l2);
    }

    public L0() {
        V2 v6 = V2.f18829k;
        this.zzz = v6;
        this.zzA = v6;
        this.zzB = v6;
        this.zzC = v6;
        this.zzJ = v6;
        this.zzY = v6;
        this.zzac = v6;
        this.zzaq = v6;
    }

    public static void A(L0 l2, T0 t9) {
        l2.zzT = t9;
        l2.zze |= 4;
    }

    public static void B(L0 l2, long j) {
        l2.zzd |= 2;
        l2.zzg = j;
    }

    public static K0 o() {
        return (K0) zzb.l();
    }

    public static K0 p(L0 l2) {
        D2 d2L = zzb.l();
        E2 e6 = d2L.f18765h;
        if (!e6.equals(l2)) {
            if (!d2L.f18766i.i()) {
                E2 e9 = (E2) e6.j(4, null);
                U2.f18826c.a(e9.getClass()).c(e9, d2L.f18766i);
                d2L.f18766i = e9;
            }
            E2 e10 = d2L.f18766i;
            U2.f18826c.a(e10.getClass()).c(e10, l2);
        }
        return (K0) d2L;
    }

    public static void q(L0 l2, C0 c9) {
        I2 i3 = l2.zzY;
        if (!((AbstractC1805v2) i3).f19160h) {
            l2.zzY = E2.c(i3);
        }
        l2.zzY.add(c9);
    }

    public static void r(L0 l2, C1815y0 c1815y0) {
        l2.zzag = c1815y0;
        l2.zze |= 8192;
    }

    public static void s(L0 l2, F0 f9) {
        l2.zzS = f9;
        l2.zze |= 2;
    }

    public static void t(L0 l2, String str) {
        str.getClass();
        l2.zzd |= 32768;
        l2.zzu = str;
    }

    public static void u(L0 l2, String str) {
        str.getClass();
        l2.zzd |= 2048;
        l2.zzq = str;
    }

    public static void v(L0 l2, int i3) {
        l2.zzd |= Integer.MIN_VALUE;
        l2.zzQ = i3;
    }

    public static void w(L0 l2, int i3) {
        l2.zzd |= 65536;
        l2.zzv = i3;
    }

    public static void x(L0 l2, J1 j9) {
        l2.zzat = j9;
        l2.zze |= 33554432;
    }

    public static void y(L0 l2, String str) {
        l2.zzd |= 262144;
        l2.zzx = str;
    }

    public static void z(L0 l2, String str) {
        str.getClass();
        l2.zzd |= 16384;
        l2.zzt = str;
    }

    @Override
    public final Object j(int i3, E2 e6) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzax);
        }
        if (i9 == 2) {
            return new W2(zzb, "\u0001F\u0000\u0002\u0001FF\u0000\t\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဈ\u000e\nဉ\b\u000bဉ\t\fဉ\n\rဈ\u000b\u000eဉ\f\u000fဉ\r\u0010ဉ\u0011\u0011ဈ\u0012\u0012\u0016\u0013\u001b\u0014\u001b\u0015\u001b\u0016\u001b\u0017᠌\u0014\u0018ဉ\u0018\u0019\u001b\u001aဉ\u0019\u001b᠌\u001b\u001cင\u001c\u001dင\u001d\u001eင\u001e\u001fဆ\u001f ဉ !ဉ!\"ဉ##᠌\u0015$ဉ\u0016%ᐉ$&ဉ%'ဉ&(\u001b)᠌(*ဉ)+\u001b,᠌\u001a-ဇ*.ဇ+/᠌,0ဉ-1င\u00172ဉ.3ဉ/4ဉ15ဉ26ဉ37᠌48᠌59᠌6:\u001b;ဈ\u000f<ဉ7=ဉ0>ဉ\u0013?ဉ\"@င\u0010Aဉ8Bဉ'Cဉ9Dဉ:Eဉ;Fဉ<", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C1787r0.f19054w, "zzi", "zzj", "zzk", "zzl", "zzm", "zzt", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzw", "zzx", "zzy", "zzz", C1765l1.class, "zzA", C1777o1.class, "zzB", C1725b1.class, "zzC", G1.class, "zzE", C1787r0.f19046o, "zzI", "zzJ", C1737e1.class, "zzK", "zzM", C1762k2.f18949D, "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzU", "zzF", C1787r0.f19044m, "zzG", "zzV", "zzW", "zzX", "zzY", C0.class, "zzaa", C1787r0.f19045n, "zzab", "zzac", G0.class, "zzL", C1762k2.f18948C, "zzad", "zzae", "zzaf", C1762k2.f18946A, "zzag", "zzH", "zzah", "zzai", "zzak", "zzal", "zzam", "zzan", C1762k2.f18964q, "zzao", C1787r0.f19039f, "zzap", C1762k2.f18963p, "zzaq", P1.class, "zzu", "zzar", "zzaj", "zzD", "zzT", "zzv", "zzas", "zzZ", "zzat", "zzau", "zzav", "zzaw"});
        }
        if (i9 == 3) {
            return new L0();
        }
        if (i9 == 4) {
            return new K0(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzax = e6 == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final F0 n() {
        F0 f9 = this.zzS;
        return f9 == null ? F0.p() : f9;
    }
}
