package androidx.datastore.preferences.protobuf;

public abstract class AbstractC1512t implements Cloneable {

    public final AbstractC1514v f16255h;

    public AbstractC1514v f16256i;

    public AbstractC1512t(AbstractC1514v abstractC1514v) {
        this.f16255h = abstractC1514v;
        if (abstractC1514v.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f16256i = abstractC1514v.i();
    }

    public final AbstractC1514v a() {
        AbstractC1514v abstractC1514vB = b();
        abstractC1514vB.getClass();
        if (AbstractC1514v.f(abstractC1514vB, true)) {
            return abstractC1514vB;
        }
        throw new d0();
    }

    public final AbstractC1514v b() {
        if (!this.f16256i.g()) {
            return this.f16256i;
        }
        AbstractC1514v abstractC1514v = this.f16256i;
        abstractC1514v.getClass();
        U u6 = U.f16162c;
        u6.getClass();
        u6.a(abstractC1514v.getClass()).b(abstractC1514v);
        abstractC1514v.h();
        return this.f16256i;
    }

    public final void c() {
        if (this.f16256i.g()) {
            return;
        }
        AbstractC1514v abstractC1514vI = this.f16255h.i();
        AbstractC1514v abstractC1514v = this.f16256i;
        U u6 = U.f16162c;
        u6.getClass();
        u6.a(abstractC1514vI.getClass()).a(abstractC1514vI, abstractC1514v);
        this.f16256i = abstractC1514vI;
    }

    public final Object clone() {
        AbstractC1512t abstractC1512t = (AbstractC1512t) this.f16255h.c(5);
        abstractC1512t.f16256i = b();
        return abstractC1512t;
    }
}
