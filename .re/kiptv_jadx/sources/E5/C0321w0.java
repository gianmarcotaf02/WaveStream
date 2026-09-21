package E5;

/* JADX INFO: renamed from: E5.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0321w0 implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3175h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f3176i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ C0321w0(long j, p034d5.c cVar) {
        this.f3176i = j;
        this.j = cVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2 = this.j;
        switch (this.f3175h) {
            case 0:
                p203z0.d drawBehind = (p203z0.d) obj;
                kotlin.jvm.internal.m.e(drawBehind, "$this$drawBehind");
                p113n1.c cVar = (p113n1.c) obj2;
                float fY = cVar.Y((float) 1.5d);
                p203z0.d.r(drawBehind, this.f3176i, (p181w0.d.c(drawBehind.d()) - fY) / 2.0f, (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (drawBehind.d() >> 32)) / 2.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) / 2.0f)) & 4294967295L), new p203z0.g(fY, 0.0f, 0, 0, new p188x0.C3089i(new android.graphics.DashPathEffect(new float[]{cVar.Y(6), cVar.Y(4)}, 0.0f)), 14), 104);
                return p070h6.A.f22523a;
            default:
                return java.lang.Boolean.valueOf(this.f3176i - ((java.lang.Long) obj).longValue() >= ((p034d5.c) obj2).f21239b);
        }
    }

    public /* synthetic */ C0321w0(long j, p113n1.c cVar) {
        this.j = cVar;
        this.f3176i = j;
    }
}
