package p020c0;

/* JADX INFO: renamed from: c0.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1704s0 implements N6.P, p044e7.l, p080i8.a, p068h4.t, p191x3.h, p076i4.E0, p095l.j, p103m.InterfaceC2576m, p163t.InterfaceC2774s, t8.o, p146r1.E, p059g4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f18361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f18362i;

    public /* synthetic */ C1704s0(int i3, java.lang.Object obj) {
        this.f18361h = i3;
        this.f18362i = obj;
    }

    @Override // t8.o
    public int K(char[] cArr, int i3, int i9) {
        return ((t8.C2862l) this.f18362i).a(cArr, i3, i9);
    }

    @Override // p076i4.E0
    public java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return ((p068h4.j) this.f18362i).apply(obj2);
    }

    @Override // p146r1.E
    public long b(p113n1.l lVar, long j, p113n1.n nVar, long j9) {
        long j10 = ((p113n1.k) ((kotlin.jvm.functions.Function0) this.f18362i).invoke()).f25559a;
        return (((long) w.b.a(nVar == p113n1.n.f25566h, lVar.f25561a + ((int) (j10 >> 32)), (int) (j9 >> 32), (int) (j >> 32))) << 32) | (((long) w.b.a(true, lVar.f25562b + ((int) (j10 & 4294967295L)), (int) (j9 & 4294967295L), (int) (j & 4294967295L))) & 4294967295L);
    }

    @Override // p191x3.h
    public void d(p191x3.f fVar, int i3) {
        p191x3.C3102c session = (p191x3.C3102c) fVar;
        kotlin.jvm.internal.m.e(session, "session");
        V7.n0 n0Var = ((p069h5.d) this.f18362i).f22522c;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        n0Var.getClass();
        n0Var.i(null, bool);
    }

    @Override // p191x3.h
    public void e(p191x3.f fVar, java.lang.String sessionId) {
        p191x3.C3102c session = (p191x3.C3102c) fVar;
        kotlin.jvm.internal.m.e(session, "session");
        kotlin.jvm.internal.m.e(sessionId, "sessionId");
        V7.n0 n0Var = ((p069h5.d) this.f18362i).f22521b;
        p069h5.b bVar = p069h5.b.f22518e;
        n0Var.getClass();
        n0Var.i(null, bVar);
    }

    @Override // p191x3.h
    public void f(p191x3.f fVar, int i3) {
        p191x3.C3102c session = (p191x3.C3102c) fVar;
        kotlin.jvm.internal.m.e(session, "session");
        p069h5.d dVar = (p069h5.d) this.f18362i;
        V7.n0 n0Var = dVar.f22521b;
        p069h5.b bVar = p069h5.b.f22519f;
        n0Var.getClass();
        n0Var.i(null, bVar);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        V7.n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override // p044e7.l
    public p044e7.m g(p101l7.e eVar) {
        if ("b".equals(eVar.b())) {
            return new p054f7.c(this, 2);
        }
        return null;
    }

    @Override // p163t.InterfaceC2774s
    public p163t.B get(int i3) {
        switch (this.f18361h) {
            case 18:
                return ((p163t.C[]) this.f18362i)[i3];
            default:
                return (p163t.B) this.f18362i;
        }
    }

    @Override // p191x3.h
    public void h(p191x3.f fVar, boolean z6) {
        java.lang.String str;
        p191x3.C3102c session = (p191x3.C3102c) fVar;
        kotlin.jvm.internal.m.e(session, "session");
        p069h5.d dVar = (p069h5.d) this.f18362i;
        dVar.getClass();
        H3.q.d();
        com.google.android.gms.cast.CastDevice castDevice = session.f31190k;
        if (castDevice == null || (str = castDevice.f18619k) == null) {
            str = "Cast";
        }
        p069h5.a aVar = new p069h5.a(str);
        V7.n0 n0Var = dVar.f22521b;
        n0Var.getClass();
        n0Var.i(null, aVar);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        V7.n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override // p191x3.h
    public void j(p191x3.f fVar, int i3) {
        p191x3.C3102c session = (p191x3.C3102c) fVar;
        kotlin.jvm.internal.m.e(session, "session");
        p069h5.d dVar = (p069h5.d) this.f18362i;
        V7.n0 n0Var = dVar.f22521b;
        p069h5.b bVar = p069h5.b.f22519f;
        n0Var.getClass();
        n0Var.i(null, bVar);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        V7.n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override // p191x3.h
    public void k(p191x3.f fVar, java.lang.String sessionId) {
        java.lang.String str;
        p191x3.C3102c session = (p191x3.C3102c) fVar;
        kotlin.jvm.internal.m.e(session, "session");
        kotlin.jvm.internal.m.e(sessionId, "sessionId");
        p069h5.d dVar = (p069h5.d) this.f18362i;
        dVar.getClass();
        H3.q.d();
        com.google.android.gms.cast.CastDevice castDevice = session.f31190k;
        if (castDevice == null || (str = castDevice.f18619k) == null) {
            str = "Cast";
        }
        p069h5.a aVar = new p069h5.a(str);
        V7.n0 n0Var = dVar.f22521b;
        n0Var.getClass();
        n0Var.i(null, aVar);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        V7.n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override // p068h4.t
    public java.util.Iterator l(p068h4.u uVar, java.lang.CharSequence charSequence) {
        return new p068h4.s(this, uVar, charSequence, 0);
    }

    @Override // p095l.j
    public void m(p095l.l lVar) {
        p008a8.c cVar = ((androidx.appcompat.widget.ActionMenuView) this.f18362i).f15717B;
        if (cVar != null) {
            cVar.m(lVar);
        }
    }

    @Override // p191x3.h
    public void n(p191x3.f fVar) {
        p191x3.C3102c session = (p191x3.C3102c) fVar;
        kotlin.jvm.internal.m.e(session, "session");
    }

    @Override // p191x3.h
    public void o(p191x3.f fVar) {
        p191x3.C3102c session = (p191x3.C3102c) fVar;
        kotlin.jvm.internal.m.e(session, "session");
        V7.n0 n0Var = ((p069h5.d) this.f18362i).f22521b;
        p069h5.b bVar = p069h5.b.f22518e;
        n0Var.getClass();
        n0Var.i(null, bVar);
    }

    @Override // p059g4.c
    public void onSuccess(java.lang.Object obj) {
        ((p191x3.C3100a) this.f18362i).getClass();
        com.google.android.gms.internal.cast.H.h("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (android.os.Bundle) obj);
    }

    @Override // p191x3.h
    public void q(p191x3.f fVar, int i3) {
        p191x3.C3102c session = (p191x3.C3102c) fVar;
        kotlin.jvm.internal.m.e(session, "session");
        p069h5.d dVar = (p069h5.d) this.f18362i;
        dVar.getClass();
        p069h5.b bVar = p069h5.b.f22519f;
        V7.n0 n0Var = dVar.f22521b;
        n0Var.getClass();
        n0Var.i(null, bVar);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        V7.n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override // p080i8.a
    public java.lang.Object r(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String newValue = (java.lang.String) obj2;
        kotlin.jvm.internal.m.e(newValue, "newValue");
        p063g8.m mVar = (p063g8.m) this.f18362i;
        p063g8.r rVar = mVar.f22383a.f22395a;
        java.util.List list = mVar.f22384b;
        int iIndexOf = list.indexOf(newValue);
        p063g8.u uVar = mVar.f22383a;
        java.lang.Integer num = (java.lang.Integer) rVar.r(obj, java.lang.Integer.valueOf(iIndexOf + uVar.f22396b));
        if (num != null) {
            return (java.lang.String) list.get(num.intValue() - uVar.f22396b);
        }
        return null;
    }

    @Override // p044e7.l
    public p044e7.l t(p101l7.b bVar, p101l7.e eVar) {
        return null;
    }

    public java.lang.String toString() {
        switch (this.f18361h) {
            case 1:
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                p007a7.q qVar = (p007a7.q) this.f18362i;
                sb.append(qVar);
                sb.append(": ");
                sb.append(((java.util.Map) p000a.a.v(qVar.f15498p, p007a7.q.f15495t[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public p184w3.o u() {
        p184w3.o oVar = (p184w3.o) this.f18362i;
        if (oVar.f29890h == null) {
            throw new java.lang.IllegalArgumentException("media cannot be null.");
        }
        if (!java.lang.Double.isNaN(oVar.f29892k) && oVar.f29892k < 0.0d) {
            throw new java.lang.IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (java.lang.Double.isNaN(oVar.f29893l)) {
            throw new java.lang.IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (java.lang.Double.isNaN(oVar.f29894m) || oVar.f29894m < 0.0d) {
            throw new java.lang.IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    @Override // p095l.j
    public boolean v(p095l.l lVar, android.view.MenuItem menuItem) {
        p103m.InterfaceC2576m interfaceC2576m = ((androidx.appcompat.widget.ActionMenuView) this.f18362i).f15722G;
        if (interfaceC2576m == null) {
            return false;
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) ((androidx.appcompat.widget.Toolbar) ((p020c0.C1704s0) interfaceC2576m).f18362i).f15751N.j).iterator();
        while (it.hasNext()) {
            if (((Y1.w) it.next()).f11351a.o()) {
                return true;
            }
        }
        return false;
    }

    public void w() {
        java.net.Socket socket;
        A8.q qVar = (A8.q) this.f18362i;
        java.util.Iterator it = qVar.f446d.iterator();
        kotlin.jvm.internal.m.d(it, "connections.iterator()");
        while (it.hasNext()) {
            A8.o connection = (A8.o) it.next();
            kotlin.jvm.internal.m.d(connection, "connection");
            synchronized (connection) {
                if (connection.f439p.isEmpty()) {
                    it.remove();
                    connection.j = true;
                    socket = connection.f429d;
                    kotlin.jvm.internal.m.b(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                x8.b.d(socket);
            }
        }
        if (qVar.f446d.isEmpty()) {
            qVar.f444b.a();
        }
    }

    public void x(android.view.View view, int i3, boolean z6) {
        if (android.os.Build.VERSION.SDK_INT >= 27) {
            ((android.view.autofill.AutofillManager) this.f18362i).notifyViewVisibilityChanged(view, i3, z6);
        }
    }

    public N6.InterfaceC0691e y(T6.o javaClass) {
        kotlin.jvm.internal.m.e(javaClass, "javaClass");
        p101l7.c cVarC = javaClass.c();
        if (cVarC != null) {
            p027c7.f[] fVarArr = p027c7.f.f18515h;
        }
        java.lang.Class<?> declaringClass = javaClass.f9865a.getDeclaringClass();
        T6.o oVar = declaringClass != null ? new T6.o(declaringClass) : null;
        if (oVar != null) {
            N6.InterfaceC0691e interfaceC0691eY = y(oVar);
            p180v7.o oVarG0 = interfaceC0691eY != null ? interfaceC0691eY.g0() : null;
            N6.InterfaceC0694h interfaceC0694hF = oVarG0 != null ? oVarG0.f(javaClass.e(), V6.c.f10363o) : null;
            if (interfaceC0694hF instanceof N6.InterfaceC0691e) {
                return (N6.InterfaceC0691e) interfaceC0694hF;
            }
        } else if (cVarC != null) {
            p007a7.q qVar = (p007a7.q) p078i6.o.j1(com.google.common.util.concurrent.P.i0(((Z6.e) this.f18362i).c(cVarC.b())));
            if (qVar != null) {
                p007a7.v vVar = qVar.f15499q.f15444d;
                vVar.getClass();
                return vVar.v(javaClass.e(), javaClass);
            }
        }
        return null;
    }

    public /* synthetic */ C1704s0(int i3, boolean z6) {
        this.f18361h = i3;
    }

    public C1704s0(com.google.android.gms.cast.MediaInfo mediaInfo) {
        this.f18361h = 25;
        p184w3.o oVar = new p184w3.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f18362i = oVar;
            return;
        }
        throw new java.lang.IllegalArgumentException("media cannot be null.");
    }

    public C1704s0(org.json.JSONObject jSONObject) {
        this.f18361h = 25;
        this.f18362i = new p184w3.o(jSONObject);
    }

    public C1704s0(int i3) {
        V1.b bVar;
        this.f18361h = i3;
        switch (i3) {
            case 26:
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                kotlin.jvm.internal.m.e(timeUnit, "timeUnit");
                this.f18362i = new A8.q(z8.c.f32967i);
                break;
            default:
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    bVar = new V1.b(16);
                } else {
                    bVar = new V1.b(17);
                }
                this.f18362i = bVar;
                break;
        }
    }

    public C1704s0(p007a7.q packageFragment) {
        this.f18361h = 1;
        kotlin.jvm.internal.m.e(packageFragment, "packageFragment");
        this.f18362i = packageFragment;
    }

    public C1704s0(p113n1.c cVar) {
        this.f18361h = 17;
        this.f18362i = new p154s.U(p154s.a0.f27109a, cVar);
    }

    @Override // p044e7.l, p044e7.m
    public void c() {
    }

    public C1704s0(long[] jArr) {
        p136q.y yVar;
        this.f18361h = 15;
        if (jArr != null) {
            long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, jArr.length);
            yVar = new p136q.y(jArrCopyOf.length);
            int i3 = yVar.f26439b;
            if (i3 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i3;
                    long[] jArr2 = yVar.f26438a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = java.util.Arrays.copyOf(jArr2, java.lang.Math.max(length, (jArr2.length * 3) / 2));
                        kotlin.jvm.internal.m.d(jArrCopyOf2, "copyOf(...)");
                        yVar.f26438a = jArrCopyOf2;
                    }
                    long[] jArr3 = yVar.f26438a;
                    int i9 = yVar.f26439b;
                    if (i3 != i9) {
                        p078i6.m.c0(jArr3, jArr3, jArrCopyOf.length + i3, i3, i9);
                    }
                    p078i6.m.c0(jArrCopyOf, jArr3, i3, 0, jArrCopyOf.length);
                    yVar.f26439b += jArrCopyOf.length;
                }
            } else {
                p144r.a.d("");
                throw null;
            }
        } else {
            yVar = new p136q.y(16);
        }
        this.f18362i = yVar;
    }

    @Override // p044e7.l
    public void i(p101l7.e eVar, java.lang.Object obj) {
    }

    @Override // p044e7.l
    public void p(p101l7.e eVar, p142q7.f fVar) {
    }

    public C1704s0(java.io.InputStream inputStream) {
        this.f18361h = 22;
        this.f18362i = new t8.C2862l(inputStream, O7.a.f8024b);
    }

    public C1704s0(float f9, float f10, p163t.r rVar) {
        this.f18361h = 18;
        int iB = rVar.b();
        p163t.C[] cArr = new p163t.C[iB];
        for (int i3 = 0; i3 < iB; i3++) {
            cArr[i3] = new p163t.C(f9, f10, rVar.a(i3));
        }
        this.f18362i = cArr;
    }

    @Override // p044e7.l
    public void s(p101l7.e eVar, p101l7.b bVar, p101l7.e eVar2) {
    }
}
