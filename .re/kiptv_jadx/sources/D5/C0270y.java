package D5;

/* JADX INFO: renamed from: D5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0270y implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f2444i;
    public final /* synthetic */ p020c0.e1 j;

    public /* synthetic */ C0270y(float f9, p020c0.e1 e1Var, int i3) {
        this.f2443h = i3;
        this.f2444i = f9;
        this.j = e1Var;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p188x0.L graphicsLayer = (p188x0.L) obj;
        switch (this.f2443h) {
            case 0:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                p020c0.e1 e1Var = this.j;
                graphicsLayer.b(((java.lang.Number) e1Var.getValue()).floatValue());
                graphicsLayer.D((1.0f - ((java.lang.Number) e1Var.getValue()).floatValue()) * this.f2444i);
                break;
            case 1:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.A(p188x0.z.h(0.0f, 1.0f));
                p020c0.e1 e1Var2 = this.j;
                float fFloatValue = (((java.lang.Number) e1Var2.getValue()).floatValue() * 2.2f) + 0.8f;
                float f9 = this.f2444i;
                graphicsLayer.j(fFloatValue * f9);
                float density = graphicsLayer.y.getDensity() * ((float) 2.5d);
                float density2 = graphicsLayer.y.getDensity();
                graphicsLayer.C(((((java.lang.Number) e1Var2.getValue()).floatValue() * density2 * ((float) 3.5d)) + density) * f9);
                graphicsLayer.D(graphicsLayer.y.getDensity() * ((float) 1.5d) * (-f9));
                break;
            default:
                kotlin.jvm.internal.m.e(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.C(graphicsLayer.y.getDensity() * ((((java.lang.Number) this.j.getValue()).floatValue() * 7.0f) + 2.0f) * this.f2444i);
                break;
        }
        return p070h6.A.f22523a;
    }
}
