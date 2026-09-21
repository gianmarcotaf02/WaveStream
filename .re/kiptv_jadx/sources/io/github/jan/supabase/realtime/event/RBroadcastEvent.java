package io.github.jan.supabase.realtime.event;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/realtime/event/RBroadcastEvent;", "Lio/github/jan/supabase/realtime/event/RealtimeEvent;", "<init>", "()V", "Lio/github/jan/supabase/realtime/RealtimeChannel;", "channel", "Lio/github/jan/supabase/realtime/RealtimeMessage;", "message", "Lh6/A;", "handle", "(Lio/github/jan/supabase/realtime/RealtimeChannel;Lio/github/jan/supabase/realtime/RealtimeMessage;Ll6/c;)Ljava/lang/Object;", "", "appliesTo", "(Lio/github/jan/supabase/realtime/RealtimeMessage;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class RBroadcastEvent implements io.github.jan.supabase.realtime.event.RealtimeEvent {
    public static final io.github.jan.supabase.realtime.event.RBroadcastEvent INSTANCE = new io.github.jan.supabase.realtime.event.RBroadcastEvent();

    private RBroadcastEvent() {
    }

    @Override // io.github.jan.supabase.realtime.event.RealtimeEvent
    public boolean appliesTo(io.github.jan.supabase.realtime.RealtimeMessage message) {
        kotlin.jvm.internal.m.e(message, "message");
        return kotlin.jvm.internal.m.a(message.getEvent(), "broadcast");
    }

    public boolean equals(java.lang.Object other) {
        return this == other || (other instanceof io.github.jan.supabase.realtime.event.RBroadcastEvent);
    }

    @Override // io.github.jan.supabase.realtime.event.RealtimeEvent
    public java.lang.Object handle(io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel, io.github.jan.supabase.realtime.RealtimeMessage realtimeMessage, p100l6.c cVar) {
        java.lang.String strD;
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) realtimeMessage.getPayload().get("event");
        if (bVar == null || (strD = p162s8.l.j(bVar).d()) == null) {
            strD = "";
        }
        io.github.jan.supabase.realtime.CallbackManager callbackManager = realtimeChannel.getCallbackManager();
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) realtimeMessage.getPayload().get("payload");
        callbackManager.triggerBroadcast(strD, bVar2 != null ? p162s8.l.i(bVar2) : new kotlinx.serialization.json.c(new java.util.LinkedHashMap()));
        return p070h6.A.f22523a;
    }

    public int hashCode() {
        return -1887052508;
    }

    public java.lang.String toString() {
        return "RBroadcastEvent";
    }
}
