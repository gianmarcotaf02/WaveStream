package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryAndroidOptions extends io.sentry.SentryOptions {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private io.sentry.android.core.SentryAndroidOptions.BeforeCaptureCallback beforeScreenshotCaptureCallback;
    private io.sentry.android.core.SentryAndroidOptions.BeforeCaptureCallback beforeViewHierarchyCaptureCallback;
    private io.sentry.android.core.internal.util.SentryFrameMetricsCollector frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;
    private io.sentry.android.core.IDebugImagesLoader debugImagesLoader = io.sentry.android.core.NoOpDebugImagesLoader.getInstance();
    private boolean collectAdditionalContext = true;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;
    private java.lang.String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;
    private io.sentry.android.core.NdkHandlerStrategy ndkHandlerStrategy = io.sentry.android.core.NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private boolean enableScopeSync = true;
    private boolean enableAutoTraceIdGeneration = true;
    private boolean reportHistoricalAnrs = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = true;

    public interface BeforeCaptureCallback {
        boolean execute(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint, boolean z6);
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/8.4.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private io.sentry.protocol.SdkVersion createSdkVersion() {
        io.sentry.protocol.SdkVersion sdkVersionUpdateSdkVersion = io.sentry.protocol.SdkVersion.updateSdkVersion(getSdkVersion(), io.sentry.android.core.BuildConfig.SENTRY_ANDROID_SDK_NAME, "8.4.0");
        sdkVersionUpdateSdkVersion.addPackage("maven:io.sentry:sentry-android-core", "8.4.0");
        return sdkVersionUpdateSdkVersion;
    }

    public void enableAllAutoBreadcrumbs(boolean z6) {
        this.enableActivityLifecycleBreadcrumbs = z6;
        this.enableAppComponentBreadcrumbs = z6;
        this.enableSystemEventBreadcrumbs = z6;
        this.enableAppLifecycleBreadcrumbs = z6;
        this.enableNetworkEventBreadcrumbs = z6;
        setEnableUserInteractionBreadcrumbs(z6);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public io.sentry.android.core.SentryAndroidOptions.BeforeCaptureCallback getBeforeScreenshotCaptureCallback() {
        return this.beforeScreenshotCaptureCallback;
    }

    public io.sentry.android.core.SentryAndroidOptions.BeforeCaptureCallback getBeforeViewHierarchyCaptureCallback() {
        return this.beforeViewHierarchyCaptureCallback;
    }

    public io.sentry.android.core.IDebugImagesLoader getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public io.sentry.android.core.internal.util.SentryFrameMetricsCollector getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public java.lang.String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean z6) {
        this.anrEnabled = z6;
    }

    public void setAnrReportInDebug(boolean z6) {
        this.anrReportInDebug = z6;
    }

    public void setAnrTimeoutIntervalMillis(long j) {
        this.anrTimeoutIntervalMillis = j;
    }

    public void setAttachAnrThreadDump(boolean z6) {
        this.attachAnrThreadDump = z6;
    }

    public void setAttachScreenshot(boolean z6) {
        this.attachScreenshot = z6;
    }

    public void setAttachViewHierarchy(boolean z6) {
        this.attachViewHierarchy = z6;
    }

    public void setBeforeScreenshotCaptureCallback(io.sentry.android.core.SentryAndroidOptions.BeforeCaptureCallback beforeCaptureCallback) {
        this.beforeScreenshotCaptureCallback = beforeCaptureCallback;
    }

    public void setBeforeViewHierarchyCaptureCallback(io.sentry.android.core.SentryAndroidOptions.BeforeCaptureCallback beforeCaptureCallback) {
        this.beforeViewHierarchyCaptureCallback = beforeCaptureCallback;
    }

    public void setCollectAdditionalContext(boolean z6) {
        this.collectAdditionalContext = z6;
    }

    public void setDebugImagesLoader(io.sentry.android.core.IDebugImagesLoader iDebugImagesLoader) {
        if (iDebugImagesLoader == null) {
            iDebugImagesLoader = io.sentry.android.core.NoOpDebugImagesLoader.getInstance();
        }
        this.debugImagesLoader = iDebugImagesLoader;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z6) {
        this.enableActivityLifecycleBreadcrumbs = z6;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z6) {
        this.enableActivityLifecycleTracingAutoFinish = z6;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z6) {
        this.enableAppComponentBreadcrumbs = z6;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z6) {
        this.enableAppLifecycleBreadcrumbs = z6;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z6) {
        this.enableAutoActivityLifecycleTracing = z6;
    }

    public void setEnableAutoTraceIdGeneration(boolean z6) {
        this.enableAutoTraceIdGeneration = z6;
    }

    public void setEnableFramesTracking(boolean z6) {
        this.enableFramesTracking = z6;
    }

    public void setEnableNdk(boolean z6) {
        this.enableNdk = z6;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z6) {
        this.enableNetworkEventBreadcrumbs = z6;
    }

    public void setEnablePerformanceV2(boolean z6) {
        this.enablePerformanceV2 = z6;
    }

    public void setEnableRootCheck(boolean z6) {
        this.enableRootCheck = z6;
    }

    public void setEnableScopeSync(boolean z6) {
        this.enableScopeSync = z6;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z6) {
        this.enableSystemEventBreadcrumbs = z6;
    }

    public void setFrameMetricsCollector(io.sentry.android.core.internal.util.SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this.frameMetricsCollector = sentryFrameMetricsCollector;
    }

    public void setNativeHandlerStrategy(io.sentry.android.core.NdkHandlerStrategy ndkHandlerStrategy) {
        this.ndkHandlerStrategy = ndkHandlerStrategy;
    }

    public void setNativeSdkName(java.lang.String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z6) {
        this.reportHistoricalAnrs = z6;
    }

    public void setStartupCrashFlushTimeoutMillis(long j) {
        this.startupCrashFlushTimeoutMillis = j;
    }
}
