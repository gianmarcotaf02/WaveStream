package kotlinx.serialization.json;

/* JADX INFO: loaded from: classes4.dex */
@p119n8.i(with = p162s8.x.class)
public final class c extends kotlinx.serialization.json.b implements java.util.Map<java.lang.String, kotlinx.serialization.json.b>, p201y6.a {
    public static final kotlinx.serialization.json.JsonObject$Companion Companion = new kotlinx.serialization.json.JsonObject$Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Map f24558h;

    public c(java.util.Map content) {
        kotlin.jvm.internal.m.e(content, "content");
        this.f24558h = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.b compute(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.b, ? extends kotlinx.serialization.json.b> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.b computeIfAbsent(java.lang.String str, java.util.function.Function<? super java.lang.String, ? extends kotlinx.serialization.json.b> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.b computeIfPresent(java.lang.String str, java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.b, ? extends kotlinx.serialization.json.b> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (!(obj instanceof java.lang.String)) {
            return false;
        }
        java.lang.String key = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(key, "key");
        return this.f24558h.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (!(obj instanceof kotlinx.serialization.json.b)) {
            return false;
        }
        kotlinx.serialization.json.b value = (kotlinx.serialization.json.b) obj;
        kotlin.jvm.internal.m.e(value, "value");
        return this.f24558h.containsValue(value);
    }

    @Override // java.util.Map
    public final java.util.Set<java.util.Map.Entry<java.lang.String, kotlinx.serialization.json.b>> entrySet() {
        return this.f24558h.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return kotlin.jvm.internal.m.a(this.f24558h, obj);
    }

    @Override // java.util.Map
    public final kotlinx.serialization.json.b get(java.lang.Object obj) {
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        java.lang.String key = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(key, "key");
        return (kotlinx.serialization.json.b) this.f24558h.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f24558h.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f24558h.isEmpty();
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return this.f24558h.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.b merge(java.lang.String str, kotlinx.serialization.json.b bVar, java.util.function.BiFunction<? super kotlinx.serialization.json.b, ? super kotlinx.serialization.json.b, ? extends kotlinx.serialization.json.b> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.b put(java.lang.String str, kotlinx.serialization.json.b bVar) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.String, ? extends kotlinx.serialization.json.b> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.b putIfAbsent(java.lang.String str, kotlinx.serialization.json.b bVar) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final kotlinx.serialization.json.b remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ kotlinx.serialization.json.b replace(java.lang.String str, kotlinx.serialization.json.b bVar) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(java.util.function.BiFunction<? super java.lang.String, ? super kotlinx.serialization.json.b, ? extends kotlinx.serialization.json.b> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f24558h.size();
    }

    public final java.lang.String toString() {
        return p078i6.o.o1(this.f24558h.entrySet(), ",", "{", "}", new q5.i(13), 24);
    }

    @Override // java.util.Map
    public final java.util.Collection<kotlinx.serialization.json.b> values() {
        return this.f24558h.values();
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(java.lang.String str, kotlinx.serialization.json.b bVar, kotlinx.serialization.json.b bVar2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
