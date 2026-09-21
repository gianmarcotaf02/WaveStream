package p136q;

/* JADX INFO: loaded from: classes.dex */
public final class K implements p201y6.e, java.util.Set, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p136q.I f26344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p136q.I f26345i;

    public K(p136q.I i3) {
        this.f26344h = i3;
        this.f26345i = i3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return this.f26345i.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        p136q.I i3 = this.f26345i;
        int i9 = i3.f26331d;
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            i3.j(it.next());
        }
        return i9 != i3.f26331d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f26345i.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f26344h.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f26344h.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p136q.K.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f26344h, ((p136q.K) obj).f26344h);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f26344h.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f26344h.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new N7.k(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.f26345i.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        p136q.I i3 = this.f26345i;
        i3.getClass();
        int i9 = i3.f26331d;
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            i3.i(it.next());
        }
        return i9 != i3.f26331d;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection elements) {
        boolean z6;
        kotlin.jvm.internal.m.e(elements, "elements");
        p136q.I i3 = this.f26345i;
        i3.getClass();
        java.lang.Object[] objArr = i3.f26329b;
        int i9 = i3.f26331d;
        long[] jArr = i3.f26328a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!p078i6.o.b1(elements, objArr[i13])) {
                                i3.m(i13);
                            }
                        }
                        j >>= 8;
                    }
                    z6 = false;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    z6 = false;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        } else {
            z6 = false;
        }
        if (i9 != i3.f26331d) {
            return true;
        }
        return z6;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f26344h.f26331d;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    public final java.lang.String toString() {
        return this.f26344h.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.l.b(this, array);
    }
}
