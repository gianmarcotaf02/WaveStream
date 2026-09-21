package io.ktor.client.plugins.cache;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.Url;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/cache/InvalidCacheStateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/http/Url;", "requestUrl", "<init>", "(Lio/ktor/http/Url;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class InvalidCacheStateException extends IllegalStateException {
    public InvalidCacheStateException(Url requestUrl) {
        super("The entry for url: " + requestUrl + " was removed from cache");
        m.e(requestUrl, "requestUrl");
    }
}
