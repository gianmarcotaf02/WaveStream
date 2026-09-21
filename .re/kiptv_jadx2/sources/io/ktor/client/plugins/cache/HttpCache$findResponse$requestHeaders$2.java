package io.ktor.client.plugins.cache;

import androidx.media3.container.NalUnitUtil;
import io.ktor.http.Headers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class HttpCache$findResponse$requestHeaders$2 extends j implements p194x6.j {
    public HttpCache$findResponse$requestHeaders$2(Object obj) {
        super(1, 0, Headers.class, obj, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;");
    }

    @Override
    public final List<String> invoke(String p2) {
        m.e(p2, "p0");
        return ((Headers) this.receiver).getAll(p2);
    }
}
