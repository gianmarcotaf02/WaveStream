package io.github.jan.supabase.realtime.websocket;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.realtime.RealtimeMessage;
import kotlin.Metadata;
import p100l6.c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/github/jan/supabase/realtime/websocket/RealtimeWebsocket;", "", "Lio/github/jan/supabase/realtime/RealtimeMessage;", "receive", "(Ll6/c;)Ljava/lang/Object;", "message", "Lh6/A;", "send", "(Lio/github/jan/supabase/realtime/RealtimeMessage;Ll6/c;)Ljava/lang/Object;", "blockUntilDisconnect", "disconnect", "()V", "", "getHasIncomingMessages", "()Z", "hasIncomingMessages", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RealtimeWebsocket {
    Object blockUntilDisconnect(c cVar);

    void disconnect();

    boolean getHasIncomingMessages();

    Object receive(c cVar);

    Object send(RealtimeMessage realtimeMessage, c cVar);
}
