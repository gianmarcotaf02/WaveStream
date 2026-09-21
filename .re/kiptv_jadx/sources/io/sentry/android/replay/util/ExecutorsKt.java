package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a1\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\u000e\u001aI\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "Lio/sentry/SentryOptions;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lh6/A;", "gracefullyShutdown", "(Ljava/util/concurrent/ExecutorService;Lio/sentry/SentryOptions;)V", "Lio/sentry/ISentryExecutorService;", "", "taskName", "Ljava/lang/Runnable;", "task", "Ljava/util/concurrent/Future;", "submitSafely", "(Lio/sentry/ISentryExecutorService;Lio/sentry/SentryOptions;Ljava/lang/String;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/ExecutorService;Lio/sentry/SentryOptions;Ljava/lang/String;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "Ljava/util/concurrent/ScheduledExecutorService;", "", "initialDelay", "period", "Ljava/util/concurrent/TimeUnit;", "unit", "Ljava/util/concurrent/ScheduledFuture;", "scheduleAtFixedRateSafely", "(Ljava/util/concurrent/ScheduledExecutorService;Lio/sentry/SentryOptions;Ljava/lang/String;JJLjava/util/concurrent/TimeUnit;Ljava/lang/Runnable;)Ljava/util/concurrent/ScheduledFuture;", "sentry-android-replay_release"}, k = 2, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ExecutorsKt {
    public static final void gracefullyShutdown(java.util.concurrent.ExecutorService executorService, io.sentry.SentryOptions options) {
        kotlin.jvm.internal.m.e(executorService, "<this>");
        kotlin.jvm.internal.m.e(options, "options");
        synchronized (executorService) {
            try {
                if (!executorService.isShutdown()) {
                    executorService.shutdown();
                }
                try {
                    if (!executorService.awaitTermination(options.getShutdownTimeoutMillis(), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                        executorService.shutdownNow();
                    }
                } catch (java.lang.InterruptedException unused) {
                    executorService.shutdownNow();
                    java.lang.Thread.currentThread().interrupt();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static final java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRateSafely(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, io.sentry.SentryOptions options, java.lang.String taskName, long j, long j9, java.util.concurrent.TimeUnit unit, java.lang.Runnable task) {
        kotlin.jvm.internal.m.e(scheduledExecutorService, "<this>");
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.m.e(taskName, "taskName");
        kotlin.jvm.internal.m.e(unit, "unit");
        kotlin.jvm.internal.m.e(task, "task");
        try {
            return scheduledExecutorService.scheduleAtFixedRate(new io.sentry.android.replay.util.a(task, options, taskName, 0), j, j9, unit);
        } catch (java.lang.Throwable th) {
            options.getLogger().log(io.sentry.SentryLevel.ERROR, Y6.f.h("Failed to submit task ", taskName, " to executor"), th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleAtFixedRateSafely$lambda$3(java.lang.Runnable task, io.sentry.SentryOptions options, java.lang.String taskName) {
        kotlin.jvm.internal.m.e(task, "$task");
        kotlin.jvm.internal.m.e(options, "$options");
        kotlin.jvm.internal.m.e(taskName, "$taskName");
        try {
            task.run();
        } catch (java.lang.Throwable th) {
            options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task ".concat(taskName), th);
        }
    }

    public static final java.util.concurrent.Future<?> submitSafely(io.sentry.ISentryExecutorService iSentryExecutorService, io.sentry.SentryOptions options, java.lang.String taskName, java.lang.Runnable task) {
        kotlin.jvm.internal.m.e(iSentryExecutorService, "<this>");
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.m.e(taskName, "taskName");
        kotlin.jvm.internal.m.e(task, "task");
        try {
            return iSentryExecutorService.submit(new io.sentry.android.replay.util.a(task, options, taskName, 2));
        } catch (java.lang.Throwable th) {
            options.getLogger().log(io.sentry.SentryLevel.ERROR, Y6.f.h("Failed to submit task ", taskName, " to executor"), th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSafely$lambda$1(java.lang.Runnable task, io.sentry.SentryOptions options, java.lang.String taskName) {
        kotlin.jvm.internal.m.e(task, "$task");
        kotlin.jvm.internal.m.e(options, "$options");
        kotlin.jvm.internal.m.e(taskName, "$taskName");
        try {
            task.run();
        } catch (java.lang.Throwable th) {
            options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task ".concat(taskName), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void submitSafely$lambda$2(java.lang.Runnable task, io.sentry.SentryOptions options, java.lang.String taskName) {
        kotlin.jvm.internal.m.e(task, "$task");
        kotlin.jvm.internal.m.e(options, "$options");
        kotlin.jvm.internal.m.e(taskName, "$taskName");
        try {
            task.run();
        } catch (java.lang.Throwable th) {
            options.getLogger().log(io.sentry.SentryLevel.ERROR, "Failed to execute task ".concat(taskName), th);
        }
    }

    public static final java.util.concurrent.Future<?> submitSafely(java.util.concurrent.ExecutorService executorService, io.sentry.SentryOptions options, java.lang.String taskName, java.lang.Runnable task) {
        kotlin.jvm.internal.m.e(executorService, "<this>");
        kotlin.jvm.internal.m.e(options, "options");
        kotlin.jvm.internal.m.e(taskName, "taskName");
        kotlin.jvm.internal.m.e(task, "task");
        java.lang.String name = java.lang.Thread.currentThread().getName();
        kotlin.jvm.internal.m.d(name, "currentThread().name");
        if (O7.x.x0(name, "SentryReplayIntegration", false)) {
            task.run();
            return null;
        }
        try {
            return executorService.submit(new io.sentry.android.replay.util.a(task, options, taskName, 1));
        } catch (java.lang.Throwable th) {
            options.getLogger().log(io.sentry.SentryLevel.ERROR, Y6.f.h("Failed to submit task ", taskName, " to executor"), th);
            return null;
        }
    }
}
