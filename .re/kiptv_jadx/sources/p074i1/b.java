package p074i1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.Collection, p201y6.a {
    public static final p074i1.b j = new p074i1.b(p078i6.w.f23205h);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f22747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22748i;

    public b(java.util.List list) {
        this.f22747h = list;
        this.f22748i = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof p074i1.a)) {
            return false;
        }
        return this.f22747h.contains((p074i1.a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return this.f22747h.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p074i1.b) {
            return kotlin.jvm.internal.m.a(this.f22747h, ((p074i1.b) obj).f22747h);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f22747h.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f22747h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.f22747h.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f22748i;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.internal.play_billing.M0.n(new java.lang.StringBuilder("LocaleList(localeList="), this.f22747h, ')');
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return kotlin.jvm.internal.l.b(this, objArr);
    }
}
