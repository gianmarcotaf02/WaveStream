package io.sentry.android.core;

import io.sentry.ISpan;

public final class f implements Runnable {

    public final int f23425h;

    public final ActivityLifecycleIntegration f23426i;
    public final ISpan j;

    public final ISpan f23427k;

    public f(ActivityLifecycleIntegration activityLifecycleIntegration, ISpan iSpan, ISpan iSpan2, int i3) {
        this.f23425h = i3;
        this.f23426i = activityLifecycleIntegration;
        this.j = iSpan;
        this.f23427k = iSpan2;
    }

    @Override
    public final void run() {
        switch (this.f23425h) {
            case 0:
                this.f23426i.lambda$startTracing$1(this.j, this.f23427k);
                break;
            case 1:
                this.f23426i.lambda$onActivityResumed$8(this.j, this.f23427k);
                break;
            default:
                this.f23426i.lambda$onActivityResumed$9(this.j, this.f23427k);
                break;
        }
    }
}
