package io.ktor.client.plugins.sse;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/ktor/client/plugins/sse/ClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/call/HttpClientCall;", "call", "delegate", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/client/plugins/sse/SSESession;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "LV7/g;", "Lio/ktor/sse/ServerSentEvent;", "getIncoming", "()LV7/g;", "incoming", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "coroutineContext", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ClientSSESession implements io.ktor.client.plugins.sse.SSESession {
    private final /* synthetic */ io.ktor.client.plugins.sse.SSESession $$delegate_0;
    private final io.ktor.client.call.HttpClientCall call;

    public ClientSSESession(io.ktor.client.call.HttpClientCall call, io.ktor.client.plugins.sse.SSESession delegate) {
        kotlin.jvm.internal.m.e(call, "call");
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.$$delegate_0 = delegate;
        this.call = call;
    }

    public final io.ktor.client.call.HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.client.plugins.sse.SSESession, S7.A
    public p100l6.h getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public V7.InterfaceC0981g getIncoming() {
        return this.$$delegate_0.getIncoming();
    }
}
