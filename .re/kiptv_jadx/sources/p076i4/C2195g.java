package p076i4;

/* JADX INFO: renamed from: i4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2195g extends p076i4.e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Map f22897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p076i4.AbstractC2215q f22898i;

    public C2195g(p076i4.AbstractC2215q abstractC2215q, java.util.Map map) {
        this.f22898i = abstractC2215q;
        map.getClass();
        this.f22897h = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        p076i4.AbstractC2230y.e(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.f22897h.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.f22897h.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.f22897h.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f22897h.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f22897h.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new p076i4.C2191e(this, this.f22897h.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int size;
        java.util.Collection collection = (java.util.Collection) this.f22897h.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f22898i.f22930m -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22897h.size();
    }
}
