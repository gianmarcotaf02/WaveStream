package p136q;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.m;
import p144r.a;

public abstract class AbstractC2674s {

    public static final Object f26418a = new Object();

    public static final long[] f26419b = new long[0];

    public static final Object f26420c = new Object();

    public static final void a(T t9) {
        int i3 = t9.f26357k;
        int[] iArr = t9.f26356i;
        Object[] objArr = t9.j;
        int i9 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            Object obj = objArr[i10];
            if (obj != f26420c) {
                if (i10 != i9) {
                    iArr[i9] = iArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        t9.f26355h = false;
        t9.f26357k = i9;
    }

    public static final void b(C2662f c2662f, int i3) {
        m.e(c2662f, "<this>");
        c2662f.f26381h = new int[i3];
        c2662f.f26382i = new Object[i3];
    }

    public static final int c(C2662f c2662f, Object obj, int i3) {
        m.e(c2662f, "<this>");
        int i9 = c2662f.j;
        if (i9 == 0) {
            return -1;
        }
        try {
            int iA = a.a(c2662f.j, i3, c2662f.f26381h);
            if (iA < 0 || m.a(obj, c2662f.f26382i[iA])) {
                return iA;
            }
            int i10 = iA + 1;
            while (i10 < i9 && c2662f.f26381h[i10] == i3) {
                if (m.a(obj, c2662f.f26382i[i10])) {
                    return i10;
                }
                i10++;
            }
            for (int i11 = iA - 1; i11 >= 0 && c2662f.f26381h[i11] == i3; i11--) {
                if (m.a(obj, c2662f.f26382i[i11])) {
                    return i11;
                }
            }
            return ~i10;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
