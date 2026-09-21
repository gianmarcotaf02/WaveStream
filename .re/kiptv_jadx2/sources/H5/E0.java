package H5;

import S4.C0867f;
import U7.EnumC0955c;
import V7.C0999z;
import V7.InterfaceC0981g;
import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.XtreamLiveStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p005a5.B3;
import p005a5.C1291h4;
import p005a5.C1366p;
import p005a5.H2;
import p005a5.J2;
import p005a5.Z1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LH5/E0;", "Landroidx/lifecycle/e0;", "Companion", "H5/p0", "H5/o0", "H5/n0", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class E0 extends androidx.lifecycle.e0 {
    private static final n0 Companion = new n0();

    public final B3 f4063b;

    public final J2 f4064c;

    public final Z1 f4065d;

    public final C1366p f4066e;

    public final C1291h4 f4067f;
    public final E2.d g;

    public String f4068h;

    public final V7.n0 f4069i;
    public final V7.n0 j;

    public final V7.n0 f4070k;

    public final V7.n0 f4071l;

    public final V7.n0 f4072m;

    public S7.w0 f4073n;

    public S7.w0 f4074o;

    public final String f4075p;

    public final V7.W f4076q;

    public E0(B3 searchRepository, J2 searchHistoryRepository, Z1 posterFallbackResolver, C1366p contentCacheRepository, C1291h4 settingsRepository, E2.d dVar, p132p5.a appConfig) {
        int i3 = 0;
        kotlin.jvm.internal.m.e(searchRepository, "searchRepository");
        kotlin.jvm.internal.m.e(searchHistoryRepository, "searchHistoryRepository");
        kotlin.jvm.internal.m.e(posterFallbackResolver, "posterFallbackResolver");
        kotlin.jvm.internal.m.e(contentCacheRepository, "contentCacheRepository");
        kotlin.jvm.internal.m.e(settingsRepository, "settingsRepository");
        kotlin.jvm.internal.m.e(appConfig, "appConfig");
        this.f4063b = searchRepository;
        this.f4064c = searchHistoryRepository;
        this.f4065d = posterFallbackResolver;
        this.f4066e = contentCacheRepository;
        this.f4067f = settingsRepository;
        this.g = dVar;
        V7.n0 n0VarB = V7.r.b("");
        this.f4069i = n0VarB;
        V7.n0 n0VarB2 = V7.r.b(new p0());
        this.j = n0VarB2;
        V7.n0 n0VarB3 = V7.r.b(Boolean.FALSE);
        this.f4070k = n0VarB3;
        M m8 = M.f4111h;
        V7.n0 n0VarB4 = V7.r.b(m8);
        this.f4071l = n0VarB4;
        p078i6.x xVar = p078i6.x.f23206h;
        V7.n0 n0VarB5 = V7.r.b(xVar);
        this.f4072m = n0VarB5;
        this.f4075p = "https://image.tmdb.org/t/p";
        p100l6.c cVar = null;
        V7.Q qI = V7.r.i(V7.r.i(n0VarB, n0VarB2, n0VarB3, n0VarB4, new B0(5, cVar, i3)), new V4.I(searchRepository.j, searchRepository.f13183l, new C0(3, null)), searchHistoryRepository.f13540f, n0VarB5, new D0(this, null));
        p057g2.a aVarH = androidx.lifecycle.X.h(this);
        V7.k0 k0VarA = V7.d0.a(2);
        p078i6.w wVar = p078i6.w.f23205h;
        this.f4076q = V7.r.u(qI, aVarH, k0VarA, new k0("", false, 0.0f, false, wVar, wVar, wVar, xVar, wVar, wVar, wVar, m8, "https://image.tmdb.org/t/p", xVar, xVar, wVar));
        InterfaceC0981g interfaceC0981gL = V7.r.l(V7.r.k(n0VarB, 900L));
        z0 z0Var = new z0(i3, this, cVar);
        int i9 = V7.D.f10376a;
        V7.r.s(new C0999z(new W7.n(z0Var, interfaceC0981gL, p100l6.i.f24820h, -2, EnumC0955c.f10175h), new m0(this, null), 1), androidx.lifecycle.X.h(this));
    }

    public static final Object e(E0 e6, String query, p117n6.c cVar) {
        r0 r0Var;
        e6.getClass();
        if (cVar instanceof r0) {
            r0Var = (r0) cVar;
            int i3 = r0Var.f4298l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r0Var.f4298l = i3 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(e6, cVar);
            }
        } else {
            r0Var = new r0(e6, cVar);
        }
        Object objM = r0Var.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = r0Var.f4298l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objM);
                if (query.length() < 2) {
                    return new p0();
                }
                Boolean bool = Boolean.TRUE;
                V7.n0 n0Var = e6.f4070k;
                n0Var.getClass();
                n0Var.i(null, bool);
                y0 y0Var = new y0(e6, query, null);
                r0Var.f4295h = e6;
                r0Var.f4296i = query;
                r0Var.f4298l = 1;
                objM = S7.C.m(y0Var, r0Var);
                if (objM == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                query = r0Var.f4296i;
                e6 = r0Var.f4295h;
                com.google.common.util.concurrent.P.u0(objM);
            }
            p0 p0Var = (p0) objM;
            if ((!p0Var.f4281a.isEmpty() || !p0Var.f4284d.isEmpty() || !p0Var.f4286f.isEmpty() || !p0Var.g.isEmpty() || !p0Var.f4287h.isEmpty()) && !e6.f4067f.g()) {
                J2 j9 = e6.f4064c;
                j9.getClass();
                kotlin.jvm.internal.m.e(query, "query");
                String string = O7.q.r1(query).toString();
                if (string.length() >= 2) {
                    S7.C.A(j9.f13538d, null, new H2(j9, string, null), 3);
                }
            }
            V7.n0 n0Var2 = e6.f4070k;
            Boolean bool2 = Boolean.FALSE;
            n0Var2.getClass();
            n0Var2.i(null, bool2);
            return p0Var;
        } catch (Throwable th) {
            V7.n0 n0Var3 = e6.f4070k;
            Boolean bool3 = Boolean.FALSE;
            n0Var3.getClass();
            n0Var3.i(null, bool3);
            throw th;
        }
    }

    public final Map f() {
        Map map = (Map) ((V7.n0) this.f4066e.f14928x.f10419h).getValue();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            S4.p pVar = (S4.p) entry.getValue();
            List list = pVar.f9431c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                XtreamLiveStream xtreamLiveStream = ((C0867f) obj).f9387a;
                B3 b9 = this.f4063b;
                b9.getClass();
                if (B3.l(xtreamLiveStream, b9.g(), (Map) ((V7.n0) b9.f13174a.f14929z.f10419h).getValue())) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            p070h6.k kVar = arrayList2 != null ? new p070h6.k(str, S4.p.a(pVar, ((C0867f) p078i6.o.q1(arrayList2)).f9387a.f20657d, arrayList2)) : null;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return p078i6.C.X0(arrayList);
    }
}
