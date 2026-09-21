package io.sentry.android.replay;

import D1.RunnableC0239y;
import O7.q;
import O7.x;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.D;
import io.sentry.Breadcrumb;
import io.sentry.DataCategory;
import io.sentry.Hint;
import io.sentry.IConnectionStatusProvider;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.NoOpReplayBreadcrumbConverter;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.ReplayController;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.android.replay.gestures.GestureRecorder;
import io.sentry.android.replay.gestures.TouchRecorderCallback;
import io.sentry.android.replay.util.ContextKt;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.hints.Backfillable;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.transport.RateLimiter;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.FileUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Random;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p070h6.h;
import p194x6.j;

@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004\u008f\u0001\u0090\u0001BY\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0019B\u008b\u0001\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010 J\u001f\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010+J\u0019\u0010.\u001a\u00020%2\b\u0010-\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020%2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000202H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020%H\u0016¢\u0006\u0004\b8\u0010+J\u000f\u00109\u001a\u00020%H\u0016¢\u0006\u0004\b9\u0010+J\u0017\u0010<\u001a\u00020%2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010<\u001a\u00020%2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\b<\u0010BJ\u000f\u0010C\u001a\u00020%H\u0016¢\u0006\u0004\bC\u0010+J\u0017\u0010F\u001a\u00020%2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020%2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010N\u001a\u00020%2\u0006\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020%H\u0016¢\u0006\u0004\bP\u0010+J\u0017\u0010S\u001a\u00020%2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020%H\u0002¢\u0006\u0004\bU\u0010+J\u000f\u0010V\u001a\u00020%H\u0002¢\u0006\u0004\bV\u0010+J\u000f\u0010W\u001a\u00020%H\u0002¢\u0006\u0004\bW\u0010+J\u000f\u0010X\u001a\u00020%H\u0002¢\u0006\u0004\bX\u0010+J\u000f\u0010Y\u001a\u00020%H\u0002¢\u0006\u0004\bY\u0010+J\u0019\u0010\\\u001a\u00020%2\b\b\u0002\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020%H\u0002¢\u0006\u0004\b^\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010_R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010`R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010aR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010bR\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010bR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010cR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020o8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bp\u0010k\u001a\u0004\bq\u0010rR#\u0010y\u001a\n u*\u0004\u0018\u00010t0t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010k\u001a\u0004\bw\u0010xR\u001a\u0010{\u001a\u00020z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001b\u0010\u007f\u001a\u00020z8\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u007f\u0010|\u001a\u0005\b\u0080\u0001\u0010~R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0019\u0010\u0083\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R$\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001d\u0010\u0085\u0001R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010aR\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u008e\u0001\u001a\u0004\u0018\u00010>8F¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0091\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/Integration;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "Lio/sentry/ReplayController;", "Landroid/content/ComponentCallbacks;", "Lio/sentry/IConnectionStatusProvider$IConnectionStatusObserver;", "Lio/sentry/transport/RateLimiter$IRateLimitObserver;", "Landroid/content/Context;", "context", "Lio/sentry/transport/ICurrentDateProvider;", "dateProvider", "Lkotlin/Function0;", "Lio/sentry/android/replay/Recorder;", "recorderProvider", "Lkotlin/Function1;", "", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfigProvider", "Lio/sentry/protocol/SentryId;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Landroid/content/Context;Lio/sentry/transport/ICurrentDateProvider;Lkotlin/jvm/functions/Function0;Lx6/j;Lx6/j;)V", "(Landroid/content/Context;Lio/sentry/transport/ICurrentDateProvider;)V", "Lio/sentry/android/replay/capture/CaptureStrategy;", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Lio/sentry/android/replay/gestures/GestureRecorder;", "gestureRecorderProvider", "(Landroid/content/Context;Lio/sentry/transport/ICurrentDateProvider;Lkotlin/jvm/functions/Function0;Lx6/j;Lx6/j;Lx6/j;Lio/sentry/android/replay/util/MainLooperHandler;Lkotlin/jvm/functions/Function0;)V", "Lio/sentry/IScopes;", "scopes", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lh6/A;", "register", "(Lio/sentry/IScopes;Lio/sentry/SentryOptions;)V", "isRecording", "()Z", TtmlNode.START, "()V", "resume", "isTerminating", "captureReplay", "(Ljava/lang/Boolean;)V", "getReplayId", "()Lio/sentry/protocol/SentryId;", "Lio/sentry/ReplayBreadcrumbConverter;", "converter", "setBreadcrumbConverter", "(Lio/sentry/ReplayBreadcrumbConverter;)V", "getBreadcrumbConverter", "()Lio/sentry/ReplayBreadcrumbConverter;", "pause", "stop", "Landroid/graphics/Bitmap;", "bitmap", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;)V", "Ljava/io/File;", "screenshot", "", "frameTimestamp", "(Ljava/io/File;J)V", "close", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lio/sentry/IConnectionStatusProvider$ConnectionStatus;", "status", "onConnectionStatusChanged", "(Lio/sentry/IConnectionStatusProvider$ConnectionStatus;)V", "Lio/sentry/transport/RateLimiter;", "rateLimiter", "onRateLimitChanged", "(Lio/sentry/transport/RateLimiter;)V", "onLowMemory", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "resumeInternal", "pauseInternal", "checkCanRecord", "registerRootViewListeners", "unregisterRootViewListeners", "", "unfinishedReplayId", "cleanupReplays", "(Ljava/lang/String;)V", "finalizePreviousReplay", "Landroid/content/Context;", "Lio/sentry/transport/ICurrentDateProvider;", "Lkotlin/jvm/functions/Function0;", "Lx6/j;", "Lio/sentry/SentryOptions;", "Lio/sentry/IScopes;", "recorder", "Lio/sentry/android/replay/Recorder;", "gestureRecorder", "Lio/sentry/android/replay/gestures/GestureRecorder;", "Lio/sentry/util/Random;", "random$delegate", "Lh6/h;", "getRandom", "()Lio/sentry/util/Random;", "random", "Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy$delegate", "getRootViewsSpy$sentry_android_replay_release", "()Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "replayExecutor$delegate", "getReplayExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isManualPause", "isManualPause$sentry_android_replay_release", "captureStrategy", "Lio/sentry/android/replay/capture/CaptureStrategy;", "replayBreadcrumbConverter", "Lio/sentry/ReplayBreadcrumbConverter;", "Lio/sentry/android/replay/util/MainLooperHandler;", "Lio/sentry/util/AutoClosableReentrantLock;", "lifecycleLock", "Lio/sentry/util/AutoClosableReentrantLock;", "Lio/sentry/android/replay/ReplayLifecycle;", "lifecycle", "Lio/sentry/android/replay/ReplayLifecycle;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "PreviousReplayHint", "ReplayExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ReplayIntegration implements Integration, Closeable, ScreenshotRecorderCallback, TouchRecorderCallback, ReplayController, ComponentCallbacks, IConnectionStatusProvider.IConnectionStatusObserver, RateLimiter.IRateLimitObserver, AutoCloseable {
    public static final int $stable = 8;
    private CaptureStrategy captureStrategy;
    private final Context context;
    private final ICurrentDateProvider dateProvider;
    private GestureRecorder gestureRecorder;
    private Function0 gestureRecorderProvider;
    private final AtomicBoolean isEnabled;
    private final AtomicBoolean isManualPause;
    private final ReplayLifecycle lifecycle;
    private final AutoClosableReentrantLock lifecycleLock;
    private MainLooperHandler mainLooperHandler;
    private SentryOptions options;

    private final h random;
    private Recorder recorder;
    private final j recorderConfigProvider;
    private final Function0 recorderProvider;
    private ReplayBreadcrumbConverter replayBreadcrumbConverter;
    private final j replayCacheProvider;
    private j replayCaptureStrategyProvider;

    private final h replayExecutor;

    private final h rootViewsSpy;
    private IScopes scopes;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$PreviousReplayHint;", "Lio/sentry/hints/Backfillable;", "()V", "shouldEnrich", "", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class PreviousReplayHint implements Backfillable {
        @Override
        public boolean shouldEnrich() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$ReplayExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ReplayExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override
        public Thread newThread(Runnable r9) {
            m.e(r9, "r");
            StringBuilder sb = new StringBuilder("SentryReplayIntegration-");
            int i3 = this.cnt;
            this.cnt = i3 + 1;
            sb.append(i3);
            Thread thread = new Thread(r9, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "newTimestamp", "Lh6/A;", "invoke", "(Ljava/util/Date;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1 extends o implements j {
        public AnonymousClass1() {
            super(1);
        }

        @Override
        public Object invoke(Object obj) {
            invoke((Date) obj);
            return A.f22523a;
        }

        public final void invoke(Date newTimestamp) {
            m.e(newTimestamp, "newTimestamp");
            CaptureStrategy captureStrategy = ReplayIntegration.this.captureStrategy;
            if (captureStrategy != null) {
                CaptureStrategy captureStrategy2 = ReplayIntegration.this.captureStrategy;
                Integer numValueOf = captureStrategy2 != null ? Integer.valueOf(captureStrategy2.getCurrentSegment()) : null;
                m.b(numValueOf);
                captureStrategy.setCurrentSegment(numValueOf.intValue() + 1);
            }
            CaptureStrategy captureStrategy3 = ReplayIntegration.this.captureStrategy;
            if (captureStrategy3 == null) {
                return;
            }
            captureStrategy3.setSegmentTimestamp(newTimestamp);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "", "frameTimeStamp", "Lh6/A;", "invoke", "(Lio/sentry/android/replay/ReplayCache;J)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass2 extends o implements p194x6.m {
        final Bitmap $bitmap;
        final kotlin.jvm.internal.A $screen;
        final ReplayIntegration this$0;

        public AnonymousClass2(Bitmap bitmap, kotlin.jvm.internal.A a2, ReplayIntegration replayIntegration) {
            super(2);
            this.$bitmap = bitmap;
            this.$screen = a2;
            this.this$0 = replayIntegration;
        }

        @Override
        public Object invoke(Object obj, Object obj2) throws IOException {
            invoke((ReplayCache) obj, ((Number) obj2).longValue());
            return A.f22523a;
        }

        public final void invoke(ReplayCache onScreenshotRecorded, long j) throws IOException {
            m.e(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.addFrame$sentry_android_replay_release(this.$bitmap, j, (String) this.$screen.f24539h);
            this.this$0.checkCanRecord();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "", "<anonymous parameter 0>", "Lh6/A;", "invoke", "(Lio/sentry/android/replay/ReplayCache;J)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass3 extends o implements p194x6.m {
        final long $frameTimestamp;
        final File $screenshot;
        final ReplayIntegration this$0;

        public AnonymousClass3(File file, long j, ReplayIntegration replayIntegration) {
            super(2);
            this.$screenshot = file;
            this.$frameTimestamp = j;
            this.this$0 = replayIntegration;
        }

        @Override
        public Object invoke(Object obj, Object obj2) {
            invoke((ReplayCache) obj, ((Number) obj2).longValue());
            return A.f22523a;
        }

        public final void invoke(ReplayCache onScreenshotRecorded, long j) {
            m.e(onScreenshotRecorded, "$this$onScreenshotRecorded");
            ReplayCache.addFrame$default(onScreenshotRecorded, this.$screenshot, this.$frameTimestamp, null, 4, null);
            this.this$0.checkCanRecord();
        }
    }

    public ReplayIntegration(Context context, ICurrentDateProvider dateProvider, Function0 function0, j jVar, j jVar2) {
        m.e(context, "context");
        m.e(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = function0;
        this.recorderConfigProvider = jVar;
        this.replayCacheProvider = jVar2;
        this.random = D.B(ReplayIntegration$random$2.INSTANCE);
        this.rootViewsSpy = D.B(ReplayIntegration$rootViewsSpy$2.INSTANCE);
        this.replayExecutor = D.B(ReplayIntegration$replayExecutor$2.INSTANCE);
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        NoOpReplayBreadcrumbConverter noOpReplayBreadcrumbConverter = NoOpReplayBreadcrumbConverter.getInstance();
        m.d(noOpReplayBreadcrumbConverter, "getInstance()");
        this.replayBreadcrumbConverter = noOpReplayBreadcrumbConverter;
        this.mainLooperHandler = new MainLooperHandler(null, 1, null);
        this.lifecycleLock = new AutoClosableReentrantLock();
        this.lifecycle = new ReplayLifecycle();
    }

    public final void checkCanRecord() {
        IScopes iScopes;
        IScopes iScopes2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            SentryOptions sentryOptions = this.options;
            if (sentryOptions == null) {
                m.k(RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            if (sentryOptions.getConnectionStatusProvider().getConnectionStatus() == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED || !(((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                pauseInternal();
            }
        }
    }

    private final void cleanupReplays(String unfinishedReplayId) {
        File[] fileArrListFiles;
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            m.k(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            m.d(name, "name");
            if (x.x0(name, "replay_", false)) {
                String string = getReplayId().toString();
                m.d(string, "replayId.toString()");
                if (!q.B0(name, string, false) && (q.N0(unfinishedReplayId) || !q.B0(name, unfinishedReplayId, false))) {
                    FileUtils.deleteRecursively(file);
                }
            }
        }
    }

    public static void cleanupReplays$default(ReplayIntegration replayIntegration, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = "";
        }
        replayIntegration.cleanupReplays(str);
    }

    private final void finalizePreviousReplay() {
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            m.k(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        ISentryExecutorService executorService = sentryOptions.getExecutorService();
        m.d(executorService, "options.executorService");
        SentryOptions sentryOptions2 = this.options;
        if (sentryOptions2 != null) {
            ExecutorsKt.submitSafely(executorService, sentryOptions2, "ReplayIntegration.finalize_previous_replay", new RunnableC0239y(19, this));
        } else {
            m.k(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
    }

    public static final void finalizePreviousReplay$lambda$10(ReplayIntegration this$0) throws IOException {
        m.e(this$0, "this$0");
        SentryOptions sentryOptions = this$0.options;
        if (sentryOptions == null) {
            m.k(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        String str = (String) PersistingScopeObserver.read(sentryOptions, PersistingScopeObserver.REPLAY_FILENAME, String.class);
        if (str == null) {
            cleanupReplays$default(this$0, null, 1, null);
            return;
        }
        SentryId sentryId = new SentryId(str);
        if (sentryId.equals(SentryId.EMPTY_ID)) {
            cleanupReplays$default(this$0, null, 1, null);
            return;
        }
        ReplayCache.Companion companion = ReplayCache.INSTANCE;
        SentryOptions sentryOptions2 = this$0.options;
        if (sentryOptions2 == null) {
            m.k(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        LastSegmentData lastSegmentDataFromDisk$sentry_android_replay_release = companion.fromDisk$sentry_android_replay_release(sentryOptions2, sentryId, this$0.replayCacheProvider);
        if (lastSegmentDataFromDisk$sentry_android_replay_release == null) {
            cleanupReplays$default(this$0, null, 1, null);
            return;
        }
        SentryOptions sentryOptions3 = this$0.options;
        if (sentryOptions3 == null) {
            m.k(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        Object obj = PersistingScopeObserver.read(sentryOptions3, PersistingScopeObserver.BREADCRUMBS_FILENAME, List.class, new Breadcrumb.Deserializer());
        List<Breadcrumb> list = obj instanceof List ? (List) obj : null;
        CaptureStrategy.Companion companion2 = CaptureStrategy.INSTANCE;
        IScopes iScopes = this$0.scopes;
        SentryOptions sentryOptions4 = this$0.options;
        if (sentryOptions4 == null) {
            m.k(RRWebOptionsEvent.EVENT_TAG);
            throw null;
        }
        CaptureStrategy.ReplaySegment replaySegmentCreateSegment = companion2.createSegment(iScopes, sentryOptions4, lastSegmentDataFromDisk$sentry_android_replay_release.getDuration(), lastSegmentDataFromDisk$sentry_android_replay_release.getTimestamp(), sentryId, lastSegmentDataFromDisk$sentry_android_replay_release.getId(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingHeight(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingWidth(), lastSegmentDataFromDisk$sentry_android_replay_release.getReplayType(), lastSegmentDataFromDisk$sentry_android_replay_release.getCache(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getFrameRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getBitRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getScreenAtStart(), list, new LinkedList(lastSegmentDataFromDisk$sentry_android_replay_release.getEvents()));
        if (replaySegmentCreateSegment instanceof CaptureStrategy.ReplaySegment.Created) {
            Hint hint = HintUtils.createWithTypeCheckHint(new PreviousReplayHint());
            IScopes iScopes2 = this$0.scopes;
            m.d(hint, "hint");
            ((CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegment).capture(iScopes2, hint);
        }
        this$0.cleanupReplays(str);
    }

    private final Random getRandom() {
        return (Random) this.random.getValue();
    }

    private final ScheduledExecutorService getReplayExecutor() {
        return (ScheduledExecutorService) this.replayExecutor.getValue();
    }

    public static final void onScreenshotRecorded$lambda$4(kotlin.jvm.internal.A screen, IScope it) {
        m.e(screen, "$screen");
        m.e(it, "it");
        String screen2 = it.getScreen();
        screen.f24539h = screen2 != null ? q.k1('.', screen2, screen2) : null;
    }

    private final void pauseInternal() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.PAUSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.pause();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.pause();
                    }
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    D.h(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            D.h(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    private final void registerRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            m.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.add((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().add(this.gestureRecorder);
    }

    private final void resumeInternal() {
        IScopes iScopes;
        IScopes iScopes2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.RESUMED;
                if (replayLifecycle.isAllowed(replayState)) {
                    if (!this.isManualPause.get()) {
                        SentryOptions sentryOptions = this.options;
                        if (sentryOptions == null) {
                            m.k(RRWebOptionsEvent.EVENT_TAG);
                            throw null;
                        }
                        if (sentryOptions.getConnectionStatusProvider().getConnectionStatus() != IConnectionStatusProvider.ConnectionStatus.DISCONNECTED && (((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                            CaptureStrategy captureStrategy = this.captureStrategy;
                            if (captureStrategy != null) {
                                captureStrategy.resume();
                            }
                            Recorder recorder = this.recorder;
                            if (recorder != null) {
                                recorder.resume();
                            }
                            this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                            D.h(iSentryLifecycleTokenAcquire, null);
                            return;
                        }
                    }
                    D.h(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            D.h(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    private final void unregisterRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            m.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.remove((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().remove(this.gestureRecorder);
    }

    @Override
    public void captureReplay(Boolean isTerminating) {
        if (this.isEnabled.get() && isRecording()) {
            SentryId sentryId = SentryId.EMPTY_ID;
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (sentryId.equals(captureStrategy != null ? captureStrategy.getCurrentReplayId() : null)) {
                SentryOptions sentryOptions = this.options;
                if (sentryOptions != null) {
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                    return;
                } else {
                    m.k(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
            }
            CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                captureStrategy2.captureReplay(m.a(isTerminating, Boolean.TRUE), new AnonymousClass1());
            }
            CaptureStrategy captureStrategy3 = this.captureStrategy;
            this.captureStrategy = captureStrategy3 != null ? captureStrategy3.convert() : null;
        }
    }

    @Override
    public void close() {
        RateLimiter rateLimiter;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get() && this.lifecycle.isAllowed(ReplayState.CLOSED)) {
                SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    m.k(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                sentryOptions.getConnectionStatusProvider().removeConnectionStatusObserver(this);
                IScopes iScopes = this.scopes;
                if (iScopes != null && (rateLimiter = iScopes.getRateLimiter()) != null) {
                    rateLimiter.removeRateLimitObserver(this);
                }
                SentryOptions sentryOptions2 = this.options;
                if (sentryOptions2 == null) {
                    m.k(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                if (sentryOptions2.getSessionReplay().isTrackOrientationChange()) {
                    try {
                        this.context.unregisterComponentCallbacks(this);
                    } catch (Throwable unused) {
                    }
                }
                stop();
                Recorder recorder = this.recorder;
                if (recorder != null) {
                    recorder.close();
                }
                this.recorder = null;
                getRootViewsSpy$sentry_android_replay_release().close();
                ScheduledExecutorService replayExecutor = getReplayExecutor();
                m.d(replayExecutor, "replayExecutor");
                SentryOptions sentryOptions3 = this.options;
                if (sentryOptions3 == null) {
                    m.k(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                ExecutorsKt.gracefullyShutdown(replayExecutor, sentryOptions3);
                this.lifecycle.setCurrentState$sentry_android_replay_release(ReplayState.CLOSED);
                D.h(iSentryLifecycleTokenAcquire, null);
                return;
            }
            D.h(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override
    public ReplayBreadcrumbConverter getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    public final File getReplayCacheDir() {
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            return captureStrategy.getReplayCacheDir();
        }
        return null;
    }

    @Override
    public SentryId getReplayId() {
        SentryId currentReplayId;
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null && (currentReplayId = captureStrategy.getCurrentReplayId()) != null) {
            return currentReplayId;
        }
        SentryId EMPTY_ID = SentryId.EMPTY_ID;
        m.d(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    public final RootViewsSpy getRootViewsSpy$sentry_android_replay_release() {
        return (RootViewsSpy) this.rootViewsSpy.getValue();
    }

    public final AtomicBoolean getIsEnabled() {
        return this.isEnabled;
    }

    public final AtomicBoolean getIsManualPause() {
        return this.isManualPause;
    }

    @Override
    public boolean isRecording() {
        return this.lifecycle.getCurrentState().compareTo(ReplayState.STARTED) >= 0 && this.lifecycle.getCurrentState().compareTo(ReplayState.STOPPED) < 0;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        ScreenshotRecorderConfig screenshotRecorderConfigFrom;
        Recorder recorder;
        m.e(newConfig, "newConfig");
        if (this.isEnabled.get() && isRecording()) {
            Recorder recorder2 = this.recorder;
            if (recorder2 != null) {
                recorder2.stop();
            }
            j jVar = this.recorderConfigProvider;
            if (jVar == null || (screenshotRecorderConfigFrom = (ScreenshotRecorderConfig) jVar.invoke(Boolean.TRUE)) == null) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.INSTANCE;
                Context context = this.context;
                SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    m.k(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                SentryReplayOptions sessionReplay = sentryOptions.getSessionReplay();
                m.d(sessionReplay, "options.sessionReplay");
                screenshotRecorderConfigFrom = companion.from(context, sessionReplay);
            }
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.onConfigurationChanged(screenshotRecorderConfigFrom);
            }
            Recorder recorder3 = this.recorder;
            if (recorder3 != null) {
                recorder3.start(screenshotRecorderConfigFrom);
            }
            if (this.lifecycle.getCurrentState() != ReplayState.PAUSED || (recorder = this.recorder) == null) {
                return;
            }
            recorder.pause();
        }
    }

    @Override
    public void onConnectionStatusChanged(IConnectionStatusProvider.ConnectionStatus status) {
        m.e(status, "status");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (status == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override
    public void onLowMemory() {
    }

    @Override
    public void onRateLimitChanged(RateLimiter rateLimiter) {
        m.e(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (rateLimiter.isActiveForCategory(DataCategory.All) || rateLimiter.isActiveForCategory(DataCategory.Replay)) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override
    public void onScreenshotRecorded(Bitmap bitmap) {
        m.e(bitmap, "bitmap");
        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new b(a2, 0));
        }
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy.onScreenshotRecorded(bitmap, new AnonymousClass2(bitmap, a2, this));
        }
    }

    @Override
    public void onTouchEvent(MotionEvent event) {
        CaptureStrategy captureStrategy;
        m.e(event, "event");
        if (this.isEnabled.get() && this.lifecycle.isTouchRecordingAllowed() && (captureStrategy = this.captureStrategy) != null) {
            captureStrategy.onTouchEvent(event);
        }
    }

    @Override
    public void pause() {
        this.isManualPause.set(true);
        pauseInternal();
    }

    @Override
    public void register(IScopes scopes, SentryOptions options) {
        Recorder windowRecorder;
        GestureRecorder gestureRecorder;
        m.e(scopes, "scopes");
        m.e(options, "options");
        this.options = options;
        if (Build.VERSION.SDK_INT < 26) {
            options.getLogger().log(SentryLevel.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        if (!options.getSessionReplay().isSessionReplayEnabled() && !options.getSessionReplay().isSessionReplayForErrorsEnabled()) {
            options.getLogger().log(SentryLevel.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = scopes;
        Function0 function0 = this.recorderProvider;
        if (function0 == null || (windowRecorder = (Recorder) function0.invoke()) == null) {
            MainLooperHandler mainLooperHandler = this.mainLooperHandler;
            ScheduledExecutorService replayExecutor = getReplayExecutor();
            m.d(replayExecutor, "replayExecutor");
            windowRecorder = new WindowRecorder(options, this, mainLooperHandler, replayExecutor);
        }
        this.recorder = windowRecorder;
        Function0 function1 = this.gestureRecorderProvider;
        if (function1 == null || (gestureRecorder = (GestureRecorder) function1.invoke()) == null) {
            gestureRecorder = new GestureRecorder(options, this);
        }
        this.gestureRecorder = gestureRecorder;
        this.isEnabled.set(true);
        options.getConnectionStatusProvider().addConnectionStatusObserver(this);
        RateLimiter rateLimiter = scopes.getRateLimiter();
        if (rateLimiter != null) {
            rateLimiter.addRateLimitObserver(this);
        }
        if (options.getSessionReplay().isTrackOrientationChange()) {
            try {
                this.context.registerComponentCallbacks(this);
            } catch (Throwable th) {
                options.getLogger().log(SentryLevel.INFO, "ComponentCallbacks is not available, orientation changes won't be handled by Session replay", th);
            }
        }
        IntegrationUtils.addIntegrationToSdkVersion("Replay");
        SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry-android-replay", "8.4.0");
        finalizePreviousReplay();
    }

    @Override
    public void resume() {
        this.isManualPause.set(false);
        resumeInternal();
    }

    @Override
    public void setBreadcrumbConverter(ReplayBreadcrumbConverter converter) {
        m.e(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    @Override
    public void start() {
        ScreenshotRecorderConfig screenshotRecorderConfigFrom;
        CaptureStrategy bufferCaptureStrategy;
        CaptureStrategy captureStrategy;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (!this.isEnabled.get()) {
                D.h(iSentryLifecycleTokenAcquire, null);
                return;
            }
            ReplayLifecycle replayLifecycle = this.lifecycle;
            ReplayState replayState = ReplayState.STARTED;
            if (!replayLifecycle.isAllowed(replayState)) {
                SentryOptions sentryOptions = this.options;
                if (sentryOptions == null) {
                    m.k(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                D.h(iSentryLifecycleTokenAcquire, null);
                return;
            }
            Random random = getRandom();
            SentryOptions sentryOptions2 = this.options;
            if (sentryOptions2 == null) {
                m.k(RRWebOptionsEvent.EVENT_TAG);
                throw null;
            }
            boolean zSample = SamplingKt.sample(random, sentryOptions2.getSessionReplay().getSessionSampleRate());
            if (!zSample) {
                SentryOptions sentryOptions3 = this.options;
                if (sentryOptions3 == null) {
                    m.k(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                if (!sentryOptions3.getSessionReplay().isSessionReplayForErrorsEnabled()) {
                    SentryOptions sentryOptions4 = this.options;
                    if (sentryOptions4 == null) {
                        m.k(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    sentryOptions4.getLogger().log(SentryLevel.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    D.h(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            j jVar = this.recorderConfigProvider;
            if (jVar == null || (screenshotRecorderConfigFrom = (ScreenshotRecorderConfig) jVar.invoke(Boolean.FALSE)) == null) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.INSTANCE;
                Context context = this.context;
                SentryOptions sentryOptions5 = this.options;
                if (sentryOptions5 == null) {
                    m.k(RRWebOptionsEvent.EVENT_TAG);
                    throw null;
                }
                SentryReplayOptions sessionReplay = sentryOptions5.getSessionReplay();
                m.d(sessionReplay, "options.sessionReplay");
                screenshotRecorderConfigFrom = companion.from(context, sessionReplay);
            }
            ScreenshotRecorderConfig screenshotRecorderConfig = screenshotRecorderConfigFrom;
            j jVar2 = this.replayCaptureStrategyProvider;
            if (jVar2 == null || (captureStrategy = (CaptureStrategy) jVar2.invoke(Boolean.valueOf(zSample))) == null) {
                if (zSample) {
                    SentryOptions sentryOptions6 = this.options;
                    if (sentryOptions6 == null) {
                        m.k(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    IScopes iScopes = this.scopes;
                    ICurrentDateProvider iCurrentDateProvider = this.dateProvider;
                    ScheduledExecutorService replayExecutor = getReplayExecutor();
                    m.d(replayExecutor, "replayExecutor");
                    bufferCaptureStrategy = new SessionCaptureStrategy(sentryOptions6, iScopes, iCurrentDateProvider, replayExecutor, this.replayCacheProvider);
                } else {
                    SentryOptions sentryOptions7 = this.options;
                    if (sentryOptions7 == null) {
                        m.k(RRWebOptionsEvent.EVENT_TAG);
                        throw null;
                    }
                    IScopes iScopes2 = this.scopes;
                    ICurrentDateProvider iCurrentDateProvider2 = this.dateProvider;
                    Random random2 = getRandom();
                    ScheduledExecutorService replayExecutor2 = getReplayExecutor();
                    m.d(replayExecutor2, "replayExecutor");
                    bufferCaptureStrategy = new BufferCaptureStrategy(sentryOptions7, iScopes2, iCurrentDateProvider2, random2, replayExecutor2, this.replayCacheProvider);
                }
                captureStrategy = bufferCaptureStrategy;
            }
            CaptureStrategy captureStrategy2 = captureStrategy;
            this.captureStrategy = captureStrategy2;
            CaptureStrategy.DefaultImpls.start$default(captureStrategy2, screenshotRecorderConfig, 0, null, null, 14, null);
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.start(screenshotRecorderConfig);
            }
            registerRootViewListeners();
            this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
            D.h(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override
    public void stop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.STOPPED;
                if (replayLifecycle.isAllowed(replayState)) {
                    unregisterRootViewListeners();
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.stop();
                    }
                    GestureRecorder gestureRecorder = this.gestureRecorder;
                    if (gestureRecorder != null) {
                        gestureRecorder.stop();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    D.h(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            D.h(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override
    public void onScreenshotRecorded(File screenshot, long frameTimestamp) {
        m.e(screenshot, "screenshot");
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            CaptureStrategy.DefaultImpls.onScreenshotRecorded$default(captureStrategy, null, new AnonymousClass3(screenshot, frameTimestamp, this), 1, null);
        }
    }

    public ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, Function0 function0, j jVar, j jVar2, int i3, AbstractC2541f abstractC2541f) {
        this(context, iCurrentDateProvider, (i3 & 4) != 0 ? null : function0, (i3 & 8) != 0 ? null : jVar, (i3 & 16) != 0 ? null : jVar2);
    }

    public ReplayIntegration(Context context, ICurrentDateProvider dateProvider) {
        this(ContextKt.appContext(context), dateProvider, null, null, null);
        m.e(context, "context");
        m.e(dateProvider, "dateProvider");
    }

    public ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, Function0 function0, j jVar, j jVar2, j jVar3, MainLooperHandler mainLooperHandler, Function0 function1, int i3, AbstractC2541f abstractC2541f) {
        this(context, iCurrentDateProvider, function0, jVar, jVar2, (i3 & 32) != 0 ? null : jVar3, (i3 & 64) != 0 ? null : mainLooperHandler, (i3 & 128) != 0 ? null : function1);
    }

    public ReplayIntegration(Context context, ICurrentDateProvider dateProvider, Function0 function0, j jVar, j jVar2, j jVar3, MainLooperHandler mainLooperHandler, Function0 function1) {
        this(ContextKt.appContext(context), dateProvider, function0, jVar, jVar2);
        m.e(context, "context");
        m.e(dateProvider, "dateProvider");
        this.replayCaptureStrategyProvider = jVar3;
        this.mainLooperHandler = mainLooperHandler == null ? new MainLooperHandler(null, 1, null) : mainLooperHandler;
        this.gestureRecorderProvider = function1;
    }
}
