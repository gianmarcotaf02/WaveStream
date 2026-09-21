package p136q;

import java.util.List;
import p144r.a;

public abstract class N {

    public static final Object[] f26348a = new Object[0];

    public static final D f26349b = new D(0);

    public static final void a(int i3, List list) {
        int size = list.size();
        if (i3 < 0 || i3 >= size) {
            a.d("Index " + i3 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i3, int i9, List list) {
        int size = list.size();
        if (i3 > i9) {
            a.c("Indices are out of order. fromIndex (" + i3 + ") is greater than toIndex (" + i9 + ").");
            throw null;
        }
        if (i3 < 0) {
            a.d("fromIndex (" + i3 + ") is less than 0.");
            throw null;
        }
        if (i9 <= size) {
            return;
        }
        a.d("toIndex (" + i9 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
