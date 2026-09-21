package I7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class j implements Iterator, p201y6.a {
    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
