package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends com.google.common.util.concurrent.P {
    public static int A0(java.util.List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        return list.size() - 1;
    }

    public static java.util.List B0(java.lang.Object... elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return elements.length > 0 ? p078i6.m.S(elements) : p078i6.w.f23205h;
    }

    public static java.util.List C0(java.lang.Object obj) {
        return obj != null ? com.google.common.util.concurrent.P.i0(obj) : p078i6.w.f23205h;
    }

    public static java.util.ArrayList D0(java.lang.Object... elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return elements.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new p078i6.k(elements, true));
    }

    public static final java.util.List E0(java.util.List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : com.google.common.util.concurrent.P.i0(list.get(0));
        }
        return p078i6.w.f23205h;
    }

    public static final void F0(int i3, int i9) {
        if (i9 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.f(i9, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (i9 <= i3) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i9 + ") is greater than size (" + i3 + ").");
    }

    public static void G0() {
        throw new java.lang.ArithmeticException("Count overflow has happened.");
    }

    public static void H0() {
        throw new java.lang.ArithmeticException("Index overflow has happened.");
    }

    public static java.util.ArrayList x0(java.lang.Object... objArr) {
        return objArr.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new p078i6.k(objArr, true));
    }

    public static int y0(java.util.ArrayList arrayList, java.lang.Comparable comparable) {
        int size = arrayList.size();
        kotlin.jvm.internal.m.e(arrayList, "<this>");
        F0(arrayList.size(), size);
        int i3 = size - 1;
        int i9 = 0;
        while (i9 <= i3) {
            int i10 = (i9 + i3) >>> 1;
            int iO = com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Comparable) arrayList.get(i10), comparable);
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

    public static D6.g z0(java.util.Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        return new D6.g(0, collection.size() - 1, 1);
    }
}
