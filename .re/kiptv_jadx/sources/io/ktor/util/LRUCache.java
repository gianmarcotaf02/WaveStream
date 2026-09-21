package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B9\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/util/LRUCache;", "K", "V", "Ljava/util/LinkedHashMap;", "Lkotlin/Function1;", "supplier", "Lh6/A;", "close", "", "maxSize", "<init>", "(Lx6/j;Lx6/j;I)V", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lx6/j;", "I", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LRUCache<K, V> extends java.util.LinkedHashMap<K, V> {
    private final p194x6.j close;
    private final int maxSize;
    private final p194x6.j supplier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LRUCache(p194x6.j supplier, p194x6.j close, int i3) {
        super(10, 0.75f, true);
        kotlin.jvm.internal.m.e(supplier, "supplier");
        kotlin.jvm.internal.m.e(close, "close");
        this.supplier = supplier;
        this.close = close;
        this.maxSize = i3;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
        return (java.util.Set<java.util.Map.Entry<K, V>>) getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object key) {
        if (this.maxSize == 0) {
            return (V) this.supplier.invoke(key);
        }
        synchronized (this) {
            V v6 = (V) super.get(key);
            if (v6 != null) {
                return v6;
            }
            V v9 = (V) this.supplier.invoke(key);
            put(key, v9);
            return v9;
        }
    }

    public /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.Object, java.lang.Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ java.util.Set<java.lang.Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ java.util.Collection<java.lang.Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
        return (java.util.Set<K>) getKeys();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry<? extends K, ? extends V> eldest) {
        kotlin.jvm.internal.m.e(eldest, "eldest");
        boolean z6 = size() > this.maxSize;
        if (z6) {
            this.close.invoke(eldest.getValue());
        }
        return z6;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
        return (java.util.Collection<V>) getValues();
    }
}
