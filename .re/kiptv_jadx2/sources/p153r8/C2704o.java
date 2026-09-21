package p153r8;

import kotlin.jvm.internal.m;
import p143q8.a;
import p143q8.b;

public final class C2704o extends f0 {

    public static final C2704o f26983c = new C2704o(C2705p.f26986a);

    @Override
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        m.e(cArr, "<this>");
        return cArr.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        C2703n builder = (C2703n) obj;
        m.e(builder, "builder");
        char C9 = aVar.C(this.f26960b, i3);
        builder.b(builder.d() + 1);
        char[] cArr = builder.f26980a;
        int i9 = builder.f26981b;
        builder.f26981b = i9 + 1;
        cArr[i9] = C9;
    }

    @Override
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        m.e(cArr, "<this>");
        C2703n c2703n = new C2703n();
        c2703n.f26980a = cArr;
        c2703n.f26981b = cArr.length;
        c2703n.b(10);
        return c2703n;
    }

    @Override
    public final Object j() {
        return new char[0];
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        char[] content = (char[]) obj;
        m.e(encoder, "encoder");
        m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.d(this.f26960b, i9, content[i9]);
        }
    }
}
