package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1926v implements com.google.crypto.tink.shaded.protobuf.S, java.lang.Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.AbstractC1928x f19593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.google.crypto.tink.shaded.protobuf.AbstractC1928x f19594i;

    public AbstractC1926v(com.google.crypto.tink.shaded.protobuf.AbstractC1928x abstractC1928x) {
        this.f19593h = abstractC1928x;
        if (abstractC1928x.n()) {
            throw new java.lang.IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19594i = abstractC1928x.q();
    }

    public static void f(java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.a0 a0Var = com.google.crypto.tink.shaded.protobuf.a0.f19511c;
        a0Var.getClass();
        a0Var.a(obj.getClass()).a(obj, obj2);
    }

    public final com.google.crypto.tink.shaded.protobuf.AbstractC1928x b() {
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x abstractC1928xC = c();
        abstractC1928xC.getClass();
        if (com.google.crypto.tink.shaded.protobuf.AbstractC1928x.m(abstractC1928xC, true)) {
            return abstractC1928xC;
        }
        throw new com.google.crypto.tink.shaded.protobuf.f0();
    }

    public final com.google.crypto.tink.shaded.protobuf.AbstractC1928x c() {
        if (!this.f19594i.n()) {
            return this.f19594i;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x abstractC1928x = this.f19594i;
        abstractC1928x.getClass();
        com.google.crypto.tink.shaded.protobuf.a0 a0Var = com.google.crypto.tink.shaded.protobuf.a0.f19511c;
        a0Var.getClass();
        a0Var.a(abstractC1928x.getClass()).b(abstractC1928x);
        abstractC1928x.o();
        return this.f19594i;
    }

    public final com.google.crypto.tink.shaded.protobuf.AbstractC1926v d() {
        com.google.crypto.tink.shaded.protobuf.AbstractC1926v abstractC1926vP = this.f19593h.d();
        abstractC1926vP.f19594i = c();
        return abstractC1926vP;
    }

    public final void e() {
        if (this.f19594i.n()) {
            return;
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x abstractC1928xQ = this.f19593h.q();
        f(abstractC1928xQ, this.f19594i);
        this.f19594i = abstractC1928xQ;
    }
}
