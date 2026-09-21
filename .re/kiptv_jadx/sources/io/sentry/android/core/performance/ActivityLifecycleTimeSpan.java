package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityLifecycleTimeSpan implements java.lang.Comparable<io.sentry.android.core.performance.ActivityLifecycleTimeSpan> {
    private final io.sentry.android.core.performance.TimeSpan onCreate = new io.sentry.android.core.performance.TimeSpan();
    private final io.sentry.android.core.performance.TimeSpan onStart = new io.sentry.android.core.performance.TimeSpan();

    public final io.sentry.android.core.performance.TimeSpan getOnCreate() {
        return this.onCreate;
    }

    public final io.sentry.android.core.performance.TimeSpan getOnStart() {
        return this.onStart;
    }

    @Override // java.lang.Comparable
    public int compareTo(io.sentry.android.core.performance.ActivityLifecycleTimeSpan activityLifecycleTimeSpan) {
        int iCompare = java.lang.Long.compare(this.onCreate.getStartUptimeMs(), activityLifecycleTimeSpan.onCreate.getStartUptimeMs());
        return iCompare == 0 ? java.lang.Long.compare(this.onStart.getStartUptimeMs(), activityLifecycleTimeSpan.onStart.getStartUptimeMs()) : iCompare;
    }
}
