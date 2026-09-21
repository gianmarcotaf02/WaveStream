package io.sentry.android.replay;

import androidx.media3.container.NalUnitUtil;
import io.sentry.SentryReplayOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.c;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\"(\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007\"(\u0010\b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"value", "", "maskAllImages", "Lio/sentry/SentryReplayOptions;", "getMaskAllImages", "(Lio/sentry/SentryReplayOptions;)Z", "setMaskAllImages", "(Lio/sentry/SentryReplayOptions;Z)V", "maskAllText", "getMaskAllText", "setMaskAllText", "sentry-android-replay_release"}, k = 2, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SessionReplayOptionsKt {
    @c
    public static final boolean getMaskAllImages(SentryReplayOptions sentryReplayOptions) {
        m.e(sentryReplayOptions, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    @c
    public static final boolean getMaskAllText(SentryReplayOptions sentryReplayOptions) {
        m.e(sentryReplayOptions, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    public static final void setMaskAllImages(SentryReplayOptions sentryReplayOptions, boolean z6) {
        m.e(sentryReplayOptions, "<this>");
        sentryReplayOptions.setMaskAllImages(z6);
    }

    public static final void setMaskAllText(SentryReplayOptions sentryReplayOptions, boolean z6) {
        m.e(sentryReplayOptions, "<this>");
        sentryReplayOptions.setMaskAllText(z6);
    }
}
