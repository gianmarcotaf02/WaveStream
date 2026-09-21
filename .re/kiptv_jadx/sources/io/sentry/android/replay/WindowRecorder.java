package io.sentry.android.replay;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 82\u00020\u00012\u00020\u0002:\u000289B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R0\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0%0$j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0%`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R#\u00107\u001a\n 2*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lio/sentry/android/replay/WindowRecorder;", "Lio/sentry/android/replay/Recorder;", "Lio/sentry/android/replay/OnRootViewsChangedListener;", "Lio/sentry/SentryOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "screenshotRecorderCallback", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/ScreenshotRecorderCallback;Lio/sentry/android/replay/util/MainLooperHandler;Ljava/util/concurrent/ScheduledExecutorService;)V", "Landroid/view/View;", "root", "", "added", "Lh6/A;", "onRootViewsChanged", "(Landroid/view/View;Z)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", androidx.media3.extractor.text.ttml.TtmlNode.START, "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "resume", "()V", "pause", "stop", "close", "Lio/sentry/SentryOptions;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/android/replay/util/MainLooperHandler;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecording", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/ArrayList;", "rootViews", "Ljava/util/ArrayList;", "Lio/sentry/util/AutoClosableReentrantLock;", "rootViewsLock", "Lio/sentry/util/AutoClosableReentrantLock;", "Lio/sentry/android/replay/ScreenshotRecorder;", "recorder", "Lio/sentry/android/replay/ScreenshotRecorder;", "Ljava/util/concurrent/ScheduledFuture;", "capturingTask", "Ljava/util/concurrent/ScheduledFuture;", "kotlin.jvm.PlatformType", "capturer$delegate", "Lh6/h;", "getCapturer", "()Ljava/util/concurrent/ScheduledExecutorService;", "capturer", "Companion", "RecorderExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowRecorder implements io.sentry.android.replay.Recorder, io.sentry.android.replay.OnRootViewsChangedListener {
    private static final java.lang.String TAG = "WindowRecorder";

    /* JADX INFO: renamed from: capturer$delegate, reason: from kotlin metadata */
    private final p070h6.h capturer;
    private java.util.concurrent.ScheduledFuture<?> capturingTask;
    private final java.util.concurrent.atomic.AtomicBoolean isRecording;
    private final io.sentry.android.replay.util.MainLooperHandler mainLooperHandler;
    private final io.sentry.SentryOptions options;
    private io.sentry.android.replay.ScreenshotRecorder recorder;
    private final java.util.concurrent.ScheduledExecutorService replayExecutor;
    private final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> rootViews;
    private final io.sentry.util.AutoClosableReentrantLock rootViewsLock;
    private final io.sentry.android.replay.ScreenshotRecorderCallback screenshotRecorderCallback;
    public static final int $stable = 8;

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/WindowRecorder$RecorderExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class RecorderExecutorServiceThreadFactory implements java.util.concurrent.ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r9) {
            kotlin.jvm.internal.m.e(r9, "r");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SentryWindowRecorder-");
            int i3 = this.cnt;
            this.cnt = i3 + 1;
            sb.append(i3);
            java.lang.Thread thread = new java.lang.Thread(r9, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public WindowRecorder(io.sentry.SentryOptions options, io.sentry.android.replay.ScreenshotRecorderCallback screenshotRecorderCallback, io.sentry.android.replay.util.MainLooperHandler mainLooperHandler, java.util.concurrent.ScheduledExecutorService replayExecutor) {
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.m.e(mainLooperHandler, "mainLooperHandler");
        kotlin.jvm.internal.m.e(replayExecutor, "replayExecutor");
        this.options = options;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.mainLooperHandler = mainLooperHandler;
        this.replayExecutor = replayExecutor;
        this.isRecording = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.rootViews = new java.util.ArrayList<>();
        this.rootViewsLock = new io.sentry.util.AutoClosableReentrantLock();
        this.capturer = com.google.common.util.concurrent.D.B(io.sentry.android.replay.WindowRecorder$capturer$2.INSTANCE);
    }

    private final java.util.concurrent.ScheduledExecutorService getCapturer() {
        return (java.util.concurrent.ScheduledExecutorService) this.capturer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$1(io.sentry.android.replay.WindowRecorder this$0) {
        kotlin.jvm.internal.m.e(this$0, "this$0");
        io.sentry.android.replay.ScreenshotRecorder screenshotRecorder = this$0.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.capture();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        stop();
        java.util.concurrent.ScheduledExecutorService capturer = getCapturer();
        kotlin.jvm.internal.m.d(capturer, "capturer");
        io.sentry.android.replay.util.ExecutorsKt.gracefullyShutdown(capturer, this.options);
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(android.view.View root, boolean added) {
        io.sentry.android.replay.ScreenshotRecorder screenshotRecorder;
        kotlin.jvm.internal.m.e(root, "root");
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            if (added) {
                this.rootViews.add(new java.lang.ref.WeakReference<>(root));
                io.sentry.android.replay.ScreenshotRecorder screenshotRecorder2 = this.recorder;
                if (screenshotRecorder2 != null) {
                    screenshotRecorder2.bind(root);
                }
            } else {
                io.sentry.android.replay.ScreenshotRecorder screenshotRecorder3 = this.recorder;
                if (screenshotRecorder3 != null) {
                    screenshotRecorder3.unbind(root);
                }
                p078i6.u.Q0(this.rootViews, new io.sentry.android.replay.WindowRecorder$onRootViewsChanged$1$1(root));
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) p078i6.o.s1(this.rootViews);
                android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
                if (view != null && !root.equals(view) && (screenshotRecorder = this.recorder) != null) {
                    screenshotRecorder.bind(view);
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

    @Override // io.sentry.android.replay.Recorder
    public void pause() {
        io.sentry.android.replay.ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.pause();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void resume() {
        io.sentry.android.replay.ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.resume();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void start(io.sentry.android.replay.ScreenshotRecorderConfig recorderConfig) {
        kotlin.jvm.internal.m.e(recorderConfig, "recorderConfig");
        if (this.isRecording.getAndSet(true)) {
            return;
        }
        this.recorder = new io.sentry.android.replay.ScreenshotRecorder(recorderConfig, this.options, this.mainLooperHandler, this.replayExecutor, this.screenshotRecorderCallback);
        java.util.concurrent.ScheduledExecutorService capturer = getCapturer();
        kotlin.jvm.internal.m.d(capturer, "capturer");
        this.capturingTask = io.sentry.android.replay.util.ExecutorsKt.scheduleAtFixedRateSafely(capturer, this.options, "WindowRecorder.capture", 100L, 1000 / ((long) recorderConfig.getFrameRate()), java.util.concurrent.TimeUnit.MILLISECONDS, new D1.RunnableC0239y(21, this));
    }

    @Override // io.sentry.android.replay.Recorder
    public void stop() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            java.util.Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                io.sentry.android.replay.ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.unbind((android.view.View) weakReference.get());
                }
            }
            this.rootViews.clear();
            com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, null);
            io.sentry.android.replay.ScreenshotRecorder screenshotRecorder2 = this.recorder;
            if (screenshotRecorder2 != null) {
                screenshotRecorder2.close();
            }
            this.recorder = null;
            java.util.concurrent.ScheduledFuture<?> scheduledFuture = this.capturingTask;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.capturingTask = null;
            this.isRecording.set(false);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ WindowRecorder(io.sentry.SentryOptions sentryOptions, io.sentry.android.replay.ScreenshotRecorderCallback screenshotRecorderCallback, io.sentry.android.replay.util.MainLooperHandler mainLooperHandler, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(sentryOptions, (i3 & 2) != 0 ? null : screenshotRecorderCallback, mainLooperHandler, scheduledExecutorService);
    }
}
