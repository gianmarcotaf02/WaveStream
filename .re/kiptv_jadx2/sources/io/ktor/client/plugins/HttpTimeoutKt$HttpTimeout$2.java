package io.ktor.client.plugins;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2536a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class HttpTimeoutKt$HttpTimeout$2 extends AbstractC2536a implements Function0 {
    public static final HttpTimeoutKt$HttpTimeout$2 INSTANCE = new HttpTimeoutKt$HttpTimeout$2();

    public HttpTimeoutKt$HttpTimeout$2() {
        super(HttpTimeoutConfig.class, "<init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V");
    }

    @Override
    public final HttpTimeoutConfig invoke() {
        return new HttpTimeoutConfig(null, null, null, 7, null);
    }
}
