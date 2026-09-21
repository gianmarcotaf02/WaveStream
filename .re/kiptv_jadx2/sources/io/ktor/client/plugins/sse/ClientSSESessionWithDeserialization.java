package io.ktor.client.plugins.sse;

import V7.InterfaceC0981g;
import androidx.media3.container.NalUnitUtil;
import io.ktor.client.call.HttpClientCall;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p100l6.h;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR(\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lio/ktor/client/plugins/sse/ClientSSESessionWithDeserialization;", "Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;", "Lio/ktor/client/call/HttpClientCall;", "call", "delegate", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/plugins/sse/SSESessionWithDeserialization;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "LV7/g;", "Lio/ktor/sse/TypedServerSentEvent;", "", "getIncoming", "()LV7/g;", "incoming", "Lkotlin/Function2;", "Lio/ktor/util/reflect/TypeInfo;", "", "getDeserializer", "()Lx6/m;", "deserializer", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ClientSSESessionWithDeserialization implements SSESessionWithDeserialization {
    private final SSESessionWithDeserialization $$delegate_0;
    private final HttpClientCall call;

    public ClientSSESessionWithDeserialization(HttpClientCall call, SSESessionWithDeserialization delegate) {
        m.e(call, "call");
        m.e(delegate, "delegate");
        this.$$delegate_0 = delegate;
        this.call = call;
    }

    public final HttpClientCall getCall() {
        return this.call;
    }

    @Override
    public h getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override
    public p194x6.m getDeserializer() {
        return this.$$delegate_0.getDeserializer();
    }

    @Override
    public InterfaceC0981g getIncoming() {
        return this.$$delegate_0.getIncoming();
    }
}
