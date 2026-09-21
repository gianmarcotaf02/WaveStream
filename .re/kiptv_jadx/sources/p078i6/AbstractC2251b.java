package p078i6;

/* JADX INFO: renamed from: i6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2251b implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f23192i;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.f23191h;
        if (i3 == 0) {
            this.f23191h = 3;
            a();
            return this.f23191h == 1;
        }
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i3 = this.f23191h;
        if (i3 == 1) {
            this.f23191h = 0;
            return this.f23192i;
        }
        if (i3 != 2) {
            this.f23191h = 3;
            a();
            if (this.f23191h == 1) {
                this.f23191h = 0;
                return this.f23192i;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
