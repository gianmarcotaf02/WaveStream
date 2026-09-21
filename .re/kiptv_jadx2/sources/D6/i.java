package D6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i implements Iterator, p201y6.a {

    public final long f2466h;

    public final long f2467i;
    public boolean j;

    public long f2468k;

    public i(long j, long j9, long j10) {
        this.f2466h = j10;
        this.f2467i = j9;
        boolean z6 = false;
        if (j10 <= 0 ? j >= j9 : j <= j9) {
            z6 = true;
        }
        this.j = z6;
        this.f2468k = z6 ? j : j9;
    }

    @Override
    public final boolean hasNext() {
        return this.j;
    }

    @Override
    public final Object next() {
        long j = this.f2468k;
        if (j != this.f2467i) {
            this.f2468k = this.f2466h + j;
        } else {
            if (!this.j) {
                throw new NoSuchElementException();
            }
            this.j = false;
        }
        return Long.valueOf(j);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
