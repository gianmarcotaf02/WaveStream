package p076i4;

/* JADX INFO: renamed from: i4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2232z extends java.util.AbstractCollection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Collection f22952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p076i4.B0 f22953i;

    public C2232z(java.util.Collection collection, p076i4.B0 b9) {
        collection.getClass();
        this.f22952h = collection;
        this.f22953i = b9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f22952h.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f22952h.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.f22952h.iterator();
        p076i4.B0 b9 = this.f22953i;
        b9.getClass();
        return new p076i4.C2219s0(it, b9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f22952h.size();
    }
}
