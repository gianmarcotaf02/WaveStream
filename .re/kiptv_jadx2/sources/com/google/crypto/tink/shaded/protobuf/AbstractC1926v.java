package com.google.crypto.tink.shaded.protobuf;

public abstract class AbstractC1926v implements S, Cloneable {

    public final AbstractC1928x f19593h;

    public AbstractC1928x f19594i;

    public AbstractC1926v(AbstractC1928x abstractC1928x) {
        this.f19593h = abstractC1928x;
        if (abstractC1928x.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19594i = abstractC1928x.q();
    }

    public static void f(Object obj, Object obj2) {
        a0 a0Var = a0.f19511c;
        a0Var.getClass();
        a0Var.a(obj.getClass()).a(obj, obj2);
    }

    public final AbstractC1928x b() {
        AbstractC1928x abstractC1928xC = c();
        abstractC1928xC.getClass();
        if (AbstractC1928x.m(abstractC1928xC, true)) {
            return abstractC1928xC;
        }
        throw new f0();
    }

    public final AbstractC1928x c() {
        if (!this.f19594i.n()) {
            return this.f19594i;
        }
        AbstractC1928x abstractC1928x = this.f19594i;
        abstractC1928x.getClass();
        a0 a0Var = a0.f19511c;
        a0Var.getClass();
        a0Var.a(abstractC1928x.getClass()).b(abstractC1928x);
        abstractC1928x.o();
        return this.f19594i;
    }

    public final AbstractC1926v d() {
        AbstractC1926v abstractC1926vP = this.f19593h.d();
        abstractC1926vP.f19594i = c();
        return abstractC1926vP;
    }

    public final void e() {
        if (this.f19594i.n()) {
            return;
        }
        AbstractC1928x abstractC1928xQ = this.f19593h.q();
        f(abstractC1928xQ, this.f19594i);
        this.f19594i = abstractC1928xQ;
    }
}
