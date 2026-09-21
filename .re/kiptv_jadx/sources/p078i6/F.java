package p078i6;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends p078i6.AbstractC2257h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f23178h;

    public F(java.util.List list) {
        this.f23178h = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        this.f23178h.add(p078i6.o.W0(i3, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f23178h.clear();
    }

    @Override // p078i6.AbstractC2257h
    public final int d() {
        return this.f23178h.size();
    }

    @Override // p078i6.AbstractC2257h
    public final java.lang.Object e(int i3) {
        return this.f23178h.remove(p078i6.o.V0(i3, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        return this.f23178h.get(p078i6.o.V0(i3, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return new p078i6.E(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator() {
        return new p078i6.E(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        return this.f23178h.set(p078i6.o.V0(i3, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        return new p078i6.E(this, i3);
    }
}
