package O0;

/* JADX INFO: loaded from: classes.dex */
public final class N implements p020c0.InterfaceC1682h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q0.F f7595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p020c0.AbstractC1709v f7596i;
    public O0.t0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p136q.H f7599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p136q.H f7600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final O0.G f7601o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final O0.D f7602p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p136q.H f7603q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final O0.s0 f7604r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p136q.H f7605s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p038e0.e f7606t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7607u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7608v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final java.lang.String f7609w;

    public N(Q0.F f9, O0.t0 t0Var) {
        this.f7595h = f9;
        this.j = t0Var;
        long[] jArr = p136q.P.f26351a;
        this.f7599m = new p136q.H();
        this.f7600n = new p136q.H();
        this.f7601o = new O0.G(this);
        this.f7602p = new O0.D(this);
        this.f7603q = new p136q.H();
        this.f7604r = new O0.s0();
        this.f7605s = new p136q.H();
        this.f7606t = new p038e0.e(new java.lang.Object[16]);
        this.f7609w = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static final void a(O0.N n3, java.lang.Object obj) {
        n3.h();
        Q0.F f9 = (Q0.F) n3.f7603q.k(obj);
        Q0.F f10 = n3.f7595h;
        if (f9 != null) {
            if (n3.f7608v <= 0) {
                N0.a.b("No pre-composed items to dispose");
            }
            int iK = ((p038e0.e) ((p038e0.b) f10.p()).f21318i).k(f9);
            if (iK < ((p038e0.e) ((p038e0.b) f10.p()).f21318i).j - n3.f7608v) {
                N0.a.b("Item is not in pre-composed item range");
            }
            n3.f7607u++;
            n3.f7608v--;
            O0.E e6 = (O0.E) n3.f7599m.g(f9);
            if (e6 != null) {
                e(e6);
            }
            int i3 = (((p038e0.e) ((p038e0.b) f10.p()).f21318i).j - n3.f7608v) - n3.f7607u;
            n3.j(iK, i3);
            n3.g(i3);
        }
        if (n3.f7606t.j(obj)) {
            Q0.F.a0(f10, true, 6);
        }
    }

    public static void e(O0.E e6) {
        p136q.I i3;
        p020c0.C1685i0 c1685i0 = e6.f7569f;
        if (c1685i0 != null) {
            c1685i0.f18263h.set(p020c0.EnumC1687j0.f18271i);
            p089k0.k kVar = c1685i0.f18265k;
            if (kVar.f24426d.h()) {
                i3 = kVar.f24426d;
                p136q.I i9 = p136q.Q.f26352a;
                kVar.f24426d = new p136q.I();
                kVar.f24425c.i();
            } else {
                i3 = null;
            }
            kVar.b();
            p020c0.C1715y c1715y = c1685i0.f18257a;
            c1715y.f18413x = null;
            if (i3 != null) {
                c1715y.f18395B.f24431k = i3;
                c1715y.f18397D = 2;
            }
            e6.f7569f = null;
            p020c0.C1715y c1715y2 = e6.f7566c;
            if (c1715y2 != null) {
                c1715y2.m();
            }
            e6.f7566c = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004f A[LOOP:0: B:5:0x0014->B:17:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[EDGE_INSN: B:21:0x0052->B:18:0x0052 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x004f], SYNTHETIC] */
    @Override // p020c0.InterfaceC1682h
    public final void b() {
        p020c0.C1715y c1715y;
        Q0.F f9 = this.f7595h;
        f9.y = true;
        p136q.H h9 = this.f7599m;
        java.lang.Object[] objArr = h9.f26324c;
        long[] jArr = h9.f26322a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128 && (c1715y = ((O0.E) objArr[(i3 << 3) + i10]).f7566c) != null) {
                            c1715y.m();
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        f9.U();
        f9.y = false;
        h9.a();
        this.f7600n.a();
        this.f7608v = 0;
        this.f7607u = 0;
        this.f7603q.a();
        h();
    }

    public final void c(O0.E e6, boolean z6) {
        p020c0.C1685i0 c1685i0 = e6.f7569f;
        if (c1685i0 != null) {
            p121o0.f fVarE = p121o0.o.e();
            p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
            p121o0.f fVarH = p121o0.o.h(fVarE);
            try {
                Q0.F f9 = this.f7595h;
                f9.y = true;
                if (z6) {
                    while (!c1685i0.c()) {
                        try {
                            c1685i0.e(new D1.C0223h(2));
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
                c1685i0.a();
                e6.f7569f = null;
                f9.y = false;
                p121o0.o.k(fVarE, fVarH, jVarE);
            } catch (java.lang.Throwable th2) {
                p121o0.o.k(fVarE, fVarH, jVarE);
                throw th2;
            }
        }
    }

    @Override // p020c0.InterfaceC1682h
    public final void d() {
        i(true);
    }

    public final O0.o0 f(java.lang.Object obj) {
        return !this.f7595h.K() ? new O0.J() : new O0.K(this, obj);
    }

    public final void g(int i3) {
        boolean z6;
        boolean z9 = false;
        this.f7607u = 0;
        java.util.List listP = this.f7595h.p();
        p038e0.b bVar = (p038e0.b) listP;
        int i9 = (((p038e0.e) bVar.f21318i).j - this.f7608v) - 1;
        if (i3 <= i9) {
            this.f7604r.clear();
            if (i3 <= i9) {
                int i10 = i3;
                while (true) {
                    java.lang.Object objG = this.f7599m.g((Q0.F) bVar.get(i10));
                    kotlin.jvm.internal.m.b(objG);
                    ((p136q.E) this.f7604r.f7689i).a(((O0.E) objG).f7564a);
                    if (i10 == i9) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.j.d(this.f7604r);
            p121o0.f fVarE = p121o0.o.e();
            p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
            p121o0.f fVarH = p121o0.o.h(fVarE);
            z6 = false;
            while (i9 >= i3) {
                try {
                    Q0.F f9 = (Q0.F) ((p038e0.b) listP).get(i9);
                    java.lang.Object objG2 = this.f7599m.g(f9);
                    kotlin.jvm.internal.m.b(objG2);
                    O0.E e6 = (O0.E) objG2;
                    java.lang.Object obj = e6.f7564a;
                    if (((p136q.E) this.f7604r.f7689i).c(obj)) {
                        this.f7607u++;
                        if (((java.lang.Boolean) e6.g.getValue()).booleanValue()) {
                            Q0.J j = f9.f8233O;
                            Q0.W w6 = j.f8282p;
                            Q0.D d4 = Q0.D.j;
                            w6.f8372s = d4;
                            Q0.S s9 = j.f8283q;
                            if (s9 != null) {
                                s9.f8327q = d4;
                            }
                            l(e6, false);
                            if (e6.f7570h) {
                                z6 = true;
                            }
                        }
                    } else {
                        Q0.F f10 = this.f7595h;
                        f10.y = true;
                        this.f7599m.k(f9);
                        p020c0.C1715y c1715y = e6.f7566c;
                        if (c1715y != null) {
                            c1715y.m();
                        }
                        this.f7595h.V(i9, 1);
                        f10.y = false;
                    }
                    this.f7600n.k(obj);
                    i9--;
                } catch (java.lang.Throwable th) {
                    p121o0.o.k(fVarE, fVarH, jVarE);
                    throw th;
                }
            }
            p121o0.o.k(fVarE, fVarH, jVarE);
        } else {
            z6 = false;
        }
        if (z6) {
            synchronized (p121o0.k.f25993c) {
                p136q.I i11 = p121o0.k.j.f25965h;
                if (i11 != null && i11.h()) {
                    z9 = true;
                }
            }
            if (z9) {
                p121o0.k.a();
            }
        }
        h();
    }

    public final void h() {
        int i3 = ((p038e0.e) ((p038e0.b) this.f7595h.p()).f21318i).j;
        p136q.H h9 = this.f7599m;
        if (h9.f26326e != i3) {
            N0.a.a("Inconsistency between the count of nodes tracked by the state (" + h9.f26326e + ") and the children count on the SubcomposeLayout (" + i3 + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i3 - this.f7607u) - this.f7608v < 0) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "Incorrect state. Total children ", ". Reusable children ");
            sbT.append(this.f7607u);
            sbT.append(". Precomposed children ");
            sbT.append(this.f7608v);
            N0.a.a(sbT.toString());
        }
        p136q.H h10 = this.f7603q;
        if (h10.f26326e == this.f7608v) {
            return;
        }
        N0.a.a("Incorrect state. Precomposed children " + this.f7608v + ". Map size " + h10.f26326e);
    }

    public final void i(boolean z6) {
        this.f7608v = 0;
        this.f7603q.a();
        java.util.List listP = this.f7595h.p();
        int i3 = ((p038e0.e) ((p038e0.b) listP).f21318i).j;
        if (this.f7607u != i3) {
            this.f7607u = i3;
            p121o0.f fVarE = p121o0.o.e();
            p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
            p121o0.f fVarH = p121o0.o.h(fVarE);
            for (int i9 = 0; i9 < i3; i9++) {
                try {
                    Q0.F f9 = (Q0.F) ((p038e0.b) listP).get(i9);
                    O0.E e6 = (O0.E) this.f7599m.g(f9);
                    if (e6 != null && ((java.lang.Boolean) e6.g.getValue()).booleanValue()) {
                        Q0.J j = f9.f8233O;
                        Q0.W w6 = j.f8282p;
                        Q0.D d4 = Q0.D.j;
                        w6.f8372s = d4;
                        Q0.S s9 = j.f8283q;
                        if (s9 != null) {
                            s9.f8327q = d4;
                        }
                        l(e6, z6);
                        e6.f7564a = O0.AbstractC0735y.f7712a;
                    }
                } catch (java.lang.Throwable th) {
                    p121o0.o.k(fVarE, fVarH, jVarE);
                    throw th;
                }
            }
            p121o0.o.k(fVarE, fVarH, jVarE);
            this.f7600n.a();
        }
        h();
    }

    public final void j(int i3, int i9) {
        Q0.F f9 = this.f7595h;
        f9.y = true;
        f9.O(i3, i9, 1);
        f9.y = false;
    }

    public final void k(java.lang.Object obj, p194x6.m mVar, boolean z6) {
        Q0.F f9 = this.f7595h;
        if (f9.K()) {
            h();
            if (this.f7600n.c(obj)) {
                return;
            }
            this.f7605s.k(obj);
            p136q.H h9 = this.f7603q;
            java.lang.Object objG = h9.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((p038e0.e) ((p038e0.b) f9.p()).f21318i).k(objG), ((p038e0.e) ((p038e0.b) f9.p()).f21318i).j);
                    this.f7608v++;
                } else {
                    int i3 = ((p038e0.e) ((p038e0.b) f9.p()).f21318i).j;
                    Q0.F f10 = new Q0.F(2);
                    f9.y = true;
                    f9.E(i3, f10);
                    f9.y = false;
                    this.f7608v++;
                    objG = f10;
                }
                h9.m(obj, objG);
            }
            m((Q0.F) objG, obj, z6, mVar);
        }
    }

    public final void l(O0.E e6, boolean z6) {
        p020c0.C1715y c1715y;
        if (z6 || !e6.f7570h) {
            e6.g = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
        } else {
            e6.g.setValue(java.lang.Boolean.FALSE);
        }
        if (e6.f7569f != null) {
            e(e6);
            return;
        }
        if (z6) {
            p020c0.C1715y c1715y2 = e6.f7566c;
            if (c1715y2 != null) {
                c1715y2.l();
                return;
            }
            return;
        }
        Q0.m0 outOfFrameExecutor = Q0.I.a(this.f7595h).getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            if (e6.f7570h || (c1715y = e6.f7566c) == null) {
                return;
            }
            c1715y.l();
            return;
        }
        A8.m mVar = new A8.m(4, e6);
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = (androidx.compose.ui.platform.AndroidComposeView) outOfFrameExecutor;
        p078i6.l lVar = androidComposeView.f15931o;
        boolean zIsEmpty = lVar.isEmpty();
        lVar.addLast(mVar);
        if (zIsEmpty) {
            android.os.Handler handler = androidComposeView.getHandler();
            if (handler == null) {
                throw new java.lang.IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(androidComposeView.f15933p);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x008e A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:44:0x0076, B:47:0x0082, B:56:0x00a9, B:58:0x00b9, B:61:0x00cd, B:63:0x00d1, B:69:0x0107, B:64:0x00de, B:65:0x00e9, B:67:0x00ed, B:68:0x0104, B:59:0x00bc, B:53:0x008e, B:55:0x009c, B:74:0x0113, B:75:0x011d), top: B:78:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x009c A[Catch: all -> 0x0111, TryCatch #0 {all -> 0x0111, blocks: (B:44:0x0076, B:47:0x0082, B:56:0x00a9, B:58:0x00b9, B:61:0x00cd, B:63:0x00d1, B:69:0x0107, B:64:0x00de, B:65:0x00e9, B:67:0x00ed, B:68:0x0104, B:59:0x00bc, B:53:0x008e, B:55:0x009c, B:74:0x0113, B:75:0x011d), top: B:78:0x0076 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m(Q0.F f9, java.lang.Object obj, boolean z6, p194x6.m mVar) {
        boolean z9;
        p020c0.C1715y c1715y;
        int i3 = 0;
        p136q.H h9 = this.f7599m;
        java.lang.Object objG = h9.g(f9);
        java.lang.Object obj2 = objG;
        if (objG == null) {
            p089k0.e eVar = O0.AbstractC0717f.f7633a;
            O0.E e6 = new O0.E();
            e6.f7564a = obj;
            e6.f7565b = eVar;
            e6.f7566c = null;
            e6.g = p020c0.AbstractC1703s.y(java.lang.Boolean.TRUE);
            h9.m(f9, e6);
            obj2 = e6;
        }
        O0.E e9 = (O0.E) obj2;
        boolean z10 = e9.f7565b != mVar;
        if (e9.f7569f != null) {
            if (z10) {
                e(e9);
            } else if (z6) {
                return;
            } else {
                c(e9, true);
            }
        }
        p020c0.C1715y c1715y2 = e9.f7566c;
        if (c1715y2 != null) {
            synchronized (c1715y2.f18400k) {
                z9 = c1715y2.f18410u.f26326e > 0;
            }
        } else {
            z9 = true;
        }
        if (z10 || z9 || e9.f7567d) {
            e9.f7565b = mVar;
            if (e9.f7569f != null) {
                N0.a.a("new subcompose call while paused composition is still active");
            }
            p121o0.f fVarE = p121o0.o.e();
            p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
            p121o0.f fVarH = p121o0.o.h(fVarE);
            try {
                Q0.F f10 = this.f7595h;
                f10.y = true;
                p020c0.C1715y c1715y3 = e9.f7566c;
                p020c0.AbstractC1709v abstractC1709v = this.f7596i;
                if (abstractC1709v == null) {
                    N0.a.c("parent composition reference not set");
                    throw new I3.b();
                }
                if (c1715y3 == null) {
                    if (z6) {
                        android.view.ViewGroup.LayoutParams layoutParams = R0.p1.f8959a;
                        c1715y = new p020c0.C1715y(abstractC1709v, new Q0.D0(f9));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams2 = R0.p1.f8959a;
                        c1715y = new p020c0.C1715y(abstractC1709v, new Q0.D0(f9));
                    }
                    c1715y3 = c1715y;
                } else {
                    if (c1715y3.f18397D == 3) {
                        if (z6) {
                            android.view.ViewGroup.LayoutParams layoutParams3 = R0.p1.f8959a;
                            c1715y = new p020c0.C1715y(abstractC1709v, new Q0.D0(f9));
                        } else {
                            android.view.ViewGroup.LayoutParams layoutParams4 = R0.p1.f8959a;
                            c1715y = new p020c0.C1715y(abstractC1709v, new Q0.D0(f9));
                        }
                        c1715y3 = c1715y;
                    }
                }
                e9.f7566c = c1715y3;
                p194x6.m eVar2 = e9.f7565b;
                if (Q0.I.a(this.f7595h).getOutOfFrameExecutor() != null) {
                    e9.f7570h = false;
                } else {
                    e9.f7570h = true;
                    eVar2 = new p089k0.e(1524156494, new O0.M(e9, eVar2, i3), true);
                }
                if (z6) {
                    if (e9.f7568e) {
                        c1715y3.i();
                        c1715y3.q();
                        e9.f7569f = c1715y3.k(true, eVar2);
                    } else {
                        e9.f7569f = c1715y3.k(c1715y3.i(), eVar2);
                    }
                } else if (e9.f7568e) {
                    c1715y3.i();
                    c1715y3.q();
                    p020c0.C1700q c1700q = c1715y3.f18396C;
                    c1700q.f18347z = 100;
                    c1700q.y = true;
                    c1715y3.f18398h.a(c1715y3, eVar2);
                    c1700q.v();
                } else {
                    c1715y3.B(eVar2);
                }
                e9.f7568e = false;
                f10.y = false;
                p121o0.o.k(fVarE, fVarH, jVarE);
                e9.f7567d = false;
            } catch (java.lang.Throwable th) {
                p121o0.o.k(fVarE, fVarH, jVarE);
                throw th;
            }
        }
    }

    public final Q0.F n(java.lang.Object obj) {
        p136q.H h9;
        int i3;
        if (this.f7607u == 0) {
            return null;
        }
        p038e0.b bVar = (p038e0.b) this.f7595h.p();
        int i9 = ((p038e0.e) bVar.f21318i).j - this.f7608v;
        int i10 = i9 - this.f7607u;
        int i11 = i9 - 1;
        int i12 = i11;
        while (true) {
            h9 = this.f7599m;
            if (i12 < i10) {
                i3 = -1;
                break;
            }
            java.lang.Object objG = h9.g((Q0.F) bVar.get(i12));
            kotlin.jvm.internal.m.b(objG);
            if (kotlin.jvm.internal.m.a(((O0.E) objG).f7564a, obj)) {
                i3 = i12;
                break;
            }
            i12--;
        }
        if (i3 == -1) {
            while (true) {
                if (i11 < i10) {
                    i12 = i11;
                    break;
                }
                java.lang.Object objG2 = h9.g((Q0.F) bVar.get(i11));
                kotlin.jvm.internal.m.b(objG2);
                O0.E e6 = (O0.E) objG2;
                java.lang.Object obj2 = e6.f7564a;
                if (obj2 == O0.AbstractC0735y.f7712a || this.j.b(obj, obj2)) {
                    e6.f7564a = obj;
                    i12 = i11;
                    i3 = i12;
                    break;
                }
                i11--;
            }
        }
        if (i3 == -1) {
            return null;
        }
        if (i12 != i10) {
            j(i12, i10);
        }
        this.f7607u--;
        Q0.F f9 = (Q0.F) bVar.get(i10);
        java.lang.Object objG3 = h9.g(f9);
        kotlin.jvm.internal.m.b(objG3);
        O0.E e9 = (O0.E) objG3;
        e9.g = p020c0.AbstractC1703s.y(java.lang.Boolean.TRUE);
        e9.f7568e = true;
        e9.f7567d = true;
        return f9;
    }
}
