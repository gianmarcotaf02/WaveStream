package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements java.util.Collection, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f22552h;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
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
        if (!(obj instanceof p070h6.t)) {
            return false;
        }
        return p078i6.m.V(this.f22552h, ((p070h6.t) obj).f22551h);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        java.util.Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (java.lang.Object obj : collection) {
            if (!(obj instanceof p070h6.t)) {
                return false;
            }
            if (!p078i6.m.V(this.f22552h, ((p070h6.t) obj).f22551h)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p070h6.u) {
            return kotlin.jvm.internal.m.a(this.f22552h, ((p070h6.u) obj).f22552h);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f22552h);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f22552h.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new D1.X(2, this.f22552h);
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
        return this.f22552h.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    public final java.lang.String toString() {
        return "UIntArray(storage=" + java.util.Arrays.toString(this.f22552h) + ')';
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.l.b(this, array);
    }
}
