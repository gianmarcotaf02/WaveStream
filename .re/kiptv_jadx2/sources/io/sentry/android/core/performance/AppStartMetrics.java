package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.content.ContentProvider;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransactionProfiler;
import io.sentry.SentryDate;
import io.sentry.SentryNanotimeDate;
import io.sentry.TracesSamplingDecision;
import io.sentry.android.core.ContextUtils;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.AutoClosableReentrantLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AppStartMetrics extends ActivityLifecycleCallbacksAdapter {
    private static volatile AppStartMetrics instance;
    private boolean appLaunchedInForeground;
    private static long CLASS_LOADED_UPTIME_MS = SystemClock.uptimeMillis();
    public static final AutoClosableReentrantLock staticLock = new AutoClosableReentrantLock();
    private AppStartType appStartType = AppStartType.UNKNOWN;
    private ITransactionProfiler appStartProfiler = null;
    private TracesSamplingDecision appStartSamplingDecision = null;
    private SentryDate onCreateTime = null;
    private boolean appLaunchTooLong = false;
    private boolean isCallbackRegistered = false;
    private boolean shouldSendStartMeasurements = true;
    private final TimeSpan appStartSpan = new TimeSpan();
    private final TimeSpan sdkInitTimeSpan = new TimeSpan();
    private final TimeSpan applicationOnCreate = new TimeSpan();
    private final Map<ContentProvider, TimeSpan> contentProviderOnCreates = new HashMap();
    private final List<ActivityLifecycleTimeSpan> activityLifecycles = new ArrayList();

    public enum AppStartType {
        UNKNOWN,
        COLD,
        WARM
    }

    public AppStartMetrics() {
        this.appLaunchedInForeground = false;
        this.appLaunchedInForeground = ContextUtils.isForegroundImportance();
    }

    public void lambda$registerApplicationForegroundCheck$0(Application application) {
        new Handler(Looper.getMainLooper()).post(new a(this, application, 0));
    }

    public static AppStartMetrics getInstance() {
        if (instance == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = staticLock.acquire();
            try {
                if (instance == null) {
                    instance = new AppStartMetrics();
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return instance;
    }

    public void lambda$checkCreateTimeOnMain$1(Application application) {
        if (this.onCreateTime == null) {
            this.appLaunchedInForeground = false;
            ITransactionProfiler iTransactionProfiler = this.appStartProfiler;
            if (iTransactionProfiler != null && iTransactionProfiler.isRunning()) {
                this.appStartProfiler.close();
                this.appStartProfiler = null;
            }
        }
        application.unregisterActivityLifecycleCallbacks(instance);
    }

    public static void onApplicationCreate(Application application) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AppStartMetrics appStartMetrics = getInstance();
        if (appStartMetrics.applicationOnCreate.hasNotStarted()) {
            appStartMetrics.applicationOnCreate.setStartedAt(jUptimeMillis);
            appStartMetrics.registerApplicationForegroundCheck(application);
        }
    }

    public static void onApplicationPostCreate(Application application) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        AppStartMetrics appStartMetrics = getInstance();
        if (appStartMetrics.applicationOnCreate.hasNotStopped()) {
            appStartMetrics.applicationOnCreate.setDescription(application.getClass().getName().concat(".onCreate"));
            appStartMetrics.applicationOnCreate.setStoppedAt(jUptimeMillis);
        }
    }

    public static void onContentProviderCreate(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        TimeSpan timeSpan = new TimeSpan();
        timeSpan.setStartedAt(jUptimeMillis);
        getInstance().contentProviderOnCreates.put(contentProvider, timeSpan);
    }

    public static void onContentProviderPostCreate(ContentProvider contentProvider) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        TimeSpan timeSpan = getInstance().contentProviderOnCreates.get(contentProvider);
        if (timeSpan == null || !timeSpan.hasNotStopped()) {
            return;
        }
        timeSpan.setDescription(contentProvider.getClass().getName().concat(".onCreate"));
        timeSpan.setStoppedAt(jUptimeMillis);
    }

    public void addActivityLifecycleTimeSpans(ActivityLifecycleTimeSpan activityLifecycleTimeSpan) {
        this.activityLifecycles.add(activityLifecycleTimeSpan);
    }

    public void clear() {
        this.appStartType = AppStartType.UNKNOWN;
        this.appStartSpan.reset();
        this.sdkInitTimeSpan.reset();
        this.applicationOnCreate.reset();
        this.contentProviderOnCreates.clear();
        this.activityLifecycles.clear();
        ITransactionProfiler iTransactionProfiler = this.appStartProfiler;
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

    public TimeSpan createProcessInitSpan() {
        TimeSpan timeSpan = new TimeSpan();
        timeSpan.setup("Process Initialization", this.appStartSpan.getStartTimestampMs(), this.appStartSpan.getStartUptimeMs(), CLASS_LOADED_UPTIME_MS);
        return timeSpan;
    }

    public List<ActivityLifecycleTimeSpan> getActivityLifecycleTimeSpans() {
        ArrayList arrayList = new ArrayList(this.activityLifecycles);
        Collections.sort(arrayList);
        return arrayList;
    }

    public ITransactionProfiler getAppStartProfiler() {
        return this.appStartProfiler;
    }

    public TracesSamplingDecision getAppStartSamplingDecision() {
        return this.appStartSamplingDecision;
    }

    public TimeSpan getAppStartTimeSpan() {
        return this.appStartSpan;
    }

    public TimeSpan getAppStartTimeSpanWithFallback(SentryAndroidOptions sentryAndroidOptions) {
        if (!isColdStartValid()) {
            return new TimeSpan();
        }
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            TimeSpan appStartTimeSpan = getAppStartTimeSpan();
            if (appStartTimeSpan.hasStarted()) {
                return appStartTimeSpan;
            }
        }
        return getSdkInitTimeSpan();
    }

    public AppStartType getAppStartType() {
        return this.appStartType;
    }

    public TimeSpan getApplicationOnCreateTimeSpan() {
        return this.applicationOnCreate;
    }

    public long getClassLoadedUptimeMs() {
        return CLASS_LOADED_UPTIME_MS;
    }

    public List<TimeSpan> getContentProviderOnCreateTimeSpans() {
        ArrayList arrayList = new ArrayList(this.contentProviderOnCreates.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public TimeSpan getSdkInitTimeSpan() {
        return this.sdkInitTimeSpan;
    }

    public boolean isAppLaunchedInForeground() {
        return this.appLaunchedInForeground;
    }

    public boolean isColdStartValid() {
        return this.appLaunchedInForeground && !this.appLaunchTooLong;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.appLaunchedInForeground && this.onCreateTime == null) {
            this.onCreateTime = new SentryNanotimeDate();
            if ((this.appStartSpan.hasStopped() ? this.appStartSpan.getProjectedStopTimestampMs() : System.currentTimeMillis()) - this.appStartSpan.getStartTimestampMs() > TimeUnit.MINUTES.toMillis(1L)) {
                this.appLaunchTooLong = true;
            }
        }
    }

    public void onAppStartSpansSent() {
        this.shouldSendStartMeasurements = false;
        this.contentProviderOnCreates.clear();
        this.activityLifecycles.clear();
    }

    public void registerApplicationForegroundCheck(Application application) {
        if (this.isCallbackRegistered) {
            return;
        }
        boolean z6 = true;
        this.isCallbackRegistered = true;
        if (!this.appLaunchedInForeground && !ContextUtils.isForegroundImportance()) {
            z6 = false;
        }
        this.appLaunchedInForeground = z6;
        application.registerActivityLifecycleCallbacks(instance);
        new Handler(Looper.getMainLooper()).post(new a(this, application, 1));
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

    public void setAppStartProfiler(ITransactionProfiler iTransactionProfiler) {
        this.appStartProfiler = iTransactionProfiler;
    }

    public void setAppStartSamplingDecision(TracesSamplingDecision tracesSamplingDecision) {
        this.appStartSamplingDecision = tracesSamplingDecision;
    }

    public void setAppStartType(AppStartType appStartType) {
        this.appStartType = appStartType;
    }

    public void setClassLoadedUptimeMs(long j) {
        CLASS_LOADED_UPTIME_MS = j;
    }

    public boolean shouldSendStartMeasurements() {
        return this.shouldSendStartMeasurements;
    }
}
