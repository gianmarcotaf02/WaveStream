package p076i4;

/* JADX INFO: renamed from: i4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2183a extends p076i4.j1 implements java.util.ListIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22863h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22864i;

    public AbstractC2183a(int i3, int i9) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.V(i9, i3);
        this.f22863h = i3;
        this.f22864i = i9;
    }

    public abstract java.lang.Object a(int i3);

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f22864i < this.f22863h;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f22864i > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f22864i;
        this.f22864i = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f22864i;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f22864i - 1;
        this.f22864i = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f22864i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
