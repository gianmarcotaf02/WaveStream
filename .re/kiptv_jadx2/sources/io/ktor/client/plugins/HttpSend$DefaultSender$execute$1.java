package io.ktor.client.plugins;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", l = {132}, m = "execute")
public final class HttpSend$DefaultSender$execute$1 extends p117n6.c {
    Object L$0;
    int label;
    Object result;
    final HttpSend.DefaultSender this$0;

    public HttpSend$DefaultSender$execute$1(HttpSend.DefaultSender defaultSender, p100l6.c cVar) {
        super(cVar);
        this.this$0 = defaultSender;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
