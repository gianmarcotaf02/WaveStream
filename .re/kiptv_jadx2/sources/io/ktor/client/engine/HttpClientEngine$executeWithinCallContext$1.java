package io.ktor.client.engine;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p117n6.e;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@e(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", l = {175, 184}, m = "executeWithinCallContext")
public final class HttpClientEngine$executeWithinCallContext$1 extends p117n6.c {
    Object L$0;
    Object L$1;
    int label;
    Object result;

    public HttpClientEngine$executeWithinCallContext$1(p100l6.c cVar) {
        super(cVar);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HttpClientEngine.DefaultImpls.executeWithinCallContext(null, null, this);
    }
}
