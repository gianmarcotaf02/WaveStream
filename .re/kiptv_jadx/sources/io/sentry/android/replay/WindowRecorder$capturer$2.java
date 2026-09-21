package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowRecorder$capturer$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    public static final io.sentry.android.replay.WindowRecorder$capturer$2 INSTANCE = new io.sentry.android.replay.WindowRecorder$capturer$2();

    public WindowRecorder$capturer$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.util.concurrent.ScheduledExecutorService invoke() {
        return java.util.concurrent.Executors.newSingleThreadScheduledExecutor(new io.sentry.android.replay.WindowRecorder.RecorderExecutorServiceThreadFactory());
    }
}
