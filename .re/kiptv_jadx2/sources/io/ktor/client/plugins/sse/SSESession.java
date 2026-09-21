package io.ktor.client.plugins.sse;

import S7.A;
import V7.InterfaceC0981g;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p100l6.h;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/ktor/client/plugins/sse/SSESession;", "LS7/A;", "LV7/g;", "Lio/ktor/sse/ServerSentEvent;", "getIncoming", "()LV7/g;", "incoming", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface SSESession extends A {
    @Override
    h getCoroutineContext();

    InterfaceC0981g getIncoming();
}
