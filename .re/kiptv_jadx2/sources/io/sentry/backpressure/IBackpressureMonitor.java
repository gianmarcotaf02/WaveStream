package io.sentry.backpressure;

public interface IBackpressureMonitor {
    void close();

    int getDownsampleFactor();

    void start();
}
