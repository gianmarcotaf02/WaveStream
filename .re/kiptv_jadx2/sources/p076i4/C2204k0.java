package p076i4;

import java.util.Objects;

public final class C2204k0 extends j1 {

    public int f22913h;

    public Object f22914i;
    public final j1 j;

    public C2204k0(j1 j1Var) {
        this.j = j1Var;
    }

    @Override
    public final boolean hasNext() {
        return this.f22913h > 0 || this.j.hasNext();
    }

    @Override
    public final Object next() {
        if (this.f22913h <= 0) {
            M0 m8 = (M0) this.j.next();
            this.f22914i = m8.f22813a;
            this.f22913h = m8.a();
        }
        this.f22913h--;
        Object obj = this.f22914i;
        Objects.requireNonNull(obj);
        return obj;
    }
}
