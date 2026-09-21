package io.sentry.android.core;

import io.sentry.SentryOptions;

public final class d implements Runnable {

    public final int f23421h;

    public final Object f23422i;

    public d(int i3, Object obj) {
        this.f23421h = i3;
        this.f23422i = obj;
    }

    @Override
    public final void run() {
        switch (this.f23421h) {
            case 0:
                ((ActivityFramesTracker) this.f23422i).lambda$stop$2();
                break;
            case 1:
                ((AndroidProfiler) this.f23422i).lambda$start$0();
                break;
            case 2:
                ((AppLifecycleIntegration) this.f23422i).lambda$close$1();
                break;
            case 3:
                InternalSentrySdk.deleteCurrentSessionFile((SentryOptions) this.f23422i);
                break;
            default:
                ((NetworkBreadcrumbsIntegration) this.f23422i).lambda$close$0();
                break;
        }
    }
}
