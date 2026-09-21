package androidx.media3.exoplayer;

import android.os.Looper;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.concurrent.TimeoutException;

public final class PlayerMessage {
    private final Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private Looper looper;
    private int mediaItemIndex;
    private Object payload;
    private final Sender sender;
    private final Target target;
    private final Timeline timeline;
    private int type;
    private long positionMs = androidx.media3.common.C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    public interface Sender {
        void sendMessage(PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i3, Object obj);
    }

    public PlayerMessage(Sender sender, Target target, Timeline timeline, int i3, Clock clock, Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i3;
    }

    public synchronized boolean blockUntilDelivered() {
        try {
            AbstractC1864o0.Y(this.isSent);
            AbstractC1864o0.Y(this.looper.getThread() != Thread.currentThread());
            while (!this.isProcessed) {
                wait();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isDelivered;
    }

    public synchronized PlayerMessage cancel() {
        AbstractC1864o0.Y(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public Looper getLooper() {
        return this.looper;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    public Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public Target getTarget() {
        return this.target;
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    public int getType() {
        return this.type;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z6) {
        this.isDelivered = z6 | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public PlayerMessage send() {
        AbstractC1864o0.Y(!this.isSent);
        if (this.positionMs == androidx.media3.common.C.TIME_UNSET) {
            AbstractC1864o0.L(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public PlayerMessage setDeleteAfterDelivery(boolean z6) {
        AbstractC1864o0.Y(!this.isSent);
        this.deleteAfterDelivery = z6;
        return this;
    }

    public PlayerMessage setLooper(Looper looper) {
        AbstractC1864o0.Y(!this.isSent);
        this.looper = looper;
        return this;
    }

    public PlayerMessage setPayload(Object obj) {
        AbstractC1864o0.Y(!this.isSent);
        this.payload = obj;
        return this;
    }

    public PlayerMessage setPosition(long j) {
        AbstractC1864o0.Y(!this.isSent);
        this.positionMs = j;
        return this;
    }

    public PlayerMessage setType(int i3) {
        AbstractC1864o0.Y(!this.isSent);
        this.type = i3;
        return this;
    }

    public PlayerMessage setPosition(int i3, long j) {
        AbstractC1864o0.Y(!this.isSent);
        AbstractC1864o0.L(j != androidx.media3.common.C.TIME_UNSET);
        if (i3 >= 0 && (this.timeline.isEmpty() || i3 < this.timeline.getWindowCount())) {
            this.mediaItemIndex = i3;
            this.positionMs = j;
            return this;
        }
        throw new IllegalSeekPositionException(this.timeline, i3, j);
    }

    public synchronized boolean blockUntilDelivered(long j) {
        boolean z6;
        try {
            AbstractC1864o0.Y(this.isSent);
            AbstractC1864o0.Y(this.looper.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.clock.elapsedRealtime() + j;
            while (true) {
                z6 = this.isProcessed;
                if (z6 || j <= 0) {
                    break;
                }
                this.clock.onThreadBlocked();
                wait(j);
                j = jElapsedRealtime - this.clock.elapsedRealtime();
            }
            if (!z6) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.isDelivered;
    }
}
