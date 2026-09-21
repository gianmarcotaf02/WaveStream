package p014b4;

import T3.o;
import Y6.f;

public final class C1662d extends AbstractC1661c {

    public final o f17881h;

    public C1662d(o oVar) {
        this.f17881h = oVar;
    }

    @Override
    public final Object a() {
        return this.f17881h;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1662d) {
            return this.f17881h.equals(((C1662d) obj).f17881h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17881h.hashCode() + 1502476572;
    }

    public final String toString() {
        return f.h("Optional.of(", this.f17881h.toString(), ")");
    }
}
