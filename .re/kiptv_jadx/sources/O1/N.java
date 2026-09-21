package O1;

/* JADX INFO: loaded from: classes.dex */
public final class N implements O1.InterfaceC0744h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q1.f f7775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B3.o f7776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S7.A f7777c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7780f;
    public S7.w0 g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final A7.m f7782i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A7.m f7784l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O1.C0754s f7778d = new O1.C0754s(new O1.C0755t(this, null));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p028c8.d f7779e = new p028c8.d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p166t3.i f7781h = new p166t3.i(16);
    public final p070h6.p j = com.google.common.util.concurrent.D.B(new O1.C0749m(this, 1));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p070h6.p f7783k = com.google.common.util.concurrent.D.B(new O1.C0749m(this, 0));

    public N(Q1.f fVar, java.util.List list, B3.o oVar, S7.A a2) {
        this.f7775a = fVar;
        this.f7776b = oVar;
        this.f7777c = a2;
        this.f7782i = new A7.m(this, list);
        this.f7784l = new A7.m(a2, new A0.b(3, this), new O1.K(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object b(O1.N n3, p117n6.c cVar) {
        O1.C0756u c0756u;
        p028c8.d dVar;
        n3.getClass();
        if (cVar instanceof O1.C0756u) {
            c0756u = (O1.C0756u) cVar;
            int i3 = c0756u.f7867l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0756u.f7867l = i3 - Integer.MIN_VALUE;
            } else {
                c0756u = new O1.C0756u(n3, cVar);
            }
        } else {
            c0756u = new O1.C0756u(n3, cVar);
        }
        java.lang.Object obj = c0756u.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0756u.f7867l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c0756u.f7864h = n3;
            dVar = n3.f7779e;
            c0756u.f7865i = dVar;
            c0756u.f7867l = 1;
            if (dVar.e(c0756u) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p028c8.d dVar2 = c0756u.f7865i;
            O1.N n9 = c0756u.f7864h;
            com.google.common.util.concurrent.P.u0(obj);
            dVar = dVar2;
            n3 = n9;
        }
        try {
            int i10 = n3.f7780f - 1;
            n3.f7780f = i10;
            if (i10 == 0) {
                S7.w0 w0Var = n3.g;
                if (w0Var != null) {
                    w0Var.e(null);
                }
                n3.g = null;
            }
            return p070h6.A.f22523a;
        } finally {
            dVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [n6.i, x6.m] */
    /* JADX WARN: Type inference failed for: r2v9, types: [n6.i, x6.m] */
    /* JADX WARN: Type inference failed for: r9v0, types: [O1.N, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9, types: [O1.N] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object c(O1.N n3, O1.P p2, p117n6.c cVar) {
        O1.C0758w c0758w;
        S7.InterfaceC0900p interfaceC0900p;
        S7.C0901q c0901q;
        ?? r9;
        ?? r10;
        p100l6.h hVar;
        java.lang.Object objB;
        ?? r11;
        n3.getClass();
        if (cVar instanceof O1.C0758w) {
            c0758w = (O1.C0758w) cVar;
            int i3 = c0758w.f7874m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0758w.f7874m = i3 - Integer.MIN_VALUE;
            } else {
                c0758w = new O1.C0758w(n3, cVar);
            }
        } else {
            c0758w = new O1.C0758w(n3, cVar);
        }
        java.lang.Object objT = c0758w.f7872k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0758w.f7874m;
        boolean z6 = true;
        try {
            if (i9 != 0) {
                try {
                    if (i9 == 1) {
                        interfaceC0900p = (S7.InterfaceC0900p) c0758w.f7870h;
                    } else if (i9 == 2) {
                        S7.C0901q c0901q2 = c0758w.j;
                        O1.N n9 = c0758w.f7871i;
                        O1.P p9 = (O1.P) c0758w.f7870h;
                        com.google.common.util.concurrent.P.u0(objT);
                        c0901q = c0901q2;
                        r9 = n9;
                        p2 = p9;
                    } else {
                        if (i9 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0900p = (S7.InterfaceC0900p) c0758w.f7870h;
                    }
                    com.google.common.util.concurrent.P.u0(objT);
                    r11 = interfaceC0900p;
                } catch (java.lang.Throwable th) {
                    th = th;
                    objT = com.google.common.util.concurrent.P.T(th);
                    r11 = n3;
                }
                java.lang.Throwable thA = p070h6.n.a(objT);
                S7.C0901q c0901q3 = (S7.C0901q) r11;
                if (thA == null) {
                    c0901q3.J(objT);
                } else {
                    c0901q3.Z(thA);
                }
                return p070h6.A.f22523a;
            }
            com.google.common.util.concurrent.P.u0(objT);
            c0901q = p2.f7787b;
            try {
                O1.Y yP = n3.f7781h.p();
                if (yP instanceof O1.C0739c) {
                    ?? r12 = p2.f7786a;
                    p100l6.h hVar2 = p2.f7789d;
                    c0758w.f7870h = c0901q;
                    c0758w.f7874m = 1;
                    try {
                        objB = n3.g().b(new O1.I(n3, hVar2, r12, null), c0758w);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        th = th;
                        n3 = c0901q;
                        objT = com.google.common.util.concurrent.P.T(th);
                        r11 = n3;
                    }
                } else {
                    if (!(yP instanceof O1.Q)) {
                        z6 = yP instanceof O1.Z;
                    }
                    if (!z6) {
                        if (yP instanceof O1.O) {
                            throw ((O1.O) yP).f7785b;
                        }
                        throw new I3.b();
                    }
                    if (yP != p2.f7788c) {
                        kotlin.jvm.internal.m.c(yP, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                        throw ((O1.Q) yP).f7790b;
                    }
                    c0758w.f7870h = p2;
                    c0758w.f7871i = n3;
                    c0758w.j = c0901q;
                    c0758w.f7874m = 2;
                    if (n3.h(c0758w) == aVar) {
                        r9 = n3;
                    }
                }
                return aVar;
            } catch (java.lang.Throwable th3) {
                th = th3;
                n3 = c0901q;
                objT = com.google.common.util.concurrent.P.T(th);
                r11 = n3;
            }
            objB = r9.g().b(new O1.I(r9, hVar, r10, null), c0758w);
        } catch (java.lang.Throwable th4) {
            th = th4;
            th = th;
            n3 = c0901q;
            objT = com.google.common.util.concurrent.P.T(th);
            r11 = n3;
        }
        r9 = n3;
        r10 = p2.f7786a;
        hVar = p2.f7789d;
        c0758w.f7870h = c0901q;
        c0758w.f7871i = null;
        c0758w.j = null;
        c0758w.f7874m = 3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object d(O1.N n3, p117n6.c cVar) {
        O1.C0759x c0759x;
        p028c8.d dVar;
        n3.getClass();
        if (cVar instanceof O1.C0759x) {
            c0759x = (O1.C0759x) cVar;
            int i3 = c0759x.f7878l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0759x.f7878l = i3 - Integer.MIN_VALUE;
            } else {
                c0759x = new O1.C0759x(n3, cVar);
            }
        } else {
            c0759x = new O1.C0759x(n3, cVar);
        }
        java.lang.Object obj = c0759x.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c0759x.f7878l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c0759x.f7875h = n3;
            dVar = n3.f7779e;
            c0759x.f7876i = dVar;
            c0759x.f7878l = 1;
            if (dVar.e(c0759x) == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p028c8.d dVar2 = c0759x.f7876i;
            O1.N n9 = c0759x.f7875h;
            com.google.common.util.concurrent.P.u0(obj);
            dVar = dVar2;
            n3 = n9;
        }
        try {
            int i10 = n3.f7780f + 1;
            n3.f7780f = i10;
            if (i10 == 1) {
                n3.g = S7.C.A(n3.f7777c, null, new O1.C0760y(n3, null), 3);
            }
            return p070h6.A.f22523a;
        } finally {
            dVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object e(O1.N n3, boolean z6, p100l6.c cVar) throws java.lang.Throwable {
        O1.A a2;
        O1.N n9;
        O1.Y y;
        O1.N n10;
        p070h6.k kVar;
        O1.Y y9;
        n3.getClass();
        if (cVar instanceof O1.A) {
            a2 = (O1.A) cVar;
            int i3 = a2.f7730m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a2.f7730m = i3 - Integer.MIN_VALUE;
            } else {
                a2 = new O1.A(n3, cVar);
            }
        } else {
            a2 = new O1.A(n3, cVar);
        }
        java.lang.Object objC = a2.f7728k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = a2.f7730m;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objC);
            O1.Y yP = n3.f7781h.p();
            if (yP instanceof O1.Z) {
                throw new java.lang.IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            O1.X xG = n3.g();
            a2.f7726h = n3;
            a2.f7727i = yP;
            a2.j = z6;
            a2.f7730m = 1;
            java.lang.Integer numA = xG.a();
            if (numA != aVar) {
                n9 = n3;
                y = yP;
                objC = numA;
            }
            return aVar;
        }
        if (i9 != 1) {
            if (i9 == 2) {
                n10 = a2.f7726h;
                com.google.common.util.concurrent.P.u0(objC);
                kVar = (p070h6.k) objC;
                y9 = (O1.Y) kVar.f22539h;
                if (((java.lang.Boolean) kVar.f22540i).booleanValue()) {
                    n10.f7781h.G(y9);
                }
                return y9;
            }
            if (i9 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n10 = a2.f7726h;
            com.google.common.util.concurrent.P.u0(objC);
            kVar = (p070h6.k) objC;
            y9 = (O1.Y) kVar.f22539h;
            if (((java.lang.Boolean) kVar.f22540i).booleanValue()) {
                n10.f7781h.G(y9);
            }
            return y9;
        }
        z6 = a2.j;
        y = a2.f7727i;
        n9 = a2.f7726h;
        com.google.common.util.concurrent.P.u0(objC);
        int iIntValue = ((java.lang.Number) objC).intValue();
        boolean z9 = y instanceof O1.C0739c;
        int i10 = z9 ? y.f7808a : -1;
        if (z9 && iIntValue == i10) {
            return y;
        }
        if (z6) {
            O1.X xG2 = n9.g();
            O1.B b9 = new O1.B(n9, null);
            a2.f7726h = n9;
            a2.f7727i = null;
            a2.f7730m = 2;
            objC = xG2.b(b9, a2);
            if (objC != aVar) {
                n10 = n9;
                kVar = (p070h6.k) objC;
                y9 = (O1.Y) kVar.f22539h;
                if (((java.lang.Boolean) kVar.f22540i).booleanValue()) {
                    n10.f7781h.G(y9);
                }
                return y9;
            }
        } else {
            O1.X xG3 = n9.g();
            O1.C c9 = new O1.C(n9, i10, null);
            a2.f7726h = n9;
            a2.f7727i = null;
            a2.f7730m = 3;
            objC = xG3.c(c9, a2);
            if (objC != aVar) {
                n10 = n9;
                kVar = (p070h6.k) objC;
                y9 = (O1.Y) kVar.f22539h;
                if (((java.lang.Boolean) kVar.f22540i).booleanValue()) {
                    n10.f7781h.G(y9);
                }
                return y9;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9 A[Catch: b -> 0x00aa, TryCatch #1 {b -> 0x00aa, blocks: (B:36:0x00a5, B:70:0x0142, B:41:0x00b3, B:67:0x0125, B:49:0x00d0, B:57:0x00e9, B:58:0x00ed, B:53:0x00d9, B:64:0x0113), top: B:76:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0103  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
    
        if (r10 == r1) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object f(O1.N n3, boolean z6, p117n6.c cVar) {
        O1.D d4;
        int iHashCode;
        java.lang.Integer numA;
        java.lang.Object obj;
        O1.N n9;
        int i3;
        O1.C0738b c0738b;
        java.lang.Object objB;
        kotlin.jvm.internal.y yVar;
        kotlin.jvm.internal.A a2;
        n3.getClass();
        if (cVar instanceof O1.D) {
            d4 = (O1.D) cVar;
            int i9 = d4.f7744p;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                d4.f7744p = i9 - Integer.MIN_VALUE;
            } else {
                d4 = new O1.D(n3, cVar);
            }
        } else {
            d4 = new O1.D(n3, cVar);
        }
        java.lang.Object objA = d4.f7742n;
        p109m6.a aVar = p109m6.a.f25430h;
        try {
            switch (d4.f7744p) {
                case 0:
                    com.google.common.util.concurrent.P.u0(objA);
                    if (!z6) {
                        O1.X xG = n3.g();
                        d4.f7737h = n3;
                        d4.f7740l = z6;
                        d4.f7744p = 3;
                        objA = xG.a();
                        if (objA != aVar) {
                            int iIntValue = ((java.lang.Number) objA).intValue();
                            O1.X xG2 = n3.g();
                            O1.E e6 = new O1.E(n3, iIntValue, null);
                            d4.f7737h = n3;
                            d4.f7740l = z6;
                            d4.f7744p = 4;
                            objA = xG2.c(e6, d4);
                            break;
                        }
                    } else {
                        d4.f7737h = n3;
                        d4.f7740l = z6;
                        d4.f7744p = 1;
                        objA = n3.i(d4);
                        if (objA != aVar) {
                            iHashCode = objA != null ? objA.hashCode() : 0;
                            O1.X xG3 = n3.g();
                            d4.f7737h = n3;
                            d4.f7738i = objA;
                            d4.f7740l = z6;
                            d4.f7741m = iHashCode;
                            d4.f7744p = 2;
                            numA = xG3.a();
                            if (numA != aVar) {
                                obj = objA;
                                objA = numA;
                                n9 = n3;
                                i3 = iHashCode;
                                return new O1.C0739c(obj, i3, ((java.lang.Number) objA).intValue());
                            }
                        }
                    }
                    return aVar;
                case 1:
                    z6 = d4.f7740l;
                    n3 = (O1.N) d4.f7737h;
                    com.google.common.util.concurrent.P.u0(objA);
                    if (objA != null) {
                    }
                    O1.X xG4 = n3.g();
                    d4.f7737h = n3;
                    d4.f7738i = objA;
                    d4.f7740l = z6;
                    d4.f7741m = iHashCode;
                    d4.f7744p = 2;
                    numA = xG4.a();
                    if (numA != aVar) {
                        obj = objA;
                        objA = numA;
                        n9 = n3;
                        i3 = iHashCode;
                        return new O1.C0739c(obj, i3, ((java.lang.Number) objA).intValue());
                    }
                    return aVar;
                case 2:
                    i3 = d4.f7741m;
                    z6 = d4.f7740l;
                    obj = d4.f7738i;
                    n9 = (O1.N) d4.f7737h;
                    try {
                        com.google.common.util.concurrent.P.u0(objA);
                        return new O1.C0739c(obj, i3, ((java.lang.Number) objA).intValue());
                    } catch (O1.C0738b e9) {
                        e = e9;
                        n3 = n9;
                        kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
                        B3.o oVar = n3.f7776b;
                        d4.f7737h = n3;
                        d4.f7738i = e;
                        d4.j = a9;
                        d4.f7739k = a9;
                        d4.f7740l = z6;
                        d4.f7744p = 5;
                        throw e;
                    }
                case 3:
                    z6 = d4.f7740l;
                    n3 = (O1.N) d4.f7737h;
                    com.google.common.util.concurrent.P.u0(objA);
                    int iIntValue2 = ((java.lang.Number) objA).intValue();
                    O1.X xG5 = n3.g();
                    O1.E e10 = new O1.E(n3, iIntValue2, null);
                    d4.f7737h = n3;
                    d4.f7740l = z6;
                    d4.f7744p = 4;
                    objA = xG5.c(e10, d4);
                    break;
                case 4:
                    boolean z9 = d4.f7740l;
                    com.google.common.util.concurrent.P.u0(objA);
                    return (O1.C0739c) objA;
                case 5:
                    boolean z10 = d4.f7740l;
                    kotlin.jvm.internal.A a10 = d4.f7739k;
                    kotlin.jvm.internal.A a11 = (kotlin.jvm.internal.A) d4.j;
                    O1.C0738b c0738b2 = (O1.C0738b) d4.f7738i;
                    O1.N n10 = (O1.N) d4.f7737h;
                    com.google.common.util.concurrent.P.u0(objA);
                    a10.f24539h = objA;
                    kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                    try {
                        O1.F f9 = new O1.F(a11, n10, yVar2, null);
                        d4.f7737h = c0738b2;
                        d4.f7738i = a11;
                        d4.j = yVar2;
                        d4.f7739k = null;
                        d4.f7744p = 6;
                        if (z10) {
                            n10.getClass();
                            objB = f9.invoke(d4);
                        } else {
                            objB = n10.g().b(new O1.C0757v(f9, null), d4);
                        }
                        if (objB != aVar) {
                            yVar = yVar2;
                            a2 = a11;
                            java.lang.Object obj2 = a2.f24539h;
                            return new O1.C0739c(obj2, obj2 != null ? obj2.hashCode() : 0, yVar.f24555h);
                        }
                        return aVar;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        c0738b = c0738b2;
                        com.google.common.util.concurrent.AbstractC1903s.j(c0738b, th);
                        throw c0738b;
                    }
                case 6:
                    yVar = (kotlin.jvm.internal.y) d4.j;
                    a2 = (kotlin.jvm.internal.A) d4.f7738i;
                    c0738b = (O1.C0738b) d4.f7737h;
                    try {
                        com.google.common.util.concurrent.P.u0(objA);
                        java.lang.Object obj3 = a2.f24539h;
                        return new O1.C0739c(obj3, obj3 != null ? obj3.hashCode() : 0, yVar.f24555h);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        com.google.common.util.concurrent.AbstractC1903s.j(c0738b, th);
                        throw c0738b;
                    }
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (O1.C0738b e11) {
            e = e11;
        }
    }

    @Override // O1.InterfaceC0744h
    public final java.lang.Object a(p194x6.m mVar, p100l6.c cVar) {
        O1.b0 b0Var = (O1.b0) cVar.getContext().get(O1.a0.f7810h);
        if (b0Var != null) {
            b0Var.a(this);
        }
        return S7.C.K(new O1.b0(b0Var, this), new O1.J(this, mVar, null), cVar);
    }

    public final O1.X g() {
        return (O1.X) this.f7783k.getValue();
    }

    @Override // O1.InterfaceC0744h
    public final V7.InterfaceC0981g getData() {
        return this.f7778d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.T(r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object h(p117n6.c cVar) throws java.lang.Throwable {
        O1.C0761z c0761z;
        O1.N n3;
        int iIntValue;
        int i3;
        java.lang.Throwable th;
        O1.N n9;
        if (cVar instanceof O1.C0761z) {
            c0761z = (O1.C0761z) cVar;
            int i9 = c0761z.f7884l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0761z.f7884l = i9 - Integer.MIN_VALUE;
            } else {
                c0761z = new O1.C0761z(this, cVar);
            }
        } else {
            c0761z = new O1.C0761z(this, cVar);
        }
        java.lang.Object objA = c0761z.j;
        java.lang.Object obj = p109m6.a.f25430h;
        int i10 = c0761z.f7884l;
        try {
            if (i10 == 0) {
                com.google.common.util.concurrent.P.u0(objA);
                O1.X xG = g();
                c0761z.f7881h = this;
                c0761z.f7884l = 1;
                objA = xG.a();
                if (objA != obj) {
                    n3 = this;
                }
                return obj;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i3 = c0761z.f7882i;
                n9 = c0761z.f7881h;
                try {
                    com.google.common.util.concurrent.P.u0(objA);
                    return p070h6.A.f22523a;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    n9.f7781h.G(new O1.Q(th, i3));
                    throw th;
                }
            }
            n3 = c0761z.f7881h;
            com.google.common.util.concurrent.P.u0(objA);
            A7.m mVar = n3.f7782i;
            c0761z.f7881h = n3;
            c0761z.f7882i = iIntValue;
            c0761z.f7884l = 2;
        } catch (java.lang.Throwable th3) {
            i3 = iIntValue;
            th = th3;
            n9 = n3;
            n9.f7781h.G(new O1.Q(th, i3));
            throw th;
        }
        iIntValue = ((java.lang.Number) objA).intValue();
    }

    public final java.lang.Object i(p117n6.c cVar) {
        return ((Q1.i) this.j.getValue()).a(new O1.C0753q(3, (p100l6.c) null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(java.lang.Object obj, boolean z6, p117n6.c cVar) {
        O1.L l2;
        kotlin.jvm.internal.y yVar;
        if (cVar instanceof O1.L) {
            l2 = (O1.L) cVar;
            int i3 = l2.f7768k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l2.f7768k = i3 - Integer.MIN_VALUE;
            } else {
                l2 = new O1.L(this, cVar);
            }
        } else {
            l2 = new O1.L(this, cVar);
        }
        java.lang.Object obj2 = l2.f7767i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = l2.f7768k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj2);
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            Q1.i iVar = (Q1.i) this.j.getValue();
            O1.M m8 = new O1.M(yVar2, this, obj, z6, null);
            l2.f7766h = yVar2;
            l2.f7768k = 1;
            if (iVar.b(m8, l2) == aVar) {
                return aVar;
            }
            yVar = yVar2;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = l2.f7766h;
            com.google.common.util.concurrent.P.u0(obj2);
        }
        return new java.lang.Integer(yVar.f24555h);
    }
}
