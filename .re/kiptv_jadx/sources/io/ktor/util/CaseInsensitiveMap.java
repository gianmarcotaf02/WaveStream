package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0006J!\u0010\u0014\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00122\u0014\u0010\u0017\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u000fJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001fR\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R&\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000)0%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010'R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lio/ktor/util/CaseInsensitiveMap;", "", "Value", "", "", "<init>", "()V", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "", "containsKey", "(Ljava/lang/String;)Z", "value", "containsValue", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "isEmpty", "()Z", "Lh6/A;", "clear", "put", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "", "hashCode", "()I", "Lio/ktor/util/CaseInsensitiveString;", "delegate", "Ljava/util/Map;", "getSize", "size", "", "getKeys", "()Ljava/util/Set;", "keys", "", "getEntries", "entries", "", "getValues", "()Ljava/util/Collection;", "values", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CaseInsensitiveMap<Value> implements java.util.Map<java.lang.String, Value>, p201y6.d {
    private final java.util.Map<io.ktor.util.CaseInsensitiveString, Value> delegate = new java.util.LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map.Entry _get_entries_$lambda$3(java.util.Map.Entry DelegatingMutableSet) {
        kotlin.jvm.internal.m.e(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new io.ktor.util.Entry(((io.ktor.util.CaseInsensitiveString) DelegatingMutableSet.getKey()).getContent(), DelegatingMutableSet.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map.Entry _get_entries_$lambda$4(java.util.Map.Entry DelegatingMutableSet) {
        kotlin.jvm.internal.m.e(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new io.ktor.util.Entry(io.ktor.util.TextKt.caseInsensitive((java.lang.String) DelegatingMutableSet.getKey()), DelegatingMutableSet.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String _get_keys_$lambda$1(io.ktor.util.CaseInsensitiveString DelegatingMutableSet) {
        kotlin.jvm.internal.m.e(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return DelegatingMutableSet.getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.ktor.util.CaseInsensitiveString _get_keys_$lambda$2(java.lang.String DelegatingMutableSet) {
        kotlin.jvm.internal.m.e(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return io.ktor.util.TextKt.caseInsensitive(DelegatingMutableSet);
    }

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object value) {
        if (value == null) {
            return false;
        }
        return this.delegate.containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.String, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object other) {
        if (other == null || !(other instanceof io.ktor.util.CaseInsensitiveMap)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(((io.ktor.util.CaseInsensitiveMap) other).delegate, this.delegate);
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return get((java.lang.String) obj);
        }
        return null;
    }

    public java.util.Set<java.util.Map.Entry<java.lang.String, Value>> getEntries() {
        return new io.ktor.util.DelegatingMutableSet(this.delegate.entrySet(), new io.ktor.http.b(20), new io.ktor.http.b(21));
    }

    public java.util.Set<java.lang.String> getKeys() {
        return new io.ktor.util.DelegatingMutableSet(this.delegate.keySet(), new io.ktor.http.b(22), new io.ktor.http.b(23));
    }

    public int getSize() {
        return this.delegate.size();
    }

    public java.util.Collection<Value> getValues() {
        return this.delegate.values();
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
    public final /* bridge */ java.util.Set<java.lang.String> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends Value> from) {
        kotlin.jvm.internal.m.e(from, "from");
        for (java.util.Map.Entry<? extends java.lang.String, ? extends Value> entry : from.entrySet()) {
            put(entry.getKey(), (java.lang.Object) entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<Value> values() {
        return getValues();
    }

    public boolean containsKey(java.lang.String key) {
        kotlin.jvm.internal.m.e(key, "key");
        return this.delegate.containsKey(new io.ktor.util.CaseInsensitiveString(key));
    }

    public Value get(java.lang.String key) {
        kotlin.jvm.internal.m.e(key, "key");
        return this.delegate.get(io.ktor.util.TextKt.caseInsensitive(key));
    }

    @Override // java.util.Map
    public Value put(java.lang.String key, Value value) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        return this.delegate.put(io.ktor.util.TextKt.caseInsensitive(key), value);
    }

    public Value remove(java.lang.String key) {
        kotlin.jvm.internal.m.e(key, "key");
        return this.delegate.remove(io.ktor.util.TextKt.caseInsensitive(key));
    }
}
