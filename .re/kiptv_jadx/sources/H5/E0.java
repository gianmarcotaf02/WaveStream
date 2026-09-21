package H5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LH5/E0;", "Landroidx/lifecycle/e0;", "Companion", "H5/p0", "H5/o0", "H5/n0", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class E0 extends androidx.lifecycle.e0 {
    private static final H5.n0 Companion = new H5.n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.B3 f4063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.J2 f4064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.Z1 f4065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p005a5.C1366p f4066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p005a5.C1291h4 f4067f;
    public final E2.d g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.String f4068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.n0 f4069i;
    public final V7.n0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.n0 f4070k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.n0 f4071l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.n0 f4072m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public S7.w0 f4073n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public S7.w0 f4074o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f4075p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V7.W f4076q;

    public E0(p005a5.B3 searchRepository, p005a5.J2 searchHistoryRepository, p005a5.Z1 posterFallbackResolver, p005a5.C1366p contentCacheRepository, p005a5.C1291h4 settingsRepository, E2.d dVar, p132p5.a appConfig) {
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
        V7.n0 n0VarB2 = V7.r.b(new H5.p0());
        this.j = n0VarB2;
        V7.n0 n0VarB3 = V7.r.b(java.lang.Boolean.FALSE);
        this.f4070k = n0VarB3;
        H5.M m8 = H5.M.f4111h;
        V7.n0 n0VarB4 = V7.r.b(m8);
        this.f4071l = n0VarB4;
        p078i6.x xVar = p078i6.x.f23206h;
        V7.n0 n0VarB5 = V7.r.b(xVar);
        this.f4072m = n0VarB5;
        this.f4075p = "https://image.tmdb.org/t/p";
        p100l6.c cVar = null;
        V7.Q qI = V7.r.i(V7.r.i(n0VarB, n0VarB2, n0VarB3, n0VarB4, new H5.B0(5, cVar, i3)), new V4.I(searchRepository.j, searchRepository.f13183l, new H5.C0(3, null)), searchHistoryRepository.f13540f, n0VarB5, new H5.D0(this, null));
        p057g2.a aVarH = androidx.lifecycle.X.h(this);
        V7.k0 k0VarA = V7.d0.a(2);
        p078i6.w wVar = p078i6.w.f23205h;
        this.f4076q = V7.r.u(qI, aVarH, k0VarA, new H5.k0("", false, 0.0f, false, wVar, wVar, wVar, xVar, wVar, wVar, wVar, m8, "https://image.tmdb.org/t/p", xVar, xVar, wVar));
        V7.InterfaceC0981g interfaceC0981gL = V7.r.l(V7.r.k(n0VarB, 900L));
        H5.z0 z0Var = new H5.z0(i3, this, cVar);
        int i9 = V7.D.f10376a;
        V7.r.s(new V7.C0999z(new W7.n(z0Var, interfaceC0981gL, p100l6.i.f24820h, -2, U7.EnumC0955c.f10175h), new H5.m0(this, null), 1), androidx.lifecycle.X.h(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final java.lang.Object e(H5.E0 e6, java.lang.String query, p117n6.c cVar) {
        H5.r0 r0Var;
        e6.getClass();
        if (cVar instanceof H5.r0) {
            r0Var = (H5.r0) cVar;
            int i3 = r0Var.f4298l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r0Var.f4298l = i3 - Integer.MIN_VALUE;
            } else {
                r0Var = new H5.r0(e6, cVar);
            }
        } else {
            r0Var = new H5.r0(e6, cVar);
        }
        java.lang.Object objM = r0Var.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = r0Var.f4298l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objM);
                if (query.length() < 2) {
                    return new H5.p0();
                }
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                V7.n0 n0Var = e6.f4070k;
                n0Var.getClass();
                n0Var.i(null, bool);
                H5.y0 y0Var = new H5.y0(e6, query, null);
                r0Var.f4295h = e6;
                r0Var.f4296i = query;
                r0Var.f4298l = 1;
                objM = S7.C.m(y0Var, r0Var);
                if (objM == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                query = r0Var.f4296i;
                e6 = r0Var.f4295h;
                com.google.common.util.concurrent.P.u0(objM);
            }
            H5.p0 p0Var = (H5.p0) objM;
            if ((!p0Var.f4281a.isEmpty() || !p0Var.f4284d.isEmpty() || !p0Var.f4286f.isEmpty() || !p0Var.g.isEmpty() || !p0Var.f4287h.isEmpty()) && !e6.f4067f.g()) {
                p005a5.J2 j9 = e6.f4064c;
                j9.getClass();
                kotlin.jvm.internal.m.e(query, "query");
                java.lang.String string = O7.q.r1(query).toString();
                if (string.length() >= 2) {
                    S7.C.A(j9.f13538d, null, new p005a5.H2(j9, string, null), 3);
                }
            }
            V7.n0 n0Var2 = e6.f4070k;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            n0Var2.getClass();
            n0Var2.i(null, bool2);
            return p0Var;
        } catch (java.lang.Throwable th) {
            V7.n0 n0Var3 = e6.f4070k;
            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
            n0Var3.getClass();
            n0Var3.i(null, bool3);
            throw th;
        }
    }

    public final java.util.Map f() {
        java.util.Map map = (java.util.Map) ((V7.n0) this.f4066e.f14928x.f10419h).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            S4.p pVar = (S4.p) entry.getValue();
            java.util.List list = pVar.f9431c;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                com.kiptv.core.model.XtreamLiveStream xtreamLiveStream = ((S4.C0867f) obj).f9387a;
                p005a5.B3 b9 = this.f4063b;
                b9.getClass();
                if (p005a5.B3.l(xtreamLiveStream, b9.g(), (java.util.Map) ((V7.n0) b9.f13174a.f14929z.f10419h).getValue())) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            p070h6.k kVar = arrayList2 != null ? new p070h6.k(str, S4.p.a(pVar, ((S4.C0867f) p078i6.o.q1(arrayList2)).f9387a.f20657d, arrayList2)) : null;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return p078i6.C.X0(arrayList);
    }
}
