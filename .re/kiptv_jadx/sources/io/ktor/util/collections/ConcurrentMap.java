package io.ktor.util.collections;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u00162\u0014\u0010\u001c\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u0013J\u001f\u0010\u001f\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\r2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010\u000fJ\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R \u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\"R&\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010/0.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lio/ktor/util/collections/ConcurrentMap;", "Key", "Value", "", "", "initialCapacity", "<init>", "(I)V", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Lkotlin/Function0;", "block", "computeIfAbsent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "containsKey", "(Ljava/lang/Object;)Z", "value", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "Lh6/A;", "clear", "()V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/ConcurrentHashMap;", "delegate", "Ljava/util/concurrent/ConcurrentHashMap;", "getSize", "size", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConcurrentMap<Key, Value> implements java.util.Map<Key, Value>, p201y6.d {
    private final java.util.concurrent.ConcurrentHashMap<Key, Value> delegate;

    public ConcurrentMap() {
        this(0, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object computeIfAbsent$lambda$0(kotlin.jvm.functions.Function0 function0, java.lang.Object obj) {
        return function0.invoke();
    }

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    public final Value computeIfAbsent(Key key, kotlin.jvm.functions.Function0 block) {
        kotlin.jvm.internal.m.e(block, "block");
        java.util.concurrent.ConcurrentHashMap<Key, Value> concurrentHashMap = this.delegate;
        final E5.c1 c1Var = new E5.c1(4, block);
        return concurrentHashMap.computeIfAbsent(key, new java.util.function.Function() { // from class: f6.a
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return c1Var.invoke(obj);
            }
        });
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object key) {
        return this.delegate.containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object value) {
        return this.delegate.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<Key, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object other) {
        if (other instanceof java.util.Map) {
            return kotlin.jvm.internal.m.a(other, this.delegate);
        }
        return false;
    }

    @Override // java.util.Map
    public Value get(java.lang.Object key) {
        return this.delegate.get(key);
    }

    public java.util.Set<java.util.Map.Entry<Key, Value>> getEntries() {
        java.util.Set<java.util.Map.Entry<Key, Value>> setEntrySet = this.delegate.entrySet();
        kotlin.jvm.internal.m.d(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public java.util.Set<Key> getKeys() {
        java.util.Set<Key> setKeySet = this.delegate.keySet();
        kotlin.jvm.internal.m.d(setKeySet, "<get-keys>(...)");
        return setKeySet;
    }

    public int getSize() {
        return this.delegate.size();
    }

    public java.util.Collection<Value> getValues() {
        java.util.Collection<Value> collectionValues = this.delegate.values();
        kotlin.jvm.internal.m.d(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<Key> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public Value put(Key key, Value value) {
        return this.delegate.put(key, value);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends Key, ? extends Value> from) {
        kotlin.jvm.internal.m.e(from, "from");
        this.delegate.putAll(from);
    }

    @Override // java.util.Map
    public Value remove(java.lang.Object key) {
        return this.delegate.remove(key);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public java.lang.String toString() {
        return "ConcurrentMapJvm by " + this.delegate;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<Value> values() {
        return getValues();
    }

    public ConcurrentMap(int i3) {
        this.delegate = new java.util.concurrent.ConcurrentHashMap<>(i3);
    }

    @Override // java.util.Map
    public boolean remove(java.lang.Object key, java.lang.Object value) {
        return this.delegate.remove(key, value);
    }

    public /* synthetic */ ConcurrentMap(int i3, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i9 & 1) != 0 ? 32 : i3);
    }
}
