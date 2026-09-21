package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public abstract class CompositeMediaSource<T> extends androidx.media3.exoplayer.source.BaseMediaSource {
    private final java.util.HashMap<T, androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T>> childSources = new java.util.HashMap<>();
    private android.os.Handler eventHandler;
    private androidx.media3.datasource.TransferListener mediaTransferListener;

    public final class ForwardingEventListener implements androidx.media3.exoplayer.source.MediaSourceEventListener, androidx.media3.exoplayer.drm.DrmSessionEventListener {
        private androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher drmEventDispatcher;
        private final T id;
        private androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher;

        public ForwardingEventListener(T t9) {
            this.mediaSourceEventDispatcher = androidx.media3.exoplayer.source.CompositeMediaSource.this.createEventDispatcher(null);
            this.drmEventDispatcher = androidx.media3.exoplayer.source.CompositeMediaSource.this.createDrmEventDispatcher(null);
            this.id = t9;
        }

        private boolean maybeUpdateEventDispatcher(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodIdForChildMediaPeriodId;
            if (mediaPeriodId != null) {
                mediaPeriodIdForChildMediaPeriodId = androidx.media3.exoplayer.source.CompositeMediaSource.this.getMediaPeriodIdForChildMediaPeriodId(this.id, mediaPeriodId);
                if (mediaPeriodIdForChildMediaPeriodId == null) {
                    return false;
                }
            } else {
                mediaPeriodIdForChildMediaPeriodId = null;
            }
            int windowIndexForChildWindowIndex = androidx.media3.exoplayer.source.CompositeMediaSource.this.getWindowIndexForChildWindowIndex(this.id, i3);
            androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher = this.mediaSourceEventDispatcher;
            if (eventDispatcher.windowIndex != windowIndexForChildWindowIndex || !java.util.Objects.equals(eventDispatcher.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                this.mediaSourceEventDispatcher = androidx.media3.exoplayer.source.CompositeMediaSource.this.createEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
            }
            androidx.media3.exoplayer.drm.DrmSessionEventListener.EventDispatcher eventDispatcher2 = this.drmEventDispatcher;
            if (eventDispatcher2.windowIndex == windowIndexForChildWindowIndex && java.util.Objects.equals(eventDispatcher2.mediaPeriodId, mediaPeriodIdForChildMediaPeriodId)) {
                return true;
            }
            this.drmEventDispatcher = androidx.media3.exoplayer.source.CompositeMediaSource.this.createDrmEventDispatcher(windowIndexForChildWindowIndex, mediaPeriodIdForChildMediaPeriodId);
            return true;
        }

        private androidx.media3.exoplayer.source.MediaLoadData maybeUpdateMediaLoadData(androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            long mediaTimeForChildMediaTime = androidx.media3.exoplayer.source.CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.id, mediaLoadData.mediaStartTimeMs, mediaPeriodId);
            long mediaTimeForChildMediaTime2 = androidx.media3.exoplayer.source.CompositeMediaSource.this.getMediaTimeForChildMediaTime(this.id, mediaLoadData.mediaEndTimeMs, mediaPeriodId);
            return (mediaTimeForChildMediaTime == mediaLoadData.mediaStartTimeMs && mediaTimeForChildMediaTime2 == mediaLoadData.mediaEndTimeMs) ? mediaLoadData : new androidx.media3.exoplayer.source.MediaLoadData(mediaLoadData.dataType, mediaLoadData.trackType, mediaLoadData.trackFormat, mediaLoadData.trackSelectionReason, mediaLoadData.trackSelectionData, mediaTimeForChildMediaTime, mediaTimeForChildMediaTime2);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onDownstreamFormatChanged(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.downstreamFormatChanged(maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysLoaded(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.drm.KeyRequestInfo keyRequestInfo) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysLoaded(keyRequestInfo);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRemoved(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysRemoved();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmKeysRestored(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.drmEventDispatcher.drmKeysRestored();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionAcquired(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, int i9) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionAcquired(i9);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionManagerError(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, java.lang.Exception exc) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionManagerError(exc);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
        public void onDrmSessionReleased(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.drmEventDispatcher.drmSessionReleased();
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCanceled(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadCanceled(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadCompleted(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadCompleted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadError(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z6) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadError(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId), iOException, z6);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onLoadStarted(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i9) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.loadStarted(loadEventInfo, maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId), i9);
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public void onUpstreamDiscarded(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            if (maybeUpdateEventDispatcher(i3, mediaPeriodId)) {
                this.mediaSourceEventDispatcher.upstreamDiscarded(maybeUpdateMediaLoadData(mediaLoadData, mediaPeriodId));
            }
        }
    }

    public static final class MediaSourceAndListener<T> {
        public final androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller caller;
        public final androidx.media3.exoplayer.source.CompositeMediaSource<T>.ForwardingEventListener eventListener;
        public final androidx.media3.exoplayer.source.MediaSource mediaSource;

        public MediaSourceAndListener(androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller, androidx.media3.exoplayer.source.CompositeMediaSource<T>.ForwardingEventListener forwardingEventListener) {
            this.mediaSource = mediaSource;
            this.caller = mediaSourceCaller;
            this.eventListener = forwardingEventListener;
        }
    }

    public final void disableChildSource(T t9) {
        androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T> mediaSourceAndListener = this.childSources.get(t9);
        mediaSourceAndListener.getClass();
        mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void disableInternal() {
        for (androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
        }
    }

    public final void enableChildSource(T t9) {
        androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T> mediaSourceAndListener = this.childSources.get(t9);
        mediaSourceAndListener.getClass();
        mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void enableInternal() {
        for (androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.enable(mediaSourceAndListener.caller);
        }
    }

    public androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(T t9, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public long getMediaTimeForChildMediaTime(T t9, long j, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        return j;
    }

    public int getWindowIndexForChildWindowIndex(T t9, int i3) {
        return i3;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() {
        java.util.Iterator<androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T>> it = this.childSources.values().iterator();
        while (it.hasNext()) {
            it.next().mediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: merged with bridge method [inline-methods] */
    public abstract void lambda$prepareChildSource$0(T t9, androidx.media3.exoplayer.source.MediaSource mediaSource, androidx.media3.common.Timeline timeline);

    public final void prepareChildSource(final T t9, androidx.media3.exoplayer.source.MediaSource mediaSource) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(!this.childSources.containsKey(t9));
        androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller mediaSourceCaller = new androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller() { // from class: androidx.media3.exoplayer.source.a
            @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
            public final void onSourceInfoRefreshed(androidx.media3.exoplayer.source.MediaSource mediaSource2, androidx.media3.common.Timeline timeline) {
                this.f16718h.lambda$prepareChildSource$0(t9, mediaSource2, timeline);
            }
        };
        androidx.media3.exoplayer.source.CompositeMediaSource.ForwardingEventListener forwardingEventListener = new androidx.media3.exoplayer.source.CompositeMediaSource.ForwardingEventListener(t9);
        this.childSources.put(t9, new androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<>(mediaSource, mediaSourceCaller, forwardingEventListener));
        android.os.Handler handler = this.eventHandler;
        handler.getClass();
        mediaSource.addEventListener(handler, forwardingEventListener);
        android.os.Handler handler2 = this.eventHandler;
        handler2.getClass();
        mediaSource.addDrmEventListener(handler2, forwardingEventListener);
        mediaSource.prepareSource(mediaSourceCaller, this.mediaTransferListener, getPlayerId());
        if (isEnabled()) {
            return;
        }
        mediaSource.disable(mediaSourceCaller);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void prepareSourceInternal(androidx.media3.datasource.TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.eventHandler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
    }

    public final void releaseChildSource(T t9) {
        androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T> mediaSourceAndListenerRemove = this.childSources.remove(t9);
        mediaSourceAndListenerRemove.getClass();
        mediaSourceAndListenerRemove.mediaSource.releaseSource(mediaSourceAndListenerRemove.caller);
        mediaSourceAndListenerRemove.mediaSource.removeEventListener(mediaSourceAndListenerRemove.eventListener);
        mediaSourceAndListenerRemove.mediaSource.removeDrmEventListener(mediaSourceAndListenerRemove.eventListener);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public void releaseSourceInternal() {
        for (androidx.media3.exoplayer.source.CompositeMediaSource.MediaSourceAndListener<T> mediaSourceAndListener : this.childSources.values()) {
            mediaSourceAndListener.mediaSource.releaseSource(mediaSourceAndListener.caller);
            mediaSourceAndListener.mediaSource.removeEventListener(mediaSourceAndListener.eventListener);
            mediaSourceAndListener.mediaSource.removeDrmEventListener(mediaSourceAndListener.eventListener);
        }
        this.childSources.clear();
    }
}
