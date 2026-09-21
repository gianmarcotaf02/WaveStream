package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements java.util.Collection, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object[] f23198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f23199i;

    public k(java.lang.Object[] values, boolean z6) {
        kotlin.jvm.internal.m.e(values, "values");
        this.f23198h = values;
        this.f23199i = z6;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return p078i6.m.W(this.f23198h, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        java.util.Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!p078i6.m.W(this.f23198h, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f23198h.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return kotlin.jvm.internal.m.h(this.f23198h);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f23198h.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.f23198h;
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (this.f23199i && objArr.getClass().equals(java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.l.b(this, array);
    }
}
