package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerMessage {
    private final androidx.media3.common.util.Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private android.os.Looper looper;
    private int mediaItemIndex;
    private java.lang.Object payload;
    private final androidx.media3.exoplayer.PlayerMessage.Sender sender;
    private final androidx.media3.exoplayer.PlayerMessage.Target target;
    private final androidx.media3.common.Timeline timeline;
    private int type;
    private long positionMs = androidx.media3.common.C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    public interface Sender {
        void sendMessage(androidx.media3.exoplayer.PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i3, java.lang.Object obj);
    }

    public PlayerMessage(androidx.media3.exoplayer.PlayerMessage.Sender sender, androidx.media3.exoplayer.PlayerMessage.Target target, androidx.media3.common.Timeline timeline, int i3, androidx.media3.common.util.Clock clock, android.os.Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i3;
    }

    public synchronized boolean blockUntilDelivered() {
        try {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.isSent);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.looper.getThread() != java.lang.Thread.currentThread());
            while (!this.isProcessed) {
                wait();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.isDelivered;
    }

    public synchronized androidx.media3.exoplayer.PlayerMessage cancel() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public android.os.Looper getLooper() {
        return this.looper;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    public java.lang.Object getPayload() {
        return this.payload;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public androidx.media3.exoplayer.PlayerMessage.Target getTarget() {
        return this.target;
    }

    public androidx.media3.common.Timeline getTimeline() {
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

    public androidx.media3.exoplayer.PlayerMessage send() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.isSent);
        if (this.positionMs == androidx.media3.common.C.TIME_UNSET) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public androidx.media3.exoplayer.PlayerMessage setDeleteAfterDelivery(boolean z6) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.isSent);
        this.deleteAfterDelivery = z6;
        return this;
    }

    public androidx.media3.exoplayer.PlayerMessage setLooper(android.os.Looper looper) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.isSent);
        this.looper = looper;
        return this;
    }

    public androidx.media3.exoplayer.PlayerMessage setPayload(java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.isSent);
        this.payload = obj;
        return this;
    }

    public androidx.media3.exoplayer.PlayerMessage setPosition(long j) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.isSent);
        this.positionMs = j;
        return this;
    }

    public androidx.media3.exoplayer.PlayerMessage setType(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.isSent);
        this.type = i3;
        return this;
    }

    public androidx.media3.exoplayer.PlayerMessage setPosition(int i3, long j) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.isSent);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j != androidx.media3.common.C.TIME_UNSET);
        if (i3 >= 0 && (this.timeline.isEmpty() || i3 < this.timeline.getWindowCount())) {
            this.mediaItemIndex = i3;
            this.positionMs = j;
            return this;
        }
        throw new androidx.media3.common.IllegalSeekPositionException(this.timeline, i3, j);
    }

    public synchronized boolean blockUntilDelivered(long j) {
        boolean z6;
        try {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.isSent);
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.looper.getThread() != java.lang.Thread.currentThread());
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
                throw new java.util.concurrent.TimeoutException("Message delivery timed out.");
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.isDelivered;
    }
}
