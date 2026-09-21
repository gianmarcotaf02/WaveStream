package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements java.util.ListIterator, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23176h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f23177i;
    public final /* synthetic */ java.lang.Object j;

    public E(O7.k kVar, int i3) {
        this.j = kVar;
        this.f23177i = ((java.util.List) kVar.f8052i).listIterator(p078i6.o.W0(i3, kVar));
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        switch (this.f23176h) {
            case 0:
                java.util.ListIterator listIterator = (java.util.ListIterator) this.f23177i;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f23176h) {
            case 0:
                return ((java.util.ListIterator) this.f23177i).hasPrevious();
            case 1:
                return ((java.util.ListIterator) this.f23177i).hasPrevious();
            default:
                return ((kotlin.jvm.internal.y) this.f23177i).f24555h < ((p121o0.w) this.j).f26030k - 1;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f23176h) {
            case 0:
                return ((java.util.ListIterator) this.f23177i).hasNext();
            case 1:
                return ((java.util.ListIterator) this.f23177i).hasNext();
            default:
                return ((kotlin.jvm.internal.y) this.f23177i).f24555h >= 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        switch (this.f23176h) {
            case 0:
                return ((java.util.ListIterator) this.f23177i).previous();
            case 1:
                return ((java.util.ListIterator) this.f23177i).previous();
            default:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f23177i;
                int i3 = yVar.f24555h + 1;
                p121o0.w wVar = (p121o0.w) this.j;
                p121o0.o.a(i3, wVar.f26030k);
                yVar.f24555h = i3;
                return wVar.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f23176h) {
            case 0:
                return p078i6.p.A0((p078i6.F) this.j) - ((java.util.ListIterator) this.f23177i).previousIndex();
            case 1:
                return p078i6.p.A0((O7.k) this.j) - ((java.util.ListIterator) this.f23177i).previousIndex();
            default:
                return ((kotlin.jvm.internal.y) this.f23177i).f24555h + 1;
        }
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        switch (this.f23176h) {
            case 0:
                return ((java.util.ListIterator) this.f23177i).next();
            case 1:
                return ((java.util.ListIterator) this.f23177i).next();
            default:
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f23177i;
                int i3 = yVar.f24555h;
                p121o0.w wVar = (p121o0.w) this.j;
                p121o0.o.a(i3, wVar.f26030k);
                yVar.f24555h = i3 - 1;
                return wVar.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f23176h) {
            case 0:
                return p078i6.p.A0((p078i6.F) this.j) - ((java.util.ListIterator) this.f23177i).nextIndex();
            case 1:
                return p078i6.p.A0((O7.k) this.j) - ((java.util.ListIterator) this.f23177i).nextIndex();
            default:
                return ((kotlin.jvm.internal.y) this.f23177i).f24555h;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f23176h) {
            case 0:
                ((java.util.ListIterator) this.f23177i).remove();
                return;
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        switch (this.f23176h) {
            case 0:
                ((java.util.ListIterator) this.f23177i).set(obj);
                return;
            case 1:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public E(p078i6.F f9, int i3) {
        this.j = f9;
        this.f23177i = f9.f23178h.listIterator(p078i6.o.W0(i3, f9));
    }

    public E(kotlin.jvm.internal.y yVar, p121o0.w wVar) {
        this.f23177i = yVar;
        this.j = wVar;
    }
}
