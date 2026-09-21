package p136q;

/* JADX INFO: renamed from: q.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2660d implements java.util.Collection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p136q.C2661e f26377h;

    public C2660d(p136q.C2661e c2661e) {
        this.f26377h = c2661e;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f26377h.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f26377h.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f26377h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new p136q.C2657a(this.f26377h, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        p136q.C2661e c2661e = this.f26377h;
        int iA = c2661e.a(obj);
        if (iA < 0) {
            return false;
        }
        c2661e.g(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        p136q.C2661e c2661e = this.f26377h;
        int i3 = c2661e.j;
        int i9 = 0;
        boolean z6 = false;
        while (i9 < i3) {
            if (collection.contains(c2661e.i(i9))) {
                c2661e.g(i9);
                i9--;
                i3--;
                z6 = true;
            }
            i9++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        p136q.C2661e c2661e = this.f26377h;
        int i3 = c2661e.j;
        int i9 = 0;
        boolean z6 = false;
        while (i9 < i3) {
            if (!collection.contains(c2661e.i(i9))) {
                c2661e.g(i9);
                i9--;
                i3--;
                z6 = true;
            }
            i9++;
        }
        return z6;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f26377h.j;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        p136q.C2661e c2661e = this.f26377h;
        int i3 = c2661e.j;
        java.lang.Object[] objArr = new java.lang.Object[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = c2661e.i(i9);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p136q.C2661e c2661e = this.f26377h;
        int i3 = c2661e.j;
        if (objArr.length < i3) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = c2661e.i(i9);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
