package N7;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements java.util.Iterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7437h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7438i;
    public final java.util.Iterator j;

    public d(java.util.Iterator iterator) {
        kotlin.jvm.internal.m.e(iterator, "iterator");
        this.j = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        switch (this.f7437h) {
            case 0:
                break;
            case 1:
                return this.f7438i > 0 && this.j.hasNext();
            default:
                return this.j.hasNext();
        }
        while (true) {
            int i3 = this.f7438i;
            it = this.j;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f7438i--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.util.Iterator it;
        switch (this.f7437h) {
            case 0:
                break;
            case 1:
                int i3 = this.f7438i;
                if (i3 == 0) {
                    throw new java.util.NoSuchElementException();
                }
                this.f7438i = i3 - 1;
                return this.j.next();
            default:
                int i9 = this.f7438i;
                this.f7438i = i9 + 1;
                if (i9 >= 0) {
                    return new p078i6.z(i9, this.j.next());
                }
                p078i6.p.H0();
                throw null;
        }
        while (true) {
            int i10 = this.f7438i;
            it = this.j;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f7438i--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7437h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(N7.e eVar, byte b9) {
        this.f7438i = eVar.f7441c;
        this.j = eVar.f7440b.iterator();
    }

    public d(N7.e eVar) {
        this.j = eVar.f7440b.iterator();
        this.f7438i = eVar.f7441c;
    }
}
