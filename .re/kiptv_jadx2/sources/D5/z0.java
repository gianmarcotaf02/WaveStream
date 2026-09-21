package D5;

public final class z0 implements p194x6.j {

    public final int f2449h;

    public final float f2450i;
    public final float j;

    public z0(float f9, float f10, int i3) {
        this.f2449h = i3;
        this.f2450i = f9;
        this.j = f10;
    }

    @Override
    public final Object invoke(Object obj) {
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
