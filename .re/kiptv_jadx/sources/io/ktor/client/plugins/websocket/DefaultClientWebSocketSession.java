package io.ktor.client.plugins.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096A¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096A¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0014\u001a\u00020\n2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u0011H\u0097\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\u00020\u00198\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010$\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0)8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001e\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u00102R\u001c\u00106\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001c\u00109\u001a\u00020\u001f8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;0:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "Lio/ktor/client/plugins/websocket/ClientWebSocketSession;", "Lio/ktor/websocket/DefaultWebSocketSession;", "Lio/ktor/client/call/HttpClientCall;", "call", "delegate", "<init>", "(Lio/ktor/client/call/HttpClientCall;Lio/ktor/websocket/DefaultWebSocketSession;)V", "Lio/ktor/websocket/Frame;", "frame", "Lh6/A;", "send", "(Lio/ktor/websocket/Frame;Ll6/c;)Ljava/lang/Object;", "flush", "(Ll6/c;)Ljava/lang/Object;", "terminate", "()V", "", "Lio/ktor/websocket/WebSocketExtension;", "negotiatedExtensions", androidx.media3.extractor.text.ttml.TtmlNode.START, "(Ljava/util/List;)V", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "", "getMasking", "()Z", "setMasking", "(Z)V", "masking", "", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "maxFrameSize", "LU7/C;", "getIncoming", "()LU7/C;", "incoming", "LU7/D;", "getOutgoing", "()LU7/D;", "outgoing", "getExtensions", "()Ljava/util/List;", "extensions", "Ll6/h;", "getCoroutineContext", "()Ll6/h;", "coroutineContext", "getPingIntervalMillis", "setPingIntervalMillis", "pingIntervalMillis", "getTimeoutMillis", "setTimeoutMillis", "timeoutMillis", "LS7/F;", "Lio/ktor/websocket/CloseReason;", "getCloseReason", "()LS7/F;", "closeReason", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DefaultClientWebSocketSession implements io.ktor.client.plugins.websocket.ClientWebSocketSession, io.ktor.websocket.DefaultWebSocketSession {
    private final /* synthetic */ io.ktor.websocket.DefaultWebSocketSession $$delegate_0;
    private final io.ktor.client.call.HttpClientCall call;

    public DefaultClientWebSocketSession(io.ktor.client.call.HttpClientCall call, io.ktor.websocket.DefaultWebSocketSession delegate) {
        kotlin.jvm.internal.m.e(call, "call");
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.$$delegate_0 = delegate;
        this.call = call;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.lang.Object flush(p100l6.c cVar) {
        return this.$$delegate_0.flush(cVar);
    }

    @Override // io.ktor.client.plugins.websocket.ClientWebSocketSession
    public io.ktor.client.call.HttpClientCall getCall() {
        return this.call;
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public S7.F getCloseReason() {
        return this.$$delegate_0.getCloseReason();
    }

    @Override // io.ktor.client.plugins.websocket.ClientWebSocketSession, io.ktor.websocket.WebSocketSession, S7.A
    public p100l6.h getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.util.List<io.ktor.websocket.WebSocketExtension<?>> getExtensions() {
        return this.$$delegate_0.getExtensions();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public U7.C getIncoming() {
        return this.$$delegate_0.getIncoming();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return this.$$delegate_0.getMasking();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return this.$$delegate_0.getMaxFrameSize();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public U7.D getOutgoing() {
        return this.$$delegate_0.getOutgoing();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getPingIntervalMillis() {
        return this.$$delegate_0.getPingIntervalMillis();
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public long getTimeoutMillis() {
        return this.$$delegate_0.getTimeoutMillis();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public java.lang.Object send(io.ktor.websocket.Frame frame, p100l6.c cVar) {
        return this.$$delegate_0.send(frame, cVar);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z6) {
        this.$$delegate_0.setMasking(z6);
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j) {
        this.$$delegate_0.setMaxFrameSize(j);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setPingIntervalMillis(long j) {
        this.$$delegate_0.setPingIntervalMillis(j);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    public void setTimeoutMillis(long j) {
        this.$$delegate_0.setTimeoutMillis(j);
    }

    @Override // io.ktor.websocket.DefaultWebSocketSession
    @io.ktor.utils.io.InternalAPI
    public void start(java.util.List<? extends io.ktor.websocket.WebSocketExtension<?>> negotiatedExtensions) {
        kotlin.jvm.internal.m.e(negotiatedExtensions, "negotiatedExtensions");
        this.$$delegate_0.start(negotiatedExtensions);
    }

    @Override // io.ktor.websocket.WebSocketSession
    @p070h6.c
    public void terminate() {
        this.$$delegate_0.terminate();
    }
}
