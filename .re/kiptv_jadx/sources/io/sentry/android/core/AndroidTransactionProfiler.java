package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
final class AndroidTransactionProfiler implements io.sentry.ITransactionProfiler {
    private final io.sentry.android.core.BuildInfoProvider buildInfoProvider;
    private final android.content.Context context;
    private io.sentry.ProfilingTransactionData currentProfilingTransactionData;
    private final io.sentry.ISentryExecutorService executorService;
    private final io.sentry.android.core.internal.util.SentryFrameMetricsCollector frameMetricsCollector;
    private boolean isInitialized;
    private final boolean isProfilingEnabled;
    private final io.sentry.util.AutoClosableReentrantLock lock;
    private final io.sentry.ILogger logger;
    private long profileStartCpuMillis;
    private long profileStartNanos;
    private java.util.Date profileStartTimestamp;
    private io.sentry.android.core.AndroidProfiler profiler;
    private final java.lang.String profilingTracesDirPath;
    private final int profilingTracesHz;
    private int transactionsCounter;

    public AndroidTransactionProfiler(android.content.Context context, io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.BuildInfoProvider buildInfoProvider, io.sentry.android.core.internal.util.SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this(context, buildInfoProvider, sentryFrameMetricsCollector, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    private void init() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        if (!this.isProfilingEnabled) {
            this.logger.log(io.sentry.SentryLevel.INFO, "Profiling is disabled in options.", new java.lang.Object[0]);
            return;
        }
        java.lang.String str = this.profilingTracesDirPath;
        if (str == null) {
            this.logger.log(io.sentry.SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new java.lang.Object[0]);
            return;
        }
        int i3 = this.profilingTracesHz;
        if (i3 <= 0) {
            this.logger.log(io.sentry.SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", java.lang.Integer.valueOf(i3));
        } else {
            this.profiler = new io.sentry.android.core.AndroidProfiler(str, ((int) java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)) / this.profilingTracesHz, this.frameMetricsCollector, this.executorService, this.logger);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$onTransactionFinish$0() {
        return io.sentry.android.core.internal.util.CpuInfoUtils.getInstance().readMaxFrequencies();
    }

    private boolean onFirstStart() {
        io.sentry.android.core.AndroidProfiler.ProfileStartData profileStartDataStart;
        io.sentry.android.core.AndroidProfiler androidProfiler = this.profiler;
        if (androidProfiler == null || (profileStartDataStart = androidProfiler.start()) == null) {
            return false;
        }
        this.profileStartNanos = profileStartDataStart.startNanos;
        this.profileStartCpuMillis = profileStartDataStart.startCpuMillis;
        this.profileStartTimestamp = profileStartDataStart.startTimestamp;
        return true;
    }

    @Override // io.sentry.ITransactionProfiler
    public void bindTransaction(io.sentry.ITransaction iTransaction) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.transactionsCounter > 0 && this.currentProfilingTransactionData == null) {
                this.currentProfilingTransactionData = new io.sentry.ProfilingTransactionData(iTransaction, java.lang.Long.valueOf(this.profileStartNanos), java.lang.Long.valueOf(this.profileStartCpuMillis));
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

    @Override // io.sentry.ITransactionProfiler
    public void close() {
        io.sentry.android.core.AndroidTransactionProfiler androidTransactionProfiler;
        io.sentry.ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
        if (profilingTransactionData != null) {
            androidTransactionProfiler = this;
            androidTransactionProfiler.onTransactionFinish(profilingTransactionData.getName(), this.currentProfilingTransactionData.getId(), this.currentProfilingTransactionData.getTraceId(), true, null, io.sentry.ScopesAdapter.getInstance().getOptions());
        } else {
            androidTransactionProfiler = this;
            int i3 = androidTransactionProfiler.transactionsCounter;
            if (i3 != 0) {
                androidTransactionProfiler.transactionsCounter = i3 - 1;
            }
        }
        io.sentry.android.core.AndroidProfiler androidProfiler = androidTransactionProfiler.profiler;
        if (androidProfiler != null) {
            androidProfiler.close();
        }
    }

    public int getTransactionsCounter() {
        return this.transactionsCounter;
    }

    @Override // io.sentry.ITransactionProfiler
    public boolean isRunning() {
        return this.transactionsCounter != 0;
    }

    @Override // io.sentry.ITransactionProfiler
    public io.sentry.ProfilingTraceData onTransactionFinish(io.sentry.ITransaction iTransaction, java.util.List<io.sentry.PerformanceCollectionData> list, io.sentry.SentryOptions sentryOptions) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            io.sentry.ProfilingTraceData profilingTraceDataOnTransactionFinish = onTransactionFinish(iTransaction.getName(), iTransaction.getEventId().toString(), iTransaction.getSpanContext().getTraceId().toString(), false, list, sentryOptions);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return profilingTraceDataOnTransactionFinish;
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // io.sentry.ITransactionProfiler
    public void start() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.buildInfoProvider.getSdkInfoVersion() < 22) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            init();
            int i3 = this.transactionsCounter + 1;
            this.transactionsCounter = i3;
            if (i3 == 1 && onFirstStart()) {
                this.logger.log(io.sentry.SentryLevel.DEBUG, "Profiler started.", new java.lang.Object[0]);
            } else {
                this.transactionsCounter--;
                this.logger.log(io.sentry.SentryLevel.WARNING, "A profile is already running. This profile will be ignored.", new java.lang.Object[0]);
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

    public AndroidTransactionProfiler(android.content.Context context, io.sentry.android.core.BuildInfoProvider buildInfoProvider, io.sentry.android.core.internal.util.SentryFrameMetricsCollector sentryFrameMetricsCollector, io.sentry.ILogger iLogger, java.lang.String str, boolean z6, int i3, io.sentry.ISentryExecutorService iSentryExecutorService) {
        this.isInitialized = false;
        this.transactionsCounter = 0;
        this.profiler = null;
        this.lock = new io.sentry.util.AutoClosableReentrantLock();
        this.context = (android.content.Context) io.sentry.util.Objects.requireNonNull(io.sentry.android.core.ContextUtils.getApplicationContext(context), "The application context is required");
        this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "ILogger is required");
        this.frameMetricsCollector = (io.sentry.android.core.internal.util.SentryFrameMetricsCollector) io.sentry.util.Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
        this.buildInfoProvider = (io.sentry.android.core.BuildInfoProvider) io.sentry.util.Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.profilingTracesDirPath = str;
        this.isProfilingEnabled = z6;
        this.profilingTracesHz = i3;
        this.executorService = (io.sentry.ISentryExecutorService) io.sentry.util.Objects.requireNonNull(iSentryExecutorService, "The ISentryExecutorService is required.");
        this.profileStartTimestamp = io.sentry.DateUtils.getCurrentDateTime();
    }

    private io.sentry.ProfilingTraceData onTransactionFinish(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, java.util.List<io.sentry.PerformanceCollectionData> list, io.sentry.SentryOptions sentryOptions) {
        java.lang.String str4;
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.profiler == null) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            if (this.buildInfoProvider.getSdkInfoVersion() < 22) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            io.sentry.ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
            if (profilingTransactionData != null && profilingTransactionData.getId().equals(str2)) {
                int i3 = this.transactionsCounter;
                if (i3 > 0) {
                    this.transactionsCounter = i3 - 1;
                }
                this.logger.log(io.sentry.SentryLevel.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.transactionsCounter != 0) {
                    io.sentry.ProfilingTransactionData profilingTransactionData2 = this.currentProfilingTransactionData;
                    if (profilingTransactionData2 != null) {
                        profilingTransactionData2.notifyFinish(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtimeNanos()), java.lang.Long.valueOf(this.profileStartNanos), java.lang.Long.valueOf(android.os.Process.getElapsedCpuTime()), java.lang.Long.valueOf(this.profileStartCpuMillis));
                    }
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                    return null;
                }
                boolean z9 = false;
                io.sentry.android.core.AndroidProfiler.ProfileEndData profileEndDataEndAndCollect = this.profiler.endAndCollect(false, list);
                if (profileEndDataEndAndCollect == null) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                    return null;
                }
                long j = profileEndDataEndAndCollect.endNanos - this.profileStartNanos;
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                io.sentry.ProfilingTransactionData profilingTransactionData3 = this.currentProfilingTransactionData;
                if (profilingTransactionData3 != null) {
                    arrayList.add(profilingTransactionData3);
                }
                this.currentProfilingTransactionData = null;
                this.transactionsCounter = 0;
                java.lang.String string = "0";
                java.lang.Long totalMemory = sentryOptions instanceof io.sentry.android.core.SentryAndroidOptions ? io.sentry.android.core.DeviceInfoUtil.getInstance(this.context, (io.sentry.android.core.SentryAndroidOptions) sentryOptions).getTotalMemory() : null;
                if (totalMemory != null) {
                    string = java.lang.Long.toString(totalMemory.longValue());
                }
                java.lang.String str5 = string;
                java.lang.String[] strArr = android.os.Build.SUPPORTED_ABIS;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((io.sentry.ProfilingTransactionData) it.next()).notifyFinish(java.lang.Long.valueOf(profileEndDataEndAndCollect.endNanos), java.lang.Long.valueOf(this.profileStartNanos), java.lang.Long.valueOf(profileEndDataEndAndCollect.endCpuMillis), java.lang.Long.valueOf(this.profileStartCpuMillis));
                    z9 = z9;
                }
                boolean z10 = z9;
                java.io.File file = profileEndDataEndAndCollect.traceFile;
                java.util.Date date = this.profileStartTimestamp;
                java.lang.String string2 = java.lang.Long.toString(j);
                int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
                java.lang.String str6 = (strArr == null || strArr.length <= 0) ? "" : strArr[z10 ? 1 : 0];
                io.sentry.android.core.k kVar = new io.sentry.android.core.k();
                java.lang.String manufacturer = this.buildInfoProvider.getManufacturer();
                java.lang.String model = this.buildInfoProvider.getModel();
                java.lang.String versionRelease = this.buildInfoProvider.getVersionRelease();
                java.lang.Boolean boolIsEmulator = this.buildInfoProvider.isEmulator();
                java.lang.String proguardUuid = sentryOptions.getProguardUuid();
                java.lang.String release = sentryOptions.getRelease();
                java.lang.String environment = sentryOptions.getEnvironment();
                if (!profileEndDataEndAndCollect.didTimeout && !z6) {
                    str4 = io.sentry.ProfilingTraceData.TRUNCATION_REASON_NORMAL;
                } else {
                    str4 = io.sentry.ProfilingTraceData.TRUNCATION_REASON_TIMEOUT;
                }
                io.sentry.ProfilingTraceData profilingTraceData = new io.sentry.ProfilingTraceData(file, date, arrayList, str, str2, str3, string2, sdkInfoVersion, str6, kVar, manufacturer, model, versionRelease, boolIsEmulator, str5, proguardUuid, release, environment, str4, profileEndDataEndAndCollect.measurementsMap);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return profilingTraceData;
            }
            this.logger.log(io.sentry.SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return null;
        } catch (java.lang.Throwable th) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
