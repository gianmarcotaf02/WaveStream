package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public class SentryOptions {
    static final io.sentry.SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = io.sentry.SentryLevel.DEBUG;
    private static final java.lang.String DEFAULT_ENVIRONMENT = "production";
    public static final java.lang.String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.IBackpressureMonitor backpressureMonitor;
    private io.sentry.SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumb;
    private io.sentry.SentryOptions.BeforeEnvelopeCallback beforeEnvelopeCallback;
    private io.sentry.SentryOptions.BeforeSendCallback beforeSend;
    private io.sentry.SentryOptions.BeforeSendReplayCallback beforeSendReplay;
    private io.sentry.SentryOptions.BeforeSendTransactionCallback beforeSendTransaction;
    private final java.util.Set<java.lang.String> bundleIds;
    private java.lang.String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.IClientReportRecorder clientReportRecorder;
    private io.sentry.IConnectionStatusProvider connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final java.util.List<java.lang.String> contextTags;
    private io.sentry.SentryOptions.Cron cron;
    private final io.sentry.util.LazyEvaluator<io.sentry.SentryDateProvider> dateProvider;
    private boolean debug;
    private io.sentry.internal.debugmeta.IDebugMetaLoader debugMetaLoader;
    private io.sentry.ScopeType defaultScopeType;
    private final java.util.List<java.lang.String> defaultTracePropagationTargets;
    private io.sentry.SentryLevel diagnosticLevel;
    private java.lang.String dist;
    private java.lang.String distinctId;
    private java.lang.String dsn;
    private java.lang.String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.IEnvelopeCache envelopeDiskCache;
    private final io.sentry.util.LazyEvaluator<io.sentry.IEnvelopeReader> envelopeReader;
    private java.lang.String environment;
    private final java.util.List<io.sentry.EventProcessor> eventProcessors;
    private io.sentry.ISentryExecutorService executorService;
    private final io.sentry.ExperimentalOptions experimental;
    private long flushTimeoutMillis;
    private boolean forceInit;
    private io.sentry.FullyDisplayedReporter fullyDisplayedReporter;
    private final java.util.List<io.sentry.internal.gestures.GestureTargetLocator> gestureTargetLocators;
    private java.lang.Boolean globalHubMode;
    private java.lang.Long idleTimeout;
    private java.util.List<io.sentry.FilterString> ignoredCheckIns;
    private java.util.List<io.sentry.FilterString> ignoredErrors;
    private final java.util.Set<java.lang.Class<? extends java.lang.Throwable>> ignoredExceptionsForType;
    private java.util.List<io.sentry.FilterString> ignoredSpanOrigins;
    private java.util.List<io.sentry.FilterString> ignoredTransactions;
    private final java.util.List<java.lang.String> inAppExcludes;
    private final java.util.List<java.lang.String> inAppIncludes;
    private io.sentry.InitPriority initPriority;
    private io.sentry.Instrumenter instrumenter;
    private final java.util.List<io.sentry.Integration> integrations;
    private volatile io.sentry.TracesSampler internalTracesSampler;
    protected final io.sentry.util.AutoClosableReentrantLock lock;
    private io.sentry.ILogger logger;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private io.sentry.SentryOptions.RequestSize maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private io.sentry.internal.modules.IModulesLoader modulesLoader;
    private final java.util.List<io.sentry.IScopeObserver> observers;
    private io.sentry.SentryOpenTelemetryMode openTelemetryMode;
    private final java.util.List<io.sentry.IOptionsObserver> optionsObservers;
    private final io.sentry.util.LazyEvaluator<io.sentry.Dsn> parsedDsn;
    private final java.util.List<io.sentry.IPerformanceCollector> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private java.lang.Double profilesSampleRate;
    private io.sentry.SentryOptions.ProfilesSamplerCallback profilesSampler;
    private int profilingTracesHz;
    private java.lang.String proguardUuid;
    private io.sentry.SentryOptions.Proxy proxy;
    private int readTimeoutMillis;
    private java.lang.String release;
    private io.sentry.ReplayController replayController;
    private java.lang.Double sampleRate;
    private io.sentry.protocol.SdkVersion sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private java.lang.String sentryClientName;
    private final io.sentry.util.LazyEvaluator<io.sentry.ISerializer> serializer;
    private java.lang.String serverName;
    private long sessionFlushTimeoutMillis;
    private io.sentry.SentryReplayOptions sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private io.sentry.ISpanFactory spanFactory;
    private java.lang.String spotlightConnectionUrl;
    private javax.net.ssl.SSLSocketFactory sslSocketFactory;
    private final java.util.Map<java.lang.String, java.lang.String> tags;
    private io.sentry.util.thread.IThreadChecker threadChecker;
    private boolean traceOptionsRequests;
    private java.util.List<java.lang.String> tracePropagationTargets;
    private boolean traceSampling;
    private java.lang.Double tracesSampleRate;
    private io.sentry.SentryOptions.TracesSamplerCallback tracesSampler;
    private io.sentry.TransactionPerformanceCollector transactionPerformanceCollector;
    private io.sentry.ITransactionProfiler transactionProfiler;
    private io.sentry.ITransportFactory transportFactory;
    private io.sentry.transport.ITransportGate transportGate;
    private final java.util.List<io.sentry.internal.viewhierarchy.ViewHierarchyExporter> viewHierarchyExporters;

    public interface BeforeBreadcrumbCallback {
        io.sentry.Breadcrumb execute(io.sentry.Breadcrumb breadcrumb, io.sentry.Hint hint);
    }

    public interface BeforeEmitMetricCallback {
        boolean execute(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);
    }

    public interface BeforeEnvelopeCallback {
        void execute(io.sentry.SentryEnvelope sentryEnvelope, io.sentry.Hint hint);
    }

    public interface BeforeSendCallback {
        io.sentry.SentryEvent execute(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint);
    }

    public interface BeforeSendReplayCallback {
        io.sentry.SentryReplayEvent execute(io.sentry.SentryReplayEvent sentryReplayEvent, io.sentry.Hint hint);
    }

    public interface BeforeSendTransactionCallback {
        io.sentry.protocol.SentryTransaction execute(io.sentry.protocol.SentryTransaction sentryTransaction, io.sentry.Hint hint);
    }

    public static final class Cron {
        private java.lang.Long defaultCheckinMargin;
        private java.lang.Long defaultFailureIssueThreshold;
        private java.lang.Long defaultMaxRuntime;
        private java.lang.Long defaultRecoveryThreshold;
        private java.lang.String defaultTimezone;

        public java.lang.Long getDefaultCheckinMargin() {
            return this.defaultCheckinMargin;
        }

        public java.lang.Long getDefaultFailureIssueThreshold() {
            return this.defaultFailureIssueThreshold;
        }

        public java.lang.Long getDefaultMaxRuntime() {
            return this.defaultMaxRuntime;
        }

        public java.lang.Long getDefaultRecoveryThreshold() {
            return this.defaultRecoveryThreshold;
        }

        public java.lang.String getDefaultTimezone() {
            return this.defaultTimezone;
        }

        public void setDefaultCheckinMargin(java.lang.Long l2) {
            this.defaultCheckinMargin = l2;
        }

        public void setDefaultFailureIssueThreshold(java.lang.Long l2) {
            this.defaultFailureIssueThreshold = l2;
        }

        public void setDefaultMaxRuntime(java.lang.Long l2) {
            this.defaultMaxRuntime = l2;
        }

        public void setDefaultRecoveryThreshold(java.lang.Long l2) {
            this.defaultRecoveryThreshold = l2;
        }

        public void setDefaultTimezone(java.lang.String str) {
            this.defaultTimezone = str;
        }
    }

    public interface ProfilesSamplerCallback {
        java.lang.Double sample(io.sentry.SamplingContext samplingContext);
    }

    public static final class Proxy {
        private java.lang.String host;
        private java.lang.String pass;
        private java.lang.String port;
        private java.net.Proxy.Type type;
        private java.lang.String user;

        public Proxy() {
            this(null, null, null, null, null);
        }

        public java.lang.String getHost() {
            return this.host;
        }

        public java.lang.String getPass() {
            return this.pass;
        }

        public java.lang.String getPort() {
            return this.port;
        }

        public java.net.Proxy.Type getType() {
            return this.type;
        }

        public java.lang.String getUser() {
            return this.user;
        }

        public void setHost(java.lang.String str) {
            this.host = str;
        }

        public void setPass(java.lang.String str) {
            this.pass = str;
        }

        public void setPort(java.lang.String str) {
            this.port = str;
        }

        public void setType(java.net.Proxy.Type type) {
            this.type = type;
        }

        public void setUser(java.lang.String str) {
            this.user = str;
        }

        public Proxy(java.lang.String str, java.lang.String str2) {
            this(str, str2, null, null, null);
        }

        public Proxy(java.lang.String str, java.lang.String str2, java.net.Proxy.Type type) {
            this(str, str2, type, null, null);
        }

        public Proxy(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this(str, str2, null, str3, str4);
        }

        public Proxy(java.lang.String str, java.lang.String str2, java.net.Proxy.Type type, java.lang.String str3, java.lang.String str4) {
            this.host = str;
            this.port = str2;
            this.type = type;
            this.user = str3;
            this.pass = str4;
        }
    }

    public enum RequestSize {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface TracesSamplerCallback {
        java.lang.Double sample(io.sentry.SamplingContext samplingContext);
    }

    public SentryOptions() {
        this(false);
    }

    private void addPackageInfo() {
        io.sentry.SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry", "8.4.0");
    }

    private io.sentry.protocol.SdkVersion createSdkVersion() {
        io.sentry.protocol.SdkVersion sdkVersion = new io.sentry.protocol.SdkVersion(io.sentry.BuildConfig.SENTRY_JAVA_SDK_NAME, "8.4.0");
        sdkVersion.setVersion("8.4.0");
        return sdkVersion;
    }

    public static io.sentry.SentryOptions empty() {
        return new io.sentry.SentryOptions(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ io.sentry.Dsn lambda$new$0() {
        return new io.sentry.Dsn(this.dsn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ io.sentry.ISerializer lambda$new$1() {
        return new io.sentry.JsonSerializer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ io.sentry.IEnvelopeReader lambda$new$2() {
        return new io.sentry.EnvelopeReader(this.serializer.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.sentry.SentryDateProvider lambda$new$3() {
        return new io.sentry.SentryAutoDateProvider();
    }

    public void addBundleId(java.lang.String str) {
        if (str != null) {
            java.lang.String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(java.lang.String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(io.sentry.EventProcessor eventProcessor) {
        this.eventProcessors.add(eventProcessor);
    }

    public void addIgnoredCheckIn(java.lang.String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new java.util.ArrayList();
        }
        this.ignoredCheckIns.add(new io.sentry.FilterString(str));
    }

    public void addIgnoredError(java.lang.String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new java.util.ArrayList();
        }
        this.ignoredErrors.add(new io.sentry.FilterString(str));
    }

    public void addIgnoredExceptionForType(java.lang.Class<? extends java.lang.Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(java.lang.String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new java.util.ArrayList();
        }
        this.ignoredSpanOrigins.add(new io.sentry.FilterString(str));
    }

    public void addIgnoredTransaction(java.lang.String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new java.util.ArrayList();
        }
        this.ignoredTransactions.add(new io.sentry.FilterString(str));
    }

    public void addInAppExclude(java.lang.String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(java.lang.String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(io.sentry.Integration integration) {
        this.integrations.add(integration);
    }

    public void addOptionsObserver(io.sentry.IOptionsObserver iOptionsObserver) {
        this.optionsObservers.add(iOptionsObserver);
    }

    public void addPerformanceCollector(io.sentry.IPerformanceCollector iPerformanceCollector) {
        this.performanceCollectors.add(iPerformanceCollector);
    }

    public void addScopeObserver(io.sentry.IScopeObserver iScopeObserver) {
        this.observers.add(iScopeObserver);
    }

    public boolean containsIgnoredExceptionForType(java.lang.Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public io.sentry.backpressure.IBackpressureMonitor getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public io.sentry.SentryOptions.BeforeBreadcrumbCallback getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public io.sentry.SentryOptions.BeforeEnvelopeCallback getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public io.sentry.SentryOptions.BeforeSendCallback getBeforeSend() {
        return this.beforeSend;
    }

    public io.sentry.SentryOptions.BeforeSendReplayCallback getBeforeSendReplay() {
        return this.beforeSendReplay;
    }

    public io.sentry.SentryOptions.BeforeSendTransactionCallback getBeforeSendTransaction() {
        return this.beforeSendTransaction;
    }

    public java.util.Set<java.lang.String> getBundleIds() {
        return this.bundleIds;
    }

    public java.lang.String getCacheDirPath() {
        java.lang.String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new java.io.File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public java.lang.String getCacheDirPathWithoutDsn() {
        java.lang.String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.IClientReportRecorder getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public io.sentry.IConnectionStatusProvider getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public java.util.List<java.lang.String> getContextTags() {
        return this.contextTags;
    }

    public io.sentry.SentryOptions.Cron getCron() {
        return this.cron;
    }

    public io.sentry.SentryDateProvider getDateProvider() {
        return this.dateProvider.getValue();
    }

    public io.sentry.internal.debugmeta.IDebugMetaLoader getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public io.sentry.ScopeType getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public io.sentry.SentryLevel getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public java.lang.String getDist() {
        return this.dist;
    }

    public java.lang.String getDistinctId() {
        return this.distinctId;
    }

    public java.lang.String getDsn() {
        return this.dsn;
    }

    public io.sentry.cache.IEnvelopeCache getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public io.sentry.IEnvelopeReader getEnvelopeReader() {
        return this.envelopeReader.getValue();
    }

    public java.lang.String getEnvironment() {
        java.lang.String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public java.util.List<io.sentry.EventProcessor> getEventProcessors() {
        return this.eventProcessors;
    }

    public io.sentry.ISentryExecutorService getExecutorService() {
        return this.executorService;
    }

    public io.sentry.ExperimentalOptions getExperimental() {
        return this.experimental;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public io.sentry.FullyDisplayedReporter getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public java.util.List<io.sentry.internal.gestures.GestureTargetLocator> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public java.lang.Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public java.util.List<io.sentry.FilterString> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public java.util.List<io.sentry.FilterString> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public java.util.Set<java.lang.Class<? extends java.lang.Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public java.util.List<io.sentry.FilterString> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public java.util.List<io.sentry.FilterString> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public java.util.List<java.lang.String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public java.util.List<java.lang.String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public io.sentry.InitPriority getInitPriority() {
        return this.initPriority;
    }

    public io.sentry.Instrumenter getInstrumenter() {
        return this.instrumenter;
    }

    public java.util.List<io.sentry.Integration> getIntegrations() {
        return this.integrations;
    }

    public io.sentry.TracesSampler getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new io.sentry.TracesSampler(this);
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
        return this.internalTracesSampler;
    }

    public io.sentry.ILogger getLogger() {
        return this.logger;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public io.sentry.SentryOptions.RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public io.sentry.internal.modules.IModulesLoader getModulesLoader() {
        return this.modulesLoader;
    }

    public io.sentry.SentryOpenTelemetryMode getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public java.util.List<io.sentry.IOptionsObserver> getOptionsObservers() {
        return this.optionsObservers;
    }

    public java.lang.String getOutboxPath() {
        java.lang.String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new java.io.File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public java.util.List<io.sentry.IPerformanceCollector> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public java.lang.Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public io.sentry.SentryOptions.ProfilesSamplerCallback getProfilesSampler() {
        return this.profilesSampler;
    }

    public java.lang.String getProfilingTracesDirPath() {
        java.lang.String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new java.io.File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public java.lang.String getProguardUuid() {
        return this.proguardUuid;
    }

    public io.sentry.SentryOptions.Proxy getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public java.lang.String getRelease() {
        return this.release;
    }

    public io.sentry.ReplayController getReplayController() {
        return this.replayController;
    }

    public java.lang.Double getSampleRate() {
        return this.sampleRate;
    }

    public java.util.List<io.sentry.IScopeObserver> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public java.lang.String getSentryClientName() {
        return this.sentryClientName;
    }

    public io.sentry.ISerializer getSerializer() {
        return this.serializer.getValue();
    }

    public java.lang.String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public io.sentry.SentryReplayOptions getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public io.sentry.ISpanFactory getSpanFactory() {
        return this.spanFactory;
    }

    public java.lang.String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public javax.net.ssl.SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public java.util.Map<java.lang.String, java.lang.String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.IThreadChecker getThreadChecker() {
        return this.threadChecker;
    }

    public java.util.List<java.lang.String> getTracePropagationTargets() {
        java.util.List<java.lang.String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public java.lang.Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public io.sentry.SentryOptions.TracesSamplerCallback getTracesSampler() {
        return this.tracesSampler;
    }

    public io.sentry.TransactionPerformanceCollector getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public io.sentry.ITransactionProfiler getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public io.sentry.ITransportFactory getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.ITransportGate getTransportGate() {
        return this.transportGate;
    }

    public final java.util.List<io.sentry.internal.viewhierarchy.ViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return isProfilingEnabled() && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public java.lang.Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        return (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) || getProfilesSampler() != null;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        return (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(io.sentry.ExternalOptions externalOptions) {
        if (externalOptions.getDsn() != null) {
            setDsn(externalOptions.getDsn());
        }
        if (externalOptions.getEnvironment() != null) {
            setEnvironment(externalOptions.getEnvironment());
        }
        if (externalOptions.getRelease() != null) {
            setRelease(externalOptions.getRelease());
        }
        if (externalOptions.getDist() != null) {
            setDist(externalOptions.getDist());
        }
        if (externalOptions.getServerName() != null) {
            setServerName(externalOptions.getServerName());
        }
        if (externalOptions.getProxy() != null) {
            setProxy(externalOptions.getProxy());
        }
        if (externalOptions.getEnableUncaughtExceptionHandler() != null) {
            setEnableUncaughtExceptionHandler(externalOptions.getEnableUncaughtExceptionHandler().booleanValue());
        }
        if (externalOptions.getPrintUncaughtStackTrace() != null) {
            setPrintUncaughtStackTrace(externalOptions.getPrintUncaughtStackTrace().booleanValue());
        }
        if (externalOptions.getTracesSampleRate() != null) {
            setTracesSampleRate(externalOptions.getTracesSampleRate());
        }
        if (externalOptions.getProfilesSampleRate() != null) {
            setProfilesSampleRate(externalOptions.getProfilesSampleRate());
        }
        if (externalOptions.getDebug() != null) {
            setDebug(externalOptions.getDebug().booleanValue());
        }
        if (externalOptions.getEnableDeduplication() != null) {
            setEnableDeduplication(externalOptions.getEnableDeduplication().booleanValue());
        }
        if (externalOptions.getSendClientReports() != null) {
            setSendClientReports(externalOptions.getSendClientReports().booleanValue());
        }
        if (externalOptions.isForceInit() != null) {
            setForceInit(externalOptions.isForceInit().booleanValue());
        }
        for (java.util.Map.Entry entry : new java.util.HashMap(externalOptions.getTags()).entrySet()) {
            this.tags.put((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        java.util.Iterator it = new java.util.ArrayList(externalOptions.getInAppIncludes()).iterator();
        while (it.hasNext()) {
            addInAppInclude((java.lang.String) it.next());
        }
        java.util.Iterator it2 = new java.util.ArrayList(externalOptions.getInAppExcludes()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((java.lang.String) it2.next());
        }
        java.util.Iterator it3 = new java.util.HashSet(externalOptions.getIgnoredExceptionsForType()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((java.lang.Class) it3.next());
        }
        if (externalOptions.getTracePropagationTargets() != null) {
            setTracePropagationTargets(new java.util.ArrayList(externalOptions.getTracePropagationTargets()));
        }
        java.util.Iterator it4 = new java.util.ArrayList(externalOptions.getContextTags()).iterator();
        while (it4.hasNext()) {
            addContextTag((java.lang.String) it4.next());
        }
        if (externalOptions.getProguardUuid() != null) {
            setProguardUuid(externalOptions.getProguardUuid());
        }
        if (externalOptions.getIdleTimeout() != null) {
            setIdleTimeout(externalOptions.getIdleTimeout());
        }
        java.util.Iterator<java.lang.String> it5 = externalOptions.getBundleIds().iterator();
        while (it5.hasNext()) {
            addBundleId(it5.next());
        }
        if (externalOptions.isEnabled() != null) {
            setEnabled(externalOptions.isEnabled().booleanValue());
        }
        if (externalOptions.isEnablePrettySerializationOutput() != null) {
            setEnablePrettySerializationOutput(externalOptions.isEnablePrettySerializationOutput().booleanValue());
        }
        if (externalOptions.isSendModules() != null) {
            setSendModules(externalOptions.isSendModules().booleanValue());
        }
        if (externalOptions.getIgnoredCheckIns() != null) {
            setIgnoredCheckIns(new java.util.ArrayList(externalOptions.getIgnoredCheckIns()));
        }
        if (externalOptions.getIgnoredTransactions() != null) {
            setIgnoredTransactions(new java.util.ArrayList(externalOptions.getIgnoredTransactions()));
        }
        if (externalOptions.getIgnoredErrors() != null) {
            setIgnoredErrors(new java.util.ArrayList(externalOptions.getIgnoredErrors()));
        }
        if (externalOptions.isEnableBackpressureHandling() != null) {
            setEnableBackpressureHandling(externalOptions.isEnableBackpressureHandling().booleanValue());
        }
        if (externalOptions.getMaxRequestBodySize() != null) {
            setMaxRequestBodySize(externalOptions.getMaxRequestBodySize());
        }
        if (externalOptions.isSendDefaultPii() != null) {
            setSendDefaultPii(externalOptions.isSendDefaultPii().booleanValue());
        }
        if (externalOptions.isCaptureOpenTelemetryEvents() != null) {
            setCaptureOpenTelemetryEvents(externalOptions.isCaptureOpenTelemetryEvents().booleanValue());
        }
        if (externalOptions.isEnableSpotlight() != null) {
            setEnableSpotlight(externalOptions.isEnableSpotlight().booleanValue());
        }
        if (externalOptions.getSpotlightConnectionUrl() != null) {
            setSpotlightConnectionUrl(externalOptions.getSpotlightConnectionUrl());
        }
        if (externalOptions.isGlobalHubMode() != null) {
            setGlobalHubMode(externalOptions.isGlobalHubMode());
        }
        if (externalOptions.getCron() != null) {
            if (getCron() == null) {
                setCron(externalOptions.getCron());
                return;
            }
            if (externalOptions.getCron().getDefaultCheckinMargin() != null) {
                getCron().setDefaultCheckinMargin(externalOptions.getCron().getDefaultCheckinMargin());
            }
            if (externalOptions.getCron().getDefaultMaxRuntime() != null) {
                getCron().setDefaultMaxRuntime(externalOptions.getCron().getDefaultMaxRuntime());
            }
            if (externalOptions.getCron().getDefaultTimezone() != null) {
                getCron().setDefaultTimezone(externalOptions.getCron().getDefaultTimezone());
            }
            if (externalOptions.getCron().getDefaultFailureIssueThreshold() != null) {
                getCron().setDefaultFailureIssueThreshold(externalOptions.getCron().getDefaultFailureIssueThreshold());
            }
            if (externalOptions.getCron().getDefaultRecoveryThreshold() != null) {
                getCron().setDefaultRecoveryThreshold(externalOptions.getCron().getDefaultRecoveryThreshold());
            }
        }
    }

    public io.sentry.Dsn retrieveParsedDsn() {
        return this.parsedDsn.getValue();
    }

    public void setAttachServerName(boolean z6) {
        this.attachServerName = z6;
    }

    public void setAttachStacktrace(boolean z6) {
        this.attachStacktrace = z6;
    }

    public void setAttachThreads(boolean z6) {
        this.attachThreads = z6;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.IBackpressureMonitor iBackpressureMonitor) {
        this.backpressureMonitor = iBackpressureMonitor;
    }

    public void setBeforeBreadcrumb(io.sentry.SentryOptions.BeforeBreadcrumbCallback beforeBreadcrumbCallback) {
        this.beforeBreadcrumb = beforeBreadcrumbCallback;
    }

    public void setBeforeEnvelopeCallback(io.sentry.SentryOptions.BeforeEnvelopeCallback beforeEnvelopeCallback) {
        this.beforeEnvelopeCallback = beforeEnvelopeCallback;
    }

    public void setBeforeSend(io.sentry.SentryOptions.BeforeSendCallback beforeSendCallback) {
        this.beforeSend = beforeSendCallback;
    }

    public void setBeforeSendReplay(io.sentry.SentryOptions.BeforeSendReplayCallback beforeSendReplayCallback) {
        this.beforeSendReplay = beforeSendReplayCallback;
    }

    public void setBeforeSendTransaction(io.sentry.SentryOptions.BeforeSendTransactionCallback beforeSendTransactionCallback) {
        this.beforeSendTransaction = beforeSendTransactionCallback;
    }

    public void setCacheDirPath(java.lang.String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z6) {
        this.captureOpenTelemetryEvents = z6;
    }

    public void setConnectionStatusProvider(io.sentry.IConnectionStatusProvider iConnectionStatusProvider) {
        this.connectionStatusProvider = iConnectionStatusProvider;
    }

    public void setConnectionTimeoutMillis(int i3) {
        this.connectionTimeoutMillis = i3;
    }

    public void setCron(io.sentry.SentryOptions.Cron cron) {
        this.cron = cron;
    }

    public void setDateProvider(io.sentry.SentryDateProvider sentryDateProvider) {
        this.dateProvider.setValue(sentryDateProvider);
    }

    public void setDebug(boolean z6) {
        this.debug = z6;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.IDebugMetaLoader iDebugMetaLoader) {
        if (iDebugMetaLoader == null) {
            iDebugMetaLoader = io.sentry.internal.debugmeta.NoOpDebugMetaLoader.getInstance();
        }
        this.debugMetaLoader = iDebugMetaLoader;
    }

    public void setDefaultScopeType(io.sentry.ScopeType scopeType) {
        this.defaultScopeType = scopeType;
    }

    public void setDiagnosticLevel(io.sentry.SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            sentryLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = sentryLevel;
    }

    public void setDist(java.lang.String str) {
        this.dist = str;
    }

    public void setDistinctId(java.lang.String str) {
        this.distinctId = str;
    }

    public void setDsn(java.lang.String str) {
        this.dsn = str;
        this.parsedDsn.resetValue();
        this.dsnHash = io.sentry.util.StringUtils.calculateStringHash(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z6) {
        this.enableAppStartProfiling = z6;
    }

    public void setEnableAutoSessionTracking(boolean z6) {
        this.enableAutoSessionTracking = z6;
    }

    public void setEnableBackpressureHandling(boolean z6) {
        this.enableBackpressureHandling = z6;
    }

    public void setEnableDeduplication(boolean z6) {
        this.enableDeduplication = z6;
    }

    public void setEnableExternalConfiguration(boolean z6) {
        this.enableExternalConfiguration = z6;
    }

    public void setEnablePrettySerializationOutput(boolean z6) {
        this.enablePrettySerializationOutput = z6;
    }

    public void setEnableScopePersistence(boolean z6) {
        this.enableScopePersistence = z6;
    }

    public void setEnableScreenTracking(boolean z6) {
        this.enableScreenTracking = z6;
    }

    public void setEnableShutdownHook(boolean z6) {
        this.enableShutdownHook = z6;
    }

    public void setEnableSpotlight(boolean z6) {
        this.enableSpotlight = z6;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z6) {
        this.enableTimeToFullDisplayTracing = z6;
    }

    public void setEnableUncaughtExceptionHandler(boolean z6) {
        this.enableUncaughtExceptionHandler = z6;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z6) {
        this.enableUserInteractionBreadcrumbs = z6;
    }

    public void setEnableUserInteractionTracing(boolean z6) {
        this.enableUserInteractionTracing = z6;
    }

    public void setEnabled(boolean z6) {
        this.enabled = z6;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.IEnvelopeCache iEnvelopeCache) {
        if (iEnvelopeCache == null) {
            iEnvelopeCache = io.sentry.transport.NoOpEnvelopeCache.getInstance();
        }
        this.envelopeDiskCache = iEnvelopeCache;
    }

    public void setEnvelopeReader(io.sentry.IEnvelopeReader iEnvelopeReader) {
        io.sentry.util.LazyEvaluator<io.sentry.IEnvelopeReader> lazyEvaluator = this.envelopeReader;
        if (iEnvelopeReader == null) {
            iEnvelopeReader = io.sentry.NoOpEnvelopeReader.getInstance();
        }
        lazyEvaluator.setValue(iEnvelopeReader);
    }

    public void setEnvironment(java.lang.String str) {
        this.environment = str;
    }

    public void setExecutorService(io.sentry.ISentryExecutorService iSentryExecutorService) {
        if (iSentryExecutorService != null) {
            this.executorService = iSentryExecutorService;
        }
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setForceInit(boolean z6) {
        this.forceInit = z6;
    }

    public void setFullyDisplayedReporter(io.sentry.FullyDisplayedReporter fullyDisplayedReporter) {
        this.fullyDisplayedReporter = fullyDisplayedReporter;
    }

    public void setGestureTargetLocators(java.util.List<io.sentry.internal.gestures.GestureTargetLocator> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(java.lang.Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(java.lang.Long l2) {
        this.idleTimeout = l2;
    }

    public void setIgnoredCheckIns(java.util.List<java.lang.String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new io.sentry.FilterString(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(java.util.List<java.lang.String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new io.sentry.FilterString(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(java.util.List<java.lang.String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new io.sentry.FilterString(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(java.util.List<java.lang.String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new io.sentry.FilterString(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(io.sentry.InitPriority initPriority) {
        this.initPriority = initPriority;
    }

    @java.lang.Deprecated
    public void setInstrumenter(io.sentry.Instrumenter instrumenter) {
        this.instrumenter = instrumenter;
    }

    public void setLogger(io.sentry.ILogger iLogger) {
        this.logger = iLogger == null ? io.sentry.NoOpLogger.getInstance() : new io.sentry.DiagnosticLogger(this, iLogger);
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i3) {
        this.maxBreadcrumbs = i3;
    }

    public void setMaxCacheItems(int i3) {
        this.maxCacheItems = i3;
    }

    public void setMaxDepth(int i3) {
        this.maxDepth = i3;
    }

    public void setMaxQueueSize(int i3) {
        if (i3 > 0) {
            this.maxQueueSize = i3;
        }
    }

    public void setMaxRequestBodySize(io.sentry.SentryOptions.RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    public void setMaxSpans(int i3) {
        this.maxSpans = i3;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setModulesLoader(io.sentry.internal.modules.IModulesLoader iModulesLoader) {
        if (iModulesLoader == null) {
            iModulesLoader = io.sentry.internal.modules.NoOpModulesLoader.getInstance();
        }
        this.modulesLoader = iModulesLoader;
    }

    public void setOpenTelemetryMode(io.sentry.SentryOpenTelemetryMode sentryOpenTelemetryMode) {
        this.openTelemetryMode = sentryOpenTelemetryMode;
    }

    public void setPrintUncaughtStackTrace(boolean z6) {
        this.printUncaughtStackTrace = z6;
    }

    public void setProfilesSampleRate(java.lang.Double d4) {
        if (io.sentry.util.SampleRateUtils.isValidProfilesSampleRate(d4)) {
            this.profilesSampleRate = d4;
            return;
        }
        throw new java.lang.IllegalArgumentException("The value " + d4 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(io.sentry.SentryOptions.ProfilesSamplerCallback profilesSamplerCallback) {
        this.profilesSampler = profilesSamplerCallback;
    }

    public void setProfilingTracesHz(int i3) {
        this.profilingTracesHz = i3;
    }

    public void setProguardUuid(java.lang.String str) {
        this.proguardUuid = str;
    }

    public void setProxy(io.sentry.SentryOptions.Proxy proxy) {
        this.proxy = proxy;
    }

    public void setReadTimeoutMillis(int i3) {
        this.readTimeoutMillis = i3;
    }

    public void setRelease(java.lang.String str) {
        this.release = str;
    }

    public void setReplayController(io.sentry.ReplayController replayController) {
        if (replayController == null) {
            replayController = io.sentry.NoOpReplayController.getInstance();
        }
        this.replayController = replayController;
    }

    public void setSampleRate(java.lang.Double d4) {
        if (io.sentry.util.SampleRateUtils.isValidSampleRate(d4)) {
            this.sampleRate = d4;
            return;
        }
        throw new java.lang.IllegalArgumentException("The value " + d4 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.SdkVersion sdkVersion) {
        io.sentry.protocol.SdkVersion sdkVersion2 = getSessionReplay().getSdkVersion();
        io.sentry.protocol.SdkVersion sdkVersion3 = this.sdkVersion;
        if (sdkVersion3 != null && sdkVersion2 != null && sdkVersion3.equals(sdkVersion2)) {
            getSessionReplay().setSdkVersion(sdkVersion);
        }
        this.sdkVersion = sdkVersion;
    }

    public void setSendClientReports(boolean z6) {
        this.sendClientReports = z6;
        if (z6) {
            this.clientReportRecorder = new io.sentry.clientreport.ClientReportRecorder(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.NoOpClientReportRecorder();
        }
    }

    public void setSendDefaultPii(boolean z6) {
        this.sendDefaultPii = z6;
    }

    public void setSendModules(boolean z6) {
        this.sendModules = z6;
    }

    public void setSentryClientName(java.lang.String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(io.sentry.ISerializer iSerializer) {
        io.sentry.util.LazyEvaluator<io.sentry.ISerializer> lazyEvaluator = this.serializer;
        if (iSerializer == null) {
            iSerializer = io.sentry.NoOpSerializer.getInstance();
        }
        lazyEvaluator.setValue(iSerializer);
    }

    public void setServerName(java.lang.String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(io.sentry.SentryReplayOptions sentryReplayOptions) {
        this.sessionReplay = sentryReplayOptions;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSpanFactory(io.sentry.ISpanFactory iSpanFactory) {
        this.spanFactory = iSpanFactory;
    }

    public void setSpotlightConnectionUrl(java.lang.String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(javax.net.ssl.SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.IThreadChecker iThreadChecker) {
        this.threadChecker = iThreadChecker;
    }

    public void setTraceOptionsRequests(boolean z6) {
        this.traceOptionsRequests = z6;
    }

    public void setTracePropagationTargets(java.util.List<java.lang.String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @java.lang.Deprecated
    public void setTraceSampling(boolean z6) {
        this.traceSampling = z6;
    }

    public void setTracesSampleRate(java.lang.Double d4) {
        if (io.sentry.util.SampleRateUtils.isValidTracesSampleRate(d4)) {
            this.tracesSampleRate = d4;
            return;
        }
        throw new java.lang.IllegalArgumentException("The value " + d4 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(io.sentry.SentryOptions.TracesSamplerCallback tracesSamplerCallback) {
        this.tracesSampler = tracesSamplerCallback;
    }

    public void setTransactionPerformanceCollector(io.sentry.TransactionPerformanceCollector transactionPerformanceCollector) {
        this.transactionPerformanceCollector = transactionPerformanceCollector;
    }

    public void setTransactionProfiler(io.sentry.ITransactionProfiler iTransactionProfiler) {
        if (this.transactionProfiler != io.sentry.NoOpTransactionProfiler.getInstance() || iTransactionProfiler == null) {
            return;
        }
        this.transactionProfiler = iTransactionProfiler;
    }

    public void setTransportFactory(io.sentry.ITransportFactory iTransportFactory) {
        if (iTransportFactory == null) {
            iTransportFactory = io.sentry.NoOpTransportFactory.getInstance();
        }
        this.transportFactory = iTransportFactory;
    }

    public void setTransportGate(io.sentry.transport.ITransportGate iTransportGate) {
        if (iTransportGate == null) {
            iTransportGate = io.sentry.transport.NoOpTransportGate.getInstance();
        }
        this.transportGate = iTransportGate;
    }

    public void setViewHierarchyExporters(java.util.List<io.sentry.internal.viewhierarchy.ViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private SentryOptions(boolean z6) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new java.util.concurrent.CopyOnWriteArraySet();
        this.ignoredErrors = null;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new java.util.concurrent.CopyOnWriteArraySet();
        final int i3 = 0;
        this.parsedDsn = new io.sentry.util.LazyEvaluator<>(new io.sentry.util.LazyEvaluator.Evaluator(this) { // from class: io.sentry.s

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.sentry.SentryOptions f23544i;

            {
                this.f23544i = this;
            }

            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final java.lang.Object evaluate() {
                switch (i3) {
                    case 0:
                        return this.f23544i.lambda$new$0();
                    case 1:
                        return this.f23544i.lambda$new$1();
                    default:
                        return this.f23544i.lambda$new$2();
                }
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = io.sentry.NoOpLogger.getInstance();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        final int i9 = 1;
        this.serializer = new io.sentry.util.LazyEvaluator<>(new io.sentry.util.LazyEvaluator.Evaluator(this) { // from class: io.sentry.s

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.sentry.SentryOptions f23544i;

            {
                this.f23544i = this;
            }

            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final java.lang.Object evaluate() {
                switch (i9) {
                    case 0:
                        return this.f23544i.lambda$new$0();
                    case 1:
                        return this.f23544i.lambda$new$1();
                    default:
                        return this.f23544i.lambda$new$2();
                }
            }
        });
        final int i10 = 2;
        this.envelopeReader = new io.sentry.util.LazyEvaluator<>(new io.sentry.util.LazyEvaluator.Evaluator(this) { // from class: io.sentry.s

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final /* synthetic */ io.sentry.SentryOptions f23544i;

            {
                this.f23544i = this;
            }

            @Override // io.sentry.util.LazyEvaluator.Evaluator
            public final java.lang.Object evaluate() {
                switch (i10) {
                    case 0:
                        return this.f23544i.lambda$new$0();
                    case 1:
                        return this.f23544i.lambda$new$1();
                    default:
                        return this.f23544i.lambda$new$2();
                }
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new java.util.concurrent.CopyOnWriteArrayList();
        this.inAppIncludes = new java.util.concurrent.CopyOnWriteArrayList();
        this.transportFactory = io.sentry.NoOpTransportFactory.getInstance();
        this.transportGate = io.sentry.transport.NoOpTransportGate.getInstance();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = io.sentry.NoOpSentryExecutorService.getInstance();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = io.sentry.transport.NoOpEnvelopeCache.getInstance();
        this.sendDefaultPii = false;
        this.observers = new java.util.concurrent.CopyOnWriteArrayList();
        this.optionsObservers = new java.util.concurrent.CopyOnWriteArrayList();
        this.tags = new java.util.concurrent.ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = io.sentry.SentryOptions.RequestSize.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = androidx.media3.datasource.cache.CacheDataSink.DEFAULT_FRAGMENT_SIZE;
        this.transactionProfiler = io.sentry.NoOpTransactionProfiler.getInstance();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = java.util.Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = java.lang.Long.valueOf(androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        this.contextTags = new java.util.concurrent.CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.ClientReportRecorder(this);
        this.modulesLoader = io.sentry.internal.modules.NoOpModulesLoader.getInstance();
        this.debugMetaLoader = io.sentry.internal.debugmeta.NoOpDebugMetaLoader.getInstance();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = io.sentry.Instrumenter.SENTRY;
        this.gestureTargetLocators = new java.util.ArrayList();
        this.viewHierarchyExporters = new java.util.ArrayList();
        this.threadChecker = io.sentry.util.thread.NoOpThreadChecker.getInstance();
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.LazyEvaluator<>(new io.sentry.g(6));
        this.performanceCollectors = new java.util.ArrayList();
        this.transactionPerformanceCollector = io.sentry.NoOpTransactionPerformanceCollector.getInstance();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = io.sentry.FullyDisplayedReporter.getInstance();
        this.connectionStatusProvider = new io.sentry.NoOpConnectionStatusProvider();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.NoOpBackpressureMonitor.getInstance();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = io.sentry.NoOpSpanFactory.getInstance();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = io.sentry.NoOpReplayController.getInstance();
        this.enableScreenTracking = true;
        this.defaultScopeType = io.sentry.ScopeType.ISOLATION;
        this.initPriority = io.sentry.InitPriority.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.AutoClosableReentrantLock();
        this.openTelemetryMode = io.sentry.SentryOpenTelemetryMode.AUTO;
        this.captureOpenTelemetryEvents = false;
        io.sentry.protocol.SdkVersion sdkVersionCreateSdkVersion = createSdkVersion();
        this.experimental = new io.sentry.ExperimentalOptions(z6, sdkVersionCreateSdkVersion);
        this.sessionReplay = new io.sentry.SentryReplayOptions(z6, sdkVersionCreateSdkVersion);
        if (z6) {
            return;
        }
        setSpanFactory(io.sentry.SpanFactoryFactory.create(new io.sentry.util.LoadClass(), io.sentry.NoOpLogger.getInstance()));
        this.executorService = new io.sentry.SentryExecutorService();
        copyOnWriteArrayList2.add(new io.sentry.UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new io.sentry.ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new io.sentry.SpotlightIntegration());
        copyOnWriteArrayList.add(new io.sentry.MainEventProcessor(this));
        copyOnWriteArrayList.add(new io.sentry.DuplicateEventDetectionEventProcessor(this));
        if (io.sentry.util.Platform.isJvm()) {
            copyOnWriteArrayList.add(new io.sentry.SentryRuntimeEventProcessor());
        }
        setSentryClientName("sentry.java/8.4.0");
        setSdkVersion(sdkVersionCreateSdkVersion);
        addPackageInfo();
    }
}
