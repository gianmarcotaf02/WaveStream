package io.sentry.android.replay.capture;

import A6.c;
import E6.u;
import android.view.MotionEvent;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.D;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.IScopes;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.gestures.ReplayGestureConverter;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.transport.ICurrentDateProvider;
import java.io.File;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.r;
import p070h6.A;
import p070h6.h;
import p194x6.j;
import p194x6.n;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u0089\u00012\u00020\u0001:\u0004\u0089\u0001\u008a\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0097\u0001\u00100\u001a\u00020/2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0004¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00172\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107Jb\u0010?\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0006\u0012\u0004\u0018\u00018\u00000=\"\u0004\b\u0000\u001082\n\b\u0002\u00109\u001a\u0004\u0018\u00018\u00002\u0006\u0010:\u001a\u00020'2&\b\u0006\u0010<\u001a \u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00170;H\u0082\b¢\u0006\u0004\b?\u0010@J`\u0010A\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u001082\n\b\u0002\u00109\u001a\u0004\u0018\u00018\u00002\u0006\u0010:\u001a\u00020'2&\b\u0006\u0010<\u001a \u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00170;H\u0082\b¢\u0006\u0004\bA\u0010@JL\u0010A\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u001082&\b\u0004\u0010<\u001a \u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00170;H\u0082\b¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bG\u0010HR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR\u001b\u0010M\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010HR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010R\u001a\u00020Q8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010TR$\u0010$\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010Z\u001a\u00020\u00108D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u00103R/\u0010e\u001a\u0004\u0018\u00010 2\b\u0010Z\u001a\u0004\u0018\u00010 8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b`\u0010\\\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u001a\u0010g\u001a\u00020f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR/\u0010(\u001a\u0004\u0018\u00010'2\b\u0010Z\u001a\u0004\u0018\u00010'8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010\\\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR+\u0010u\u001a\u00020\u000b2\u0006\u0010Z\u001a\u00020\u000b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010\\\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR+\u0010{\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bv\u0010\\\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR,\u0010\u0016\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00158V@VX\u0096\u008e\u0002¢\u0006\u0013\n\u0004\b|\u0010\\\u001a\u0004\b}\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R%\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020-0,8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0085\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008b\u0001"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "Lio/sentry/android/replay/capture/CaptureStrategy;", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/IScopes;", "scopes", "Lio/sentry/transport/ICurrentDateProvider;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "Lkotlin/Function1;", "Lio/sentry/protocol/SentryId;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/IScopes;Lio/sentry/transport/ICurrentDateProvider;Ljava/util/concurrent/ScheduledExecutorService;Lx6/j;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "", RRWebVideoEvent.JsonKeys.SEGMENT_ID, "replayId", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", "Lh6/A;", TtmlNode.START, "(Lio/sentry/android/replay/ScreenshotRecorderConfig;ILio/sentry/protocol/SentryId;Lio/sentry/SentryReplayEvent$ReplayType;)V", "resume", "()V", "pause", "stop", "", "duration", "Ljava/util/Date;", "currentSegmentTimestamp", "height", "width", "cache", RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "", "screenAtStart", "", "Lio/sentry/Breadcrumb;", SentryBaseEvent.JsonKeys.BREADCRUMBS, "Ljava/util/Deque;", "Lio/sentry/rrweb/RRWebEvent;", "events", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "createSegmentInternal", "(JLjava/util/Date;Lio/sentry/protocol/SentryId;IIILio/sentry/SentryReplayEvent$ReplayType;Lio/sentry/android/replay/ReplayCache;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "T", "initialValue", "propertyName", "Lkotlin/Function3;", "onChange", "LA6/c;", "", "persistableAtomicNullable", "(Ljava/lang/Object;Ljava/lang/String;Lx6/n;)LA6/c;", "persistableAtomic", "(Lx6/n;)LA6/c;", "Lio/sentry/SentryOptions;", "Lio/sentry/IScopes;", "Lio/sentry/transport/ICurrentDateProvider;", "Ljava/util/concurrent/ScheduledExecutorService;", "getReplayExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "Lx6/j;", "persistingExecutor$delegate", "Lh6/h;", "getPersistingExecutor", "persistingExecutor", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "gestureConverter", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminating", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/android/replay/ReplayCache;", "getCache", "()Lio/sentry/android/replay/ReplayCache;", "setCache", "(Lio/sentry/android/replay/ReplayCache;)V", "<set-?>", "recorderConfig$delegate", "LA6/c;", "getRecorderConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "setRecorderConfig", "segmentTimestamp$delegate", "getSegmentTimestamp", "()Ljava/util/Date;", "setSegmentTimestamp", "(Ljava/util/Date;)V", "segmentTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "replayStartTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "getReplayStartTimestamp", "()Ljava/util/concurrent/atomic/AtomicLong;", "screenAtStart$delegate", "getScreenAtStart", "()Ljava/lang/String;", "setScreenAtStart", "(Ljava/lang/String;)V", "currentReplayId$delegate", "getCurrentReplayId", "()Lio/sentry/protocol/SentryId;", "setCurrentReplayId", "(Lio/sentry/protocol/SentryId;)V", "currentReplayId", "currentSegment$delegate", "getCurrentSegment", "()I", "setCurrentSegment", "(I)V", "currentSegment", "replayType$delegate", "getReplayType", "()Lio/sentry/SentryReplayEvent$ReplayType;", "setReplayType", "(Lio/sentry/SentryReplayEvent$ReplayType;)V", "currentEvents", "Ljava/util/Deque;", "getCurrentEvents", "()Ljava/util/Deque;", "Ljava/io/File;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "Companion", "ReplayPersistingExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class BaseCaptureStrategy implements CaptureStrategy {
    static final u[] $$delegatedProperties;
    public static final int $stable;
    private static final String TAG = "CaptureStrategy";
    private ReplayCache cache;
    private final Deque<RRWebEvent> currentEvents;

    private final c currentReplayId;

    private final c currentSegment;
    private final ICurrentDateProvider dateProvider;
    private final ReplayGestureConverter gestureConverter;
    private final AtomicBoolean isTerminating;
    private final SentryOptions options;

    private final h persistingExecutor;

    private final c recorderConfig;
    private final j replayCacheProvider;
    private final ScheduledExecutorService replayExecutor;
    private final AtomicLong replayStartTimestamp;

    private final c replayType;
    private final IScopes scopes;

    private final c screenAtStart;

    private final c segmentTimestamp;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy$ReplayPersistingExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ReplayPersistingExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override
        public Thread newThread(Runnable r9) {
            m.e(r9, "r");
            StringBuilder sb = new StringBuilder("SentryReplayPersister-");
            int i3 = this.cnt;
            this.cnt = i3 + 1;
            sb.append(i3);
            Thread thread = new Thread(r9, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "newValue", "Lh6/A;", "invoke", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends o implements n {
        final String $propertyName;

        public AnonymousClass1(String str) {
            super(3);
            this.$propertyName = str;
        }

        @Override
        public Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((String) obj, obj2, obj3);
            return A.f22523a;
        }

        public final void invoke(String str, Object obj, Object obj2) {
            ReplayCache cache = BaseCaptureStrategy.this.getCache();
            if (cache != null) {
                cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName, String.valueOf(obj2));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "newValue", "Lh6/A;", "invoke", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class C24891 extends o implements n {
        final String $propertyName;

        public C24891(String str) {
            super(3);
            this.$propertyName = str;
        }

        @Override
        public Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((String) obj, obj2, obj3);
            return A.f22523a;
        }

        public final void invoke(String str, Object obj, Object obj2) {
            ReplayCache cache = BaseCaptureStrategy.this.getCache();
            if (cache != null) {
                cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName, String.valueOf(obj2));
            }
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2", "LA6/c;", "", "Lkotlin/Function0;", "Lh6/A;", "task", "runInBackground", "(Lkotlin/jvm/functions/Function0;)V", "thisRef", "LE6/u;", "property", "getValue", "(Ljava/lang/Object;LE6/u;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;LE6/u;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass2 implements c {
        final n $onChange;
        final String $propertyName;
        final BaseCaptureStrategy this$0;
        private final AtomicReference<T> value;

        public AnonymousClass2(T t9, BaseCaptureStrategy baseCaptureStrategy, n nVar, String str) {
            this.this$0 = baseCaptureStrategy;
            this.$onChange = nVar;
            this.$propertyName = str;
            this.value = new AtomicReference<>(t9);
        }

        private final void runInBackground(final Function0 task) {
            if (this.this$0.options.getThreadChecker().isMainThread()) {
                ExecutorsKt.submitSafely(this.this$0.getPersistingExecutor(), this.this$0.options, "CaptureStrategy.runInBackground", new Runnable() {
                    @Override
                    public final void run() {
                        task.invoke();
                    }
                });
                return;
            }
            try {
                task.invoke();
            } catch (Throwable th) {
                this.this$0.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }

        @Override
        public T getValue(Object thisRef, u property) {
            m.e(property, "property");
            return this.value.get();
        }

        @Override
        public void setValue(Object thisRef, u property, T value) {
            m.e(property, "property");
            Object andSet = this.value.getAndSet(value);
            if (m.a(andSet, value)) {
                return;
            }
            runInBackground(new BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(this.$onChange, this.$propertyName, andSet, value));
        }
    }

    static {
        r rVar = new r(BaseCaptureStrategy.class, "recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0);
        C c9 = B.f24540a;
        $$delegatedProperties = new u[]{c9.f(rVar), B2.a.d(BaseCaptureStrategy.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0, c9), B2.a.d(BaseCaptureStrategy.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0, c9), B2.a.d(BaseCaptureStrategy.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0, c9), B2.a.d(BaseCaptureStrategy.class, "currentSegment", "getCurrentSegment()I", 0, c9), B2.a.d(BaseCaptureStrategy.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0, c9)};
        INSTANCE = new Companion(null);
        $stable = 8;
    }

    public BaseCaptureStrategy(SentryOptions options, IScopes iScopes, ICurrentDateProvider dateProvider, ScheduledExecutorService replayExecutor, j jVar) {
        m.e(options, "options");
        m.e(dateProvider, "dateProvider");
        m.e(replayExecutor, "replayExecutor");
        this.options = options;
        this.scopes = iScopes;
        this.dateProvider = dateProvider;
        this.replayExecutor = replayExecutor;
        this.replayCacheProvider = jVar;
        this.persistingExecutor = D.B(BaseCaptureStrategy$persistingExecutor$2.INSTANCE);
        this.gestureConverter = new ReplayGestureConverter(dateProvider);
        this.isTerminating = new AtomicBoolean(false);
        final String str = "";
        final Object obj = null;
        this.recorderConfig = new c(obj, this, str, this) {
            final String $propertyName;
            final BaseCaptureStrategy this$0;
            final BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<ScreenshotRecorderConfig> value;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends o implements Function0 {
                final Object $oldValue;
                final String $propertyName;
                final Object $value;
                final BaseCaptureStrategy this$0;

                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override
                public Object invoke() {
                    m512invoke();
                    return A.f22523a;
                }

                public final void m512invoke() {
                    Object obj = this.$oldValue;
                    ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) this.$value;
                    if (screenshotRecorderConfig == null) {
                        return;
                    }
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_HEIGHT, String.valueOf(screenshotRecorderConfig.getRecordingHeight()));
                    }
                    ReplayCache cache2 = this.this$0.getCache();
                    if (cache2 != null) {
                        cache2.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_WIDTH, String.valueOf(screenshotRecorderConfig.getRecordingWidth()));
                    }
                    ReplayCache cache3 = this.this$0.getCache();
                    if (cache3 != null) {
                        cache3.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_FRAME_RATE, String.valueOf(screenshotRecorderConfig.getFrameRate()));
                    }
                    ReplayCache cache4 = this.this$0.getCache();
                    if (cache4 != null) {
                        cache4.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_BIT_RATE, String.valueOf(screenshotRecorderConfig.getBitRate()));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() {
                        @Override
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override
            public ScreenshotRecorderConfig getValue(Object thisRef, u property) {
                m.e(property, "property");
                return this.value.get();
            }

            @Override
            public void setValue(Object thisRef, u property, ScreenshotRecorderConfig value) {
                m.e(property, "property");
                ScreenshotRecorderConfig andSet = this.value.getAndSet(value);
                if (m.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0));
            }
        };
        final String str2 = ReplayCache.SEGMENT_KEY_TIMESTAMP;
        this.segmentTimestamp = new c(obj, this, str2, this) {
            final String $propertyName;
            final BaseCaptureStrategy this$0;
            final BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Date> value;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends o implements Function0 {
                final Object $oldValue;
                final String $propertyName;
                final Object $value;
                final BaseCaptureStrategy this$0;

                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override
                public Object invoke() {
                    m516invoke();
                    return A.f22523a;
                }

                public final void m516invoke() {
                    Object obj = this.$oldValue;
                    Date date = (Date) this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_TIMESTAMP, date == null ? null : DateUtils.getTimestamp(date));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str2;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() {
                        @Override
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override
            public Date getValue(Object thisRef, u property) {
                m.e(property, "property");
                return this.value.get();
            }

            @Override
            public void setValue(Object thisRef, u property, Date value) {
                m.e(property, "property");
                Date andSet = this.value.getAndSet(value);
                if (m.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0));
            }
        };
        this.replayStartTimestamp = new AtomicLong();
        final Object obj2 = null;
        final String str3 = ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START;
        this.screenAtStart = new c(obj2, this, str3, this, str3) {
            final String $propertyName;
            final String $propertyName$inlined;
            final BaseCaptureStrategy this$0;
            final BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<String> value;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends o implements Function0 {
                final Object $oldValue;
                final String $propertyName;
                final String $propertyName$inlined;
                final Object $value;
                final BaseCaptureStrategy this$0;

                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override
                public Object invoke() {
                    m517invoke();
                    return A.f22523a;
                }

                public final void m517invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str3;
                this.this$0 = this;
                this.$propertyName$inlined = str3;
                this.value = new AtomicReference<>(obj2);
            }

            private final void runInBackground(final Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() {
                        @Override
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override
            public String getValue(Object thisRef, u property) {
                m.e(property, "property");
                return this.value.get();
            }

            @Override
            public void setValue(Object thisRef, u property, String value) {
                m.e(property, "property");
                String andSet = this.value.getAndSet(value);
                if (m.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        final SentryId sentryId = SentryId.EMPTY_ID;
        final String str4 = ReplayCache.SEGMENT_KEY_REPLAY_ID;
        this.currentReplayId = new c(sentryId, this, str4, this, str4) {
            final String $propertyName;
            final String $propertyName$inlined;
            final BaseCaptureStrategy this$0;
            final BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryId> value;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends o implements Function0 {
                final Object $oldValue;
                final String $propertyName;
                final String $propertyName$inlined;
                final Object $value;
                final BaseCaptureStrategy this$0;

                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override
                public Object invoke() {
                    m513invoke();
                    return A.f22523a;
                }

                public final void m513invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str4;
                this.this$0 = this;
                this.$propertyName$inlined = str4;
                this.value = new AtomicReference<>(sentryId);
            }

            private final void runInBackground(final Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() {
                        @Override
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override
            public SentryId getValue(Object thisRef, u property) {
                m.e(property, "property");
                return this.value.get();
            }

            @Override
            public void setValue(Object thisRef, u property, SentryId value) {
                m.e(property, "property");
                SentryId andSet = this.value.getAndSet(value);
                if (m.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        final int i3 = -1;
        final String str5 = ReplayCache.SEGMENT_KEY_ID;
        this.currentSegment = new c(i3, this, str5, this, str5) {
            final String $propertyName;
            final String $propertyName$inlined;
            final BaseCaptureStrategy this$0;
            final BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Integer> value;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends o implements Function0 {
                final Object $oldValue;
                final String $propertyName;
                final String $propertyName$inlined;
                final Object $value;
                final BaseCaptureStrategy this$0;

                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override
                public Object invoke() {
                    m514invoke();
                    return A.f22523a;
                }

                public final void m514invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str5;
                this.this$0 = this;
                this.$propertyName$inlined = str5;
                this.value = new AtomicReference<>(i3);
            }

            private final void runInBackground(final Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() {
                        @Override
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override
            public Integer getValue(Object thisRef, u property) {
                m.e(property, "property");
                return this.value.get();
            }

            @Override
            public void setValue(Object thisRef, u property, Integer value) {
                m.e(property, "property");
                Integer andSet = this.value.getAndSet(value);
                if (m.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        final Object obj3 = null;
        final String str6 = ReplayCache.SEGMENT_KEY_REPLAY_TYPE;
        this.replayType = new c(obj3, this, str6, this, str6) {
            final String $propertyName;
            final String $propertyName$inlined;
            final BaseCaptureStrategy this$0;
            final BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryReplayEvent.ReplayType> value;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lh6/A;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            public static final class AnonymousClass2 extends o implements Function0 {
                final Object $oldValue;
                final String $propertyName;
                final String $propertyName$inlined;
                final Object $value;
                final BaseCaptureStrategy this$0;

                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override
                public Object invoke() {
                    m515invoke();
                    return A.f22523a;
                }

                public final void m515invoke() {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str6;
                this.this$0 = this;
                this.$propertyName$inlined = str6;
                this.value = new AtomicReference<>(obj3);
            }

            private final void runInBackground(final Function0 task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    ExecutorsKt.submitSafely(this.this$0$inline_fun.getPersistingExecutor(), this.this$0$inline_fun.options, "CaptureStrategy.runInBackground", new Runnable() {
                        @Override
                        public final void run() {
                            task.invoke();
                        }
                    });
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override
            public SentryReplayEvent.ReplayType getValue(Object thisRef, u property) {
                m.e(property, "property");
                return this.value.get();
            }

            @Override
            public void setValue(Object thisRef, u property, SentryReplayEvent.ReplayType value) {
                m.e(property, "property");
                SentryReplayEvent.ReplayType andSet = this.value.getAndSet(value);
                if (m.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        this.currentEvents = new ConcurrentLinkedDeque();
    }

    public static CaptureStrategy.ReplaySegment createSegmentInternal$default(BaseCaptureStrategy baseCaptureStrategy, long j, Date date, SentryId sentryId, int i3, int i9, int i10, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, int i11, int i12, String str, List list, Deque deque, int i13, Object obj) {
        if (obj == null) {
            return baseCaptureStrategy.createSegmentInternal(j, date, sentryId, i3, i9, i10, (i13 & 64) != 0 ? baseCaptureStrategy.getReplayType() : replayType, (i13 & 128) != 0 ? baseCaptureStrategy.cache : replayCache, (i13 & 256) != 0 ? baseCaptureStrategy.getRecorderConfig().getFrameRate() : i11, (i13 & 512) != 0 ? baseCaptureStrategy.getRecorderConfig().getBitRate() : i12, (i13 & 1024) != 0 ? baseCaptureStrategy.getScreenAtStart() : str, (i13 & 2048) != 0 ? null : list, (i13 & 4096) != 0 ? baseCaptureStrategy.currentEvents : deque);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
    }

    public final ScheduledExecutorService getPersistingExecutor() {
        Object value = this.persistingExecutor.getValue();
        m.d(value, "<get-persistingExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    private final <T> c persistableAtomic(T initialValue, String propertyName, n onChange) {
        return new AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static c persistableAtomic$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, String str, n nVar, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomic");
        }
        if ((i3 & 1) != 0) {
            obj = null;
        }
        if ((i3 & 4) != 0) {
            nVar = baseCaptureStrategy.new AnonymousClass1(str);
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, nVar, str);
    }

    private final <T> c persistableAtomicNullable(T initialValue, String propertyName, n onChange) {
        return new AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static c persistableAtomicNullable$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, String str, n nVar, int i3, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomicNullable");
        }
        if ((i3 & 1) != 0) {
            obj = null;
        }
        if ((i3 & 4) != 0) {
            nVar = baseCaptureStrategy.new C24891(str);
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, nVar, str);
    }

    public final CaptureStrategy.ReplaySegment createSegmentInternal(long duration, Date currentSegmentTimestamp, SentryId replayId, int segmentId, int height, int width, SentryReplayEvent.ReplayType replayType, ReplayCache cache, int frameRate, int bitRate, String screenAtStart, List<Breadcrumb> breadcrumbs, Deque<RRWebEvent> events) {
        m.e(currentSegmentTimestamp, "currentSegmentTimestamp");
        m.e(replayId, "replayId");
        m.e(replayType, "replayType");
        m.e(events, "events");
        return CaptureStrategy.INSTANCE.createSegment(this.scopes, this.options, duration, currentSegmentTimestamp, replayId, segmentId, height, width, replayType, cache, frameRate, bitRate, screenAtStart, breadcrumbs, events);
    }

    public final ReplayCache getCache() {
        return this.cache;
    }

    public final Deque<RRWebEvent> getCurrentEvents() {
        return this.currentEvents;
    }

    @Override
    public SentryId getCurrentReplayId() {
        return (SentryId) this.currentReplayId.getValue(this, $$delegatedProperties[3]);
    }

    @Override
    public int getCurrentSegment() {
        return ((Number) this.currentSegment.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final ScreenshotRecorderConfig getRecorderConfig() {
        return (ScreenshotRecorderConfig) this.recorderConfig.getValue(this, $$delegatedProperties[0]);
    }

    @Override
    public File getReplayCacheDir() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            return replayCache.getReplayCacheDir$sentry_android_replay_release();
        }
        return null;
    }

    public final ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    public final AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    @Override
    public SentryReplayEvent.ReplayType getReplayType() {
        return (SentryReplayEvent.ReplayType) this.replayType.getValue(this, $$delegatedProperties[5]);
    }

    public final String getScreenAtStart() {
        return (String) this.screenAtStart.getValue(this, $$delegatedProperties[2]);
    }

    @Override
    public Date getSegmentTimestamp() {
        return (Date) this.segmentTimestamp.getValue(this, $$delegatedProperties[1]);
    }

    public final AtomicBoolean getIsTerminating() {
        return this.isTerminating;
    }

    @Override
    public void onConfigurationChanged(ScreenshotRecorderConfig recorderConfig) {
        m.e(recorderConfig, "recorderConfig");
        setRecorderConfig(recorderConfig);
    }

    @Override
    public void onScreenChanged(String str) {
        CaptureStrategy.DefaultImpls.onScreenChanged(this, str);
    }

    @Override
    public void onTouchEvent(MotionEvent event) {
        m.e(event, "event");
        List<RRWebIncrementalSnapshotEvent> listConvert = this.gestureConverter.convert(event, getRecorderConfig());
        if (listConvert != null) {
            p078i6.u.M0(this.currentEvents, listConvert);
        }
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
    }

    public final void setCache(ReplayCache replayCache) {
        this.cache = replayCache;
    }

    @Override
    public void setCurrentReplayId(SentryId sentryId) {
        m.e(sentryId, "<set-?>");
        this.currentReplayId.setValue(this, $$delegatedProperties[3], sentryId);
    }

    @Override
    public void setCurrentSegment(int i3) {
        this.currentSegment.setValue(this, $$delegatedProperties[4], Integer.valueOf(i3));
    }

    public final void setRecorderConfig(ScreenshotRecorderConfig screenshotRecorderConfig) {
        m.e(screenshotRecorderConfig, "<set-?>");
        this.recorderConfig.setValue(this, $$delegatedProperties[0], screenshotRecorderConfig);
    }

    @Override
    public void setReplayType(SentryReplayEvent.ReplayType replayType) {
        m.e(replayType, "<set-?>");
        this.replayType.setValue(this, $$delegatedProperties[5], replayType);
    }

    public final void setScreenAtStart(String str) {
        this.screenAtStart.setValue(this, $$delegatedProperties[2], str);
    }

    @Override
    public void setSegmentTimestamp(Date date) {
        this.segmentTimestamp.setValue(this, $$delegatedProperties[1], date);
    }

    @Override
    public void start(ScreenshotRecorderConfig recorderConfig, int segmentId, SentryId replayId, SentryReplayEvent.ReplayType replayType) {
        ReplayCache replayCache;
        m.e(recorderConfig, "recorderConfig");
        m.e(replayId, "replayId");
        j jVar = this.replayCacheProvider;
        if (jVar == null || (replayCache = (ReplayCache) jVar.invoke(replayId)) == null) {
            replayCache = new ReplayCache(this.options, replayId);
        }
        this.cache = replayCache;
        setCurrentReplayId(replayId);
        setCurrentSegment(segmentId);
        if (replayType == null) {
            replayType = this instanceof SessionCaptureStrategy ? SentryReplayEvent.ReplayType.SESSION : SentryReplayEvent.ReplayType.BUFFER;
        }
        setReplayType(replayType);
        setRecorderConfig(recorderConfig);
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
        this.replayStartTimestamp.set(this.dateProvider.getCurrentTimeMillis());
    }

    @Override
    public void stop() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            replayCache.close();
        }
        setCurrentSegment(-1);
        this.replayStartTimestamp.set(0L);
        setSegmentTimestamp(null);
        SentryId EMPTY_ID = SentryId.EMPTY_ID;
        m.d(EMPTY_ID, "EMPTY_ID");
        setCurrentReplayId(EMPTY_ID);
    }

    private final <T> c persistableAtomic(n onChange) {
        return new AnonymousClass2(null, this, onChange, "");
    }

    public BaseCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, j jVar, int i3, AbstractC2541f abstractC2541f) {
        this(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, (i3 & 16) != 0 ? null : jVar);
    }
}
