package p153r8;

import kotlin.jvm.internal.m;
import p070h6.u;
import p143q8.a;
import p143q8.b;

public final class v0 extends f0 {

    public static final v0 f27009c = new v0(w0.f27015a);

    @Override
    public final int d(Object obj) {
        int[] collectionSize = ((u) obj).f22552h;
        m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        u0 builder = (u0) obj;
        m.e(builder, "builder");
        int iJ = aVar.d(this.f26960b, i3).j();
        builder.b(builder.d() + 1);
        int[] iArr = builder.f27005a;
        int i9 = builder.f27006b;
        builder.f27006b = i9 + 1;
        iArr[i9] = iJ;
    }

    @Override
    public final Object g(Object obj) {
        int[] toBuilder = ((u) obj).f22552h;
        m.e(toBuilder, "$this$toBuilder");
        u0 u0Var = new u0();
        u0Var.f27005a = toBuilder;
        u0Var.f27006b = toBuilder.length;
        u0Var.b(10);
        return u0Var;
    }

    @Override
    public final Object j() {
        return new u(new int[0]);
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        int[] iArr = ((u) obj).f22552h;
        m.e(encoder, "encoder");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.u(this.f26960b, i9).x(iArr[i9]);
        }
    }
}
