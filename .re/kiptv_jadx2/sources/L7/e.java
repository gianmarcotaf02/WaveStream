package L7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements Iterator {

    public static final e f7096h = new e();

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
        throw new IllegalStateException();
    }
}
