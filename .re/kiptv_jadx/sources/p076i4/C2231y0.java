package p076i4;

/* JADX INFO: renamed from: i4.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2231y0 extends java.util.AbstractList implements java.util.RandomAccess, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f22950h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p068h4.j f22951i;

    public C2231y0(java.util.List list, p068h4.j jVar) {
        list.getClass();
        this.f22950h = list;
        this.f22951i = jVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        return this.f22951i.apply(this.f22950h.get(i3));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f22950h.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        return new p076i4.C2229x0(this, this.f22950h.listIterator(i3), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i3) {
        return this.f22951i.apply(this.f22950h.remove(i3));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i9) {
        this.f22950h.subList(i3, i9).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22950h.size();
    }
}
