package io.sentry;

import java.io.File;

public final class l implements Runnable {

    public final int f23515h;

    public final Object f23516i;

    public l(int i3, Object obj) {
        this.f23515h = i3;
        this.f23516i = obj;
    }

    @Override
    public final void run() {
        switch (this.f23515h) {
            case 0:
                Sentry.lambda$initConfigurations$5((File) this.f23516i);
                break;
            default:
                ((ShutdownHookIntegration) this.f23516i).lambda$close$2();
                break;
        }
    }
}
