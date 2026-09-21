package O0;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements java.util.Collection, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7688h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f7689i;

    public s0() {
        int i3 = p136q.O.f26350a;
        this.f7689i = new p136q.E(6);
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).a(obj);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.f7688h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f7688h) {
            case 0:
                ((p136q.E) this.f7689i).b();
                return;
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).c(obj);
            default:
                return ((p136q.H) this.f7689i).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        switch (this.f7688h) {
            case 0:
                java.util.Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!((p136q.E) this.f7689i).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                java.util.Collection collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                java.util.Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((p136q.H) this.f7689i).d(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).g == 0;
            default:
                return ((p136q.H) this.f7689i).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f7688h) {
            case 0:
                p136q.E e6 = (p136q.E) this.f7689i;
                e6.getClass();
                return new N7.k(new p136q.G(e6));
            default:
                return E8.d.T(new p136q.V(this, null));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).g(obj);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).g(collection);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        switch (this.f7688h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).i(collection);
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).g;
            default:
                return ((p136q.H) this.f7689i).f26326e;
        }
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.f7688h) {
            case 0:
                break;
        }
        return kotlin.jvm.internal.l.a(this);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        switch (this.f7688h) {
            case 0:
                break;
            default:
                kotlin.jvm.internal.m.e(array, "array");
                break;
        }
        return kotlin.jvm.internal.l.b(this, array);
    }

    public s0(p136q.H parent) {
        kotlin.jvm.internal.m.e(parent, "parent");
        this.f7689i = parent;
    }
}
