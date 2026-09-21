package io.sentry.android.core;

import io.sentry.IScopes;
import io.sentry.transport.ICurrentDateProvider;

public final class b implements Runnable {

    public final int f23417h;

    public final Object f23418i;
    public final Object j;

    public b(Object obj, Object obj2, int i3) {
        this.f23417h = i3;
        this.f23418i = obj;
        this.j = obj2;
    }

    @Override
    public final void run() {
        switch (this.f23417h) {
            case 0:
                ((ANRWatchDog) this.f23418i).lambda$new$1((ICurrentDateProvider) this.j);
                break;
            default:
                ((AppLifecycleIntegration) this.f23418i).lambda$register$0((IScopes) this.j);
                break;
        }
    }
}
