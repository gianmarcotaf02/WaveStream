package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public class AndroidProfiler {
    private static final int BUFFER_SIZE_BYTES = 3000000;
    private static final int PROFILING_TIMEOUT_MILLIS = 30000;
    private final io.sentry.ISentryExecutorService executorService;
    private final io.sentry.android.core.internal.util.SentryFrameMetricsCollector frameMetricsCollector;
    private java.lang.String frameMetricsCollectorId;
    private final int intervalUs;
    private final io.sentry.ILogger logger;
    private final java.io.File traceFilesDir;
    private long profileStartNanos = 0;
    private java.util.concurrent.Future<?> scheduledFinish = null;
    private java.io.File traceFile = null;
    private final java.util.ArrayDeque<io.sentry.profilemeasurements.ProfileMeasurementValue> screenFrameRateMeasurements = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<io.sentry.profilemeasurements.ProfileMeasurementValue> slowFrameRenderMeasurements = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<io.sentry.profilemeasurements.ProfileMeasurementValue> frozenFrameRenderMeasurements = new java.util.ArrayDeque<>();
    private final java.util.Map<java.lang.String, io.sentry.profilemeasurements.ProfileMeasurement> measurementsMap = new java.util.HashMap();
    private boolean isRunning = false;
    protected final io.sentry.util.AutoClosableReentrantLock lock = new io.sentry.util.AutoClosableReentrantLock();

    public static class ProfileEndData {
        public final boolean didTimeout;
        public final long endCpuMillis;
        public final long endNanos;
        public final java.util.Map<java.lang.String, io.sentry.profilemeasurements.ProfileMeasurement> measurementsMap;
        public final java.io.File traceFile;

        public ProfileEndData(long j, long j9, boolean z6, java.io.File file, java.util.Map<java.lang.String, io.sentry.profilemeasurements.ProfileMeasurement> map) {
            this.endNanos = j;
            this.traceFile = file;
            this.endCpuMillis = j9;
            this.measurementsMap = map;
            this.didTimeout = z6;
        }
    }

    public static class ProfileStartData {
        public final long startCpuMillis;
        public final long startNanos;
        public final java.util.Date startTimestamp;

        public ProfileStartData(long j, long j9, java.util.Date date) {
            this.startNanos = j;
            this.startCpuMillis = j9;
            this.startTimestamp = date;
        }
    }

    public AndroidProfiler(java.lang.String str, int i3, io.sentry.android.core.internal.util.SentryFrameMetricsCollector sentryFrameMetricsCollector, io.sentry.ISentryExecutorService iSentryExecutorService, io.sentry.ILogger iLogger) {
        this.traceFilesDir = new java.io.File((java.lang.String) io.sentry.util.Objects.requireNonNull(str, "TracesFilesDirPath is required"));
        this.intervalUs = i3;
        this.logger = (io.sentry.ILogger) io.sentry.util.Objects.requireNonNull(iLogger, "Logger is required");
        this.executorService = (io.sentry.ISentryExecutorService) io.sentry.util.Objects.requireNonNull(iSentryExecutorService, "ExecutorService is required.");
        this.frameMetricsCollector = (io.sentry.android.core.internal.util.SentryFrameMetricsCollector) io.sentry.util.Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        endAndCollect(true, null);
    }

    private void putPerformanceCollectionDataInMeasurements(java.util.List<io.sentry.PerformanceCollectionData> list) {
        long jElapsedRealtimeNanos = (android.os.SystemClock.elapsedRealtimeNanos() - this.profileStartNanos) - java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis());
        if (list != null) {
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(list.size());
            java.util.ArrayDeque arrayDeque2 = new java.util.ArrayDeque(list.size());
            java.util.ArrayDeque arrayDeque3 = new java.util.ArrayDeque(list.size());
            synchronized (list) {
                try {
                    for (io.sentry.PerformanceCollectionData performanceCollectionData : list) {
                        io.sentry.CpuCollectionData cpuData = performanceCollectionData.getCpuData();
                        io.sentry.MemoryCollectionData memoryData = performanceCollectionData.getMemoryData();
                        if (cpuData != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.ProfileMeasurementValue(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(cpuData.getTimestampMillis()) + jElapsedRealtimeNanos), java.lang.Double.valueOf(cpuData.getCpuUsagePercentage())));
                        }
                        if (memoryData != null && memoryData.getUsedHeapMemory() > -1) {
                            arrayDeque.add(new io.sentry.profilemeasurements.ProfileMeasurementValue(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(memoryData.getTimestampMillis()) + jElapsedRealtimeNanos), java.lang.Long.valueOf(memoryData.getUsedHeapMemory())));
                        }
                        if (memoryData != null && memoryData.getUsedNativeMemory() > -1) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.ProfileMeasurementValue(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(memoryData.getTimestampMillis()) + jElapsedRealtimeNanos), java.lang.Long.valueOf(memoryData.getUsedNativeMemory())));
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.measurementsMap.put(io.sentry.profilemeasurements.ProfileMeasurement.ID_CPU_USAGE, new io.sentry.profilemeasurements.ProfileMeasurement(io.sentry.profilemeasurements.ProfileMeasurement.UNIT_PERCENT, arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.measurementsMap.put(io.sentry.profilemeasurements.ProfileMeasurement.ID_MEMORY_FOOTPRINT, new io.sentry.profilemeasurements.ProfileMeasurement(io.sentry.profilemeasurements.ProfileMeasurement.UNIT_BYTES, arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.measurementsMap.put(io.sentry.profilemeasurements.ProfileMeasurement.ID_MEMORY_NATIVE_FOOTPRINT, new io.sentry.profilemeasurements.ProfileMeasurement(io.sentry.profilemeasurements.ProfileMeasurement.UNIT_BYTES, arrayDeque2));
        }
    }

    public void close() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            java.util.concurrent.Future<?> future = this.scheduledFinish;
            if (future != null) {
                future.cancel(true);
                this.scheduledFinish = null;
            }
            if (this.isRunning) {
                endAndCollect(true, null);
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

    public io.sentry.android.core.AndroidProfiler.ProfileEndData endAndCollect(boolean z6, java.util.List<io.sentry.PerformanceCollectionData> list) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.isRunning) {
                this.logger.log(io.sentry.SentryLevel.WARNING, "Profiler not running", new java.lang.Object[0]);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            try {
                android.os.Debug.stopMethodTracing();
            } catch (java.lang.Throwable th) {
                try {
                    this.logger.log(io.sentry.SentryLevel.ERROR, "Error while stopping profiling: ", th);
                } catch (java.lang.Throwable th2) {
                    this.isRunning = false;
                    throw th2;
                }
            }
            this.isRunning = false;
            this.frameMetricsCollector.stopCollection(this.frameMetricsCollectorId);
            long jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
            if (this.traceFile == null) {
                this.logger.log(io.sentry.SentryLevel.ERROR, "Trace file does not exists", new java.lang.Object[0]);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                return null;
            }
            if (!this.slowFrameRenderMeasurements.isEmpty()) {
                this.measurementsMap.put(io.sentry.profilemeasurements.ProfileMeasurement.ID_SLOW_FRAME_RENDERS, new io.sentry.profilemeasurements.ProfileMeasurement(io.sentry.profilemeasurements.ProfileMeasurement.UNIT_NANOSECONDS, this.slowFrameRenderMeasurements));
            }
            if (!this.frozenFrameRenderMeasurements.isEmpty()) {
                this.measurementsMap.put(io.sentry.profilemeasurements.ProfileMeasurement.ID_FROZEN_FRAME_RENDERS, new io.sentry.profilemeasurements.ProfileMeasurement(io.sentry.profilemeasurements.ProfileMeasurement.UNIT_NANOSECONDS, this.frozenFrameRenderMeasurements));
            }
            if (!this.screenFrameRateMeasurements.isEmpty()) {
                this.measurementsMap.put(io.sentry.profilemeasurements.ProfileMeasurement.ID_SCREEN_FRAME_RATES, new io.sentry.profilemeasurements.ProfileMeasurement(io.sentry.profilemeasurements.ProfileMeasurement.UNIT_HZ, this.screenFrameRateMeasurements));
            }
            putPerformanceCollectionDataInMeasurements(list);
            java.util.concurrent.Future<?> future = this.scheduledFinish;
            if (future != null) {
                future.cancel(true);
                this.scheduledFinish = null;
            }
            io.sentry.android.core.AndroidProfiler.ProfileEndData profileEndData = new io.sentry.android.core.AndroidProfiler.ProfileEndData(jElapsedRealtimeNanos, elapsedCpuTime, z6, this.traceFile, this.measurementsMap);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return profileEndData;
        } catch (java.lang.Throwable th3) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th3;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public io.sentry.android.core.AndroidProfiler.ProfileStartData start() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            int i3 = this.intervalUs;
            if (i3 == 0) {
                this.logger.log(io.sentry.SentryLevel.WARNING, "Disabling profiling because intervaUs is set to %d", java.lang.Integer.valueOf(i3));
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return null;
                }
            } else if (this.isRunning) {
                this.logger.log(io.sentry.SentryLevel.WARNING, "Profiling has already started...", new java.lang.Object[0]);
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return null;
                }
            } else {
                this.traceFile = new java.io.File(this.traceFilesDir, io.sentry.SentryUUID.generateSentryId() + ".trace");
                this.measurementsMap.clear();
                this.screenFrameRateMeasurements.clear();
                this.slowFrameRenderMeasurements.clear();
                this.frozenFrameRenderMeasurements.clear();
                this.frameMetricsCollectorId = this.frameMetricsCollector.startCollection(new io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener() { // from class: io.sentry.android.core.AndroidProfiler.1
                    float lastRefreshRate = 0.0f;

                    @Override // io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener
                    public void onFrameMetricCollected(long j, long j9, long j10, long j11, boolean z6, boolean z9, float f9) {
                        long jElapsedRealtimeNanos = (android.os.SystemClock.elapsedRealtimeNanos() + (j9 - java.lang.System.nanoTime())) - io.sentry.android.core.AndroidProfiler.this.profileStartNanos;
                        if (jElapsedRealtimeNanos < 0) {
                            return;
                        }
                        if (z9) {
                            io.sentry.android.core.AndroidProfiler.this.frozenFrameRenderMeasurements.addLast(new io.sentry.profilemeasurements.ProfileMeasurementValue(java.lang.Long.valueOf(jElapsedRealtimeNanos), java.lang.Long.valueOf(j10)));
                        } else if (z6) {
                            io.sentry.android.core.AndroidProfiler.this.slowFrameRenderMeasurements.addLast(new io.sentry.profilemeasurements.ProfileMeasurementValue(java.lang.Long.valueOf(jElapsedRealtimeNanos), java.lang.Long.valueOf(j10)));
                        }
                        if (f9 != this.lastRefreshRate) {
                            this.lastRefreshRate = f9;
                            io.sentry.android.core.AndroidProfiler.this.screenFrameRateMeasurements.addLast(new io.sentry.profilemeasurements.ProfileMeasurementValue(java.lang.Long.valueOf(jElapsedRealtimeNanos), java.lang.Float.valueOf(f9)));
                        }
                    }
                });
                try {
                    this.scheduledFinish = this.executorService.schedule(new io.sentry.android.core.d(1, this), 30000L);
                } catch (java.util.concurrent.RejectedExecutionException e6) {
                    this.logger.log(io.sentry.SentryLevel.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e6);
                }
                this.profileStartNanos = android.os.SystemClock.elapsedRealtimeNanos();
                java.util.Date currentDateTime = io.sentry.DateUtils.getCurrentDateTime();
                long elapsedCpuTime = android.os.Process.getElapsedCpuTime();
                try {
                    android.os.Debug.startMethodTracingSampling(this.traceFile.getPath(), BUFFER_SIZE_BYTES, this.intervalUs);
                    this.isRunning = true;
                    io.sentry.android.core.AndroidProfiler.ProfileStartData profileStartData = new io.sentry.android.core.AndroidProfiler.ProfileStartData(this.profileStartNanos, elapsedCpuTime, currentDateTime);
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                    return profileStartData;
                } catch (java.lang.Throwable th) {
                    endAndCollect(false, null);
                    this.logger.log(io.sentry.SentryLevel.ERROR, "Unable to start a profile: ", th);
                    this.isRunning = false;
                    if (iSentryLifecycleTokenAcquire != null) {
                        iSentryLifecycleTokenAcquire.close();
                    }
                }
            }
            return null;
        } catch (java.lang.Throwable th2) {
            if (iSentryLifecycleTokenAcquire == null) {
                throw th2;
            }
            try {
                iSentryLifecycleTokenAcquire.close();
                throw th2;
            } catch (java.lang.Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
