package io.sentry;

import androidx.media3.common.C;
import androidx.media3.datasource.cache.CacheDataSink;
import io.sentry.backpressure.IBackpressureMonitor;
import io.sentry.backpressure.NoOpBackpressureMonitor;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.clientreport.ClientReportRecorder;
import io.sentry.clientreport.IClientReportRecorder;
import io.sentry.clientreport.NoOpClientReportRecorder;
import io.sentry.internal.debugmeta.IDebugMetaLoader;
import io.sentry.internal.debugmeta.NoOpDebugMetaLoader;
import io.sentry.internal.gestures.GestureTargetLocator;
import io.sentry.internal.modules.IModulesLoader;
import io.sentry.internal.modules.NoOpModulesLoader;
import io.sentry.internal.viewhierarchy.ViewHierarchyExporter;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryTransaction;
import io.sentry.transport.ITransportGate;
import io.sentry.transport.NoOpEnvelopeCache;
import io.sentry.transport.NoOpTransportGate;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.LazyEvaluator;
import io.sentry.util.LoadClass;
import io.sentry.util.Platform;
import io.sentry.util.SampleRateUtils;
import io.sentry.util.StringUtils;
import io.sentry.util.thread.IThreadChecker;
import io.sentry.util.thread.NoOpThreadChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;

public class SentryOptions {
    static final SentryLevel DEFAULT_DIAGNOSTIC_LEVEL = SentryLevel.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private IBackpressureMonitor backpressureMonitor;
    private BeforeBreadcrumbCallback beforeBreadcrumb;
    private BeforeEnvelopeCallback beforeEnvelopeCallback;
    private BeforeSendCallback beforeSend;
    private BeforeSendReplayCallback beforeSendReplay;
    private BeforeSendTransactionCallback beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    IClientReportRecorder clientReportRecorder;
    private IConnectionStatusProvider connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private Cron cron;
    private final LazyEvaluator<SentryDateProvider> dateProvider;
    private boolean debug;
    private IDebugMetaLoader debugMetaLoader;
    private ScopeType defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private SentryLevel diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
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
    private IEnvelopeCache envelopeDiskCache;
    private final LazyEvaluator<IEnvelopeReader> envelopeReader;
    private String environment;
    private final List<EventProcessor> eventProcessors;
    private ISentryExecutorService executorService;
    private final ExperimentalOptions experimental;
    private long flushTimeoutMillis;
    private boolean forceInit;
    private FullyDisplayedReporter fullyDisplayedReporter;
    private final List<GestureTargetLocator> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<FilterString> ignoredCheckIns;
    private List<FilterString> ignoredErrors;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private List<FilterString> ignoredSpanOrigins;
    private List<FilterString> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private InitPriority initPriority;
    private Instrumenter instrumenter;
    private final List<Integration> integrations;
    private volatile TracesSampler internalTracesSampler;
    protected final AutoClosableReentrantLock lock;
    private ILogger logger;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private RequestSize maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private IModulesLoader modulesLoader;
    private final List<IScopeObserver> observers;
    private SentryOpenTelemetryMode openTelemetryMode;
    private final List<IOptionsObserver> optionsObservers;
    private final LazyEvaluator<Dsn> parsedDsn;
    private final List<IPerformanceCollector> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private ProfilesSamplerCallback profilesSampler;
    private int profilingTracesHz;
    private String proguardUuid;
    private Proxy proxy;
    private int readTimeoutMillis;
    private String release;
    private ReplayController replayController;
    private Double sampleRate;
    private SdkVersion sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final LazyEvaluator<ISerializer> serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private SentryReplayOptions sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private ISpanFactory spanFactory;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private IThreadChecker threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private TracesSamplerCallback tracesSampler;
    private TransactionPerformanceCollector transactionPerformanceCollector;
    private ITransactionProfiler transactionProfiler;
    private ITransportFactory transportFactory;
    private ITransportGate transportGate;
    private final List<ViewHierarchyExporter> viewHierarchyExporters;

    public interface BeforeBreadcrumbCallback {
        Breadcrumb execute(Breadcrumb breadcrumb, Hint hint);
    }

    public interface BeforeEmitMetricCallback {
        boolean execute(String str, Map<String, String> map);
    }

    public interface BeforeEnvelopeCallback {
        void execute(SentryEnvelope sentryEnvelope, Hint hint);
    }

    public interface BeforeSendCallback {
        SentryEvent execute(SentryEvent sentryEvent, Hint hint);
    }

    public interface BeforeSendReplayCallback {
        SentryReplayEvent execute(SentryReplayEvent sentryReplayEvent, Hint hint);
    }

    public interface BeforeSendTransactionCallback {
        SentryTransaction execute(SentryTransaction sentryTransaction, Hint hint);
    }

    public static final class Cron {
        private Long defaultCheckinMargin;
        private Long defaultFailureIssueThreshold;
        private Long defaultMaxRuntime;
        private Long defaultRecoveryThreshold;
        private String defaultTimezone;

        public Long getDefaultCheckinMargin() {
            return this.defaultCheckinMargin;
        }

        public Long getDefaultFailureIssueThreshold() {
            return this.defaultFailureIssueThreshold;
        }

        public Long getDefaultMaxRuntime() {
            return this.defaultMaxRuntime;
        }

        public Long getDefaultRecoveryThreshold() {
            return this.defaultRecoveryThreshold;
        }

        public String getDefaultTimezone() {
            return this.defaultTimezone;
        }

        public void setDefaultCheckinMargin(Long l2) {
            this.defaultCheckinMargin = l2;
        }

        public void setDefaultFailureIssueThreshold(Long l2) {
            this.defaultFailureIssueThreshold = l2;
        }

        public void setDefaultMaxRuntime(Long l2) {
            this.defaultMaxRuntime = l2;
        }

        public void setDefaultRecoveryThreshold(Long l2) {
            this.defaultRecoveryThreshold = l2;
        }

        public void setDefaultTimezone(String str) {
            this.defaultTimezone = str;
        }
    }

    public interface ProfilesSamplerCallback {
        Double sample(SamplingContext samplingContext);
    }

    public static final class Proxy {
        private String host;
        private String pass;
        private String port;
        private java.net.Proxy.Type type;
        private String user;

        public Proxy() {
            this(null, null, null, null, null);
        }

        public String getHost() {
            return this.host;
        }

        public String getPass() {
            return this.pass;
        }

        public String getPort() {
            return this.port;
        }

        public java.net.Proxy.Type getType() {
            return this.type;
        }

        public String getUser() {
            return this.user;
        }

        public void setHost(String str) {
            this.host = str;
        }

        public void setPass(String str) {
            this.pass = str;
        }

        public void setPort(String str) {
            this.port = str;
        }

        public void setType(java.net.Proxy.Type type) {
            this.type = type;
        }

        public void setUser(String str) {
            this.user = str;
        }

        public Proxy(String str, String str2) {
            this(str, str2, null, null, null);
        }

        public Proxy(String str, String str2, java.net.Proxy.Type type) {
            this(str, str2, type, null, null);
        }

        public Proxy(String str, String str2, String str3, String str4) {
            this(str, str2, null, str3, str4);
        }

        public Proxy(String str, String str2, java.net.Proxy.Type type, String str3, String str4) {
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
        Double sample(SamplingContext samplingContext);
    }

    public SentryOptions() {
        this(false);
    }

    private void addPackageInfo() {
        SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry", "8.4.0");
    }

    private SdkVersion createSdkVersion() {
        SdkVersion sdkVersion = new SdkVersion(BuildConfig.SENTRY_JAVA_SDK_NAME, "8.4.0");
        sdkVersion.setVersion("8.4.0");
        return sdkVersion;
    }

    public static SentryOptions empty() {
        return new SentryOptions(true);
    }

    public Dsn lambda$new$0() {
        return new Dsn(this.dsn);
    }

    public ISerializer lambda$new$1() {
        return new JsonSerializer(this);
    }

    public IEnvelopeReader lambda$new$2() {
        return new EnvelopeReader(this.serializer.getValue());
    }

    public static SentryDateProvider lambda$new$3() {
        return new SentryAutoDateProvider();
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(EventProcessor eventProcessor) {
        this.eventProcessors.add(eventProcessor);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new FilterString(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new FilterString(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new FilterString(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new FilterString(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(Integration integration) {
        this.integrations.add(integration);
    }

    public void addOptionsObserver(IOptionsObserver iOptionsObserver) {
        this.optionsObservers.add(iOptionsObserver);
    }

    public void addPerformanceCollector(IPerformanceCollector iPerformanceCollector) {
        this.performanceCollectors.add(iPerformanceCollector);
    }

    public void addScopeObserver(IScopeObserver iScopeObserver) {
        this.observers.add(iScopeObserver);
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public IBackpressureMonitor getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public BeforeBreadcrumbCallback getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public BeforeEnvelopeCallback getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public BeforeSendCallback getBeforeSend() {
        return this.beforeSend;
    }

    public BeforeSendReplayCallback getBeforeSendReplay() {
        return this.beforeSendReplay;
    }

    public BeforeSendTransactionCallback getBeforeSendTransaction() {
        return this.beforeSendTransaction;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public IClientReportRecorder getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public IConnectionStatusProvider getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public Cron getCron() {
        return this.cron;
    }

    public SentryDateProvider getDateProvider() {
        return this.dateProvider.getValue();
    }

    public IDebugMetaLoader getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public ScopeType getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public SentryLevel getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public IEnvelopeCache getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public IEnvelopeReader getEnvelopeReader() {
        return this.envelopeReader.getValue();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<EventProcessor> getEventProcessors() {
        return this.eventProcessors;
    }

    public ISentryExecutorService getExecutorService() {
        return this.executorService;
    }

    public ExperimentalOptions getExperimental() {
        return this.experimental;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public FullyDisplayedReporter getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<GestureTargetLocator> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<FilterString> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<FilterString> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<FilterString> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<FilterString> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public InitPriority getInitPriority() {
        return this.initPriority;
    }

    public Instrumenter getInstrumenter() {
        return this.instrumenter;
    }

    public List<Integration> getIntegrations() {
        return this.integrations;
    }

    public TracesSampler getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new TracesSampler(this);
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
        return this.internalTracesSampler;
    }

    public ILogger getLogger() {
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

    public RequestSize getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public IModulesLoader getModulesLoader() {
        return this.modulesLoader;
    }

    public SentryOpenTelemetryMode getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<IOptionsObserver> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<IPerformanceCollector> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public ProfilesSamplerCallback getProfilesSampler() {
        return this.profilesSampler;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public Proxy getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public ReplayController getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<IScopeObserver> getScopeObservers() {
        return this.observers;
    }

    public SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public ISerializer getSerializer() {
        return this.serializer.getValue();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public SentryReplayOptions getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public ISpanFactory getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public IThreadChecker getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public TracesSamplerCallback getTracesSampler() {
        return this.tracesSampler;
    }

    public TransactionPerformanceCollector getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public ITransactionProfiler getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public ITransportFactory getTransportFactory() {
        return this.transportFactory;
    }

    public ITransportGate getTransportGate() {
        return this.transportGate;
    }

    public final List<ViewHierarchyExporter> getViewHierarchyExporters() {
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

    public Boolean isGlobalHubMode() {
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

    public void merge(ExternalOptions externalOptions) {
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
        for (Map.Entry entry : new HashMap(externalOptions.getTags()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(externalOptions.getInAppIncludes()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(externalOptions.getInAppExcludes()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(externalOptions.getIgnoredExceptionsForType()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (externalOptions.getTracePropagationTargets() != null) {
            setTracePropagationTargets(new ArrayList(externalOptions.getTracePropagationTargets()));
        }
        Iterator it4 = new ArrayList(externalOptions.getContextTags()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (externalOptions.getProguardUuid() != null) {
            setProguardUuid(externalOptions.getProguardUuid());
        }
        if (externalOptions.getIdleTimeout() != null) {
            setIdleTimeout(externalOptions.getIdleTimeout());
        }
        Iterator<String> it5 = externalOptions.getBundleIds().iterator();
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
            setIgnoredCheckIns(new ArrayList(externalOptions.getIgnoredCheckIns()));
        }
        if (externalOptions.getIgnoredTransactions() != null) {
            setIgnoredTransactions(new ArrayList(externalOptions.getIgnoredTransactions()));
        }
        if (externalOptions.getIgnoredErrors() != null) {
            setIgnoredErrors(new ArrayList(externalOptions.getIgnoredErrors()));
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

    public Dsn retrieveParsedDsn() {
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

    public void setBackpressureMonitor(IBackpressureMonitor iBackpressureMonitor) {
        this.backpressureMonitor = iBackpressureMonitor;
    }

    public void setBeforeBreadcrumb(BeforeBreadcrumbCallback beforeBreadcrumbCallback) {
        this.beforeBreadcrumb = beforeBreadcrumbCallback;
    }

    public void setBeforeEnvelopeCallback(BeforeEnvelopeCallback beforeEnvelopeCallback) {
        this.beforeEnvelopeCallback = beforeEnvelopeCallback;
    }

    public void setBeforeSend(BeforeSendCallback beforeSendCallback) {
        this.beforeSend = beforeSendCallback;
    }

    public void setBeforeSendReplay(BeforeSendReplayCallback beforeSendReplayCallback) {
        this.beforeSendReplay = beforeSendReplayCallback;
    }

    public void setBeforeSendTransaction(BeforeSendTransactionCallback beforeSendTransactionCallback) {
        this.beforeSendTransaction = beforeSendTransactionCallback;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z6) {
        this.captureOpenTelemetryEvents = z6;
    }

    public void setConnectionStatusProvider(IConnectionStatusProvider iConnectionStatusProvider) {
        this.connectionStatusProvider = iConnectionStatusProvider;
    }

    public void setConnectionTimeoutMillis(int i3) {
        this.connectionTimeoutMillis = i3;
    }

    public void setCron(Cron cron) {
        this.cron = cron;
    }

    public void setDateProvider(SentryDateProvider sentryDateProvider) {
        this.dateProvider.setValue(sentryDateProvider);
    }

    public void setDebug(boolean z6) {
        this.debug = z6;
    }

    public void setDebugMetaLoader(IDebugMetaLoader iDebugMetaLoader) {
        if (iDebugMetaLoader == null) {
            iDebugMetaLoader = NoOpDebugMetaLoader.getInstance();
        }
        this.debugMetaLoader = iDebugMetaLoader;
    }

    public void setDefaultScopeType(ScopeType scopeType) {
        this.defaultScopeType = scopeType;
    }

    public void setDiagnosticLevel(SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            sentryLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = sentryLevel;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.parsedDsn.resetValue();
        this.dsnHash = StringUtils.calculateStringHash(this.dsn, this.logger);
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

    public void setEnvelopeDiskCache(IEnvelopeCache iEnvelopeCache) {
        if (iEnvelopeCache == null) {
            iEnvelopeCache = NoOpEnvelopeCache.getInstance();
        }
        this.envelopeDiskCache = iEnvelopeCache;
    }

    public void setEnvelopeReader(IEnvelopeReader iEnvelopeReader) {
        LazyEvaluator<IEnvelopeReader> lazyEvaluator = this.envelopeReader;
        if (iEnvelopeReader == null) {
            iEnvelopeReader = NoOpEnvelopeReader.getInstance();
        }
        lazyEvaluator.setValue(iEnvelopeReader);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(ISentryExecutorService iSentryExecutorService) {
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

    public void setFullyDisplayedReporter(FullyDisplayedReporter fullyDisplayedReporter) {
        this.fullyDisplayedReporter = fullyDisplayedReporter;
    }

    public void setGestureTargetLocators(List<GestureTargetLocator> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l2) {
        this.idleTimeout = l2;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new FilterString(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new FilterString(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new FilterString(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new FilterString(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(InitPriority initPriority) {
        this.initPriority = initPriority;
    }

    @Deprecated
    public void setInstrumenter(Instrumenter instrumenter) {
        this.instrumenter = instrumenter;
    }

    public void setLogger(ILogger iLogger) {
        this.logger = iLogger == null ? NoOpLogger.getInstance() : new DiagnosticLogger(this, iLogger);
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

    public void setMaxRequestBodySize(RequestSize requestSize) {
        this.maxRequestBodySize = requestSize;
    }

    public void setMaxSpans(int i3) {
        this.maxSpans = i3;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setModulesLoader(IModulesLoader iModulesLoader) {
        if (iModulesLoader == null) {
            iModulesLoader = NoOpModulesLoader.getInstance();
        }
        this.modulesLoader = iModulesLoader;
    }

    public void setOpenTelemetryMode(SentryOpenTelemetryMode sentryOpenTelemetryMode) {
        this.openTelemetryMode = sentryOpenTelemetryMode;
    }

    public void setPrintUncaughtStackTrace(boolean z6) {
        this.printUncaughtStackTrace = z6;
    }

    public void setProfilesSampleRate(Double d4) {
        if (SampleRateUtils.isValidProfilesSampleRate(d4)) {
            this.profilesSampleRate = d4;
            return;
        }
        throw new IllegalArgumentException("The value " + d4 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(ProfilesSamplerCallback profilesSamplerCallback) {
        this.profilesSampler = profilesSamplerCallback;
    }

    public void setProfilingTracesHz(int i3) {
        this.profilingTracesHz = i3;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public void setReadTimeoutMillis(int i3) {
        this.readTimeoutMillis = i3;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(ReplayController replayController) {
        if (replayController == null) {
            replayController = NoOpReplayController.getInstance();
        }
        this.replayController = replayController;
    }

    public void setSampleRate(Double d4) {
        if (SampleRateUtils.isValidSampleRate(d4)) {
            this.sampleRate = d4;
            return;
        }
        throw new IllegalArgumentException("The value " + d4 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(SdkVersion sdkVersion) {
        SdkVersion sdkVersion2 = getSessionReplay().getSdkVersion();
        SdkVersion sdkVersion3 = this.sdkVersion;
        if (sdkVersion3 != null && sdkVersion2 != null && sdkVersion3.equals(sdkVersion2)) {
            getSessionReplay().setSdkVersion(sdkVersion);
        }
        this.sdkVersion = sdkVersion;
    }

    public void setSendClientReports(boolean z6) {
        this.sendClientReports = z6;
        if (z6) {
            this.clientReportRecorder = new ClientReportRecorder(this);
        } else {
            this.clientReportRecorder = new NoOpClientReportRecorder();
        }
    }

    public void setSendDefaultPii(boolean z6) {
        this.sendDefaultPii = z6;
    }

    public void setSendModules(boolean z6) {
        this.sendModules = z6;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(ISerializer iSerializer) {
        LazyEvaluator<ISerializer> lazyEvaluator = this.serializer;
        if (iSerializer == null) {
            iSerializer = NoOpSerializer.getInstance();
        }
        lazyEvaluator.setValue(iSerializer);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(SentryReplayOptions sentryReplayOptions) {
        this.sessionReplay = sentryReplayOptions;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSpanFactory(ISpanFactory iSpanFactory) {
        this.spanFactory = iSpanFactory;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(IThreadChecker iThreadChecker) {
        this.threadChecker = iThreadChecker;
    }

    public void setTraceOptionsRequests(boolean z6) {
        this.traceOptionsRequests = z6;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z6) {
        this.traceSampling = z6;
    }

    public void setTracesSampleRate(Double d4) {
        if (SampleRateUtils.isValidTracesSampleRate(d4)) {
            this.tracesSampleRate = d4;
            return;
        }
        throw new IllegalArgumentException("The value " + d4 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(TracesSamplerCallback tracesSamplerCallback) {
        this.tracesSampler = tracesSamplerCallback;
    }

    public void setTransactionPerformanceCollector(TransactionPerformanceCollector transactionPerformanceCollector) {
        this.transactionPerformanceCollector = transactionPerformanceCollector;
    }

    public void setTransactionProfiler(ITransactionProfiler iTransactionProfiler) {
        if (this.transactionProfiler != NoOpTransactionProfiler.getInstance() || iTransactionProfiler == null) {
            return;
        }
        this.transactionProfiler = iTransactionProfiler;
    }

    public void setTransportFactory(ITransportFactory iTransportFactory) {
        if (iTransportFactory == null) {
            iTransportFactory = NoOpTransportFactory.getInstance();
        }
        this.transportFactory = iTransportFactory;
    }

    public void setTransportGate(ITransportGate iTransportGate) {
        if (iTransportGate == null) {
            iTransportGate = NoOpTransportGate.getInstance();
        }
        this.transportGate = iTransportGate;
    }

    public void setViewHierarchyExporters(List<ViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private SentryOptions(boolean z6) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        final int i3 = 0;
        this.parsedDsn = new LazyEvaluator<>(new LazyEvaluator.Evaluator(this) {

            public final SentryOptions f23544i;

            {
                this.f23544i = this;
            }

            @Override
            public final Object evaluate() {
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
        this.logger = NoOpLogger.getInstance();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        final int i9 = 1;
        this.serializer = new LazyEvaluator<>(new LazyEvaluator.Evaluator(this) {

            public final SentryOptions f23544i;

            {
                this.f23544i = this;
            }

            @Override
            public final Object evaluate() {
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
        this.envelopeReader = new LazyEvaluator<>(new LazyEvaluator.Evaluator(this) {

            public final SentryOptions f23544i;

            {
                this.f23544i = this;
            }

            @Override
            public final Object evaluate() {
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
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = NoOpTransportFactory.getInstance();
        this.transportGate = NoOpTransportGate.getInstance();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = NoOpSentryExecutorService.getInstance();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = NoOpEnvelopeCache.getInstance();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = RequestSize.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = CacheDataSink.DEFAULT_FRAGMENT_SIZE;
        this.transactionProfiler = NoOpTransactionProfiler.getInstance();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = Long.valueOf(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new ClientReportRecorder(this);
        this.modulesLoader = NoOpModulesLoader.getInstance();
        this.debugMetaLoader = NoOpDebugMetaLoader.getInstance();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = Instrumenter.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = NoOpThreadChecker.getInstance();
        this.traceOptionsRequests = true;
        this.dateProvider = new LazyEvaluator<>(new g(6));
        this.performanceCollectors = new ArrayList();
        this.transactionPerformanceCollector = NoOpTransactionPerformanceCollector.getInstance();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = FullyDisplayedReporter.getInstance();
        this.connectionStatusProvider = new NoOpConnectionStatusProvider();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = NoOpBackpressureMonitor.getInstance();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = NoOpSpanFactory.getInstance();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = NoOpReplayController.getInstance();
        this.enableScreenTracking = true;
        this.defaultScopeType = ScopeType.ISOLATION;
        this.initPriority = InitPriority.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new AutoClosableReentrantLock();
        this.openTelemetryMode = SentryOpenTelemetryMode.AUTO;
        this.captureOpenTelemetryEvents = false;
        SdkVersion sdkVersionCreateSdkVersion = createSdkVersion();
        this.experimental = new ExperimentalOptions(z6, sdkVersionCreateSdkVersion);
        this.sessionReplay = new SentryReplayOptions(z6, sdkVersionCreateSdkVersion);
        if (z6) {
            return;
        }
        setSpanFactory(SpanFactoryFactory.create(new LoadClass(), NoOpLogger.getInstance()));
        this.executorService = new SentryExecutorService();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new MainEventProcessor(this));
        copyOnWriteArrayList.add(new DuplicateEventDetectionEventProcessor(this));
        if (Platform.isJvm()) {
            copyOnWriteArrayList.add(new SentryRuntimeEventProcessor());
        }
        setSentryClientName("sentry.java/8.4.0");
        setSdkVersion(sdkVersionCreateSdkVersion);
        addPackageInfo();
    }
}
