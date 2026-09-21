package p186w5;

/* JADX INFO: renamed from: w5.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3003q0 implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p186w5.C3003q0 f30373i = new p186w5.C3003q0(0);
    public static final p186w5.C3003q0 j = new p186w5.C3003q0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p186w5.C3003q0 f30374k = new p186w5.C3003q0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p186w5.C3003q0 f30375l = new p186w5.C3003q0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p186w5.C3003q0 f30376m = new p186w5.C3003q0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p186w5.C3003q0 f30377n = new p186w5.C3003q0(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p186w5.C3003q0 f30378o = new p186w5.C3003q0(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p186w5.C3003q0 f30379p = new p186w5.C3003q0(7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p186w5.C3003q0 f30380q = new p186w5.C3003q0(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p186w5.C3003q0 f30381r = new p186w5.C3003q0(9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p186w5.C3003q0 f30382s = new p186w5.C3003q0(10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p186w5.C3003q0 f30383t = new p186w5.C3003q0(11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p186w5.C3003q0 f30384u = new p186w5.C3003q0(12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p186w5.C3003q0 f30385v = new p186w5.C3003q0(13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p186w5.C3003q0 f30386w = new p186w5.C3003q0(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f30387h;

    public /* synthetic */ C3003q0(int i3) {
        this.f30387h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String strA;
        switch (this.f30387h) {
            case 0:
                com.kiptv.core.model.XtreamSeries it = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return it.c();
            case 1:
                com.kiptv.core.model.XtreamSeries it2 = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.f20683b;
            case 2:
                p186w5.InterfaceC2984h it3 = (p186w5.InterfaceC2984h) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return it3.getKey();
            case 3:
                p186w5.InterfaceC2984h it4 = (p186w5.InterfaceC2984h) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                return it4.a();
            case 4:
                p186w5.InterfaceC2984h it5 = (p186w5.InterfaceC2984h) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                return it5.getTitle();
            case 5:
                com.kiptv.core.model.XtreamVODStream it6 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                return java.lang.Integer.valueOf(it6.f20725d);
            case 6:
                com.kiptv.core.model.TMDBSearchResult it7 = (com.kiptv.core.model.TMDBSearchResult) obj;
                kotlin.jvm.internal.m.e(it7, "it");
                return java.lang.Integer.valueOf(it7.f20292a);
            case 7:
                com.kiptv.core.model.TMDBSearchResult it8 = (com.kiptv.core.model.TMDBSearchResult) obj;
                kotlin.jvm.internal.m.e(it8, "it");
                java.lang.String str = it8.g;
                if (str != null) {
                    return O7.x.x0(str, "http", false) ? str : "https://image.tmdb.org/t/p/w500".concat(str);
                }
                return null;
            case 8:
                com.kiptv.core.model.TMDBSearchResult it9 = (com.kiptv.core.model.TMDBSearchResult) obj;
                kotlin.jvm.internal.m.e(it9, "it");
                return it9.a();
            case 9:
                com.kiptv.core.model.XtreamVODStream it10 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it10, "it");
                return it10.a();
            case 10:
                p005a5.Q it11 = (p005a5.Q) obj;
                kotlin.jvm.internal.m.e(it11, "it");
                return it11.f13800e;
            case 11:
                p005a5.Q item = (p005a5.Q) obj;
                kotlin.jvm.internal.m.e(item, "item");
                com.kiptv.core.model.XtreamVODStream xtreamVODStream = item.f13798c;
                if (xtreamVODStream != null && (strA = xtreamVODStream.a()) != null) {
                    return strA;
                }
                com.kiptv.core.model.XtreamSeries xtreamSeries = item.f13799d;
                java.lang.String strC = xtreamSeries != null ? xtreamSeries.c() : null;
                if (strC != null) {
                    return strC;
                }
                java.lang.String str2 = item.f13796a.g;
                if (str2 != null) {
                    return O7.x.x0(str2, "http", false) ? str2 : "https://image.tmdb.org/t/p/w500".concat(str2);
                }
                return null;
            case 12:
                p005a5.Q it12 = (p005a5.Q) obj;
                kotlin.jvm.internal.m.e(it12, "it");
                return it12.f13796a.a();
            case 13:
                com.kiptv.core.model.XtreamVODStream it13 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it13, "it");
                return it13.f20723b;
            default:
                com.kiptv.core.model.XtreamSeries it14 = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it14, "it");
                return java.lang.Integer.valueOf(it14.f20684c);
        }
    }
}
