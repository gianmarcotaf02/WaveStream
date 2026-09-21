package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class PriorityTaskManager {
    private final java.lang.Object lock = new java.lang.Object();
    private final java.util.PriorityQueue<java.lang.Integer> queue = new java.util.PriorityQueue<>(10, java.util.Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends java.io.IOException {
        public PriorityTooLowException(int i3, int i9) {
            super("Priority too low [priority=" + i3 + ", highest=" + i9 + "]");
        }
    }

    public void add(int i3) {
        synchronized (this.lock) {
            this.queue.add(java.lang.Integer.valueOf(i3));
            this.highestPriority = java.lang.Math.max(this.highestPriority, i3);
        }
    }

    public void proceed(int i3) {
        synchronized (this.lock) {
            while (this.highestPriority != i3) {
                try {
                    this.lock.wait();
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean proceedNonBlocking(int i3) {
        boolean z6;
        synchronized (this.lock) {
            z6 = this.highestPriority == i3;
        }
        return z6;
    }

    public void proceedOrThrow(int i3) {
        synchronized (this.lock) {
            try {
                if (this.highestPriority != i3) {
                    throw new androidx.media3.common.PriorityTaskManager.PriorityTooLowException(i3, this.highestPriority);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void remove(int i3) {
        synchronized (this.lock) {
            this.queue.remove(java.lang.Integer.valueOf(i3));
            this.highestPriority = this.queue.isEmpty() ? Integer.MIN_VALUE : ((java.lang.Integer) androidx.media3.common.util.Util.castNonNull(this.queue.peek())).intValue();
            this.lock.notifyAll();
        }
    }
}
