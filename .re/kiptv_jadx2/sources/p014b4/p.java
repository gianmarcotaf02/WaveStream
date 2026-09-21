package p014b4;

import java.util.Iterator;

public abstract class p implements Iterator {
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
