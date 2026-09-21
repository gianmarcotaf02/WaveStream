package p076i4;

import java.util.NoSuchElementException;

public final class C2225v0 extends j1 {

    public final Object f22945h;

    public boolean f22946i;

    public C2225v0(Object obj) {
        this.f22945h = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.f22946i;
    }

    @Override
    public final Object next() {
        if (this.f22946i) {
            throw new NoSuchElementException();
        }
        this.f22946i = true;
        return this.f22945h;
    }
}
