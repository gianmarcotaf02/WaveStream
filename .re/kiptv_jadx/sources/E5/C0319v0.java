package E5;

/* JADX INFO: renamed from: E5.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0319v0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f3169i;

    public /* synthetic */ C0319v0(float f9, int i3) {
        this.f3168h = i3;
        this.f3169i = f9;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p188x0.L graphicsLayer = (p188x0.L) obj;
        switch (this.f3168h) {
            case 0:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                float f9 = this.f3169i;
                graphicsLayer.b(f9);
                float f10 = (f9 * 0.2f) + 0.8f;
                graphicsLayer.k(f10);
                graphicsLayer.n(f10);
                break;
            case 1:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                float f11 = this.f3169i;
                graphicsLayer.b(f11);
                float f12 = (f11 * 0.2f) + 0.8f;
                graphicsLayer.k(f12);
                graphicsLayer.n(f12);
                break;
            case 2:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.C(this.f3169i);
                break;
            default:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.C(this.f3169i);
                break;
        }
        return p070h6.A.f22523a;
    }
}
