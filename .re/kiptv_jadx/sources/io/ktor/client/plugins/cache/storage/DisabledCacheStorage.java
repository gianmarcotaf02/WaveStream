package io.ktor.client.plugins.cache.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/client/plugins/cache/storage/DisabledCacheStorage;", "Lio/ktor/client/plugins/cache/storage/HttpCacheStorage;", "<init>", "()V", "Lio/ktor/http/Url;", io.sentry.protocol.Request.JsonKeys.URL, "Lio/ktor/client/plugins/cache/HttpCacheEntry;", "value", "Lh6/A;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/HttpCacheEntry;)V", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;)Lio/ktor/client/plugins/cache/HttpCacheEntry;", "", "findByUrl", "(Lio/ktor/http/Url;)Ljava/util/Set;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DisabledCacheStorage extends io.ktor.client.plugins.cache.storage.HttpCacheStorage {
    public static final io.ktor.client.plugins.cache.storage.DisabledCacheStorage INSTANCE = new io.ktor.client.plugins.cache.storage.DisabledCacheStorage();

    private DisabledCacheStorage() {
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public io.ktor.client.plugins.cache.HttpCacheEntry find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> varyKeys) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(varyKeys, "varyKeys");
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public java.util.Set<io.ktor.client.plugins.cache.HttpCacheEntry> findByUrl(io.ktor.http.Url url) {
        kotlin.jvm.internal.m.e(url, "url");
        return p078i6.y.f23207h;
    }

    @Override // io.ktor.client.plugins.cache.storage.HttpCacheStorage
    public void store(io.ktor.http.Url url, io.ktor.client.plugins.cache.HttpCacheEntry value) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(value, "value");
    }
}
