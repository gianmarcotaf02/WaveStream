package D6;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f2466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f2467i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2468k;

    public i(long j, long j9, long j10) {
        this.f2466h = j10;
        this.f2467i = j9;
        boolean z6 = false;
        if (j10 <= 0 ? j >= j9 : j <= j9) {
            z6 = true;
        }
        this.j = z6;
        this.f2468k = z6 ? j : j9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        long j = this.f2468k;
        if (j != this.f2467i) {
            this.f2468k = this.f2466h + j;
        } else {
            if (!this.j) {
                throw new java.util.NoSuchElementException();
            }
            this.j = false;
        }
        return java.lang.Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
