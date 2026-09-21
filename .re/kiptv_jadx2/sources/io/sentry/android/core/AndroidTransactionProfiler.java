package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransaction;
import io.sentry.ITransactionProfiler;
import io.sentry.PerformanceCollectionData;
import io.sentry.ProfilingTraceData;
import io.sentry.ProfilingTransactionData;
import io.sentry.ScopesAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.CpuInfoUtils;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class AndroidTransactionProfiler implements ITransactionProfiler {
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private ProfilingTransactionData currentProfilingTransactionData;
    private final ISentryExecutorService executorService;
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private boolean isInitialized;
    private final boolean isProfilingEnabled;
    private final AutoClosableReentrantLock lock;
    private final ILogger logger;
    private long profileStartCpuMillis;
    private long profileStartNanos;
    private Date profileStartTimestamp;
    private AndroidProfiler profiler;
    private final String profilingTracesDirPath;
    private final int profilingTracesHz;
    private int transactionsCounter;

    public AndroidTransactionProfiler(Context context, SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider, SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this(context, buildInfoProvider, sentryFrameMetricsCollector, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    private void init() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        if (!this.isProfilingEnabled) {
            this.logger.log(SentryLevel.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.profilingTracesDirPath;
        if (str == null) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i3 = this.profilingTracesHz;
        if (i3 <= 0) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i3));
        } else {
            this.profiler = new AndroidProfiler(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.profilingTracesHz, this.frameMetricsCollector, this.executorService, this.logger);
        }
    }

    public static List lambda$onTransactionFinish$0() {
        return CpuInfoUtils.getInstance().readMaxFrequencies();
    }

    private boolean onFirstStart() {
        AndroidProfiler.ProfileStartData profileStartDataStart;
        AndroidProfiler androidProfiler = this.profiler;
        if (androidProfiler == null || (profileStartDataStart = androidProfiler.start()) == null) {
            return false;
        }
        this.profileStartNanos = profileStartDataStart.startNanos;
        this.profileStartCpuMillis = profileStartDataStart.startCpuMillis;
        this.profileStartTimestamp = profileStartDataStart.startTimestamp;
        return true;
    }

    @Override
    public void bindTransaction(ITransaction iTransaction) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.transactionsCounter > 0 && this.currentProfilingTransactionData == null) {
                this.currentProfilingTransactionData = new ProfilingTransactionData(iTransaction, Long.valueOf(this.profileStartNanos), Long.valueOf(this.profileStartCpuMillis));
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

    @Override
    public void close() {
        AndroidTransactionProfiler androidTransactionProfiler;
        ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
        if (profilingTransactionData != null) {
            androidTransactionProfiler = this;
            androidTransactionProfiler.onTransactionFinish(profilingTransactionData.getName(), this.currentProfilingTransactionData.getId(), this.currentProfilingTransactionData.getTraceId(), true, null, ScopesAdapter.getInstance().getOptions());
        } else {
            androidTransactionProfiler = this;
            int i3 = androidTransactionProfiler.transactionsCounter;
            if (i3 != 0) {
                androidTransactionProfiler.transactionsCounter = i3 - 1;
            }
        }
        AndroidProfiler androidProfiler = androidTransactionProfiler.profiler;
        if (androidProfiler != null) {
            androidProfiler.close();
        }
    }

    public int getTransactionsCounter() {
        return this.transactionsCounter;
    }

    @Override
    public boolean isRunning() {
        return this.transactionsCounter != 0;
    }

    @Override
    public ProfilingTraceData onTransactionFinish(ITransaction iTransaction, List<PerformanceCollectionData> list, SentryOptions sentryOptions) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            ProfilingTraceData profilingTraceDataOnTransactionFinish = onTransactionFinish(iTransaction.getName(), iTransaction.getEventId().toString(), iTransaction.getSpanContext().getTraceId().toString(), false, list, sentryOptions);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return profilingTraceDataOnTransactionFinish;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override
    public void start() {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
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
                this.logger.log(SentryLevel.DEBUG, "Profiler started.", new Object[0]);
            } else {
                this.transactionsCounter--;
                this.logger.log(SentryLevel.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
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

    public AndroidTransactionProfiler(Context context, BuildInfoProvider buildInfoProvider, SentryFrameMetricsCollector sentryFrameMetricsCollector, ILogger iLogger, String str, boolean z6, int i3, ISentryExecutorService iSentryExecutorService) {
        this.isInitialized = false;
        this.transactionsCounter = 0;
        this.profiler = null;
        this.lock = new AutoClosableReentrantLock();
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The application context is required");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "ILogger is required");
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.profilingTracesDirPath = str;
        this.isProfilingEnabled = z6;
        this.profilingTracesHz = i3;
        this.executorService = (ISentryExecutorService) Objects.requireNonNull(iSentryExecutorService, "The ISentryExecutorService is required.");
        this.profileStartTimestamp = DateUtils.getCurrentDateTime();
    }

    private ProfilingTraceData onTransactionFinish(String str, String str2, String str3, boolean z6, List<PerformanceCollectionData> list, SentryOptions sentryOptions) {
        String str4;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
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
            ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
            if (profilingTransactionData != null && profilingTransactionData.getId().equals(str2)) {
                int i3 = this.transactionsCounter;
                if (i3 > 0) {
                    this.transactionsCounter = i3 - 1;
                }
                this.logger.log(SentryLevel.DEBUG, "Transaction %s (%s) finished.", str, str3);
                if (this.transactionsCounter != 0) {
                    ProfilingTransactionData profilingTransactionData2 = this.currentProfilingTransactionData;
                    if (profilingTransactionData2 != null) {
                        profilingTransactionData2.notifyFinish(Long.valueOf(SystemClock.elapsedRealtimeNanos()), Long.valueOf(this.profileStartNanos), Long.valueOf(Process.getElapsedCpuTime()), Long.valueOf(this.profileStartCpuMillis));
                    }
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                    return null;
                }
                boolean z9 = false;
                AndroidProfiler.ProfileEndData profileEndDataEndAndCollect = this.profiler.endAndCollect(false, list);
                if (profileEndDataEndAndCollect == null) {
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                    return null;
                }
                long j = profileEndDataEndAndCollect.endNanos - this.profileStartNanos;
                ArrayList arrayList = new ArrayList(1);
                ProfilingTransactionData profilingTransactionData3 = this.currentProfilingTransactionData;
                if (profilingTransactionData3 != null) {
                    arrayList.add(profilingTransactionData3);
                }
                this.currentProfilingTransactionData = null;
                this.transactionsCounter = 0;
                String string = "0";
                Long totalMemory = sentryOptions instanceof SentryAndroidOptions ? DeviceInfoUtil.getInstance(this.context, (SentryAndroidOptions) sentryOptions).getTotalMemory() : null;
                if (totalMemory != null) {
                    string = Long.toString(totalMemory.longValue());
                }
                String str5 = string;
                String[] strArr = Build.SUPPORTED_ABIS;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ProfilingTransactionData) it.next()).notifyFinish(Long.valueOf(profileEndDataEndAndCollect.endNanos), Long.valueOf(this.profileStartNanos), Long.valueOf(profileEndDataEndAndCollect.endCpuMillis), Long.valueOf(this.profileStartCpuMillis));
                    z9 = z9;
                }
                boolean z10 = z9;
                File file = profileEndDataEndAndCollect.traceFile;
                Date date = this.profileStartTimestamp;
                String string2 = Long.toString(j);
                int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
                String str6 = (strArr == null || strArr.length <= 0) ? "" : strArr[z10 ? 1 : 0];
                k kVar = new k();
                String manufacturer = this.buildInfoProvider.getManufacturer();
                String model = this.buildInfoProvider.getModel();
                String versionRelease = this.buildInfoProvider.getVersionRelease();
                Boolean boolIsEmulator = this.buildInfoProvider.isEmulator();
                String proguardUuid = sentryOptions.getProguardUuid();
                String release = sentryOptions.getRelease();
                String environment = sentryOptions.getEnvironment();
                if (!profileEndDataEndAndCollect.didTimeout && !z6) {
                    str4 = ProfilingTraceData.TRUNCATION_REASON_NORMAL;
                } else {
                    str4 = ProfilingTraceData.TRUNCATION_REASON_TIMEOUT;
                }
                ProfilingTraceData profilingTraceData = new ProfilingTraceData(file, date, arrayList, str, str2, str3, string2, sdkInfoVersion, str6, kVar, manufacturer, model, versionRelease, boolIsEmulator, str5, proguardUuid, release, environment, str4, profileEndDataEndAndCollect.measurementsMap);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return profilingTraceData;
            }
            this.logger.log(SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return null;
        } catch (Throwable th) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
