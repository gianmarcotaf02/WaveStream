package E5;

import android.graphics.DashPathEffect;
import p188x0.C3089i;

public final class C0321w0 implements p194x6.j {

    public final int f3175h = 1;

    public final long f3176i;
    public final Object j;

    public C0321w0(long j, p034d5.c cVar) {
        this.f3176i = j;
        this.j = cVar;
    }

    @Override
    public final Object invoke(Object obj) {
        Object obj2 = this.j;
        switch (this.f3175h) {
            case 0:
                p203z0.d drawBehind = (p203z0.d) obj;
                kotlin.jvm.internal.m.e(drawBehind, "$this$drawBehind");
                p113n1.c cVar = (p113n1.c) obj2;
                float fY = cVar.Y((float) 1.5d);
                p203z0.d.r(drawBehind, this.f3176i, (p181w0.d.c(drawBehind.d()) - fY) / 2.0f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.d() & 4294967295L)) / 2.0f)) & 4294967295L), new p203z0.g(fY, 0.0f, 0, 0, new C3089i(new DashPathEffect(new float[]{cVar.Y(6), cVar.Y(4)}, 0.0f)), 14), 104);
                return p070h6.A.f22523a;
            default:
                return Boolean.valueOf(this.f3176i - ((Long) obj).longValue() >= ((p034d5.c) obj2).f21239b);
        }
    }

    public C0321w0(long j, p113n1.c cVar) {
        this.j = cVar;
        this.f3176i = j;
    }
}
