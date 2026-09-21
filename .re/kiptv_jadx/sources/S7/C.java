package S7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final N6.A f9527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final N6.A f9528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final N6.A f9529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N6.A f9530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N6.A f9531f;
    public static final N6.A g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final N6.A f9532h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N6.A f9526a = new N6.A("RESUME_TOKEN", 2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S7.Q f9533i = new S7.Q(false);
    public static final S7.Q j = new S7.Q(true);

    static {
        int i3 = 2;
        f9527b = new N6.A("REMOVED_TASK", i3);
        f9528c = new N6.A("CLOSED_EMPTY", i3);
        int i9 = 2;
        f9529d = new N6.A("COMPLETING_ALREADY", i9);
        f9530e = new N6.A("COMPLETING_WAITING_CHILDREN", i9);
        f9531f = new N6.A("COMPLETING_RETRY", i9);
        g = new N6.A("TOO_LATE_TO_CANCEL", i9);
        f9532h = new N6.A("SEALED", i9);
    }

    public static /* synthetic */ S7.w0 A(S7.A a2, p100l6.h hVar, p194x6.m mVar, int i3) {
        S7.B b9 = S7.B.f9523k;
        if ((i3 & 1) != 0) {
            hVar = p100l6.i.f24820h;
        }
        if ((i3 & 2) != 0) {
            b9 = S7.B.f9521h;
        }
        return z(a2, hVar, b9, mVar);
    }

    public static final p100l6.h B(S7.A a2, p100l6.h hVar) {
        p100l6.h hVarQ = q(a2.getCoroutineContext(), hVar, true);
        Z7.e eVar = S7.M.f9549a;
        return (hVarQ == eVar || hVarQ.get(p100l6.d.f24819h) != null) ? hVarQ : hVarQ.plus(eVar);
    }

    public static final java.lang.Object C(java.lang.Object obj) {
        return obj instanceof S7.C0903t ? com.google.common.util.concurrent.P.T(((S7.C0903t) obj).f9620a) : obj;
    }

    public static final void D(S7.C0895k c0895k, p100l6.c cVar, boolean z6) {
        java.lang.Object obj = S7.C0895k.f9589n.get(c0895k);
        java.lang.Throwable thD = c0895k.d(obj);
        java.lang.Object objT = thD != null ? com.google.common.util.concurrent.P.T(thD) : c0895k.e(obj);
        if (!z6) {
            cVar.resumeWith(objT);
            return;
        }
        kotlin.jvm.internal.m.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        X7.f fVar = (X7.f) cVar;
        p117n6.c cVar2 = fVar.f10911l;
        p100l6.h context = cVar2.getContext();
        java.lang.Object objN = X7.a.n(context, fVar.f10913n);
        S7.F0 f0J = objN != X7.a.f10901d ? J(cVar2, context, objN) : null;
        try {
            cVar2.resumeWith(objT);
        } finally {
            if (f0J == null || f0J.d0()) {
                X7.a.g(context, objN);
            }
        }
    }

    public static final java.lang.Object E(p100l6.h hVar, p194x6.m mVar) throws java.lang.Throwable {
        S7.X xA;
        p100l6.h hVarQ;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        p100l6.g gVar = p100l6.d.f24819h;
        p100l6.e eVar = (p100l6.e) hVar.get(gVar);
        p100l6.i iVar = p100l6.i.f24820h;
        if (eVar == null) {
            xA = S7.z0.a();
            hVarQ = q(iVar, hVar.plus(xA), true);
            Z7.e eVar2 = S7.M.f9549a;
            if (hVarQ != eVar2 && hVarQ.get(gVar) == null) {
                hVarQ = hVarQ.plus(eVar2);
            }
        } else {
            if (eVar instanceof S7.X) {
            }
            xA = (S7.X) S7.z0.f9629a.get();
            hVarQ = q(iVar, hVar, true);
            Z7.e eVar3 = S7.M.f9549a;
            if (hVarQ != eVar3 && hVarQ.get(gVar) == null) {
                hVarQ = hVarQ.plus(eVar3);
            }
        }
        S7.C0886f c0886f = new S7.C0886f(hVarQ, threadCurrentThread, xA);
        c0886f.b0(S7.B.f9521h, c0886f, mVar);
        S7.X x9 = c0886f.f9580l;
        if (x9 != null) {
            int i3 = S7.X.f9562l;
            x9.c0(false);
        }
        while (!java.lang.Thread.interrupted()) {
            try {
                long jD0 = x9 != null ? x9.d0() : Long.MAX_VALUE;
                if (c0886f.P()) {
                    if (x9 != null) {
                        int i9 = S7.X.f9562l;
                        x9.Z(false);
                    }
                    java.lang.Object objI = I(S7.p0.f9610h.get(c0886f));
                    S7.C0903t c0903t = objI instanceof S7.C0903t ? (S7.C0903t) objI : null;
                    if (c0903t == null) {
                        return objI;
                    }
                    throw c0903t.f9620a;
                }
                java.util.concurrent.locks.LockSupport.parkNanos(c0886f, jD0);
            } catch (java.lang.Throwable th) {
                if (x9 != null) {
                    int i10 = S7.X.f9562l;
                    x9.Z(false);
                }
                throw th;
            }
        }
        java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
        c0886f.l(interruptedException);
        throw interruptedException;
    }

    public static final java.lang.Object G(S7.C0 c9, p194x6.m mVar) throws java.lang.Throwable {
        java.lang.Object c0903t;
        java.lang.Object objK;
        w(c9, true, new S7.P(0, r(c9.f10932k.getContext()).T(c9.f9534l, c9, c9.j)));
        try {
            if (mVar == null) {
                c0903t = com.google.common.util.concurrent.P.w0(mVar, c9, c9);
            } else {
                kotlin.jvm.internal.E.c(2, mVar);
                c0903t = mVar.invoke(c9, c9);
            }
        } catch (java.lang.Throwable th) {
            c0903t = new S7.C0903t(th, false);
        }
        p109m6.a aVar = p109m6.a.f25430h;
        if (c0903t == aVar || (objK = c9.K(c0903t)) == f9530e) {
            return aVar;
        }
        if (objK instanceof S7.C0903t) {
            java.lang.Throwable th2 = ((S7.C0903t) objK).f9620a;
            if (!(th2 instanceof S7.B0) || ((S7.B0) th2).f9525h != c9) {
                throw th2;
            }
            if (c0903t instanceof S7.C0903t) {
                throw ((S7.C0903t) c0903t).f9620a;
            }
        } else {
            c0903t = I(objK);
        }
        return c0903t;
    }

    public static final java.lang.String H(p100l6.c cVar) {
        java.lang.Object objT;
        if (cVar instanceof X7.f) {
            return ((X7.f) cVar).toString();
        }
        try {
            objT = cVar + '@' + s(cVar);
        } catch (java.lang.Throwable th) {
            objT = com.google.common.util.concurrent.P.T(th);
        }
        if (p070h6.n.a(objT) != null) {
            objT = cVar.getClass().getName() + '@' + s(cVar);
        }
        return (java.lang.String) objT;
    }

    public static final java.lang.Object I(java.lang.Object obj) {
        S7.InterfaceC0881c0 interfaceC0881c0;
        S7.C0883d0 c0883d0 = obj instanceof S7.C0883d0 ? (S7.C0883d0) obj : null;
        return (c0883d0 == null || (interfaceC0881c0 = c0883d0.f9574a) == null) ? obj : interfaceC0881c0;
    }

    public static final S7.F0 J(p100l6.c cVar, p100l6.h hVar, java.lang.Object obj) {
        S7.F0 f9 = null;
        if ((cVar instanceof p117n6.d) && hVar.get(S7.G0.f9542h) != null) {
            p117n6.d callerFrame = (p117n6.d) cVar;
            while (!(callerFrame instanceof S7.K) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof S7.F0) {
                    f9 = (S7.F0) callerFrame;
                    break;
                }
            }
            if (f9 != null) {
                f9.f0(hVar, obj);
            }
        }
        return f9;
    }

    public static final java.lang.Object K(p100l6.h hVar, p194x6.m mVar, p100l6.c cVar) throws java.lang.Throwable {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        java.lang.Object objI;
        p100l6.h context = cVar.getContext();
        p100l6.h hVarPlus = !((java.lang.Boolean) hVar.fold(java.lang.Boolean.FALSE, new B.C0063a(23))).booleanValue() ? context.plus(hVar) : q(context, hVar, false);
        p(hVarPlus);
        if (hVarPlus == context) {
            X7.p pVar = new X7.p(cVar, hVarPlus);
            objI = P3.e.l0(pVar, pVar, mVar);
        } else {
            p100l6.d dVar = p100l6.d.f24819h;
            if (kotlin.jvm.internal.m.a(hVarPlus.get(dVar), context.get(dVar))) {
                S7.F0 f9 = new S7.F0(cVar, hVarPlus);
                p100l6.h hVar2 = f9.j;
                java.lang.Object objN = X7.a.n(hVar2, null);
                try {
                    java.lang.Object objL0 = P3.e.l0(f9, f9, mVar);
                    X7.a.g(hVar2, objN);
                    objI = objL0;
                } catch (java.lang.Throwable th) {
                    X7.a.g(hVar2, objN);
                    throw th;
                }
            } else {
                S7.K k9 = new S7.K(cVar, hVarPlus);
                try {
                    X7.a.h(p070h6.A.f22523a, com.google.common.util.concurrent.P.h0(com.google.common.util.concurrent.P.S(k9, k9, mVar)));
                    do {
                        atomicIntegerFieldUpdater = S7.K.f9548l;
                        int i3 = atomicIntegerFieldUpdater.get(k9);
                        if (i3 != 0) {
                            if (i3 != 2) {
                                throw new java.lang.IllegalStateException("Already suspended");
                            }
                            objI = I(S7.p0.f9610h.get(k9));
                            if (objI instanceof S7.C0903t) {
                                throw ((S7.C0903t) objI).f9620a;
                            }
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(k9, 0, 1));
                    objI = p109m6.a.f25430h;
                } catch (java.lang.Throwable th2) {
                    O2.g.G(th2, k9);
                    throw null;
                }
            }
        }
        p109m6.a aVar = p109m6.a.f25430h;
        return objI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object L(long j9, p194x6.m mVar, p117n6.c cVar) throws java.lang.Throwable {
        S7.D0 d4;
        kotlin.jvm.internal.A a2;
        if (cVar instanceof S7.D0) {
            d4 = (S7.D0) cVar;
            int i3 = d4.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d4.j = i3 - Integer.MIN_VALUE;
            } else {
                d4 = new S7.D0(cVar);
            }
        } else {
            d4 = new S7.D0(cVar);
        }
        java.lang.Object obj = d4.f9538i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = d4.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (j9 <= 0) {
                return null;
            }
            kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
            try {
                d4.f9537h = a9;
                d4.j = 1;
                S7.C0 c9 = new S7.C0(j9, d4);
                a9.f24539h = c9;
                java.lang.Object objG = G(c9, mVar);
                return objG == aVar ? aVar : objG;
            } catch (S7.B0 e6) {
                e = e6;
                a2 = a9;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = d4.f9537h;
            try {
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            } catch (S7.B0 e9) {
                e = e9;
            }
        }
        if (e.f9525h == a2.f24539h) {
            return null;
        }
        throw e;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
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
    public static final java.lang.Object M(p100l6.c cVar) {
        java.lang.Object obj;
        p100l6.h context = cVar.getContext();
        p(context);
        p100l6.c cVarH0 = com.google.common.util.concurrent.P.h0(cVar);
        X7.f fVar = cVarH0 instanceof X7.f ? (X7.f) cVarH0 : null;
        p070h6.A a2 = p070h6.A.f22523a;
        if (fVar == null) {
            obj = a2;
        } else {
            S7.AbstractC0906w abstractC0906w = fVar.f10910k;
            if (X7.a.j(abstractC0906w, context)) {
                fVar.f10912m = a2;
                fVar.j = 1;
                abstractC0906w.W(context, fVar);
            } else {
                S7.I0 i3 = new S7.I0(S7.I0.f9545i);
                p100l6.h hVarPlus = context.plus(i3);
                fVar.f10912m = a2;
                fVar.j = 1;
                abstractC0906w.W(hVarPlus, fVar);
                if (i3.f9546h) {
                    S7.X xA = S7.z0.a();
                    p078i6.l lVar = xA.f9564k;
                    if (lVar != null ? lVar.isEmpty() : true) {
                        obj = a2;
                    } else {
                        if (xA.f9563i >= 4294967296L) {
                            fVar.f10912m = a2;
                            fVar.j = 1;
                            xA.a0(fVar);
                            obj = p109m6.a.f25430h;
                        } else {
                            xA.c0(true);
                            try {
                                fVar.run();
                                do {
                                } while (xA.e0());
                            } catch (java.lang.Throwable th) {
                                try {
                                    fVar.f(th);
                                } catch (java.lang.Throwable th2) {
                                    xA.Z(true);
                                    throw th2;
                                }
                            }
                            xA.Z(true);
                            obj = a2;
                        }
                    }
                }
            }
            obj = p109m6.a.f25430h;
        }
        return obj == p109m6.a.f25430h ? obj : a2;
    }

    public static final java.util.concurrent.CancellationException a(java.lang.String str, java.lang.Throwable th) {
        java.util.concurrent.CancellationException cancellationException = new java.util.concurrent.CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static S7.C0901q b() {
        S7.C0901q c0901q = new S7.C0901q(true);
        c0901q.G(null);
        return c0901q;
    }

    public static final X7.c c(p100l6.h hVar) {
        if (hVar.get(S7.C0889g0.f9584h) == null) {
            hVar = hVar.plus(d());
        }
        return new X7.c(hVar);
    }

    public static S7.j0 d() {
        return new S7.j0(null);
    }

    public static S7.y0 e() {
        return new S7.y0(null);
    }

    public static S7.G f(S7.A a2, p100l6.h hVar, p194x6.m mVar, int i3) {
        if ((i3 & 1) != 0) {
            hVar = p100l6.i.f24820h;
        }
        S7.B b9 = S7.B.f9521h;
        p100l6.h hVarB = B(a2, hVar);
        S7.B b10 = S7.B.f9521h;
        S7.G g9 = new S7.G(hVarB, true, true);
        g9.b0(b9, g9, mVar);
        return g9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object g(java.util.List list, p117n6.i iVar) {
        if (list.isEmpty()) {
            return p078i6.w.f23205h;
        }
        S7.F[] fArr = (S7.F[]) list.toArray(new S7.F[0]);
        S7.C0884e c0884e = new S7.C0884e(fArr);
        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(iVar));
        c0895k.r();
        int length = fArr.length;
        S7.C0880c[] c0880cArr = new S7.C0880c[length];
        for (int i3 = 0; i3 < length; i3++) {
            S7.InterfaceC0900p interfaceC0900p = fArr[i3];
            ((S7.p0) interfaceC0900p).start();
            S7.C0880c c0880c = new S7.C0880c(c0884e, c0895k);
            c0880c.f9571m = w(interfaceC0900p, true, c0880c);
            c0880cArr[i3] = c0880c;
        }
        S7.C0882d c0882d = new S7.C0882d(c0880cArr);
        for (int i9 = 0; i9 < length; i9++) {
            S7.C0880c c0880c2 = c0880cArr[i9];
            c0880c2.getClass();
            S7.C0880c.f9569o.set(c0880c2, c0882d);
        }
        if (S7.C0895k.f9589n.get(c0895k) instanceof S7.u0) {
            c0895k.u(c0882d);
        } else {
            c0882d.a();
        }
        java.lang.Object objQ = c0895k.q();
        p109m6.a aVar = p109m6.a.f25430h;
        return objQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void h(p117n6.c cVar) {
        S7.I i3;
        if (cVar instanceof S7.I) {
            i3 = (S7.I) cVar;
            int i9 = i3.f9544i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                i3.f9544i = i9 - Integer.MIN_VALUE;
            } else {
                i3 = new S7.I(cVar);
            }
        } else {
            i3 = new S7.I(cVar);
        }
        java.lang.Object obj = i3.f9543h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = i3.f9544i;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            i3.f9544i = 1;
            S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(i3));
            c0895k.r();
            if (c0895k.q() == aVar) {
                return;
            }
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        throw new I3.b();
    }

    public static final void i(S7.A a2, java.util.concurrent.CancellationException cancellationException) {
        S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) a2.getCoroutineContext().get(S7.C0889g0.f9584h);
        if (interfaceC0891h0 != null) {
            interfaceC0891h0.e(cancellationException);
        } else {
            throw new java.lang.IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + a2).toString());
        }
    }

    public static final void j(S7.InterfaceC0891h0 interfaceC0891h0, java.lang.String str, java.lang.Throwable th) {
        interfaceC0891h0.e(a(str, th));
    }

    public static final void k(p100l6.h hVar, java.util.concurrent.CancellationException cancellationException) {
        S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) hVar.get(S7.C0889g0.f9584h);
        if (interfaceC0891h0 != null) {
            interfaceC0891h0.e(cancellationException);
        }
    }

    public static void l(p100l6.h hVar) {
        S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) hVar.get(S7.C0889g0.f9584h);
        if (interfaceC0891h0 != null) {
            java.util.Iterator it = interfaceC0891h0.b().iterator();
            while (it.hasNext()) {
                ((S7.InterfaceC0891h0) it.next()).e(null);
            }
        }
    }

    public static final java.lang.Object m(p194x6.m mVar, p100l6.c cVar) {
        X7.p pVar = new X7.p(cVar, cVar.getContext());
        java.lang.Object objL0 = P3.e.l0(pVar, pVar, mVar);
        p109m6.a aVar = p109m6.a.f25430h;
        return objL0;
    }

    public static final java.lang.Object n(long j9, p100l6.c cVar) {
        p070h6.A a2 = p070h6.A.f22523a;
        if (j9 > 0) {
            S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
            c0895k.r();
            if (j9 < Long.MAX_VALUE) {
                r(c0895k.f9592l).G(j9, c0895k);
            }
            java.lang.Object objQ = c0895k.q();
            if (objQ == p109m6.a.f25430h) {
                return objQ;
            }
        }
        return a2;
    }

    public static final java.lang.Object o(long j9, p100l6.c cVar) {
        P7.a aVar = P7.b.f8168i;
        long jD = 0;
        boolean z6 = j9 > 0;
        if (z6) {
            jD = P7.b.d(P7.b.g(j9, E8.l.O(999999L, P7.d.NANOSECONDS)));
        } else if (z6) {
            throw new I3.b();
        }
        java.lang.Object objN = n(jD, cVar);
        return objN == p109m6.a.f25430h ? objN : p070h6.A.f22523a;
    }

    public static final void p(p100l6.h hVar) {
        S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) hVar.get(S7.C0889g0.f9584h);
        if (interfaceC0891h0 != null && !interfaceC0891h0.isActive()) {
            throw interfaceC0891h0.t();
        }
    }

    public static final p100l6.h q(p100l6.h hVar, p100l6.h hVar2, boolean z6) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        boolean zBooleanValue = ((java.lang.Boolean) hVar.fold(bool, new B.C0063a(23))).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) hVar2.fold(bool, new B.C0063a(23))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.plus(hVar2);
        }
        p100l6.i iVar = p100l6.i.f24820h;
        p100l6.h hVar3 = (p100l6.h) hVar.fold(iVar, new B.C0063a(24));
        java.lang.Object objFold = hVar2;
        if (zBooleanValue2) {
            objFold = hVar2.fold(iVar, new B.C0063a(25));
        }
        return hVar3.plus((p100l6.h) objFold);
    }

    public static final S7.H r(p100l6.h hVar) {
        p100l6.f fVar = hVar.get(p100l6.d.f24819h);
        S7.H h9 = fVar instanceof S7.H ? (S7.H) fVar : null;
        return h9 == null ? S7.E.f9539a : h9;
    }

    public static final java.lang.String s(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final S7.InterfaceC0891h0 t(p100l6.h hVar) {
        S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) hVar.get(S7.C0889g0.f9584h);
        if (interfaceC0891h0 != null) {
            return interfaceC0891h0;
        }
        throw new java.lang.IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final S7.C0895k u(p100l6.c cVar) {
        S7.C0895k c0895k;
        S7.C0895k c0895k2;
        if (!(cVar instanceof X7.f)) {
            return new S7.C0895k(1, cVar);
        }
        X7.f fVar = (X7.f) cVar;
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.f.f10909o;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(fVar);
            N6.A a2 = X7.a.f10900c;
            c0895k = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, a2);
                c0895k2 = null;
                break;
            }
            if (obj instanceof S7.C0895k) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, a2)) {
                        c0895k2 = (S7.C0895k) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == obj);
            } else if (obj != a2 && !(obj instanceof java.lang.Throwable)) {
                throw new java.lang.IllegalStateException(p121o0.p.n(obj, "Inconsistent state "));
            }
        }
        if (c0895k2 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = S7.C0895k.f9589n;
            java.lang.Object obj2 = atomicReferenceFieldUpdater2.get(c0895k2);
            if (!(obj2 instanceof S7.C0902s) || ((S7.C0902s) obj2).f9616d == null) {
                S7.C0895k.f9588m.set(c0895k2, 536870911);
                atomicReferenceFieldUpdater2.set(c0895k2, S7.C0878b.f9567h);
                c0895k = c0895k2;
            } else {
                c0895k2.l();
            }
            if (c0895k != null) {
                return c0895k;
            }
        }
        return new S7.C0895k(2, cVar);
    }

    public static final void v(p100l6.h hVar, java.lang.Throwable th) {
        if (th instanceof S7.J) {
            th = ((S7.J) th).f9547h;
        }
        try {
            S7.InterfaceC0908y interfaceC0908y = (S7.InterfaceC0908y) hVar.get(S7.C0907x.f9625h);
            if (interfaceC0908y != null) {
                interfaceC0908y.handleException(hVar, th);
            } else {
                X7.a.d(hVar, th);
            }
        } catch (java.lang.Throwable th2) {
            if (th != th2) {
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
                com.google.common.util.concurrent.AbstractC1903s.j(runtimeException, th);
                th = runtimeException;
            }
            X7.a.d(hVar, th);
        }
    }

    public static final S7.O w(S7.InterfaceC0891h0 interfaceC0891h0, boolean z6, S7.k0 k0Var) {
        if (interfaceC0891h0 instanceof S7.p0) {
            return ((S7.p0) interfaceC0891h0).H(z6, k0Var);
        }
        return interfaceC0891h0.N(k0Var.i(), z6, new A7.o(1, k0Var, S7.k0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 27));
    }

    public static final boolean x(S7.A a2) {
        S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) a2.getCoroutineContext().get(S7.C0889g0.f9584h);
        if (interfaceC0891h0 != null) {
            return interfaceC0891h0.isActive();
        }
        return true;
    }

    public static final boolean y(p100l6.h hVar) {
        S7.InterfaceC0891h0 interfaceC0891h0 = (S7.InterfaceC0891h0) hVar.get(S7.C0889g0.f9584h);
        if (interfaceC0891h0 != null) {
            return interfaceC0891h0.isActive();
        }
        return true;
    }

    public static final S7.w0 z(S7.A a2, p100l6.h hVar, S7.B b9, p194x6.m mVar) {
        p100l6.h hVarB = B(a2, hVar);
        b9.getClass();
        S7.w0 q0Var = b9 == S7.B.f9522i ? new S7.q0(hVarB, mVar) : new S7.w0(hVarB, true, true);
        q0Var.b0(b9, q0Var, mVar);
        return q0Var;
    }
}
