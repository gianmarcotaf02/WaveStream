package io.sentry.android.core.internal.util;

/* JADX INFO: loaded from: classes4.dex */
public class Debouncer {
    private final java.util.concurrent.atomic.AtomicInteger executions = new java.util.concurrent.atomic.AtomicInteger(0);
    private final java.util.concurrent.atomic.AtomicLong lastExecutionTime = new java.util.concurrent.atomic.AtomicLong(0);
    private final int maxExecutions;
    private final io.sentry.transport.ICurrentDateProvider timeProvider;
    private final long waitTimeMs;

    public Debouncer(io.sentry.transport.ICurrentDateProvider iCurrentDateProvider, long j, int i3) {
        this.timeProvider = iCurrentDateProvider;
        this.waitTimeMs = j;
        this.maxExecutions = i3 <= 0 ? 1 : i3;
    }

    public boolean checkForDebounce() {
        long currentTimeMillis = this.timeProvider.getCurrentTimeMillis();
        if (this.lastExecutionTime.get() == 0 || this.lastExecutionTime.get() + this.waitTimeMs <= currentTimeMillis) {
            this.executions.set(0);
            this.lastExecutionTime.set(currentTimeMillis);
            return false;
        }
        if (this.executions.incrementAndGet() < this.maxExecutions) {
            return false;
        }
        this.executions.set(0);
        return true;
    }
}
