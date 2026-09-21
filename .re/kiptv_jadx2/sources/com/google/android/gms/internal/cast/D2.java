package com.google.android.gms.internal.cast;

public abstract class D2 implements Cloneable {

    public final E2 f18765h;

    public E2 f18766i;

    public D2(E2 e6) {
        this.f18765h = e6;
        if (e6.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f18766i = (E2) e6.j(4, null);
    }

    public final E2 a() {
        E2 e2B = b();
        if (E2.h(e2B, true)) {
            return e2B;
        }
        throw new I3.b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final E2 b() {
        if (!this.f18766i.i()) {
            return this.f18766i;
        }
        E2 e6 = this.f18766i;
        e6.getClass();
        U2.f18826c.a(e6.getClass()).a(e6);
        e6.e();
        return this.f18766i;
    }

    public final void c() {
        if (this.f18766i.i()) {
            return;
        }
        E2 e6 = (E2) this.f18765h.j(4, null);
        U2.f18826c.a(e6.getClass()).c(e6, this.f18766i);
        this.f18766i = e6;
    }

    public final Object clone() {
        D2 d4 = (D2) this.f18765h.j(5, null);
        d4.f18766i = b();
        return d4;
    }
}
