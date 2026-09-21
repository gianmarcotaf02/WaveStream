package Q0;

/* JADX INFO: renamed from: Q0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0783q implements java.util.List, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p136q.D f8458h = new p136q.D(16);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p136q.y f8459i = new p136q.y(16);
    public int j = -1;

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
        this.j = -1;
        this.f8458h.d();
        this.f8459i.f26439b = 0;
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

    public final long d() {
        long jA = Q0.AbstractC0777k.a(Float.POSITIVE_INFINITY, false, false);
        int i3 = this.j + 1;
        int iA0 = p078i6.p.A0(this);
        if (i3 > iA0) {
            return jA;
        }
        while (true) {
            p136q.y yVar = this.f8459i;
            if (i3 < 0) {
                yVar.getClass();
                break;
            }
            if (i3 >= yVar.f26439b) {
                break;
            }
            long j = yVar.f26438a[i3];
            if (Q0.AbstractC0777k.g(j, jA) < 0) {
                jA = j;
            }
            if ((Q0.AbstractC0777k.i(jA) < 0.0f && Q0.AbstractC0777k.n(jA)) || i3 == iA0) {
                return jA;
            }
            i3++;
        }
        p144r.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void e(int i3, int i9) {
        if (i3 >= i9) {
            return;
        }
        this.f8458h.l(i3, i9);
        p136q.y yVar = this.f8459i;
        if (i3 >= 0) {
            int i10 = yVar.f26439b;
            if (i3 <= i10 && i9 >= 0 && i9 <= i10) {
                if (i9 < i3) {
                    p144r.a.c("The end index must be < start index");
                    throw null;
                }
                if (i9 != i3) {
                    if (i9 < i10) {
                        long[] jArr = yVar.f26438a;
                        p078i6.m.c0(jArr, jArr, i3, i9, i10);
                    }
                    yVar.f26439b -= i9 - i3;
                    return;
                }
                return;
            }
        } else {
            yVar.getClass();
        }
        p144r.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        java.lang.Object objF = this.f8458h.f(i3);
        kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (p137q0.o) objF;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof p137q0.o)) {
            return -1;
        }
        p137q0.o oVar = (p137q0.o) obj;
        int iA0 = p078i6.p.A0(this);
        if (iA0 >= 0) {
            int i3 = 0;
            while (!kotlin.jvm.internal.m.a(this.f8458h.f(i3), oVar)) {
                if (i3 != iA0) {
                    i3++;
                }
            }
            return i3;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8458h.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new Q0.C0781o(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof p137q0.o)) {
            return -1;
        }
        p137q0.o oVar = (p137q0.o) obj;
        for (int iA0 = p078i6.p.A0(this); -1 < iA0; iA0--) {
            if (kotlin.jvm.internal.m.a(this.f8458h.f(iA0), oVar)) {
                return iA0;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new Q0.C0781o(this, 0, 7);
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
        return this.f8458h.f26304b;
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.List subList(int i3, int i9) {
        return new Q0.C0782p(this, i3, i9);
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
        return new Q0.C0781o(this, i3, 6);
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
