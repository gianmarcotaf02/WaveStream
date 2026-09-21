package p086j6;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends p078i6.AbstractC2258i implements java.io.Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p086j6.g f24255i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p086j6.e f24256h;

    static {
        p086j6.e eVar = p086j6.e.f24240u;
        f24255i = new p086j6.g(p086j6.e.f24240u);
    }

    public g(p086j6.e backing) {
        kotlin.jvm.internal.m.e(backing, "backing");
        this.f24256h = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(java.lang.Object obj) {
        return this.f24256h.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        this.f24256h.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f24256h.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f24256h.containsKey(obj);
    }

    @Override // p078i6.AbstractC2258i
    public final int d() {
        return this.f24256h.f24248p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f24256h.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        p086j6.e eVar = this.f24256h;
        eVar.getClass();
        return new p086j6.c(eVar, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        p086j6.e eVar = this.f24256h;
        eVar.c();
        int iJ = eVar.j(obj);
        if (iJ < 0) {
            return false;
        }
        eVar.o(iJ);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        this.f24256h.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        this.f24256h.c();
        return super.retainAll(elements);
    }

    public g() {
        this(new p086j6.e());
    }
}
