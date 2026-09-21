package p153r8;

import kotlin.jvm.internal.m;
import p070h6.s;
import p143q8.a;
import p143q8.b;

public final class s0 extends f0 {

    public static final s0 f26999c = new s0(t0.f27001a);

    @Override
    public final int d(Object obj) {
        byte[] collectionSize = ((s) obj).f22550h;
        m.e(collectionSize, "$this$collectionSize");
        return collectionSize.length;
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        r0 builder = (r0) obj;
        m.e(builder, "builder");
        byte bZ = aVar.d(this.f26960b, i3).z();
        builder.b(builder.d() + 1);
        byte[] bArr = builder.f26995a;
        int i9 = builder.f26996b;
        builder.f26996b = i9 + 1;
        bArr[i9] = bZ;
    }

    @Override
    public final Object g(Object obj) {
        byte[] toBuilder = ((s) obj).f22550h;
        m.e(toBuilder, "$this$toBuilder");
        r0 r0Var = new r0();
        r0Var.f26995a = toBuilder;
        r0Var.f26996b = toBuilder.length;
        r0Var.b(10);
        return r0Var;
    }

    @Override
    public final Object j() {
        return new s(new byte[0]);
    }

    @Override
    public final void k(b encoder, Object obj, int i3) {
        byte[] bArr = ((s) obj).f22550h;
        m.e(encoder, "encoder");
        for (int i9 = 0; i9 < i3; i9++) {
            encoder.u(this.f26960b, i9).i(bArr[i9]);
        }
    }
}
