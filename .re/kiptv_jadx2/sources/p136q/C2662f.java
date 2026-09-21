package p136q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p078i6.m;
import p078i6.o;
import p144r.a;
import p201y6.b;
import p201y6.e;

public final class C2662f implements Collection, Set, b, e {

    public int[] f26381h = a.f26669a;

    public Object[] f26382i = a.f26671c;
    public int j;

    public C2662f(int i3) {
        if (i3 > 0) {
            AbstractC2674s.b(this, i3);
        }
    }

    @Override
    public final boolean add(Object obj) {
        int i3;
        int iC;
        int i9 = this.j;
        if (obj == null) {
            iC = AbstractC2674s.c(this, null, 0);
            i3 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i3 = iHashCode;
            iC = AbstractC2674s.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i10 = ~iC;
        int[] iArr = this.f26381h;
        if (i9 >= iArr.length) {
            int i11 = 8;
            if (i9 >= 8) {
                i11 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i11 = 4;
            }
            Object[] objArr = this.f26382i;
            AbstractC2674s.b(this, i11);
            if (i9 != this.j) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f26381h;
            if (iArr2.length != 0) {
                m.d0(0, iArr.length, 6, iArr, iArr2);
                m.e0(0, objArr.length, 6, objArr, this.f26382i);
            }
        }
        if (i10 < i9) {
            int[] iArr3 = this.f26381h;
            int i12 = i10 + 1;
            m.Y(i12, i10, i9, iArr3, iArr3);
            Object[] objArr2 = this.f26382i;
            m.Z(i12, i10, i9, objArr2, objArr2);
        }
        int i13 = this.j;
        if (i9 == i13) {
            int[] iArr4 = this.f26381h;
            if (i10 < iArr4.length) {
                iArr4[i10] = i3;
                this.f26382i[i10] = obj;
                this.j = i13 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        int size = elements.size() + this.j;
        int i3 = this.j;
        int[] iArr = this.f26381h;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f26382i;
            AbstractC2674s.b(this, size);
            int i9 = this.j;
            if (i9 > 0) {
                m.d0(0, i9, 6, iArr, this.f26381h);
                m.e0(0, this.j, 6, objArr, this.f26382i);
            }
        }
        if (this.j != i3) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override
    public final void clear() {
        if (this.j != 0) {
            this.f26381h = a.f26669a;
            this.f26382i = a.f26671c;
            this.j = 0;
        }
        if (this.j != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC2674s.c(this, null, 0) : AbstractC2674s.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object d(int i3) {
        int i9 = this.j;
        Object[] objArr = this.f26382i;
        Object obj = objArr[i3];
        if (i9 <= 1) {
            clear();
            return obj;
        }
        int i10 = i9 - 1;
        int[] iArr = this.f26381h;
        if (iArr.length <= 8 || i9 >= iArr.length / 3) {
            if (i3 < i10) {
                int i11 = i3 + 1;
                m.Y(i3, i11, i9, iArr, iArr);
                Object[] objArr2 = this.f26382i;
                m.Z(i3, i11, i9, objArr2, objArr2);
            }
            this.f26382i[i10] = null;
        } else {
            AbstractC2674s.b(this, i9 > 8 ? i9 + (i9 >> 1) : 8);
            if (i3 > 0) {
                m.d0(0, i3, 6, iArr, this.f26381h);
                m.e0(0, i3, 6, objArr, this.f26382i);
            }
            if (i3 < i10) {
                int i12 = i3 + 1;
                m.Y(i3, i12, i9, iArr, this.f26381h);
                m.Z(i3, i12, i9, objArr, this.f26382i);
            }
        }
        if (i9 != this.j) {
            throw new ConcurrentModificationException();
        }
        this.j = i10;
        return obj;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.j != ((Set) obj).size()) {
            return false;
        }
        try {
            int i3 = this.j;
            for (int i9 = 0; i9 < i3; i9++) {
                if (!((Set) obj).contains(this.f26382i[i9])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        int[] iArr = this.f26381h;
        int i3 = this.j;
        int i9 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            i9 += iArr[i10];
        }
        return i9;
    }

    @Override
    public final boolean isEmpty() {
        return this.j <= 0;
    }

    @Override
    public final Iterator iterator() {
        return new C2657a(this);
    }

    @Override
    public final boolean remove(Object obj) {
        int iC = obj == null ? AbstractC2674s.c(this, null, 0) : AbstractC2674s.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        d(iC);
        return true;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        boolean z6 = false;
        for (int i3 = this.j - 1; -1 < i3; i3--) {
            if (!o.b1(elements, this.f26382i[i3])) {
                d(i3);
                z6 = true;
            }
        }
        return z6;
    }

    @Override
    public final int size() {
        return this.j;
    }

    @Override
    public final Object[] toArray() {
        return m.g0(this.f26382i, 0, this.j);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.j * 14);
        sb.append('{');
        int i3 = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = this.f26382i[i9];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        int i3 = this.j;
        if (array.length < i3) {
            array = (Object[]) Array.newInstance(array.getClass().getComponentType(), i3);
        } else if (array.length > i3) {
            array[i3] = null;
        }
        m.Z(0, 0, this.j, this.f26382i, array);
        return array;
    }
}
