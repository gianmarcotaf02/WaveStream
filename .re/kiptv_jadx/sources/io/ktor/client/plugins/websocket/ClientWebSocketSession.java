package io.ktor.client.plugins.websocket;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/websocket/ClientWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "call", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ClientWebSocketSession extends io.ktor.websocket.WebSocketSession {

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static java.lang.Object send(io.ktor.client.plugins.websocket.ClientWebSocketSession clientWebSocketSession, io.ktor.websocket.Frame frame, p100l6.c cVar) {
            java.lang.Object objSend = io.ktor.websocket.WebSocketSession.DefaultImpls.send(clientWebSocketSession, frame, cVar);
            return objSend == p109m6.a.f25430h ? objSend : p070h6.A.f22523a;
        }
    }

    io.ktor.client.call.HttpClientCall getCall();

    @Override // io.ktor.websocket.WebSocketSession, S7.A
    /* synthetic */ p100l6.h getCoroutineContext();
}
