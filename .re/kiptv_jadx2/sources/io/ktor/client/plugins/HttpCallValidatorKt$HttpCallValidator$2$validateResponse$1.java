package io.ktor.client.plugins;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", l = {110}, m = "HttpCallValidator$lambda$2$validateResponse")
public final class HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 extends p117n6.c {
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(p100l6.c cVar) {
        super(cVar);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpCallValidatorKt.HttpCallValidator$lambda$2$validateResponse(null, null, this);
    }
}
