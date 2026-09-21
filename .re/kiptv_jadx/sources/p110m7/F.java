package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class F implements java.util.ListIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.ListIterator f25450h;

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f25450h.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f25450h.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        return (java.lang.String) this.f25450h.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f25450h.nextIndex();
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        return (java.lang.String) this.f25450h.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f25450h.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
