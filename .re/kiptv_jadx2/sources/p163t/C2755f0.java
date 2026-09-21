package p163t;

import D1.AbstractC0220e0;
import D6.g;
import O7.r;
import S7.C0895k;
import com.google.common.util.concurrent.P;
import java.util.concurrent.CancellationException;
import p020c0.AbstractC1703s;
import p020c0.C1673c0;
import p020c0.C1681g0;
import p028c8.d;
import p070h6.A;
import p077i5.C2237d;
import p078i6.m;
import p109m6.a;
import p114n2.C2650i;
import p117n6.c;
import p117n6.i;
import p136q.D;
import p194x6.j;

public final class C2755f0 extends AbstractC0220e0 {
    public static final C2770n y = new C2770n(0.0f);

    public static final C2770n f27593z = new C2770n(1.0f);

    public final C1681g0 f27594i;
    public final C1681g0 j;

    public Object f27595k;

    public y0 f27596l;

    public long f27597m;

    public final C2237d f27598n;

    public final C1673c0 f27599o;

    public C0895k f27600p;

    public final d f27601q;

    public final Q f27602r;

    public long f27603s;

    public final D f27604t;

    public V f27605u;

    public final U f27606v;

    public float f27607w;

    public final U f27608x;

    public C2755f0(C2650i c2650i) {
        super(4);
        this.f27594i = AbstractC1703s.y(c2650i);
        this.j = AbstractC1703s.y(c2650i);
        this.f27595k = c2650i;
        this.f27598n = new C2237d(22, this);
        this.f27599o = new C1673c0(0.0f);
        this.f27601q = new d();
        this.f27602r = new Q();
        this.f27603s = Long.MIN_VALUE;
        this.f27604t = new D();
        final int i3 = 0;
        this.f27606v = new j(this) {

            public final C2755f0 f27509i;

            {
                this.f27509i = this;
            }

            @Override
            public final Object invoke(Object obj) {
                Long l2 = (Long) obj;
                switch (i3) {
                    case 0:
                        this.f27509i.f27603s = l2.longValue();
                        break;
                    default:
                        long jLongValue = l2.longValue();
                        C2755f0 c2755f0 = this.f27509i;
                        long j = jLongValue - c2755f0.f27603s;
                        c2755f0.f27603s = jLongValue;
                        long jR = r.R(j / ((double) c2755f0.f27607w));
                        D d4 = c2755f0.f27604t;
                        if (d4.i()) {
                            Object[] objArr = d4.f26303a;
                            int i9 = d4.f26304b;
                            int i10 = 0;
                            for (int i11 = 0; i11 < i9; i11++) {
                                V v6 = (V) objArr[i11];
                                C2755f0.K0(v6, jR);
                                v6.f27512c = true;
                            }
                            y0 y0Var = c2755f0.f27596l;
                            if (y0Var != null) {
                                y0Var.o();
                            }
                            int i12 = d4.f26304b;
                            Object[] objArr2 = d4.f26303a;
                            g gVarW = r.W(0, i12);
                            int i13 = gVarW.f2458h;
                            int i14 = gVarW.f2459i;
                            if (i13 <= i14) {
                                while (true) {
                                    objArr2[i13 - i10] = objArr2[i13];
                                    if (((V) objArr2[i13]).f27512c) {
                                        i10++;
                                    }
                                    if (i13 != i14) {
                                        i13++;
                                    }
                                }
                            }
                            m.h0(objArr2, null, i12 - i10, i12);
                            d4.f26304b -= i10;
                        }
                        V v9 = c2755f0.f27605u;
                        if (v9 != null) {
                            v9.g = c2755f0.f27597m;
                            C2755f0.K0(v9, jR);
                            c2755f0.N0(v9.f27513d);
                            if (v9.f27513d == 1.0f) {
                                c2755f0.f27605u = null;
                            }
                            c2755f0.M0();
                        }
                        break;
                }
                return A.f22523a;
            }
        };
        final int i9 = 1;
        this.f27608x = new j(this) {

            public final C2755f0 f27509i;

            {
                this.f27509i = this;
            }

            @Override
            public final Object invoke(Object obj) {
                Long l2 = (Long) obj;
                switch (i9) {
                    case 0:
                        this.f27509i.f27603s = l2.longValue();
                        break;
                    default:
                        long jLongValue = l2.longValue();
                        C2755f0 c2755f0 = this.f27509i;
                        long j = jLongValue - c2755f0.f27603s;
                        c2755f0.f27603s = jLongValue;
                        long jR = r.R(j / ((double) c2755f0.f27607w));
                        D d4 = c2755f0.f27604t;
                        if (d4.i()) {
                            Object[] objArr = d4.f26303a;
                            int i10 = d4.f26304b;
                            int i11 = 0;
                            for (int i12 = 0; i12 < i10; i12++) {
                                V v6 = (V) objArr[i12];
                                C2755f0.K0(v6, jR);
                                v6.f27512c = true;
                            }
                            y0 y0Var = c2755f0.f27596l;
                            if (y0Var != null) {
                                y0Var.o();
                            }
                            int i13 = d4.f26304b;
                            Object[] objArr2 = d4.f26303a;
                            g gVarW = r.W(0, i13);
                            int i14 = gVarW.f2458h;
                            int i15 = gVarW.f2459i;
                            if (i14 <= i15) {
                                while (true) {
                                    objArr2[i14 - i11] = objArr2[i14];
                                    if (((V) objArr2[i14]).f27512c) {
                                        i11++;
                                    }
                                    if (i14 != i15) {
                                        i14++;
                                    }
                                }
                            }
                            m.h0(objArr2, null, i13 - i11, i13);
                            d4.f26304b -= i11;
                        }
                        V v9 = c2755f0.f27605u;
                        if (v9 != null) {
                            v9.g = c2755f0.f27597m;
                            C2755f0.K0(v9, jR);
                            c2755f0.N0(v9.f27513d);
                            if (v9.f27513d == 1.0f) {
                                c2755f0.f27605u = null;
                            }
                            c2755f0.M0();
                        }
                        break;
                }
                return A.f22523a;
            }
        };
    }

    public static final void E0(C2755f0 c2755f0) {
        y0 y0Var = c2755f0.f27596l;
        if (y0Var == null) {
            return;
        }
        V v6 = c2755f0.f27605u;
        if (v6 == null) {
            if (c2755f0.f27597m > 0) {
                C1673c0 c1673c0 = c2755f0.f27599o;
                if (c1673c0.g() == 1.0f || kotlin.jvm.internal.m.a(c2755f0.j.getValue(), c2755f0.f27594i.getValue())) {
                    v6 = null;
                } else {
                    V v9 = new V();
                    v9.f27513d = c1673c0.g();
                    long j = c2755f0.f27597m;
                    v9.g = j;
                    v9.f27516h = r.R((1.0d - ((double) c1673c0.g())) * j);
                    v9.f27514e.e(c1673c0.g(), 0);
                    v6 = v9;
                }
            } else {
                v6 = null;
            }
        }
        if (v6 != null) {
            v6.g = c2755f0.f27597m;
            c2755f0.f27604t.a(v6);
            y0Var.m(v6);
        }
        c2755f0.f27605u = null;
    }

    public static final Object F0(C2755f0 c2755f0, c cVar) {
        Y y9;
        c2755f0.getClass();
        if (cVar instanceof Y) {
            y9 = (Y) cVar;
            int i3 = y9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y9.j = i3 - Integer.MIN_VALUE;
            } else {
                y9 = new Y(c2755f0, cVar);
            }
        } else {
            y9 = new Y(c2755f0, cVar);
        }
        Object obj = y9.f27525h;
        Object obj2 = a.f25430h;
        int i9 = y9.j;
        A a2 = A.f22523a;
        D d4 = c2755f0.f27604t;
        if (i9 == 0) {
            P.u0(obj);
            if (d4.h() && c2755f0.f27605u == null) {
                return a2;
            }
            if (AbstractC2750d.l(y9.getContext()) == 0.0f) {
                c2755f0.J0();
                c2755f0.f27603s = Long.MIN_VALUE;
                return a2;
            }
            if (c2755f0.f27603s == Long.MIN_VALUE) {
                y9.j = 1;
                if (AbstractC1703s.v(y9.getContext()).a(c2755f0.f27606v, y9) != obj2) {
                }
            }
            return obj2;
        }
        if (i9 != 1 && i9 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P.u0(obj);
        do {
            if (!d4.i() && c2755f0.f27605u == null) {
                c2755f0.f27603s = Long.MIN_VALUE;
                return a2;
            }
            y9.j = 2;
        } while (c2755f0.I0(y9) != obj2);
        return obj2;
    }

    public static final Object G0(C2755f0 c2755f0, c cVar) {
        C2751d0 c2751d0;
        Object value;
        Object obj;
        c2755f0.getClass();
        if (cVar instanceof C2751d0) {
            c2751d0 = (C2751d0) cVar;
            int i3 = c2751d0.f27579k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2751d0.f27579k = i3 - Integer.MIN_VALUE;
            } else {
                c2751d0 = new C2751d0(c2755f0, cVar);
            }
        } else {
            c2751d0 = new C2751d0(c2755f0, cVar);
        }
        Object obj2 = c2751d0.f27578i;
        a aVar = a.f25430h;
        int i9 = c2751d0.f27579k;
        d dVar = c2755f0.f27601q;
        if (i9 == 0) {
            P.u0(obj2);
            value = c2755f0.f27594i.getValue();
            c2751d0.f27577h = value;
            c2751d0.f27579k = 1;
            if (dVar.e(c2751d0) != aVar) {
            }
            return aVar;
        }
        if (i9 == 1) {
            Object obj3 = c2751d0.f27577h;
            P.u0(obj2);
            value = obj3;
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c2751d0.f27577h;
            P.u0(obj2);
        }
        if (kotlin.jvm.internal.m.a(obj2, obj)) {
            return A.f22523a;
        }
        c2755f0.f27603s = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        c2751d0.f27577h = value;
        c2751d0.f27579k = 2;
        C0895k c0895k = new C0895k(1, P.h0(c2751d0));
        c0895k.r();
        c2755f0.f27600p = c0895k;
        dVar.g(null);
        Object objQ = c0895k.q();
        if (objQ != aVar) {
            obj = value;
            obj2 = objQ;
            if (kotlin.jvm.internal.m.a(obj2, obj)) {
                return A.f22523a;
            }
            c2755f0.f27603s = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return aVar;
    }

    public static final Object H0(C2755f0 c2755f0, c cVar) {
        C2753e0 c2753e0;
        Object value;
        Object obj;
        c2755f0.getClass();
        if (cVar instanceof C2753e0) {
            c2753e0 = (C2753e0) cVar;
            int i3 = c2753e0.f27586k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2753e0.f27586k = i3 - Integer.MIN_VALUE;
            } else {
                c2753e0 = new C2753e0(c2755f0, cVar);
            }
        } else {
            c2753e0 = new C2753e0(c2755f0, cVar);
        }
        Object obj2 = c2753e0.f27585i;
        a aVar = a.f25430h;
        int i9 = c2753e0.f27586k;
        d dVar = c2755f0.f27601q;
        if (i9 == 0) {
            P.u0(obj2);
            value = c2755f0.f27594i.getValue();
            c2753e0.f27584h = value;
            c2753e0.f27586k = 1;
            if (dVar.e(c2753e0) != aVar) {
            }
            return aVar;
        }
        if (i9 == 1) {
            Object obj3 = c2753e0.f27584h;
            P.u0(obj2);
            value = obj3;
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c2753e0.f27584h;
            P.u0(obj2);
        }
        if (!kotlin.jvm.internal.m.a(obj2, obj)) {
            c2755f0.f27603s = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return A.f22523a;
        if (!kotlin.jvm.internal.m.a(value, c2755f0.f27595k)) {
            c2753e0.f27584h = value;
            c2753e0.f27586k = 2;
            C0895k c0895k = new C0895k(1, P.h0(c2753e0));
            c0895k.r();
            c2755f0.f27600p = c0895k;
            dVar.g(null);
            Object objQ = c0895k.q();
            if (objQ != aVar) {
                obj = value;
                obj2 = objQ;
                if (!kotlin.jvm.internal.m.a(obj2, obj)) {
                    c2755f0.f27603s = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return aVar;
        }
        dVar.g(null);
        return A.f22523a;
    }

    public static void K0(V v6, long j) {
        long j9 = v6.f27510a + j;
        v6.f27510a = j9;
        long j10 = v6.f27516h;
        if (j9 >= j10) {
            v6.f27513d = 1.0f;
            return;
        }
        J0 j11 = v6.f27511b;
        if (j11 == null) {
            float f9 = j9 / j10;
            v6.f27513d = (f9 * 1.0f) + ((1 - f9) * v6.f27514e.a(0));
            return;
        }
        C2770n c2770n = f27593z;
        C2770n c2770n2 = v6.f27515f;
        if (c2770n2 == null) {
            c2770n2 = y;
        }
        v6.f27513d = r.r(((C2770n) j11.e(j9, v6.f27514e, c2770n, c2770n2)).a(0), 0.0f, 1.0f);
    }

    @Override
    public final void A0(Object obj) {
        this.j.setValue(obj);
    }

    @Override
    public final void B0(y0 y0Var) {
        y0 y0Var2 = this.f27596l;
        if (!(y0Var2 == null || kotlin.jvm.internal.m.a(y0Var, y0Var2))) {
            S.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f27596l + ", new instance: " + y0Var);
        }
        this.f27596l = y0Var;
    }

    @Override
    public final void C0() {
        this.f27596l = null;
        ((p121o0.r) C0.f27442b.getValue()).b(this);
    }

    public final Object I0(c cVar) {
        float fL = AbstractC2750d.l(cVar.getContext());
        A a2 = A.f22523a;
        if (fL <= 0.0f) {
            J0();
            return a2;
        }
        this.f27607w = fL;
        Object objA = AbstractC1703s.v(cVar.getContext()).a(this.f27608x, cVar);
        return objA == a.f25430h ? objA : a2;
    }

    public final void J0() {
        y0 y0Var = this.f27596l;
        if (y0Var != null) {
            y0Var.c();
        }
        this.f27604t.d();
        if (this.f27605u != null) {
            this.f27605u = null;
            N0(1.0f);
            M0();
        }
    }

    public final Object L0(float f9, Object obj, i iVar) {
        if (0.0f > f9 || f9 > 1.0f) {
            S.a("Expecting fraction between 0 and 1. Got " + f9);
        }
        y0 y0Var = this.f27596l;
        A a2 = A.f22523a;
        if (y0Var != null) {
            Object objA = Q.a(this.f27602r, new C2747b0(obj, this.f27594i.getValue(), this, y0Var, f9, null), iVar);
            if (objA == a.f25430h) {
                return objA;
            }
        }
        return a2;
    }

    public final void M0() {
        y0 y0Var = this.f27596l;
        if (y0Var == null) {
            return;
        }
        y0Var.l(r.R(((double) this.f27599o.g()) * ((Number) y0Var.f27736l.getValue()).longValue()));
    }

    public final void N0(float f9) {
        this.f27599o.h(f9);
    }

    @Override
    public final Object s0() {
        return this.j.getValue();
    }
}
