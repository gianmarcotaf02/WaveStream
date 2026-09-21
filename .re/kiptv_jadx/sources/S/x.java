package S;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.View f9179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S.p f9180b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public J.X f9183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public U.i0 f9184f;
    public R0.V0 g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public android.graphics.Rect f9188l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S.u f9189m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p194x6.j f9181c = new J5.t2(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p194x6.j f9182d = new J5.t2(10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g1.x f9185h = new g1.x("", p011b1.L.f17782b, 4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g1.k f9186i = g1.k.g;
    public final java.util.ArrayList j = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f9187k = com.google.common.util.concurrent.D.A(p070h6.i.j, new D5.C0261o(21, this));

    public x(android.view.View view, J5.C1 c9, S.p pVar) {
        this.f9179a = view;
        this.f9180b = pVar;
        this.f9189m = new S.u(c9, pVar);
    }

    public final S.y a(android.view.inputmethod.EditorInfo editorInfo) {
        int i3;
        int i9;
        g1.x xVar = this.f9185h;
        java.lang.String str = xVar.f21847a.f17809i;
        g1.k kVar = this.f9186i;
        int i10 = kVar.f21828e;
        boolean z6 = kVar.f21824a;
        if (i10 == 1) {
            i3 = z6 ? 6 : 0;
        } else if (i10 == 0) {
            i3 = 1;
        } else if (i10 == 2) {
            i3 = 2;
        } else if (i10 == 6) {
            i3 = 5;
        } else if (i10 == 5) {
            i3 = 7;
        } else if (i10 == 3) {
            i3 = 3;
        } else if (i10 == 4) {
            i3 = 4;
        } else {
            if (i10 != 7) {
                throw new java.lang.IllegalStateException("invalid ImeAction");
            }
        }
        editorInfo.imeOptions = i3;
        p074i1.b bVar = p074i1.b.j;
        p074i1.b bVar2 = kVar.f21829f;
        if (kotlin.jvm.internal.m.a(bVar2, bVar)) {
            editorInfo.hintLocales = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(bVar2, 10));
            java.util.Iterator it = bVar2.f22747h.iterator();
            while (it.hasNext()) {
                arrayList.add(((p074i1.a) it.next()).f22746a);
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            editorInfo.hintLocales = new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length));
        }
        int i11 = kVar.f21827d;
        if (i11 == 1) {
            i9 = 1;
        } else if (i11 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i9 = 1;
        } else if (i11 == 3) {
            i9 = 2;
        } else if (i11 == 4) {
            i9 = 3;
        } else if (i11 == 5) {
            i9 = 17;
        } else if (i11 == 6) {
            i9 = 33;
        } else if (i11 == 7) {
            i9 = androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC3;
        } else if (i11 == 8) {
            i9 = 18;
        } else {
            if (i11 != 9) {
                throw new java.lang.IllegalStateException("Invalid Keyboard Type");
            }
            i9 = 8194;
        }
        editorInfo.inputType = i9;
        if (!z6 && (i9 & 1) == 1) {
            editorInfo.inputType = i9 | 131072;
            if (kVar.f21828e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        int i12 = editorInfo.inputType;
        if ((i12 & 1) == 1) {
            int i13 = kVar.f21825b;
            if (i13 == 1) {
                editorInfo.inputType = i12 | 4096;
            } else if (i13 == 2) {
                editorInfo.inputType = i12 | 8192;
            } else if (i13 == 3) {
                editorInfo.inputType = i12 | 16384;
            }
            if (kVar.f21826c) {
                editorInfo.inputType |= 32768;
            }
        }
        int i14 = p011b1.L.f17783c;
        long j = xVar.f21848b;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        F1.d.a(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!R.e.f8727a || i11 == 7 || i11 == 8) {
            F1.d.b(editorInfo, false);
        } else {
            F1.d.b(editorInfo, true);
            editorInfo.setSupportedHandwritingGestures(p078i6.p.B0(D1.C0.n(), D1.C0.z(), D1.C0.v(), D1.C0.x(), D1.C0.B(), D1.C0.C(), D1.C0.D()));
            editorInfo.setSupportedHandwritingGesturePreviews(p078i6.m.F0(new java.lang.Class[]{D1.C0.n(), D1.C0.z(), D1.C0.v(), D1.C0.x()}));
        }
        S.v vVar = S.w.f9178a;
        if (T1.j.d()) {
            T1.j.a().i(editorInfo);
        }
        S.y yVar = new S.y(this.f9185h, new p166t3.i(19, this), this.f9186i.f21826c, this.f9183e, this.f9184f, this.g);
        this.j.add(new java.lang.ref.WeakReference(yVar));
        return yVar;
    }
}
