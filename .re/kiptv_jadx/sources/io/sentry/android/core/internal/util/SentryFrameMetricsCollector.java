package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryFrameMetricsCollector implements android.app.Application.ActivityLifecycleCallbacks {
    private final io.sentry.android.core.BuildInfoProvider buildInfoProvider;
    private android.view.Choreographer choreographer;
    private java.lang.reflect.Field choreographerLastFrameTimeField;
    private java.lang.ref.WeakReference<android.view.Window> currentWindow;
    private android.view.Window.OnFrameMetricsAvailableListener frameMetricsAvailableListener;
    private android.os.Handler handler;
    private boolean isAvailable;
    private long lastFrameEndNanos;
    private long lastFrameStartNanos;
    private final java.util.Map<java.lang.String, io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener> listenerMap;
    private final io.sentry.ILogger logger;
    private final java.util.Set<android.view.Window> trackedWindows;
    private final io.sentry.android.core.internal.util.SentryFrameMetricsCollector.WindowFrameMetricsManager windowFrameMetricsManager;
    private static final long oneSecondInNanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
    private static final long frozenFrameThresholdNanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(700);

    public interface FrameMetricsCollectorListener {
        void onFrameMetricCollected(long j, long j9, long j10, long j11, boolean z6, boolean z9, float f9);
    }

    public interface WindowFrameMetricsManager {
        default void addOnFrameMetricsAvailableListener(android.view.Window window, android.view.Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, android.os.Handler handler) {
            window.addOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener, handler);
        }

        default void removeOnFrameMetricsAvailableListener(android.view.Window window, android.view.Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
            window.removeOnFrameMetricsAvailableListener(onFrameMetricsAvailableListener);
        }
    }

    public SentryFrameMetricsCollector(android.content.Context context, io.sentry.SentryOptions sentryOptions, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        this(context, sentryOptions, buildInfoProvider, new io.sentry.android.core.internal.util.SentryFrameMetricsCollector.WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.1
        });
    }

    private long getFrameCpuDuration(android.view.FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
    }

    private long getFrameStartTimestamp(android.view.FrameMetrics frameMetrics) {
        return this.buildInfoProvider.getSdkInfoVersion() >= 26 ? frameMetrics.getMetric(10) : getLastKnownFrameStartTimeNanos();
    }

    public static boolean isFrozen(long j) {
        return j > frozenFrameThresholdNanos;
    }

    public static boolean isSlow(long j, long j9) {
        return j > j9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(io.sentry.ILogger iLogger, java.lang.Thread thread, java.lang.Throwable th) {
        iLogger.log(io.sentry.SentryLevel.ERROR, "Error during frames measurements.", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(io.sentry.ILogger iLogger) {
        try {
            this.choreographer = android.view.Choreographer.getInstance();
        } catch (java.lang.Throwable th) {
            iLogger.log(io.sentry.SentryLevel.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(io.sentry.android.core.BuildInfoProvider buildInfoProvider, android.view.Window window, android.view.FrameMetrics frameMetrics, int i3) {
        long jNanoTime = java.lang.System.nanoTime();
        float refreshRate = buildInfoProvider.getSdkInfoVersion() >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f9 = oneSecondInNanos;
        long frameCpuDuration = getFrameCpuDuration(frameMetrics);
        long jMax = java.lang.Math.max(0L, frameCpuDuration - ((long) (f9 / refreshRate)));
        long frameStartTimestamp = getFrameStartTimestamp(frameMetrics);
        if (frameStartTimestamp < 0) {
            frameStartTimestamp = jNanoTime - frameCpuDuration;
        }
        long jMax2 = java.lang.Math.max(frameStartTimestamp, this.lastFrameEndNanos);
        if (jMax2 == this.lastFrameStartNanos) {
            return;
        }
        this.lastFrameStartNanos = jMax2;
        this.lastFrameEndNanos = jMax2 + frameCpuDuration;
        boolean zIsSlow = isSlow(frameCpuDuration, (long) (f9 / (refreshRate - 1.0f)));
        boolean z6 = zIsSlow && isFrozen(frameCpuDuration);
        java.util.Iterator<io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener> it = this.listenerMap.values().iterator();
        while (it.hasNext()) {
            it.next().onFrameMetricCollected(jMax2, this.lastFrameEndNanos, frameCpuDuration, jMax, zIsSlow, z6, refreshRate);
        }
    }

    private void setCurrentWindow(android.view.Window window) {
        java.lang.ref.WeakReference<android.view.Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != window) {
            this.currentWindow = new java.lang.ref.WeakReference<>(window);
            trackCurrentWindow();
        }
    }

    private void stopTrackingWindow(android.view.Window window) {
        if (this.trackedWindows.contains(window)) {
            if (this.buildInfoProvider.getSdkInfoVersion() >= 24) {
                try {
                    this.windowFrameMetricsManager.removeOnFrameMetricsAvailableListener(window, this.frameMetricsAvailableListener);
                } catch (java.lang.Exception e6) {
                    this.logger.log(io.sentry.SentryLevel.ERROR, "Failed to remove frameMetricsAvailableListener", e6);
                }
            }
            this.trackedWindows.remove(window);
        }
    }

    private void trackCurrentWindow() {
        java.lang.ref.WeakReference<android.view.Window> weakReference = this.currentWindow;
        android.view.Window window = weakReference != null ? weakReference.get() : null;
        if (window == null || !this.isAvailable || this.trackedWindows.contains(window) || this.listenerMap.isEmpty() || this.buildInfoProvider.getSdkInfoVersion() < 24 || this.handler == null) {
            return;
        }
        this.trackedWindows.add(window);
        this.windowFrameMetricsManager.addOnFrameMetricsAvailableListener(window, this.frameMetricsAvailableListener, this.handler);
    }

    public long getLastKnownFrameStartTimeNanos() {
        java.lang.reflect.Field field;
        android.view.Choreographer choreographer = this.choreographer;
        if (choreographer == null || (field = this.choreographerLastFrameTimeField) == null) {
            return -1L;
        }
        try {
            java.lang.Long l2 = (java.lang.Long) field.get(choreographer);
            if (l2 != null) {
                return l2.longValue();
            }
            return -1L;
        } catch (java.lang.IllegalAccessException unused) {
            return -1L;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        setCurrentWindow(activity.getWindow());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        stopTrackingWindow(activity.getWindow());
        java.lang.ref.WeakReference<android.view.Window> weakReference = this.currentWindow;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.currentWindow = null;
    }

    public java.lang.String startCollection(io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener frameMetricsCollectorListener) {
        if (!this.isAvailable) {
            return null;
        }
        java.lang.String strGenerateSentryId = io.sentry.SentryUUID.generateSentryId();
        this.listenerMap.put(strGenerateSentryId, frameMetricsCollectorListener);
        trackCurrentWindow();
        return strGenerateSentryId;
    }

    public void stopCollection(java.lang.String str) {
        if (this.isAvailable) {
            if (str != null) {
                this.listenerMap.remove(str);
            }
            java.lang.ref.WeakReference<android.view.Window> weakReference = this.currentWindow;
            android.view.Window window = weakReference != null ? weakReference.get() : null;
            if (window == null || !this.listenerMap.isEmpty()) {
                return;
            }
            stopTrackingWindow(window);
        }
    }

    public SentryFrameMetricsCollector(android.content.Context context, io.sentry.ILogger iLogger, io.sentry.android.core.BuildInfoProvider buildInfoProvider) {
        this(context, iLogger, buildInfoProvider, new io.sentry.android.core.internal.util.SentryFrameMetricsCollector.WindowFrameMetricsManager() { // from class: io.sentry.android.core.internal.util.SentryFrameMetricsCollector.2
        });
    }

    public SentryFrameMetricsCollector(android.content.Context context, io.sentry.SentryOptions sentryOptions, io.sentry.android.core.BuildInfoProvider buildInfoProvider, io.sentry.android.core.internal.util.SentryFrameMetricsCollector.WindowFrameMetricsManager windowFrameMetricsManager) {
        this(context, sentryOptions.getLogger(), buildInfoProvider, windowFrameMetricsManager);
    }

    public SentryFrameMetricsCollector(android.content.Context context, final io.sentry.ILogger iLogger, final io.sentry.android.core.BuildInfoProvider buildInfoProvider, io.sentry.android.core.internal.util.SentryFrameMetricsCollector.WindowFrameMetricsManager windowFrameMetricsManager) {
        this.trackedWindows = new java.util.concurrent.CopyOnWriteArraySet();
        this.listenerMap = new java.util.concurrent.ConcurrentHashMap();
        this.isAvailable = false;
        this.lastFrameStartNanos = 0L;
        this.lastFrameEndNanos = 0L;
        android.content.Context context2 = (android.content.Context) io.sentry.util.Objects.requireNonNull(io.sentry.android.core.ContextUtils.getApplicationContext(context), "The context is required");
        this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "Logger is required");
        this.buildInfoProvider = (io.sentry.android.core.BuildInfoProvider) io.sentry.util.Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        this.windowFrameMetricsManager = (io.sentry.android.core.internal.util.SentryFrameMetricsCollector.WindowFrameMetricsManager) io.sentry.util.Objects.requireNonNull(windowFrameMetricsManager, "WindowFrameMetricsManager is required");
        if ((context2 instanceof android.app.Application) && buildInfoProvider.getSdkInfoVersion() >= 24) {
            this.isAvailable = true;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new java.lang.Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.c
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
                    io.sentry.android.core.internal.util.SentryFrameMetricsCollector.lambda$new$0(iLogger, thread, th);
                }
            });
            handlerThread.start();
            this.handler = new android.os.Handler(handlerThread.getLooper());
            ((android.app.Application) context2).registerActivityLifecycleCallbacks(this);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new T7.d(this, iLogger, 16));
            try {
                java.lang.reflect.Field declaredField = android.view.Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.choreographerLastFrameTimeField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException e6) {
                iLogger.log(io.sentry.SentryLevel.ERROR, "Unable to get the frame timestamp from the choreographer: ", e6);
            }
            this.frameMetricsAvailableListener = new android.view.Window.OnFrameMetricsAvailableListener() { // from class: io.sentry.android.core.internal.util.d
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i3) {
                    this.f23440a.lambda$new$2(buildInfoProvider, window, frameMetrics, i3);
                }
            };
        }
    }
}
