package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004\u008f\u0001\u0090\u0001BY\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0019B\u008b\u0001\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010 J\u001f\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010+J\u0019\u0010.\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020%2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000202H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020%H\u0016¢\u0006\u0004\b8\u0010+J\u000f\u00109\u001a\u00020%H\u0016¢\u0006\u0004\b9\u0010+J\u0017\u0010<\u001a\u00020%2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020%2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\b<\u0010BJ\u000f\u0010C\u001a\u00020%H\u0016¢\u0006\u0004\bC\u0010+J\u0017\u0010F\u001a\u00020%2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020%2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020%2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020%H\u0016¢\u0006\u0004\bP\u0010+J\u0017\u0010S\u001a\u00020%2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020%H\u0002¢\u0006\u0004\bU\u0010+J\u000f\u0010V\u001a\u00020%H\u0002¢\u0006\u0004\bV\u0010+J\u000f\u0010W\u001a\u00020%H\u0002¢\u0006\u0004\bW\u0010+J\u000f\u0010X\u001a\u00020%H\u0002¢\u0006\u0004\bX\u0010+J\u000f\u0010Y\u001a\u00020%H\u0002¢\u0006\u0004\bY\u0010+J\u0019\u0010\\\u001a\u00020%2\b\b\u0002\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020%H\u0002¢\u0006\u0004\b^\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010_R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010`R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010aR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010bR\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010bR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010cR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020o8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bp\u0010k\u001a\u0004\bq\u0010rR#\u0010y\u001a\n u*\u0004\u0018\u00010t0t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010k\u001a\u0004\bw\u0010xR\u001a\u0010{\u001a\u00020z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001b\u0010\u007f\u001a\u00020z8\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u007f\u0010|\u001a\u0005\b\u0080\u0001\u0010~R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0085\u0001R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010aR\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u008e\u0001\u001a\u0004\u0018\u00010>8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0091\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/Integration;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "Lio/sentry/ReplayController;", "Landroid/content/ComponentCallbacks;", "Lio/sentry/IConnectionStatusProvider$IConnectionStatusObserver;", "Lio/sentry/transport/RateLimiter$IRateLimitObserver;", "Landroid/content/Context;", "context", "Lio/sentry/transport/ICurrentDateProvider;", "dateProvider", "Lkotlin/Function0;", "Lio/sentry/android/replay/Recorder;", "recorderProvider", "Lkotlin/Function1;", "", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfigProvider", "Lio/sentry/protocol/SentryId;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Landroid/content/Context;Lio/sentry/transport/ICurrentDateProvider;Lkotlin/jvm/functions/Function0;Lx6/j;Lx6/j;)V", "(Landroid/content/Context;Lio/sentry/transport/ICurrentDateProvider;)V", "Lio/sentry/android/replay/capture/CaptureStrategy;", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Lio/sentry/android/replay/gestures/GestureRecorder;", "gestureRecorderProvider", "(Landroid/content/Context;Lio/sentry/transport/ICurrentDateProvider;Lkotlin/jvm/functions/Function0;Lx6/j;Lx6/j;Lx6/j;Lio/sentry/android/replay/util/MainLooperHandler;Lkotlin/jvm/functions/Function0;)V", "Lio/sentry/IScopes;", "scopes", "Lio/sentry/SentryOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lh6/A;", "register", "(Lio/sentry/IScopes;Lio/sentry/SentryOptions;)V", "isRecording", "()Z", androidx.media3.extractor.text.ttml.TtmlNode.START, "()V", "resume", "isTerminating", "captureReplay", "(Ljava/lang/Boolean;)V", "getReplayId", "()Lio/sentry/protocol/SentryId;", "Lio/sentry/ReplayBreadcrumbConverter;", "converter", "setBreadcrumbConverter", "(Lio/sentry/ReplayBreadcrumbConverter;)V", "getBreadcrumbConverter", "()Lio/sentry/ReplayBreadcrumbConverter;", "pause", "stop", "Landroid/graphics/Bitmap;", "bitmap", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;)V", "Ljava/io/File;", "screenshot", "", "frameTimestamp", "(Ljava/io/File;J)V", "close", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lio/sentry/IConnectionStatusProvider$ConnectionStatus;", "status", "onConnectionStatusChanged", "(Lio/sentry/IConnectionStatusProvider$ConnectionStatus;)V", "Lio/sentry/transport/RateLimiter;", "rateLimiter", "onRateLimitChanged", "(Lio/sentry/transport/RateLimiter;)V", "onLowMemory", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "resumeInternal", "pauseInternal", "checkCanRecord", "registerRootViewListeners", "unregisterRootViewListeners", "", "unfinishedReplayId", "cleanupReplays", "(Ljava/lang/String;)V", "finalizePreviousReplay", "Landroid/content/Context;", "Lio/sentry/transport/ICurrentDateProvider;", "Lkotlin/jvm/functions/Function0;", "Lx6/j;", "Lio/sentry/SentryOptions;", "Lio/sentry/IScopes;", "recorder", "Lio/sentry/android/replay/Recorder;", "gestureRecorder", "Lio/sentry/android/replay/gestures/GestureRecorder;", "Lio/sentry/util/Random;", "random$delegate", "Lh6/h;", "getRandom", "()Lio/sentry/util/Random;", "random", "Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy$delegate", "getRootViewsSpy$sentry_android_replay_release", "()Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "replayExecutor$delegate", "getReplayExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isManualPause", "isManualPause$sentry_android_replay_release", "captureStrategy", "Lio/sentry/android/replay/capture/CaptureStrategy;", "replayBreadcrumbConverter", "Lio/sentry/ReplayBreadcrumbConverter;", "Lio/sentry/android/replay/util/MainLooperHandler;", "Lio/sentry/util/AutoClosableReentrantLock;", "lifecycleLock", "Lio/sentry/util/AutoClosableReentrantLock;", "Lio/sentry/android/replay/ReplayLifecycle;", "lifecycle", "Lio/sentry/android/replay/ReplayLifecycle;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "PreviousReplayHint", "ReplayExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayIntegration implements io.sentry.Integration, java.io.Closeable, io.sentry.android.replay.ScreenshotRecorderCallback, io.sentry.android.replay.gestures.TouchRecorderCallback, io.sentry.ReplayController, android.content.ComponentCallbacks, io.sentry.IConnectionStatusProvider.IConnectionStatusObserver, io.sentry.transport.RateLimiter.IRateLimitObserver, java.lang.AutoCloseable {
    public static final int $stable = 8;
    private io.sentry.android.replay.capture.CaptureStrategy captureStrategy;
    private final android.content.Context context;
    private final io.sentry.transport.ICurrentDateProvider dateProvider;
    private io.sentry.android.replay.gestures.GestureRecorder gestureRecorder;
    private kotlin.jvm.functions.Function0 gestureRecorderProvider;
    private final java.util.concurrent.atomic.AtomicBoolean isEnabled;
    private final java.util.concurrent.atomic.AtomicBoolean isManualPause;
    private final io.sentry.android.replay.ReplayLifecycle lifecycle;
    private final io.sentry.util.AutoClosableReentrantLock lifecycleLock;
    private io.sentry.android.replay.util.MainLooperHandler mainLooperHandler;
    private io.sentry.SentryOptions options;

    /* JADX INFO: renamed from: random$delegate, reason: from kotlin metadata */
    private final p070h6.h random;
    private io.sentry.android.replay.Recorder recorder;
    private final p194x6.j recorderConfigProvider;
    private final kotlin.jvm.functions.Function0 recorderProvider;
    private io.sentry.ReplayBreadcrumbConverter replayBreadcrumbConverter;
    private final p194x6.j replayCacheProvider;
    private p194x6.j replayCaptureStrategyProvider;

    /* JADX INFO: renamed from: replayExecutor$delegate, reason: from kotlin metadata */
    private final p070h6.h replayExecutor;

    /* JADX INFO: renamed from: rootViewsSpy$delegate, reason: from kotlin metadata */
    private final p070h6.h rootViewsSpy;
    private io.sentry.IScopes scopes;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$PreviousReplayHint;", "Lio/sentry/hints/Backfillable;", "()V", "shouldEnrich", "", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PreviousReplayHint implements io.sentry.hints.Backfillable {
        @Override // io.sentry.hints.Backfillable
        public boolean shouldEnrich() {
            return false;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$ReplayExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ReplayExecutorServiceThreadFactory implements java.util.concurrent.ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r9) {
            kotlin.jvm.internal.m.e(r9, "r");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SentryReplayIntegration-");
            int i3 = this.cnt;
            this.cnt = i3 + 1;
            sb.append(i3);
            java.lang.Thread thread = new java.lang.Thread(r9, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$captureReplay$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "newTimestamp", "Lh6/A;", "invoke", "(Ljava/util/Date;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public AnonymousClass1() {
            super(1);
        }

        @Override // p194x6.j
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            invoke((java.util.Date) obj);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.util.Date newTimestamp) {
            kotlin.jvm.internal.m.e(newTimestamp, "newTimestamp");
            io.sentry.android.replay.capture.CaptureStrategy captureStrategy = io.sentry.android.replay.ReplayIntegration.this.captureStrategy;
            if (captureStrategy != null) {
                io.sentry.android.replay.capture.CaptureStrategy captureStrategy2 = io.sentry.android.replay.ReplayIntegration.this.captureStrategy;
                java.lang.Integer numValueOf = captureStrategy2 != null ? java.lang.Integer.valueOf(captureStrategy2.getCurrentSegment()) : null;
                kotlin.jvm.internal.m.b(numValueOf);
                captureStrategy.setCurrentSegment(numValueOf.intValue() + 1);
            }
            io.sentry.android.replay.capture.CaptureStrategy captureStrategy3 = io.sentry.android.replay.ReplayIntegration.this.captureStrategy;
            if (captureStrategy3 == null) {
                return;
            }
            captureStrategy3.setSegmentTimestamp(newTimestamp);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$onScreenshotRecorded$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "", "frameTimeStamp", "Lh6/A;", "invoke", "(Lio/sentry/android/replay/ReplayCache;J)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ android.graphics.Bitmap $bitmap;
        final /* synthetic */ kotlin.jvm.internal.A $screen;
        final /* synthetic */ io.sentry.android.replay.ReplayIntegration this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(android.graphics.Bitmap bitmap, kotlin.jvm.internal.A a2, io.sentry.android.replay.ReplayIntegration replayIntegration) {
            super(2);
            this.$bitmap = bitmap;
            this.$screen = a2;
            this.this$0 = replayIntegration;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) throws java.io.IOException {
            invoke((io.sentry.android.replay.ReplayCache) obj, ((java.lang.Number) obj2).longValue());
            return p070h6.A.f22523a;
        }

        public final void invoke(io.sentry.android.replay.ReplayCache onScreenshotRecorded, long j) throws java.io.IOException {
            kotlin.jvm.internal.m.e(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.addFrame$sentry_android_replay_release(this.$bitmap, j, (java.lang.String) this.$screen.f24539h);
            this.this$0.checkCanRecord();
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$onScreenshotRecorded$3, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "", "<anonymous parameter 0>", "Lh6/A;", "invoke", "(Lio/sentry/android/replay/ReplayCache;J)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements p194x6.m {
        final /* synthetic */ long $frameTimestamp;
        final /* synthetic */ java.io.File $screenshot;
        final /* synthetic */ io.sentry.android.replay.ReplayIntegration this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(java.io.File file, long j, io.sentry.android.replay.ReplayIntegration replayIntegration) {
            super(2);
            this.$screenshot = file;
            this.$frameTimestamp = j;
            this.this$0 = replayIntegration;
        }

        @Override // p194x6.m
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            invoke((io.sentry.android.replay.ReplayCache) obj, ((java.lang.Number) obj2).longValue());
            return p070h6.A.f22523a;
        }

        public final void invoke(io.sentry.android.replay.ReplayCache onScreenshotRecorded, long j) {
            kotlin.jvm.internal.m.e(onScreenshotRecorded, "$this$onScreenshotRecorded");
            io.sentry.android.replay.ReplayCache.addFrame$default(onScreenshotRecorded, this.$screenshot, this.$frameTimestamp, null, 4, null);
            this.this$0.checkCanRecord();
        }
    }

    public ReplayIntegration(android.content.Context context, io.sentry.transport.ICurrentDateProvider dateProvider, kotlin.jvm.functions.Function0 function0, p194x6.j jVar, p194x6.j jVar2) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = function0;
        this.recorderConfigProvider = jVar;
        this.replayCacheProvider = jVar2;
        this.random = com.google.common.util.concurrent.D.B(io.sentry.android.replay.ReplayIntegration$random$2.INSTANCE);
        this.rootViewsSpy = com.google.common.util.concurrent.D.B(io.sentry.android.replay.ReplayIntegration$rootViewsSpy$2.INSTANCE);
        this.replayExecutor = com.google.common.util.concurrent.D.B(io.sentry.android.replay.ReplayIntegration$replayExecutor$2.INSTANCE);
        this.isEnabled = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.isManualPause = new java.util.concurrent.atomic.AtomicBoolean(false);
        io.sentry.NoOpReplayBreadcrumbConverter noOpReplayBreadcrumbConverter = io.sentry.NoOpReplayBreadcrumbConverter.getInstance();
        kotlin.jvm.internal.m.d(noOpReplayBreadcrumbConverter, "getInstance()");
        this.replayBreadcrumbConverter = noOpReplayBreadcrumbConverter;
        this.mainLooperHandler = new io.sentry.android.replay.util.MainLooperHandler(null, 1, null);
        this.lifecycleLock = new io.sentry.util.AutoClosableReentrantLock();
        this.lifecycle = new io.sentry.android.replay.ReplayLifecycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanRecord() {
        io.sentry.IScopes iScopes;
        io.sentry.IScopes iScopes2;
        io.sentry.transport.RateLimiter rateLimiter;
        io.sentry.transport.RateLimiter rateLimiter2;
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.SessionCaptureStrategy) {
            io.sentry.SentryOptions sentryOptions = this.options;
            if (sentryOptions == null) {
                kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            if (sentryOptions.getConnectionStatusProvider().getConnectionStatus() == io.sentry.IConnectionStatusProvider.ConnectionStatus.DISCONNECTED || !(((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(io.sentry.DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(io.sentry.DataCategory.Replay)))) {
                pauseInternal();
            }
        }
    }

    private final void cleanupReplays(java.lang.String unfinishedReplayId) {
        java.io.File[] fileArrListFiles;
        io.sentry.SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        java.lang.String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new java.io.File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (java.io.File file : fileArrListFiles) {
            java.lang.String name = file.getName();
            kotlin.jvm.internal.m.d(name, "name");
            if (O7.x.x0(name, "replay_", false)) {
                java.lang.String string = getReplayId().toString();
                kotlin.jvm.internal.m.d(string, "replayId.toString()");
                if (!O7.q.B0(name, string, false) && (O7.q.N0(unfinishedReplayId) || !O7.q.B0(name, unfinishedReplayId, false))) {
                    io.sentry.util.FileUtils.deleteRecursively(file);
                }
            }
        }
    }

    public static /* synthetic */ void cleanupReplays$default(io.sentry.android.replay.ReplayIntegration replayIntegration, java.lang.String str, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = "";
        }
        replayIntegration.cleanupReplays(str);
    }

    private final void finalizePreviousReplay() {
        io.sentry.SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        io.sentry.ISentryExecutorService executorService = sentryOptions.getExecutorService();
        kotlin.jvm.internal.m.d(executorService, "options.executorService");
        io.sentry.SentryOptions sentryOptions2 = this.options;
        if (sentryOptions2 != null) {
            io.sentry.android.replay.util.ExecutorsKt.submitSafely(executorService, sentryOptions2, "ReplayIntegration.finalize_previous_replay", new D1.RunnableC0239y(19, this));
        } else {
            kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finalizePreviousReplay$lambda$10(io.sentry.android.replay.ReplayIntegration this$0) throws java.io.IOException {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        io.sentry.SentryOptions sentryOptions = this$0.options;
        if (sentryOptions == null) {
            kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        java.lang.String str = (java.lang.String) io.sentry.cache.PersistingScopeObserver.read(sentryOptions, io.sentry.cache.PersistingScopeObserver.REPLAY_FILENAME, java.lang.String.class);
        if (str == null) {
            cleanupReplays$default(this$0, null, 1, null);
            return;
        }
        io.sentry.protocol.SentryId sentryId = new io.sentry.protocol.SentryId(str);
        if (sentryId.equals(io.sentry.protocol.SentryId.EMPTY_ID)) {
            cleanupReplays$default(this$0, null, 1, null);
            return;
        }
        io.sentry.android.replay.ReplayCache.Companion companion = io.sentry.android.replay.ReplayCache.INSTANCE;
        io.sentry.SentryOptions sentryOptions2 = this$0.options;
        if (sentryOptions2 == null) {
            kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        io.sentry.android.replay.LastSegmentData lastSegmentDataFromDisk$sentry_android_replay_release = companion.fromDisk$sentry_android_replay_release(sentryOptions2, sentryId, this$0.replayCacheProvider);
        if (lastSegmentDataFromDisk$sentry_android_replay_release == null) {
            cleanupReplays$default(this$0, null, 1, null);
            return;
        }
        io.sentry.SentryOptions sentryOptions3 = this$0.options;
        if (sentryOptions3 == null) {
            kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        java.lang.Object obj = io.sentry.cache.PersistingScopeObserver.read(sentryOptions3, io.sentry.cache.PersistingScopeObserver.BREADCRUMBS_FILENAME, java.util.List.class, new io.sentry.Breadcrumb.Deserializer());
        java.util.List<io.sentry.Breadcrumb> list = obj instanceof java.util.List ? (java.util.List) obj : null;
        io.sentry.android.replay.capture.CaptureStrategy.Companion companion2 = io.sentry.android.replay.capture.CaptureStrategy.INSTANCE;
        io.sentry.IScopes iScopes = this$0.scopes;
        io.sentry.SentryOptions sentryOptions4 = this$0.options;
        if (sentryOptions4 == null) {
            kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        io.sentry.android.replay.capture.CaptureStrategy.ReplaySegment replaySegmentCreateSegment = companion2.createSegment(iScopes, sentryOptions4, lastSegmentDataFromDisk$sentry_android_replay_release.getDuration(), lastSegmentDataFromDisk$sentry_android_replay_release.getTimestamp(), sentryId, lastSegmentDataFromDisk$sentry_android_replay_release.getId(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingHeight(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingWidth(), lastSegmentDataFromDisk$sentry_android_replay_release.getReplayType(), lastSegmentDataFromDisk$sentry_android_replay_release.getCache(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getFrameRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getBitRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getScreenAtStart(), list, new java.util.LinkedList(lastSegmentDataFromDisk$sentry_android_replay_release.getEvents()));
        if (replaySegmentCreateSegment instanceof io.sentry.android.replay.capture.CaptureStrategy.ReplaySegment.Created) {
            io.sentry.Hint hint = io.sentry.util.HintUtils.createWithTypeCheckHint(new io.sentry.android.replay.ReplayIntegration.PreviousReplayHint());
            io.sentry.IScopes iScopes2 = this$0.scopes;
            kotlin.jvm.internal.m.d(hint, "hint");
            ((io.sentry.android.replay.capture.CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegment).capture(iScopes2, hint);
        }
        this$0.cleanupReplays(str);
    }

    private final io.sentry.util.Random getRandom() {
        return (io.sentry.util.Random) this.random.getValue();
    }

    private final java.util.concurrent.ScheduledExecutorService getReplayExecutor() {
        return (java.util.concurrent.ScheduledExecutorService) this.replayExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$4(kotlin.jvm.internal.A screen, io.sentry.IScope it) {
        kotlin.jvm.internal.m.e(screen, "$screen");
        kotlin.jvm.internal.m.e(it, "it");
        java.lang.String screen2 = it.getScreen();
        screen.f24539h = screen2 != null ? O7.q.k1('.', screen2, screen2) : null;
    }

    private final void pauseInternal() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                io.sentry.android.replay.ReplayLifecycle replayLifecycle = this.lifecycle;
                io.sentry.android.replay.ReplayState replayState = io.sentry.android.replay.ReplayState.PAUSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    io.sentry.android.replay.Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.pause();
                    }
                    io.sentry.android.replay.capture.CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.pause();
                    }
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    private final void registerRootViewListeners() {
        if (this.recorder instanceof io.sentry.android.replay.OnRootViewsChangedListener) {
            java.util.concurrent.CopyOnWriteArrayList<io.sentry.android.replay.OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            io.sentry.android.replay.Recorder recorder = this.recorder;
            kotlin.jvm.internal.m.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.add((io.sentry.android.replay.OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().add(this.gestureRecorder);
    }

    private final void resumeInternal() {
        io.sentry.IScopes iScopes;
        io.sentry.IScopes iScopes2;
        io.sentry.transport.RateLimiter rateLimiter;
        io.sentry.transport.RateLimiter rateLimiter2;
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                io.sentry.android.replay.ReplayLifecycle replayLifecycle = this.lifecycle;
                io.sentry.android.replay.ReplayState replayState = io.sentry.android.replay.ReplayState.RESUMED;
                if (replayLifecycle.isAllowed(replayState)) {
                    if (!this.isManualPause.get()) {
                        io.sentry.SentryOptions sentryOptions = this.options;
                        if (sentryOptions == null) {
                            kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                            throw null;
                        }
                        if (sentryOptions.getConnectionStatusProvider().getConnectionStatus() != io.sentry.IConnectionStatusProvider.ConnectionStatus.DISCONNECTED && (((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(io.sentry.DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(io.sentry.DataCategory.Replay)))) {
                            io.sentry.android.replay.capture.CaptureStrategy captureStrategy = this.captureStrategy;
                            if (captureStrategy != null) {
                                captureStrategy.resume();
                            }
                            io.sentry.android.replay.Recorder recorder = this.recorder;
                            if (recorder != null) {
                                recorder.resume();
                            }
                            this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                            com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                            return;
                        }
                    }
                    com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    private final void unregisterRootViewListeners() {
        if (this.recorder instanceof io.sentry.android.replay.OnRootViewsChangedListener) {
            java.util.concurrent.CopyOnWriteArrayList<io.sentry.android.replay.OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            io.sentry.android.replay.Recorder recorder = this.recorder;
            kotlin.jvm.internal.m.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.remove((io.sentry.android.replay.OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().remove(this.gestureRecorder);
    }

    @Override // io.sentry.ReplayController
    public void captureReplay(java.lang.Boolean isTerminating) {
        if (this.isEnabled.get() && isRecording()) {
            io.sentry.protocol.SentryId sentryId = io.sentry.protocol.SentryId.EMPTY_ID;
            io.sentry.android.replay.capture.CaptureStrategy captureStrategy = this.captureStrategy;
            if (sentryId.equals(captureStrategy != null ? captureStrategy.getCurrentReplayId() : null)) {
                io.sentry.SentryOptions sentryOptions = this.options;
                if (sentryOptions != null) {
                    sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Replay id is not set, not capturing for event", new java.lang.Object[0]);
                    return;
                } else {
                    kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
            }
            io.sentry.android.replay.capture.CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                captureStrategy2.captureReplay(kotlin.jvm.internal.m.a(isTerminating, java.lang.Boolean.TRUE), new io.sentry.android.replay.ReplayIntegration.AnonymousClass1());
            }
            io.sentry.android.replay.capture.CaptureStrategy captureStrategy3 = this.captureStrategy;
            this.captureStrategy = captureStrategy3 != null ? captureStrategy3.convert() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.sentry.transport.RateLimiter rateLimiter;
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get() && this.lifecycle.isAllowed(io.sentry.android.replay.ReplayState.CLOSED)) {
                io.sentry.SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                sentryOptions.getConnectionStatusProvider().removeConnectionStatusObserver(this);
                io.sentry.IScopes iScopes = this.scopes;
                if (iScopes != null && (rateLimiter = iScopes.getRateLimiter()) != null) {
                    rateLimiter.removeRateLimitObserver(this);
                }
                io.sentry.SentryOptions sentryOptions2 = this.options;
                if (sentryOptions2 == null) {
                    kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                if (sentryOptions2.getSessionReplay().isTrackOrientationChange()) {
                    try {
                        this.context.unregisterComponentCallbacks(this);
                    } catch (java.lang.Throwable unused) {
                    }
                }
                stop();
                io.sentry.android.replay.Recorder recorder = this.recorder;
                if (recorder != null) {
                    recorder.close();
                }
                this.recorder = null;
                getRootViewsSpy$sentry_android_replay_release().close();
                java.util.concurrent.ScheduledExecutorService replayExecutor = getReplayExecutor();
                kotlin.jvm.internal.m.d(replayExecutor, "replayExecutor");
                io.sentry.SentryOptions sentryOptions3 = this.options;
                if (sentryOptions3 == null) {
                    kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                io.sentry.android.replay.util.ExecutorsKt.gracefullyShutdown(replayExecutor, sentryOptions3);
                this.lifecycle.setCurrentState$sentry_android_replay_release(io.sentry.android.replay.ReplayState.CLOSED);
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                return;
            }
            com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.ReplayController
    /* JADX INFO: renamed from: getBreadcrumbConverter, reason: from getter */
    public io.sentry.ReplayBreadcrumbConverter getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    public final java.io.File getReplayCacheDir() {
        io.sentry.android.replay.capture.CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            return captureStrategy.getReplayCacheDir();
        }
        return null;
    }

    @Override // io.sentry.ReplayController
    public io.sentry.protocol.SentryId getReplayId() {
        io.sentry.protocol.SentryId currentReplayId;
        io.sentry.android.replay.capture.CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null && (currentReplayId = captureStrategy.getCurrentReplayId()) != null) {
            return currentReplayId;
        }
        io.sentry.protocol.SentryId EMPTY_ID = io.sentry.protocol.SentryId.EMPTY_ID;
        kotlin.jvm.internal.m.d(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    public final io.sentry.android.replay.RootViewsSpy getRootViewsSpy$sentry_android_replay_release() {
        return (io.sentry.android.replay.RootViewsSpy) this.rootViewsSpy.getValue();
    }

    /* JADX INFO: renamed from: isEnabled$sentry_android_replay_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: isManualPause$sentry_android_replay_release, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getIsManualPause() {
        return this.isManualPause;
    }

    @Override // io.sentry.ReplayController
    public boolean isRecording() {
        return this.lifecycle.getCurrentState().compareTo(io.sentry.android.replay.ReplayState.STARTED) >= 0 && this.lifecycle.getCurrentState().compareTo(io.sentry.android.replay.ReplayState.STOPPED) < 0;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        io.sentry.android.replay.ScreenshotRecorderConfig screenshotRecorderConfigFrom;
        io.sentry.android.replay.Recorder recorder;
        kotlin.jvm.internal.m.e(newConfig, "newConfig");
        if (this.isEnabled.get() && isRecording()) {
            io.sentry.android.replay.Recorder recorder2 = this.recorder;
            if (recorder2 != null) {
                recorder2.stop();
            }
            p194x6.j jVar = this.recorderConfigProvider;
            if (jVar == null || (screenshotRecorderConfigFrom = (io.sentry.android.replay.ScreenshotRecorderConfig) jVar.invoke(java.lang.Boolean.TRUE)) == null) {
                io.sentry.android.replay.ScreenshotRecorderConfig.Companion companion = io.sentry.android.replay.ScreenshotRecorderConfig.INSTANCE;
                android.content.Context context = this.context;
                io.sentry.SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                io.sentry.SentryReplayOptions sessionReplay = sentryOptions.getSessionReplay();
                kotlin.jvm.internal.m.d(sessionReplay, "options.sessionReplay");
                screenshotRecorderConfigFrom = companion.from(context, sessionReplay);
            }
            io.sentry.android.replay.capture.CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.onConfigurationChanged(screenshotRecorderConfigFrom);
            }
            io.sentry.android.replay.Recorder recorder3 = this.recorder;
            if (recorder3 != null) {
                recorder3.start(screenshotRecorderConfigFrom);
            }
            if (this.lifecycle.getCurrentState() != io.sentry.android.replay.ReplayState.PAUSED || (recorder = this.recorder) == null) {
                return;
            }
            recorder.pause();
        }
    }

    @Override // io.sentry.IConnectionStatusProvider.IConnectionStatusObserver
    public void onConnectionStatusChanged(io.sentry.IConnectionStatusProvider.ConnectionStatus status) {
        kotlin.jvm.internal.m.e(status, "status");
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.SessionCaptureStrategy) {
            if (status == io.sentry.IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // io.sentry.transport.RateLimiter.IRateLimitObserver
    public void onRateLimitChanged(io.sentry.transport.RateLimiter rateLimiter) {
        kotlin.jvm.internal.m.e(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof io.sentry.android.replay.capture.SessionCaptureStrategy) {
            if (rateLimiter.isActiveForCategory(io.sentry.DataCategory.All) || rateLimiter.isActiveForCategory(io.sentry.DataCategory.Replay)) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.m.e(bitmap, "bitmap");
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        io.sentry.IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new io.sentry.android.replay.b(a2, 0));
        }
        io.sentry.android.replay.capture.CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy.onScreenshotRecorded(bitmap, new io.sentry.android.replay.ReplayIntegration.AnonymousClass2(bitmap, a2, this));
        }
    }

    @Override // io.sentry.android.replay.gestures.TouchRecorderCallback
    public void onTouchEvent(android.view.MotionEvent event) {
        io.sentry.android.replay.capture.CaptureStrategy captureStrategy;
        kotlin.jvm.internal.m.e(event, "event");
        if (this.isEnabled.get() && this.lifecycle.isTouchRecordingAllowed() && (captureStrategy = this.captureStrategy) != null) {
            captureStrategy.onTouchEvent(event);
        }
    }

    @Override // io.sentry.ReplayController
    public void pause() {
        this.isManualPause.set(true);
        pauseInternal();
    }

    @Override // io.sentry.Integration
    public void register(io.sentry.IScopes scopes, io.sentry.SentryOptions options) {
        io.sentry.android.replay.Recorder windowRecorder;
        io.sentry.android.replay.gestures.GestureRecorder gestureRecorder;
        kotlin.jvm.internal.m.e(scopes, "scopes");
        kotlin.jvm.internal.m.e(options, "options");
        this.options = options;
        if (android.os.Build.VERSION.SDK_INT < 26) {
            options.getLogger().log(io.sentry.SentryLevel.INFO, "Session replay is only supported on API 26 and above", new java.lang.Object[0]);
            return;
        }
        if (!options.getSessionReplay().isSessionReplayEnabled() && !options.getSessionReplay().isSessionReplayForErrorsEnabled()) {
            options.getLogger().log(io.sentry.SentryLevel.INFO, "Session replay is disabled, no sample rate specified", new java.lang.Object[0]);
            return;
        }
        this.scopes = scopes;
        kotlin.jvm.functions.Function0 function0 = this.recorderProvider;
        if (function0 == null || (windowRecorder = (io.sentry.android.replay.Recorder) function0.invoke()) == null) {
            io.sentry.android.replay.util.MainLooperHandler mainLooperHandler = this.mainLooperHandler;
            java.util.concurrent.ScheduledExecutorService replayExecutor = getReplayExecutor();
            kotlin.jvm.internal.m.d(replayExecutor, "replayExecutor");
            windowRecorder = new io.sentry.android.replay.WindowRecorder(options, this, mainLooperHandler, replayExecutor);
        }
        this.recorder = windowRecorder;
        kotlin.jvm.functions.Function0 function1 = this.gestureRecorderProvider;
        if (function1 == null || (gestureRecorder = (io.sentry.android.replay.gestures.GestureRecorder) function1.invoke()) == null) {
            gestureRecorder = new io.sentry.android.replay.gestures.GestureRecorder(options, this);
        }
        this.gestureRecorder = gestureRecorder;
        this.isEnabled.set(true);
        options.getConnectionStatusProvider().addConnectionStatusObserver(this);
        io.sentry.transport.RateLimiter rateLimiter = scopes.getRateLimiter();
        if (rateLimiter != null) {
            rateLimiter.addRateLimitObserver(this);
        }
        if (options.getSessionReplay().isTrackOrientationChange()) {
            try {
                this.context.registerComponentCallbacks(this);
            } catch (java.lang.Throwable th) {
                options.getLogger().log(io.sentry.SentryLevel.INFO, "ComponentCallbacks is not available, orientation changes won't be handled by Session replay", th);
            }
        }
        io.sentry.util.IntegrationUtils.addIntegrationToSdkVersion("Replay");
        io.sentry.SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry-android-replay", "8.4.0");
        finalizePreviousReplay();
    }

    @Override // io.sentry.ReplayController
    public void resume() {
        this.isManualPause.set(false);
        resumeInternal();
    }

    @Override // io.sentry.ReplayController
    public void setBreadcrumbConverter(io.sentry.ReplayBreadcrumbConverter converter) {
        kotlin.jvm.internal.m.e(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    @Override // io.sentry.ReplayController
    public void start() {
        io.sentry.android.replay.ScreenshotRecorderConfig screenshotRecorderConfigFrom;
        io.sentry.android.replay.capture.CaptureStrategy bufferCaptureStrategy;
        io.sentry.android.replay.capture.CaptureStrategy captureStrategy;
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (!this.isEnabled.get()) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                return;
            }
            io.sentry.android.replay.ReplayLifecycle replayLifecycle = this.lifecycle;
            io.sentry.android.replay.ReplayState replayState = io.sentry.android.replay.ReplayState.STARTED;
            if (!replayLifecycle.isAllowed(replayState)) {
                io.sentry.SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Session replay is already being recorded, not starting a new one", new java.lang.Object[0]);
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                return;
            }
            io.sentry.util.Random random = getRandom();
            io.sentry.SentryOptions sentryOptions2 = this.options;
            if (sentryOptions2 == null) {
                kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            boolean zSample = io.sentry.android.replay.util.SamplingKt.sample(random, sentryOptions2.getSessionReplay().getSessionSampleRate());
            if (!zSample) {
                io.sentry.SentryOptions sentryOptions3 = this.options;
                if (sentryOptions3 == null) {
                    kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                if (!sentryOptions3.getSessionReplay().isSessionReplayForErrorsEnabled()) {
                    io.sentry.SentryOptions sentryOptions4 = this.options;
                    if (sentryOptions4 == null) {
                        kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    sentryOptions4.getLogger().log(io.sentry.SentryLevel.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new java.lang.Object[0]);
                    com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            p194x6.j jVar = this.recorderConfigProvider;
            if (jVar == null || (screenshotRecorderConfigFrom = (io.sentry.android.replay.ScreenshotRecorderConfig) jVar.invoke(java.lang.Boolean.FALSE)) == null) {
                io.sentry.android.replay.ScreenshotRecorderConfig.Companion companion = io.sentry.android.replay.ScreenshotRecorderConfig.INSTANCE;
                android.content.Context context = this.context;
                io.sentry.SentryOptions sentryOptions5 = this.options;
                if (sentryOptions5 == null) {
                    kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                io.sentry.SentryReplayOptions sessionReplay = sentryOptions5.getSessionReplay();
                kotlin.jvm.internal.m.d(sessionReplay, "options.sessionReplay");
                screenshotRecorderConfigFrom = companion.from(context, sessionReplay);
            }
            io.sentry.android.replay.ScreenshotRecorderConfig screenshotRecorderConfig = screenshotRecorderConfigFrom;
            p194x6.j jVar2 = this.replayCaptureStrategyProvider;
            if (jVar2 == null || (captureStrategy = (io.sentry.android.replay.capture.CaptureStrategy) jVar2.invoke(java.lang.Boolean.valueOf(zSample))) == null) {
                if (zSample) {
                    io.sentry.SentryOptions sentryOptions6 = this.options;
                    if (sentryOptions6 == null) {
                        kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    io.sentry.IScopes iScopes = this.scopes;
                    io.sentry.transport.ICurrentDateProvider iCurrentDateProvider = this.dateProvider;
                    java.util.concurrent.ScheduledExecutorService replayExecutor = getReplayExecutor();
                    kotlin.jvm.internal.m.d(replayExecutor, "replayExecutor");
                    bufferCaptureStrategy = new io.sentry.android.replay.capture.SessionCaptureStrategy(sentryOptions6, iScopes, iCurrentDateProvider, replayExecutor, this.replayCacheProvider);
                } else {
                    io.sentry.SentryOptions sentryOptions7 = this.options;
                    if (sentryOptions7 == null) {
                        kotlin.jvm.internal.m.k(io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    io.sentry.IScopes iScopes2 = this.scopes;
                    io.sentry.transport.ICurrentDateProvider iCurrentDateProvider2 = this.dateProvider;
                    io.sentry.util.Random random2 = getRandom();
                    java.util.concurrent.ScheduledExecutorService replayExecutor2 = getReplayExecutor();
                    kotlin.jvm.internal.m.d(replayExecutor2, "replayExecutor");
                    bufferCaptureStrategy = new io.sentry.android.replay.capture.BufferCaptureStrategy(sentryOptions7, iScopes2, iCurrentDateProvider2, random2, replayExecutor2, this.replayCacheProvider);
                }
                captureStrategy = bufferCaptureStrategy;
            }
            io.sentry.android.replay.capture.CaptureStrategy captureStrategy2 = captureStrategy;
            this.captureStrategy = captureStrategy2;
            io.sentry.android.replay.capture.CaptureStrategy.DefaultImpls.start$default(captureStrategy2, screenshotRecorderConfig, 0, null, null, 14, null);
            io.sentry.android.replay.Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.start(screenshotRecorderConfig);
            }
            registerRootViewListeners();
            this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
            com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.ReplayController
    public void stop() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                io.sentry.android.replay.ReplayLifecycle replayLifecycle = this.lifecycle;
                io.sentry.android.replay.ReplayState replayState = io.sentry.android.replay.ReplayState.STOPPED;
                if (replayLifecycle.isAllowed(replayState)) {
                    unregisterRootViewListeners();
                    io.sentry.android.replay.Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.stop();
                    }
                    io.sentry.android.replay.gestures.GestureRecorder gestureRecorder = this.gestureRecorder;
                    if (gestureRecorder != null) {
                        gestureRecorder.stop();
                    }
                    io.sentry.android.replay.capture.CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(java.io.File screenshot, long frameTimestamp) {
        kotlin.jvm.internal.m.e(screenshot, "screenshot");
        io.sentry.android.replay.capture.CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            io.sentry.android.replay.capture.CaptureStrategy.DefaultImpls.onScreenshotRecorded$default(captureStrategy, null, new io.sentry.android.replay.ReplayIntegration.AnonymousClass3(screenshot, frameTimestamp, this), 1, null);
        }
    }

    public /* synthetic */ ReplayIntegration(android.content.Context context, io.sentry.transport.ICurrentDateProvider iCurrentDateProvider, kotlin.jvm.functions.Function0 function0, p194x6.j jVar, p194x6.j jVar2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(context, iCurrentDateProvider, (i3 & 4) != 0 ? null : function0, (i3 & 8) != 0 ? null : jVar, (i3 & 16) != 0 ? null : jVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(android.content.Context context, io.sentry.transport.ICurrentDateProvider dateProvider) {
        this(io.sentry.android.replay.util.ContextKt.appContext(context), dateProvider, null, null, null);
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
    }

    public /* synthetic */ ReplayIntegration(android.content.Context context, io.sentry.transport.ICurrentDateProvider iCurrentDateProvider, kotlin.jvm.functions.Function0 function0, p194x6.j jVar, p194x6.j jVar2, p194x6.j jVar3, io.sentry.android.replay.util.MainLooperHandler mainLooperHandler, kotlin.jvm.functions.Function0 function1, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(context, iCurrentDateProvider, function0, jVar, jVar2, (i3 & 32) != 0 ? null : jVar3, (i3 & 64) != 0 ? null : mainLooperHandler, (i3 & 128) != 0 ? null : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(android.content.Context context, io.sentry.transport.ICurrentDateProvider dateProvider, kotlin.jvm.functions.Function0 function0, p194x6.j jVar, p194x6.j jVar2, p194x6.j jVar3, io.sentry.android.replay.util.MainLooperHandler mainLooperHandler, kotlin.jvm.functions.Function0 function1) {
        this(io.sentry.android.replay.util.ContextKt.appContext(context), dateProvider, function0, jVar, jVar2);
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        this.replayCaptureStrategyProvider = jVar3;
        this.mainLooperHandler = mainLooperHandler == null ? new io.sentry.android.replay.util.MainLooperHandler(null, 1, null) : mainLooperHandler;
        this.gestureRecorderProvider = function1;
    }
}
