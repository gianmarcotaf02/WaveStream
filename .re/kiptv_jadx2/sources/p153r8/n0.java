package p153r8;

import kotlin.jvm.internal.m;
import p143q8.a;
import p143q8.b;

public final class n0 extends f0 {

    public static final n0 f26982c = new n0(o0.f26984a);

    @Override
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        m.e(sArr, "<this>");
        return sArr.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        m0 builder = (m0) obj;
        m.e(builder, "builder");
        short sY = aVar.y(this.f26960b, i3);
        builder.b(builder.d() + 1);
        short[] sArr = builder.f26978a;
        int i9 = builder.f26979b;
        builder.f26979b = i9 + 1;
        sArr[i9] = sY;
    }

    @Override
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        m.e(sArr, "<this>");
        m0 m0Var = new m0();
        m0Var.f26978a = sArr;
        m0Var.f26979b = sArr.length;
        m0Var.b(10);
        return m0Var;
    }

    @Override
    public final Object j() {
        return new short[0];
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        short[] content = (short[]) obj;
        m.e(encoder, "encoder");
        m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.m(this.f26960b, i9, content[i9]);
        }
    }
}
