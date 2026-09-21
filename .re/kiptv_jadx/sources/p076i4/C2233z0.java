package p076i4;

/* JADX INFO: renamed from: i4.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2233z0 extends java.util.AbstractSequentialList implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f22954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p068h4.j f22955i;

    public C2233z0(java.util.List list, p068h4.j jVar) {
        list.getClass();
        this.f22954h = list;
        this.f22955i = jVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f22954h.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        return new p076i4.C2229x0(this, this.f22954h.listIterator(i3), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i9) {
        this.f22954h.subList(i3, i9).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22954h.size();
    }
}
