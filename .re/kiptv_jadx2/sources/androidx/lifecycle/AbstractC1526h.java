package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public abstract class AbstractC1526h implements Application.ActivityLifecycleCallbacks {
    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override
    public void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.m.e(activity, "activity");
        kotlin.jvm.internal.m.e(outState, "outState");
    }

    @Override
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }

    @Override
    public void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.m.e(activity, "activity");
    }
}
