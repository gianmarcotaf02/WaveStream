package p086j6;

import Q0.C0781o;
import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.P;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;
import p078i6.AbstractC2257h;

public final class b extends AbstractC2257h implements RandomAccess, Serializable {

    public static final b f24234k;

    public Object[] f24235h;

    public int f24236i;
    public boolean j;

    static {
        b bVar = new b(0);
        bVar.j = true;
        f24234k = bVar;
    }

    public b(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f24235h = new Object[i3];
    }

    @Override
    public final boolean add(Object obj) {
        q();
        int i3 = this.f24236i;
        ((AbstractList) this).modCount++;
        r(i3, 1);
        this.f24235h[i3] = obj;
        return true;
    }

    @Override
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        q();
        int size = elements.size();
        o(this.f24236i, elements, size);
        return size > 0;
    }

    @Override
    public final void clear() {
        q();
        t(0, this.f24236i);
    }

    @Override
    public final int d() {
        return this.f24236i;
    }

    @Override
    public final Object e(int i3) {
        q();
        int i9 = this.f24236i;
        if (i3 < 0 || i3 >= i9) {
            throw new IndexOutOfBoundsException(M0.k(i3, i9, "index: ", ", size: "));
        }
        return s(i3);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (P.J(this.f24235h, 0, this.f24236i, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object get(int i3) {
        int i9 = this.f24236i;
        if (i3 < 0 || i3 >= i9) {
            throw new IndexOutOfBoundsException(M0.k(i3, i9, "index: ", ", size: "));
        }
        return this.f24235h[i3];
    }

    @Override
    public final int hashCode() {
        Object[] objArr = this.f24235h;
        int i3 = this.f24236i;
        int iHashCode = 1;
        for (int i9 = 0; i9 < i3; i9++) {
            Object obj = objArr[i9];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override
    public final int indexOf(Object obj) {
        for (int i3 = 0; i3 < this.f24236i; i3++) {
            if (m.a(this.f24235h[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.f24236i == 0;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        for (int i3 = this.f24236i - 1; i3 >= 0; i3--) {
            if (m.a(this.f24235h[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void o(int i3, Collection collection, int i9) {
        ((AbstractList) this).modCount++;
        r(i3, i9);
        Iterator it = collection.iterator();
        for (int i10 = 0; i10 < i9; i10++) {
            this.f24235h[i3 + i10] = it.next();
        }
    }

    public final void p(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        r(i3, 1);
        this.f24235h[i3] = obj;
    }

    public final void q() {
        if (this.j) {
            throw new UnsupportedOperationException();
        }
    }

    public final void r(int i3, int i9) {
        int i10 = this.f24236i + i9;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f24235h;
        if (i10 > objArr.length) {
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                i11 = i10 > 2147483639 ? Log.LOG_LEVEL_OFF : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i11);
            m.d(objArrCopyOf, "copyOf(...)");
            this.f24235h = objArrCopyOf;
        }
        Object[] objArr2 = this.f24235h;
        p078i6.m.Z(i3 + i9, i3, this.f24236i, objArr2, objArr2);
        this.f24236i += i9;
    }

    @Override
    public final boolean remove(Object obj) {
        q();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            e(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        m.e(elements, "elements");
        q();
        return u(0, this.f24236i, elements, false) > 0;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        q();
        return u(0, this.f24236i, elements, true) > 0;
    }

    public final Object s(int i3) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f24235h;
        Object obj = objArr[i3];
        p078i6.m.Z(i3, i3 + 1, this.f24236i, objArr, objArr);
        Object[] objArr2 = this.f24235h;
        int i9 = this.f24236i - 1;
        m.e(objArr2, "<this>");
        objArr2[i9] = null;
        this.f24236i--;
        return obj;
    }

    @Override
    public final Object set(int i3, Object obj) {
        q();
        int i9 = this.f24236i;
        if (i3 < 0 || i3 >= i9) {
            throw new IndexOutOfBoundsException(M0.k(i3, i9, "index: ", ", size: "));
        }
        Object[] objArr = this.f24235h;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override
    public final List subList(int i3, int i9) {
        AbstractC1903s.n(i3, i9, this.f24236i);
        return new a(this.f24235h, i3, i9 - i3, null, this);
    }

    public final void t(int i3, int i9) {
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f24235h;
        p078i6.m.Z(i3, i3 + i9, this.f24236i, objArr, objArr);
        Object[] objArr2 = this.f24235h;
        int i10 = this.f24236i;
        P.q0(objArr2, i10 - i9, i10);
        this.f24236i -= i9;
    }

    @Override
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        int length = array.length;
        int i3 = this.f24236i;
        if (length < i3) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f24235h, 0, i3, array.getClass());
            m.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        p078i6.m.Z(0, 0, i3, this.f24235h, array);
        int i9 = this.f24236i;
        if (i9 < array.length) {
            array[i9] = null;
        }
        return array;
    }

    @Override
    public final String toString() {
        return P.K(this.f24235h, 0, this.f24236i, this);
    }

    public final int u(int i3, int i9, Collection collection, boolean z6) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = i3 + i10;
            if (collection.contains(this.f24235h[i12]) == z6) {
                Object[] objArr = this.f24235h;
                i10++;
                objArr[i11 + i3] = objArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = i9 - i11;
        Object[] objArr2 = this.f24235h;
        p078i6.m.Z(i3 + i11, i9 + i3, this.f24236i, objArr2, objArr2);
        Object[] objArr3 = this.f24235h;
        int i14 = this.f24236i;
        P.q0(objArr3, i14 - i13, i14);
        if (i13 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f24236i -= i13;
        return i13;
    }

    @Override
    public final ListIterator listIterator(int i3) {
        int i9 = this.f24236i;
        if (i3 < 0 || i3 > i9) {
            throw new IndexOutOfBoundsException(M0.k(i3, i9, "index: ", ", size: "));
        }
        return new C0781o(this, i3);
    }

    @Override
    public final boolean addAll(int i3, Collection elements) {
        m.e(elements, "elements");
        q();
        int i9 = this.f24236i;
        if (i3 >= 0 && i3 <= i9) {
            int size = elements.size();
            o(i3, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(M0.k(i3, i9, "index: ", ", size: "));
    }

    @Override
    public final void add(int i3, Object obj) {
        q();
        int i9 = this.f24236i;
        if (i3 >= 0 && i3 <= i9) {
            ((AbstractList) this).modCount++;
            r(i3, 1);
            this.f24235h[i3] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(M0.k(i3, i9, "index: ", ", size: "));
    }

    @Override
    public final Object[] toArray() {
        return p078i6.m.g0(this.f24235h, 0, this.f24236i);
    }
}
