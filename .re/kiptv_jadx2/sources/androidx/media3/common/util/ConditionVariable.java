package androidx.media3.common.util;

public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized void block() {
        while (!this.isOpen) {
            this.clock.onThreadBlocked();
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z6 = false;
        while (!this.isOpen) {
            try {
                this.clock.onThreadBlocked();
                wait();
            } catch (InterruptedException unused) {
                z6 = true;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean close() {
        boolean z6;
        z6 = this.isOpen;
        this.isOpen = false;
        return z6;
    }

    public synchronized boolean isOpen() {
        return this.isOpen;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public synchronized boolean block(long j) {
        try {
            if (j <= 0) {
                return this.isOpen;
            }
            long jElapsedRealtime = this.clock.elapsedRealtime();
            long j9 = j + jElapsedRealtime;
            if (j9 < jElapsedRealtime) {
                block();
            } else {
                while (!this.isOpen && jElapsedRealtime < j9) {
                    this.clock.onThreadBlocked();
                    wait(j9 - jElapsedRealtime);
                    jElapsedRealtime = this.clock.elapsedRealtime();
                }
            }
            return this.isOpen;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean blockUninterruptible(long j) {
        try {
            if (j <= 0) {
                return this.isOpen;
            }
            long jElapsedRealtime = this.clock.elapsedRealtime();
            long j9 = j + jElapsedRealtime;
            if (j9 < jElapsedRealtime) {
                blockUninterruptible();
            } else {
                boolean z6 = false;
                while (!this.isOpen && jElapsedRealtime < j9) {
                    try {
                        this.clock.onThreadBlocked();
                        wait(j9 - jElapsedRealtime);
                    } catch (InterruptedException unused) {
                        z6 = true;
                    }
                    jElapsedRealtime = this.clock.elapsedRealtime();
                }
                if (z6) {
                    Thread.currentThread().interrupt();
                }
            }
            return this.isOpen;
        } catch (Throwable th) {
            throw th;
        }
    }
}
