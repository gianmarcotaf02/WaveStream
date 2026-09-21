package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public abstract class X extends java.util.AbstractCollection implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object[] f18844h = new java.lang.Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract int d(java.lang.Object[] objArr);

    public int e() {
        throw new java.lang.UnsupportedOperationException();
    }

    public int f() {
        throw new java.lang.UnsupportedOperationException();
    }

    public java.lang.Object[] n() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return java.util.Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(f18844h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            java.lang.Object[] objArrN = n();
            if (objArrN != null) {
                return java.util.Arrays.copyOfRange(objArrN, f(), e(), objArr.getClass());
            }
            if (length != 0) {
                objArr = java.util.Arrays.copyOf(objArr, 0);
            }
            objArr = java.util.Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        d(objArr);
        return objArr;
    }
}
