package p153r8;

import kotlin.jvm.internal.m;
import p070h6.z;
import p143q8.a;
import p143q8.b;

public final class B0 extends f0 {

    public static final B0 f26894c = new B0(C0.f26897a);

    @Override
    public final int d(Object obj) {
        short[] collectionSize = ((z) obj).f22557h;
        m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        A0 builder = (A0) obj;
        m.e(builder, "builder");
        short sA = aVar.d(this.f26960b, i3).A();
        builder.b(builder.d() + 1);
        short[] sArr = builder.f26891a;
        int i9 = builder.f26892b;
        builder.f26892b = i9 + 1;
        sArr[i9] = sA;
    }

    @Override
    public final Object g(Object obj) {
        short[] toBuilder = ((z) obj).f22557h;
        m.e(toBuilder, "$this$toBuilder");
        A0 a2 = new A0();
        a2.f26891a = toBuilder;
        a2.f26892b = toBuilder.length;
        a2.b(10);
        return a2;
    }

    @Override
    public final Object j() {
        return new z(new short[0]);
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        short[] sArr = ((z) obj).f22557h;
        m.e(encoder, "encoder");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.u(this.f26960b, i9).g(sArr[i9]);
        }
    }
}
