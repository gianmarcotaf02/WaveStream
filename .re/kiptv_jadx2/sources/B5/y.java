package B5;

import S7.C;
import V7.W;
import V7.n0;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.e0;
import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.TMDBPersonCreditEntry;
import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;
import kotlin.Metadata;
import p005a5.B3;
import p005a5.C1451x5;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LB5/y;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class y extends e0 {

    public final C1451x5 f805b;

    public final B3 f806c;

    public final E2.d f807d;

    public final int f808e;

    public String f809f;
    public final n0 g;

    public final W f810h;

    public y(E2.d dVar, B3 searchRepository, C1451x5 tmdbRepository, U savedStateHandle, p132p5.a appConfig) {
        kotlin.jvm.internal.m.e(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.m.e(tmdbRepository, "tmdbRepository");
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f805b = tmdbRepository;
        this.f806c = searchRepository;
        this.f807d = dVar;
        Object objA = savedStateHandle.a("personId");
        if (objA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f808e = ((Number) objA).intValue();
        p078i6.w wVar = p078i6.w.f23205h;
        n0 n0VarB = V7.r.b(new z(true, null, wVar, wVar, null, "https://image.tmdb.org/t/p"));
        this.g = n0VarB;
        this.f810h = new W(n0VarB);
        C.A(X.h(this), null, new x(this, null), 3);
    }

    public static final double e(y yVar, TMDBPersonCreditEntry tMDBPersonCreditEntry) {
        yVar.getClass();
        Double d4 = tMDBPersonCreditEntry.f20230k;
        double dDoubleValue = d4 != null ? d4.doubleValue() : 0.0d;
        Double d6 = tMDBPersonCreditEntry.f20228h;
        double dDoubleValue2 = d6 != null ? d6.doubleValue() : 0.0d;
        if (dDoubleValue2 <= 0.0d) {
            dDoubleValue2 = 1.0d;
        }
        return dDoubleValue * dDoubleValue2;
    }

    public final E8.l f(int i3, boolean z6) {
        b bVar = b.f737r;
        B3 b9 = this.f806c;
        if (z6) {
            XtreamVODStream xtreamVODStreamI = b9.i(i3);
            if (xtreamVODStreamI != null) {
                return new a(xtreamVODStreamI.f20725d);
            }
        } else {
            XtreamSeries xtreamSeriesJ = b9.j(i3);
            if (xtreamSeriesJ != null) {
                return new c(xtreamSeriesJ.f20684c);
            }
        }
        return bVar;
    }
}
