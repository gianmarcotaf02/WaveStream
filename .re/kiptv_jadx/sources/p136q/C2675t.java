package p136q;

/* JADX INFO: renamed from: q.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2675t implements java.util.Map, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p136q.H f26421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p136q.C2664h f26422i;
    public p136q.C2664h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public O0.s0 f26423k;

    public C2675t(p136q.H parent) {
        kotlin.jvm.internal.m.e(parent, "parent");
        this.f26421h = parent;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfAbsent(java.lang.Object obj, java.util.function.Function function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return this.f26421h.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.f26421h.d(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        p136q.C2664h c2664h = this.f26422i;
        if (c2664h != null) {
            return c2664h;
        }
        p136q.C2664h c2664h2 = new p136q.C2664h(this.f26421h, 0);
        this.f26422i = c2664h2;
        return c2664h2;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p136q.C2675t.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f26421h, ((p136q.C2675t) obj).f26421h);
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        return this.f26421h.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f26421h.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f26421h.i();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        p136q.C2664h c2664h = this.j;
        if (c2664h != null) {
            return c2664h;
        }
        p136q.C2664h c2664h2 = new p136q.C2664h(this.f26421h, 1);
        this.j = c2664h2;
        return c2664h2;
    }

    @Override // java.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f26421h.f26326e;
    }

    public final java.lang.String toString() {
        return this.f26421h.toString();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        O0.s0 s0Var = this.f26423k;
        if (s0Var != null) {
            return s0Var;
        }
        O0.s0 s0Var2 = new O0.s0(this.f26421h);
        this.f26423k = s0Var2;
        return s0Var2;
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
