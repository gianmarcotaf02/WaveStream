package p136q;

/* JADX INFO: renamed from: q.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2664h implements java.util.Set, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p136q.H f26393i;

    public C2664h(p136q.H parent, int i3) {
        this.f26392h = i3;
        switch (i3) {
            case 1:
                kotlin.jvm.internal.m.e(parent, "parent");
                this.f26393i = parent;
                break;
            default:
                kotlin.jvm.internal.m.e(parent, "parent");
                this.f26393i = parent;
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.f26392h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        switch (this.f26392h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f26392h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        switch (this.f26392h) {
            case 0:
                if (!(obj instanceof java.util.Map.Entry)) {
                    return false;
                }
                java.util.Map.Entry element = (java.util.Map.Entry) obj;
                kotlin.jvm.internal.m.e(element, "element");
                return kotlin.jvm.internal.m.a(this.f26393i.g(element.getKey()), element.getValue());
            default:
                return this.f26393i.c(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        switch (this.f26392h) {
            case 0:
                kotlin.jvm.internal.m.e(elements, "elements");
                java.util.Collection<java.util.Map.Entry> collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                for (java.util.Map.Entry entry : collection) {
                    if (!kotlin.jvm.internal.m.a(this.f26393i.g(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                java.util.Collection collection2 = elements;
                if (collection2.isEmpty()) {
                    return true;
                }
                java.util.Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!this.f26393i.c(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f26392h) {
            case 0:
                break;
        }
        return this.f26393i.i();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f26392h) {
            case 0:
                return E8.d.T(new p136q.C2663g(this, null));
            default:
                return E8.d.T(new p136q.C2671o(this, null));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.f26392h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        switch (this.f26392h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        switch (this.f26392h) {
            case 0:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f26392h) {
            case 0:
                break;
        }
        return this.f26393i.f26326e;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.f26392h) {
            case 0:
                break;
        }
        return kotlin.jvm.internal.l.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        switch (this.f26392h) {
            case 0:
                kotlin.jvm.internal.m.e(array, "array");
                break;
            default:
                kotlin.jvm.internal.m.e(array, "array");
                break;
        }
        return kotlin.jvm.internal.l.b(this, array);
    }
}
