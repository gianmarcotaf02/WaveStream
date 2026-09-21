package p153r8;

import kotlin.jvm.internal.m;
import p143q8.a;
import p143q8.b;

public final class C2695f extends f0 {

    public static final C2695f f26959c = new C2695f(C2696g.f26961a);

    @Override
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        m.e(zArr, "<this>");
        return zArr.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        C2693e builder = (C2693e) obj;
        m.e(builder, "builder");
        boolean zO = aVar.o(this.f26960b, i3);
        builder.b(builder.d() + 1);
        boolean[] zArr = builder.f26956a;
        int i9 = builder.f26957b;
        builder.f26957b = i9 + 1;
        zArr[i9] = zO;
    }

    @Override
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        m.e(zArr, "<this>");
        C2693e c2693e = new C2693e();
        c2693e.f26956a = zArr;
        c2693e.f26957b = zArr.length;
        c2693e.b(10);
        return c2693e;
    }

    @Override
    public final Object j() {
        return new boolean[0];
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        boolean[] content = (boolean[]) obj;
        m.e(encoder, "encoder");
        m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.q(this.f26960b, i9, content[i9]);
        }
    }
}
