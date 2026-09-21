package p136q;

/* JADX INFO: renamed from: q.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2662f implements java.util.Collection, java.util.Set, p201y6.b, p201y6.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f26381h = p144r.a.f26669a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object[] f26382i = p144r.a.f26671c;
    public int j;

    public C2662f(int i3) {
        if (i3 > 0) {
            p136q.AbstractC2674s.b(this, i3);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        int i3;
        int iC;
        int i9 = this.j;
        if (obj == null) {
            iC = p136q.AbstractC2674s.c(this, null, 0);
            i3 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i3 = iHashCode;
            iC = p136q.AbstractC2674s.c(this, obj, iHashCode);
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
            java.lang.Object[] objArr = this.f26382i;
            p136q.AbstractC2674s.b(this, i11);
            if (i9 != this.j) {
                throw new java.util.ConcurrentModificationException();
            }
            int[] iArr2 = this.f26381h;
            if (iArr2.length != 0) {
                p078i6.m.d0(0, iArr.length, 6, iArr, iArr2);
                p078i6.m.e0(0, objArr.length, 6, objArr, this.f26382i);
            }
        }
        if (i10 < i9) {
            int[] iArr3 = this.f26381h;
            int i12 = i10 + 1;
            p078i6.m.Y(i12, i10, i9, iArr3, iArr3);
            java.lang.Object[] objArr2 = this.f26382i;
            p078i6.m.Z(i12, i10, i9, objArr2, objArr2);
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
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        int size = elements.size() + this.j;
        int i3 = this.j;
        int[] iArr = this.f26381h;
        boolean zAdd = false;
        if (iArr.length < size) {
            java.lang.Object[] objArr = this.f26382i;
            p136q.AbstractC2674s.b(this, size);
            int i9 = this.j;
            if (i9 > 0) {
                p078i6.m.d0(0, i9, 6, iArr, this.f26381h);
                p078i6.m.e0(0, this.j, 6, objArr, this.f26382i);
            }
        }
        if (this.j != i3) {
            throw new java.util.ConcurrentModificationException();
        }
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.j != 0) {
            this.f26381h = p144r.a.f26669a;
            this.f26382i = p144r.a.f26671c;
            this.j = 0;
        }
        if (this.j != 0) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return (obj == null ? p136q.AbstractC2674s.c(this, null, 0) : p136q.AbstractC2674s.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.Object d(int i3) {
        int i9 = this.j;
        java.lang.Object[] objArr = this.f26382i;
        java.lang.Object obj = objArr[i3];
        if (i9 <= 1) {
            clear();
            return obj;
        }
        int i10 = i9 - 1;
        int[] iArr = this.f26381h;
        if (iArr.length <= 8 || i9 >= iArr.length / 3) {
            if (i3 < i10) {
                int i11 = i3 + 1;
                p078i6.m.Y(i3, i11, i9, iArr, iArr);
                java.lang.Object[] objArr2 = this.f26382i;
                p078i6.m.Z(i3, i11, i9, objArr2, objArr2);
            }
            this.f26382i[i10] = null;
        } else {
            p136q.AbstractC2674s.b(this, i9 > 8 ? i9 + (i9 >> 1) : 8);
            if (i3 > 0) {
                p078i6.m.d0(0, i3, 6, iArr, this.f26381h);
                p078i6.m.e0(0, i3, 6, objArr, this.f26382i);
            }
            if (i3 < i10) {
                int i12 = i3 + 1;
                p078i6.m.Y(i3, i12, i9, iArr, this.f26381h);
                p078i6.m.Z(i3, i12, i9, objArr, this.f26382i);
            }
        }
        if (i9 != this.j) {
            throw new java.util.ConcurrentModificationException();
        }
        this.j = i10;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set) || this.j != ((java.util.Set) obj).size()) {
            return false;
        }
        try {
            int i3 = this.j;
            for (int i9 = 0; i9 < i3; i9++) {
                if (!((java.util.Set) obj).contains(this.f26382i[i9])) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f26381h;
        int i3 = this.j;
        int i9 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            i9 += iArr[i10];
        }
        return i9;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.j <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new p136q.C2657a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int iC = obj == null ? p136q.AbstractC2674s.c(this, null, 0) : p136q.AbstractC2674s.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        d(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        java.util.Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        boolean z6 = false;
        for (int i3 = this.j - 1; -1 < i3; i3--) {
            if (!p078i6.o.b1(elements, this.f26382i[i3])) {
                d(i3);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.j;
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        return p078i6.m.g0(this.f26382i, 0, this.j);
    }

    public final java.lang.String toString() {
        if (isEmpty()) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.j * 14);
        sb.append('{');
        int i3 = this.j;
        for (int i9 = 0; i9 < i3; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = this.f26382i[i9];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        int i3 = this.j;
        if (array.length < i3) {
            array = (java.lang.Object[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), i3);
        } else if (array.length > i3) {
            array[i3] = null;
        }
        p078i6.m.Z(0, 0, this.j, this.f26382i, array);
        return array;
    }
}
