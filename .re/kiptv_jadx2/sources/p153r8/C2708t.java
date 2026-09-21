package p153r8;

import kotlin.jvm.internal.m;
import p143q8.a;
import p143q8.b;

public final class C2708t extends f0 {

    public static final C2708t f27000c = new C2708t(C2709u.f27003a);

    @Override
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        m.e(dArr, "<this>");
        return dArr.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        C2707s builder = (C2707s) obj;
        m.e(builder, "builder");
        double dW = aVar.w(this.f26960b, i3);
        builder.b(builder.d() + 1);
        double[] dArr = builder.f26997a;
        int i9 = builder.f26998b;
        builder.f26998b = i9 + 1;
        dArr[i9] = dW;
    }

    @Override
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        m.e(dArr, "<this>");
        C2707s c2707s = new C2707s();
        c2707s.f26997a = dArr;
        c2707s.f26998b = dArr.length;
        c2707s.b(10);
        return c2707s;
    }

    @Override
    public final Object j() {
        return new double[0];
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        double[] content = (double[]) obj;
        m.e(encoder, "encoder");
        m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.B(this.f26960b, i9, content[i9]);
        }
    }
}
