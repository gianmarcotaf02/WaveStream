package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.C1925u f19485b = new com.google.crypto.tink.shaded.protobuf.C1925u(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f19486a;

    public M(com.google.crypto.tink.shaded.protobuf.C1918m c1918m) {
        com.google.crypto.tink.shaded.protobuf.B.a(c1918m, "output");
        this.f19486a = c1918m;
        c1918m.f19559d = this;
    }

    public void a(int i3, com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j) {
        com.google.crypto.tink.shaded.protobuf.C1918m c1918m = (com.google.crypto.tink.shaded.protobuf.C1918m) this.f19486a;
        c1918m.W(i3, 2);
        c1918m.X(abstractC1915j.size());
        com.google.crypto.tink.shaded.protobuf.C1914i c1914i = (com.google.crypto.tink.shaded.protobuf.C1914i) abstractC1915j;
        c1918m.Q(c1914i.f19539k, c1914i.p(), c1914i.size());
    }

    public void b(int i3, java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.d0 d0Var) {
        com.google.crypto.tink.shaded.protobuf.C1918m c1918m = (com.google.crypto.tink.shaded.protobuf.C1918m) this.f19486a;
        c1918m.W(i3, 3);
        d0Var.j((com.google.crypto.tink.shaded.protobuf.AbstractC1906a) obj, c1918m.f19559d);
        c1918m.W(i3, 4);
    }

    public void c(int i3, java.lang.Object obj, com.google.crypto.tink.shaded.protobuf.d0 d0Var) {
        com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906a = (com.google.crypto.tink.shaded.protobuf.AbstractC1906a) obj;
        com.google.crypto.tink.shaded.protobuf.C1918m c1918m = (com.google.crypto.tink.shaded.protobuf.C1918m) this.f19486a;
        c1918m.W(i3, 2);
        c1918m.X(abstractC1906a.b(d0Var));
        d0Var.j(abstractC1906a, c1918m.f19559d);
    }

    public M() {
        com.google.crypto.tink.shaded.protobuf.Q q9;
        try {
            q9 = (com.google.crypto.tink.shaded.protobuf.Q) java.lang.Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (java.lang.Exception unused) {
            q9 = f19485b;
        }
        com.google.crypto.tink.shaded.protobuf.Q[] qArr = {com.google.crypto.tink.shaded.protobuf.C1925u.f19591b, q9};
        com.google.crypto.tink.shaded.protobuf.L l2 = new com.google.crypto.tink.shaded.protobuf.L();
        l2.f19484a = qArr;
        java.nio.charset.Charset charset = com.google.crypto.tink.shaded.protobuf.B.f19466a;
        this.f19486a = l2;
    }
}
