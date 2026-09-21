package io.github.jan.supabase.realtime.event;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000 \f2\u00020\u0001:\u0001\fJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000b\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lio/github/jan/supabase/realtime/event/RealtimeEvent;", "", "Lio/github/jan/supabase/realtime/RealtimeChannel;", "channel", "Lio/github/jan/supabase/realtime/RealtimeMessage;", "message", "Lh6/A;", "handle", "(Lio/github/jan/supabase/realtime/RealtimeChannel;Lio/github/jan/supabase/realtime/RealtimeMessage;Ll6/c;)Ljava/lang/Object;", "", "appliesTo", "(Lio/github/jan/supabase/realtime/RealtimeMessage;)Z", "Companion", "Lio/github/jan/supabase/realtime/event/RBroadcastEvent;", "Lio/github/jan/supabase/realtime/event/RCloseEvent;", "Lio/github/jan/supabase/realtime/event/RErrorEvent;", "Lio/github/jan/supabase/realtime/event/RPostgresChangesEvent;", "Lio/github/jan/supabase/realtime/event/RPostgresServerChangesEvent;", "Lio/github/jan/supabase/realtime/event/RPresenceDiffEvent;", "Lio/github/jan/supabase/realtime/event/RPresenceStateEvent;", "Lio/github/jan/supabase/realtime/event/RSystemEvent;", "Lio/github/jan/supabase/realtime/event/RSystemReplyEvent;", "Lio/github/jan/supabase/realtime/event/RTokenExpiredEvent;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RealtimeEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.realtime.event.RealtimeEvent.Companion INSTANCE = io.github.jan.supabase.realtime.event.RealtimeEvent.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/realtime/event/RealtimeEvent$Companion;", "", "<init>", "()V", "EVENTS", "", "Lio/github/jan/supabase/realtime/event/RealtimeEvent;", "resolveEvent", "realtimeMessage", "Lio/github/jan/supabase/realtime/RealtimeMessage;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ io.github.jan.supabase.realtime.event.RealtimeEvent.Companion $$INSTANCE = new io.github.jan.supabase.realtime.event.RealtimeEvent.Companion();
        private static final java.util.Set<io.github.jan.supabase.realtime.event.RealtimeEvent> EVENTS = p078i6.m.F0(new io.github.jan.supabase.realtime.event.RealtimeEvent[]{io.github.jan.supabase.realtime.event.RBroadcastEvent.INSTANCE, io.github.jan.supabase.realtime.event.RCloseEvent.INSTANCE, io.github.jan.supabase.realtime.event.RErrorEvent.INSTANCE, io.github.jan.supabase.realtime.event.RPostgresChangesEvent.INSTANCE, io.github.jan.supabase.realtime.event.RPostgresServerChangesEvent.INSTANCE, io.github.jan.supabase.realtime.event.RPresenceStateEvent.INSTANCE, io.github.jan.supabase.realtime.event.RPresenceDiffEvent.INSTANCE, io.github.jan.supabase.realtime.event.RSystemEvent.INSTANCE, io.github.jan.supabase.realtime.event.RTokenExpiredEvent.INSTANCE, io.github.jan.supabase.realtime.event.RSystemReplyEvent.INSTANCE});

        private Companion() {
        }

        public final io.github.jan.supabase.realtime.event.RealtimeEvent resolveEvent(io.github.jan.supabase.realtime.RealtimeMessage realtimeMessage) {
            java.lang.Object next;
            kotlin.jvm.internal.m.e(realtimeMessage, "realtimeMessage");
            java.util.Iterator<T> it = EVENTS.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((io.github.jan.supabase.realtime.event.RealtimeEvent) next).appliesTo(realtimeMessage)) {
                    return (io.github.jan.supabase.realtime.event.RealtimeEvent) next;
                }
            }
            next = null;
            return (io.github.jan.supabase.realtime.event.RealtimeEvent) next;
        }
    }

    boolean appliesTo(io.github.jan.supabase.realtime.RealtimeMessage message);

    java.lang.Object handle(io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel, io.github.jan.supabase.realtime.RealtimeMessage realtimeMessage, p100l6.c cVar);
}
