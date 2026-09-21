package p163t;

/* JADX INFO: renamed from: t.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2755f0 extends D1.AbstractC0220e0 {
    public static final p163t.C2770n y = new p163t.C2770n(0.0f);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p163t.C2770n f27593z = new p163t.C2770n(1.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p020c0.C1681g0 f27594i;
    public final p020c0.C1681g0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f27595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p163t.y0 f27596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f27597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p077i5.C2237d f27598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p020c0.C1673c0 f27599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public S7.C0895k f27600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p028c8.d f27601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p163t.Q f27602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f27603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p136q.D f27604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p163t.V f27605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p163t.U f27606v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f27607w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p163t.U f27608x;

    /* JADX WARN: Type inference failed for: r3v6, types: [t.U] */
    /* JADX WARN: Type inference failed for: r3v7, types: [t.U] */
    public C2755f0(p114n2.C2650i c2650i) {
        super(4);
        this.f27594i = p020c0.AbstractC1703s.y(c2650i);
        this.j = p020c0.AbstractC1703s.y(c2650i);
        this.f27595k = c2650i;
        this.f27598n = new p077i5.C2237d(22, this);
        this.f27599o = new p020c0.C1673c0(0.0f);
        this.f27601q = new p028c8.d();
        this.f27602r = new p163t.Q();
        this.f27603s = Long.MIN_VALUE;
        this.f27604t = new p136q.D();
        final int i3 = 0;
        this.f27606v = new p194x6.j(this) { // from class: t.U

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p163t.C2755f0 f27509i;

            {
                this.f27509i = this;
            }

            @Override // p194x6.j
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Long l2 = (java.lang.Long) obj;
                switch (i3) {
                    case 0:
                        this.f27509i.f27603s = l2.longValue();
                        break;
                    default:
                        long jLongValue = l2.longValue();
                        p163t.C2755f0 c2755f0 = this.f27509i;
                        long j = jLongValue - c2755f0.f27603s;
                        c2755f0.f27603s = jLongValue;
                        long jR = O7.r.R(j / ((double) c2755f0.f27607w));
                        p136q.D d4 = c2755f0.f27604t;
                        if (d4.i()) {
                            java.lang.Object[] objArr = d4.f26303a;
                            int i9 = d4.f26304b;
                            int i10 = 0;
                            for (int i11 = 0; i11 < i9; i11++) {
                                p163t.V v6 = (p163t.V) objArr[i11];
                                p163t.C2755f0.K0(v6, jR);
                                v6.f27512c = true;
                            }
                            p163t.y0 y0Var = c2755f0.f27596l;
                            if (y0Var != null) {
                                y0Var.o();
                            }
                            int i12 = d4.f26304b;
                            java.lang.Object[] objArr2 = d4.f26303a;
                            D6.g gVarW = O7.r.W(0, i12);
                            int i13 = gVarW.f2458h;
                            int i14 = gVarW.f2459i;
                            if (i13 <= i14) {
                                while (true) {
                                    objArr2[i13 - i10] = objArr2[i13];
                                    if (((p163t.V) objArr2[i13]).f27512c) {
                                        i10++;
                                    }
                                    if (i13 != i14) {
                                        i13++;
                                    }
                                }
                            }
                            p078i6.m.h0(objArr2, null, i12 - i10, i12);
                            d4.f26304b -= i10;
                        }
                        p163t.V v9 = c2755f0.f27605u;
                        if (v9 != null) {
                            v9.g = c2755f0.f27597m;
                            p163t.C2755f0.K0(v9, jR);
                            c2755f0.N0(v9.f27513d);
                            if (v9.f27513d == 1.0f) {
                                c2755f0.f27605u = null;
                            }
                            c2755f0.M0();
                        }
                        break;
                }
                return p070h6.A.f22523a;
            }
        };
        final int i9 = 1;
        this.f27608x = new p194x6.j(this) { // from class: t.U

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ p163t.C2755f0 f27509i;

            {
                this.f27509i = this;
            }

            @Override // p194x6.j
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Long l2 = (java.lang.Long) obj;
                switch (i9) {
                    case 0:
                        this.f27509i.f27603s = l2.longValue();
                        break;
                    default:
                        long jLongValue = l2.longValue();
                        p163t.C2755f0 c2755f0 = this.f27509i;
                        long j = jLongValue - c2755f0.f27603s;
                        c2755f0.f27603s = jLongValue;
                        long jR = O7.r.R(j / ((double) c2755f0.f27607w));
                        p136q.D d4 = c2755f0.f27604t;
                        if (d4.i()) {
                            java.lang.Object[] objArr = d4.f26303a;
                            int i10 = d4.f26304b;
                            int i11 = 0;
                            for (int i12 = 0; i12 < i10; i12++) {
                                p163t.V v6 = (p163t.V) objArr[i12];
                                p163t.C2755f0.K0(v6, jR);
                                v6.f27512c = true;
                            }
                            p163t.y0 y0Var = c2755f0.f27596l;
                            if (y0Var != null) {
                                y0Var.o();
                            }
                            int i13 = d4.f26304b;
                            java.lang.Object[] objArr2 = d4.f26303a;
                            D6.g gVarW = O7.r.W(0, i13);
                            int i14 = gVarW.f2458h;
                            int i15 = gVarW.f2459i;
                            if (i14 <= i15) {
                                while (true) {
                                    objArr2[i14 - i11] = objArr2[i14];
                                    if (((p163t.V) objArr2[i14]).f27512c) {
                                        i11++;
                                    }
                                    if (i14 != i15) {
                                        i14++;
                                    }
                                }
                            }
                            p078i6.m.h0(objArr2, null, i13 - i11, i13);
                            d4.f26304b -= i11;
                        }
                        p163t.V v9 = c2755f0.f27605u;
                        if (v9 != null) {
                            v9.g = c2755f0.f27597m;
                            p163t.C2755f0.K0(v9, jR);
                            c2755f0.N0(v9.f27513d);
                            if (v9.f27513d == 1.0f) {
                                c2755f0.f27605u = null;
                            }
                            c2755f0.M0();
                        }
                        break;
                }
                return p070h6.A.f22523a;
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005d  */
    public static final void E0(p163t.C2755f0 c2755f0) {
        p163t.y0 y0Var = c2755f0.f27596l;
        if (y0Var == null) {
            return;
        }
        p163t.V v6 = c2755f0.f27605u;
        if (v6 == null) {
            if (c2755f0.f27597m > 0) {
                p020c0.C1673c0 c1673c0 = c2755f0.f27599o;
                if (c1673c0.g() == 1.0f || kotlin.jvm.internal.m.a(c2755f0.j.getValue(), c2755f0.f27594i.getValue())) {
                    v6 = null;
                } else {
                    p163t.V v9 = new p163t.V();
                    v9.f27513d = c1673c0.g();
                    long j = c2755f0.f27597m;
                    v9.g = j;
                    v9.f27516h = O7.r.R((1.0d - ((double) c1673c0.g())) * j);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object F0(p163t.C2755f0 c2755f0, p117n6.c cVar) {
        p163t.Y y9;
        c2755f0.getClass();
        if (cVar instanceof p163t.Y) {
            y9 = (p163t.Y) cVar;
            int i3 = y9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                y9.j = i3 - Integer.MIN_VALUE;
            } else {
                y9 = new p163t.Y(c2755f0, cVar);
            }
        } else {
            y9 = new p163t.Y(c2755f0, cVar);
        }
        java.lang.Object obj = y9.f27525h;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = y9.j;
        p070h6.A a2 = p070h6.A.f22523a;
        p136q.D d4 = c2755f0.f27604t;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (d4.h() && c2755f0.f27605u == null) {
                return a2;
            }
            if (p163t.AbstractC2750d.l(y9.getContext()) == 0.0f) {
                c2755f0.J0();
                c2755f0.f27603s = Long.MIN_VALUE;
                return a2;
            }
            if (c2755f0.f27603s == Long.MIN_VALUE) {
                y9.j = 1;
                if (p020c0.AbstractC1703s.v(y9.getContext()).a(c2755f0.f27606v, y9) != obj2) {
                }
            }
            return obj2;
        }
        if (i9 != 1 && i9 != 2) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.common.util.concurrent.P.u0(obj);
        do {
            if (!d4.i() && c2755f0.f27605u == null) {
                c2755f0.f27603s = Long.MIN_VALUE;
                return a2;
            }
            y9.j = 2;
        } while (c2755f0.I0(y9) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object G0(p163t.C2755f0 c2755f0, p117n6.c cVar) {
        p163t.C2751d0 c2751d0;
        java.lang.Object value;
        java.lang.Object obj;
        c2755f0.getClass();
        if (cVar instanceof p163t.C2751d0) {
            c2751d0 = (p163t.C2751d0) cVar;
            int i3 = c2751d0.f27579k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2751d0.f27579k = i3 - Integer.MIN_VALUE;
            } else {
                c2751d0 = new p163t.C2751d0(c2755f0, cVar);
            }
        } else {
            c2751d0 = new p163t.C2751d0(c2755f0, cVar);
        }
        java.lang.Object obj2 = c2751d0.f27578i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c2751d0.f27579k;
        p028c8.d dVar = c2755f0.f27601q;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj2);
            value = c2755f0.f27594i.getValue();
            c2751d0.f27577h = value;
            c2751d0.f27579k = 1;
            if (dVar.e(c2751d0) != aVar) {
            }
            return aVar;
        }
        if (i9 == 1) {
            java.lang.Object obj3 = c2751d0.f27577h;
            com.google.common.util.concurrent.P.u0(obj2);
            value = obj3;
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c2751d0.f27577h;
            com.google.common.util.concurrent.P.u0(obj2);
        }
        if (kotlin.jvm.internal.m.a(obj2, obj)) {
            return p070h6.A.f22523a;
        }
        c2755f0.f27603s = Long.MIN_VALUE;
        throw new java.util.concurrent.CancellationException("targetState while waiting for composition");
        c2751d0.f27577h = value;
        c2751d0.f27579k = 2;
        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c2751d0));
        c0895k.r();
        c2755f0.f27600p = c0895k;
        dVar.g(null);
        java.lang.Object objQ = c0895k.q();
        if (objQ != aVar) {
            obj = value;
            obj2 = objQ;
            if (kotlin.jvm.internal.m.a(obj2, obj)) {
                return p070h6.A.f22523a;
            }
            c2755f0.f27603s = Long.MIN_VALUE;
            throw new java.util.concurrent.CancellationException("targetState while waiting for composition");
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0089, please report this as an issue */
    public static final java.lang.Object H0(p163t.C2755f0 c2755f0, p117n6.c cVar) {
        p163t.C2753e0 c2753e0;
        java.lang.Object value;
        java.lang.Object obj;
        c2755f0.getClass();
        if (cVar instanceof p163t.C2753e0) {
            c2753e0 = (p163t.C2753e0) cVar;
            int i3 = c2753e0.f27586k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c2753e0.f27586k = i3 - Integer.MIN_VALUE;
            } else {
                c2753e0 = new p163t.C2753e0(c2755f0, cVar);
            }
        } else {
            c2753e0 = new p163t.C2753e0(c2755f0, cVar);
        }
        java.lang.Object obj2 = c2753e0.f27585i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c2753e0.f27586k;
        p028c8.d dVar = c2755f0.f27601q;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj2);
            value = c2755f0.f27594i.getValue();
            c2753e0.f27584h = value;
            c2753e0.f27586k = 1;
            if (dVar.e(c2753e0) != aVar) {
            }
            return aVar;
        }
        if (i9 == 1) {
            java.lang.Object obj3 = c2753e0.f27584h;
            com.google.common.util.concurrent.P.u0(obj2);
            value = obj3;
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c2753e0.f27584h;
            com.google.common.util.concurrent.P.u0(obj2);
        }
        if (!kotlin.jvm.internal.m.a(obj2, obj)) {
            c2755f0.f27603s = Long.MIN_VALUE;
            throw new java.util.concurrent.CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return p070h6.A.f22523a;
        if (!kotlin.jvm.internal.m.a(value, c2755f0.f27595k)) {
            c2753e0.f27584h = value;
            c2753e0.f27586k = 2;
            S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c2753e0));
            c0895k.r();
            c2755f0.f27600p = c0895k;
            dVar.g(null);
            java.lang.Object objQ = c0895k.q();
            if (objQ != aVar) {
                obj = value;
                obj2 = objQ;
                if (!kotlin.jvm.internal.m.a(obj2, obj)) {
                    c2755f0.f27603s = Long.MIN_VALUE;
                    throw new java.util.concurrent.CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return aVar;
        }
        dVar.g(null);
        return p070h6.A.f22523a;
    }

    public static void K0(p163t.V v6, long j) {
        long j9 = v6.f27510a + j;
        v6.f27510a = j9;
        long j10 = v6.f27516h;
        if (j9 >= j10) {
            v6.f27513d = 1.0f;
            return;
        }
        p163t.J0 j11 = v6.f27511b;
        if (j11 == null) {
            float f9 = j9 / j10;
            v6.f27513d = (f9 * 1.0f) + ((1 - f9) * v6.f27514e.a(0));
            return;
        }
        p163t.C2770n c2770n = f27593z;
        p163t.C2770n c2770n2 = v6.f27515f;
        if (c2770n2 == null) {
            c2770n2 = y;
        }
        v6.f27513d = O7.r.r(((p163t.C2770n) j11.e(j9, v6.f27514e, c2770n, c2770n2)).a(0), 0.0f, 1.0f);
    }

    @Override // D1.AbstractC0220e0
    public final void A0(java.lang.Object obj) {
        this.j.setValue(obj);
    }

    @Override // D1.AbstractC0220e0
    public final void B0(p163t.y0 y0Var) {
        p163t.y0 y0Var2 = this.f27596l;
        if (!(y0Var2 == null || kotlin.jvm.internal.m.a(y0Var, y0Var2))) {
            p163t.S.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f27596l + ", new instance: " + y0Var);
        }
        this.f27596l = y0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h6.h, java.lang.Object] */
    @Override // D1.AbstractC0220e0
    public final void C0() {
        this.f27596l = null;
        ((p121o0.r) p163t.C0.f27442b.getValue()).b(this);
    }

    public final java.lang.Object I0(p117n6.c cVar) {
        float fL = p163t.AbstractC2750d.l(cVar.getContext());
        p070h6.A a2 = p070h6.A.f22523a;
        if (fL <= 0.0f) {
            J0();
            return a2;
        }
        this.f27607w = fL;
        java.lang.Object objA = p020c0.AbstractC1703s.v(cVar.getContext()).a(this.f27608x, cVar);
        return objA == p109m6.a.f25430h ? objA : a2;
    }

    public final void J0() {
        p163t.y0 y0Var = this.f27596l;
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

    public final java.lang.Object L0(float f9, java.lang.Object obj, p117n6.i iVar) {
        if (0.0f > f9 || f9 > 1.0f) {
            p163t.S.a("Expecting fraction between 0 and 1. Got " + f9);
        }
        p163t.y0 y0Var = this.f27596l;
        p070h6.A a2 = p070h6.A.f22523a;
        if (y0Var != null) {
            java.lang.Object objA = p163t.Q.a(this.f27602r, new p163t.C2747b0(obj, this.f27594i.getValue(), this, y0Var, f9, null), iVar);
            if (objA == p109m6.a.f25430h) {
                return objA;
            }
        }
        return a2;
    }

    public final void M0() {
        p163t.y0 y0Var = this.f27596l;
        if (y0Var == null) {
            return;
        }
        y0Var.l(O7.r.R(((double) this.f27599o.g()) * ((java.lang.Number) y0Var.f27736l.getValue()).longValue()));
    }

    public final void N0(float f9) {
        this.f27599o.h(f9);
    }

    @Override // D1.AbstractC0220e0
    public final java.lang.Object s0() {
        return this.j.getValue();
    }
}
