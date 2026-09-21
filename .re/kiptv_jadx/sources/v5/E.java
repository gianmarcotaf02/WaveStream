package v5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class E implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f29212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p188x0.D f29213i;

    public /* synthetic */ E(p188x0.D d4, int i3) {
        this.f29212h = i3;
        this.f29213i = d4;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f29212h) {
            case 0:
                Q0.H drawWithContent = (Q0.H) obj;
                kotlin.jvm.internal.m.e(drawWithContent, "$this$drawWithContent");
                drawWithContent.a();
                p203z0.d.p0(drawWithContent, this.f29213i, 0L, 0L, 0.0f, null, 62);
                p203z0.d.p0(drawWithContent, q2.i.k(new p070h6.k[]{new p070h6.k(java.lang.Float.valueOf(0.55f), new p188x0.C3098s(p188x0.C3098s.f31123b)), new p070h6.k(java.lang.Float.valueOf(1.0f), new p188x0.C3098s(p188x0.C3098s.f31127f))}), 0L, 0L, 0.0f, null, 62);
                break;
            default:
                Q0.H onDrawWithContent = (Q0.H) obj;
                kotlin.jvm.internal.m.e(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.a();
                p203z0.d.u(onDrawWithContent, p188x0.C3098s.c(p188x0.C3098s.f31123b, 0.22f), 0L, 0L, 0.0f, 126);
                p203z0.d.p0(onDrawWithContent, this.f29213i, 0L, 0L, 0.0f, null, 62);
                break;
        }
        return p070h6.A.f22523a;
    }
}
