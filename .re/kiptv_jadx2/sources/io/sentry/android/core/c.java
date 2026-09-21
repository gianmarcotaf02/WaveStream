package io.sentry.android.core;

import android.app.Activity;

public final class c implements Runnable {

    public final int f23419h;

    public final ActivityFramesTracker f23420i;
    public final Activity j;

    public c(ActivityFramesTracker activityFramesTracker, Activity activity, int i3) {
        this.f23419h = i3;
        this.f23420i = activityFramesTracker;
        this.j = activity;
    }

    @Override
    public final void run() {
        switch (this.f23419h) {
            case 0:
                this.f23420i.lambda$addActivity$0(this.j);
                break;
            default:
                this.f23420i.lambda$setMetrics$1(this.j);
                break;
        }
    }
}
