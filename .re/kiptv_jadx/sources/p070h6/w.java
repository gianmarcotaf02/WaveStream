package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements java.util.Collection, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long[] f22554h;

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

    /* JADX WARN: Code duplicated, block: B:13:0x001d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001f A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof p070h6.v)) {
            return false;
        }
        long j = ((p070h6.v) obj).f22553h;
        long[] jArr = this.f22554h;
        int length = jArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (j == jArr[i3]) {
                if (i3 >= 0) {
                    return true;
                }
                return false;
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        java.util.Collection collection = elements;
        if (!collection.isEmpty()) {
            for (java.lang.Object obj : collection) {
                if (obj instanceof p070h6.v) {
                    long j = ((p070h6.v) obj).f22553h;
                    long[] jArr = this.f22554h;
                    int length = jArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (j == jArr[i3]) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p070h6.w) {
            return kotlin.jvm.internal.m.a(this.f22554h, ((p070h6.w) obj).f22554h);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f22554h);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f22554h.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new D1.X(3, this.f22554h);
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
        return this.f22554h.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    public final java.lang.String toString() {
        return "ULongArray(storage=" + java.util.Arrays.toString(this.f22554h) + ')';
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.l.b(this, array);
    }
}
