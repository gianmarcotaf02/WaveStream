package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes4.dex */
public class AppStartMetrics extends io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter {
    private static volatile io.sentry.android.core.performance.AppStartMetrics instance;
    private boolean appLaunchedInForeground;
    private static long CLASS_LOADED_UPTIME_MS = android.os.SystemClock.uptimeMillis();
    public static final io.sentry.util.AutoClosableReentrantLock staticLock = new io.sentry.util.AutoClosableReentrantLock();
    private io.sentry.android.core.performance.AppStartMetrics.AppStartType appStartType = io.sentry.android.core.performance.AppStartMetrics.AppStartType.UNKNOWN;
    private io.sentry.ITransactionProfiler appStartProfiler = null;
    private io.sentry.TracesSamplingDecision appStartSamplingDecision = null;
    private io.sentry.SentryDate onCreateTime = null;
    private boolean appLaunchTooLong = false;
    private boolean isCallbackRegistered = false;
    private boolean shouldSendStartMeasurements = true;
    private final io.sentry.android.core.performance.TimeSpan appStartSpan = new io.sentry.android.core.performance.TimeSpan();
    private final io.sentry.android.core.performance.TimeSpan sdkInitTimeSpan = new io.sentry.android.core.performance.TimeSpan();
    private final io.sentry.android.core.performance.TimeSpan applicationOnCreate = new io.sentry.android.core.performance.TimeSpan();
    private final java.util.Map<android.content.ContentProvider, io.sentry.android.core.performance.TimeSpan> contentProviderOnCreates = new java.util.HashMap();
    private final java.util.List<io.sentry.android.core.performance.ActivityLifecycleTimeSpan> activityLifecycles = new java.util.ArrayList();

    public enum AppStartType {
        UNKNOWN,
        COLD,
        WARM
    }

    public AppStartMetrics() {
        this.appLaunchedInForeground = false;
        this.appLaunchedInForeground = io.sentry.android.core.ContextUtils.isForegroundImportance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: checkCreateTimeOnMain, reason: merged with bridge method [inline-methods] */
    public void lambda$registerApplicationForegroundCheck$0(android.app.Application application) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new io.sentry.android.core.performance.a(this, application, 0));
    }

    public static io.sentry.android.core.performance.AppStartMetrics getInstance() {
        if (instance == null) {
            io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (instance == null) {
                    instance = new io.sentry.android.core.performance.AppStartMetrics();
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (java.lang.Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkCreateTimeOnMain$1(android.app.Application application) {
        if (this.onCreateTime == null) {
            this.appLaunchedInForeground = false;
            io.sentry.ITransactionProfiler iTransactionProfiler = this.appStartProfiler;
            if (iTransactionProfiler != null && iTransactionProfiler.isRunning()) {
                this.appStartProfiler.close();
                this.appStartProfiler = null;
            }
        }
        application.unregisterActivityLifecycleCallbacks(instance);
    }

    public static void onApplicationCreate(android.app.Application application) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        io.sentry.android.core.performance.AppStartMetrics appStartMetrics = getInstance();
        if (appStartMetrics.applicationOnCreate.hasNotStarted()) {
            appStartMetrics.applicationOnCreate.setStartedAt(jUptimeMillis);
            appStartMetrics.registerApplicationForegroundCheck(application);
        }
    }

    public static void onApplicationPostCreate(android.app.Application application) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        io.sentry.android.core.performance.AppStartMetrics appStartMetrics = getInstance();
        if (appStartMetrics.applicationOnCreate.hasNotStopped()) {
            appStartMetrics.applicationOnCreate.setDescription(application.getClass().getName().concat(".onCreate"));
            appStartMetrics.applicationOnCreate.setStoppedAt(jUptimeMillis);
        }
    }

    public static void onContentProviderCreate(android.content.ContentProvider contentProvider) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        io.sentry.android.core.performance.TimeSpan timeSpan = new io.sentry.android.core.performance.TimeSpan();
        timeSpan.setStartedAt(jUptimeMillis);
        getInstance().contentProviderOnCreates.put(contentProvider, timeSpan);
    }

    public static void onContentProviderPostCreate(android.content.ContentProvider contentProvider) {
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        io.sentry.android.core.performance.TimeSpan timeSpan = getInstance().contentProviderOnCreates.get(contentProvider);
        if (timeSpan == null || !timeSpan.hasNotStopped()) {
            return;
        }
        timeSpan.setDescription(contentProvider.getClass().getName().concat(".onCreate"));
        timeSpan.setStoppedAt(jUptimeMillis);
    }

    public void addActivityLifecycleTimeSpans(io.sentry.android.core.performance.ActivityLifecycleTimeSpan activityLifecycleTimeSpan) {
        this.activityLifecycles.add(activityLifecycleTimeSpan);
    }

    public void clear() {
        this.appStartType = io.sentry.android.core.performance.AppStartMetrics.AppStartType.UNKNOWN;
        this.appStartSpan.reset();
        this.sdkInitTimeSpan.reset();
        this.applicationOnCreate.reset();
        this.contentProviderOnCreates.clear();
        this.activityLifecycles.clear();
        io.sentry.ITransactionProfiler iTransactionProfiler = this.appStartProfiler;
        if (iTransactionProfiler != null) {
            iTransactionProfiler.close();
        }
        this.appStartProfiler = null;
        this.appStartSamplingDecision = null;
        this.appLaunchTooLong = false;
        this.appLaunchedInForeground = false;
        this.onCreateTime = null;
        this.isCallbackRegistered = false;
        this.shouldSendStartMeasurements = true;
    }

    public io.sentry.android.core.performance.TimeSpan createProcessInitSpan() {
        io.sentry.android.core.performance.TimeSpan timeSpan = new io.sentry.android.core.performance.TimeSpan();
        timeSpan.setup("Process Initialization", this.appStartSpan.getStartTimestampMs(), this.appStartSpan.getStartUptimeMs(), CLASS_LOADED_UPTIME_MS);
        return timeSpan;
    }

    public java.util.List<io.sentry.android.core.performance.ActivityLifecycleTimeSpan> getActivityLifecycleTimeSpans() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.activityLifecycles);
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    public io.sentry.ITransactionProfiler getAppStartProfiler() {
        return this.appStartProfiler;
    }

    public io.sentry.TracesSamplingDecision getAppStartSamplingDecision() {
        return this.appStartSamplingDecision;
    }

    public io.sentry.android.core.performance.TimeSpan getAppStartTimeSpan() {
        return this.appStartSpan;
    }

    public io.sentry.android.core.performance.TimeSpan getAppStartTimeSpanWithFallback(io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions) {
        if (!isColdStartValid()) {
            return new io.sentry.android.core.performance.TimeSpan();
        }
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            io.sentry.android.core.performance.TimeSpan appStartTimeSpan = getAppStartTimeSpan();
            if (appStartTimeSpan.hasStarted()) {
                return appStartTimeSpan;
            }
        }
        return getSdkInitTimeSpan();
    }

    public io.sentry.android.core.performance.AppStartMetrics.AppStartType getAppStartType() {
        return this.appStartType;
    }

    public io.sentry.android.core.performance.TimeSpan getApplicationOnCreateTimeSpan() {
        return this.applicationOnCreate;
    }

    public long getClassLoadedUptimeMs() {
        return CLASS_LOADED_UPTIME_MS;
    }

    public java.util.List<io.sentry.android.core.performance.TimeSpan> getContentProviderOnCreateTimeSpans() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.contentProviderOnCreates.values());
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    public io.sentry.android.core.performance.TimeSpan getSdkInitTimeSpan() {
        return this.sdkInitTimeSpan;
    }

    public boolean isAppLaunchedInForeground() {
        return this.appLaunchedInForeground;
    }

    public boolean isColdStartValid() {
        return this.appLaunchedInForeground && !this.appLaunchTooLong;
    }

    @Override // io.sentry.android.core.performance.ActivityLifecycleCallbacksAdapter, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.appLaunchedInForeground && this.onCreateTime == null) {
            this.onCreateTime = new io.sentry.SentryNanotimeDate();
            if ((this.appStartSpan.hasStopped() ? this.appStartSpan.getProjectedStopTimestampMs() : java.lang.System.currentTimeMillis()) - this.appStartSpan.getStartTimestampMs() > java.util.concurrent.TimeUnit.MINUTES.toMillis(1L)) {
                this.appLaunchTooLong = true;
            }
        }
    }

    public void onAppStartSpansSent() {
        this.shouldSendStartMeasurements = false;
        this.contentProviderOnCreates.clear();
        this.activityLifecycles.clear();
    }

    public void registerApplicationForegroundCheck(android.app.Application application) {
        if (this.isCallbackRegistered) {
            return;
        }
        boolean z6 = true;
        this.isCallbackRegistered = true;
        if (!this.appLaunchedInForeground && !io.sentry.android.core.ContextUtils.isForegroundImportance()) {
            z6 = false;
        }
        this.appLaunchedInForeground = z6;
        application.registerActivityLifecycleCallbacks(instance);
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new io.sentry.android.core.performance.a(this, application, 1));
    }

    public void restartAppStart(long j) {
        this.shouldSendStartMeasurements = true;
        this.appLaunchTooLong = false;
        this.appLaunchedInForeground = true;
        this.appStartSpan.reset();
        this.appStartSpan.start();
        this.appStartSpan.setStartedAt(j);
        CLASS_LOADED_UPTIME_MS = this.appStartSpan.getStartUptimeMs();
    }

    public void setAppLaunchedInForeground(boolean z6) {
        this.appLaunchedInForeground = z6;
    }

    public void setAppStartProfiler(io.sentry.ITransactionProfiler iTransactionProfiler) {
        this.appStartProfiler = iTransactionProfiler;
    }

    public void setAppStartSamplingDecision(io.sentry.TracesSamplingDecision tracesSamplingDecision) {
        this.appStartSamplingDecision = tracesSamplingDecision;
    }

    public void setAppStartType(io.sentry.android.core.performance.AppStartMetrics.AppStartType appStartType) {
        this.appStartType = appStartType;
    }

    public void setClassLoadedUptimeMs(long j) {
        CLASS_LOADED_UPTIME_MS = j;
    }

    public boolean shouldSendStartMeasurements() {
        return this.shouldSendStartMeasurements;
    }
}
