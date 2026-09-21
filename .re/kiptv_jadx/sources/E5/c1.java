package E5;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c1 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3009h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f3010i;

    public /* synthetic */ c1(int i3, kotlin.jvm.functions.Function0 function0) {
        this.f3009h = i3;
        this.f3010i = function0;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object it) {
        switch (this.f3009h) {
            case 0:
                p203z0.d Canvas = (p203z0.d) it;
                kotlin.jvm.internal.m.e(Canvas, "$this$Canvas");
                float fFloatValue = ((java.lang.Number) this.f3010i.invoke()).floatValue();
                if (fFloatValue > 0.0f) {
                    float fY = Canvas.Y(3);
                    float fY2 = Canvas.Y(E5.j1.f3078d) - fY;
                    if (fY2 < 0.0f) {
                        fY2 = 0.0f;
                    }
                    p188x0.C3088h c3088hA = p188x0.AbstractC3091k.a();
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (Canvas.d() >> 32)) - fY;
                    float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (Canvas.d() & 4294967295L)) - fY;
                    long jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fY2)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fY2)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))) & 4294967295L);
                    p188x0.C3088h.b(c3088hA, new p181w0.c(fY, fY, fIntBitsToFloat, fIntBitsToFloat2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2));
                    android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure();
                    pathMeasure.setPath(c3088hA.f31111a, false);
                    float length = pathMeasure.getLength();
                    if (length > 0.0f) {
                        p188x0.C3088h c3088hA2 = p188x0.AbstractC3091k.a();
                        pathMeasure.getSegment(0.0f, length * fFloatValue, c3088hA2.f31111a, true);
                        Canvas.w0(c3088hA2, p060g5.a.c(), 1.0f, new p203z0.g(fY, 0.0f, 1, 0, null, 26));
                    }
                }
                return p070h6.A.f22523a;
            case 1:
                if (((java.lang.Boolean) it).booleanValue()) {
                    this.f3010i.invoke();
                }
                return p070h6.A.f22523a;
            case 2:
                kotlin.jvm.internal.m.e(it, "it");
                return this.f3010i.invoke();
            case 3:
                return (p181w0.a) this.f3010i.invoke();
            case 4:
                return io.ktor.util.collections.ConcurrentMap.computeIfAbsent$lambda$0(this.f3010i, it);
            case 5:
                return io.ktor.utils.io.ByteWriteChannelOperationsKt.invokeOnCompletion$lambda$0(this.f3010i, (java.lang.Throwable) it);
            default:
                p175v0.C it2 = (p175v0.C) it;
                kotlin.jvm.internal.m.e(it2, "it");
                if (((p175v0.D) it2).a()) {
                    this.f3010i.invoke();
                }
                return p070h6.A.f22523a;
        }
    }
}
