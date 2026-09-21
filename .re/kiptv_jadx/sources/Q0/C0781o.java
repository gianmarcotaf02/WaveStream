package Q0;

/* JADX INFO: renamed from: Q0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0781o implements java.util.ListIterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8453i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Object f8455l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0781o(Q0.C0783q c0783q, int i3, int i9) {
        this(c0783q, (i9 & 1) != 0 ? 0 : i3, 0, c0783q.f8458h.f26304b);
        this.f8452h = 0;
    }

    public void a() {
        if (((java.util.AbstractList) ((p086j6.a) this.f8455l).f24233l).modCount != this.f8454k) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        switch (this.f8452h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i3 = this.f8453i;
                this.f8453i = i3 + 1;
                p086j6.a aVar = (p086j6.a) this.f8455l;
                aVar.add(i3, obj);
                this.j = -1;
                this.f8454k = ((java.util.AbstractList) aVar).modCount;
                return;
            case 2:
                b();
                int i9 = this.f8453i;
                this.f8453i = i9 + 1;
                p086j6.b bVar = (p086j6.b) this.f8455l;
                bVar.add(i9, obj);
                this.j = -1;
                this.f8454k = ((java.util.AbstractList) bVar).modCount;
                return;
            default:
                c();
                int i10 = this.f8453i + 1;
                p121o0.n nVar = (p121o0.n) this.f8455l;
                nVar.add(i10, obj);
                this.j = -1;
                this.f8453i++;
                this.f8454k = p121o0.o.g(nVar);
                return;
        }
    }

    public void b() {
        if (((java.util.AbstractList) ((p086j6.b) this.f8455l)).modCount != this.f8454k) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public void c() {
        if (p121o0.o.g((p121o0.n) this.f8455l) != this.f8454k) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8452h) {
            case 0:
                return this.f8453i < this.f8454k;
            case 1:
                return this.f8453i < ((p086j6.a) this.f8455l).j;
            case 2:
                return this.f8453i < ((p086j6.b) this.f8455l).f24236i;
            default:
                return this.f8453i < ((p121o0.n) this.f8455l).size() - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f8452h) {
            case 0:
                return this.f8453i > this.j;
            case 1:
                return this.f8453i > 0;
            case 2:
                return this.f8453i > 0;
            default:
                return this.f8453i >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f8452h) {
            case 0:
                p136q.D d4 = ((Q0.C0783q) this.f8455l).f8458h;
                int i3 = this.f8453i;
                this.f8453i = i3 + 1;
                java.lang.Object objF = d4.f(i3);
                kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (p137q0.o) objF;
            case 1:
                a();
                int i9 = this.f8453i;
                p086j6.a aVar = (p086j6.a) this.f8455l;
                if (i9 >= aVar.j) {
                    throw new java.util.NoSuchElementException();
                }
                this.f8453i = i9 + 1;
                this.j = i9;
                return aVar.f24230h[aVar.f24231i + i9];
            case 2:
                b();
                int i10 = this.f8453i;
                p086j6.b bVar = (p086j6.b) this.f8455l;
                if (i10 >= bVar.f24236i) {
                    throw new java.util.NoSuchElementException();
                }
                this.f8453i = i10 + 1;
                this.j = i10;
                return bVar.f24235h[i10];
            default:
                c();
                int i11 = this.f8453i + 1;
                this.j = i11;
                p121o0.n nVar = (p121o0.n) this.f8455l;
                p121o0.o.a(i11, nVar.size());
                java.lang.Object obj = nVar.get(i11);
                this.f8453i = i11;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f8452h) {
            case 0:
                return this.f8453i - this.j;
            case 1:
                return this.f8453i;
            case 2:
                return this.f8453i;
            default:
                return this.f8453i + 1;
        }
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        switch (this.f8452h) {
            case 0:
                p136q.D d4 = ((Q0.C0783q) this.f8455l).f8458h;
                int i3 = this.f8453i - 1;
                this.f8453i = i3;
                java.lang.Object objF = d4.f(i3);
                kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (p137q0.o) objF;
            case 1:
                a();
                int i9 = this.f8453i;
                if (i9 <= 0) {
                    throw new java.util.NoSuchElementException();
                }
                int i10 = i9 - 1;
                this.f8453i = i10;
                this.j = i10;
                p086j6.a aVar = (p086j6.a) this.f8455l;
                return aVar.f24230h[aVar.f24231i + i10];
            case 2:
                b();
                int i11 = this.f8453i;
                if (i11 <= 0) {
                    throw new java.util.NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f8453i = i12;
                this.j = i12;
                return ((p086j6.b) this.f8455l).f24235h[i12];
            default:
                c();
                int i13 = this.f8453i;
                p121o0.n nVar = (p121o0.n) this.f8455l;
                p121o0.o.a(i13, nVar.size());
                int i14 = this.f8453i;
                this.j = i14;
                java.lang.Object obj = nVar.get(i14);
                this.f8453i--;
                return obj;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f8452h) {
            case 0:
                return (this.f8453i - this.j) - 1;
            case 1:
                return this.f8453i - 1;
            case 2:
                return this.f8453i - 1;
            default:
                return this.f8453i;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f8452h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i3 = this.j;
                if (i3 == -1) {
                    throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                p086j6.a aVar = (p086j6.a) this.f8455l;
                aVar.e(i3);
                this.f8453i = this.j;
                this.j = -1;
                this.f8454k = ((java.util.AbstractList) aVar).modCount;
                return;
            case 2:
                b();
                int i9 = this.j;
                if (i9 == -1) {
                    throw new java.lang.IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                p086j6.b bVar = (p086j6.b) this.f8455l;
                bVar.e(i9);
                this.f8453i = this.j;
                this.j = -1;
                this.f8454k = ((java.util.AbstractList) bVar).modCount;
                return;
            default:
                c();
                int i10 = this.j;
                p121o0.n nVar = (p121o0.n) this.f8455l;
                nVar.remove(i10);
                this.f8453i--;
                this.j = -1;
                this.f8454k = p121o0.o.g(nVar);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        switch (this.f8452h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i3 = this.j;
                if (i3 == -1) {
                    throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((p086j6.a) this.f8455l).set(i3, obj);
                return;
            case 2:
                b();
                int i9 = this.j;
                if (i9 == -1) {
                    throw new java.lang.IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((p086j6.b) this.f8455l).set(i9, obj);
                return;
            default:
                c();
                int i10 = this.j;
                if (i10 < 0) {
                    throw new java.lang.IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                p121o0.n nVar = (p121o0.n) this.f8455l;
                nVar.set(i10, obj);
                this.f8454k = p121o0.o.g(nVar);
                return;
        }
    }

    public C0781o(p086j6.b bVar, int i3) {
        this.f8452h = 2;
        this.f8455l = bVar;
        this.f8453i = i3;
        this.j = -1;
        this.f8454k = ((java.util.AbstractList) bVar).modCount;
    }

    public C0781o(p121o0.n nVar, int i3) {
        this.f8452h = 3;
        this.f8455l = nVar;
        this.f8453i = i3 - 1;
        this.j = -1;
        this.f8454k = p121o0.o.g(nVar);
    }

    public C0781o(Q0.C0783q c0783q, int i3, int i9, int i10) {
        this.f8452h = 0;
        this.f8455l = c0783q;
        this.f8453i = i3;
        this.j = i9;
        this.f8454k = i10;
    }

    public C0781o(p086j6.a aVar, int i3) {
        this.f8452h = 1;
        this.f8455l = aVar;
        this.f8453i = i3;
        this.j = -1;
        this.f8454k = ((java.util.AbstractList) aVar).modCount;
    }
}
