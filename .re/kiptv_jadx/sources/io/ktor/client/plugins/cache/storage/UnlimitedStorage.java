package io.ktor.client.plugins.cache.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/client/plugins/cache/storage/UnlimitedStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "<init>", "()V", "Lio/ktor/http/Url;", io.sentry.protocol.Request.JsonKeys.URL, "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "Lh6/A;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Ll6/c;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Ll6/c;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/util/collections/ConcurrentMap;", "", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UnlimitedStorage implements io.ktor.client.plugins.cache.storage.CacheStorage {
    private final io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> store = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, p100l6.c cVar) {
        for (java.lang.Object obj : this.store.computeIfAbsent(url, new io.ktor.client.plugins.cache.storage.a(6))) {
            io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj;
            if (!map.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                        java.lang.String key = next.getKey();
                        if (!kotlin.jvm.internal.m.a(cachedResponseData.getVaryKeys().get(key), next.getValue())) {
                        }
                    }
                }
            }
            if (map.size() == cachedResponseData.getVaryKeys().size()) {
                return obj;
            }
        }
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object findAll(io.ktor.http.Url url, p100l6.c cVar) {
        java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData> set = this.store.get(url);
        return set == null ? p078i6.y.f23207h : set;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object store(io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, p100l6.c cVar) {
        java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData> setComputeIfAbsent = this.store.computeIfAbsent(url, new io.ktor.client.plugins.cache.storage.a(7));
        if (!setComputeIfAbsent.add(cachedResponseData)) {
            setComputeIfAbsent.remove(cachedResponseData);
            setComputeIfAbsent.add(cachedResponseData);
        }
        return p070h6.A.f22523a;
    }
}
