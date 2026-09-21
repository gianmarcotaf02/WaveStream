package p014b4;

import java.util.NoSuchElementException;

public final class l extends p {

    public static final Object f17891i = new Object();

    public Object f17892h;

    @Override
    public final boolean hasNext() {
        return this.f17892h != f17891i;
    }

    @Override
    public final Object next() {
        Object obj = this.f17892h;
        Object obj2 = f17891i;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f17892h = obj2;
        return obj;
    }
}
