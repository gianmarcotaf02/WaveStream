package p014b4;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends p014b4.f implements java.util.List, java.util.RandomAccess {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p014b4.g f17889i = new p014b4.g(p014b4.m.f17893l, 0);

    public static p014b4.m p(java.lang.Object[] objArr, int i3) {
        return i3 == 0 ? p014b4.m.f17893l : new p014b4.m(objArr, i3);
    }

    @Override // java.util.List
    public final void add(int i3, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p014b4.f
    public int d(java.lang.Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i3 = 0; i3 < size; i3++) {
                        if (p014b4.AbstractC1659a.d(get(i3), list.get(i3))) {
                        }
                    }
                    return true;
                }
                p014b4.g gVarListIterator = listIterator(0);
                java.util.Iterator it = list.iterator();
                while (gVarListIterator.hasNext()) {
                    if (it.hasNext() && p014b4.AbstractC1659a.d(gVarListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i3 = 0; i3 < size; i3++) {
            iHashCode = (iHashCode * 31) + get(i3).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
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

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o */
    public p014b4.j subList(int i3, int i9) {
        p014b4.AbstractC1659a.f(i3, i9, size());
        int i10 = i9 - i3;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? p014b4.m.f17893l : new p014b4.i(this, i3, i10);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final p014b4.g listIterator(int i3) {
        int size = size();
        if (i3 < 0 || i3 > size) {
            throw new java.lang.IndexOutOfBoundsException(p014b4.AbstractC1659a.g(i3, size, "index"));
        }
        return isEmpty() ? f17889i : new p014b4.g(this, i3);
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i3) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
