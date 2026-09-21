package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.SupabaseSerializer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/realtime/PresenceActionImpl;", "Lio/github/jan/supabase/realtime/PresenceAction;", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "joins", "", "", "Lio/github/jan/supabase/realtime/Presence;", "leaves", "<init>", "(Lio/github/jan/supabase/SupabaseSerializer;Ljava/util/Map;Ljava/util/Map;)V", "getSerializer$annotations", "()V", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "getJoins", "()Ljava/util/Map;", "getLeaves", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PresenceActionImpl implements PresenceAction {
    private final Map<String, Presence> joins;
    private final Map<String, Presence> leaves;
    private final SupabaseSerializer serializer;

    public PresenceActionImpl(SupabaseSerializer serializer, Map<String, Presence> joins, Map<String, Presence> leaves) {
        m.e(serializer, "serializer");
        m.e(joins, "joins");
        m.e(leaves, "leaves");
        this.serializer = serializer;
        this.joins = joins;
        this.leaves = leaves;
    }

    public static void getSerializer$annotations() {
    }

    @Override
    public Map<String, Presence> getJoins() {
        return this.joins;
    }

    @Override
    public Map<String, Presence> getLeaves() {
        return this.leaves;
    }

    public final SupabaseSerializer getSerializer() {
        return this.serializer;
    }
}
