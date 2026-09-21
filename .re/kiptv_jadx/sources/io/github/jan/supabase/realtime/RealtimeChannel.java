package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 E2\u00020\u0001:\u0002FEJ\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000eH¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0015\u0010\fJO\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\b\b\u0000\u0010\u0017*\u00020\u0016*\u00020\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u001a\u001a\u00020\u00072\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00040\u001bH'¢\u0006\u0004\b\u001f\u0010 J3\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e\"\b\b\u0000\u0010\u0017*\u00020\u0001*\u00020\u00002\u0006\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001eH&¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u00020\u0004*\u00020\u00002\u0006\u0010)\u001a\u00020(H'¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u00020\u0004*\u00020\u00002\u0006\u0010)\u001a\u00020(H'¢\u0006\u0004\b,\u0010+J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-H'¢\u0006\u0004\b/\u00100R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020-018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8&X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u001a\u0010D\u001a\u00020?8&X§\u0004¢\u0006\f\u0012\u0004\bB\u0010C\u001a\u0004\b@\u0010A\u0082\u0001\u0001G¨\u0006H"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeChannel;", "", "", "blockUntilSubscribed", "Lh6/A;", "subscribe", "(ZLl6/c;)Ljava/lang/Object;", "", "jwt", "updateAuth", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "unsubscribe", "(Ll6/c;)Ljava/lang/Object;", "event", "Lkotlinx/serialization/json/c;", "message", "broadcast", "(Ljava/lang/String;Lkotlinx/serialization/json/c;Ll6/c;)Ljava/lang/Object;", io.sentry.protocol.SentryThread.JsonKeys.STATE, "track", "(Lkotlinx/serialization/json/c;Ll6/c;)Ljava/lang/Object;", "untrack", "Lio/github/jan/supabase/realtime/PostgresAction;", "T", "LE6/d;", "action", "schema", "Lkotlin/Function1;", "Lio/github/jan/supabase/realtime/PostgresChangeFilter;", "filter", "LV7/g;", "postgresChangeFlowInternal", "(Lio/github/jan/supabase/realtime/RealtimeChannel;LE6/d;Ljava/lang/String;Lx6/j;)LV7/g;", "LE6/v;", "type", "broadcastFlowInternal", "(Lio/github/jan/supabase/realtime/RealtimeChannel;LE6/v;Ljava/lang/String;)LV7/g;", "Lio/github/jan/supabase/realtime/PresenceAction;", "presenceChangeFlow", "()LV7/g;", "Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "data", "addPostgresChange", "(Lio/github/jan/supabase/realtime/RealtimeChannel;Lio/github/jan/supabase/realtime/PostgresJoinConfig;)V", "removePostgresChange", "Lio/github/jan/supabase/realtime/RealtimeChannel$Status;", "status", "updateStatus", "(Lio/github/jan/supabase/realtime/RealtimeChannel$Status;)V", "LV7/l0;", "getStatus", "()LV7/l0;", "getTopic", "()Ljava/lang/String;", "topic", "Lio/github/jan/supabase/SupabaseClient;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "Lio/github/jan/supabase/realtime/Realtime;", "getRealtime", "()Lio/github/jan/supabase/realtime/Realtime;", io.github.jan.supabase.realtime.RealtimeTopic.PREFIX, "Lio/github/jan/supabase/realtime/CallbackManager;", "getCallbackManager", "()Lio/github/jan/supabase/realtime/CallbackManager;", "getCallbackManager$annotations", "()V", "callbackManager", "Companion", "Status", "Lio/github/jan/supabase/realtime/RealtimeChannelImpl;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface RealtimeChannel {
    public static final java.lang.String CHANNEL_EVENT_ACCESS_TOKEN = "access_token";
    public static final java.lang.String CHANNEL_EVENT_BROADCAST = "broadcast";
    public static final java.lang.String CHANNEL_EVENT_CLOSE = "phx_close";
    public static final java.lang.String CHANNEL_EVENT_ERROR = "phx_error";
    public static final java.lang.String CHANNEL_EVENT_JOIN = "phx_join";
    public static final java.lang.String CHANNEL_EVENT_LEAVE = "phx_leave";
    public static final java.lang.String CHANNEL_EVENT_POSTGRES_CHANGES = "postgres_changes";
    public static final java.lang.String CHANNEL_EVENT_PRESENCE = "presence";
    public static final java.lang.String CHANNEL_EVENT_PRESENCE_DIFF = "presence_diff";
    public static final java.lang.String CHANNEL_EVENT_PRESENCE_STATE = "presence_state";
    public static final java.lang.String CHANNEL_EVENT_REPLY = "phx_reply";
    public static final java.lang.String CHANNEL_EVENT_SYSTEM = "system";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.realtime.RealtimeChannel.Companion INSTANCE = io.github.jan.supabase.realtime.RealtimeChannel.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeChannel$Companion;", "", "<init>", "()V", "CHANNEL_EVENT_JOIN", "", "CHANNEL_EVENT_LEAVE", "CHANNEL_EVENT_CLOSE", "CHANNEL_EVENT_ERROR", "CHANNEL_EVENT_REPLY", "CHANNEL_EVENT_SYSTEM", "CHANNEL_EVENT_BROADCAST", "CHANNEL_EVENT_ACCESS_TOKEN", "CHANNEL_EVENT_PRESENCE", "CHANNEL_EVENT_PRESENCE_DIFF", "CHANNEL_EVENT_PRESENCE_STATE", "CHANNEL_EVENT_POSTGRES_CHANGES", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ io.github.jan.supabase.realtime.RealtimeChannel.Companion $$INSTANCE = new io.github.jan.supabase.realtime.RealtimeChannel.Companion();
        public static final java.lang.String CHANNEL_EVENT_ACCESS_TOKEN = "access_token";
        public static final java.lang.String CHANNEL_EVENT_BROADCAST = "broadcast";
        public static final java.lang.String CHANNEL_EVENT_CLOSE = "phx_close";
        public static final java.lang.String CHANNEL_EVENT_ERROR = "phx_error";
        public static final java.lang.String CHANNEL_EVENT_JOIN = "phx_join";
        public static final java.lang.String CHANNEL_EVENT_LEAVE = "phx_leave";
        public static final java.lang.String CHANNEL_EVENT_POSTGRES_CHANGES = "postgres_changes";
        public static final java.lang.String CHANNEL_EVENT_PRESENCE = "presence";
        public static final java.lang.String CHANNEL_EVENT_PRESENCE_DIFF = "presence_diff";
        public static final java.lang.String CHANNEL_EVENT_PRESENCE_STATE = "presence_state";
        public static final java.lang.String CHANNEL_EVENT_REPLY = "phx_reply";
        public static final java.lang.String CHANNEL_EVENT_SYSTEM = "system";

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @io.github.jan.supabase.annotations.SupabaseInternal
        public static /* synthetic */ void getCallbackManager$annotations() {
        }

        public static /* synthetic */ V7.InterfaceC0981g postgresChangeFlowInternal$default(io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel, io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel2, E6.InterfaceC0331d interfaceC0331d, java.lang.String str, p194x6.j jVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postgresChangeFlowInternal");
            }
            if ((i3 & 4) != 0) {
                jVar = new com.kiptv.core.model.C1933b(25);
            }
            return realtimeChannel.postgresChangeFlowInternal(realtimeChannel2, interfaceC0331d, str, jVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static p070h6.A postgresChangeFlowInternal$lambda$0(io.github.jan.supabase.realtime.PostgresChangeFilter postgresChangeFilter) {
            kotlin.jvm.internal.m.e(postgresChangeFilter, "<this>");
            return p070h6.A.f22523a;
        }

        public static /* synthetic */ java.lang.Object subscribe$default(io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel, boolean z6, p100l6.c cVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
            }
            if ((i3 & 1) != 0) {
                z6 = false;
            }
            return realtimeChannel.subscribe(z6, cVar);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeChannel$Status;", "", "<init>", "(Ljava/lang/String;I)V", "UNSUBSCRIBED", "SUBSCRIBING", "SUBSCRIBED", "UNSUBSCRIBING", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public enum Status {
        UNSUBSCRIBED,
        SUBSCRIBING,
        SUBSCRIBED,
        UNSUBSCRIBING;

        private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());

        public static p126o6.a getEntries() {
            return $ENTRIES;
        }
    }

    @io.github.jan.supabase.annotations.SupabaseInternal
    void addPostgresChange(io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel, io.github.jan.supabase.realtime.PostgresJoinConfig postgresJoinConfig);

    java.lang.Object broadcast(java.lang.String str, kotlinx.serialization.json.c cVar, p100l6.c cVar2);

    @io.github.jan.supabase.annotations.SupabaseInternal
    <T> V7.InterfaceC0981g broadcastFlowInternal(io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel, E6.v vVar, java.lang.String str);

    io.github.jan.supabase.realtime.CallbackManager getCallbackManager();

    io.github.jan.supabase.realtime.Realtime getRealtime();

    V7.l0 getStatus();

    io.github.jan.supabase.SupabaseClient getSupabaseClient();

    java.lang.String getTopic();

    @io.github.jan.supabase.annotations.SupabaseInternal
    <T extends io.github.jan.supabase.realtime.PostgresAction> V7.InterfaceC0981g postgresChangeFlowInternal(io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel, E6.InterfaceC0331d interfaceC0331d, java.lang.String str, p194x6.j jVar);

    V7.InterfaceC0981g presenceChangeFlow();

    @io.github.jan.supabase.annotations.SupabaseInternal
    void removePostgresChange(io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel, io.github.jan.supabase.realtime.PostgresJoinConfig postgresJoinConfig);

    java.lang.Object subscribe(boolean z6, p100l6.c cVar);

    java.lang.Object track(kotlinx.serialization.json.c cVar, p100l6.c cVar2);

    java.lang.Object unsubscribe(p100l6.c cVar);

    java.lang.Object untrack(p100l6.c cVar);

    java.lang.Object updateAuth(java.lang.String str, p100l6.c cVar);

    @io.github.jan.supabase.annotations.SupabaseInternal
    void updateStatus(io.github.jan.supabase.realtime.RealtimeChannel.Status status);
}
