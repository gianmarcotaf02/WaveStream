package io.ktor.client.plugins.cache;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/cache/CacheControl;", "", "<init>", "()V", "Lio/ktor/http/HeaderValue;", "NO_STORE", "Lio/ktor/http/HeaderValue;", "getNO_STORE$ktor_client_core", "()Lio/ktor/http/HeaderValue;", "NO_CACHE", "getNO_CACHE$ktor_client_core", "PRIVATE", "getPRIVATE$ktor_client_core", "ONLY_IF_CACHED", "getONLY_IF_CACHED$ktor_client_core", "MUST_REVALIDATE", "getMUST_REVALIDATE$ktor_client_core", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CacheControl {
    public static final io.ktor.client.plugins.cache.CacheControl INSTANCE = new io.ktor.client.plugins.cache.CacheControl();
    private static final io.ktor.http.HeaderValue NO_STORE = new io.ktor.http.HeaderValue(io.ktor.client.utils.CacheControl.NO_STORE, null, 2, null);
    private static final io.ktor.http.HeaderValue NO_CACHE = new io.ktor.http.HeaderValue(io.ktor.client.utils.CacheControl.NO_CACHE, null, 2, null);
    private static final io.ktor.http.HeaderValue PRIVATE = new io.ktor.http.HeaderValue(io.ktor.client.utils.CacheControl.PRIVATE, null, 2, null);
    private static final io.ktor.http.HeaderValue ONLY_IF_CACHED = new io.ktor.http.HeaderValue(io.ktor.client.utils.CacheControl.ONLY_IF_CACHED, null, 2, null);
    private static final io.ktor.http.HeaderValue MUST_REVALIDATE = new io.ktor.http.HeaderValue(io.ktor.client.utils.CacheControl.MUST_REVALIDATE, null, 2, null);

    private CacheControl() {
    }

    public final io.ktor.http.HeaderValue getMUST_REVALIDATE$ktor_client_core() {
        return MUST_REVALIDATE;
    }

    public final io.ktor.http.HeaderValue getNO_CACHE$ktor_client_core() {
        return NO_CACHE;
    }

    public final io.ktor.http.HeaderValue getNO_STORE$ktor_client_core() {
        return NO_STORE;
    }

    public final io.ktor.http.HeaderValue getONLY_IF_CACHED$ktor_client_core() {
        return ONLY_IF_CACHED;
    }

    public final io.ktor.http.HeaderValue getPRIVATE$ktor_client_core() {
        return PRIVATE;
    }
}
