package p064h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object[] f22451h = p064h0.k.f22446e.f22450d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22452i;
    public int j;

    public final void a(java.lang.Object[] objArr, int i3, int i9) {
        this.f22451h = objArr;
        this.f22452i = i3;
        this.j = i9;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j < this.f22452i;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
