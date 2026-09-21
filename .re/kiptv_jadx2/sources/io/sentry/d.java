package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;

public final class d implements Callable {

    public final int f23487a;

    public d(int i3) {
        this.f23487a = i3;
    }

    @Override
    public final Object call() {
        switch (this.f23487a) {
            case 0:
                return InetAddress.getLocalHost();
            case 1:
                return NoOpSentryExecutorService.lambda$schedule$2();
            case 2:
                return NoOpSentryExecutorService.lambda$submit$1();
            case 3:
                return NoOpSentryExecutorService.lambda$submit$0();
            default:
                return ProfilingTraceData.lambda$new$0();
        }
    }
}
