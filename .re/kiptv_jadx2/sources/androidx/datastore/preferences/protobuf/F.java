package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

public final class F {

    public static final C1511s f16133b = new C1511s(1);

    public final Object f16134a;

    public F(C1505l c1505l) {
        AbstractC1516x.a(c1505l, "output");
        this.f16134a = c1505l;
        c1505l.f16229m = this;
    }

    public void a(int i3, Object obj, X x9) {
        C1505l c1505l = (C1505l) this.f16134a;
        c1505l.G0(i3, 3);
        x9.e((AbstractC1494a) obj, c1505l.f16229m);
        c1505l.G0(i3, 4);
    }

    public F() {
        U u6 = U.f16162c;
        L l2 = f16133b;
        try {
            l2 = (L) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
        }
        L[] lArr = {C1511s.f16248b, l2};
        E e6 = new E();
        e6.f16132a = lArr;
        Charset charset = AbstractC1516x.f16267a;
        this.f16134a = e6;
    }
}
