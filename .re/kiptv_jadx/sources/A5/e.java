package A5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f254h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f255i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f254h = i3;
        this.f255i = obj;
        this.j = obj2;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Throwable {
        p020c0.C1700q c1700q;
        boolean z6;
        boolean z9;
        p011b1.L l2;
        L.a aVar;
        android.view.textclassifier.TextClassification textClassification;
        L.a aVar2;
        p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
        android.view.textclassifier.TextClassification textClassification2 = null;
        int i3 = 2;
        p070h6.A a2 = p070h6.A.f22523a;
        java.lang.Object obj3 = this.j;
        java.lang.Object obj4 = this.f255i;
        switch (this.f254h) {
            case 0:
                ((java.lang.Integer) obj2).getClass();
                A5.i.a((kotlin.jvm.functions.Function0) obj4, (A5.l) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 1:
                ((java.lang.Integer) obj2).getClass();
                P3.e.J((C5.f2) obj3, (kotlin.jvm.functions.Function0) obj4, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(9));
                return a2;
            case 2:
                ((java.lang.Integer) obj2).getClass();
                P3.e.I((C5.e2) obj3, (kotlin.jvm.functions.Function0) obj4, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(9));
                return a2;
            case 3:
                ((java.lang.Integer) obj2).getClass();
                R8.i.e((C5.Z) obj3, (kotlin.jvm.functions.Function0) obj4, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 4:
                ((java.lang.Integer) obj2).getClass();
                D5.t0.d((D5.C0254h) obj4, (p175v0.y) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 5:
                ((java.lang.Integer) obj2).getClass();
                D5.t0.a((java.lang.String) obj4, (p194x6.m) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 6:
                ((java.lang.Integer) obj2).getClass();
                D5.t0.e((D5.C0249e) obj4, (p175v0.y) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 7:
                D.j MenuLevel = (D.j) obj;
                p175v0.y firstFocus = (p175v0.y) obj2;
                kotlin.jvm.internal.m.e(MenuLevel, "$this$MenuLevel");
                kotlin.jvm.internal.m.e(firstFocus, "firstFocus");
                java.util.ArrayList arrayList = ((D5.C0251f) obj4).f2288c;
                MenuLevel.q(arrayList.size(), null, new C5.N(2, arrayList), new p089k0.e(2039820996, new C5.M(arrayList, firstFocus, (p020c0.X) obj3, i3), true));
                return a2;
            case 8:
                p113n1.c cVar = (p113n1.c) obj;
                p113n1.a aVar3 = (p113n1.a) obj2;
                if (p113n1.a.h(aVar3.f25547a) == Integer.MAX_VALUE) {
                    A.b.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = p113n1.a.h(aVar3.f25547a);
                B.InterfaceC0068f interfaceC0068f = (B.InterfaceC0068f) obj3;
                int[] iArrM1 = p078i6.o.M1(((E.d) obj4).a(cVar, iH, cVar.k0(interfaceC0068f.a())));
                int[] iArr = new int[iArrM1.length];
                interfaceC0068f.c(cVar, iH, iArrM1, p113n1.n.f25566h, iArr);
                return new S.p(iArrM1, iArr, 8);
            case 9:
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                if (c1700q2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    F.C0359y c0359y = (F.C0359y) obj4;
                    F.InterfaceC0360z interfaceC0360z = (F.InterfaceC0360z) c0359y.f3507b.invoke();
                    F.C0358x c0358x = (F.C0358x) obj3;
                    int iD = c0358x.f3503c;
                    int iA = interfaceC0360z.a();
                    java.lang.Object obj5 = c0358x.f3501a;
                    if ((iD >= iA || !interfaceC0360z.b(iD).equals(obj5)) && (iD = interfaceC0360z.d(obj5)) != -1) {
                        c0358x.f3503c = iD;
                    }
                    if (iD != -1) {
                        c1700q2.c0(-1664741271);
                        c1700q = c1700q2;
                        F.AbstractC0349n.d(interfaceC0360z, c0359y.f3506a, iD, c0358x.f3501a, c1700q, 0);
                        z6 = false;
                    } else {
                        c1700q = c1700q2;
                        z6 = false;
                        c1700q.c0(-1668376610);
                    }
                    c1700q.p(z6);
                    boolean zH = c1700q.h(c0358x);
                    java.lang.Object objQ = c1700q.Q();
                    if (zH || objQ == c1676e) {
                        objQ = new C5.C0132n0(7, c0358x);
                        c1700q.n0(objQ);
                    }
                    p020c0.AbstractC1703s.d(obj5, (p194x6.j) objQ, c1700q);
                } else {
                    c1700q2.W();
                }
                return a2;
            case 10:
                return ((F.D) obj3).a(new F.E((F.C0359y) obj4, (O0.r0) obj), ((p113n1.a) obj2).f25547a);
            case 11:
                p020c0.C1700q c1700q3 = (p020c0.C1700q) obj;
                int iIntValue2 = ((java.lang.Integer) obj2).intValue();
                if (c1700q3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((p089k0.e) obj4).invoke((F.d0) obj3, c1700q3, 0);
                } else {
                    c1700q3.W();
                }
                return a2;
            case 12:
                ((java.lang.Integer) obj2).getClass();
                F5.j.a((F5.c) obj4, (p137q0.p) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 13:
                ((java.lang.Integer) obj2).getClass();
                P3.e.u((com.kiptv.core.model.XtreamLiveStream) obj3, (kotlin.jvm.functions.Function0) obj4, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 14:
                ((java.lang.Integer) obj2).getClass();
                E8.d.q((p005a5.X2) obj3, (kotlin.jvm.functions.Function0) obj4, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 15:
                ((java.lang.Integer) obj2).getClass();
                E8.d.o((H5.EnumC0398p) obj3, (kotlin.jvm.functions.Function0) obj4, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 16:
                ((java.lang.Integer) obj2).getClass();
                J5.Q0.o((p137q0.m) obj4, (J5.C0636u0) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 17:
                ((java.lang.Integer) obj2).getClass();
                J5.Q0.p((p137q0.m) obj4, (J5.J0) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 18:
                ((java.lang.Integer) obj2).getClass();
                J5.Z0.d((J5.P0) obj3, (kotlin.jvm.functions.Function0) obj4, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(49));
                return a2;
            case 19:
                ((java.lang.Integer) obj2).getClass();
                J5.AbstractC0571c1.a((p137q0.m) obj4, (J5.C0587g1) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 20:
                ((java.lang.Integer) obj2).getClass();
                J5.Q0.r((p137q0.m) obj4, (J5.C0643w1) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 21:
                ((java.lang.Integer) obj2).getClass();
                J5.Q0.s((p194x6.j) obj4, (p194x6.j) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 22:
                ((java.lang.Integer) obj2).getClass();
                J5.Q0.t((p137q0.p) obj4, (J5.U1) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 23:
                J5.EnumC0608l2 section = (J5.EnumC0608l2) obj;
                java.lang.String rowKey = (java.lang.String) obj2;
                kotlin.jvm.internal.m.e(section, "section");
                kotlin.jvm.internal.m.e(rowKey, "rowKey");
                ((p020c0.X) obj4).setValue(rowKey);
                ((p020c0.X) obj3).setValue(section.name());
                return a2;
            case 24:
                ((java.lang.Integer) obj2).getClass();
                J5.X1.n((p137q0.m) obj4, (J5.N2) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 25:
                p020c0.C1700q c1700q4 = (p020c0.C1700q) obj;
                int iIntValue3 = ((java.lang.Integer) obj2).intValue();
                if (c1700q4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Q.e eVar = (Q.e) obj4;
                    boolean zF = c1700q4.f(eVar);
                    java.lang.Object objQ2 = c1700q4.Q();
                    if (zF || objQ2 == c1676e) {
                        objQ2 = p020c0.AbstractC1703s.r(new E5.C0313s0(0, eVar, Q.e.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 7));
                        c1700q4.n0(objQ2);
                    }
                    O.m.a((M.g) obj3, (M.c) ((p020c0.e1) objQ2).getValue(), c1700q4, 0);
                } else {
                    c1700q4.W();
                }
                return a2;
            case 26:
                ((java.lang.Integer) obj2).getClass();
                O.m.a((M.g) obj4, (M.c) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(1));
                return a2;
            case 27:
                ((java.lang.Integer) obj2).getClass();
                ((O.q) obj4).a((android.graphics.drawable.Drawable) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(49));
                return a2;
            case 28:
                ((java.lang.Integer) obj2).getClass();
                p000a.a.b((p137q0.p) obj4, (p089k0.e) obj3, (p020c0.C1700q) obj, p020c0.AbstractC1703s.K(49));
                return a2;
            default:
                L.a aVar4 = (L.a) obj;
                android.content.Context context = (android.content.Context) obj2;
                U.i0 i0Var = (U.i0) obj4;
                boolean zJ = i0Var.j();
                p011b1.C1650g c1650gM = i0Var.m();
                java.lang.String str = c1650gM != null ? c1650gM.f17809i : null;
                p011b1.L l9 = i0Var.f10029w;
                if (l9 != null) {
                    g1.q qVar = i0Var.f10010b;
                    z9 = true;
                    long j = l9.f17784a;
                    l2 = new p011b1.L(p011b1.D.b(qVar.n((int) (j >> 32)), qVar.n((int) (4294967295L & j))));
                } else {
                    z9 = true;
                    l2 = null;
                }
                U.C0945s c0945s = i0Var.j;
                D5.C0260n c0260n = new D5.C0260n(i0Var, (S7.A) obj3, context, 13);
                p020c0.f1 f1Var = U.AbstractC0947u.f10083a;
                if (android.os.Build.VERSION.SDK_INT < 28 || str == null || l2 == null || c0945s == null || !(c0945s instanceof U.C0945s)) {
                    java.lang.String str2 = str;
                    c0260n.invoke(aVar4);
                    if (str2 != null && l2 != null) {
                        K.b.a(aVar4, context, zJ, str2, l2.f17784a);
                    }
                } else {
                    p028c8.d dVar = c0945s.f10076e;
                    if (dVar.f()) {
                        U.V v6 = (U.V) c0945s.g.getValue();
                        if (v6 != null) {
                            aVar = aVar4;
                            if (p011b1.L.b(l2.f17784a, v6.f9942b) && kotlin.jvm.internal.m.a(str, v6.f9941a)) {
                                textClassification = v6.f9943c;
                            }
                            dVar.g(null);
                            textClassification2 = textClassification;
                        } else {
                            aVar = aVar4;
                        }
                        textClassification = null;
                        dVar.g(null);
                        textClassification2 = textClassification;
                    } else {
                        aVar = aVar4;
                    }
                    if (textClassification2 == null) {
                        aVar2 = aVar;
                        c0260n.invoke(aVar2);
                    } else {
                        aVar2 = aVar;
                        boolean zIsEmpty = textClassification2.getActions().isEmpty();
                        java.lang.Object obj6 = c0945s.f10078h;
                        if (!zIsEmpty) {
                            aVar2.f7037a.a(new M.h(obj6, textClassification2, 0));
                        } else if ((textClassification2.getIcon() != null || !android.text.TextUtils.isEmpty(textClassification2.getLabel())) && (textClassification2.getIntent() != null || textClassification2.getOnClickListener() != null)) {
                            aVar2.f7037a.a(new M.h(obj6, textClassification2, -1));
                        }
                        c0260n.invoke(aVar2);
                        java.util.List actions = textClassification2.getActions();
                        int size = actions.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            B1.a.B(actions.get(i9));
                            if (i9 > 0) {
                                aVar2.f7037a.a(new M.h(obj6, textClassification2, i9));
                            }
                        }
                    }
                    K.b.a(aVar2, context, zJ, str, l2.f17784a);
                }
                return a2;
        }
    }

    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, int i3, int i9) {
        this.f254h = i9;
        this.f255i = obj;
        this.j = obj2;
    }

    public /* synthetic */ e(java.lang.Object obj, kotlin.jvm.functions.Function0 function0, int i3, int i9) {
        this.f254h = i9;
        this.j = obj;
        this.f255i = function0;
    }
}
