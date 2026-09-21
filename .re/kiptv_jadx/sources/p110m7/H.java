package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends java.util.AbstractList implements java.util.RandomAccess, p110m7.t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.s f25452h;

    public H(p110m7.s sVar) {
        this.f25452h = sVar;
    }

    @Override // p110m7.t
    public final java.util.List b() {
        return java.util.Collections.unmodifiableList(this.f25452h.f25505h);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        return (java.lang.String) this.f25452h.get(i3);
    }

    @Override // p110m7.t
    public final p110m7.AbstractC2632e i(int i3) {
        return this.f25452h.i(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        p110m7.G g = new p110m7.G();
        g.f25451h = this.f25452h.iterator();
        return g;
    }

    @Override // p110m7.t
    public final void l(p110m7.u uVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        p110m7.F f9 = new p110m7.F();
        f9.f25450h = this.f25452h.listIterator(i3);
        return f9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25452h.size();
    }

    @Override // p110m7.t
    public final p110m7.H c() {
        return this;
    }
}
