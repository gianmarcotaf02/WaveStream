package io.github.jan.supabase.realtime;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/realtime/RealtimeTopic;", "", "<init>", "()V", "PREFIX", "", "withChannelId", "channelId", "realtime-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RealtimeTopic {
    public static final RealtimeTopic INSTANCE = new RealtimeTopic();
    public static final String PREFIX = "realtime";

    private RealtimeTopic() {
    }

    public final String withChannelId(String channelId) {
        m.e(channelId, "channelId");
        return "realtime:".concat(channelId);
    }
}
