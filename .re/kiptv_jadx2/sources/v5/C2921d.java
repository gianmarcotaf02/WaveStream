package v5;

import S4.C0867f;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.common.util.concurrent.AbstractC1903s;
import com.kiptv.core.model.EPGProgram;
import com.kiptv.core.model.TMDBCastMember;
import com.kiptv.core.model.TMDBGenre;
import com.kiptv.core.model.TMDBSearchResult;
import com.kiptv.core.model.XtreamCategory;
import com.kiptv.core.model.XtreamLiveStream;
import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import p005a5.j9;
import p020c0.AbstractC1703s;
import p020c0.InterfaceC1691l0;
import p020c0.f1;
import p186w5.C2985h0;
import p188x0.C3098s;
import t5.C2828p0;
import x.AbstractC3038e;
import x.C3032b;
import x.InterfaceC3034c;

public final class C2921d implements p194x6.j {

    public final int f29424h;

    public C2921d(int i3) {
        this.f29424h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        p188x0.D dF;
        p070h6.A a2 = p070h6.A.f22523a;
        int i3 = 1;
        switch (this.f29424h) {
            case 0:
                TMDBCastMember it = (TMDBCastMember) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return Integer.valueOf(it.f20122a);
            case 1:
                TMDBGenre it2 = (TMDBGenre) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.f20179b;
            case 2:
                ((Integer) obj).getClass();
                float f9 = AbstractC2930h0.f29480a;
                return a2;
            case 3:
                p188x0.L graphicsLayer = (p188x0.L) obj;
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.h(1);
                return a2;
            case 4:
                kotlin.jvm.internal.m.e((XtreamCategory) obj, "it");
                return a2;
            case 5:
                return Integer.valueOf(((S4.p) obj).f9429a);
            case 6:
                return (S4.p) ((p070h6.k) obj).f22540i;
            case 7:
                p005a5.Q it3 = (p005a5.Q) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return it3.f13800e;
            case 8:
                D.j LazyRow = (D.j) obj;
                kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                ArrayList arrayList = new ArrayList(6);
                for (int i9 = 0; i9 < 6; i9++) {
                    arrayList.add(Integer.valueOf(i9));
                }
                LazyRow.q(arrayList.size(), null, new C5.N(4, arrayList), new p089k0.e(2039820996, new C2828p0(i3, arrayList), true));
                return a2;
            case 9:
                C2985h0 row = (C2985h0) obj;
                kotlin.jvm.internal.m.e(row, "row");
                return row.f30235a;
            case 10:
                Map.Entry it4 = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                return it4.getKey() + "=" + it4.getValue();
            case 11:
                XtreamLiveStream it5 = (XtreamLiveStream) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                Date dateD = AbstractC1903s.D(it5.g);
                if (dateD != null) {
                    return Long.valueOf(dateD.getTime());
                }
                return null;
            case 12:
                XtreamVODStream it6 = (XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                Date dateD2 = AbstractC1903s.D(it6.f20730k);
                if (dateD2 != null) {
                    return Long.valueOf(dateD2.getTime());
                }
                return null;
            case 13:
                XtreamSeries it7 = (XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it7, "it");
                Date dateB = it7.b();
                if (dateB != null) {
                    return Long.valueOf(dateB.getTime());
                }
                return null;
            case 14:
                Date dateD3 = AbstractC1903s.D(((XtreamVODStream) obj).f20730k);
                return Long.valueOf(dateD3 != null ? dateD3.getTime() : 0L);
            case 15:
                Date dateB2 = ((XtreamSeries) obj).b();
                return Long.valueOf(dateB2 != null ? dateB2.getTime() : 0L);
            case 16:
                Date dateD4 = AbstractC1903s.D(((XtreamLiveStream) obj).g);
                return Long.valueOf(dateD4 != null ? dateD4.getTime() : 0L);
            case 17:
                InterfaceC1691l0 interfaceC1691l0 = (InterfaceC1691l0) obj;
                f1 f1Var = AndroidCompositionLocals_androidKt.f15955b;
                interfaceC1691l0.getClass();
                if (((Context) AbstractC1703s.C(interfaceC1691l0, f1Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC3038e.f30871b;
                }
                InterfaceC3034c.f30856a.getClass();
                return C3032b.f30852c;
            case 18:
                return Boolean.valueOf(!false);
            case 19:
                C0867f it8 = (C0867f) obj;
                kotlin.jvm.internal.m.e(it8, "it");
                return Integer.valueOf(it8.f9387a.f20657d);
            case 20:
                j9 it9 = (j9) obj;
                kotlin.jvm.internal.m.e(it9, "it");
                return it9.f14675a;
            case 21:
                String it10 = (String) obj;
                kotlin.jvm.internal.m.e(it10, "it");
                return it10;
            case 22:
                EPGProgram it11 = (EPGProgram) obj;
                kotlin.jvm.internal.m.e(it11, "it");
                return it11.f19738a;
            case 23:
                XtreamCategory it12 = (XtreamCategory) obj;
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
                    Float fValueOf = Float.valueOf(0.0f);
                    long j = C3098s.f31123b;
                    dF = q2.i.f(new p070h6.k[]{new p070h6.k(fValueOf, new C3098s(j)), new p070h6.k(Float.valueOf(0.48000002f), new C3098s(j)), new p070h6.k(Float.valueOf(1.0f), new C3098s(C3098s.f31127f))});
                } else {
                    p070h6.k kVar = new p070h6.k(Float.valueOf(0.0f), new C3098s(C3098s.f31127f));
                    Float fValueOf2 = Float.valueOf(0.52f);
                    long j9 = C3098s.f31123b;
                    dF = q2.i.f(new p070h6.k[]{kVar, new p070h6.k(fValueOf2, new C3098s(j9)), new p070h6.k(Float.valueOf(1.0f), new C3098s(j9))});
                }
                return drawWithCache.a(new E(dF, i3));
            case 26:
                return Integer.valueOf(((S4.p) obj).f9429a);
            case 27:
                return (S4.p) ((p070h6.k) obj).f22540i;
            case 28:
                p020c0.I DisposableEffect = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                return new y5.A();
            default:
                TMDBSearchResult it13 = (TMDBSearchResult) obj;
                kotlin.jvm.internal.m.e(it13, "it");
                return Integer.valueOf(it13.f20292a);
        }
    }
}
