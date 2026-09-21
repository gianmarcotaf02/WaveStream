package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class Sentry {
    public static final java.lang.String APP_START_PROFILING_CONFIG_FILE_NAME = "app_start_profiling_config";
    private static final boolean GLOBAL_HUB_DEFAULT_MODE = false;
    private static volatile io.sentry.IScopesStorage scopesStorage = io.sentry.NoOpScopesStorage.getInstance();
    private static volatile io.sentry.IScopes rootScopes = io.sentry.NoOpScopes.getInstance();
    private static final io.sentry.IScope globalScope = new io.sentry.Scope(io.sentry.SentryOptions.empty());
    private static volatile boolean globalHubMode = false;
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");
    private static final long classCreationTimestamp = java.lang.System.currentTimeMillis();
    private static final io.sentry.util.AutoClosableReentrantLock lock = new io.sentry.util.AutoClosableReentrantLock();

    public interface OptionsConfiguration<T extends io.sentry.SentryOptions> {
        void configure(T t9);
    }

    private Sentry() {
    }

    public static void addBreadcrumb(io.sentry.Breadcrumb breadcrumb, io.sentry.Hint hint) {
        getCurrentScopes().addBreadcrumb(breadcrumb, hint);
    }

    private static <T extends io.sentry.SentryOptions> void applyOptionsConfiguration(io.sentry.Sentry.OptionsConfiguration<T> optionsConfiguration, T t9) {
        try {
            optionsConfiguration.configure(t9);
        } catch (java.lang.Throwable th) {
            t9.getLogger().log(io.sentry.SentryLevel.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
    }

    public static void bindClient(io.sentry.ISentryClient iSentryClient) {
        getCurrentScopes().bindClient(iSentryClient);
    }

    public static io.sentry.protocol.SentryId captureCheckIn(io.sentry.CheckIn checkIn) {
        return getCurrentScopes().captureCheckIn(checkIn);
    }

    public static io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent) {
        return getCurrentScopes().captureEvent(sentryEvent);
    }

    public static io.sentry.protocol.SentryId captureException(java.lang.Throwable th) {
        return getCurrentScopes().captureException(th);
    }

    public static io.sentry.protocol.SentryId captureMessage(java.lang.String str) {
        return getCurrentScopes().captureMessage(str);
    }

    public static void captureUserFeedback(io.sentry.UserFeedback userFeedback) {
        getCurrentScopes().captureUserFeedback(userFeedback);
    }

    public static void clearBreadcrumbs() {
        getCurrentScopes().clearBreadcrumbs();
    }

    public static void close() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = lock.acquire();
        try {
            io.sentry.IScopes currentScopes = getCurrentScopes();
            rootScopes = io.sentry.NoOpScopes.getInstance();
            getScopesStorage().close();
            currentScopes.close(false);
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

    public static void configureScope(io.sentry.ScopeCallback scopeCallback) {
        configureScope(null, scopeCallback);
    }

    public static io.sentry.TransactionContext continueTrace(java.lang.String str, java.util.List<java.lang.String> list) {
        return getCurrentScopes().continueTrace(str, list);
    }

    public static void endSession() {
        getCurrentScopes().endSession();
    }

    private static void finalizePreviousSession(io.sentry.SentryOptions sentryOptions, io.sentry.IScopes iScopes) {
        try {
            sentryOptions.getExecutorService().submit(new io.sentry.PreviousSessionFinalizer(sentryOptions, iScopes));
        } catch (java.lang.Throwable th) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Failed to finalize previous session.", th);
        }
    }

    public static void flush(long j) {
        getCurrentScopes().flush(j);
    }

    public static io.sentry.IScopes forkedCurrentScope(java.lang.String str) {
        return getCurrentScopes().forkedCurrentScope(str);
    }

    public static io.sentry.IScopes forkedRootScopes(java.lang.String str) {
        return globalHubMode ? rootScopes : rootScopes.forkedScopes(str);
    }

    public static io.sentry.IScopes forkedScopes(java.lang.String str) {
        return getCurrentScopes().forkedScopes(str);
    }

    public static io.sentry.BaggageHeader getBaggage() {
        return getCurrentScopes().getBaggage();
    }

    @java.lang.Deprecated
    public static io.sentry.IHub getCurrentHub() {
        return new io.sentry.HubScopesWrapper(getCurrentScopes());
    }

    public static io.sentry.IScopes getCurrentScopes() {
        if (globalHubMode) {
            return rootScopes;
        }
        io.sentry.IScopes iScopes = getScopesStorage().get();
        if (iScopes != null && !iScopes.isNoOp()) {
            return iScopes;
        }
        io.sentry.IScopes iScopesForkedScopes = rootScopes.forkedScopes("getCurrentScopes");
        getScopesStorage().set(iScopesForkedScopes);
        return iScopesForkedScopes;
    }

    public static io.sentry.IScope getGlobalScope() {
        return globalScope;
    }

    public static io.sentry.protocol.SentryId getLastEventId() {
        return getCurrentScopes().getLastEventId();
    }

    private static io.sentry.IScopesStorage getScopesStorage() {
        return scopesStorage;
    }

    public static io.sentry.ISpan getSpan() {
        return (globalHubMode && io.sentry.util.Platform.isAndroid()) ? getCurrentScopes().getTransaction() : getCurrentScopes().getSpan();
    }

    public static io.sentry.SentryTraceHeader getTraceparent() {
        return getCurrentScopes().getTraceparent();
    }

    private static void handleAppStartProfilingConfig(io.sentry.SentryOptions sentryOptions, io.sentry.ISentryExecutorService iSentryExecutorService) {
        try {
            iSentryExecutorService.submit(new io.sentry.k(sentryOptions, 0));
        } catch (java.lang.Throwable th) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th);
        }
    }

    public static void init() {
        init((io.sentry.Sentry.OptionsConfiguration<io.sentry.SentryOptions>) new io.sentry.g(5), false);
    }

    private static void initConfigurations(io.sentry.SentryOptions sentryOptions) {
        int i3 = 0;
        io.sentry.ILogger logger = sentryOptions.getLogger();
        io.sentry.SentryLevel sentryLevel = io.sentry.SentryLevel.INFO;
        logger.log(sentryLevel, "Initializing SDK with DSN: '%s'", sentryOptions.getDsn());
        java.lang.String outboxPath = sentryOptions.getOutboxPath();
        if (outboxPath != null) {
            new java.io.File(outboxPath).mkdirs();
        } else {
            logger.log(sentryLevel, "No outbox dir path is defined in options.", new java.lang.Object[0]);
        }
        java.lang.String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath != null) {
            new java.io.File(cacheDirPath).mkdirs();
            if (sentryOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.NoOpEnvelopeCache) {
                sentryOptions.setEnvelopeDiskCache(io.sentry.cache.EnvelopeCache.create(sentryOptions));
            }
        }
        java.lang.String profilingTracesDirPath = sentryOptions.getProfilingTracesDirPath();
        if (sentryOptions.isProfilingEnabled() && profilingTracesDirPath != null) {
            java.io.File file = new java.io.File(profilingTracesDirPath);
            file.mkdirs();
            try {
                sentryOptions.getExecutorService().submit(new io.sentry.l(i3, file));
            } catch (java.util.concurrent.RejectedExecutionException e6) {
                sentryOptions.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e6);
            }
        }
        io.sentry.internal.modules.IModulesLoader modulesLoader = sentryOptions.getModulesLoader();
        if (!sentryOptions.isSendModules()) {
            sentryOptions.setModulesLoader(io.sentry.internal.modules.NoOpModulesLoader.getInstance());
        } else if (modulesLoader instanceof io.sentry.internal.modules.NoOpModulesLoader) {
            sentryOptions.setModulesLoader(new io.sentry.internal.modules.CompositeModulesLoader(java.util.Arrays.asList(new io.sentry.internal.modules.ManifestModulesLoader(sentryOptions.getLogger()), new io.sentry.internal.modules.ResourcesModulesLoader(sentryOptions.getLogger())), sentryOptions.getLogger()));
        }
        if (sentryOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.NoOpDebugMetaLoader) {
            sentryOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.ResourcesDebugMetaLoader(sentryOptions.getLogger()));
        }
        io.sentry.util.DebugMetaPropertiesApplier.applyToOptions(sentryOptions, sentryOptions.getDebugMetaLoader().loadDebugMeta());
        if (sentryOptions.getThreadChecker() instanceof io.sentry.util.thread.NoOpThreadChecker) {
            sentryOptions.setThreadChecker(io.sentry.util.thread.ThreadChecker.getInstance());
        }
        if (sentryOptions.getPerformanceCollectors().isEmpty()) {
            sentryOptions.addPerformanceCollector(new io.sentry.JavaMemoryCollector());
        }
        if (sentryOptions.isEnableBackpressureHandling() && io.sentry.util.Platform.isJvm()) {
            if (sentryOptions.getBackpressureMonitor() instanceof io.sentry.backpressure.NoOpBackpressureMonitor) {
                sentryOptions.setBackpressureMonitor(new io.sentry.backpressure.BackpressureMonitor(sentryOptions, io.sentry.ScopesAdapter.getInstance()));
            }
            sentryOptions.getBackpressureMonitor().start();
        }
    }

    private static void initForOpenTelemetryMaybe(io.sentry.SentryOptions sentryOptions) {
        io.sentry.opentelemetry.OpenTelemetryUtil.updateOpenTelemetryModeIfAuto(sentryOptions, new io.sentry.util.LoadClass());
        if (io.sentry.SentryOpenTelemetryMode.OFF == sentryOptions.getOpenTelemetryMode()) {
            sentryOptions.setSpanFactory(new io.sentry.DefaultSpanFactory());
        }
        initScopesStorage(sentryOptions);
        io.sentry.opentelemetry.OpenTelemetryUtil.applyIgnoredSpanOrigins(sentryOptions);
    }

    private static void initLogger(io.sentry.SentryOptions sentryOptions) {
        if (sentryOptions.isDebug() && (sentryOptions.getLogger() instanceof io.sentry.NoOpLogger)) {
            sentryOptions.setLogger(new io.sentry.SystemOutLogger());
        }
    }

    private static void initScopesStorage(io.sentry.SentryOptions sentryOptions) {
        getScopesStorage().close();
        if (io.sentry.SentryOpenTelemetryMode.OFF == sentryOptions.getOpenTelemetryMode()) {
            scopesStorage = new io.sentry.DefaultScopesStorage();
        } else {
            scopesStorage = io.sentry.ScopesStorageFactory.create(new io.sentry.util.LoadClass(), io.sentry.NoOpLogger.getInstance());
        }
    }

    public static java.lang.Boolean isCrashedLastRun() {
        return getCurrentScopes().isCrashedLastRun();
    }

    public static boolean isEnabled() {
        return getCurrentScopes().isEnabled();
    }

    public static boolean isHealthy() {
        return getCurrentScopes().isHealthy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleAppStartProfilingConfig$3(io.sentry.SentryOptions sentryOptions) {
        java.lang.String cacheDirPathWithoutDsn = sentryOptions.getCacheDirPathWithoutDsn();
        if (cacheDirPathWithoutDsn != null) {
            java.io.File file = new java.io.File(cacheDirPathWithoutDsn, APP_START_PROFILING_CONFIG_FILE_NAME);
            try {
                io.sentry.util.FileUtils.deleteRecursively(file);
                if (sentryOptions.isEnableAppStartProfiling()) {
                    if (!sentryOptions.isTracingEnabled()) {
                        sentryOptions.getLogger().log(io.sentry.SentryLevel.INFO, "Tracing is disabled and app start profiling will not start.", new java.lang.Object[0]);
                        return;
                    }
                    if (file.createNewFile()) {
                        io.sentry.SentryAppStartProfilingOptions sentryAppStartProfilingOptions = new io.sentry.SentryAppStartProfilingOptions(sentryOptions, sampleAppStartProfiling(sentryOptions));
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                        try {
                            java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(fileOutputStream, UTF_8));
                            try {
                                sentryOptions.getSerializer().serialize(sentryAppStartProfilingOptions, bufferedWriter);
                                bufferedWriter.close();
                                fileOutputStream.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    bufferedWriter.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    }
                }
            } catch (java.lang.Throwable th5) {
                sentryOptions.getLogger().log(io.sentry.SentryLevel.ERROR, "Unable to create app start profiling config file. ", th5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initConfigurations$5(java.io.File file) {
        java.io.File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (java.io.File file2 : fileArrListFiles) {
            if (file2.lastModified() < classCreationTimestamp - java.util.concurrent.TimeUnit.MINUTES.toMillis(5L)) {
                io.sentry.util.FileUtils.deleteRecursively(file2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyOptionsObservers$4(io.sentry.SentryOptions sentryOptions) {
        for (io.sentry.IOptionsObserver iOptionsObserver : sentryOptions.getOptionsObservers()) {
            iOptionsObserver.setRelease(sentryOptions.getRelease());
            iOptionsObserver.setProguardUuid(sentryOptions.getProguardUuid());
            iOptionsObserver.setSdkVersion(sentryOptions.getSdkVersion());
            iOptionsObserver.setDist(sentryOptions.getDist());
            iOptionsObserver.setEnvironment(sentryOptions.getEnvironment());
            iOptionsObserver.setTags(sentryOptions.getTags());
            iOptionsObserver.setReplayErrorSampleRate(sentryOptions.getSessionReplay().getOnErrorSampleRate());
        }
    }

    private static void notifyOptionsObservers(io.sentry.SentryOptions sentryOptions) {
        try {
            sentryOptions.getExecutorService().submit(new io.sentry.k(sentryOptions, 1));
        } catch (java.lang.Throwable th) {
            sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Failed to notify options observers.", th);
        }
    }

    @java.lang.Deprecated
    public static void popScope() {
        if (globalHubMode) {
            return;
        }
        getCurrentScopes().popScope();
    }

    private static boolean preInitConfigurations(io.sentry.SentryOptions sentryOptions) {
        if (sentryOptions.isEnableExternalConfiguration()) {
            sentryOptions.merge(io.sentry.ExternalOptions.from(io.sentry.config.PropertiesProviderFactory.create(), sentryOptions.getLogger()));
        }
        java.lang.String dsn = sentryOptions.getDsn();
        if (!sentryOptions.isEnabled() || (dsn != null && dsn.isEmpty())) {
            close();
            return false;
        }
        if (dsn == null) {
            throw new java.lang.IllegalArgumentException("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        }
        sentryOptions.retrieveParsedDsn();
        return true;
    }

    public static io.sentry.ISentryLifecycleToken pushIsolationScope() {
        return !globalHubMode ? getCurrentScopes().pushIsolationScope() : io.sentry.NoOpScopesLifecycleToken.getInstance();
    }

    public static io.sentry.ISentryLifecycleToken pushScope() {
        return !globalHubMode ? getCurrentScopes().pushScope() : io.sentry.NoOpScopesLifecycleToken.getInstance();
    }

    public static void removeExtra(java.lang.String str) {
        getCurrentScopes().removeExtra(str);
    }

    public static void removeTag(java.lang.String str) {
        getCurrentScopes().removeTag(str);
    }

    public static void reportFullyDisplayed() {
        getCurrentScopes().reportFullyDisplayed();
    }

    private static io.sentry.TracesSamplingDecision sampleAppStartProfiling(io.sentry.SentryOptions sentryOptions) {
        io.sentry.TransactionContext transactionContext = new io.sentry.TransactionContext("app.launch", "profile");
        transactionContext.setForNextAppStart(true);
        return sentryOptions.getInternalTracesSampler().sample(new io.sentry.SamplingContext(transactionContext, null, java.lang.Double.valueOf(io.sentry.util.SentryRandom.current().nextDouble()), null));
    }

    @java.lang.Deprecated
    public static io.sentry.ISentryLifecycleToken setCurrentHub(io.sentry.IHub iHub) {
        return setCurrentScopes(iHub);
    }

    public static io.sentry.ISentryLifecycleToken setCurrentScopes(io.sentry.IScopes iScopes) {
        return getScopesStorage().set(iScopes);
    }

    public static void setExtra(java.lang.String str, java.lang.String str2) {
        getCurrentScopes().setExtra(str, str2);
    }

    public static void setFingerprint(java.util.List<java.lang.String> list) {
        getCurrentScopes().setFingerprint(list);
    }

    public static void setLevel(io.sentry.SentryLevel sentryLevel) {
        getCurrentScopes().setLevel(sentryLevel);
    }

    public static void setTag(java.lang.String str, java.lang.String str2) {
        getCurrentScopes().setTag(str, str2);
    }

    public static void setTransaction(java.lang.String str) {
        getCurrentScopes().setTransaction(str);
    }

    public static void setUser(io.sentry.protocol.User user) {
        getCurrentScopes().setUser(user);
    }

    public static void startSession() {
        getCurrentScopes().startSession();
    }

    public static io.sentry.ITransaction startTransaction(java.lang.String str, java.lang.String str2) {
        return getCurrentScopes().startTransaction(str, str2);
    }

    public static void withIsolationScope(io.sentry.ScopeCallback scopeCallback) {
        getCurrentScopes().withIsolationScope(scopeCallback);
    }

    public static void withScope(io.sentry.ScopeCallback scopeCallback) {
        getCurrentScopes().withScope(scopeCallback);
    }

    public static void addBreadcrumb(io.sentry.Breadcrumb breadcrumb) {
        getCurrentScopes().addBreadcrumb(breadcrumb);
    }

    public static io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.ScopeCallback scopeCallback) {
        return getCurrentScopes().captureEvent(sentryEvent, scopeCallback);
    }

    public static io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.ScopeCallback scopeCallback) {
        return getCurrentScopes().captureException(th, scopeCallback);
    }

    public static io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.ScopeCallback scopeCallback) {
        return getCurrentScopes().captureMessage(str, scopeCallback);
    }

    public static void configureScope(io.sentry.ScopeType scopeType, io.sentry.ScopeCallback scopeCallback) {
        getCurrentScopes().configureScope(scopeType, scopeCallback);
    }

    public static void init(java.lang.String str) {
        init(new io.sentry.m(str));
    }

    public static io.sentry.ITransaction startTransaction(java.lang.String str, java.lang.String str2, io.sentry.TransactionOptions transactionOptions) {
        return getCurrentScopes().startTransaction(str, str2, transactionOptions);
    }

    public static void addBreadcrumb(java.lang.String str) {
        getCurrentScopes().addBreadcrumb(str);
    }

    public static io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint) {
        return getCurrentScopes().captureEvent(sentryEvent, hint);
    }

    public static io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.Hint hint) {
        return getCurrentScopes().captureException(th, hint);
    }

    public static io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.SentryLevel sentryLevel) {
        return getCurrentScopes().captureMessage(str, sentryLevel);
    }

    public static <T extends io.sentry.SentryOptions> void init(io.sentry.OptionsContainer<T> optionsContainer, io.sentry.Sentry.OptionsConfiguration<T> optionsConfiguration) {
        init(optionsContainer, optionsConfiguration, false);
    }

    public static io.sentry.ITransaction startTransaction(java.lang.String str, java.lang.String str2, java.lang.String str3, io.sentry.TransactionOptions transactionOptions) {
        io.sentry.ITransaction iTransactionStartTransaction = getCurrentScopes().startTransaction(str, str2, transactionOptions);
        iTransactionStartTransaction.setDescription(str3);
        return iTransactionStartTransaction;
    }

    public static void addBreadcrumb(java.lang.String str, java.lang.String str2) {
        getCurrentScopes().addBreadcrumb(str, str2);
    }

    public static io.sentry.protocol.SentryId captureEvent(io.sentry.SentryEvent sentryEvent, io.sentry.Hint hint, io.sentry.ScopeCallback scopeCallback) {
        return getCurrentScopes().captureEvent(sentryEvent, hint, scopeCallback);
    }

    public static io.sentry.protocol.SentryId captureException(java.lang.Throwable th, io.sentry.Hint hint, io.sentry.ScopeCallback scopeCallback) {
        return getCurrentScopes().captureException(th, hint, scopeCallback);
    }

    public static io.sentry.protocol.SentryId captureMessage(java.lang.String str, io.sentry.SentryLevel sentryLevel, io.sentry.ScopeCallback scopeCallback) {
        return getCurrentScopes().captureMessage(str, sentryLevel, scopeCallback);
    }

    public static <T extends io.sentry.SentryOptions> void init(io.sentry.OptionsContainer<T> optionsContainer, io.sentry.Sentry.OptionsConfiguration<T> optionsConfiguration, boolean z6) {
        T tCreateInstance = optionsContainer.createInstance();
        applyOptionsConfiguration(optionsConfiguration, tCreateInstance);
        init(tCreateInstance, z6);
    }

    public static io.sentry.ITransaction startTransaction(io.sentry.TransactionContext transactionContext) {
        return getCurrentScopes().startTransaction(transactionContext);
    }

    public static io.sentry.ITransaction startTransaction(io.sentry.TransactionContext transactionContext, io.sentry.TransactionOptions transactionOptions) {
        return getCurrentScopes().startTransaction(transactionContext, transactionOptions);
    }

    public static void init(io.sentry.Sentry.OptionsConfiguration<io.sentry.SentryOptions> optionsConfiguration) {
        init(optionsConfiguration, false);
    }

    public static void init(io.sentry.Sentry.OptionsConfiguration<io.sentry.SentryOptions> optionsConfiguration, boolean z6) {
        io.sentry.SentryOptions sentryOptions = new io.sentry.SentryOptions();
        applyOptionsConfiguration(optionsConfiguration, sentryOptions);
        init(sentryOptions, z6);
    }

    public static void init(io.sentry.SentryOptions sentryOptions) {
        init(sentryOptions, false);
    }

    private static void init(io.sentry.SentryOptions sentryOptions, boolean z6) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = lock.acquire();
        try {
            if (!sentryOptions.getClass().getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.Platform.isAndroid()) {
                throw new java.lang.IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(sentryOptions.getClass().getName()));
            }
            if (!preInitConfigurations(sentryOptions)) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            java.lang.Boolean boolIsGlobalHubMode = sentryOptions.isGlobalHubMode();
            if (boolIsGlobalHubMode != null) {
                z6 = boolIsGlobalHubMode.booleanValue();
            }
            sentryOptions.getLogger().log(io.sentry.SentryLevel.INFO, "GlobalHubMode: '%s'", java.lang.String.valueOf(z6));
            globalHubMode = z6;
            if (io.sentry.util.InitUtil.shouldInit(globalScope.getOptions(), sentryOptions, isEnabled())) {
                if (isEnabled()) {
                    sentryOptions.getLogger().log(io.sentry.SentryLevel.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new java.lang.Object[0]);
                }
                try {
                    sentryOptions.getExecutorService().submit(new io.sentry.k(sentryOptions, 2));
                } catch (java.util.concurrent.RejectedExecutionException e6) {
                    sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e6);
                }
                getCurrentScopes().close(true);
                io.sentry.IScope iScope = globalScope;
                iScope.replaceOptions(sentryOptions);
                rootScopes = new io.sentry.Scopes(new io.sentry.Scope(sentryOptions), new io.sentry.Scope(sentryOptions), iScope, "Sentry.init");
                initLogger(sentryOptions);
                initForOpenTelemetryMaybe(sentryOptions);
                getScopesStorage().set(rootScopes);
                initConfigurations(sentryOptions);
                iScope.bindClient(new io.sentry.SentryClient(sentryOptions));
                if (sentryOptions.getExecutorService().isClosed()) {
                    sentryOptions.setExecutorService(new io.sentry.SentryExecutorService());
                }
                java.util.Iterator<io.sentry.Integration> it = sentryOptions.getIntegrations().iterator();
                while (it.hasNext()) {
                    it.next().register(io.sentry.ScopesAdapter.getInstance(), sentryOptions);
                }
                notifyOptionsObservers(sentryOptions);
                finalizePreviousSession(sentryOptions, io.sentry.ScopesAdapter.getInstance());
                handleAppStartProfilingConfig(sentryOptions, sentryOptions.getExecutorService());
                io.sentry.ILogger logger = sentryOptions.getLogger();
                io.sentry.SentryLevel sentryLevel = io.sentry.SentryLevel.DEBUG;
                logger.log(sentryLevel, "Using openTelemetryMode %s", sentryOptions.getOpenTelemetryMode());
                sentryOptions.getLogger().log(sentryLevel, "Using span factory %s", sentryOptions.getSpanFactory().getClass().getName());
                sentryOptions.getLogger().log(sentryLevel, "Using scopes storage %s", scopesStorage.getClass().getName());
            } else {
                sentryOptions.getLogger().log(io.sentry.SentryLevel.WARNING, "This init call has been ignored due to priority being too low.", new java.lang.Object[0]);
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
}
