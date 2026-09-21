package B5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB5/y;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class y extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1451x5 f805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.B3 f806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E2.d f807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.String f809f;
    public final V7.n0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.W f810h;

    public y(E2.d dVar, p005a5.B3 searchRepository, p005a5.C1451x5 tmdbRepository, androidx.lifecycle.U savedStateHandle, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f805b = tmdbRepository;
        this.f806c = searchRepository;
        this.f807d = dVar;
        java.lang.Object objA = savedStateHandle.a("personId");
        if (objA == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        this.f808e = ((java.lang.Number) objA).intValue();
        p078i6.w wVar = p078i6.w.f23205h;
        V7.n0 n0VarB = V7.r.b(new B5.z(true, null, wVar, wVar, null, "https://image.tmdb.org/t/p"));
        this.g = n0VarB;
        this.f810h = new V7.W(n0VarB);
        S7.C.A(androidx.lifecycle.X.h(this), null, new B5.x(this, null), 3);
    }

    public static final double e(B5.y yVar, com.kiptv.core.model.TMDBPersonCreditEntry tMDBPersonCreditEntry) {
        yVar.getClass();
        java.lang.Double d4 = tMDBPersonCreditEntry.f20230k;
        double dDoubleValue = d4 != null ? d4.doubleValue() : 0.0d;
        java.lang.Double d6 = tMDBPersonCreditEntry.f20228h;
        double dDoubleValue2 = d6 != null ? d6.doubleValue() : 0.0d;
        if (dDoubleValue2 <= 0.0d) {
            dDoubleValue2 = 1.0d;
        }
        return dDoubleValue * dDoubleValue2;
    }

    public final E8.l f(int i3, boolean z6) {
        B5.b bVar = B5.b.f737r;
        p005a5.B3 b9 = this.f806c;
        if (z6) {
            com.kiptv.core.model.XtreamVODStream xtreamVODStreamI = b9.i(i3);
            if (xtreamVODStreamI != null) {
                return new B5.a(xtreamVODStreamI.f20725d);
            }
        } else {
            com.kiptv.core.model.XtreamSeries xtreamSeriesJ = b9.j(i3);
            if (xtreamSeriesJ != null) {
                return new B5.c(xtreamSeriesJ.f20684c);
            }
        }
        return bVar;
    }
}
