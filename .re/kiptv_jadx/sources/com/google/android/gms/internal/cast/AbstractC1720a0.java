package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1720a0 extends com.google.android.gms.internal.cast.X implements java.util.List, java.util.RandomAccess {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.Y f18863i = new com.google.android.gms.internal.cast.Y(com.google.android.gms.internal.cast.C1736e0.f18895l, 0);

    public static com.google.android.gms.internal.cast.C1736e0 p(java.lang.Object[] objArr, int i3) {
        return i3 == 0 ? com.google.android.gms.internal.cast.C1736e0.f18895l : new com.google.android.gms.internal.cast.C1736e0(objArr, i3);
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
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.cast.X
    public int d(java.lang.Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        java.lang.Object next;
        java.lang.Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i3 = 0; i3 < size; i3++) {
                        java.lang.Object obj2 = get(i3);
                        java.lang.Object obj3 = list.get(i3);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                com.google.android.gms.internal.cast.Y yListIterator = listIterator(0);
                java.util.Iterator it = list.iterator();
                while (yListIterator.hasNext()) {
                    if (it.hasNext() && ((next = yListIterator.next()) == (next2 = it.next()) || (next != null && next.equals(next2)))) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ java.util.Iterator iterator() {
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

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o */
    public com.google.android.gms.internal.cast.AbstractC1720a0 subList(int i3, int i9) {
        com.google.android.gms.internal.cast.H.n(i3, i9, size());
        int i10 = i9 - i3;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? com.google.android.gms.internal.cast.C1736e0.f18895l : new com.google.android.gms.internal.cast.Z(this, i3, i10);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.cast.Y listIterator(int i3) {
        com.google.android.gms.internal.cast.H.l(i3, size());
        return isEmpty() ? f18863i : new com.google.android.gms.internal.cast.Y(this, i3);
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
