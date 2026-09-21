package p089k0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements p194x6.m, p194x6.n, p194x6.o, p194x6.p, p194x6.q, p194x6.r, p194x6.s, p194x6.t, p194x6.a, p194x6.b, p194x6.c, p194x6.d, p194x6.e, p194x6.f, p194x6.g, p194x6.h, p194x6.i, p194x6.k, p194x6.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f24407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f24408i;
    public java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p020c0.C1701q0 f24409k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f24410l;

    public e(int i3, java.lang.Object obj, boolean z6) {
        this.f24407h = i3;
        this.f24408i = z6;
        this.j = obj;
    }

    public final java.lang.Object a(int i3, p020c0.C1700q c1700q) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = i3 | (c1700q.f(this) ? p089k0.f.a(2, 0) : p089k0.f.a(1, 0));
        java.lang.Object obj = this.j;
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        kotlin.jvm.internal.E.c(2, obj);
        java.lang.Object objInvoke = ((p194x6.m) obj).invoke(c1700q, java.lang.Integer.valueOf(iA));
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p089k0.d(2, this, p089k0.e.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    @Override // p194x6.s
    public final /* bridge */ /* synthetic */ java.lang.Object b(java.lang.String str, java.lang.Boolean bool, w.c cVar, java.lang.Object obj, java.lang.Object obj2, p020c0.C1700q c1700q, java.lang.Integer num) {
        return h(str, bool, cVar, obj, obj2, c1700q, num.intValue());
    }

    public final java.lang.Object c(java.lang.Object obj, p020c0.C1700q c1700q, int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? p089k0.f.a(2, 1) : p089k0.f.a(1, 1);
        java.lang.Object obj2 = this.j;
        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        kotlin.jvm.internal.E.c(3, obj2);
        java.lang.Object objInvoke = ((p194x6.n) obj2).invoke(obj, c1700q, java.lang.Integer.valueOf(iA | i3));
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new D.l(this, obj, i3, 9);
        }
        return objInvoke;
    }

    public final java.lang.Object d(java.lang.Object obj, java.lang.Object obj2, p020c0.C1700q c1700q, int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? p089k0.f.a(2, 2) : p089k0.f.a(1, 2);
        java.lang.Object obj3 = this.j;
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        kotlin.jvm.internal.E.c(4, obj3);
        java.lang.Object objInvoke = ((p194x6.o) obj3).invoke(obj, obj2, c1700q, java.lang.Integer.valueOf(iA | i3));
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new D5.o0(i3, 9, this, obj, obj2);
        }
        return objInvoke;
    }

    @Override // p194x6.q
    public final /* bridge */ /* synthetic */ java.lang.Object e(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.io.Serializable serializable) {
        return g(obj, obj2, obj3, obj4, (p020c0.C1700q) obj5, ((java.lang.Number) serializable).intValue());
    }

    public final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, p020c0.C1700q c1700q, int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? p089k0.f.a(2, 3) : p089k0.f.a(1, 3);
        java.lang.Object obj4 = this.j;
        kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        kotlin.jvm.internal.E.c(5, obj4);
        java.lang.Object objInvoke = ((p194x6.p) obj4).invoke(obj, obj2, obj3, c1700q, java.lang.Integer.valueOf(iA | i3));
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new C5.C0134o(i3, 4, this, obj, obj2, obj3);
        }
        return objInvoke;
    }

    public final java.lang.Object g(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, p020c0.C1700q c1700q, int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? p089k0.f.a(2, 4) : p089k0.f.a(1, 4);
        java.lang.Object obj5 = this.j;
        kotlin.jvm.internal.m.c(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        kotlin.jvm.internal.E.c(6, obj5);
        java.lang.Object objE = ((p194x6.q) obj5).e(obj, obj2, obj3, obj4, c1700q, java.lang.Integer.valueOf(i3 | iA));
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new D5.C0258l(this, obj, obj2, obj3, obj4, i3, 3);
        }
        return objE;
    }

    public final java.lang.Object h(final java.lang.String str, final java.lang.Boolean bool, final w.c cVar, final java.lang.Object obj, final java.lang.Object obj2, p020c0.C1700q c1700q, final int i3) {
        c1700q.e0(this.f24407h);
        i(c1700q);
        int iA = c1700q.f(this) ? p089k0.f.a(2, 6) : p089k0.f.a(1, 6);
        java.lang.Object obj3 = this.j;
        kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        kotlin.jvm.internal.E.c(8, obj3);
        java.lang.Object objB = ((p194x6.s) obj3).b(str, bool, cVar, obj, obj2, c1700q, java.lang.Integer.valueOf(i3 | iA));
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new p194x6.m() { // from class: k0.c
                @Override // p194x6.m
                public final java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5) {
                    ((java.lang.Integer) obj5).getClass();
                    int iK = p020c0.AbstractC1703s.K(i3) | 1;
                    java.lang.Boolean bool2 = bool;
                    java.lang.Object obj6 = obj2;
                    this.f24400h.h(str, bool2, cVar, obj, obj6, (p020c0.C1700q) obj4, iK);
                    return p070h6.A.f22523a;
                }
            };
        }
        return objB;
    }

    public final void i(p020c0.C1700q c1700q) {
        p020c0.C1701q0 c1701q0B;
        if (!this.f24408i || (c1701q0B = c1700q.B()) == null) {
            return;
        }
        c1700q.getClass();
        c1701q0B.f18349b |= 1;
        if (p089k0.f.e(this.f24409k, c1701q0B)) {
            this.f24409k = c1701q0B;
            return;
        }
        java.util.ArrayList arrayList = this.f24410l;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.f24410l = arrayList2;
            arrayList2.add(c1701q0B);
            return;
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (p089k0.f.e((p020c0.C1701q0) arrayList.get(i3), c1701q0B)) {
                arrayList.set(i3, c1701q0B);
                return;
            }
        }
        arrayList.add(c1701q0B);
    }

    @Override // p194x6.m
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return a(((java.lang.Number) obj2).intValue(), (p020c0.C1700q) obj);
    }

    public final void j(p070h6.e eVar) {
        if (kotlin.jvm.internal.m.a(this.j, eVar)) {
            return;
        }
        boolean z6 = this.j == null;
        this.j = eVar;
        if (z6 || !this.f24408i) {
            return;
        }
        p020c0.C1701q0 c1701q0 = this.f24409k;
        if (c1701q0 != null) {
            p020c0.C1715y c1715y = c1701q0.f18348a;
            if (c1715y != null) {
                c1715y.s(c1701q0, null);
            }
            this.f24409k = null;
        }
        java.util.ArrayList arrayList = this.f24410l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                p020c0.C1701q0 c1701q1 = (p020c0.C1701q0) arrayList.get(i3);
                p020c0.C1715y c1715y2 = c1701q1.f18348a;
                if (c1715y2 != null) {
                    c1715y2.s(c1701q1, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // p194x6.n
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return c(obj, (p020c0.C1700q) obj2, ((java.lang.Number) obj3).intValue());
    }

    @Override // p194x6.o
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return d(obj, obj2, (p020c0.C1700q) obj3, ((java.lang.Number) obj4).intValue());
    }

    @Override // p194x6.p
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return f(obj, obj2, obj3, (p020c0.C1700q) obj4, ((java.lang.Number) obj5).intValue());
    }
}
