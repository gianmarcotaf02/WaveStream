package p006a6;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements java.util.Map {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p076i4.AbstractC2194f0 f15414h;

    public c(p076i4.AbstractC2194f0 abstractC2194f0) {
        this.f15414h = abstractC2194f0;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Class)) {
            throw new java.lang.IllegalArgumentException("Key must be a class");
        }
        return this.f15414h.containsKey(((java.lang.Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        return this.f15414h.containsValue(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Class)) {
            throw new java.lang.IllegalArgumentException("Key must be a class");
        }
        return this.f15414h.get(((java.lang.Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f15414h.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        throw new java.lang.UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f15414h.size();
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        return this.f15414h.values();
    }
}
