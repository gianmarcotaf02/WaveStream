package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

public final class M {

    public static final C1925u f19485b = new C1925u(1);

    public final Object f19486a;

    public M(C1918m c1918m) {
        B.a(c1918m, "output");
        this.f19486a = c1918m;
        c1918m.f19559d = this;
    }

    public void a(int i3, AbstractC1915j abstractC1915j) {
        C1918m c1918m = (C1918m) this.f19486a;
        c1918m.W(i3, 2);
        c1918m.X(abstractC1915j.size());
        C1914i c1914i = (C1914i) abstractC1915j;
        c1918m.Q(c1914i.f19539k, c1914i.p(), c1914i.size());
    }

    public void b(int i3, Object obj, d0 d0Var) {
        C1918m c1918m = (C1918m) this.f19486a;
        c1918m.W(i3, 3);
        d0Var.j((AbstractC1906a) obj, c1918m.f19559d);
        c1918m.W(i3, 4);
    }

    public void c(int i3, Object obj, d0 d0Var) {
        AbstractC1906a abstractC1906a = (AbstractC1906a) obj;
        C1918m c1918m = (C1918m) this.f19486a;
        c1918m.W(i3, 2);
        c1918m.X(abstractC1906a.b(d0Var));
        d0Var.j(abstractC1906a, c1918m.f19559d);
    }

    public M() {
        Q q9;
        try {
            q9 = (Q) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            q9 = f19485b;
        }
        Q[] qArr = {C1925u.f19591b, q9};
        L l2 = new L();
        l2.f19484a = qArr;
        Charset charset = B.f19466a;
        this.f19486a = l2;
    }
}
