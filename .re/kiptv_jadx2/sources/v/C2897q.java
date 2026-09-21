package v;

import K0.C0667o;
import Q0.AbstractC0776j;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.google.common.util.concurrent.AbstractC1903s;
import p020c0.C1676e;
import p020c0.C1681g0;
import x.U0;

public final class C2897q {

    public final p113n1.c f28983a;

    public long f28984b = 9205357640488583168L;

    public final M f28985c;

    public final C1681g0 f28986d;

    public final boolean f28987e;

    public boolean f28988f;
    public long g;

    public long f28989h;

    public final AbstractC0776j f28990i;

    public C2897q(Context context, p113n1.c cVar, long j, B.S s9) {
        this.f28983a = cVar;
        M m8 = new M(context, p188x0.z.H(j));
        this.f28985c = m8;
        this.f28986d = new C1681g0(p070h6.A.f22523a, C1676e.f18240k);
        this.f28987e = true;
        this.g = 0L;
        this.f28989h = -1L;
        J.D d4 = new J.D(5, this);
        C0667o c0667o = K0.N.f6662a;
        K0.U u6 = new K0.U(null, null, d4);
        this.f28990i = Build.VERSION.SDK_INT >= 31 ? new X(u6, this, m8) : new X(u6, this, m8, s9);
    }

    public final void a() {
        boolean z6;
        M m8 = this.f28985c;
        EdgeEffect edgeEffect = m8.f28882d;
        boolean z9 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z6 = !edgeEffect.isFinished();
        } else {
            z6 = false;
        }
        EdgeEffect edgeEffect2 = m8.f28883e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z6 = !edgeEffect2.isFinished() || z6;
        }
        EdgeEffect edgeEffect3 = m8.f28884f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z6 = !edgeEffect3.isFinished() || z6;
        }
        EdgeEffect edgeEffect4 = m8.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z6) {
                z9 = false;
            }
            z6 = z9;
        }
        if (z6) {
            d();
        }
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, U0 u1, p117n6.c cVar) {
        C2895o c2895o;
        float fD;
        float fD2;
        long jD;
        if (cVar instanceof C2895o) {
            c2895o = (C2895o) cVar;
            int i3 = c2895o.f28978k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2895o.f28978k = i3 - Integer.MIN_VALUE;
            } else {
                c2895o = new C2895o(this, cVar);
            }
        } else {
            c2895o = new C2895o(this, cVar);
        }
        Object objInvokeSuspend = c2895o.f28977i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c2895o.f28978k;
        p070h6.A a2 = p070h6.A.f22523a;
        M m8 = this.f28985c;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objInvokeSuspend);
            if (p181w0.d.e(this.g)) {
                c2895o.f28978k = 1;
                u1.getClass();
                U0 u6 = new U0(u1.f30812k, c2895o);
                u6.j = j;
                if (u6.invokeSuspend(a2) != aVar) {
                    return a2;
                }
            } else {
                boolean zG = M.g(m8.f28884f);
                p113n1.c cVar2 = this.f28983a;
                if (!zG || p113n1.r.b(j) >= 0.0f) {
                    fD = (!M.g(m8.g) || p113n1.r.b(j) <= 0.0f) ? 0.0f : -AbstractC2901v.d(m8.d(), -p113n1.r.b(j), Float.intBitsToFloat((int) (this.g >> 32)), cVar2);
                } else {
                    fD = AbstractC2901v.d(m8.c(), p113n1.r.b(j), Float.intBitsToFloat((int) (this.g >> 32)), cVar2);
                }
                if (!M.g(m8.f28882d) || p113n1.r.c(j) >= 0.0f) {
                    fD2 = (!M.g(m8.f28883e) || p113n1.r.c(j) <= 0.0f) ? 0.0f : -AbstractC2901v.d(m8.b(), -p113n1.r.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), cVar2);
                } else {
                    fD2 = AbstractC2901v.d(m8.e(), p113n1.r.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), cVar2);
                }
                long jI = com.google.common.util.concurrent.P.I(fD, fD2);
                if (jI != 0) {
                    d();
                }
                jD = p113n1.r.d(j, jI);
                c2895o.f28976h = jD;
                c2895o.f28978k = 2;
                u1.getClass();
                U0 u7 = new U0(u1.f30812k, c2895o);
                u7.j = jD;
                objInvokeSuspend = u7.invokeSuspend(a2);
            }
            return aVar;
        }
        if (i9 == 1) {
            com.google.common.util.concurrent.P.u0(objInvokeSuspend);
            return a2;
        }
        if (i9 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        jD = c2895o.f28976h;
        com.google.common.util.concurrent.P.u0(objInvokeSuspend);
        long jD2 = p113n1.r.d(jD, ((p113n1.r) objInvokeSuspend).f25573a);
        this.f28988f = false;
        if (p113n1.r.b(jD2) > 0.0f) {
            EdgeEffect edgeEffectC = m8.c();
            int iQ = O7.r.Q(p113n1.r.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectC.isFinished()) {
                edgeEffectC.onAbsorb(iQ);
            }
        } else if (p113n1.r.b(jD2) < 0.0f) {
            EdgeEffect edgeEffectD = m8.d();
            int i10 = -O7.r.Q(p113n1.r.b(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectD.isFinished()) {
                edgeEffectD.onAbsorb(i10);
            }
        }
        if (p113n1.r.c(jD2) > 0.0f) {
            EdgeEffect edgeEffectE = m8.e();
            int iQ2 = O7.r.Q(p113n1.r.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectE.isFinished()) {
                edgeEffectE.onAbsorb(iQ2);
            }
        } else if (p113n1.r.c(jD2) < 0.0f) {
            EdgeEffect edgeEffectB = m8.b();
            int i11 = -O7.r.Q(p113n1.r.c(jD2));
            if (Build.VERSION.SDK_INT >= 31 || edgeEffectB.isFinished()) {
                edgeEffectB.onAbsorb(i11);
            }
        }
        a();
        return a2;
    }

    public final long c() {
        long jW = this.f28984b;
        if ((9223372034707292159L & jW) == 9205357640488583168L) {
            jW = AbstractC1903s.w(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jW >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jW & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void d() {
        if (this.f28987e) {
            this.f28986d.setValue(p070h6.A.f22523a);
        }
    }

    public final float e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i3 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.f28985c.b();
        float fC = -fIntBitsToFloat2;
        float f9 = 1 - fIntBitsToFloat;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            fC = AbstractC2899t.c(edgeEffectB, fC, f9);
        } else {
            edgeEffectB.onPull(fC, f9);
        }
        return (i9 >= 31 ? AbstractC2899t.b(edgeEffectB) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (4294967295L & this.g)) * (-fC) : Float.intBitsToFloat(i3);
    }

    public final float f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i3 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.f28985c.c();
        float f9 = 1 - fIntBitsToFloat;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            fIntBitsToFloat2 = AbstractC2899t.c(edgeEffectC, fIntBitsToFloat2, f9);
        } else {
            edgeEffectC.onPull(fIntBitsToFloat2, f9);
        }
        return (i9 >= 31 ? AbstractC2899t.b(edgeEffectC) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * fIntBitsToFloat2 : Float.intBitsToFloat(i3);
    }

    public final float g(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i3 = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.f28985c.d();
        float fC = -fIntBitsToFloat2;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            fC = AbstractC2899t.c(edgeEffectD, fC, fIntBitsToFloat);
        } else {
            edgeEffectD.onPull(fC, fIntBitsToFloat);
        }
        return (i9 >= 31 ? AbstractC2899t.b(edgeEffectD) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-fC) : Float.intBitsToFloat(i3);
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i3 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i3) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.f28985c.e();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            fIntBitsToFloat2 = AbstractC2899t.c(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat);
        } else {
            edgeEffectE.onPull(fIntBitsToFloat2, fIntBitsToFloat);
        }
        return (i9 >= 31 ? AbstractC2899t.b(edgeEffectE) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * fIntBitsToFloat2 : Float.intBitsToFloat(i3);
    }

    public final void i(long j) {
        boolean zA = p181w0.d.a(this.g, 0L);
        boolean zA2 = p181w0.d.a(j, this.g);
        this.g = j;
        if (!zA2) {
            int iQ = O7.r.Q(Float.intBitsToFloat((int) (j >> 32)));
            long jQ = (((long) O7.r.Q(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iQ) << 32);
            M m8 = this.f28985c;
            m8.f28881c = jQ;
            EdgeEffect edgeEffect = m8.f28882d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect2 = m8.f28883e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect3 = m8.f28884f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jQ & 4294967295L), (int) (jQ >> 32));
            }
            EdgeEffect edgeEffect4 = m8.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jQ & 4294967295L), (int) (jQ >> 32));
            }
            EdgeEffect edgeEffect5 = m8.f28885h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect6 = m8.f28886i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jQ >> 32), (int) (jQ & 4294967295L));
            }
            EdgeEffect edgeEffect7 = m8.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jQ & 4294967295L), (int) (jQ >> 32));
            }
            EdgeEffect edgeEffect8 = m8.f28887k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jQ), (int) (jQ >> 32));
            }
        }
        if (zA || zA2) {
            return;
        }
        a();
    }
}
