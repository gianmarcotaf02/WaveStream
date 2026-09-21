package p078i6;

import androidx.media3.common.util.Log;
import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.AbstractC1903s;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public final class l extends AbstractC2257h {

    public static final Object[] f23200k = new Object[0];

    public int f23201h;

    public Object[] f23202i;
    public int j;

    public l() {
        this.f23202i = f23200k;
    }

    @Override
    public final void add(int i3, Object obj) {
        int length;
        int i9 = this.j;
        if (i3 < 0 || i3 > i9) {
            throw new IndexOutOfBoundsException(M0.k(i3, i9, "index: ", ", size: "));
        }
        if (i3 == i9) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        v();
        o(this.j + 1);
        int iU = u(this.f23201h + i3);
        int i10 = this.j;
        if (i3 < ((i10 + 1) >> 1)) {
            if (iU == 0) {
                Object[] objArr = this.f23202i;
                m.e(objArr, "<this>");
                iU = objArr.length;
            }
            int i11 = iU - 1;
            int i12 = this.f23201h;
            if (i12 == 0) {
                Object[] objArr2 = this.f23202i;
                m.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i12 - 1;
            }
            int i13 = this.f23201h;
            if (i11 >= i13) {
                Object[] objArr3 = this.f23202i;
                objArr3[length] = objArr3[i13];
                m.Z(i13, i13 + 1, i11 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f23202i;
                m.Z(i13 - 1, i13, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f23202i;
                objArr5[objArr5.length - 1] = objArr5[0];
                m.Z(0, 1, i11 + 1, objArr5, objArr5);
            }
            this.f23202i[i11] = obj;
            this.f23201h = length;
        } else {
            int iU2 = u(i10 + this.f23201h);
            if (iU < iU2) {
                Object[] objArr6 = this.f23202i;
                m.Z(iU + 1, iU, iU2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f23202i;
                m.Z(1, 0, iU2, objArr7, objArr7);
                Object[] objArr8 = this.f23202i;
                objArr8[0] = objArr8[objArr8.length - 1];
                m.Z(iU + 1, iU, objArr8.length - 1, objArr8, objArr8);
            }
            this.f23202i[iU] = obj;
        }
        this.j++;
    }

    @Override
    public final boolean addAll(int i3, Collection elements) {
        m.e(elements, "elements");
        int i9 = this.j;
        if (i3 < 0 || i3 > i9) {
            throw new IndexOutOfBoundsException(M0.k(i3, i9, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i3 == this.j) {
            return addAll(elements);
        }
        v();
        o(elements.size() + this.j);
        int iU = u(this.j + this.f23201h);
        int iU2 = u(this.f23201h + i3);
        int size = elements.size();
        if (i3 >= ((this.j + 1) >> 1)) {
            int i10 = iU2 + size;
            if (iU2 < iU) {
                int i11 = size + iU;
                Object[] objArr = this.f23202i;
                if (i11 <= objArr.length) {
                    m.Z(i10, iU2, iU, objArr, objArr);
                } else if (i10 >= objArr.length) {
                    m.Z(i10 - objArr.length, iU2, iU, objArr, objArr);
                } else {
                    int length = iU - (i11 - objArr.length);
                    m.Z(0, length, iU, objArr, objArr);
                    Object[] objArr2 = this.f23202i;
                    m.Z(i10, iU2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f23202i;
                m.Z(size, 0, iU, objArr3, objArr3);
                Object[] objArr4 = this.f23202i;
                if (i10 >= objArr4.length) {
                    m.Z(i10 - objArr4.length, iU2, objArr4.length, objArr4, objArr4);
                } else {
                    m.Z(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f23202i;
                    m.Z(i10, iU2, objArr5.length - size, objArr5, objArr5);
                }
            }
            n(iU2, elements);
            return true;
        }
        int i12 = this.f23201h;
        int length2 = i12 - size;
        if (iU2 < i12) {
            Object[] objArr6 = this.f23202i;
            m.Z(length2, i12, objArr6.length, objArr6, objArr6);
            if (size >= iU2) {
                Object[] objArr7 = this.f23202i;
                m.Z(objArr7.length - size, 0, iU2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f23202i;
                m.Z(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f23202i;
                m.Z(0, size, iU2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f23202i;
            m.Z(length2, i12, iU2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f23202i;
            length2 += objArr11.length;
            int i13 = iU2 - i12;
            int length3 = objArr11.length - length2;
            if (length3 >= i13) {
                m.Z(length2, i12, iU2, objArr11, objArr11);
            } else {
                m.Z(length2, i12, i12 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f23202i;
                m.Z(0, this.f23201h + length3, iU2, objArr12, objArr12);
            }
        }
        this.f23201h = length2;
        n(s(iU2 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        v();
        o(this.j + 1);
        int length = this.f23201h;
        if (length == 0) {
            Object[] objArr = this.f23202i;
            m.e(objArr, "<this>");
            length = objArr.length;
        }
        int i3 = length - 1;
        this.f23201h = i3;
        this.f23202i[i3] = obj;
        this.j++;
    }

    public final void addLast(Object obj) {
        v();
        o(d() + 1);
        this.f23202i[u(d() + this.f23201h)] = obj;
        this.j = d() + 1;
    }

    @Override
    public final void clear() {
        if (!isEmpty()) {
            v();
            t(this.f23201h, u(d() + this.f23201h));
        }
        this.f23201h = 0;
        this.j = 0;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public final int d() {
        return this.j;
    }

    @Override
    public final Object e(int i3) {
        int i9 = this.j;
        if (i3 < 0 || i3 >= i9) {
            throw new IndexOutOfBoundsException(M0.k(i3, i9, "index: ", ", size: "));
        }
        if (i3 == p.A0(this)) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        v();
        int iU = u(this.f23201h + i3);
        Object[] objArr = this.f23202i;
        Object obj = objArr[iU];
        if (i3 < (this.j >> 1)) {
            int i10 = this.f23201h;
            if (iU >= i10) {
                m.Z(i10 + 1, i10, iU, objArr, objArr);
            } else {
                m.Z(1, 0, iU, objArr, objArr);
                Object[] objArr2 = this.f23202i;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i11 = this.f23201h;
                m.Z(i11 + 1, i11, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f23202i;
            int i12 = this.f23201h;
            objArr3[i12] = null;
            this.f23201h = q(i12);
        } else {
            int iU2 = u(p.A0(this) + this.f23201h);
            if (iU <= iU2) {
                Object[] objArr4 = this.f23202i;
                m.Z(iU, iU + 1, iU2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f23202i;
                m.Z(iU, iU + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f23202i;
                objArr6[objArr6.length - 1] = objArr6[0];
                m.Z(0, 1, iU2 + 1, objArr6, objArr6);
            }
            this.f23202i[iU2] = null;
        }
        this.j--;
        return obj;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f23202i[this.f23201h];
    }

    @Override
    public final Object get(int i3) {
        int iD = d();
        if (i3 < 0 || i3 >= iD) {
            throw new IndexOutOfBoundsException(M0.k(i3, iD, "index: ", ", size: "));
        }
        return this.f23202i[u(this.f23201h + i3)];
    }

    @Override
    public final int indexOf(Object obj) {
        int i3;
        int iU = u(d() + this.f23201h);
        int length = this.f23201h;
        if (length < iU) {
            while (length < iU) {
                if (m.a(obj, this.f23202i[length])) {
                    i3 = this.f23201h;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iU) {
            return -1;
        }
        int length2 = this.f23202i.length;
        while (length < length2) {
            if (m.a(obj, this.f23202i[length])) {
                i3 = this.f23201h;
            } else {
                length++;
            }
        }
        for (int i9 = 0; i9 < iU; i9++) {
            if (m.a(obj, this.f23202i[i9])) {
                length = i9 + this.f23202i.length;
                i3 = this.f23201h;
            }
        }
        return -1;
        return length - i3;
    }

    @Override
    public final boolean isEmpty() {
        return d() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f23202i[u(p.A0(this) + this.f23201h)];
    }

    @Override
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int iU = u(this.j + this.f23201h);
        int i9 = this.f23201h;
        if (i9 < iU) {
            length = iU - 1;
            if (i9 <= length) {
                while (!m.a(obj, this.f23202i[length])) {
                    if (length != i9) {
                        length--;
                    }
                }
                i3 = this.f23201h;
                return length - i3;
            }
            return -1;
        }
        if (i9 > iU) {
            for (int i10 = iU - 1; -1 < i10; i10--) {
                if (m.a(obj, this.f23202i[i10])) {
                    length = i10 + this.f23202i.length;
                    i3 = this.f23201h;
                    return length - i3;
                }
            }
            Object[] objArr = this.f23202i;
            m.e(objArr, "<this>");
            length = objArr.length - 1;
            int i11 = this.f23201h;
            if (i11 <= length) {
                while (!m.a(obj, this.f23202i[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i3 = this.f23201h;
                return length - i3;
            }
        }
        return -1;
    }

    public final void n(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f23202i.length;
        while (i3 < length && it.hasNext()) {
            this.f23202i[i3] = it.next();
            i3++;
        }
        int i9 = this.f23201h;
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            this.f23202i[i10] = it.next();
        }
        this.j = collection.size() + this.j;
    }

    public final void o(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f23202i;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f23200k) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.f23202i = new Object[i3];
            return;
        }
        int length = objArr.length;
        int i9 = length + (length >> 1);
        if (i9 - i3 < 0) {
            i9 = i3;
        }
        if (i9 - 2147483639 > 0) {
            i9 = i3 > 2147483639 ? Log.LOG_LEVEL_OFF : 2147483639;
        }
        Object[] objArr2 = new Object[i9];
        m.Z(0, this.f23201h, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f23202i;
        int length2 = objArr3.length;
        int i10 = this.f23201h;
        m.Z(length2 - i10, 0, i10, objArr3, objArr2);
        this.f23201h = 0;
        this.f23202i = objArr2;
    }

    public final Object p() {
        if (isEmpty()) {
            return null;
        }
        return this.f23202i[this.f23201h];
    }

    public final int q(int i3) {
        Object[] objArr = this.f23202i;
        m.e(objArr, "<this>");
        if (i3 == objArr.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final Object r() {
        if (isEmpty()) {
            return null;
        }
        return this.f23202i[u(p.A0(this) + this.f23201h)];
    }

    @Override
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        e(iIndexOf);
        return true;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int iU;
        m.e(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f23202i.length != 0) {
            int iU2 = u(this.j + this.f23201h);
            int i3 = this.f23201h;
            if (i3 < iU2) {
                iU = i3;
                while (i3 < iU2) {
                    Object obj = this.f23202i[i3];
                    if (elements.contains(obj)) {
                        z6 = true;
                    } else {
                        this.f23202i[iU] = obj;
                        iU++;
                    }
                    i3++;
                }
                m.h0(this.f23202i, null, iU, iU2);
            } else {
                int length = this.f23202i.length;
                boolean z9 = false;
                int i9 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f23202i;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj2)) {
                        z9 = true;
                    } else {
                        this.f23202i[i9] = obj2;
                        i9++;
                    }
                    i3++;
                }
                iU = u(i9);
                for (int i10 = 0; i10 < iU2; i10++) {
                    Object[] objArr2 = this.f23202i;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        z9 = true;
                    } else {
                        this.f23202i[iU] = obj3;
                        iU = q(iU);
                    }
                }
                z6 = z9;
            }
            if (z6) {
                v();
                this.j = s(iU - this.f23201h);
            }
        }
        return z6;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        v();
        Object[] objArr = this.f23202i;
        int i3 = this.f23201h;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f23201h = q(i3);
        this.j = d() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        v();
        int iU = u(p.A0(this) + this.f23201h);
        Object[] objArr = this.f23202i;
        Object obj = objArr[iU];
        objArr[iU] = null;
        this.j = d() - 1;
        return obj;
    }

    @Override
    public final void removeRange(int i3, int i9) {
        AbstractC1903s.n(i3, i9, this.j);
        int i10 = i9 - i3;
        if (i10 == 0) {
            return;
        }
        if (i10 == this.j) {
            clear();
            return;
        }
        if (i10 == 1) {
            e(i3);
            return;
        }
        v();
        if (i3 < this.j - i9) {
            int iU = u((i3 - 1) + this.f23201h);
            int iU2 = u((i9 - 1) + this.f23201h);
            while (i3 > 0) {
                int i11 = iU + 1;
                int iMin = Math.min(i3, Math.min(i11, iU2 + 1));
                Object[] objArr = this.f23202i;
                int i12 = iU2 - iMin;
                int i13 = iU - iMin;
                m.Z(i12 + 1, i13 + 1, i11, objArr, objArr);
                iU = s(i13);
                iU2 = s(i12);
                i3 -= iMin;
            }
            int iU3 = u(this.f23201h + i10);
            t(this.f23201h, iU3);
            this.f23201h = iU3;
        } else {
            int iU4 = u(this.f23201h + i9);
            int iU5 = u(this.f23201h + i3);
            int i14 = this.j;
            while (true) {
                i14 -= i9;
                if (i14 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f23202i;
                i9 = Math.min(i14, Math.min(objArr2.length - iU4, objArr2.length - iU5));
                Object[] objArr3 = this.f23202i;
                int i15 = iU4 + i9;
                m.Z(iU5, iU4, i15, objArr3, objArr3);
                iU4 = u(i15);
                iU5 = u(iU5 + i9);
            }
            int iU6 = u(this.j + this.f23201h);
            t(s(iU6 - i10), iU6);
        }
        this.j -= i10;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        int iU;
        m.e(elements, "elements");
        boolean z6 = false;
        z6 = false;
        z6 = false;
        if (!isEmpty() && this.f23202i.length != 0) {
            int iU2 = u(this.j + this.f23201h);
            int i3 = this.f23201h;
            if (i3 < iU2) {
                iU = i3;
                while (i3 < iU2) {
                    Object obj = this.f23202i[i3];
                    if (elements.contains(obj)) {
                        this.f23202i[iU] = obj;
                        iU++;
                    } else {
                        z6 = true;
                    }
                    i3++;
                }
                m.h0(this.f23202i, null, iU, iU2);
            } else {
                int length = this.f23202i.length;
                boolean z9 = false;
                int i9 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f23202i;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj2)) {
                        this.f23202i[i9] = obj2;
                        i9++;
                    } else {
                        z9 = true;
                    }
                    i3++;
                }
                iU = u(i9);
                for (int i10 = 0; i10 < iU2; i10++) {
                    Object[] objArr2 = this.f23202i;
                    Object obj3 = objArr2[i10];
                    objArr2[i10] = null;
                    if (elements.contains(obj3)) {
                        this.f23202i[iU] = obj3;
                        iU = q(iU);
                    } else {
                        z9 = true;
                    }
                }
                z6 = z9;
            }
            if (z6) {
                v();
                this.j = s(iU - this.f23201h);
            }
        }
        return z6;
    }

    public final int s(int i3) {
        return i3 < 0 ? i3 + this.f23202i.length : i3;
    }

    @Override
    public final Object set(int i3, Object obj) {
        int iD = d();
        if (i3 < 0 || i3 >= iD) {
            throw new IndexOutOfBoundsException(M0.k(i3, iD, "index: ", ", size: "));
        }
        int iU = u(this.f23201h + i3);
        Object[] objArr = this.f23202i;
        Object obj2 = objArr[iU];
        objArr[iU] = obj;
        return obj2;
    }

    public final void t(int i3, int i9) {
        if (i3 < i9) {
            m.h0(this.f23202i, null, i3, i9);
            return;
        }
        Object[] objArr = this.f23202i;
        Arrays.fill(objArr, i3, objArr.length, (Object) null);
        m.h0(this.f23202i, null, 0, i9);
    }

    @Override
    public final Object[] toArray() {
        return toArray(new Object[d()]);
    }

    public final int u(int i3) {
        Object[] objArr = this.f23202i;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    public final void v() {
        ((AbstractList) this).modCount++;
    }

    public l(int i3) {
        Object[] objArr;
        if (i3 == 0) {
            objArr = f23200k;
        } else if (i3 > 0) {
            objArr = new Object[i3];
        } else {
            throw new IllegalArgumentException(M0.l(i3, "Illegal Capacity: "));
        }
        this.f23202i = objArr;
    }

    @Override
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        int length = array.length;
        int i3 = this.j;
        if (length < i3) {
            Object objNewInstance = Array.newInstance(array.getClass().getComponentType(), i3);
            m.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) objNewInstance;
        }
        int iU = u(this.j + this.f23201h);
        int i9 = this.f23201h;
        if (i9 < iU) {
            m.e0(i9, iU, 2, this.f23202i, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f23202i;
            m.Z(0, this.f23201h, objArr.length, objArr, array);
            Object[] objArr2 = this.f23202i;
            m.Z(objArr2.length - this.f23201h, 0, iU, objArr2, array);
        }
        int i10 = this.j;
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @Override
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        v();
        o(elements.size() + d());
        n(u(d() + this.f23201h), elements);
        return true;
    }
}
