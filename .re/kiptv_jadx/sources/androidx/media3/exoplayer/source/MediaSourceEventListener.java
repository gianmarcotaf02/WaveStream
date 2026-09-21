package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> listenerAndHandlers;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public static final class ListenerAndHandler {
            public android.os.Handler handler;
            public androidx.media3.exoplayer.source.MediaSourceEventListener listener;

            public ListenerAndHandler(android.os.Handler handler, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$downstreamFormatChanged$5(androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCanceled$2(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadCompleted$1(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadError$3(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z6, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z6);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$loadStarted$0(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i3, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$upstreamDiscarded$4(androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        public void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            handler.getClass();
            mediaSourceEventListener.getClass();
            this.listenerAndHandlers.add(new androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void dispatchEvent(androidx.media3.common.util.Consumer<androidx.media3.exoplayer.source.MediaSourceEventListener> consumer) {
            for (androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                androidx.media3.common.util.Util.postOrRun(listenerAndHandler.handler, new androidx.media3.exoplayer.source.k(consumer, listenerAndHandler.listener, 1));
            }
        }

        public void downstreamFormatChanged(int i3, androidx.media3.common.Format format, int i9, java.lang.Object obj, long j) {
            downstreamFormatChanged(new androidx.media3.exoplayer.source.MediaLoadData(1, i3, format, i9, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.C.TIME_UNSET));
        }

        public void loadCanceled(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3) {
            loadCanceled(loadEventInfo, i3, -1, null, 0, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        }

        public void loadCompleted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3) {
            loadCompleted(loadEventInfo, i3, -1, null, 0, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET);
        }

        public void loadError(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3, java.io.IOException iOException, boolean z6) {
            loadError(loadEventInfo, i3, -1, null, 0, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, iOException, z6);
        }

        @java.lang.Deprecated
        public void loadStarted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3) {
            loadStarted(loadEventInfo, i3, 0);
        }

        public void removeEventListener(androidx.media3.exoplayer.source.MediaSourceEventListener mediaSourceEventListener) {
            for (androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void upstreamDiscarded(int i3, long j, long j9) {
            upstreamDiscarded(new androidx.media3.exoplayer.source.MediaLoadData(1, i3, null, 3, null, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j9)));
        }

        public androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher withParameters(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            return new androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher(this.listenerAndHandlers, i3, mediaPeriodId);
        }

        private EventDispatcher(java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher.ListenerAndHandler> copyOnWriteArrayList, int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i3;
            this.mediaPeriodId = mediaPeriodId;
        }

        public void loadCanceled(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3, int i9, androidx.media3.common.Format format, int i10, java.lang.Object obj, long j, long j9) {
            loadCanceled(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(i3, i9, format, i10, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j9)));
        }

        public void loadCompleted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3, int i9, androidx.media3.common.Format format, int i10, java.lang.Object obj, long j, long j9) {
            loadCompleted(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(i3, i9, format, i10, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j9)));
        }

        public void loadError(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3, int i9, androidx.media3.common.Format format, int i10, java.lang.Object obj, long j, long j9, java.io.IOException iOException, boolean z6) {
            loadError(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(i3, i9, format, i10, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j9)), iOException, z6);
        }

        public void loadStarted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3, int i9) {
            loadStarted(loadEventInfo, i3, -1, null, 0, null, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, i9);
        }

        @java.lang.Deprecated
        public androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher withParameters(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j) {
            return new androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher(this.listenerAndHandlers, i3, mediaPeriodId);
        }

        @java.lang.Deprecated
        public void loadStarted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3, int i9, androidx.media3.common.Format format, int i10, java.lang.Object obj, long j, long j9) {
            loadStarted(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(i3, i9, format, i10, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j9)));
        }

        public void downstreamFormatChanged(final androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            dispatchEvent(new androidx.media3.common.util.Consumer() { // from class: androidx.media3.exoplayer.source.f
                @Override // androidx.media3.common.util.Consumer
                public final void accept(java.lang.Object obj) {
                    this.f16734h.lambda$downstreamFormatChanged$5(mediaLoadData, (androidx.media3.exoplayer.source.MediaSourceEventListener) obj);
                }
            });
        }

        public void upstreamDiscarded(androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriodId;
            mediaPeriodId.getClass();
            dispatchEvent(new androidx.media3.exoplayer.source.h(this, mediaPeriodId, mediaLoadData, 0));
        }

        public void loadCanceled(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            dispatchEvent(new androidx.media3.exoplayer.source.g(this, loadEventInfo, mediaLoadData, 1));
        }

        public void loadCompleted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            dispatchEvent(new androidx.media3.exoplayer.source.g(this, loadEventInfo, mediaLoadData, 0));
        }

        public void loadError(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z6) {
            dispatchEvent(new androidx.media3.exoplayer.analytics.j(this, loadEventInfo, mediaLoadData, iOException, z6));
        }

        public void loadStarted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, int i3, int i9, androidx.media3.common.Format format, int i10, java.lang.Object obj, long j, long j9, int i11) {
            loadStarted(loadEventInfo, new androidx.media3.exoplayer.source.MediaLoadData(i3, i9, format, i10, obj, androidx.media3.common.util.Util.usToMs(j), androidx.media3.common.util.Util.usToMs(j9)), i11);
        }

        @java.lang.Deprecated
        public void loadStarted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
            loadStarted(loadEventInfo, mediaLoadData, 0);
        }

        public void loadStarted(androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i3) {
            dispatchEvent(new androidx.media3.exoplayer.analytics.u(this, loadEventInfo, mediaLoadData, i3, 2));
        }
    }

    default void onDownstreamFormatChanged(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    default void onLoadCanceled(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }

    default void onLoadError(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z6) {
    }

    default void onLoadStarted(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i9) {
    }

    default void onUpstreamDiscarded(int i3, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData) {
    }
}
