package p056g0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements java.util.ListIterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21749i;

    public a(int i3, int i9) {
        this.f21748h = i3;
        this.f21749i = i9;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f21748h < this.f21749i;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21748h > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21748h;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21748h - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
