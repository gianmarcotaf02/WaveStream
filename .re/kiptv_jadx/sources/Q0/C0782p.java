package Q0;

/* JADX INFO: renamed from: Q0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0782p implements java.util.List, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8457i;
    public final /* synthetic */ Q0.C0783q j;

    public C0782p(Q0.C0783q c0783q, int i3, int i9) {
        this.j = c0783q;
        this.f8456h = i3;
        this.f8457i = i9;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i3, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i3, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return (obj instanceof p137q0.o) && indexOf((p137q0.o) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((p137q0.o) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        java.lang.Object objF = this.j.f8458h.f(i3 + this.f8456h);
        kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (p137q0.o) objF;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof p137q0.o)) {
            return -1;
        }
        p137q0.o oVar = (p137q0.o) obj;
        int i3 = this.f8456h;
        int i9 = this.f8457i;
        if (i3 <= i9) {
            int i10 = i3;
            while (!kotlin.jvm.internal.m.a(this.j.f8458h.f(i10), oVar)) {
                if (i10 != i9) {
                    i10++;
                }
            }
            return i10 - i3;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        int i3 = this.f8456h;
        return new Q0.C0781o(this.j, i3, i3, this.f8457i);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof p137q0.o)) {
            return -1;
        }
        p137q0.o oVar = (p137q0.o) obj;
        int i3 = this.f8457i;
        int i9 = this.f8456h;
        if (i9 <= i3) {
            while (!kotlin.jvm.internal.m.a(this.j.f8458h.f(i3), oVar)) {
                if (i3 != i9) {
                    i3--;
                }
            }
            return i3 - i9;
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        int i3 = this.f8456h;
        return new Q0.C0781o(this.j, i3, i3, this.f8457i);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ java.lang.Object removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ java.lang.Object removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i3, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8457i - this.f8456h;
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.List subList(int i3, int i9) {
        int i10 = this.f8456h;
        return new Q0.C0782p(this.j, i3 + i10, i10 + i9);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        int i9 = this.f8456h;
        int i10 = this.f8457i;
        return new Q0.C0781o(this.j, i3 + i9, i9, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return kotlin.jvm.internal.l.b(this, objArr);
    }
}
