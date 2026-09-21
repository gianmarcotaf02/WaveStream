package p076i4;

/* JADX INFO: renamed from: i4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2193f extends java.util.AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient p076i4.C2189d f22891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient p076i4.C2218s f22892i;
    public final transient java.util.Map j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p076i4.AbstractC2215q f22893k;

    public C2193f(p076i4.AbstractC2215q abstractC2215q, java.util.Map map) {
        this.f22893k = abstractC2215q;
        this.j = map;
    }

    public final p076i4.X a(java.util.Map.Entry entry) {
        java.lang.Object key = entry.getKey();
        return new p076i4.X(key, this.f22893k.k(key, (java.util.Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        p076i4.AbstractC2215q abstractC2215q = this.f22893k;
        if (this.j == abstractC2215q.f22929l) {
            abstractC2215q.clear();
        } else {
            p076i4.AbstractC2230y.e(new p076i4.C2191e(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        java.util.Map map = this.j;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        p076i4.C2189d c2189d = this.f22891h;
        if (c2189d != null) {
            return c2189d;
        }
        p076i4.C2189d c2189d2 = new p076i4.C2189d(this, 0);
        this.f22891h = c2189d2;
        return c2189d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.j.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.Map map = this.j;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            obj2 = null;
        }
        java.util.Collection collection = (java.util.Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.f22893k.k(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set keySet() {
        return this.f22893k.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.j.remove(obj);
        if (collection == null) {
            return null;
        }
        p076i4.AbstractC2215q abstractC2215q = this.f22893k;
        java.util.Collection collectionJ = abstractC2215q.j();
        collectionJ.addAll(collection);
        abstractC2215q.f22930m -= collection.size();
        collection.clear();
        return collectionJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.j.size();
    }

    @Override // java.util.AbstractMap
    public final java.lang.String toString() {
        return this.j.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        p076i4.C2218s c2218s = this.f22892i;
        if (c2218s != null) {
            return c2218s;
        }
        p076i4.C2218s c2218s2 = new p076i4.C2218s(this);
        this.f22892i = c2218s2;
        return c2218s2;
    }
}
