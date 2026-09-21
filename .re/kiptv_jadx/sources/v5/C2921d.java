package v5;

/* JADX INFO: renamed from: v5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2921d implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f29424h;

    public /* synthetic */ C2921d(int i3) {
        this.f29424h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p188x0.D dF;
        p070h6.A a2 = p070h6.A.f22523a;
        int i3 = 1;
        switch (this.f29424h) {
            case 0:
                com.kiptv.core.model.TMDBCastMember it = (com.kiptv.core.model.TMDBCastMember) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return java.lang.Integer.valueOf(it.f20122a);
            case 1:
                com.kiptv.core.model.TMDBGenre it2 = (com.kiptv.core.model.TMDBGenre) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.f20179b;
            case 2:
                ((java.lang.Integer) obj).getClass();
                float f9 = v5.AbstractC2930h0.f29480a;
                return a2;
            case 3:
                p188x0.L graphicsLayer = (p188x0.L) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.h(1);
                return a2;
            case 4:
                kotlin.jvm.internal.m.e((com.kiptv.core.model.XtreamCategory) obj, "it");
                return a2;
            case 5:
                return java.lang.Integer.valueOf(((S4.p) obj).f9429a);
            case 6:
                return (S4.p) ((p070h6.k) obj).f22540i;
            case 7:
                p005a5.Q it3 = (p005a5.Q) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return it3.f13800e;
            case 8:
                D.j LazyRow = (D.j) obj;
                kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                java.util.ArrayList arrayList = new java.util.ArrayList(6);
                for (int i9 = 0; i9 < 6; i9++) {
                    arrayList.add(java.lang.Integer.valueOf(i9));
                }
                LazyRow.q(arrayList.size(), null, new C5.N(4, arrayList), new p089k0.e(2039820996, new t5.C2828p0(i3, arrayList), true));
                return a2;
            case 9:
                p186w5.C2985h0 row = (p186w5.C2985h0) obj;
                kotlin.jvm.internal.m.e(row, "row");
                return row.f30235a;
            case 10:
                java.util.Map.Entry it4 = (java.util.Map.Entry) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                return it4.getKey() + "=" + it4.getValue();
            case 11:
                com.kiptv.core.model.XtreamLiveStream it5 = (com.kiptv.core.model.XtreamLiveStream) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                java.util.Date dateD = com.google.common.util.concurrent.AbstractC1903s.D(it5.g);
                if (dateD != null) {
                    return java.lang.Long.valueOf(dateD.getTime());
                }
                return null;
            case 12:
                com.kiptv.core.model.XtreamVODStream it6 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                java.util.Date dateD2 = com.google.common.util.concurrent.AbstractC1903s.D(it6.f20730k);
                if (dateD2 != null) {
                    return java.lang.Long.valueOf(dateD2.getTime());
                }
                return null;
            case 13:
                com.kiptv.core.model.XtreamSeries it7 = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it7, "it");
                java.util.Date dateB = it7.b();
                if (dateB != null) {
                    return java.lang.Long.valueOf(dateB.getTime());
                }
                return null;
            case 14:
                java.util.Date dateD3 = com.google.common.util.concurrent.AbstractC1903s.D(((com.kiptv.core.model.XtreamVODStream) obj).f20730k);
                return java.lang.Long.valueOf(dateD3 != null ? dateD3.getTime() : 0L);
            case 15:
                java.util.Date dateB2 = ((com.kiptv.core.model.XtreamSeries) obj).b();
                return java.lang.Long.valueOf(dateB2 != null ? dateB2.getTime() : 0L);
            case 16:
                java.util.Date dateD4 = com.google.common.util.concurrent.AbstractC1903s.D(((com.kiptv.core.model.XtreamLiveStream) obj).g);
                return java.lang.Long.valueOf(dateD4 != null ? dateD4.getTime() : 0L);
            case 17:
                p020c0.InterfaceC1691l0 interfaceC1691l0 = (p020c0.InterfaceC1691l0) obj;
                p020c0.f1 f1Var = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f15955b;
                interfaceC1691l0.getClass();
                if (((android.content.Context) p020c0.AbstractC1703s.C(interfaceC1691l0, f1Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return x.AbstractC3038e.f30871b;
                }
                x.InterfaceC3034c.f30856a.getClass();
                return x.C3032b.f30852c;
            case 18:
                return java.lang.Boolean.valueOf(!false);
            case 19:
                S4.C0867f it8 = (S4.C0867f) obj;
                kotlin.jvm.internal.m.e(it8, "it");
                return java.lang.Integer.valueOf(it8.f9387a.f20657d);
            case 20:
                p005a5.j9 it9 = (p005a5.j9) obj;
                kotlin.jvm.internal.m.e(it9, "it");
                return it9.f14675a;
            case 21:
                java.lang.String it10 = (java.lang.String) obj;
                kotlin.jvm.internal.m.e(it10, "it");
                return it10;
            case 22:
                com.kiptv.core.model.EPGProgram it11 = (com.kiptv.core.model.EPGProgram) obj;
                kotlin.jvm.internal.m.e(it11, "it");
                return it11.f19738a;
            case 23:
                com.kiptv.core.model.XtreamCategory it12 = (com.kiptv.core.model.XtreamCategory) obj;
                kotlin.jvm.internal.m.e(it12, "it");
                return it12.f20649a;
            case 24:
                p188x0.L graphicsLayer2 = (p188x0.L) obj;
                kotlin.jvm.internal.m.e(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.h(1);
                graphicsLayer2.b(0.72f);
                return a2;
            case 25:
                p171u0.c drawWithCache = (p171u0.c) obj;
                kotlin.jvm.internal.m.e(drawWithCache, "$this$drawWithCache");
                if (drawWithCache.f28652h.getLayoutDirection() == p113n1.n.f25567i) {
                    java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
                    long j = p188x0.C3098s.f31123b;
                    dF = q2.i.f(new p070h6.k[]{new p070h6.k(fValueOf, new p188x0.C3098s(j)), new p070h6.k(java.lang.Float.valueOf(0.48000002f), new p188x0.C3098s(j)), new p070h6.k(java.lang.Float.valueOf(1.0f), new p188x0.C3098s(p188x0.C3098s.f31127f))});
                } else {
                    p070h6.k kVar = new p070h6.k(java.lang.Float.valueOf(0.0f), new p188x0.C3098s(p188x0.C3098s.f31127f));
                    java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.52f);
                    long j9 = p188x0.C3098s.f31123b;
                    dF = q2.i.f(new p070h6.k[]{kVar, new p070h6.k(fValueOf2, new p188x0.C3098s(j9)), new p070h6.k(java.lang.Float.valueOf(1.0f), new p188x0.C3098s(j9))});
                }
                return drawWithCache.a(new v5.E(dF, i3));
            case 26:
                return java.lang.Integer.valueOf(((S4.p) obj).f9429a);
            case 27:
                return (S4.p) ((p070h6.k) obj).f22540i;
            case 28:
                p020c0.I DisposableEffect = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                return new y5.A();
            default:
                com.kiptv.core.model.TMDBSearchResult it13 = (com.kiptv.core.model.TMDBSearchResult) obj;
                kotlin.jvm.internal.m.e(it13, "it");
                return java.lang.Integer.valueOf(it13.f20292a);
        }
    }
}
