package p038e0;

import java.util.List;

public abstract class f {
    public static final void a(int i3, List list) {
        int size = list.size();
        if (i3 < 0 || i3 >= size) {
            c(i3, size);
        }
    }

    public static final void b(int i3, int i9, List list) {
        if (i3 > i9) {
            f(i3, i9);
        }
        if (i3 < 0) {
            d(i3);
        }
        if (i9 > list.size()) {
            e(i9, list.size());
        }
    }

    private static final void c(int i3, int i9) {
        throw new IndexOutOfBoundsException("Index " + i3 + " is out of bounds. The list has " + i9 + " elements.");
    }

    private static final void d(int i3) {
        throw new IndexOutOfBoundsException(Y6.f.f(i3, "fromIndex (", ") is less than 0."));
    }

    private static final void e(int i3, int i9) {
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is more than than the list size (" + i9 + ')');
    }

    private static final void f(int i3, int i9) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i3 + ") is greater than toIndex (" + i9 + ").");
    }
}
