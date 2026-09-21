package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMediaSource implements androidx.media3.exoplayer.source.MediaSource {
    private android.os.Looper looper;
    private androidx.media3.exoplayer.analytics.PlayerId playerId;
    private androidx.media3.common.Timeline timeline;
    private final java.util.ArrayList<androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller> mediaSourceCallers = new java.util.ArrayList<>(1);
    private final java.util.HashSet<androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller> enabledMediaSourceCallers = new java.util.HashSet<>(1);
    private final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher = new androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher();
    private final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher = new androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher();

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void addDrmEventListener(android.os.Handler handler, androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
        handler.getClass();
        drmSessionEventListener.getClass();
        this.drmEventDispatcher.addEventListener(handler, drmSessionEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
        handler.getClass();
        mediaSourceEventListener.getClass();
        this.eventDispatcher.addEventListener(handler, mediaSourceEventListener);
    }

    public final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return this.drmEventDispatcher.withParameters(0, mediaPeriodId);
    }

    public final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return this.eventDispatcher.withParameters(0, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void disable(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller) {
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.remove(mediaSourceCaller);
        if (zIsEmpty || !this.enabledMediaSourceCallers.isEmpty()) {
            return;
        }
        disableInternal();
    }

    public void disableInternal() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void enable(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller) {
        this.looper.getClass();
        boolean zIsEmpty = this.enabledMediaSourceCallers.isEmpty();
        this.enabledMediaSourceCallers.add(mediaSourceCaller);
        if (zIsEmpty) {
            enableInternal();
        }
    }

    public void enableInternal() {
    }

    public final androidx.media3.exoplayer.analytics.PlayerId getPlayerId() {
        androidx.media3.exoplayer.analytics.PlayerId playerId = this.playerId;
        playerId.getClass();
        return playerId;
    }

    public final boolean isEnabled() {
        return !this.enabledMediaSourceCallers.isEmpty();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void prepareSource(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.analytics.PlayerId playerId) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Looper looper = this.looper;
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(looper == null || looper == looperMyLooper);
        this.playerId = playerId;
        androidx.media3.common.Timeline timeline = this.timeline;
        this.mediaSourceCallers.add(mediaSourceCaller);
        if (this.looper == null) {
            this.looper = looperMyLooper;
            this.enabledMediaSourceCallers.add(mediaSourceCaller);
            prepareSourceInternal(transferListener);
        } else if (timeline != null) {
            enable(mediaSourceCaller);
            mediaSourceCaller.onSourceInfoRefreshed(this, timeline);
        }
    }

    public final boolean prepareSourceCalled() {
        return !this.mediaSourceCallers.isEmpty();
    }

    public abstract void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener);

    public final void refreshSourceInfo(androidx.media3.common.Timeline timeline) {
        this.timeline = timeline;
        java.util.Iterator<androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller> it = this.mediaSourceCallers.iterator();
        while (it.hasNext()) {
            it.next().onSourceInfoRefreshed(this, timeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void releaseSource(androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller) {
        this.mediaSourceCallers.remove(mediaSourceCaller);
        if (!this.mediaSourceCallers.isEmpty()) {
            disable(mediaSourceCaller);
            return;
        }
        this.looper = null;
        this.timeline = null;
        this.playerId = null;
        this.enabledMediaSourceCallers.clear();
        releaseSourceInternal();
    }

    public abstract void releaseSourceInternal();

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void removeDrmEventListener(androidx.media3.exoplayer.drm.DrmSessionEventListener drmSessionEventListener) {
        this.drmEventDispatcher.removeEventListener(drmSessionEventListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void removeEventListener(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
        this.eventDispatcher.removeEventListener(mediaSourceEventListener);
    }

    public final void setPlayerId(androidx.media3.exoplayer.analytics.PlayerId playerId) {
        this.playerId = playerId;
    }

    public final androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher createDrmEventDispatcher(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return this.drmEventDispatcher.withParameters(i3, mediaPeriodId);
    }

    public final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return this.eventDispatcher.withParameters(i3, mediaPeriodId);
    }

    @java.lang.Deprecated
    public final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
        return this.eventDispatcher.withParameters(i3, mediaPeriodId);
    }

    @java.lang.Deprecated
    public final androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher createEventDispatcher(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
        mediaPeriodId.getClass();
        return this.eventDispatcher.withParameters(0, mediaPeriodId);
    }
}
