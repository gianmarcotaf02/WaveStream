package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends com.google.android.gms.internal.play_billing.AbstractC1863o implements java.util.List, java.util.RandomAccess {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1865p f19379i = new com.google.android.gms.internal.play_billing.C1865p(com.google.android.gms.internal.play_billing.C1876v.f19394l, 0);

    public static com.google.android.gms.internal.play_billing.C1876v r(java.lang.Object[] objArr, int i3) {
        return i3 == 0 ? com.google.android.gms.internal.play_billing.C1876v.f19394l : new com.google.android.gms.internal.play_billing.C1876v(objArr, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.android.gms.internal.play_billing.r s(java.util.List list) {
        if (!(list instanceof com.google.android.gms.internal.play_billing.AbstractC1863o)) {
            java.lang.Object[] array = list.toArray();
            int length = array.length;
            P3.e.p0(array, length);
            return r(array, length);
        }
        com.google.android.gms.internal.play_billing.r rVarN = ((com.google.android.gms.internal.play_billing.AbstractC1863o) list).n();
        if (!rVarN.o()) {
            return rVarN;
        }
        java.lang.Object[] array2 = rVarN.toArray(com.google.android.gms.internal.play_billing.AbstractC1863o.f19361h);
        return r(array2, array2.length);
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
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
                        if (java.util.Objects.equals(get(i3), list.get(i3))) {
                        }
                    }
                    return true;
                }
                com.google.android.gms.internal.play_billing.C1865p c1865pListIterator = listIterator(0);
                java.util.Iterator it = list.iterator();
                while (c1865pListIterator.hasNext()) {
                    if (it.hasNext() && java.util.Objects.equals(c1865pListIterator.next(), it.next())) {
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC1863o
    public final com.google.android.gms.internal.play_billing.r n() {
        return this;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q */
    public com.google.android.gms.internal.play_billing.r subList(int i3, int i9) {
        E8.d.e0(i3, i9, size());
        int i10 = i9 - i3;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? com.google.android.gms.internal.play_billing.C1876v.f19394l : new com.google.android.gms.internal.play_billing.C1867q(this, i3, i10);
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
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.C1865p listIterator(int i3) {
        E8.d.d0(i3, size());
        return isEmpty() ? f19379i : new com.google.android.gms.internal.play_billing.C1865p(this, i3);
    }
}
