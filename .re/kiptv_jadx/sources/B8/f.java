package B8;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f855f;
    public final java.lang.Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f856h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f857i;

    public f(E.j jVar) {
        this.g = jVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new E.s(0, 0));
        this.f850a = arrayList;
        this.f854e = -1;
        this.f856h = new java.util.ArrayList();
        this.f857i = p078i6.w.f23205h;
    }

    public static B8.f a(B8.f fVar, int i3, A8.e eVar, w8.v vVar, int i9) {
        if ((i9 & 1) != 0) {
            i3 = fVar.f851b;
        }
        int i10 = i3;
        if ((i9 & 2) != 0) {
            eVar = (A8.e) fVar.f856h;
        }
        A8.e eVar2 = eVar;
        if ((i9 & 4) != 0) {
            vVar = (w8.v) fVar.f857i;
        }
        w8.v request = vVar;
        kotlin.jvm.internal.m.e(request, "request");
        return new B8.f((A8.j) fVar.g, fVar.f850a, i10, eVar2, request, fVar.f852c, fVar.f853d, fVar.f854e);
    }

    public int b() {
        return ((int) java.lang.Math.sqrt((((double) e()) * 1.0d) / ((double) this.f855f))) + 1;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public Y2.L c(int i3) {
        java.lang.Object obj;
        ((E.j) this.g).getClass();
        int i9 = this.f855f;
        int i10 = i3 * i9;
        int iE = e() - i10;
        if (i9 > iE) {
            i9 = iE;
        }
        if (i9 < 0) {
            i9 = 0;
        }
        if (i9 == this.f857i.size()) {
            obj = this.f857i;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(i9);
            for (int i11 = 0; i11 < i9; i11++) {
                arrayList.add(new E.e(1));
            }
            this.f857i = arrayList;
            obj = arrayList;
        }
        return new Y2.L(i10, obj, 3);
    }

    public int d(int i3) {
        if (e() <= 0) {
            return 0;
        }
        if (i3 >= e()) {
            A.b.a("ItemIndex > total count");
        }
        ((E.j) this.g).getClass();
        return i3 / this.f855f;
    }

    public int e() {
        return ((E.j) this.g).f2641c.f861i;
    }

    public w8.B f(w8.v request) {
        kotlin.jvm.internal.m.e(request, "request");
        java.util.ArrayList arrayList = this.f850a;
        int size = arrayList.size();
        int i3 = this.f851b;
        if (i3 >= size) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        this.f855f++;
        A8.e eVar = (A8.e) this.f856h;
        if (eVar != null) {
            if (!eVar.f386b.b(request.f30659a)) {
                throw new java.lang.IllegalStateException(("network interceptor " + arrayList.get(i3 - 1) + " must retain the same host and port").toString());
            }
            if (this.f855f != 1) {
                throw new java.lang.IllegalStateException(("network interceptor " + arrayList.get(i3 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i9 = i3 + 1;
        B8.f fVarA = a(this, i9, null, request, 58);
        w8.p pVar = (w8.p) arrayList.get(i3);
        w8.B bA = pVar.a(fVarA);
        if (bA == null) {
            throw new java.lang.NullPointerException("interceptor " + pVar + " returned null");
        }
        if (eVar != null && i9 < arrayList.size() && fVarA.f855f != 1) {
            throw new java.lang.IllegalStateException(("network interceptor " + pVar + " must call proceed() exactly once").toString());
        }
        if (bA.f30491n != null) {
            return bA;
        }
        throw new java.lang.IllegalStateException(("interceptor " + pVar + " returned a response with no body").toString());
    }

    public int g(int i3) {
        E.t tVar = E.t.f2706a;
        F.C0344i c0344iC = ((E.j) this.g).f2641c.c(i3);
        return (int) ((E.e) ((E.i) c0344iC.f3463c).f2636b.invoke(tVar, java.lang.Integer.valueOf(i3 - c0344iC.f3461a))).f2617a;
    }

    public f(A8.j call, java.util.ArrayList arrayList, int i3, A8.e eVar, w8.v request, int i9, int i10, int i11) {
        kotlin.jvm.internal.m.e(call, "call");
        kotlin.jvm.internal.m.e(request, "request");
        this.g = call;
        this.f850a = arrayList;
        this.f851b = i3;
        this.f856h = eVar;
        this.f857i = request;
        this.f852c = i9;
        this.f853d = i10;
        this.f854e = i11;
    }
}
