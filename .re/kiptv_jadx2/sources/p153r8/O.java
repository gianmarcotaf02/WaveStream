package p153r8;

import kotlin.jvm.internal.m;
import p143q8.a;
import p143q8.b;

public final class O extends f0 {

    public static final O f26921c = new O(P.f26922a);

    @Override
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        m.e(jArr, "<this>");
        return jArr.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        N builder = (N) obj;
        m.e(builder, "builder");
        long jH = aVar.h(this.f26960b, i3);
        builder.b(builder.d() + 1);
        long[] jArr = builder.f26919a;
        int i9 = builder.f26920b;
        builder.f26920b = i9 + 1;
        jArr[i9] = jH;
    }

    @Override
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        m.e(jArr, "<this>");
        N n3 = new N();
        n3.f26919a = jArr;
        n3.f26920b = jArr.length;
        n3.b(10);
        return n3;
    }

    @Override
    public final Object j() {
        return new long[0];
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        long[] content = (long[]) obj;
        m.e(encoder, "encoder");
        m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.D(this.f26960b, i9, content[i9]);
        }
    }
}
