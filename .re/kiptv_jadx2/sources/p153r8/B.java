package p153r8;

import kotlin.jvm.internal.m;
import p143q8.a;
import p143q8.b;

public final class B extends f0 {

    public static final B f26893c = new B(C.f26895a);

    @Override
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        m.e(fArr, "<this>");
        return fArr.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        A builder = (A) obj;
        m.e(builder, "builder");
        float fD = aVar.D(this.f26960b, i3);
        builder.b(builder.d() + 1);
        float[] fArr = builder.f26889a;
        int i9 = builder.f26890b;
        builder.f26890b = i9 + 1;
        fArr[i9] = fD;
    }

    @Override
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        m.e(fArr, "<this>");
        A a2 = new A();
        a2.f26889a = fArr;
        a2.f26890b = fArr.length;
        a2.b(10);
        return a2;
    }

    @Override
    public final Object j() {
        return new float[0];
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        float[] content = (float[]) obj;
        m.e(encoder, "encoder");
        m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.k(this.f26960b, i9, content[i9]);
        }
    }
}
