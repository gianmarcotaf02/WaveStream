package p078i6;

import D6.g;
import Y6.f;
import com.google.common.util.concurrent.P;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m;

public abstract class p extends P {
    public static int A0(List list) {
        m.e(list, "<this>");
        return list.size() - 1;
    }

    public static List B0(Object... elements) {
        m.e(elements, "elements");
        return elements.length > 0 ? m.S(elements) : w.f23205h;
    }

    public static List C0(Object obj) {
        return obj != null ? P.i0(obj) : w.f23205h;
    }

    public static ArrayList D0(Object... elements) {
        m.e(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new k(elements, true));
    }

    public static final List E0(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : P.i0(list.get(0));
        }
        return w.f23205h;
    }

    public static final void F0(int i3, int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException(f.f(i9, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i9 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i9 + ") is greater than size (" + i3 + ").");
    }

    public static void G0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void H0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static ArrayList x0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new k(objArr, true));
    }

    public static int y0(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        m.e(arrayList, "<this>");
        F0(arrayList.size(), size);
        int i3 = size - 1;
        int i9 = 0;
        while (i9 <= i3) {
            int i10 = (i9 + i3) >>> 1;
            int iO = q0.o((Comparable) arrayList.get(i10), comparable);
            if (iO < 0) {
                i9 = i10 + 1;
            } else {
                if (iO <= 0) {
                    return i10;
                }
                i3 = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static g z0(Collection collection) {
        m.e(collection, "<this>");
        return new g(0, collection.size() - 1, 1);
    }
}
