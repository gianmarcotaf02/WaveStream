package p153r8;

import kotlin.jvm.internal.m;
import p143q8.a;
import p143q8.b;

public final class C2698i extends f0 {

    public static final C2698i f26968c = new C2698i(C2699j.f26971a);

    @Override
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        m.e(bArr, "<this>");
        return bArr.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        C2697h builder = (C2697h) obj;
        m.e(builder, "builder");
        byte bL = aVar.l(this.f26960b, i3);
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f26965a;
        int i9 = builder.f26966b;
        builder.f26966b = i9 + 1;
        bArr[i9] = bL;
    }

    @Override
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        m.e(bArr, "<this>");
        C2697h c2697h = new C2697h();
        c2697h.f26965a = bArr;
        c2697h.f26966b = bArr.length;
        c2697h.b(10);
        return c2697h;
    }

    @Override
    public final Object j() {
        return new byte[0];
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        byte[] content = (byte[]) obj;
        m.e(encoder, "encoder");
        m.e(content, "content");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.l(this.f26960b, i9, content[i9]);
        }
    }
}
