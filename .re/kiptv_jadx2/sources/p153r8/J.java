package p153r8;

import kotlin.jvm.internal.m;
import p143q8.a;
import p143q8.b;

public final class J extends f0 {

    public static final J f26914c = new J(K.f26915a);

    @Override
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        m.e(iArr, "<this>");
        return iArr.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        I builder = (I) obj;
        m.e(builder, "builder");
        int iK = aVar.k(this.f26960b, i3);
        builder.b(builder.d() + 1);
        int[] iArr = builder.f26912a;
        int i9 = builder.f26913b;
        builder.f26913b = i9 + 1;
        iArr[i9] = iK;
    }

    @Override
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        m.e(iArr, "<this>");
        I i3 = new I();
        i3.f26912a = iArr;
        i3.f26913b = iArr.length;
        i3.b(10);
        return i3;
    }

    @Override
    public final Object j() {
        return new int[0];
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        int[] content = (int[]) obj;
        m.e(encoder, "encoder");
        m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.n(i9, content[i9], this.f26960b);
        }
    }
}
