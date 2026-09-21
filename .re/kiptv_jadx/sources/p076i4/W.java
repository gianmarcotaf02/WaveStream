package p076i4;

/* JADX INFO: loaded from: classes.dex */
public abstract class W extends java.util.AbstractCollection implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.lang.Object[] f22843h = new java.lang.Object[0];

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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(java.lang.Object obj);

    public p076i4.AbstractC2186b0 d() {
        if (isEmpty()) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            return p076i4.S0.f22832l;
        }
        java.lang.Object[] array = toArray(f22843h);
        p076i4.Z z9 = p076i4.AbstractC2186b0.f22868i;
        return p076i4.AbstractC2186b0.r(array, array.length);
    }

    public int e(java.lang.Object[] objArr, int i3) {
        p076i4.j1 it = iterator();
        while (it.hasNext()) {
            objArr[i3] = it.next();
            i3++;
        }
        return i3;
    }

    public java.lang.Object[] f() {
        return null;
    }

    public int n() {
        throw new java.lang.UnsupportedOperationException();
    }

    public int o() {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract boolean p();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract p076i4.j1 iterator();

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
        return toArray(f22843h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            java.lang.Object[] objArrF = f();
            if (objArrF != null) {
                return java.util.Arrays.copyOfRange(objArrF, o(), n(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = java.util.Arrays.copyOf(objArr, 0);
            }
            objArr = java.util.Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        e(objArr, 0);
        return objArr;
    }
}
