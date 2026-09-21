package S7;

/* JADX INFO: loaded from: classes4.dex */
public class p0 implements S7.InterfaceC0891h0, S7.v0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9610h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(S7.p0.class, java.lang.Object.class, "_state$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9611i = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(S7.p0.class, java.lang.Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ java.lang.Object _parentHandle$volatile;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    public p0(boolean z6) {
        this._state$volatile = z6 ? S7.C.j : S7.C.f9533i;
    }

    public static S7.C0899o M(X7.i iVar) {
        while (iVar.g()) {
            X7.i iVarD = iVar.d();
            if (iVarD == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.i.f10921i;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (X7.i) obj;
                    if (!iVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = iVarD;
            }
        }
        while (true) {
            iVar = iVar.f();
            if (!iVar.g()) {
                if (iVar instanceof S7.C0899o) {
                    return (S7.C0899o) iVar;
                }
                if (iVar instanceof S7.r0) {
                    return null;
                }
            }
        }
    }

    public static java.lang.String W(java.lang.Object obj) {
        if (!(obj instanceof S7.n0)) {
            if (obj instanceof S7.InterfaceC0881c0) {
                return ((S7.InterfaceC0881c0) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof S7.C0903t ? "Cancelled" : "Completed";
        }
        S7.n0 n0Var = (S7.n0) obj;
        if (n0Var.d()) {
            return "Cancelling";
        }
        return S7.n0.f9602i.get(n0Var) == 1 ? "Completing" : "Active";
    }

    public boolean A() {
        return true;
    }

    public boolean C() {
        return this instanceof S7.C0901q;
    }

    public final S7.r0 D(S7.InterfaceC0881c0 interfaceC0881c0) {
        S7.r0 r0VarA = interfaceC0881c0.a();
        if (r0VarA != null) {
            return r0VarA;
        }
        if (interfaceC0881c0 instanceof S7.Q) {
            return new S7.r0();
        }
        if (interfaceC0881c0 instanceof S7.k0) {
            U((S7.k0) interfaceC0881c0);
            return null;
        }
        throw new java.lang.IllegalStateException(("State should have list: " + interfaceC0881c0).toString());
    }

    public boolean E(java.lang.Throwable th) {
        return false;
    }

    public final void G(S7.InterfaceC0891h0 interfaceC0891h0) {
        S7.t0 t0Var = S7.t0.f9621h;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9611i;
        if (interfaceC0891h0 == null) {
            atomicReferenceFieldUpdater.set(this, t0Var);
            return;
        }
        interfaceC0891h0.start();
        S7.InterfaceC0898n interfaceC0898nV = interfaceC0891h0.v(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0898nV);
        if (P()) {
            interfaceC0898nV.dispose();
            atomicReferenceFieldUpdater.set(this, t0Var);
        }
    }

    public final S7.O H(boolean z6, S7.k0 k0Var) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z9;
        boolean zC;
        k0Var.f9593k = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f9610h;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj instanceof S7.Q;
            S7.t0 t0Var = S7.t0.f9621h;
            z9 = true;
            if (!z10) {
                if (!(obj instanceof S7.InterfaceC0881c0)) {
                    z9 = false;
                    break;
                }
                S7.InterfaceC0881c0 interfaceC0881c0 = (S7.InterfaceC0881c0) obj;
                S7.r0 r0VarA = interfaceC0881c0.a();
                if (r0VarA == null) {
                    kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    U((S7.k0) obj);
                } else {
                    if (k0Var.i()) {
                        S7.n0 n0Var = interfaceC0881c0 instanceof S7.n0 ? (S7.n0) interfaceC0881c0 : null;
                        java.lang.Throwable thC = n0Var != null ? n0Var.c() : null;
                        if (thC == null) {
                            zC = r0VarA.c(k0Var, 5);
                        } else if (z6) {
                            k0Var.j(thC);
                            return t0Var;
                        }
                    } else {
                        zC = r0VarA.c(k0Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                S7.Q q9 = (S7.Q) obj;
                if (q9.f9554h) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    T(q9);
                }
            }
            return t0Var;
        }
        if (z9) {
            return k0Var;
        }
        if (z6) {
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            S7.C0903t c0903t = obj2 instanceof S7.C0903t ? (S7.C0903t) obj2 : null;
            k0Var.j(c0903t != null ? c0903t.f9620a : null);
        }
        return t0Var;
    }

    public boolean I() {
        return this instanceof S7.C0886f;
    }

    public final boolean J(java.lang.Object obj) {
        java.lang.Object objX;
        do {
            objX = X(f9610h.get(this), obj);
            if (objX == S7.C.f9529d) {
                return false;
            }
            if (objX == S7.C.f9530e) {
                return true;
            }
        } while (objX == S7.C.f9531f);
        f(objX);
        return true;
    }

    public final java.lang.Object K(java.lang.Object obj) {
        java.lang.Object objX;
        do {
            objX = X(f9610h.get(this), obj);
            if (objX == S7.C.f9529d) {
                java.lang.String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                S7.C0903t c0903t = obj instanceof S7.C0903t ? (S7.C0903t) obj : null;
                throw new java.lang.IllegalStateException(str, c0903t != null ? c0903t.f9620a : null);
            }
        } while (objX == S7.C.f9531f);
        return objX;
    }

    public java.lang.String L() {
        return getClass().getSimpleName();
    }

    @Override // S7.InterfaceC0891h0
    public final S7.O N(boolean z6, boolean z9, p194x6.j jVar) {
        return H(z9, z6 ? new S7.C0887f0(jVar) : new S7.P(1, jVar));
    }

    public final void O(S7.r0 r0Var, java.lang.Throwable th) {
        Q(th);
        r0Var.c(new X7.h(4), 4);
        java.lang.Object obj = X7.i.f10920h.get(r0Var);
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        I3.b bVar = null;
        for (X7.i iVarF = (X7.i) obj; !iVarF.equals(r0Var); iVarF = iVarF.f()) {
            if ((iVarF instanceof S7.k0) && ((S7.k0) iVarF).i()) {
                try {
                    ((S7.k0) iVarF).j(th);
                } catch (java.lang.Throwable th2) {
                    if (bVar != null) {
                        com.google.common.util.concurrent.AbstractC1903s.j(bVar, th2);
                    } else {
                        bVar = new I3.b("Exception in completion handler " + iVarF + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar != null) {
            F(bVar);
        }
        p(th);
    }

    @Override // S7.InterfaceC0891h0
    public final boolean P() {
        return !(f9610h.get(this) instanceof S7.InterfaceC0881c0);
    }

    public final void T(S7.Q q9) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        S7.r0 r0Var = new S7.r0();
        java.lang.Object c0879b0 = r0Var;
        if (!q9.f9554h) {
            c0879b0 = new S7.C0879b0(r0Var);
        }
        do {
            atomicReferenceFieldUpdater = f9610h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, q9, c0879b0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == q9);
    }

    public final void U(S7.k0 k0Var) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        S7.r0 r0Var = new S7.r0();
        k0Var.getClass();
        X7.i.f10921i.set(r0Var, k0Var);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = X7.i.f10920h;
        atomicReferenceFieldUpdater2.set(r0Var, k0Var);
        loop0: while (atomicReferenceFieldUpdater2.get(k0Var) == k0Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(k0Var, k0Var, r0Var)) {
                    r0Var.e(k0Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(k0Var) == k0Var);
        }
        X7.i iVarF = k0Var.f();
        do {
            atomicReferenceFieldUpdater = f9610h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k0Var, iVarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k0Var);
    }

    public final int V(java.lang.Object obj) {
        boolean z6 = obj instanceof S7.Q;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9610h;
        if (z6) {
            if (((S7.Q) obj).f9554h) {
                return 0;
            }
            S7.Q q9 = S7.C.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            S();
            return 1;
        }
        if (!(obj instanceof S7.C0879b0)) {
            return 0;
        }
        S7.r0 r0Var = ((S7.C0879b0) obj).f9568h;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        S();
        return 1;
    }

    public final java.lang.Object X(java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof S7.InterfaceC0881c0)) {
            return S7.C.f9529d;
        }
        if (((obj instanceof S7.Q) || (obj instanceof S7.k0)) && !(obj instanceof S7.C0899o) && !(obj2 instanceof S7.C0903t)) {
            S7.InterfaceC0881c0 interfaceC0881c0 = (S7.InterfaceC0881c0) obj;
            java.lang.Object c0883d0 = obj2 instanceof S7.InterfaceC0881c0 ? new S7.C0883d0((S7.InterfaceC0881c0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f9610h;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0881c0, c0883d0)) {
                    Q(null);
                    R(obj2);
                    s(interfaceC0881c0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0881c0);
            return S7.C.f9531f;
        }
        S7.InterfaceC0881c0 interfaceC0881c1 = (S7.InterfaceC0881c0) obj;
        S7.r0 r0VarD = D(interfaceC0881c1);
        if (r0VarD == null) {
            return S7.C.f9531f;
        }
        S7.n0 n0Var = interfaceC0881c1 instanceof S7.n0 ? (S7.n0) interfaceC0881c1 : null;
        if (n0Var == null) {
            n0Var = new S7.n0(r0VarD, null);
        }
        synchronized (n0Var) {
            try {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = S7.n0.f9602i;
                if (atomicIntegerFieldUpdater.get(n0Var) == 1) {
                    return S7.C.f9529d;
                }
                atomicIntegerFieldUpdater.set(n0Var, 1);
                if (n0Var != interfaceC0881c1) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9610h;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0881c1, n0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0881c1) {
                            return S7.C.f9531f;
                        }
                    }
                }
                boolean zD = n0Var.d();
                S7.C0903t c0903t = obj2 instanceof S7.C0903t ? (S7.C0903t) obj2 : null;
                if (c0903t != null) {
                    n0Var.b(c0903t.f9620a);
                }
                java.lang.Throwable thC = zD ? null : n0Var.c();
                if (thC != null) {
                    O(r0VarD, thC);
                }
                S7.C0899o c0899oM = M(r0VarD);
                if (c0899oM != null && Y(n0Var, c0899oM, obj2)) {
                    return S7.C.f9530e;
                }
                r0VarD.c(new X7.h(2), 2);
                S7.C0899o c0899oM2 = M(r0VarD);
                return (c0899oM2 == null || !Y(n0Var, c0899oM2, obj2)) ? x(n0Var, obj2) : S7.C.f9530e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean Y(S7.n0 n0Var, S7.C0899o c0899o, java.lang.Object obj) {
        while (S7.C.w(c0899o.f9605l, false, new S7.m0(this, n0Var, c0899o, obj)) == S7.t0.f9621h) {
            c0899o = M(c0899o);
            if (c0899o == null) {
                return false;
            }
        }
        return true;
    }

    @Override // S7.InterfaceC0891h0
    public final N7.m b() {
        return new N7.p(new S7.o0(this, null));
    }

    @Override // S7.InterfaceC0891h0
    public void e(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new S7.C0893i0(q(), null, this);
        }
        m(cancellationException);
    }

    @Override // p100l6.h
    public final java.lang.Object fold(java.lang.Object obj, p194x6.m mVar) {
        return mVar.invoke(obj, this);
    }

    @Override // p100l6.h
    public final p100l6.f get(p100l6.g gVar) {
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.t(this, gVar);
    }

    @Override // p100l6.f
    public final p100l6.g getKey() {
        return S7.C0889g0.f9584h;
    }

    public void h(java.lang.Object obj) {
        f(obj);
    }

    public java.lang.Object i() throws java.lang.Throwable {
        java.lang.Object obj = f9610h.get(this);
        if (obj instanceof S7.InterfaceC0881c0) {
            throw new java.lang.IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof S7.C0903t) {
            throw ((S7.C0903t) obj).f9620a;
        }
        return S7.C.I(obj);
    }

    @Override // S7.InterfaceC0891h0
    public boolean isActive() {
        java.lang.Object obj = f9610h.get(this);
        return (obj instanceof S7.InterfaceC0881c0) && ((S7.InterfaceC0881c0) obj).isActive();
    }

    @Override // S7.InterfaceC0891h0
    public final boolean isCancelled() {
        java.lang.Object obj = f9610h.get(this);
        if (obj instanceof S7.C0903t) {
            return true;
        }
        return (obj instanceof S7.n0) && ((S7.n0) obj).d();
    }

    @Override // S7.InterfaceC0891h0
    public final S7.O j(p194x6.j jVar) {
        return H(true, new S7.P(1, jVar));
    }

    public final java.lang.Object k(p100l6.c cVar) throws java.lang.Throwable {
        java.lang.Object obj;
        int i3 = 2;
        do {
            obj = f9610h.get(this);
            if (!(obj instanceof S7.InterfaceC0881c0)) {
                if (obj instanceof S7.C0903t) {
                    throw ((S7.C0903t) obj).f9620a;
                }
                return S7.C.I(obj);
            }
        } while (V(obj) < 0);
        S7.l0 l0Var = new S7.l0(this, com.google.common.util.concurrent.P.h0(cVar));
        l0Var.r();
        l0Var.u(new S7.C0890h(i3, S7.C.w(this, true, new S7.P(i3, l0Var))));
        java.lang.Object objQ = l0Var.q();
        p109m6.a aVar = p109m6.a.f25430h;
        return objQ;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[PHI: r0
  0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x0052, B:29:0x0067, B:32:0x006d, B:34:0x0076, B:37:0x007d), top: B:81:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x0052, B:29:0x0067, B:32:0x006d, B:34:0x0076, B:37:0x007d), top: B:81:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0076 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:24:0x0052, B:29:0x0067, B:32:0x006d, B:34:0x0076, B:37:0x007d), top: B:81:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00de  */
    /* JADX WARN: Code duplicated, block: B:78:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0103  */
    /* JADX WARN: Code duplicated, block: B:81:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00bb->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0045, please report this as an issue */
    public final boolean l(java.lang.Object obj) {
        java.lang.Throwable thW;
        java.lang.Object obj2;
        S7.n0 n0Var;
        boolean z6;
        java.lang.Throwable thC;
        N6.A a2;
        S7.InterfaceC0881c0 interfaceC0881c0;
        S7.r0 r0VarD;
        S7.n0 n0Var2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.lang.Object objX;
        java.lang.Object objX2 = S7.C.f9529d;
        if (C()) {
            do {
                java.lang.Object obj3 = f9610h.get(this);
                if (obj3 instanceof S7.InterfaceC0881c0) {
                    if (obj3 instanceof S7.n0) {
                        S7.n0 n0Var3 = (S7.n0) obj3;
                        n0Var3.getClass();
                        if (S7.n0.f9602i.get(n0Var3) == 1) {
                        }
                    }
                    objX2 = X(obj3, new S7.C0903t(w(obj), false));
                }
                objX2 = S7.C.f9529d;
                break;
            } while (objX2 == S7.C.f9531f);
            if (objX2 != S7.C.f9530e) {
                if (objX2 == S7.C.f9529d) {
                    thW = null;
                    loop1: while (true) {
                        obj2 = f9610h.get(this);
                        if (obj2 instanceof S7.n0) {
                            synchronized (obj2) {
                                try {
                                    n0Var = (S7.n0) obj2;
                                    n0Var.getClass();
                                    if (S7.n0.f9603k.get(n0Var) == S7.C.f9532h) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        a2 = S7.C.g;
                                    } else {
                                        boolean zD = ((S7.n0) obj2).d();
                                        if (thW == null) {
                                            thW = w(obj);
                                        }
                                        ((S7.n0) obj2).b(thW);
                                        thC = zD ? null : ((S7.n0) obj2).c();
                                        if (thC != null) {
                                            O(((S7.n0) obj2).f9604h, thC);
                                        }
                                        a2 = S7.C.f9529d;
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                        } else if (obj2 instanceof S7.InterfaceC0881c0) {
                            if (thW == null) {
                                thW = w(obj);
                            }
                            interfaceC0881c0 = (S7.InterfaceC0881c0) obj2;
                            if (interfaceC0881c0.isActive()) {
                                r0VarD = D(interfaceC0881c0);
                                if (r0VarD == null) {
                                    continue;
                                } else {
                                    n0Var2 = new S7.n0(r0VarD, thW);
                                    while (true) {
                                        atomicReferenceFieldUpdater = f9610h;
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0881c0, n0Var2)) {
                                            O(r0VarD, thW);
                                            a2 = S7.C.f9529d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0881c0) {
                                        }
                                    }
                                }
                            } else {
                                objX = X(obj2, new S7.C0903t(thW, false));
                                if (objX != S7.C.f9529d) {
                                    throw new java.lang.IllegalStateException(p121o0.p.n(obj2, "Cannot happen in "));
                                }
                                if (objX != S7.C.f9531f) {
                                    objX2 = objX;
                                    break;
                                }
                            }
                        } else {
                            a2 = S7.C.g;
                        }
                        objX2 = a2;
                        break;
                    }
                }
                if (objX2 != S7.C.f9529d && objX2 != S7.C.f9530e) {
                    if (objX2 == S7.C.g) {
                        return false;
                    }
                    f(objX2);
                    return true;
                }
            }
        } else {
            if (objX2 == S7.C.f9529d) {
                thW = null;
                loop1: while (true) {
                    obj2 = f9610h.get(this);
                    if (obj2 instanceof S7.n0) {
                        synchronized (obj2) {
                            n0Var = (S7.n0) obj2;
                            n0Var.getClass();
                            if (S7.n0.f9603k.get(n0Var) == S7.C.f9532h) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                a2 = S7.C.g;
                            } else {
                                boolean zD2 = ((S7.n0) obj2).d();
                                if (thW == null) {
                                    thW = w(obj);
                                }
                                ((S7.n0) obj2).b(thW);
                                if (zD2) {
                                }
                                if (thC != null) {
                                    O(((S7.n0) obj2).f9604h, thC);
                                }
                                a2 = S7.C.f9529d;
                            }
                        }
                    } else if (obj2 instanceof S7.InterfaceC0881c0) {
                        if (thW == null) {
                            thW = w(obj);
                        }
                        interfaceC0881c0 = (S7.InterfaceC0881c0) obj2;
                        if (interfaceC0881c0.isActive()) {
                            r0VarD = D(interfaceC0881c0);
                            if (r0VarD == null) {
                                continue;
                            } else {
                                n0Var2 = new S7.n0(r0VarD, thW);
                                while (true) {
                                    atomicReferenceFieldUpdater = f9610h;
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0881c0, n0Var2)) {
                                        O(r0VarD, thW);
                                        a2 = S7.C.f9529d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0881c0) {
                                    }
                                }
                            }
                        } else {
                            objX = X(obj2, new S7.C0903t(thW, false));
                            if (objX != S7.C.f9529d) {
                                throw new java.lang.IllegalStateException(p121o0.p.n(obj2, "Cannot happen in "));
                            }
                            if (objX != S7.C.f9531f) {
                                objX2 = objX;
                                break;
                            }
                        }
                    } else {
                        a2 = S7.C.g;
                    }
                    objX2 = a2;
                    break;
                }
            }
            if (objX2 != S7.C.f9529d) {
                if (objX2 == S7.C.g) {
                    return false;
                }
                f(objX2);
                return true;
            }
        }
        return true;
    }

    public void m(java.util.concurrent.CancellationException cancellationException) {
        l(cancellationException);
    }

    @Override // p100l6.h
    public final p100l6.h minusKey(p100l6.g gVar) {
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.G(this, gVar);
    }

    public final boolean p(java.lang.Throwable th) {
        if (I()) {
            return true;
        }
        boolean z6 = th instanceof java.util.concurrent.CancellationException;
        S7.InterfaceC0898n interfaceC0898n = (S7.InterfaceC0898n) f9611i.get(this);
        if (interfaceC0898n == null || interfaceC0898n == S7.t0.f9621h) {
            return z6;
        }
        return interfaceC0898n.b(th) || z6;
    }

    @Override // p100l6.h
    public final p100l6.h plus(p100l6.h hVar) {
        return com.google.android.gms.internal.play_billing.AbstractC1833d1.H(this, hVar);
    }

    public java.lang.String q() {
        return "Job was cancelled";
    }

    public boolean r(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return l(th) && A();
    }

    public final void s(S7.InterfaceC0881c0 interfaceC0881c0, java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9611i;
        S7.InterfaceC0898n interfaceC0898n = (S7.InterfaceC0898n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0898n != null) {
            interfaceC0898n.dispose();
            atomicReferenceFieldUpdater.set(this, S7.t0.f9621h);
        }
        I3.b bVar = null;
        S7.C0903t c0903t = obj instanceof S7.C0903t ? (S7.C0903t) obj : null;
        java.lang.Throwable th = c0903t != null ? c0903t.f9620a : null;
        if (interfaceC0881c0 instanceof S7.k0) {
            try {
                ((S7.k0) interfaceC0881c0).j(th);
                return;
            } catch (java.lang.Throwable th2) {
                F(new I3.b("Exception in completion handler " + interfaceC0881c0 + " for " + this, th2));
                return;
            }
        }
        S7.r0 r0VarA = interfaceC0881c0.a();
        if (r0VarA != null) {
            r0VarA.c(new X7.h(1), 1);
            java.lang.Object obj2 = X7.i.f10920h.get(r0VarA);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (X7.i iVarF = (X7.i) obj2; !iVarF.equals(r0VarA); iVarF = iVarF.f()) {
                if (iVarF instanceof S7.k0) {
                    try {
                        ((S7.k0) iVarF).j(th);
                    } catch (java.lang.Throwable th3) {
                        if (bVar != null) {
                            com.google.common.util.concurrent.AbstractC1903s.j(bVar, th3);
                        } else {
                            bVar = new I3.b("Exception in completion handler " + iVarF + " for " + this, th3);
                        }
                    }
                }
            }
            if (bVar != null) {
                F(bVar);
            }
        }
    }

    @Override // S7.InterfaceC0891h0
    public final boolean start() {
        int iV;
        do {
            iV = V(f9610h.get(this));
            if (iV == 0) {
                return false;
            }
        } while (iV != 1);
        return true;
    }

    @Override // S7.InterfaceC0891h0
    public final java.util.concurrent.CancellationException t() {
        java.util.concurrent.CancellationException c0893i0;
        java.lang.Object obj = f9610h.get(this);
        if (!(obj instanceof S7.n0)) {
            if (obj instanceof S7.InterfaceC0881c0) {
                throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof S7.C0903t)) {
                return new S7.C0893i0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            java.lang.Throwable th = ((S7.C0903t) obj).f9620a;
            c0893i0 = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            return c0893i0 == null ? new S7.C0893i0(q(), th, this) : c0893i0;
        }
        java.lang.Throwable thC = ((S7.n0) obj).c();
        if (thC == null) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        java.lang.String strConcat = getClass().getSimpleName().concat(" is cancelling");
        c0893i0 = thC instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) thC : null;
        if (c0893i0 == null) {
            if (strConcat == null) {
                strConcat = q();
            }
            c0893i0 = new S7.C0893i0(strConcat, thC, this);
        }
        return c0893i0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(L() + '{' + W(f9610h.get(this)) + '}');
        sb.append('@');
        sb.append(S7.C.s(this));
        return sb.toString();
    }

    @Override // S7.InterfaceC0891h0
    public final S7.InterfaceC0898n v(S7.p0 p0Var) {
        S7.C0899o c0899o = new S7.C0899o(p0Var);
        c0899o.f9593k = this;
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9610h;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof S7.Q) {
                S7.Q q9 = (S7.Q) obj;
                if (q9.f9554h) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0899o)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                T(q9);
            } else {
                boolean z6 = obj instanceof S7.InterfaceC0881c0;
                S7.t0 t0Var = S7.t0.f9621h;
                java.lang.Throwable thC = null;
                if (!z6) {
                    java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
                    S7.C0903t c0903t = obj2 instanceof S7.C0903t ? (S7.C0903t) obj2 : null;
                    c0899o.j(c0903t != null ? c0903t.f9620a : null);
                    return t0Var;
                }
                S7.r0 r0VarA = ((S7.InterfaceC0881c0) obj).a();
                if (r0VarA != null) {
                    if (r0VarA.c(c0899o, 7)) {
                        break;
                    }
                    boolean zC = r0VarA.c(c0899o, 3);
                    java.lang.Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof S7.n0) {
                        thC = ((S7.n0) obj3).c();
                    } else {
                        S7.C0903t c0903t2 = obj3 instanceof S7.C0903t ? (S7.C0903t) obj3 : null;
                        if (c0903t2 != null) {
                            thC = c0903t2.f9620a;
                        }
                    }
                    c0899o.j(thC);
                    if (zC) {
                        break;
                    }
                    return t0Var;
                }
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                U((S7.k0) obj);
            }
        }
        return c0899o;
    }

    public final java.lang.Throwable w(java.lang.Object obj) {
        java.lang.Throwable thC;
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        S7.p0 p0Var = (S7.p0) ((S7.v0) obj);
        java.lang.Object obj2 = f9610h.get(p0Var);
        if (obj2 instanceof S7.n0) {
            thC = ((S7.n0) obj2).c();
        } else if (obj2 instanceof S7.C0903t) {
            thC = ((S7.C0903t) obj2).f9620a;
        } else {
            if (obj2 instanceof S7.InterfaceC0881c0) {
                throw new java.lang.IllegalStateException(p121o0.p.n(obj2, "Cannot be cancelling child in this state: "));
            }
            thC = null;
        }
        java.util.concurrent.CancellationException cancellationException = thC instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) thC : null;
        return cancellationException == null ? new S7.C0893i0("Parent job is ".concat(W(obj2)), thC, p0Var) : cancellationException;
    }

    public final java.lang.Object x(S7.n0 n0Var, java.lang.Object obj) {
        boolean zD;
        java.lang.Throwable thY;
        S7.C0903t c0903t = obj instanceof S7.C0903t ? (S7.C0903t) obj : null;
        java.lang.Throwable th = c0903t != null ? c0903t.f9620a : null;
        synchronized (n0Var) {
            zD = n0Var.d();
            java.util.ArrayList<java.lang.Throwable> arrayListE = n0Var.e(th);
            thY = y(n0Var, arrayListE);
            if (thY != null && arrayListE.size() > 1) {
                java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(arrayListE.size()));
                for (java.lang.Throwable th2 : arrayListE) {
                    if (th2 != thY && th2 != thY && !(th2 instanceof java.util.concurrent.CancellationException) && setNewSetFromMap.add(th2)) {
                        com.google.common.util.concurrent.AbstractC1903s.j(thY, th2);
                    }
                }
            }
        }
        if (thY != null && thY != th) {
            obj = new S7.C0903t(thY, false);
        }
        if (thY != null && (p(thY) || E(thY))) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            S7.C0903t.f9619b.compareAndSet((S7.C0903t) obj, 0, 1);
        }
        if (!zD) {
            Q(thY);
        }
        R(obj);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9610h;
        java.lang.Object c0883d0 = obj instanceof S7.InterfaceC0881c0 ? new S7.C0883d0((S7.InterfaceC0881c0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, n0Var, c0883d0) && atomicReferenceFieldUpdater.get(this) == n0Var) {
        }
        s(n0Var, obj);
        return obj;
    }

    public final java.lang.Throwable y(S7.n0 n0Var, java.util.ArrayList arrayList) {
        java.lang.Object next;
        java.lang.Object obj = null;
        if (arrayList.isEmpty()) {
            if (n0Var.d()) {
                return new S7.C0893i0(q(), null, this);
            }
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((java.lang.Throwable) next) instanceof java.util.concurrent.CancellationException);
        java.lang.Throwable th = (java.lang.Throwable) next;
        if (th != null) {
            return th;
        }
        java.lang.Throwable th2 = (java.lang.Throwable) arrayList.get(0);
        if (th2 instanceof S7.B0) {
            for (java.lang.Object obj2 : arrayList) {
                java.lang.Throwable th3 = (java.lang.Throwable) obj2;
                if (th3 != th2 && (th3 instanceof S7.B0)) {
                    obj = obj2;
                    break;
                }
            }
            java.lang.Throwable th4 = (java.lang.Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // S7.InterfaceC0891h0
    public final java.lang.Object z(p100l6.c cVar) {
        java.lang.Object obj;
        p070h6.A a2;
        do {
            obj = f9610h.get(this);
            boolean z6 = obj instanceof S7.InterfaceC0881c0;
            a2 = p070h6.A.f22523a;
            if (!z6) {
                S7.C.p(cVar.getContext());
                return a2;
            }
        } while (V(obj) < 0);
        S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
        c0895k.r();
        c0895k.u(new S7.C0890h(2, S7.C.w(this, true, new S7.C0897m(c0895k, 1))));
        java.lang.Object objQ = c0895k.q();
        p109m6.a aVar = p109m6.a.f25430h;
        if (objQ != aVar) {
            objQ = a2;
        }
        return objQ == aVar ? objQ : a2;
    }

    public void S() {
    }

    public void F(I3.b bVar) {
        throw bVar;
    }

    public void Q(java.lang.Throwable th) {
    }

    public void R(java.lang.Object obj) {
    }

    public void f(java.lang.Object obj) {
    }
}
