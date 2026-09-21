package p076i4;

/* JADX INFO: renamed from: i4.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2186b0 extends p076i4.W implements java.util.List, java.util.RandomAccess {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p076i4.Z f22868i = new p076i4.Z(0, p076i4.S0.f22832l);

    public static p076i4.S0 A(java.util.Comparator comparator, java.util.List list) {
        comparator.getClass();
        if (list == null) {
            java.util.Iterator it = list.iterator();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        java.lang.Object[] array = list.toArray();
        p076i4.AbstractC2230y.b(array, array.length);
        java.util.Arrays.sort(array, comparator);
        return r(array, array.length);
    }

    public static p076i4.S0 r(java.lang.Object[] objArr, int i3) {
        return i3 == 0 ? p076i4.S0.f22832l : new p076i4.S0(objArr, i3);
    }

    public static p076i4.Y s() {
        return new p076i4.Y(4);
    }

    public static p076i4.Y t(int i3) {
        p076i4.AbstractC2230y.d(i3, "expectedSize");
        return new p076i4.Y(i3);
    }

    public static p076i4.AbstractC2186b0 u(java.util.Collection collection) {
        if (!(collection instanceof p076i4.W)) {
            java.lang.Object[] array = collection.toArray();
            p076i4.AbstractC2230y.b(array, array.length);
            return r(array, array.length);
        }
        p076i4.AbstractC2186b0 abstractC2186b0D = ((p076i4.W) collection).d();
        if (!abstractC2186b0D.p()) {
            return abstractC2186b0D;
        }
        java.lang.Object[] array2 = abstractC2186b0D.toArray(p076i4.W.f22843h);
        return r(array2, array2.length);
    }

    public static p076i4.S0 v(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return p076i4.S0.f22832l;
        }
        java.lang.Object[] objArr2 = (java.lang.Object[]) objArr.clone();
        p076i4.AbstractC2230y.b(objArr2, objArr2.length);
        return r(objArr2, objArr2.length);
    }

    public static p076i4.S0 x(java.lang.Long l2, java.lang.Long l9, java.lang.Long l10, java.lang.Long l11, java.lang.Long l12) {
        java.lang.Object[] objArr = {l2, l9, l10, l11, l12};
        p076i4.AbstractC2230y.b(objArr, 5);
        return r(objArr, 5);
    }

    public static p076i4.S0 y(java.lang.Object obj) {
        java.lang.Object[] objArr = {obj};
        p076i4.AbstractC2230y.b(objArr, 1);
        return r(objArr, 1);
    }

    public static p076i4.S0 z(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr = {obj, obj2};
        p076i4.AbstractC2230y.b(objArr, 2);
        return r(objArr, 2);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public p076i4.AbstractC2186b0 subList(int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.W(i3, i9, size());
        int i10 = i9 - i3;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? p076i4.S0.f22832l : new p076i4.C2184a0(i3, i10, this);
    }

    @Override // java.util.List
    public final void add(int i3, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p076i4.W
    public int e(java.lang.Object[] objArr, int i3) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i3 + i9] = get(i9);
        }
        return i3 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj != this) {
            if (obj instanceof java.util.List) {
                java.util.List list = (java.util.List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof java.util.RandomAccess)) {
                        java.util.Iterator it = iterator();
                        java.util.Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && com.google.android.gms.internal.play_billing.AbstractC1853k0.m(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        if (com.google.android.gms.internal.play_billing.AbstractC1853k0.m(get(i3), list.get(i3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i3 = ~(~(get(i9).hashCode() + (i3 * 31)));
        }
        return i3;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override // p076i4.W, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // p076i4.W
    /* JADX INFO: renamed from: q */
    public final p076i4.j1 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i3) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final p076i4.Z listIterator(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.V(i3, size());
        return isEmpty() ? f22868i : new p076i4.Z(i3, this);
    }

    public java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p076i4.W
    public final p076i4.AbstractC2186b0 d() {
        return this;
    }
}
