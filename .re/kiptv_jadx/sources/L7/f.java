package L7;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements java.util.Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f7097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f7098i;
    public final /* synthetic */ L7.g j;

    public f(L7.g gVar) {
        this.j = gVar;
        this.f7098i = ((java.util.AbstractList) gVar).modCount;
    }

    public final void a() {
        L7.g gVar = this.j;
        int i3 = ((java.util.AbstractList) gVar).modCount;
        int i9 = this.f7098i;
        if (i3 == i9) {
            return;
        }
        throw new java.util.ConcurrentModificationException("ModCount: " + ((java.util.AbstractList) gVar).modCount + "; expected: " + i9);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f7097h;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.f7097h) {
            throw new java.util.NoSuchElementException();
        }
        this.f7097h = true;
        a();
        return this.j.f7100i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.j.clear();
    }
}
