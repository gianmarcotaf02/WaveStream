package p153r8;

import kotlin.jvm.internal.m;
import p070h6.w;
import p143q8.a;
import p143q8.b;

public final class y0 extends f0 {

    public static final y0 f27024c = new y0(z0.f27029a);

    @Override
    public final int d(Object obj) {
        long[] collectionSize = ((w) obj).f22554h;
        m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        x0 builder = (x0) obj;
        m.e(builder, "builder");
        long jN = aVar.d(this.f26960b, i3).n();
        builder.b(builder.d() + 1);
        long[] jArr = builder.f27020a;
        int i9 = builder.f27021b;
        builder.f27021b = i9 + 1;
        jArr[i9] = jN;
    }

    @Override
    public final Object g(Object obj) {
        long[] toBuilder = ((w) obj).f22554h;
        m.e(toBuilder, "$this$toBuilder");
        x0 x0Var = new x0();
        x0Var.f27020a = toBuilder;
        x0Var.f27021b = toBuilder.length;
        x0Var.b(10);
        return x0Var;
    }

    @Override
    public final Object j() {
        return new w(new long[0]);
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        long[] jArr = ((w) obj).f22554h;
        m.e(encoder, "encoder");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.u(this.f26960b, i9).C(jArr[i9]);
        }
    }
}
