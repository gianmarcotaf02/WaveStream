package io.sentry.backpressure;

/* JADX INFO: loaded from: classes4.dex */
public final class NoOpBackpressureMonitor implements io.sentry.backpressure.IBackpressureMonitor {
    private static final io.sentry.backpressure.NoOpBackpressureMonitor instance = new io.sentry.backpressure.NoOpBackpressureMonitor();

    private NoOpBackpressureMonitor() {
    }

    public static io.sentry.backpressure.NoOpBackpressureMonitor getInstance() {
        return instance;
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void close() {
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public int getDownsampleFactor() {
        return 0;
    }

    @Override // io.sentry.backpressure.IBackpressureMonitor
    public void start() {
    }
}
