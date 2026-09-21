package io.ktor.client.plugins;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class HttpRequestRetryKt$HttpRequestRetry$1 extends j implements Function0 {
    public static final HttpRequestRetryKt$HttpRequestRetry$1 INSTANCE = new HttpRequestRetryKt$HttpRequestRetry$1();

    public HttpRequestRetryKt$HttpRequestRetry$1() {
        super(0, HttpRequestRetryConfig.class, "<init>", "<init>()V", 0);
    }

    @Override
    public final HttpRequestRetryConfig invoke() {
        return new HttpRequestRetryConfig();
    }
}
