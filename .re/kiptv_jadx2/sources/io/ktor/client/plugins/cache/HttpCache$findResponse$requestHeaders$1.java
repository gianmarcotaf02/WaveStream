package io.ktor.client.plugins.cache;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.Headers;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class HttpCache$findResponse$requestHeaders$1 extends j implements p194x6.j {
    public HttpCache$findResponse$requestHeaders$1(Object obj) {
        super(1, 0, Headers.class, obj, "get", "get(Ljava/lang/String;)Ljava/lang/String;");
    }

    @Override
    public final String invoke(String p2) {
        m.e(p2, "p0");
        return ((Headers) this.receiver).get(p2);
    }
}
