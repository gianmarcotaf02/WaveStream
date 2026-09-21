package io.sentry.android.core;

/* JADX INFO: loaded from: classes4.dex */
public class CurrentActivityHolder {
    private static final io.sentry.android.core.CurrentActivityHolder instance = new io.sentry.android.core.CurrentActivityHolder();
    private java.lang.ref.WeakReference<android.app.Activity> currentActivity;

    private CurrentActivityHolder() {
    }

    public static io.sentry.android.core.CurrentActivityHolder getInstance() {
        return instance;
    }

    public void clearActivity() {
        this.currentActivity = null;
    }

    public android.app.Activity getActivity() {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public void setActivity(android.app.Activity activity) {
        java.lang.ref.WeakReference<android.app.Activity> weakReference = this.currentActivity;
        if (weakReference == null || weakReference.get() != activity) {
            this.currentActivity = new java.lang.ref.WeakReference<>(activity);
        }
    }
}
