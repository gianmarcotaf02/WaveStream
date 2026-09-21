package io.sentry.android.replay.capture;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u0089\u00012\u00020\u0001:\u0004\u0089\u0001\u008a\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0097\u0001\u00100\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0004¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00172\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107Jb\u0010?\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0006\u0012\u0004\u0018\u00018\u00000=\"\u0004\b\u0000\u001082\n\b\u0002\u00109\u001a\u0004\u0018\u00018\u00002\u0006\u0010:\u001a\u00020'2&\b\u0006\u0010<\u001a \u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00170;H\u0082\b¢\u0006\u0004\b?\u0010@J`\u0010A\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u001082\n\b\u0002\u00109\u001a\u0004\u0018\u00018\u00002\u0006\u0010:\u001a\u00020'2&\b\u0006\u0010<\u001a \u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00170;H\u0082\b¢\u0006\u0004\bA\u0010@JL\u0010A\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u001082&\b\u0004\u0010<\u001a \u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00170;H\u0082\b¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bG\u0010HR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR\u001b\u0010M\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010HR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020Q8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010TR$\u0010$\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00108D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u00103R/\u0010e\u001a\u0004\u0018\u00010 2\b\u0010Z\u001a\u0004\u0018\u00010 8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010\\\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010g\u001a\u00020f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR/\u0010(\u001a\u0004\u0018\u00010'2\b\u0010Z\u001a\u0004\u0018\u00010'8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010\\\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR+\u0010u\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010\\\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR+\u0010{\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010\\\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR,\u0010\u0016\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00158V@VX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b|\u0010\\\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R%\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020-0,8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008b\u0001"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "Lio/sentry/android/replay/capture/CaptureStrategy;", "Lio/sentry/SentryOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/IScopes;", "scopes", "Lio/sentry/transport/ICurrentDateProvider;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "Lkotlin/Function1;", "Lio/sentry/protocol/SentryId;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/IScopes;Lio/sentry/transport/ICurrentDateProvider;Ljava/util/concurrent/ScheduledExecutorService;Lx6/j;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "", io.sentry.rrweb.RRWebVideoEvent.JsonKeys.SEGMENT_ID, "replayId", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", "Lh6/A;", androidx.media3.extractor.text.ttml.TtmlNode.START, "(Lio/sentry/android/replay/ScreenshotRecorderConfig;ILio/sentry/protocol/SentryId;Lio/sentry/SentryReplayEvent$ReplayType;)V", "resume", "()V", "pause", "stop", "", "duration", "Ljava/util/Date;", "currentSegmentTimestamp", "height", "width", "cache", io.sentry.rrweb.RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "", "screenAtStart", "", "Lio/sentry/Breadcrumb;", io.sentry.SentryBaseEvent.JsonKeys.BREADCRUMBS, "Ljava/util/Deque;", "Lio/sentry/rrweb/RRWebEvent;", "events", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "createSegmentInternal", "(JLjava/util/Date;Lio/sentry/protocol/SentryId;IIILio/sentry/SentryReplayEvent$ReplayType;Lio/sentry/android/replay/ReplayCache;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "T", "initialValue", "propertyName", "Lkotlin/Function3;", "onChange", "LA6/c;", "", "persistableAtomicNullable", "(Ljava/lang/Object;Ljava/lang/String;Lx6/n;)LA6/c;", "persistableAtomic", "(Lx6/n;)LA6/c;", "Lio/sentry/SentryOptions;", "Lio/sentry/IScopes;", "Lio/sentry/transport/ICurrentDateProvider;", "Ljava/util/concurrent/ScheduledExecutorService;", "getReplayExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "Lx6/j;", "persistingExecutor$delegate", "Lh6/h;", "getPersistingExecutor", "persistingExecutor", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "gestureConverter", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminating", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/android/replay/ReplayCache;", "getCache", "()Lio/sentry/android/replay/ReplayCache;", "setCache", "(Lio/sentry/android/replay/ReplayCache;)V", "<set-?>", "recorderConfig$delegate", "LA6/c;", "getRecorderConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "setRecorderConfig", "segmentTimestamp$delegate", "getSegmentTimestamp", "()Ljava/util/Date;", "setSegmentTimestamp", "(Ljava/util/Date;)V", "segmentTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "replayStartTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "getReplayStartTimestamp", "()Ljava/util/concurrent/atomic/AtomicLong;", "screenAtStart$delegate", "getScreenAtStart", "()Ljava/lang/String;", "setScreenAtStart", "(Ljava/lang/String;)V", "currentReplayId$delegate", "getCurrentReplayId", "()Lio/sentry/protocol/SentryId;", "setCurrentReplayId", "(Lio/sentry/protocol/SentryId;)V", "currentReplayId", "currentSegment$delegate", "getCurrentSegment", "()I", "setCurrentSegment", "(I)V", "currentSegment", "replayType$delegate", "getReplayType", "()Lio/sentry/SentryReplayEvent$ReplayType;", "setReplayType", "(Lio/sentry/SentryReplayEvent$ReplayType;)V", "currentEvents", "Ljava/util/Deque;", "getCurrentEvents", "()Ljava/util/Deque;", "Ljava/io/File;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "Companion", "ReplayPersistingExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class BaseCaptureStrategy implements io.sentry.android.replay.capture.CaptureStrategy {
    static final /* synthetic */ E6.u[] $$delegatedProperties;
    public static final int $stable;
    private static final java.lang.String TAG = "CaptureStrategy";
    private io.sentry.android.replay.ReplayCache cache;
    private final java.util.Deque<io.sentry.rrweb.RRWebEvent> currentEvents;

    /* JADX INFO: renamed from: currentReplayId$delegate, reason: from kotlin metadata */
    private final A6.c currentReplayId;

    /* JADX INFO: renamed from: currentSegment$delegate, reason: from kotlin metadata */
    private final A6.c currentSegment;
    private final io.sentry.transport.ICurrentDateProvider dateProvider;
    private final io.sentry.android.replay.gestures.ReplayGestureConverter gestureConverter;
    private final java.util.concurrent.atomic.AtomicBoolean isTerminating;
    private final io.sentry.SentryOptions options;

    /* JADX INFO: renamed from: persistingExecutor$delegate, reason: from kotlin metadata */
    private final p070h6.h persistingExecutor;

    /* JADX INFO: renamed from: recorderConfig$delegate, reason: from kotlin metadata */
    private final A6.c recorderConfig;
    private final p194x6.j replayCacheProvider;
    private final java.util.concurrent.ScheduledExecutorService replayExecutor;
    private final java.util.concurrent.atomic.AtomicLong replayStartTimestamp;

    /* JADX INFO: renamed from: replayType$delegate, reason: from kotlin metadata */
    private final A6.c replayType;
    private final io.sentry.IScopes scopes;

    /* JADX INFO: renamed from: screenAtStart$delegate, reason: from kotlin metadata */
    private final A6.c screenAtStart;

    /* JADX INFO: renamed from: segmentTimestamp$delegate, reason: from kotlin metadata */
    private final A6.c segmentTimestamp;

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy$ReplayPersistingExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ReplayPersistingExecutorServiceThreadFactory implements java.util.concurrent.ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r9) {
            kotlin.jvm.internal.m.e(r9, "r");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SentryReplayPersister-");
            int i3 = this.cnt;
            this.cnt = i3 + 1;
            sb.append(i3);
            java.lang.Thread thread = new java.lang.Thread(r9, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomic$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "newValue", "Lh6/A;", "invoke", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.n {
        final /* synthetic */ java.lang.String $propertyName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(java.lang.String str) {
            super(3);
            this.$propertyName = str;
        }

        @Override // p194x6.n
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            invoke((java.lang.String) obj, obj2, obj3);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
            io.sentry.android.replay.ReplayCache cache = io.sentry.android.replay.capture.BaseCaptureStrategy.this.getCache();
            if (cache != null) {
                cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName, java.lang.String.valueOf(obj2));
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "newValue", "Lh6/A;", "invoke", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class C24891 extends kotlin.jvm.internal.o implements p194x6.n {
        final /* synthetic */ java.lang.String $propertyName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24891(java.lang.String str) {
            super(3);
            this.$propertyName = str;
        }

        @Override // p194x6.n
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            invoke((java.lang.String) obj, obj2, obj3);
            return p070h6.A.f22523a;
        }

        public final void invoke(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
            io.sentry.android.replay.ReplayCache cache = io.sentry.android.replay.capture.BaseCaptureStrategy.this.getCache();
            if (cache != null) {
                cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName, java.lang.String.valueOf(obj2));
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2", "LA6/c;", "", "Lkotlin/Function0;", "Lh6/A;", "task", "runInBackground", "(Lkotlin/jvm/functions/Function0;)V", "thisRef", "LE6/u;", "property", "getValue", "(Ljava/lang/Object;LE6/u;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;LE6/u;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass2 implements A6.c {
        final /* synthetic */ p194x6.n $onChange;
        final /* synthetic */ java.lang.String $propertyName;
        final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;
        private final java.util.concurrent.atomic.AtomicReference<T> value;

        public AnonymousClass2(T t9, io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy, p194x6.n nVar, java.lang.String str) {
            this.this$0 = baseCaptureStrategy;
            this.$onChange = nVar;
            this.$propertyName = str;
            this.value = new java.util.concurrent.atomic.AtomicReference<>(t9);
        }

        private final void runInBackground(final kotlin.jvm.functions.Function0 task) {
            if (this.this$0.options.getThreadChecker().isMainThread()) {
                io.sentry.android.replay.util.ExecutorsKt.submitSafely(this.this$0.getPersistingExecutor(), this.this$0.options, "CaptureStrategy.runInBackground", new java.lang.Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        task.invoke();
                    }
                });
                return;
            }
            try {
                task.invoke();
            } catch (java.lang.Throwable th) {
                this.this$0.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
        @Override // A6.b
        public T getValue(java.lang.Object thisRef, E6.u property) {
            kotlin.jvm.internal.m.e(property, "property");
            return this.value.get();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // A6.c
        public void setValue(java.lang.Object thisRef, E6.u property, T value) {
            kotlin.jvm.internal.m.e(property, "property");
            java.lang.Object andSet = this.value.getAndSet(value);
            if (kotlin.jvm.internal.m.a(andSet, value)) {
                return;
            }
            runInBackground(new io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(this.$onChange, this.$propertyName, andSet, value));
        }
    }

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(io.sentry.android.replay.capture.BaseCaptureStrategy.class, "recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0);
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        $$delegatedProperties = new E6.u[]{c9.f(rVar), B2.a.d(io.sentry.android.replay.capture.BaseCaptureStrategy.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0, c9), B2.a.d(io.sentry.android.replay.capture.BaseCaptureStrategy.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0, c9), B2.a.d(io.sentry.android.replay.capture.BaseCaptureStrategy.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0, c9), B2.a.d(io.sentry.android.replay.capture.BaseCaptureStrategy.class, "currentSegment", "getCurrentSegment()I", 0, c9), B2.a.d(io.sentry.android.replay.capture.BaseCaptureStrategy.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0, c9)};
        INSTANCE = new io.sentry.android.replay.capture.BaseCaptureStrategy.Companion(null);
        $stable = 8;
    }

    public BaseCaptureStrategy(io.sentry.SentryOptions options, io.sentry.IScopes iScopes, io.sentry.transport.ICurrentDateProvider dateProvider, java.util.concurrent.ScheduledExecutorService replayExecutor, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.m.e(dateProvider, "dateProvider");
        kotlin.jvm.internal.m.e(replayExecutor, "replayExecutor");
        this.options = options;
        this.scopes = iScopes;
        this.dateProvider = dateProvider;
        this.replayExecutor = replayExecutor;
        this.replayCacheProvider = jVar;
        this.persistingExecutor = com.google.common.util.concurrent.D.B(io.sentry.android.replay.capture.BaseCaptureStrategy$persistingExecutor$2.INSTANCE);
        this.gestureConverter = new io.sentry.android.replay.gestures.ReplayGestureConverter(dateProvider);
        this.isTerminating = new java.util.concurrent.atomic.AtomicBoolean(false);
        final java.lang.String str = "";
        final java.lang.Object obj = null;
        this.recorderConfig = new A6.c(obj, this, str, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1
            final /* synthetic */ java.lang.String $propertyName;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0$inline_fun;
            private final java.util.concurrent.atomic.AtomicReference<io.sentry.android.replay.ScreenshotRecorderConfig> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1$2, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ java.lang.Object $oldValue;
                final /* synthetic */ java.lang.String $propertyName;
                final /* synthetic */ java.lang.Object $value;
                final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m512invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m512invoke() {
                    java.lang.Object obj = this.$oldValue;
                    io.sentry.android.replay.ScreenshotRecorderConfig screenshotRecorderConfig = (io.sentry.android.replay.ScreenshotRecorderConfig) this.$value;
                    if (screenshotRecorderConfig == null) {
                        return;
                    }
                    io.sentry.android.replay.ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_HEIGHT, java.lang.String.valueOf(screenshotRecorderConfig.getRecordingHeight()));
                    }
                    io.sentry.android.replay.ReplayCache cache2 = this.this$0.getCache();
                    if (cache2 != null) {
                        cache2.persistSegmentValues$sentry_android_replay_release(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_WIDTH, java.lang.String.valueOf(screenshotRecorderConfig.getRecordingWidth()));
                    }
                    io.sentry.android.replay.ReplayCache cache3 = this.this$0.getCache();
                    if (cache3 != null) {
                        cache3.persistSegmentValues$sentry_android_replay_release(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_FRAME_RATE, java.lang.String.valueOf(screenshotRecorderConfig.getFrameRate()));
                    }
                    io.sentry.android.replay.ReplayCache cache4 = this.this$0.getCache();
                    if (cache4 != null) {
                        cache4.persistSegmentValues$sentry_android_replay_release(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_BIT_RATE, java.lang.String.valueOf(screenshotRecorderConfig.getBitRate()));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str;
                this.this$0 = this;
                this.value = new java.util.concurrent.atomic.AtomicReference<>(obj);
            }

            private final void runInBackground(final kotlin.jvm.functions.Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    io.sentry.android.replay.util.ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new java.lang.Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (java.lang.Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // A6.b
            public io.sentry.android.replay.ScreenshotRecorderConfig getValue(java.lang.Object thisRef, E6.u property) {
                kotlin.jvm.internal.m.e(property, "property");
                return this.value.get();
            }

            @Override // A6.c
            public void setValue(java.lang.Object thisRef, E6.u property, io.sentry.android.replay.ScreenshotRecorderConfig value) {
                kotlin.jvm.internal.m.e(property, "property");
                io.sentry.android.replay.ScreenshotRecorderConfig andSet = this.value.getAndSet(value);
                if (kotlin.jvm.internal.m.a(andSet, value)) {
                    return;
                }
                runInBackground(new io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$1.AnonymousClass2(this.$propertyName, andSet, value, this.this$0));
            }
        };
        final java.lang.String str2 = io.sentry.android.replay.ReplayCache.SEGMENT_KEY_TIMESTAMP;
        this.segmentTimestamp = new A6.c(obj, this, str2, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1
            final /* synthetic */ java.lang.String $propertyName;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0$inline_fun;
            private final java.util.concurrent.atomic.AtomicReference<java.util.Date> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ java.lang.Object $oldValue;
                final /* synthetic */ java.lang.String $propertyName;
                final /* synthetic */ java.lang.Object $value;
                final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m516invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m516invoke() {
                    java.lang.Object obj = this.$oldValue;
                    java.util.Date date = (java.util.Date) this.$value;
                    io.sentry.android.replay.ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(io.sentry.android.replay.ReplayCache.SEGMENT_KEY_TIMESTAMP, date == null ? null : io.sentry.DateUtils.getTimestamp(date));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str2;
                this.this$0 = this;
                this.value = new java.util.concurrent.atomic.AtomicReference<>(obj);
            }

            private final void runInBackground(final kotlin.jvm.functions.Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    io.sentry.android.replay.util.ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new java.lang.Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (java.lang.Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // A6.b
            public java.util.Date getValue(java.lang.Object thisRef, E6.u property) {
                kotlin.jvm.internal.m.e(property, "property");
                return this.value.get();
            }

            @Override // A6.c
            public void setValue(java.lang.Object thisRef, E6.u property, java.util.Date value) {
                kotlin.jvm.internal.m.e(property, "property");
                java.util.Date andSet = this.value.getAndSet(value);
                if (kotlin.jvm.internal.m.a(andSet, value)) {
                    return;
                }
                runInBackground(new io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.AnonymousClass2(this.$propertyName, andSet, value, this.this$0));
            }
        };
        this.replayStartTimestamp = new java.util.concurrent.atomic.AtomicLong();
        final java.lang.Object obj2 = null;
        final java.lang.String str3 = io.sentry.android.replay.ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START;
        this.screenAtStart = new A6.c(obj2, this, str3, this, str3) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2
            final /* synthetic */ java.lang.String $propertyName;
            final /* synthetic */ java.lang.String $propertyName$inlined;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0$inline_fun;
            private final java.util.concurrent.atomic.AtomicReference<java.lang.String> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ java.lang.Object $oldValue;
                final /* synthetic */ java.lang.String $propertyName;
                final /* synthetic */ java.lang.String $propertyName$inlined;
                final /* synthetic */ java.lang.Object $value;
                final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy, java.lang.String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m517invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m517invoke() {
                    java.lang.Object obj = this.$value;
                    io.sentry.android.replay.ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, java.lang.String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str3;
                this.this$0 = this;
                this.$propertyName$inlined = str3;
                this.value = new java.util.concurrent.atomic.AtomicReference<>(obj2);
            }

            private final void runInBackground(final kotlin.jvm.functions.Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    io.sentry.android.replay.util.ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new java.lang.Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (java.lang.Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // A6.b
            public java.lang.String getValue(java.lang.Object thisRef, E6.u property) {
                kotlin.jvm.internal.m.e(property, "property");
                return this.value.get();
            }

            @Override // A6.c
            public void setValue(java.lang.Object thisRef, E6.u property, java.lang.String value) {
                kotlin.jvm.internal.m.e(property, "property");
                java.lang.String andSet = this.value.getAndSet(value);
                if (kotlin.jvm.internal.m.a(andSet, value)) {
                    return;
                }
                runInBackground(new io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        final io.sentry.protocol.SentryId sentryId = io.sentry.protocol.SentryId.EMPTY_ID;
        final java.lang.String str4 = io.sentry.android.replay.ReplayCache.SEGMENT_KEY_REPLAY_ID;
        this.currentReplayId = new A6.c(sentryId, this, str4, this, str4) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1
            final /* synthetic */ java.lang.String $propertyName;
            final /* synthetic */ java.lang.String $propertyName$inlined;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0$inline_fun;
            private final java.util.concurrent.atomic.AtomicReference<io.sentry.protocol.SentryId> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ java.lang.Object $oldValue;
                final /* synthetic */ java.lang.String $propertyName;
                final /* synthetic */ java.lang.String $propertyName$inlined;
                final /* synthetic */ java.lang.Object $value;
                final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy, java.lang.String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m513invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m513invoke() {
                    java.lang.Object obj = this.$value;
                    io.sentry.android.replay.ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, java.lang.String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str4;
                this.this$0 = this;
                this.$propertyName$inlined = str4;
                this.value = new java.util.concurrent.atomic.AtomicReference<>(sentryId);
            }

            private final void runInBackground(final kotlin.jvm.functions.Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    io.sentry.android.replay.util.ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new java.lang.Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (java.lang.Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // A6.b
            public io.sentry.protocol.SentryId getValue(java.lang.Object thisRef, E6.u property) {
                kotlin.jvm.internal.m.e(property, "property");
                return this.value.get();
            }

            @Override // A6.c
            public void setValue(java.lang.Object thisRef, E6.u property, io.sentry.protocol.SentryId value) {
                kotlin.jvm.internal.m.e(property, "property");
                io.sentry.protocol.SentryId andSet = this.value.getAndSet(value);
                if (kotlin.jvm.internal.m.a(andSet, value)) {
                    return;
                }
                runInBackground(new io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        final int i3 = -1;
        final java.lang.String str5 = io.sentry.android.replay.ReplayCache.SEGMENT_KEY_ID;
        this.currentSegment = new A6.c(i3, this, str5, this, str5) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2
            final /* synthetic */ java.lang.String $propertyName;
            final /* synthetic */ java.lang.String $propertyName$inlined;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0$inline_fun;
            private final java.util.concurrent.atomic.AtomicReference<java.lang.Integer> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ java.lang.Object $oldValue;
                final /* synthetic */ java.lang.String $propertyName;
                final /* synthetic */ java.lang.String $propertyName$inlined;
                final /* synthetic */ java.lang.Object $value;
                final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy, java.lang.String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m514invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m514invoke() {
                    java.lang.Object obj = this.$value;
                    io.sentry.android.replay.ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, java.lang.String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str5;
                this.this$0 = this;
                this.$propertyName$inlined = str5;
                this.value = new java.util.concurrent.atomic.AtomicReference<>(i3);
            }

            private final void runInBackground(final kotlin.jvm.functions.Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    io.sentry.android.replay.util.ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new java.lang.Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (java.lang.Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // A6.b
            public java.lang.Integer getValue(java.lang.Object thisRef, E6.u property) {
                kotlin.jvm.internal.m.e(property, "property");
                return this.value.get();
            }

            @Override // A6.c
            public void setValue(java.lang.Object thisRef, E6.u property, java.lang.Integer value) {
                kotlin.jvm.internal.m.e(property, "property");
                java.lang.Integer andSet = this.value.getAndSet(value);
                if (kotlin.jvm.internal.m.a(andSet, value)) {
                    return;
                }
                runInBackground(new io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        final java.lang.Object obj3 = null;
        final java.lang.String str6 = io.sentry.android.replay.ReplayCache.SEGMENT_KEY_REPLAY_TYPE;
        this.replayType = new A6.c(obj3, this, str6, this, str6) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3
            final /* synthetic */ java.lang.String $propertyName;
            final /* synthetic */ java.lang.String $propertyName$inlined;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;
            final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0$inline_fun;
            private final java.util.concurrent.atomic.AtomicReference<io.sentry.SentryReplayEvent.ReplayType> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2, reason: invalid class name */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                final /* synthetic */ java.lang.Object $oldValue;
                final /* synthetic */ java.lang.String $propertyName;
                final /* synthetic */ java.lang.String $propertyName$inlined;
                final /* synthetic */ java.lang.Object $value;
                final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy, java.lang.String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ java.lang.Object invoke() {
                    m515invoke();
                    return p070h6.A.f22523a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m515invoke() {
                    java.lang.Object obj = this.$value;
                    io.sentry.android.replay.ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, java.lang.String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str6;
                this.this$0 = this;
                this.$propertyName$inlined = str6;
                this.value = new java.util.concurrent.atomic.AtomicReference<>(obj3);
            }

            private final void runInBackground(final kotlin.jvm.functions.Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    io.sentry.android.replay.util.ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new java.lang.Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (java.lang.Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // A6.b
            public io.sentry.SentryReplayEvent.ReplayType getValue(java.lang.Object thisRef, E6.u property) {
                kotlin.jvm.internal.m.e(property, "property");
                return this.value.get();
            }

            @Override // A6.c
            public void setValue(java.lang.Object thisRef, E6.u property, io.sentry.SentryReplayEvent.ReplayType value) {
                kotlin.jvm.internal.m.e(property, "property");
                io.sentry.SentryReplayEvent.ReplayType andSet = this.value.getAndSet(value);
                if (kotlin.jvm.internal.m.a(andSet, value)) {
                    return;
                }
                runInBackground(new io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        this.currentEvents = new java.util.concurrent.ConcurrentLinkedDeque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ io.sentry.android.replay.capture.CaptureStrategy.ReplaySegment createSegmentInternal$default(io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy, long j, java.util.Date date, io.sentry.protocol.SentryId sentryId, int i3, int i9, int i10, io.sentry.SentryReplayEvent.ReplayType replayType, io.sentry.android.replay.ReplayCache replayCache, int i11, int i12, java.lang.String str, java.util.List list, java.util.Deque deque, int i13, java.lang.Object obj) {
        if (obj == null) {
            return baseCaptureStrategy.createSegmentInternal(j, date, sentryId, i3, i9, i10, (i13 & 64) != 0 ? baseCaptureStrategy.getReplayType() : replayType, (i13 & 128) != 0 ? baseCaptureStrategy.cache : replayCache, (i13 & 256) != 0 ? baseCaptureStrategy.getRecorderConfig().getFrameRate() : i11, (i13 & 512) != 0 ? baseCaptureStrategy.getRecorderConfig().getBitRate() : i12, (i13 & 1024) != 0 ? baseCaptureStrategy.getScreenAtStart() : str, (i13 & 2048) != 0 ? null : list, (i13 & 4096) != 0 ? baseCaptureStrategy.currentEvents : deque);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.concurrent.ScheduledExecutorService getPersistingExecutor() {
        java.lang.Object value = this.persistingExecutor.getValue();
        kotlin.jvm.internal.m.d(value, "<get-persistingExecutor>(...)");
        return (java.util.concurrent.ScheduledExecutorService) value;
    }

    private final <T> A6.c persistableAtomic(T initialValue, java.lang.String propertyName, p194x6.n onChange) {
        return new io.sentry.android.replay.capture.BaseCaptureStrategy.AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static /* synthetic */ A6.c persistableAtomic$default(io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy, java.lang.Object obj, java.lang.String str, p194x6.n nVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomic");
        }
        if ((i3 & 1) != 0) {
            obj = null;
        }
        if ((i3 & 4) != 0) {
            nVar = baseCaptureStrategy.new AnonymousClass1(str);
        }
        return new io.sentry.android.replay.capture.BaseCaptureStrategy.AnonymousClass2(obj, baseCaptureStrategy, nVar, str);
    }

    private final <T> A6.c persistableAtomicNullable(T initialValue, java.lang.String propertyName, p194x6.n onChange) {
        return new io.sentry.android.replay.capture.BaseCaptureStrategy.AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static /* synthetic */ A6.c persistableAtomicNullable$default(io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy, java.lang.Object obj, java.lang.String str, p194x6.n nVar, int i3, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomicNullable");
        }
        if ((i3 & 1) != 0) {
            obj = null;
        }
        if ((i3 & 4) != 0) {
            nVar = baseCaptureStrategy.new C24891(str);
        }
        return new io.sentry.android.replay.capture.BaseCaptureStrategy.AnonymousClass2(obj, baseCaptureStrategy, nVar, str);
    }

    public final io.sentry.android.replay.capture.CaptureStrategy.ReplaySegment createSegmentInternal(long duration, java.util.Date currentSegmentTimestamp, io.sentry.protocol.SentryId replayId, int segmentId, int height, int width, io.sentry.SentryReplayEvent.ReplayType replayType, io.sentry.android.replay.ReplayCache cache, int frameRate, int bitRate, java.lang.String screenAtStart, java.util.List<io.sentry.Breadcrumb> breadcrumbs, java.util.Deque<io.sentry.rrweb.RRWebEvent> events) {
        kotlin.jvm.internal.m.e(currentSegmentTimestamp, "currentSegmentTimestamp");
        kotlin.jvm.internal.m.e(replayId, "replayId");
        kotlin.jvm.internal.m.e(replayType, "replayType");
        kotlin.jvm.internal.m.e(events, "events");
        return io.sentry.android.replay.capture.CaptureStrategy.INSTANCE.createSegment(this.scopes, this.options, duration, currentSegmentTimestamp, replayId, segmentId, height, width, replayType, cache, frameRate, bitRate, screenAtStart, breadcrumbs, events);
    }

    public final io.sentry.android.replay.ReplayCache getCache() {
        return this.cache;
    }

    public final java.util.Deque<io.sentry.rrweb.RRWebEvent> getCurrentEvents() {
        return this.currentEvents;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public io.sentry.protocol.SentryId getCurrentReplayId() {
        return (io.sentry.protocol.SentryId) this.currentReplayId.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public int getCurrentSegment() {
        return ((java.lang.Number) this.currentSegment.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final io.sentry.android.replay.ScreenshotRecorderConfig getRecorderConfig() {
        return (io.sentry.android.replay.ScreenshotRecorderConfig) this.recorderConfig.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public java.io.File getReplayCacheDir() {
        io.sentry.android.replay.ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            return replayCache.getReplayCacheDir$sentry_android_replay_release();
        }
        return null;
    }

    public final java.util.concurrent.ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    public final java.util.concurrent.atomic.AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public io.sentry.SentryReplayEvent.ReplayType getReplayType() {
        return (io.sentry.SentryReplayEvent.ReplayType) this.replayType.getValue(this, $$delegatedProperties[5]);
    }

    public final java.lang.String getScreenAtStart() {
        return (java.lang.String) this.screenAtStart.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public java.util.Date getSegmentTimestamp() {
        return (java.util.Date) this.segmentTimestamp.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: renamed from: isTerminating, reason: from getter */
    public final java.util.concurrent.atomic.AtomicBoolean getIsTerminating() {
        return this.isTerminating;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(io.sentry.android.replay.ScreenshotRecorderConfig recorderConfig) {
        kotlin.jvm.internal.m.e(recorderConfig, "recorderConfig");
        setRecorderConfig(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenChanged(java.lang.String str) {
        io.sentry.android.replay.capture.CaptureStrategy.DefaultImpls.onScreenChanged(this, str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.m.e(event, "event");
        java.util.List<io.sentry.rrweb.RRWebIncrementalSnapshotEvent> listConvert = this.gestureConverter.convert(event, getRecorderConfig());
        if (listConvert != null) {
            p078i6.u.M0(this.currentEvents, listConvert);
        }
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void resume() {
        setSegmentTimestamp(io.sentry.DateUtils.getCurrentDateTime());
    }

    public final void setCache(io.sentry.android.replay.ReplayCache replayCache) {
        this.cache = replayCache;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentReplayId(io.sentry.protocol.SentryId sentryId) {
        kotlin.jvm.internal.m.e(sentryId, "<set-?>");
        this.currentReplayId.setValue(this, $$delegatedProperties[3], sentryId);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentSegment(int i3) {
        this.currentSegment.setValue(this, $$delegatedProperties[4], java.lang.Integer.valueOf(i3));
    }

    public final void setRecorderConfig(io.sentry.android.replay.ScreenshotRecorderConfig screenshotRecorderConfig) {
        kotlin.jvm.internal.m.e(screenshotRecorderConfig, "<set-?>");
        this.recorderConfig.setValue(this, $$delegatedProperties[0], screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setReplayType(io.sentry.SentryReplayEvent.ReplayType replayType) {
        kotlin.jvm.internal.m.e(replayType, "<set-?>");
        this.replayType.setValue(this, $$delegatedProperties[5], replayType);
    }

    public final void setScreenAtStart(java.lang.String str) {
        this.screenAtStart.setValue(this, $$delegatedProperties[2], str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setSegmentTimestamp(java.util.Date date) {
        this.segmentTimestamp.setValue(this, $$delegatedProperties[1], date);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void start(io.sentry.android.replay.ScreenshotRecorderConfig recorderConfig, int segmentId, io.sentry.protocol.SentryId replayId, io.sentry.SentryReplayEvent.ReplayType replayType) {
        io.sentry.android.replay.ReplayCache replayCache;
        kotlin.jvm.internal.m.e(recorderConfig, "recorderConfig");
        kotlin.jvm.internal.m.e(replayId, "replayId");
        p194x6.j jVar = this.replayCacheProvider;
        if (jVar == null || (replayCache = (io.sentry.android.replay.ReplayCache) jVar.invoke(replayId)) == null) {
            replayCache = new io.sentry.android.replay.ReplayCache(this.options, replayId);
        }
        this.cache = replayCache;
        setCurrentReplayId(replayId);
        setCurrentSegment(segmentId);
        if (replayType == null) {
            replayType = this instanceof io.sentry.android.replay.capture.SessionCaptureStrategy ? io.sentry.SentryReplayEvent.ReplayType.SESSION : io.sentry.SentryReplayEvent.ReplayType.BUFFER;
        }
        setReplayType(replayType);
        setRecorderConfig(recorderConfig);
        setSegmentTimestamp(io.sentry.DateUtils.getCurrentDateTime());
        this.replayStartTimestamp.set(this.dateProvider.getCurrentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        io.sentry.android.replay.ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            replayCache.close();
        }
        setCurrentSegment(-1);
        this.replayStartTimestamp.set(0L);
        setSegmentTimestamp(null);
        io.sentry.protocol.SentryId EMPTY_ID = io.sentry.protocol.SentryId.EMPTY_ID;
        kotlin.jvm.internal.m.d(EMPTY_ID, "EMPTY_ID");
        setCurrentReplayId(EMPTY_ID);
    }

    private final <T> A6.c persistableAtomic(p194x6.n onChange) {
        return new io.sentry.android.replay.capture.BaseCaptureStrategy.AnonymousClass2(null, this, onChange, "");
    }

    public /* synthetic */ BaseCaptureStrategy(io.sentry.SentryOptions sentryOptions, io.sentry.IScopes iScopes, io.sentry.transport.ICurrentDateProvider iCurrentDateProvider, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, p194x6.j jVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, (i3 & 16) != 0 ? null : jVar);
    }
}
