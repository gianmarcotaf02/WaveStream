package io.ktor.client.plugins.websocket;

import androidx.media3.container.NalUnitUtil;
import io.ktor.client.call.HttpClientCall;
import io.ktor.websocket.Frame;
import io.ktor.websocket.WebSocketSession;
import kotlin.Metadata;
import p070h6.A;
import p100l6.c;
import p100l6.h;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lio/ktor/client/plugins/websocket/ClientWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "Lio/ktor/client/call/HttpClientCall;", "getCall", "()Lio/ktor/client/call/HttpClientCall;", "call", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ClientWebSocketSession extends WebSocketSession {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static Object send(ClientWebSocketSession clientWebSocketSession, Frame frame, c cVar) {
            Object objSend = WebSocketSession.DefaultImpls.send(clientWebSocketSession, frame, cVar);
            return objSend == p109m6.a.f25430h ? objSend : A.f22523a;
        }
    }

    HttpClientCall getCall();

    @Override
    h getCoroutineContext();
}
