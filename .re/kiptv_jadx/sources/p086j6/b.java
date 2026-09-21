package p086j6;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p078i6.AbstractC2257h implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p086j6.b f24234k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object[] f24235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24236i;
    public boolean j;

    static {
        p086j6.b bVar = new p086j6.b(0);
        bVar.j = true;
        f24234k = bVar;
    }

    public b(int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("capacity must be non-negative.");
        }
        this.f24235h = new java.lang.Object[i3];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        q();
        int i3 = this.f24236i;
        ((java.util.AbstractList) this).modCount++;
        r(i3, 1);
        this.f24235h[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        q();
        int size = elements.size();
        o(this.f24236i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        q();
        t(0, this.f24236i);
    }

    @Override // p078i6.AbstractC2257h
    public final int d() {
        return this.f24236i;
    }

    @Override // p078i6.AbstractC2257h
    public final java.lang.Object e(int i3) {
        q();
        int i9 = this.f24236i;
        if (i3 < 0 || i3 >= i9) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "index: ", ", size: "));
        }
        return s(i3);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            if (com.google.common.util.concurrent.P.J(this.f24235h, 0, this.f24236i, (java.util.List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        int i9 = this.f24236i;
        if (i3 < 0 || i3 >= i9) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "index: ", ", size: "));
        }
        return this.f24235h[i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        java.lang.Object[] objArr = this.f24235h;
        int i3 = this.f24236i;
        int iHashCode = 1;
        for (int i9 = 0; i9 < i3; i9++) {
            java.lang.Object obj = objArr[i9];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        for (int i3 = 0; i3 < this.f24236i; i3++) {
            if (kotlin.jvm.internal.m.a(this.f24235h[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f24236i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        for (int i3 = this.f24236i - 1; i3 >= 0; i3--) {
            if (kotlin.jvm.internal.m.a(this.f24235h[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    public final void o(int i3, java.util.Collection collection, int i9) {
        ((java.util.AbstractList) this).modCount++;
        r(i3, i9);
        java.util.Iterator it = collection.iterator();
        for (int i10 = 0; i10 < i9; i10++) {
            this.f24235h[i3 + i10] = it.next();
        }
    }

    public final void p(int i3, java.lang.Object obj) {
        ((java.util.AbstractList) this).modCount++;
        r(i3, 1);
        this.f24235h[i3] = obj;
    }

    public final void q() {
        if (this.j) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void r(int i3, int i9) {
        int i10 = this.f24236i + i9;
        if (i10 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.Object[] objArr = this.f24235h;
        if (i10 > objArr.length) {
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                i11 = i10 > 2147483639 ? androidx.media3.common.util.Log.LOG_LEVEL_OFF : 2147483639;
            }
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, i11);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f24235h = objArrCopyOf;
        }
        java.lang.Object[] objArr2 = this.f24235h;
        p078i6.m.Z(i3 + i9, i3, this.f24236i, objArr2, objArr2);
        this.f24236i += i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        q();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            e(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        q();
        return u(0, this.f24236i, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        q();
        return u(0, this.f24236i, elements, true) > 0;
    }

    public final java.lang.Object s(int i3) {
        ((java.util.AbstractList) this).modCount++;
        java.lang.Object[] objArr = this.f24235h;
        java.lang.Object obj = objArr[i3];
        p078i6.m.Z(i3, i3 + 1, this.f24236i, objArr, objArr);
        java.lang.Object[] objArr2 = this.f24235h;
        int i9 = this.f24236i - 1;
        kotlin.jvm.internal.m.e(objArr2, "<this>");
        objArr2[i9] = null;
        this.f24236i--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        q();
        int i9 = this.f24236i;
        if (i3 < 0 || i3 >= i9) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "index: ", ", size: "));
        }
        java.lang.Object[] objArr = this.f24235h;
        java.lang.Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.List subList(int i3, int i9) {
        com.google.common.util.concurrent.AbstractC1903s.n(i3, i9, this.f24236i);
        return new p086j6.a(this.f24235h, i3, i9 - i3, null, this);
    }

    public final void t(int i3, int i9) {
        if (i9 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        java.lang.Object[] objArr = this.f24235h;
        p078i6.m.Z(i3, i3 + i9, this.f24236i, objArr, objArr);
        java.lang.Object[] objArr2 = this.f24235h;
        int i10 = this.f24236i;
        com.google.common.util.concurrent.P.q0(objArr2, i10 - i9, i10);
        this.f24236i -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        int length = array.length;
        int i3 = this.f24236i;
        if (length < i3) {
            java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(this.f24235h, 0, i3, array.getClass());
            kotlin.jvm.internal.m.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        p078i6.m.Z(0, 0, i3, this.f24235h, array);
        int i9 = this.f24236i;
        if (i9 < array.length) {
            array[i9] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return com.google.common.util.concurrent.P.K(this.f24235h, 0, this.f24236i, this);
    }

    public final int u(int i3, int i9, java.util.Collection collection, boolean z6) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = i3 + i10;
            if (collection.contains(this.f24235h[i12]) == z6) {
                java.lang.Object[] objArr = this.f24235h;
                i10++;
                objArr[i11 + i3] = objArr[i12];
                i11++;
            } else {
                i10++;
            }
        }
        int i13 = i9 - i11;
        java.lang.Object[] objArr2 = this.f24235h;
        p078i6.m.Z(i3 + i11, i9 + i3, this.f24236i, objArr2, objArr2);
        java.lang.Object[] objArr3 = this.f24235h;
        int i14 = this.f24236i;
        com.google.common.util.concurrent.P.q0(objArr3, i14 - i13, i14);
        if (i13 > 0) {
            ((java.util.AbstractList) this).modCount++;
        }
        this.f24236i -= i13;
        return i13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        int i9 = this.f24236i;
        if (i3 < 0 || i3 > i9) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "index: ", ", size: "));
        }
        return new Q0.C0781o(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        q();
        int i9 = this.f24236i;
        if (i3 >= 0 && i3 <= i9) {
            int size = elements.size();
            o(i3, elements, size);
            return size > 0;
        }
        throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        q();
        int i9 = this.f24236i;
        if (i3 >= 0 && i3 <= i9) {
            ((java.util.AbstractList) this).modCount++;
            r(i3, 1);
            this.f24235h[i3] = obj;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return p078i6.m.g0(this.f24235h, 0, this.f24236i);
    }
}
