package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p014b4.p implements java.util.ListIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17885i;
    public final p014b4.j j;

    public g(p014b4.j jVar, int i3) {
        int size = jVar.size();
        if (i3 < 0 || i3 > size) {
            throw new java.lang.IndexOutOfBoundsException(p014b4.AbstractC1659a.g(i3, size, "index"));
        }
        this.f17884h = size;
        this.f17885i = i3;
        this.j = jVar;
    }

    public final java.lang.Object a(int i3) {
        return this.j.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f17885i < this.f17884h;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f17885i > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f17885i;
        this.f17885i = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f17885i;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f17885i - 1;
        this.f17885i = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f17885i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
