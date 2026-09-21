package p070h6;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements java.util.Collection, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final short[] f22557h;

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

    /* JADX WARN: Code duplicated, block: B:13:0x001b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x001d A[RETURN] */
    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof p070h6.y)) {
            return false;
        }
        short s9 = ((p070h6.y) obj).f22556h;
        short[] sArr = this.f22557h;
        int length = sArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (s9 == sArr[i3]) {
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
                if (obj instanceof p070h6.y) {
                    short s9 = ((p070h6.y) obj).f22556h;
                    short[] sArr = this.f22557h;
                    int length = sArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (s9 == sArr[i3]) {
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
        if (obj instanceof p070h6.z) {
            return kotlin.jvm.internal.m.a(this.f22557h, ((p070h6.z) obj).f22557h);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f22557h);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f22557h.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new D1.X(4, this.f22557h);
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
        return this.f22557h.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    public final java.lang.String toString() {
        return "UShortArray(storage=" + java.util.Arrays.toString(this.f22557h) + ')';
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.l.b(this, array);
    }
}
