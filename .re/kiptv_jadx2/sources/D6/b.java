package D6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public final class b implements Iterator, p201y6.a {

    public final int f2453h;

    public final int f2454i;
    public boolean j;

    public int f2455k;

    public b(char c9, char c10, int i3) {
        this.f2453h = i3;
        this.f2454i = c10;
        boolean z6 = false;
        if (i3 <= 0 ? m.f(c9, c10) >= 0 : m.f(c9, c10) <= 0) {
            z6 = true;
        }
        this.j = z6;
        this.f2455k = z6 ? c9 : c10;
    }

    @Override
    public final boolean hasNext() {
        return this.j;
    }

    @Override
    public final Object next() {
        int i3 = this.f2455k;
        if (i3 != this.f2454i) {
            this.f2455k = this.f2453h + i3;
        } else {
            if (!this.j) {
                throw new NoSuchElementException();
            }
            this.j = false;
        }
        return Character.valueOf((char) i3);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
