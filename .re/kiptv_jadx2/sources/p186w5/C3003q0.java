package p186w5;

import O7.x;
import com.kiptv.core.model.TMDBSearchResult;
import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;
import kotlin.jvm.internal.m;
import p005a5.Q;
import p194x6.j;

public final class C3003q0 implements j {

    public static final C3003q0 f30373i = new C3003q0(0);
    public static final C3003q0 j = new C3003q0(1);

    public static final C3003q0 f30374k = new C3003q0(2);

    public static final C3003q0 f30375l = new C3003q0(3);

    public static final C3003q0 f30376m = new C3003q0(4);

    public static final C3003q0 f30377n = new C3003q0(5);

    public static final C3003q0 f30378o = new C3003q0(6);

    public static final C3003q0 f30379p = new C3003q0(7);

    public static final C3003q0 f30380q = new C3003q0(8);

    public static final C3003q0 f30381r = new C3003q0(9);

    public static final C3003q0 f30382s = new C3003q0(10);

    public static final C3003q0 f30383t = new C3003q0(11);

    public static final C3003q0 f30384u = new C3003q0(12);

    public static final C3003q0 f30385v = new C3003q0(13);

    public static final C3003q0 f30386w = new C3003q0(14);

    public final int f30387h;

    public C3003q0(int i3) {
        this.f30387h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        String strA;
        switch (this.f30387h) {
            case 0:
                XtreamSeries it = (XtreamSeries) obj;
                m.e(it, "it");
                return it.c();
            case 1:
                XtreamSeries it2 = (XtreamSeries) obj;
                m.e(it2, "it");
                return it2.f20683b;
            case 2:
                InterfaceC2984h it3 = (InterfaceC2984h) obj;
                m.e(it3, "it");
                return it3.getKey();
            case 3:
                InterfaceC2984h it4 = (InterfaceC2984h) obj;
                m.e(it4, "it");
                return it4.a();
            case 4:
                InterfaceC2984h it5 = (InterfaceC2984h) obj;
                m.e(it5, "it");
                return it5.getTitle();
            case 5:
                XtreamVODStream it6 = (XtreamVODStream) obj;
                m.e(it6, "it");
                return Integer.valueOf(it6.f20725d);
            case 6:
                TMDBSearchResult it7 = (TMDBSearchResult) obj;
                m.e(it7, "it");
                return Integer.valueOf(it7.f20292a);
            case 7:
                TMDBSearchResult it8 = (TMDBSearchResult) obj;
                m.e(it8, "it");
                String str = it8.g;
                if (str != null) {
                    return x.x0(str, "http", false) ? str : "https://image.tmdb.org/t/p/w500".concat(str);
                }
                return null;
            case 8:
                TMDBSearchResult it9 = (TMDBSearchResult) obj;
                m.e(it9, "it");
                return it9.a();
            case 9:
                XtreamVODStream it10 = (XtreamVODStream) obj;
                m.e(it10, "it");
                return it10.a();
            case 10:
                Q it11 = (Q) obj;
                m.e(it11, "it");
                return it11.f13800e;
            case 11:
                Q item = (Q) obj;
                m.e(item, "item");
                XtreamVODStream xtreamVODStream = item.f13798c;
                if (xtreamVODStream != null && (strA = xtreamVODStream.a()) != null) {
                    return strA;
                }
                XtreamSeries xtreamSeries = item.f13799d;
                String strC = xtreamSeries != null ? xtreamSeries.c() : null;
                if (strC != null) {
                    return strC;
                }
                String str2 = item.f13796a.g;
                if (str2 != null) {
                    return x.x0(str2, "http", false) ? str2 : "https://image.tmdb.org/t/p/w500".concat(str2);
                }
                return null;
            case 12:
                Q it12 = (Q) obj;
                m.e(it12, "it");
                return it12.f13796a.a();
            case 13:
                XtreamVODStream it13 = (XtreamVODStream) obj;
                m.e(it13, "it");
                return it13.f20723b;
            default:
                XtreamSeries it14 = (XtreamSeries) obj;
                m.e(it14, "it");
                return Integer.valueOf(it14.f20684c);
        }
    }
}
