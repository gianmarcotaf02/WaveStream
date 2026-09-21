package p078i6;

import java.util.AbstractList;
import java.util.List;
import p201y6.c;

public abstract class AbstractC2257h extends AbstractList implements List, c {
    public abstract int d();

    public abstract Object e(int i3);

    @Override
    public final Object remove(int i3) {
        return e(i3);
    }

    @Override
    public final int size() {
        return d();
    }
}
