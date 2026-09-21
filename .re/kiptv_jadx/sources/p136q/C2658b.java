package p136q;

/* JADX INFO: renamed from: q.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2658b implements java.util.Set {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p136q.C2661e f26373h;

    public C2658b(p136q.C2661e c2661e) {
        this.f26373h = c2661e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f26373h.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.f26373h.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.f26373h.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        p136q.C2661e c2661e = this.f26373h;
        try {
            return c2661e.j == set.size() && c2661e.j(set);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        p136q.C2661e c2661e = this.f26373h;
        int iHashCode = 0;
        for (int i3 = c2661e.j - 1; i3 >= 0; i3--) {
            java.lang.Object objE = c2661e.e(i3);
            iHashCode += objE == null ? 0 : objE.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f26373h.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new p136q.C2657a(this.f26373h, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        p136q.C2661e c2661e = this.f26373h;
        int iC = c2661e.c(obj);
        if (iC < 0) {
            return false;
        }
        c2661e.g(iC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        return this.f26373h.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        p136q.C2661e c2661e = this.f26373h;
        int i3 = c2661e.j;
        for (int i9 = i3 - 1; i9 >= 0; i9--) {
            if (!collection.contains(c2661e.e(i9))) {
                c2661e.g(i9);
            }
        }
        return i3 != c2661e.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f26373h.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        p136q.C2661e c2661e = this.f26373h;
        int i3 = c2661e.j;
        java.lang.Object[] objArr = new java.lang.Object[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = c2661e.e(i9);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        p136q.C2661e c2661e = this.f26373h;
        int i3 = c2661e.j;
        if (objArr.length < i3) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = c2661e.e(i9);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
