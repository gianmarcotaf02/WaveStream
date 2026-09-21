package D5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2450i;
    public final /* synthetic */ float j;

    public /* synthetic */ z0(float f9, float f10, int i3) {
        this.f2449h = i3;
        this.f2450i = f9;
        this.j = f10;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p188x0.L graphicsLayer = (p188x0.L) obj;
        switch (this.f2449h) {
            case 0:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                float f9 = this.f2450i;
                graphicsLayer.k(f9);
                graphicsLayer.n(f9);
                graphicsLayer.b(this.j);
                break;
            default:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.C(this.f2450i + this.j);
                break;
        }
        return p070h6.A.f22523a;
    }
}
