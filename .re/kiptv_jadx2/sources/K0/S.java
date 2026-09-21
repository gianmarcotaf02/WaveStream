package K0;

import Q0.AbstractC0777k;
import R0.V0;
import S7.C0895k;
import S7.w0;

public final class S implements p113n1.c, p100l6.c {

    public final U f6670h;

    public final C0895k f6671i;
    public C0895k j;

    public EnumC0668p f6672k = EnumC0668p.f6731i;

    public final p100l6.i f6673l = p100l6.i.f24820h;

    public final U f6674m;

    public S(U u6, C0895k c0895k) {
        this.f6674m = u6;
        this.f6670h = u6;
        this.f6671i = c0895k;
    }

    @Override
    public final long G(float f9) {
        return this.f6670h.G(f9);
    }

    @Override
    public final float K(int i3) {
        return this.f6670h.K(i3);
    }

    @Override
    public final float N(float f9) {
        return f9 / this.f6670h.getDensity();
    }

    @Override
    public final float S() {
        return this.f6670h.S();
    }

    @Override
    public final float Y(float f9) {
        return this.f6670h.getDensity() * f9;
    }

    public final Object a(EnumC0668p enumC0668p, p117n6.a aVar) {
        C0895k c0895k = new C0895k(1, com.google.common.util.concurrent.P.h0(aVar));
        c0895k.r();
        this.f6672k = enumC0668p;
        this.j = c0895k;
        Object objQ = c0895k.q();
        p109m6.a aVar2 = p109m6.a.f25430h;
        return objQ;
    }

    public final long b() {
        U u6 = this.f6674m;
        u6.getClass();
        long jO0 = u6.o0(AbstractC0777k.t(u6).f8227I.d());
        long j = u6.f6681E;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jO0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jO0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final V0 c() {
        U u6 = this.f6674m;
        u6.getClass();
        return AbstractC0777k.t(u6).f8227I;
    }

    public final Object f(long j, p194x6.m mVar, p117n6.c cVar) {
        O o8;
        C0895k c0895k;
        if (cVar instanceof O) {
            o8 = (O) cVar;
            int i3 = o8.f6665k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o8.f6665k = i3 - Integer.MIN_VALUE;
            } else {
                o8 = new O(this, cVar);
            }
        } else {
            o8 = new O(this, cVar);
        }
        Object objInvoke = o8.f6664i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = o8.f6665k;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objInvoke);
                if (j <= 0 && (c0895k = this.j) != null) {
                    c0895k.resumeWith(com.google.common.util.concurrent.P.T(new C0669q(j)));
                }
                w0 w0VarA = S7.C.A(this.f6674m.B0(), null, new P(j, this, null), 3);
                o8.f6663h = w0VarA;
                o8.f6665k = 1;
                objInvoke = mVar.invoke(this, o8);
                j = w0VarA;
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w0 w0Var = o8.f6663h;
                com.google.common.util.concurrent.P.u0(objInvoke);
                j = w0Var;
            }
            j.e(C0654b.f6687i);
            return objInvoke;
        } catch (Throwable th) {
            j.e(C0654b.f6687i);
            throw th;
        }
    }

    @Override
    public final p100l6.h getContext() {
        return this.f6673l;
    }

    @Override
    public final float getDensity() {
        return this.f6670h.getDensity();
    }

    public final Object h(long j, p194x6.m mVar, p117n6.a aVar) {
        Q q9;
        if (aVar instanceof Q) {
            q9 = (Q) aVar;
            int i3 = q9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9.j = i3 - Integer.MIN_VALUE;
            } else {
                q9 = new Q(this, aVar);
            }
        } else {
            q9 = new Q(this, aVar);
        }
        Object obj = q9.f6668h;
        Object obj2 = p109m6.a.f25430h;
        int i9 = q9.j;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            }
            com.google.common.util.concurrent.P.u0(obj);
            q9.j = 1;
            Object objF = f(j, mVar, q9);
            return objF == obj2 ? obj2 : objF;
        } catch (C0669q unused) {
            return null;
        }
    }

    @Override
    public final int k0(float f9) {
        return this.f6670h.k0(f9);
    }

    @Override
    public final long l(float f9) {
        return this.f6670h.l(f9);
    }

    @Override
    public final long m(long j) {
        return this.f6670h.m(j);
    }

    @Override
    public final long o0(long j) {
        return this.f6670h.o0(j);
    }

    @Override
    public final void resumeWith(Object obj) {
        U u6 = this.f6674m;
        synchronized (u6.f6678B) {
            u6.f6677A.l(this);
        }
        this.f6671i.resumeWith(obj);
    }

    @Override
    public final float s0(long j) {
        return this.f6670h.s0(j);
    }

    @Override
    public final float t(long j) {
        return this.f6670h.t(j);
    }
}
