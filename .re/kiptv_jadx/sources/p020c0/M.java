package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class M implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p020c0.K0 f18149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18150i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18151k;

    public M(p020c0.K0 k1, int i3, int i9) {
        this.f18149h = k1;
        this.f18150i = i9;
        this.j = i3;
        this.f18151k = k1.f18140o;
        if (k1.f18139n) {
            p020c0.M0.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j < this.f18150i;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        p020c0.K0 k1 = this.f18149h;
        int i3 = k1.f18140o;
        int i9 = this.f18151k;
        if (i3 != i9) {
            p020c0.M0.f();
        }
        int i10 = this.j;
        this.j = p020c0.M0.a(k1.f18134h, i10) + i10;
        return new p020c0.L0(k1, i10, i9);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
