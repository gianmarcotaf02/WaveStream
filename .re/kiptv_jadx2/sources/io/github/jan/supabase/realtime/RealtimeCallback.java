package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\f\r\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeCallback;", "T", "", "Lkotlin/Function1;", "Lh6/A;", "getCallback", "()Lx6/j;", "callback", "", "getId", "()J", "id", "PostgresCallback", "BroadcastCallback", "PresenceCallback", "Lio/github/jan/supabase/realtime/RealtimeCallback$BroadcastCallback;", "Lio/github/jan/supabase/realtime/RealtimeCallback$PostgresCallback;", "Lio/github/jan/supabase/realtime/RealtimeCallback$PresenceCallback;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@SupabaseInternal
public interface RealtimeCallback<T> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeCallback$BroadcastCallback;", "Lio/github/jan/supabase/realtime/RealtimeCallback;", "Lkotlinx/serialization/json/c;", "Lkotlin/Function1;", "Lh6/A;", "callback", "", "event", "", "id", "<init>", "(Lx6/j;Ljava/lang/String;J)V", "Lx6/j;", "getCallback", "()Lx6/j;", "Ljava/lang/String;", "getEvent", "()Ljava/lang/String;", "J", "getId", "()J", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class BroadcastCallback implements RealtimeCallback<kotlinx.serialization.json.c> {
        private final j callback;
        private final String event;
        private final long id;

        public BroadcastCallback(j callback, String event, long j) {
            m.e(callback, "callback");
            m.e(event, "event");
            this.callback = callback;
            this.event = event;
            this.id = j;
        }

        @Override
        public j getCallback() {
            return this.callback;
        }

        public final String getEvent() {
            return this.event;
        }

        @Override
        public long getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeCallback$PostgresCallback;", "Lio/github/jan/supabase/realtime/RealtimeCallback;", "Lio/github/jan/supabase/realtime/PostgresAction;", "Lkotlin/Function1;", "Lh6/A;", "callback", "Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "filter", "", "id", "<init>", "(Lx6/j;Lio/github/jan/supabase/realtime/PostgresJoinConfig;J)V", "Lx6/j;", "getCallback", "()Lx6/j;", "Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "getFilter", "()Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "J", "getId", "()J", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PostgresCallback implements RealtimeCallback<PostgresAction> {
        private final j callback;
        private final PostgresJoinConfig filter;
        private final long id;

        public PostgresCallback(j callback, PostgresJoinConfig filter, long j) {
            m.e(callback, "callback");
            m.e(filter, "filter");
            this.callback = callback;
            this.filter = filter;
            this.id = j;
        }

        @Override
        public j getCallback() {
            return this.callback;
        }

        public final PostgresJoinConfig getFilter() {
            return this.filter;
        }

        @Override
        public long getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeCallback$PresenceCallback;", "Lio/github/jan/supabase/realtime/RealtimeCallback;", "Lio/github/jan/supabase/realtime/PresenceAction;", "Lkotlin/Function1;", "Lh6/A;", "callback", "", "id", "<init>", "(Lx6/j;J)V", "Lx6/j;", "getCallback", "()Lx6/j;", "J", "getId", "()J", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PresenceCallback implements RealtimeCallback<PresenceAction> {
        private final j callback;
        private final long id;

        public PresenceCallback(j callback, long j) {
            m.e(callback, "callback");
            this.callback = callback;
            this.id = j;
        }

        @Override
        public j getCallback() {
            return this.callback;
        }

        @Override
        public long getId() {
            return this.id;
        }
    }

    j getCallback();

    long getId();
}
