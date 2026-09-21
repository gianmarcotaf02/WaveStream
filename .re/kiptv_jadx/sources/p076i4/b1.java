package p076i4;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends java.util.AbstractSet {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p076i4.AbstractC2214p0 f22869h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p076i4.AbstractC2214p0 f22870i;

    public b1(p076i4.AbstractC2214p0 abstractC2214p0, p076i4.AbstractC2214p0 abstractC2214p1) {
        this.f22869h = abstractC2214p0;
        this.f22870i = abstractC2214p1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f22869h.contains(obj) && this.f22870i.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.f22869h.containsAll(collection) && this.f22870i.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return java.util.Collections.disjoint(this.f22870i, this.f22869h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new p076i4.C2217r0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Iterator it = this.f22869h.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (this.f22870i.contains(it.next())) {
                i3++;
            }
        }
        return i3;
    }
}
