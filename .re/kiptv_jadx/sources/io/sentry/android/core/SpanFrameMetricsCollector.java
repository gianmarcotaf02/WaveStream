package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public class SpanFrameMetricsCollector implements io.sentry.IPerformanceContinuousCollector, io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener {
    private static final int MAX_FRAMES_COUNT = 3600;
    private final boolean enabled;
    private final io.sentry.android.core.internal.util.SentryFrameMetricsCollector frameMetricsCollector;
    private volatile java.lang.String listenerId;
    private static final long ONE_SECOND_NANOS = java.util.concurrent.TimeUnit.SECONDS.toNanos(1);
    private static final io.sentry.SentryNanotimeDate EMPTY_NANO_TIME = new io.sentry.SentryNanotimeDate(new java.util.Date(0), 0);
    protected final io.sentry.util.AutoClosableReentrantLock lock = new io.sentry.util.AutoClosableReentrantLock();
    private final java.util.SortedSet<io.sentry.ISpan> runningSpans = new java.util.TreeSet(new io.sentry.android.core.o());
    private final java.util.concurrent.ConcurrentSkipListSet<io.sentry.android.core.SpanFrameMetricsCollector.Frame> frames = new java.util.concurrent.ConcurrentSkipListSet<>();
    private long lastKnownFrameDurationNanos = 16666666;

    public static class Frame implements java.lang.Comparable<io.sentry.android.core.SpanFrameMetricsCollector.Frame> {
        private final long delayNanos;
        private final long durationNanos;
        private final long endNanos;
        private final long expectedDurationNanos;
        private final boolean isFrozen;
        private final boolean isSlow;
        private final long startNanos;

        public Frame(long j) {
            this(j, j, 0L, 0L, false, false, 0L);
        }

        public Frame(long j, long j9, long j10, long j11, boolean z6, boolean z9, long j12) {
            this.startNanos = j;
            this.endNanos = j9;
            this.durationNanos = j10;
            this.delayNanos = j11;
            this.isSlow = z6;
            this.isFrozen = z9;
            this.expectedDurationNanos = j12;
        }

        @Override // java.lang.Comparable
        public int compareTo(io.sentry.android.core.SpanFrameMetricsCollector.Frame frame) {
            return java.lang.Long.compare(this.endNanos, frame.endNanos);
        }
    }

    public SpanFrameMetricsCollector(io.sentry.android.core.SentryAndroidOptions sentryAndroidOptions, io.sentry.android.core.internal.util.SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this.frameMetricsCollector = sentryFrameMetricsCollector;
        this.enabled = sentryAndroidOptions.isEnablePerformanceV2() && sentryAndroidOptions.isEnableFramesTracking();
    }

    private static int addPendingFrameDelay(io.sentry.android.core.SentryFrameMetrics sentryFrameMetrics, long j, long j9, long j10) {
        long jMax = java.lang.Math.max(0L, j9 - j10);
        if (!io.sentry.android.core.internal.util.SentryFrameMetricsCollector.isSlow(jMax, j)) {
            return 0;
        }
        sentryFrameMetrics.addFrame(jMax, java.lang.Math.max(0L, jMax - j), true, io.sentry.android.core.internal.util.SentryFrameMetricsCollector.isFrozen(jMax));
        return 1;
    }

    private void captureFrameMetrics(io.sentry.ISpan iSpan) {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.runningSpans.remove(iSpan)) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            io.sentry.SentryDate finishDate = iSpan.getFinishDate();
            if (finishDate == null) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            long nanoTime = toNanoTime(iSpan.getStartDate());
            long nanoTime2 = toNanoTime(finishDate);
            long j = nanoTime2 - nanoTime;
            long j9 = 0;
            if (j <= 0) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            io.sentry.android.core.SentryFrameMetrics sentryFrameMetrics = new io.sentry.android.core.SentryFrameMetrics();
            long j10 = this.lastKnownFrameDurationNanos;
            if (!this.frames.isEmpty()) {
                for (io.sentry.android.core.SpanFrameMetricsCollector.Frame frame : this.frames.tailSet(new io.sentry.android.core.SpanFrameMetricsCollector.Frame(nanoTime))) {
                    if (frame.startNanos > nanoTime2) {
                        break;
                    }
                    if (frame.startNanos >= nanoTime && frame.endNanos <= nanoTime2) {
                        sentryFrameMetrics.addFrame(frame.durationNanos, frame.delayNanos, frame.isSlow, frame.isFrozen);
                    } else if ((nanoTime > frame.startNanos && nanoTime < frame.endNanos) || (nanoTime2 > frame.startNanos && nanoTime2 < frame.endNanos)) {
                        long jMin = java.lang.Math.min(frame.delayNanos - java.lang.Math.max(j9, java.lang.Math.max(j9, nanoTime - frame.startNanos) - frame.expectedDurationNanos), j);
                        long jMin2 = java.lang.Math.min(nanoTime2, frame.endNanos) - java.lang.Math.max(nanoTime, frame.startNanos);
                        sentryFrameMetrics.addFrame(jMin2, jMin, io.sentry.android.core.internal.util.SentryFrameMetricsCollector.isSlow(jMin2, frame.expectedDurationNanos), io.sentry.android.core.internal.util.SentryFrameMetricsCollector.isFrozen(jMin2));
                    }
                    j10 = frame.expectedDurationNanos;
                    j9 = 0;
                }
            }
            long j11 = j10;
            int slowFrozenFrameCount = sentryFrameMetrics.getSlowFrozenFrameCount();
            long lastKnownFrameStartTimeNanos = this.frameMetricsCollector.getLastKnownFrameStartTimeNanos();
            if (lastKnownFrameStartTimeNanos != -1) {
                slowFrozenFrameCount = slowFrozenFrameCount + addPendingFrameDelay(sentryFrameMetrics, j11, nanoTime2, lastKnownFrameStartTimeNanos) + interpolateFrameCount(sentryFrameMetrics, j11, j);
            }
            double slowFrameDelayNanos = (sentryFrameMetrics.getSlowFrameDelayNanos() + sentryFrameMetrics.getFrozenFrameDelayNanos()) / 1.0E9d;
            iSpan.setData(io.sentry.SpanDataConvention.FRAMES_TOTAL, java.lang.Integer.valueOf(slowFrozenFrameCount));
            iSpan.setData(io.sentry.SpanDataConvention.FRAMES_SLOW, java.lang.Integer.valueOf(sentryFrameMetrics.getSlowFrameCount()));
            iSpan.setData(io.sentry.SpanDataConvention.FRAMES_FROZEN, java.lang.Integer.valueOf(sentryFrameMetrics.getFrozenFrameCount()));
            iSpan.setData(io.sentry.SpanDataConvention.FRAMES_DELAY, java.lang.Double.valueOf(slowFrameDelayNanos));
            if (iSpan instanceof io.sentry.ITransaction) {
                iSpan.setMeasurement(io.sentry.protocol.MeasurementValue.KEY_FRAMES_TOTAL, java.lang.Integer.valueOf(slowFrozenFrameCount));
                iSpan.setMeasurement(io.sentry.protocol.MeasurementValue.KEY_FRAMES_SLOW, java.lang.Integer.valueOf(sentryFrameMetrics.getSlowFrameCount()));
                iSpan.setMeasurement(io.sentry.protocol.MeasurementValue.KEY_FRAMES_FROZEN, java.lang.Integer.valueOf(sentryFrameMetrics.getFrozenFrameCount()));
                iSpan.setMeasurement(io.sentry.protocol.MeasurementValue.KEY_FRAMES_DELAY, java.lang.Double.valueOf(slowFrameDelayNanos));
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
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

    private static int interpolateFrameCount(io.sentry.android.core.SentryFrameMetrics sentryFrameMetrics, long j, long j9) {
        long totalDurationNanos = j9 - sentryFrameMetrics.getTotalDurationNanos();
        if (totalDurationNanos > 0) {
            return (int) java.lang.Math.ceil(totalDurationNanos / j);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$0(io.sentry.ISpan iSpan, io.sentry.ISpan iSpan2) {
        if (iSpan == iSpan2) {
            return 0;
        }
        int iCompareTo = iSpan.getStartDate().compareTo(iSpan2.getStartDate());
        return iCompareTo != 0 ? iCompareTo : iSpan.getSpanContext().getSpanId().toString().compareTo(iSpan2.getSpanContext().getSpanId().toString());
    }

    private static long toNanoTime(io.sentry.SentryDate sentryDate) {
        if (sentryDate instanceof io.sentry.SentryNanotimeDate) {
            return sentryDate.diff(EMPTY_NANO_TIME);
        }
        return java.lang.System.nanoTime() - (io.sentry.DateUtils.millisToNanos(java.lang.System.currentTimeMillis()) - sentryDate.nanoTimestamp());
    }

    @Override // io.sentry.IPerformanceContinuousCollector
    public void clear() {
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.listenerId != null) {
                this.frameMetricsCollector.stopCollection(this.listenerId);
                this.listenerId = null;
            }
            this.frames.clear();
            this.runningSpans.clear();
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

    @Override // io.sentry.android.core.internal.util.SentryFrameMetricsCollector.FrameMetricsCollectorListener
    public void onFrameMetricCollected(long j, long j9, long j10, long j11, boolean z6, boolean z9, float f9) {
        if (this.frames.size() > MAX_FRAMES_COUNT) {
            return;
        }
        long j12 = (long) (ONE_SECOND_NANOS / ((double) f9));
        this.lastKnownFrameDurationNanos = j12;
        if (z6 || z9) {
            this.frames.add(new io.sentry.android.core.SpanFrameMetricsCollector.Frame(j, j9, j10, j11, z6, z9, j12));
        }
    }

    @Override // io.sentry.IPerformanceContinuousCollector
    public void onSpanFinished(io.sentry.ISpan iSpan) {
        if (!this.enabled || (iSpan instanceof io.sentry.NoOpSpan) || (iSpan instanceof io.sentry.NoOpTransaction)) {
            return;
        }
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.runningSpans.contains(iSpan)) {
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            captureFrameMetrics(iSpan);
            io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = this.lock.acquire();
            try {
                if (this.runningSpans.isEmpty()) {
                    clear();
                } else {
                    this.frames.headSet(new io.sentry.android.core.SpanFrameMetricsCollector.Frame(toNanoTime(this.runningSpans.first().getStartDate()))).clear();
                }
                if (iSentryLifecycleTokenAcquire2 != null) {
                    iSentryLifecycleTokenAcquire2.close();
                }
            } catch (java.lang.Throwable th) {
                if (iSentryLifecycleTokenAcquire2 != null) {
                    try {
                        iSentryLifecycleTokenAcquire2.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            if (iSentryLifecycleTokenAcquire != null) {
                try {
                    iSentryLifecycleTokenAcquire.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // io.sentry.IPerformanceContinuousCollector
    public void onSpanStarted(io.sentry.ISpan iSpan) {
        if (!this.enabled || (iSpan instanceof io.sentry.NoOpSpan) || (iSpan instanceof io.sentry.NoOpTransaction)) {
            return;
        }
        io.sentry.ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            this.runningSpans.add(iSpan);
            if (this.listenerId == null) {
                this.listenerId = this.frameMetricsCollector.startCollection(this);
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
