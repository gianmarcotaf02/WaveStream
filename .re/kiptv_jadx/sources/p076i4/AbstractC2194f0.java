package p076i4;

/* JADX INFO: renamed from: i4.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2194f0 implements java.util.Map, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient p076i4.AbstractC2214p0 f22894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient p076i4.AbstractC2214p0 f22895i;
    public transient p076i4.W j;

    public static p076i4.AbstractC2194f0 a(java.util.Map map) {
        if ((map instanceof p076i4.AbstractC2194f0) && !(map instanceof java.util.SortedMap)) {
            p076i4.AbstractC2194f0 abstractC2194f0 = (p076i4.AbstractC2194f0) map;
            abstractC2194f0.getClass();
            return abstractC2194f0;
        }
        java.util.Set setEntrySet = map.entrySet();
        p076i4.C2192e0 c2192e0 = new p076i4.C2192e0(setEntrySet instanceof java.util.Collection ? setEntrySet.size() : 4);
        c2192e0.e(setEntrySet);
        return c2192e0.a(true);
    }

    public abstract p076i4.U0 b();

    public abstract p076i4.V0 c();

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return values().contains(obj);
    }

    public abstract p076i4.W d();

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final p076i4.AbstractC2214p0 entrySet() {
        p076i4.AbstractC2214p0 abstractC2214p0 = this.f22894h;
        if (abstractC2214p0 != null) {
            return abstractC2214p0;
        }
        p076i4.U0 u0B = b();
        this.f22894h = u0B;
        return u0B;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return p076i4.AbstractC2230y.h(obj, this);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final p076i4.AbstractC2214p0 keySet() {
        p076i4.AbstractC2214p0 abstractC2214p0 = this.f22895i;
        if (abstractC2214p0 != null) {
            return abstractC2214p0;
        }
        p076i4.V0 v0C = c();
        this.f22895i = v0C;
        return v0C;
    }

    @Override // java.util.Map
    public abstract java.lang.Object get(java.lang.Object obj);

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p076i4.W values() {
        p076i4.W w6 = this.j;
        if (w6 != null) {
            return w6;
        }
        p076i4.W wD = d();
        this.j = wD;
        return wD;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return p076i4.AbstractC2230y.n(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final java.lang.String toString() {
        return p076i4.AbstractC2230y.z(this);
    }
}
