package io.sentry.android.replay;

import D1.RunnableC0239y;
import android.view.View;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.util.concurrent.D;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryOptions;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.util.AutoClosableReentrantLock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.h;
import p078i6.o;
import p078i6.u;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 82\u00020\u00012\u00020\u0002:\u000289B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R0\u0010'\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0%0$j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0%`&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R#\u00107\u001a\n 2*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lio/sentry/android/replay/WindowRecorder;", "Lio/sentry/android/replay/Recorder;", "Lio/sentry/android/replay/OnRootViewsChangedListener;", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "screenshotRecorderCallback", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/ScreenshotRecorderCallback;Lio/sentry/android/replay/util/MainLooperHandler;Ljava/util/concurrent/ScheduledExecutorService;)V", "Landroid/view/View;", "root", "", "added", "Lh6/A;", "onRootViewsChanged", "(Landroid/view/View;Z)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", TtmlNode.START, "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "resume", "()V", "pause", "stop", "close", "Lio/sentry/SentryOptions;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/android/replay/util/MainLooperHandler;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecording", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/ArrayList;", "rootViews", "Ljava/util/ArrayList;", "Lio/sentry/util/AutoClosableReentrantLock;", "rootViewsLock", "Lio/sentry/util/AutoClosableReentrantLock;", "Lio/sentry/android/replay/ScreenshotRecorder;", "recorder", "Lio/sentry/android/replay/ScreenshotRecorder;", "Ljava/util/concurrent/ScheduledFuture;", "capturingTask", "Ljava/util/concurrent/ScheduledFuture;", "kotlin.jvm.PlatformType", "capturer$delegate", "Lh6/h;", "getCapturer", "()Ljava/util/concurrent/ScheduledExecutorService;", "capturer", "Companion", "RecorderExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WindowRecorder implements Recorder, OnRootViewsChangedListener {
    private static final String TAG = "WindowRecorder";

    private final h capturer;
    private ScheduledFuture<?> capturingTask;
    private final AtomicBoolean isRecording;
    private final MainLooperHandler mainLooperHandler;
    private final SentryOptions options;
    private ScreenshotRecorder recorder;
    private final ScheduledExecutorService replayExecutor;
    private final ArrayList<WeakReference<View>> rootViews;
    private final AutoClosableReentrantLock rootViewsLock;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/WindowRecorder$RecorderExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class RecorderExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override
        public Thread newThread(Runnable r9) {
            m.e(r9, "r");
            StringBuilder sb = new StringBuilder("SentryWindowRecorder-");
            int i3 = this.cnt;
            this.cnt = i3 + 1;
            sb.append(i3);
            Thread thread = new Thread(r9, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    public WindowRecorder(SentryOptions options, ScreenshotRecorderCallback screenshotRecorderCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService replayExecutor) {
        m.e(options, "options");
        m.e(mainLooperHandler, "mainLooperHandler");
        m.e(replayExecutor, "replayExecutor");
        this.options = options;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.mainLooperHandler = mainLooperHandler;
        this.replayExecutor = replayExecutor;
        this.isRecording = new AtomicBoolean(false);
        this.rootViews = new ArrayList<>();
        this.rootViewsLock = new AutoClosableReentrantLock();
        this.capturer = D.B(WindowRecorder$capturer$2.INSTANCE);
    }

    private final ScheduledExecutorService getCapturer() {
        return (ScheduledExecutorService) this.capturer.getValue();
    }

    public static final void start$lambda$1(WindowRecorder this$0) {
        m.e(this$0, "this$0");
        ScreenshotRecorder screenshotRecorder = this$0.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.capture();
        }
    }

    @Override
    public void close() {
        stop();
        ScheduledExecutorService capturer = getCapturer();
        m.d(capturer, "capturer");
        ExecutorsKt.gracefullyShutdown(capturer, this.options);
    }

    @Override
    public void onRootViewsChanged(View root, boolean added) {
        ScreenshotRecorder screenshotRecorder;
        m.e(root, "root");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            if (added) {
                this.rootViews.add(new WeakReference<>(root));
                ScreenshotRecorder screenshotRecorder2 = this.recorder;
                if (screenshotRecorder2 != null) {
                    screenshotRecorder2.bind(root);
                }
            } else {
                ScreenshotRecorder screenshotRecorder3 = this.recorder;
                if (screenshotRecorder3 != null) {
                    screenshotRecorder3.unbind(root);
                }
                u.Q0(this.rootViews, new WindowRecorder$onRootViewsChanged$1$1(root));
                WeakReference weakReference = (WeakReference) o.s1(this.rootViews);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !root.equals(view) && (screenshotRecorder = this.recorder) != null) {
                    screenshotRecorder.bind(view);
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
    public void pause() {
        ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.pause();
        }
    }

    @Override
    public void resume() {
        ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.resume();
        }
    }

    @Override
    public void start(ScreenshotRecorderConfig recorderConfig) {
        m.e(recorderConfig, "recorderConfig");
        if (this.isRecording.getAndSet(true)) {
            return;
        }
        this.recorder = new ScreenshotRecorder(recorderConfig, this.options, this.mainLooperHandler, this.replayExecutor, this.screenshotRecorderCallback);
        ScheduledExecutorService capturer = getCapturer();
        m.d(capturer, "capturer");
        this.capturingTask = ExecutorsKt.scheduleAtFixedRateSafely(capturer, this.options, "WindowRecorder.capture", 100L, 1000 / ((long) recorderConfig.getFrameRate()), TimeUnit.MILLISECONDS, new RunnableC0239y(21, this));
    }

    @Override
    public void stop() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.rootViewsLock.acquire();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.unbind((View) weakReference.get());
                }
            }
            this.rootViews.clear();
            D.h(iSentryLifecycleTokenAcquire, null);
            ScreenshotRecorder screenshotRecorder2 = this.recorder;
            if (screenshotRecorder2 != null) {
                screenshotRecorder2.close();
            }
            this.recorder = null;
            ScheduledFuture<?> scheduledFuture = this.capturingTask;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.capturingTask = null;
            this.isRecording.set(false);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D.h(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    public WindowRecorder(SentryOptions sentryOptions, ScreenshotRecorderCallback screenshotRecorderCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService scheduledExecutorService, int i3, AbstractC2541f abstractC2541f) {
        this(sentryOptions, (i3 & 2) != 0 ? null : screenshotRecorderCallback, mainLooperHandler, scheduledExecutorService);
    }
}
