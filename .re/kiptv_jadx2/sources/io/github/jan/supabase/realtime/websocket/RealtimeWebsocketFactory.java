package io.github.jan.supabase.realtime.websocket;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import p100l6.c;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/realtime/websocket/RealtimeWebsocketFactory;", "", "", Request.JsonKeys.URL, "Lio/github/jan/supabase/realtime/websocket/RealtimeWebsocket;", "create", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RealtimeWebsocketFactory {
    Object create(String str, c cVar);
}
