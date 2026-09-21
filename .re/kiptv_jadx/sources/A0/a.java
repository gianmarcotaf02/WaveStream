package A0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f13b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f14c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f15d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f16e;

    public a() {
        this.f13b = new java.lang.Object();
        this.f14c = new K0.C0661i();
    }

    public void a(p059g4.a aVar) {
        ((K0.C0661i) this.f14c).g(new p059g4.f(p059g4.e.f21866a, aVar));
        l();
    }

    public void b(p059g4.b bVar) {
        ((K0.C0661i) this.f14c).g(new p059g4.f(p059g4.e.f21866a, bVar));
        l();
    }

    public void c(p059g4.c cVar) {
        ((K0.C0661i) this.f14c).g(new p059g4.f(p059g4.e.f21866a, cVar));
        l();
    }

    public void d(Q0.H h9, float f9, long j) {
        float fFloatValue = ((java.lang.Number) ((p163t.C2748c) this.f14c).d()).floatValue();
        if (fFloatValue > 0.0f) {
            long jC = p188x0.C3098s.c(j, fFloatValue);
            if (!this.f12a) {
                p203z0.d.r(h9, jC, f9, 0L, null, 124);
                return;
            }
            p203z0.b bVar = h9.f8266h;
            float fD = p181w0.d.d(bVar.d());
            float fB = p181w0.d.b(bVar.d());
            j1.l lVar = bVar.f32128i;
            long jQ = lVar.q();
            lVar.j().e();
            try {
                ((j1.l) ((p191x3.C) lVar.f23899i).f31153h).j().k(0.0f, 0.0f, fD, fB, 1);
                p203z0.d.r(h9, jC, f9, 0L, null, 124);
            } finally {
                p121o0.p.z(lVar, jQ);
            }
        }
    }

    public java.lang.Exception e() {
        java.lang.Exception exc;
        synchronized (this.f13b) {
            exc = (java.lang.Exception) this.f16e;
        }
        return exc;
    }

    public java.lang.Object f() {
        java.lang.Object obj;
        synchronized (this.f13b) {
            try {
                H3.q.i("Task is not yet complete", this.f12a);
                java.lang.Exception exc = (java.lang.Exception) this.f16e;
                if (exc != null) {
                    throw new I3.b(exc);
                }
                obj = this.f15d;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    public void g(p202z.j jVar, S7.A a2) {
        float f9;
        boolean z6 = jVar instanceof p202z.h;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f15d;
        if (z6) {
            arrayList.add(jVar);
        } else if (jVar instanceof p202z.i) {
            arrayList.remove(((p202z.i) jVar).f32116a);
        } else if (jVar instanceof p202z.d) {
            arrayList.add(jVar);
        } else if (jVar instanceof p202z.e) {
            arrayList.remove(((p202z.e) jVar).f32111a);
        } else if (jVar instanceof p202z.b) {
            arrayList.add(jVar);
        } else if (jVar instanceof p202z.c) {
            arrayList.remove(((p202z.c) jVar).f32110a);
        } else if (!(jVar instanceof p202z.a)) {
            return;
        } else {
            arrayList.remove(((p202z.a) jVar).f32109a);
        }
        p202z.j jVar2 = (p202z.j) p078i6.o.s1(arrayList);
        if (kotlin.jvm.internal.m.a((p202z.j) this.f16e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            Y.h hVar = (Y.h) ((kotlin.jvm.internal.o) this.f13b).invoke();
            if (z6) {
                f9 = hVar.f10979c;
            } else if (jVar instanceof p202z.d) {
                f9 = hVar.f10978b;
            } else {
                f9 = jVar instanceof p202z.b ? hVar.f10977a : 0.0f;
            }
            p163t.D0 d4 = Y.u.f11016a;
            boolean z9 = jVar2 instanceof p202z.h;
            p163t.D0 d6 = Y.u.f11016a;
            if (!z9 && ((jVar2 instanceof p202z.d) || (jVar2 instanceof p202z.b))) {
                d6 = new p163t.D0(45, p163t.AbstractC2781z.f27739c, 2);
            }
            S7.C.A(a2, null, new Y.A(this, f9, d6, null), 3);
        } else {
            p202z.j jVar3 = (p202z.j) this.f16e;
            p163t.D0 d9 = Y.u.f11016a;
            boolean z10 = jVar3 instanceof p202z.h;
            p163t.D0 d10 = Y.u.f11016a;
            if (!z10 && !(jVar3 instanceof p202z.d) && (jVar3 instanceof p202z.b)) {
                d10 = new p163t.D0(150, p163t.AbstractC2781z.f27739c, 2);
            }
            S7.C.A(a2, null, new Y.B(this, d10, null), 3);
        }
        this.f16e = jVar2;
    }

    public boolean h() {
        boolean z6;
        synchronized (this.f13b) {
            z6 = false;
            if (this.f12a && ((java.lang.Exception) this.f16e) == null) {
                z6 = true;
            }
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int i(S.p pVar, androidx.compose.ui.platform.AndroidComposeView androidComposeView, boolean z6) {
        int i3;
        java.lang.Object[] objArr;
        K0.C0657e c0657e;
        int i9;
        int i10;
        Q0.C0783q c0783q = (Q0.C0783q) this.f16e;
        if (this.f12a) {
            return 0;
        }
        try {
            this.f12a = true;
            K0.C0661i c0661iI = ((A.a) this.f15d).I(pVar, androidComposeView);
            p136q.r rVar = (p136q.r) c0661iI.f6707c;
            int iF = rVar.f();
            while (true) {
                if (i3 >= iF) {
                    objArr = true;
                    break;
                }
                K0.x xVar = (K0.x) rVar.g(i3);
                i3 = (xVar.f6741d || xVar.f6744h) ? 0 : i3 + 1;
                objArr = false;
                break;
            }
            int iF2 = rVar.f();
            int i11 = 0;
            while (true) {
                c0657e = (K0.C0657e) this.f14c;
                if (i11 >= iF2) {
                    break;
                }
                K0.x xVar2 = (K0.x) rVar.g(i11);
                if (objArr != false || K0.w.b(xVar2)) {
                    ((Q0.F) this.f13b).D(xVar2.f6740c, (Q0.C0783q) this.f16e, xVar2.f6745i, true);
                    if (!c0783q.f8458h.h()) {
                        c0657e.a(xVar2.f6738a, K0.w.b(xVar2), c0783q);
                        c0783q.clear();
                    }
                }
                i11++;
            }
            boolean zB = c0657e.b(c0661iI, z6);
            if (c0661iI.f6706b) {
                i9 = 0;
                break;
            }
            int iF3 = rVar.f();
            int i12 = 0;
            while (true) {
                if (i12 >= iF3) {
                    i9 = 0;
                    break;
                }
                K0.x xVar3 = (K0.x) rVar.g(i12);
                if (!p181w0.a.b(K0.w.g(xVar3, true), 0L) && xVar3.b()) {
                    i9 = 1;
                    break;
                }
                i12++;
            }
            int iF4 = rVar.f();
            for (int i13 = 0; i13 < iF4; i13++) {
                if (((K0.x) rVar.g(i13)).b()) {
                    i10 = 1;
                    return (zB ? 1 : 0) | (i9 << 1) | (i10 << 2);
                }
            }
            i10 = 0;
            return (zB ? 1 : 0) | (i9 << 1) | (i10 << 2);
        } finally {
            this.f12a = false;
        }
    }

    public void j(java.lang.Exception exc) {
        synchronized (this.f13b) {
            k();
            this.f12a = true;
            this.f16e = exc;
        }
        ((K0.C0661i) this.f14c).h(this);
    }

    public void k() {
        boolean z6;
        java.lang.String strConcat;
        if (this.f12a) {
            int i3 = N6.C0708w.f7424h;
            synchronized (this.f13b) {
                z6 = this.f12a;
            }
            if (!z6) {
                throw new java.lang.IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            java.lang.Exception excE = e();
            if (excE == null) {
                strConcat = h() ? "result ".concat(java.lang.String.valueOf(f())) : "unknown issue";
            } else {
                strConcat = "failure";
            }
        }
    }

    public void l() {
        synchronized (this.f13b) {
            try {
                if (this.f12a) {
                    ((K0.C0661i) this.f14c).h(this);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(boolean z6, kotlin.jvm.functions.Function0 function0) {
        this.f12a = z6;
        this.f13b = (kotlin.jvm.internal.o) function0;
        this.f14c = p163t.AbstractC2750d.a(0.0f);
        this.f15d = new java.util.ArrayList();
    }
}
