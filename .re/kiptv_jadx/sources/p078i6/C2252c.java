package p078i6;

/* JADX INFO: renamed from: i6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2252c extends D1.X implements java.util.ListIterator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p078i6.AbstractC2254e f23193k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2252c(p078i6.AbstractC2254e abstractC2254e, int i3) {
        super(5, abstractC2254e);
        this.f23193k = abstractC2254e;
        int iD = abstractC2254e.d();
        if (i3 < 0 || i3 > iD) {
            throw new java.lang.IndexOutOfBoundsException(com.google.android.gms.internal.play_billing.M0.k(i3, iD, "index: ", ", size: "));
        }
        this.f1988i = i3;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1988i > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1988i;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i3 = this.f1988i - 1;
        this.f1988i = i3;
        return this.f23193k.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1988i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
