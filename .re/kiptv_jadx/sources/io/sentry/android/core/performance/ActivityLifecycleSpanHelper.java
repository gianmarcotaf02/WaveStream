package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityLifecycleSpanHelper {
    private static final java.lang.String APP_METRICS_ACTIVITIES_OP = "activity.load";
    private final java.lang.String activityName;
    private io.sentry.SentryDate onCreateStartTimestamp = null;
    private io.sentry.SentryDate onStartStartTimestamp = null;
    private io.sentry.ISpan onCreateSpan = null;
    private io.sentry.ISpan onStartSpan = null;

    public ActivityLifecycleSpanHelper(java.lang.String str) {
        this.activityName = str;
    }

    private io.sentry.ISpan createLifecycleSpan(io.sentry.ISpan iSpan, java.lang.String str, io.sentry.SentryDate sentryDate) {
        io.sentry.ISpan iSpanStartChild = iSpan.startChild(APP_METRICS_ACTIVITIES_OP, str, sentryDate, io.sentry.Instrumenter.SENTRY);
        setDefaultStartSpanData(iSpanStartChild);
        return iSpanStartChild;
    }

    private void setDefaultStartSpanData(io.sentry.ISpan iSpan) {
        iSpan.setData(io.sentry.SpanDataConvention.THREAD_ID, java.lang.Long.valueOf(android.os.Looper.getMainLooper().getThread().getId()));
        iSpan.setData(io.sentry.SpanDataConvention.THREAD_NAME, io.sentry.protocol.SentryThread.JsonKeys.MAIN);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        iSpan.setData(io.sentry.SpanDataConvention.CONTRIBUTES_TTID, bool);
        iSpan.setData(io.sentry.SpanDataConvention.CONTRIBUTES_TTFD, bool);
    }

    public void clear() {
        io.sentry.ISpan iSpan = this.onCreateSpan;
        if (iSpan != null && !iSpan.isFinished()) {
            this.onCreateSpan.finish(io.sentry.SpanStatus.CANCELLED);
        }
        this.onCreateSpan = null;
        io.sentry.ISpan iSpan2 = this.onStartSpan;
        if (iSpan2 != null && !iSpan2.isFinished()) {
            this.onStartSpan.finish(io.sentry.SpanStatus.CANCELLED);
        }
        this.onStartSpan = null;
    }

    public void createAndStopOnCreateSpan(io.sentry.ISpan iSpan) {
        if (this.onCreateStartTimestamp == null || iSpan == null) {
            return;
        }
        io.sentry.ISpan iSpanCreateLifecycleSpan = createLifecycleSpan(iSpan, Y6.f.m(new java.lang.StringBuilder(), this.activityName, ".onCreate"), this.onCreateStartTimestamp);
        this.onCreateSpan = iSpanCreateLifecycleSpan;
        iSpanCreateLifecycleSpan.finish();
    }

    public void createAndStopOnStartSpan(io.sentry.ISpan iSpan) {
        if (this.onStartStartTimestamp == null || iSpan == null) {
            return;
        }
        io.sentry.ISpan iSpanCreateLifecycleSpan = createLifecycleSpan(iSpan, Y6.f.m(new java.lang.StringBuilder(), this.activityName, ".onStart"), this.onStartStartTimestamp);
        this.onStartSpan = iSpanCreateLifecycleSpan;
        iSpanCreateLifecycleSpan.finish();
    }

    public io.sentry.ISpan getOnCreateSpan() {
        return this.onCreateSpan;
    }

    public io.sentry.SentryDate getOnCreateStartTimestamp() {
        return this.onCreateStartTimestamp;
    }

    public io.sentry.ISpan getOnStartSpan() {
        return this.onStartSpan;
    }

    public io.sentry.SentryDate getOnStartStartTimestamp() {
        return this.onStartStartTimestamp;
    }

    public void saveSpanToAppStartMetrics() {
        io.sentry.ISpan iSpan = this.onCreateSpan;
        if (iSpan == null || this.onStartSpan == null) {
            return;
        }
        io.sentry.SentryDate finishDate = iSpan.getFinishDate();
        io.sentry.SentryDate finishDate2 = this.onStartSpan.getFinishDate();
        if (finishDate == null || finishDate2 == null) {
            return;
        }
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        io.sentry.SentryDate currentSentryDateTime = io.sentry.android.core.AndroidDateUtils.getCurrentSentryDateTime();
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(currentSentryDateTime.diff(this.onCreateSpan.getStartDate()));
        long millis2 = timeUnit.toMillis(currentSentryDateTime.diff(finishDate));
        long millis3 = timeUnit.toMillis(currentSentryDateTime.diff(this.onStartSpan.getStartDate()));
        long millis4 = timeUnit.toMillis(currentSentryDateTime.diff(finishDate2));
        io.sentry.android.core.performance.ActivityLifecycleTimeSpan activityLifecycleTimeSpan = new io.sentry.android.core.performance.ActivityLifecycleTimeSpan();
        activityLifecycleTimeSpan.getOnCreate().setup(this.onCreateSpan.getDescription(), timeUnit.toMillis(this.onCreateSpan.getStartDate().nanoTimestamp()), jUptimeMillis - millis, jUptimeMillis - millis2);
        activityLifecycleTimeSpan.getOnStart().setup(this.onStartSpan.getDescription(), timeUnit.toMillis(this.onStartSpan.getStartDate().nanoTimestamp()), jUptimeMillis - millis3, jUptimeMillis - millis4);
        io.sentry.android.core.performance.AppStartMetrics.getInstance().addActivityLifecycleTimeSpans(activityLifecycleTimeSpan);
    }

    public void setOnCreateStartTimestamp(io.sentry.SentryDate sentryDate) {
        this.onCreateStartTimestamp = sentryDate;
    }

    public void setOnStartStartTimestamp(io.sentry.SentryDate sentryDate) {
        this.onStartStartTimestamp = sentryDate;
    }
}
