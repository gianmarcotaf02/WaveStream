package I7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class p implements Iterator, p201y6.a {

    public final int f5579h;

    public boolean f5580i = true;
    public final Object j;

    public p(int i3, Object obj) {
        this.f5579h = i3;
        this.j = obj;
    }

    @Override
    public final boolean hasNext() {
        switch (this.f5579h) {
            case 0:
                break;
        }
        return this.f5580i;
    }

    @Override
    public final Object next() {
        switch (this.f5579h) {
            case 0:
                if (!this.f5580i) {
                    throw new NoSuchElementException();
                }
                this.f5580i = false;
                return ((q) this.j).f5581h;
            default:
                if (!this.f5580i) {
                    throw new NoSuchElementException();
                }
                this.f5580i = false;
                return this.j;
        }
    }

    @Override
    public final void remove() {
        switch (this.f5579h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException();
        }
    }
}
