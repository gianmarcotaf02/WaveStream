package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public final class CurrentActivityIntegration implements io.sentry.Integration, java.io.Closeable, android.app.Application.ActivityLifecycleCallbacks, java.lang.AutoCloseable {
    private final android.app.Application application;

    public CurrentActivityIntegration(android.app.Application application) {
        this.application = (android.app.Application) io.sentry.util.Objects.requireNonNull(application, "Application is required");
    }

    private void cleanCurrentActivity(android.app.Activity activity) {
        if (io.sentry.android.core.CurrentActivityHolder.getInstance().getActivity() == activity) {
            io.sentry.android.core.CurrentActivityHolder.getInstance().clearActivity();
        }
    }

    private void setCurrentActivity(android.app.Activity activity) {
        io.sentry.android.core.CurrentActivityHolder.getInstance().setActivity(activity);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.application.unregisterActivityLifecycleCallbacks(this);
        io.sentry.android.core.CurrentActivityHolder.getInstance().clearActivity();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        setCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        cleanCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        cleanCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        setCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        setCurrentActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        cleanCurrentActivity(activity);
    }

    @Override // io.sentry.Integration
    public void register(io.sentry.IScopes iScopes, io.sentry.SentryOptions sentryOptions) {
        this.application.registerActivityLifecycleCallbacks(this);
        sentryOptions.getLogger().log(io.sentry.SentryLevel.DEBUG, "CurrentActivityIntegration installed.", new java.lang.Object[0]);
        io.sentry.util.IntegrationUtils.addIntegrationToSdkVersion("CurrentActivity");
    }
}
