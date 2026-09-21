package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lio/sentry/android/replay/ReplayLifecycle;", "", "()V", "currentState", "Lio/sentry/android/replay/ReplayState;", "getCurrentState$sentry_android_replay_release", "()Lio/sentry/android/replay/ReplayState;", "setCurrentState$sentry_android_replay_release", "(Lio/sentry/android/replay/ReplayState;)V", "isAllowed", "", "newState", "isTouchRecordingAllowed", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayLifecycle {
    public static final int $stable = 8;
    private volatile io.sentry.android.replay.ReplayState currentState = io.sentry.android.replay.ReplayState.INITIAL;

    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.sentry.android.replay.ReplayState.values().length];
            try {
                iArr[io.sentry.android.replay.ReplayState.INITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.sentry.android.replay.ReplayState.STARTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.sentry.android.replay.ReplayState.RESUMED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[io.sentry.android.replay.ReplayState.PAUSED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[io.sentry.android.replay.ReplayState.STOPPED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[io.sentry.android.replay.ReplayState.CLOSED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: getCurrentState$sentry_android_replay_release, reason: from getter */
    public final io.sentry.android.replay.ReplayState getCurrentState() {
        return this.currentState;
    }

    public final boolean isAllowed(io.sentry.android.replay.ReplayState newState) {
        kotlin.jvm.internal.m.e(newState, "newState");
        switch (io.sentry.android.replay.ReplayLifecycle.WhenMappings.$EnumSwitchMapping$0[this.currentState.ordinal()]) {
            case 1:
                return newState == io.sentry.android.replay.ReplayState.STARTED || newState == io.sentry.android.replay.ReplayState.CLOSED;
            case 2:
                return newState == io.sentry.android.replay.ReplayState.PAUSED || newState == io.sentry.android.replay.ReplayState.STOPPED || newState == io.sentry.android.replay.ReplayState.CLOSED;
            case 3:
                return newState == io.sentry.android.replay.ReplayState.PAUSED || newState == io.sentry.android.replay.ReplayState.STOPPED || newState == io.sentry.android.replay.ReplayState.CLOSED;
            case 4:
                return newState == io.sentry.android.replay.ReplayState.RESUMED || newState == io.sentry.android.replay.ReplayState.STOPPED || newState == io.sentry.android.replay.ReplayState.CLOSED;
            case 5:
                return newState == io.sentry.android.replay.ReplayState.STARTED || newState == io.sentry.android.replay.ReplayState.CLOSED;
            case 6:
                return false;
            default:
                throw new I3.b();
        }
    }

    public final boolean isTouchRecordingAllowed() {
        return this.currentState == io.sentry.android.replay.ReplayState.STARTED || this.currentState == io.sentry.android.replay.ReplayState.RESUMED;
    }

    public final void setCurrentState$sentry_android_replay_release(io.sentry.android.replay.ReplayState replayState) {
        kotlin.jvm.internal.m.e(replayState, "<set-?>");
        this.currentState = replayState;
    }
}
