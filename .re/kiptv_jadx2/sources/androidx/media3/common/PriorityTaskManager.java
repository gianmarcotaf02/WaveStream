package androidx.media3.common;

import androidx.media3.common.util.Util;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i3, int i9) {
            super("Priority too low [priority=" + i3 + ", highest=" + i9 + "]");
        }
    }

    public void add(int i3) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i3));
            this.highestPriority = Math.max(this.highestPriority, i3);
        }
    }

    public void proceed(int i3) {
        synchronized (this.lock) {
            while (this.highestPriority != i3) {
                try {
                    this.lock.wait();
                } catch (Throwable th) {
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
                    throw new PriorityTooLowException(i3, this.highestPriority);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void remove(int i3) {
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i3));
            this.highestPriority = this.queue.isEmpty() ? Integer.MIN_VALUE : ((Integer) Util.castNonNull(this.queue.peek())).intValue();
            this.lock.notifyAll();
        }
    }
}
