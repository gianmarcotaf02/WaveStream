package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public final class C1482b implements Application.ActivityLifecycleCallbacks {

    public Object f16011h;

    public Activity f16012i;
    public final int j;

    public boolean f16013k = false;

    public boolean f16014l = false;

    public boolean f16015m = false;

    public C1482b(Activity activity) {
        this.f16012i = activity;
        this.j = activity.hashCode();
    }

    @Override
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override
    public final void onActivityDestroyed(Activity activity) {
        if (this.f16012i == activity) {
            this.f16012i = null;
            this.f16014l = true;
        }
    }

    @Override
    public final void onActivityPaused(Activity activity) {
        if (!this.f16014l || this.f16015m || this.f16013k) {
            return;
        }
        Object obj = this.f16011h;
        try {
            Object obj2 = AbstractC1483c.f16018c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.j) {
                AbstractC1483c.g.postAtFrontOfQueue(new com.google.common.util.concurrent.C(AbstractC1483c.f16017b.get(activity), obj2, 19));
                this.f16015m = true;
                this.f16011h = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override
    public final void onActivityResumed(Activity activity) {
    }

    @Override
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override
    public final void onActivityStarted(Activity activity) {
        if (this.f16012i == activity) {
            this.f16013k = true;
        }
    }

    @Override
    public final void onActivityStopped(Activity activity) {
    }
}
