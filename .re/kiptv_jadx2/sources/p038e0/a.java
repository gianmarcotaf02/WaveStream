package p038e0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p136q.D;
import p136q.H;
import p136q.N;

public final class a {

    public final H f21316a;

    public static final Object a(H h9) {
        Object objG = h9.g(null);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof D)) {
            h9.k(null);
            return objG;
        }
        D d4 = (D) objG;
        if (d4.h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i3 = d4.f26304b - 1;
        Object objF = d4.f(i3);
        d4.k(i3);
        m.c(objF, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (d4.h()) {
            h9.k(null);
        }
        if (d4.f26304b == 1) {
            h9.m(null, d4.e());
        }
        return objF;
    }

    public static final D b(H h9) {
        if (h9.i()) {
            D d4 = N.f26349b;
            m.c(d4, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return d4;
        }
        D d6 = new D();
        Object[] objArr = h9.f26324c;
        long[] jArr = h9.f26322a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i9 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i3 << 3) + i10];
                            if (obj instanceof D) {
                                m.c(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                d6.c((D) obj);
                            } else {
                                m.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                d6.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i3 != length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return d6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return m.a(this.f21316a, ((a) obj).f21316a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21316a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f21316a + ')';
    }
}
