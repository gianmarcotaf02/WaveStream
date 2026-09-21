package J;

/* JADX INFO: renamed from: J.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0535b implements p194x6.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5751h;

    public /* synthetic */ C0535b(int i3) {
        this.f5751h = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        p137q0.m mVar = p137q0.m.f26474b;
        p070h6.A a2 = p070h6.A.f22523a;
        java.lang.Object[] objArr = 0;
        switch (this.f5751h) {
            case 0:
                p137q0.p pVar = (p137q0.p) obj;
                p020c0.C1700q c1700q = (p020c0.C1700q) obj2;
                ((java.lang.Integer) obj3).getClass();
                c1700q.c0(-2126899193);
                long j = ((U.s0) c1700q.j(U.t0.f10081a)).f10079a;
                boolean zE = c1700q.e(j);
                java.lang.Object objQ = c1700q.Q();
                if (zE || objQ == p020c0.C1690l.f18284a) {
                    objQ = new J.C0537c(j, objArr == true ? 1 : 0);
                    c1700q.n0(objQ);
                }
                p137q0.p pVarD = pVar.d(p171u0.f.e(mVar, (p194x6.j) objQ));
                c1700q.p(false);
                return pVarD;
            case 1:
                p194x6.m mVar2 = (p194x6.m) obj;
                p020c0.C1700q c1700q2 = (p020c0.C1700q) obj2;
                int iIntValue = ((java.lang.Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1700q2.h(mVar2) ? 4 : 2;
                }
                if (c1700q2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    mVar2.invoke(c1700q2, java.lang.Integer.valueOf(iIntValue & 14));
                } else {
                    c1700q2.W();
                }
                return a2;
            case 2:
                return java.lang.Boolean.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.noRetry$lambda$1((io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequest) obj2, (io.ktor.client.statement.HttpResponse) obj3));
            case 3:
                return java.lang.Boolean.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.noRetry$lambda$2((io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequestBuilder) obj2, (java.lang.Throwable) obj3));
            case 4:
                return java.lang.Boolean.valueOf(io.ktor.client.plugins.HttpRequestRetryConfig.retryOnServerErrors$lambda$5((io.ktor.client.plugins.HttpRetryShouldRetryContext) obj, (io.ktor.client.request.HttpRequest) obj2, (io.ktor.client.statement.HttpResponse) obj3));
            case 5:
                O0.U layout = (O0.U) obj;
                O0.Q measurable = (O0.Q) obj2;
                p113n1.a aVar = (p113n1.a) obj3;
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                kotlin.jvm.internal.m.e(measurable, "measurable");
                O0.g0 g0VarC = measurable.C(p113n1.b.a(0, p113n1.a.g(aVar.f25547a), 0, p113n1.a.h(aVar.f25547a)));
                return layout.q0(g0VarC.f7640i, g0VarC.f7639h, p078i6.x.f23206h, new B.C0073k(g0VarC, 10));
            case 6:
                ((java.lang.Integer) obj).getClass();
                ((java.lang.Long) obj2).getClass();
                ((java.lang.Long) obj3).getClass();
                float f9 = v5.AbstractC2930h0.f29480a;
                return a2;
            default:
                w.c cVar = (w.c) obj;
                p020c0.C1700q c1700q3 = (p020c0.C1700q) obj2;
                int iIntValue2 = ((java.lang.Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1700q3.f(cVar) ? 4 : 2;
                }
                if (c1700q3.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    B.AbstractC0079q.a(v.AbstractC2901v.f(androidx.compose.foundation.layout.b.g(androidx.compose.foundation.layout.b.e(B.AbstractC0065c.p(mVar, 0.0f, w.e.f29731l, 1), 1.0f), w.e.f29730k), cVar.f29718c, p188x0.z.f31141b), c1700q3, 0);
                } else {
                    c1700q3.W();
                }
                return a2;
        }
    }
}
