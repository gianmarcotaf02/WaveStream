package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import p194x6.j;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0013\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u0015H&¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00070\u0015H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0003H&¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002H&¢\u0006\u0004\b$\u0010%\u0082\u0001\u0001&¨\u0006'"}, d2 = {"Lio/github/jan/supabase/realtime/CallbackManager;", "", "", "", "ids", "Lio/github/jan/supabase/realtime/PostgresAction;", "data", "Lh6/A;", "triggerPostgresChange", "(Ljava/util/List;Lio/github/jan/supabase/realtime/PostgresAction;)V", "", "event", "Lkotlinx/serialization/json/c;", "triggerBroadcast", "(Ljava/lang/String;Lkotlinx/serialization/json/c;)V", "", "Lio/github/jan/supabase/realtime/Presence;", "joins", "leaves", "triggerPresenceDiff", "(Ljava/util/Map;Ljava/util/Map;)V", "Lkotlin/Function1;", "callback", "addBroadcastCallback", "(Ljava/lang/String;Lx6/j;)J", "Lio/github/jan/supabase/realtime/PostgresJoinConfig;", "filter", "addPostgresCallback", "(Lio/github/jan/supabase/realtime/PostgresJoinConfig;Lx6/j;)J", "Lio/github/jan/supabase/realtime/PresenceAction;", "addPresenceCallback", "(Lx6/j;)J", "id", "removeCallbackById", "(J)V", "changes", "setServerChanges", "(Ljava/util/List;)V", "Lio/github/jan/supabase/realtime/CallbackManagerImpl;", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@SupabaseInternal
public interface CallbackManager {
    long addBroadcastCallback(String event, j callback);

    long addPostgresCallback(PostgresJoinConfig filter, j callback);

    long addPresenceCallback(j callback);

    void removeCallbackById(long id);

    void setServerChanges(List<PostgresJoinConfig> changes);

    void triggerBroadcast(String event, kotlinx.serialization.json.c data);

    void triggerPostgresChange(List<Long> ids, PostgresAction data);

    void triggerPresenceDiff(Map<String, Presence> joins, Map<String, Presence> leaves);
}
