package io.ktor.websocket;

import S7.F;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.utils.io.InternalAPI;
import java.util.List;
import kotlin.Metadata;
import p070h6.A;
import p078i6.w;
import p100l6.c;
import p100l6.h;
import p109m6.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/ktor/websocket/DefaultWebSocketSession;", "Lio/ktor/websocket/WebSocketSession;", "", "Lio/ktor/websocket/WebSocketExtension;", "negotiatedExtensions", "Lh6/A;", TtmlNode.START, "(Ljava/util/List;)V", "", "getPingIntervalMillis", "()J", "setPingIntervalMillis", "(J)V", "pingIntervalMillis", "getTimeoutMillis", "setTimeoutMillis", "timeoutMillis", "LS7/F;", "Lio/ktor/websocket/CloseReason;", "getCloseReason", "()LS7/F;", "closeReason", "ktor-websockets"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface DefaultWebSocketSession extends WebSocketSession {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static Object send(DefaultWebSocketSession defaultWebSocketSession, Frame frame, c cVar) {
            Object objSend = WebSocketSession.DefaultImpls.send(defaultWebSocketSession, frame, cVar);
            return objSend == a.f25430h ? objSend : A.f22523a;
        }

        public static void start$default(DefaultWebSocketSession defaultWebSocketSession, List list, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i3 & 1) != 0) {
                list = w.f23205h;
            }
            defaultWebSocketSession.start(list);
        }
    }

    F getCloseReason();

    @Override
    h getCoroutineContext();

    long getPingIntervalMillis();

    long getTimeoutMillis();

    void setPingIntervalMillis(long j);

    void setTimeoutMillis(long j);

    @InternalAPI
    void start(List<? extends WebSocketExtension<?>> negotiatedExtensions);
}
