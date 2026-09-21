package com.google.android.gms.internal.play_billing;

public abstract class AbstractC1875u0 implements Cloneable {

    public final AbstractC1877v0 f19392h;

    public AbstractC1877v0 f19393i;

    public AbstractC1875u0(AbstractC1877v0 abstractC1877v0) {
        this.f19392h = abstractC1877v0;
        if (abstractC1877v0.h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f19393i = abstractC1877v0.n();
    }

    public final AbstractC1877v0 a() {
        AbstractC1877v0 abstractC1877v0B = b();
        abstractC1877v0B.getClass();
        if (AbstractC1877v0.i(abstractC1877v0B, true)) {
            return abstractC1877v0B;
        }
        throw new W0();
    }

    public final AbstractC1877v0 b() {
        if (!this.f19393i.h()) {
            return this.f19393i;
        }
        AbstractC1877v0 abstractC1877v0 = this.f19393i;
        abstractC1877v0.getClass();
        Q0.f19276c.a(abstractC1877v0.getClass()).a(abstractC1877v0);
        abstractC1877v0.e();
        return this.f19393i;
    }

    public final void c() {
        if (this.f19393i.h()) {
            return;
        }
        AbstractC1877v0 abstractC1877v0N = this.f19392h.n();
        Q0.f19276c.a(abstractC1877v0N.getClass()).g(abstractC1877v0N, this.f19393i);
        this.f19393i = abstractC1877v0N;
    }

    public final Object clone() {
        AbstractC1875u0 abstractC1875u0 = (AbstractC1875u0) this.f19392h.j(5);
        abstractC1875u0.f19393i = b();
        return abstractC1875u0;
    }
}
