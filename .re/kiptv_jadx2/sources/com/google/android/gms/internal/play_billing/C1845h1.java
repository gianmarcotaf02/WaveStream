package com.google.android.gms.internal.play_billing;

import java.io.IOException;

public final class C1845h1 extends AbstractC1877v0 {
    private static final C1845h1 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private C1860m1 zzh;
    private int zzi;

    static {
        C1845h1 c1845h1 = new C1845h1();
        zzb = c1845h1;
        AbstractC1877v0.f(C1845h1.class, c1845h1);
    }

    public static void p(C1845h1 c1845h1, x1 x1Var) {
        c1845h1.zzf = x1Var;
        c1845h1.zze = 7;
    }

    public static void q(C1845h1 c1845h1, F1 f9) {
        c1845h1.zzf = f9;
        c1845h1.zze = 6;
    }

    public static void r(C1845h1 c1845h1, int i3) {
        c1845h1.zzg = i3 - 1;
        c1845h1.zzd |= 1;
    }

    public static C1842g1 s() {
        return (C1842g1) zzb.k();
    }

    public static C1845h1 t(byte[] bArr) throws D0 {
        AbstractC1877v0 abstractC1877v0 = zzb;
        int length = bArr.length;
        C1868q0 c1868q0 = C1868q0.f19378a;
        int i3 = AbstractC1847i0.f19337a;
        C1868q0 c1868q1 = C1868q0.f19378a;
        if (length != 0) {
            AbstractC1877v0 abstractC1877v0N = abstractC1877v0.n();
            try {
                T0 t0A = Q0.f19276c.a(abstractC1877v0N.getClass());
                C1850j0 c1850j0 = new C1850j0();
                c1868q1.getClass();
                t0A.f(abstractC1877v0N, bArr, 0, length, c1850j0);
                t0A.a(abstractC1877v0N);
                abstractC1877v0 = abstractC1877v0N;
            } catch (D0 e6) {
                throw e6;
            } catch (W0 e9) {
                throw new D0(e9.getMessage());
            } catch (IOException e10) {
                if (e10.getCause() instanceof D0) {
                    throw ((D0) e10.getCause());
                }
                throw new D0(e10.getMessage(), e10);
            } catch (IndexOutOfBoundsException unused) {
                throw new D0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (abstractC1877v0 == null || AbstractC1877v0.i(abstractC1877v0, true)) {
            return (C1845h1) abstractC1877v0;
        }
        throw new D0(new W0().getMessage());
    }

    public static void v(C1845h1 c1845h1, o1 o1Var) {
        c1845h1.zzi = o1Var.f19368h;
        c1845h1.zzd |= 4;
    }

    public static void w(C1845h1 c1845h1, C1860m1 c1860m1) {
        c1845h1.zzh = c1860m1;
        c1845h1.zzd |= 2;
    }

    public static void x(C1845h1 c1845h1, u1 u1Var) {
        c1845h1.zzf = u1Var;
        c1845h1.zze = 4;
    }

    @Override
    public final Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new S0(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C1838f0.f19324c, "zzh", u1.class, "zzi", C1838f0.f19326e, F1.class, x1.class});
        }
        if (i9 == 3) {
            return new C1845h1();
        }
        if (i9 == 4) {
            return new C1842g1(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }

    public final x1 u() {
        return this.zze == 7 ? (x1) this.zzf : x1.p();
    }
}
