package I7;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5580i = true;
    public final java.lang.Object j;

    public /* synthetic */ p(int i3, java.lang.Object obj) {
        this.f5579h = i3;
        this.j = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5579h) {
            case 0:
                break;
        }
        return this.f5580i;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f5579h) {
            case 0:
                if (!this.f5580i) {
                    throw new java.util.NoSuchElementException();
                }
                this.f5580i = false;
                return ((I7.q) this.j).f5581h;
            default:
                if (!this.f5580i) {
                    throw new java.util.NoSuchElementException();
                }
                this.f5580i = false;
                return this.j;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5579h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }
}
