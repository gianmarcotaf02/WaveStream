package D6;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2454i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2455k;

    public b(char c9, char c10, int i3) {
        this.f2453h = i3;
        this.f2454i = c10;
        boolean z6 = false;
        if (i3 <= 0 ? kotlin.jvm.internal.m.f(c9, c10) >= 0 : kotlin.jvm.internal.m.f(c9, c10) <= 0) {
            z6 = true;
        }
        this.j = z6;
        this.f2455k = z6 ? c9 : c10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i3 = this.f2455k;
        if (i3 != this.f2454i) {
            this.f2455k = this.f2453h + i3;
        } else {
            if (!this.j) {
                throw new java.util.NoSuchElementException();
            }
            this.j = false;
        }
        return java.lang.Character.valueOf((char) i3);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
