package io.sentry.android.replay;

import Y0.w;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/sentry/android/replay/SentryReplayModifiers;", "", "<init>", "()V", "LY0/w;", "", "SentryPrivacy", "LY0/w;", "getSentryPrivacy", "()LY0/w;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SentryReplayModifiers {
    public static final SentryReplayModifiers INSTANCE = new SentryReplayModifiers();
    private static final w SentryPrivacy = new w("SentryPrivacy", SentryReplayModifiers$SentryPrivacy$1.INSTANCE);
    public static final int $stable = 8;

    private SentryReplayModifiers() {
    }

    public final w getSentryPrivacy() {
        return SentryPrivacy;
    }
}
