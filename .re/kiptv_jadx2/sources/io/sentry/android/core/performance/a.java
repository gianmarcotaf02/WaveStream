package io.sentry.android.core.performance;

import android.app.Application;

public final class a implements Runnable {

    public final int f23453h;

    public final AppStartMetrics f23454i;
    public final Application j;

    public a(AppStartMetrics appStartMetrics, Application application, int i3) {
        this.f23453h = i3;
        this.f23454i = appStartMetrics;
        this.j = application;
    }

    @Override
    public final void run() {
        switch (this.f23453h) {
            case 0:
                this.f23454i.lambda$checkCreateTimeOnMain$1(this.j);
                break;
            default:
                this.f23454i.lambda$registerApplicationForegroundCheck$0(this.j);
                break;
        }
    }
}
