package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1845h1 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.C1845h1 zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private int zzg;
    private com.google.android.gms.internal.play_billing.C1860m1 zzh;
    private int zzi;

    static {
        com.google.android.gms.internal.play_billing.C1845h1 c1845h1 = new com.google.android.gms.internal.play_billing.C1845h1();
        zzb = c1845h1;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.C1845h1.class, c1845h1);
    }

    public static /* synthetic */ void p(com.google.android.gms.internal.play_billing.C1845h1 c1845h1, com.google.android.gms.internal.play_billing.x1 x1Var) {
        c1845h1.zzf = x1Var;
        c1845h1.zze = 7;
    }

    public static /* synthetic */ void q(com.google.android.gms.internal.play_billing.C1845h1 c1845h1, com.google.android.gms.internal.play_billing.F1 f9) {
        c1845h1.zzf = f9;
        c1845h1.zze = 6;
    }

    public static /* synthetic */ void r(com.google.android.gms.internal.play_billing.C1845h1 c1845h1, int i3) {
        c1845h1.zzg = i3 - 1;
        c1845h1.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.C1842g1 s() {
        return (com.google.android.gms.internal.play_billing.C1842g1) zzb.k();
    }

    public static com.google.android.gms.internal.play_billing.C1845h1 t(byte[] bArr) throws com.google.android.gms.internal.play_billing.D0 {
        com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0 = zzb;
        int length = bArr.length;
        com.google.android.gms.internal.play_billing.C1868q0 c1868q0 = com.google.android.gms.internal.play_billing.C1868q0.f19378a;
        int i3 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
        com.google.android.gms.internal.play_billing.C1868q0 c1868q1 = com.google.android.gms.internal.play_billing.C1868q0.f19378a;
        if (length != 0) {
            com.google.android.gms.internal.play_billing.AbstractC1877v0 abstractC1877v0N = abstractC1877v0.n();
            try {
                com.google.android.gms.internal.play_billing.T0 t0A = com.google.android.gms.internal.play_billing.Q0.f19276c.a(abstractC1877v0N.getClass());
                com.google.android.gms.internal.play_billing.C1850j0 c1850j0 = new com.google.android.gms.internal.play_billing.C1850j0();
                c1868q1.getClass();
                t0A.f(abstractC1877v0N, bArr, 0, length, c1850j0);
                t0A.a(abstractC1877v0N);
                abstractC1877v0 = abstractC1877v0N;
            } catch (com.google.android.gms.internal.play_billing.D0 e6) {
                throw e6;
            } catch (com.google.android.gms.internal.play_billing.W0 e9) {
                throw new com.google.android.gms.internal.play_billing.D0(e9.getMessage());
            } catch (java.io.IOException e10) {
                if (e10.getCause() instanceof com.google.android.gms.internal.play_billing.D0) {
                    throw ((com.google.android.gms.internal.play_billing.D0) e10.getCause());
                }
                throw new com.google.android.gms.internal.play_billing.D0(e10.getMessage(), e10);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                throw new com.google.android.gms.internal.play_billing.D0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (abstractC1877v0 == null || com.google.android.gms.internal.play_billing.AbstractC1877v0.i(abstractC1877v0, true)) {
            return (com.google.android.gms.internal.play_billing.C1845h1) abstractC1877v0;
        }
        throw new com.google.android.gms.internal.play_billing.D0(new com.google.android.gms.internal.play_billing.W0().getMessage());
    }

    public static void v(com.google.android.gms.internal.play_billing.C1845h1 c1845h1, com.google.android.gms.internal.play_billing.o1 o1Var) {
        c1845h1.zzi = o1Var.f19368h;
        c1845h1.zzd |= 4;
    }

    public static /* synthetic */ void w(com.google.android.gms.internal.play_billing.C1845h1 c1845h1, com.google.android.gms.internal.play_billing.C1860m1 c1860m1) {
        c1845h1.zzh = c1860m1;
        c1845h1.zzd |= 2;
    }

    public static /* synthetic */ void x(com.google.android.gms.internal.play_billing.C1845h1 c1845h1, com.google.android.gms.internal.play_billing.u1 u1Var) {
        c1845h1.zzf = u1Var;
        c1845h1.zze = 4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.C1838f0.f19324c, "zzh", com.google.android.gms.internal.play_billing.u1.class, "zzi", com.google.android.gms.internal.play_billing.C1838f0.f19326e, com.google.android.gms.internal.play_billing.F1.class, com.google.android.gms.internal.play_billing.x1.class});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.C1845h1();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.C1842g1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }

    public final com.google.android.gms.internal.play_billing.x1 u() {
        return this.zze == 7 ? (com.google.android.gms.internal.play_billing.x1) this.zzf : com.google.android.gms.internal.play_billing.x1.p();
    }
}
