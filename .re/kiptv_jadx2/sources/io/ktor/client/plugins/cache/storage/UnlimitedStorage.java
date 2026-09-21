package io.ktor.client.plugins.cache.storage;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import io.sentry.protocol.Request;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p078i6.y;
import p100l6.c;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/ktor/client/plugins/cache/storage/UnlimitedStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "<init>", "()V", "Lio/ktor/http/Url;", Request.JsonKeys.URL, "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "Lh6/A;", ProductResponseJsonKeys.STORE, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Ll6/c;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Ll6/c;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/util/collections/ConcurrentMap;", "", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UnlimitedStorage implements CacheStorage {
    private final ConcurrentMap<Url, Set<CachedResponseData>> store = new ConcurrentMap<>(0, 1, null);

    @Override
    public Object find(Url url, Map<String, String> map, c cVar) {
        for (Object obj : this.store.computeIfAbsent(url, new a(6))) {
            CachedResponseData cachedResponseData = (CachedResponseData) obj;
            if (!map.isEmpty()) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<String, String> next = it.next();
                        String key = next.getKey();
                        if (!m.a(cachedResponseData.getVaryKeys().get(key), next.getValue())) {
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

    @Override
    public Object findAll(Url url, c cVar) {
        Set<CachedResponseData> set = this.store.get(url);
        return set == null ? y.f23207h : set;
    }

    @Override
    public Object store(Url url, CachedResponseData cachedResponseData, c cVar) {
        Set<CachedResponseData> setComputeIfAbsent = this.store.computeIfAbsent(url, new a(7));
        if (!setComputeIfAbsent.add(cachedResponseData)) {
            setComputeIfAbsent.remove(cachedResponseData);
            setComputeIfAbsent.add(cachedResponseData);
        }
        return A.f22523a;
    }
}
