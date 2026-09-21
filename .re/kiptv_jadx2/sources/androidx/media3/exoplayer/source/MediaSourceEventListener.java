package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.u;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

public interface MediaSourceEventListener {

    public static class EventDispatcher {
        private final CopyOnWriteArrayList<ListenerAndHandler> listenerAndHandlers;
        public final MediaSource.MediaPeriodId mediaPeriodId;
        public final int windowIndex;

        public static final class ListenerAndHandler {
            public Handler handler;
            public MediaSourceEventListener listener;

            public ListenerAndHandler(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
                this.handler = handler;
                this.listener = mediaSourceEventListener;
            }
        }

        public EventDispatcher() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void lambda$downstreamFormatChanged$5(MediaLoadData mediaLoadData, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onDownstreamFormatChanged(this.windowIndex, this.mediaPeriodId, mediaLoadData);
        }

        public void lambda$loadCanceled$2(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadCanceled(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public void lambda$loadCompleted$1(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadCompleted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData);
        }

        public void lambda$loadError$3(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z6, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadError(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, iOException, z6);
        }

        public void lambda$loadStarted$0(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i3, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onLoadStarted(this.windowIndex, this.mediaPeriodId, loadEventInfo, mediaLoadData, i3);
        }

        public void lambda$upstreamDiscarded$4(MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData, MediaSourceEventListener mediaSourceEventListener) {
            mediaSourceEventListener.onUpstreamDiscarded(this.windowIndex, mediaPeriodId, mediaLoadData);
        }

        public void addEventListener(Handler handler, MediaSourceEventListener mediaSourceEventListener) {
            handler.getClass();
            mediaSourceEventListener.getClass();
            this.listenerAndHandlers.add(new ListenerAndHandler(handler, mediaSourceEventListener));
        }

        public void dispatchEvent(Consumer<MediaSourceEventListener> consumer) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                Util.postOrRun(listenerAndHandler.handler, new k(consumer, listenerAndHandler.listener, 1));
            }
        }

        public void downstreamFormatChanged(int i3, Format format, int i9, Object obj, long j) {
            downstreamFormatChanged(new MediaLoadData(1, i3, format, i9, obj, Util.usToMs(j), C.TIME_UNSET));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i3) {
            loadCanceled(loadEventInfo, i3, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i3) {
            loadCompleted(loadEventInfo, i3, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET);
        }

        public void loadError(LoadEventInfo loadEventInfo, int i3, IOException iOException, boolean z6) {
            loadError(loadEventInfo, i3, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, iOException, z6);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, int i3) {
            loadStarted(loadEventInfo, i3, 0);
        }

        public void removeEventListener(MediaSourceEventListener mediaSourceEventListener) {
            for (ListenerAndHandler listenerAndHandler : this.listenerAndHandlers) {
                if (listenerAndHandler.listener == mediaSourceEventListener) {
                    this.listenerAndHandlers.remove(listenerAndHandler);
                }
            }
        }

        public void upstreamDiscarded(int i3, long j, long j9) {
            upstreamDiscarded(new MediaLoadData(1, i3, null, 3, null, Util.usToMs(j), Util.usToMs(j9)));
        }

        public EventDispatcher withParameters(int i3, MediaSource.MediaPeriodId mediaPeriodId) {
            return new EventDispatcher(this.listenerAndHandlers, i3, mediaPeriodId);
        }

        private EventDispatcher(CopyOnWriteArrayList<ListenerAndHandler> copyOnWriteArrayList, int i3, MediaSource.MediaPeriodId mediaPeriodId) {
            this.listenerAndHandlers = copyOnWriteArrayList;
            this.windowIndex = i3;
            this.mediaPeriodId = mediaPeriodId;
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, int i3, int i9, Format format, int i10, Object obj, long j, long j9) {
            loadCanceled(loadEventInfo, new MediaLoadData(i3, i9, format, i10, obj, Util.usToMs(j), Util.usToMs(j9)));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, int i3, int i9, Format format, int i10, Object obj, long j, long j9) {
            loadCompleted(loadEventInfo, new MediaLoadData(i3, i9, format, i10, obj, Util.usToMs(j), Util.usToMs(j9)));
        }

        public void loadError(LoadEventInfo loadEventInfo, int i3, int i9, Format format, int i10, Object obj, long j, long j9, IOException iOException, boolean z6) {
            loadError(loadEventInfo, new MediaLoadData(i3, i9, format, i10, obj, Util.usToMs(j), Util.usToMs(j9)), iOException, z6);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i3, int i9) {
            loadStarted(loadEventInfo, i3, -1, null, 0, null, C.TIME_UNSET, C.TIME_UNSET, i9);
        }

        @Deprecated
        public EventDispatcher withParameters(int i3, MediaSource.MediaPeriodId mediaPeriodId, long j) {
            return new EventDispatcher(this.listenerAndHandlers, i3, mediaPeriodId);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, int i3, int i9, Format format, int i10, Object obj, long j, long j9) {
            loadStarted(loadEventInfo, new MediaLoadData(i3, i9, format, i10, obj, Util.usToMs(j), Util.usToMs(j9)));
        }

        public void downstreamFormatChanged(final MediaLoadData mediaLoadData) {
            dispatchEvent(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f16734h.lambda$downstreamFormatChanged$5(mediaLoadData, (MediaSourceEventListener) obj);
                }
            });
        }

        public void upstreamDiscarded(MediaLoadData mediaLoadData) {
            MediaSource.MediaPeriodId mediaPeriodId = this.mediaPeriodId;
            mediaPeriodId.getClass();
            dispatchEvent(new h(this, mediaPeriodId, mediaLoadData, 0));
        }

        public void loadCanceled(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            dispatchEvent(new g(this, loadEventInfo, mediaLoadData, 1));
        }

        public void loadCompleted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            dispatchEvent(new g(this, loadEventInfo, mediaLoadData, 0));
        }

        public void loadError(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z6) {
            dispatchEvent(new androidx.media3.exoplayer.analytics.j(this, loadEventInfo, mediaLoadData, iOException, z6));
        }

        public void loadStarted(LoadEventInfo loadEventInfo, int i3, int i9, Format format, int i10, Object obj, long j, long j9, int i11) {
            loadStarted(loadEventInfo, new MediaLoadData(i3, i9, format, i10, obj, Util.usToMs(j), Util.usToMs(j9)), i11);
        }

        @Deprecated
        public void loadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            loadStarted(loadEventInfo, mediaLoadData, 0);
        }

        public void loadStarted(LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i3) {
            dispatchEvent(new u(this, loadEventInfo, mediaLoadData, i3, 2));
        }
    }

    default void onDownstreamFormatChanged(int i3, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }

    default void onLoadCanceled(int i3, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadCompleted(int i3, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    default void onLoadError(int i3, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z6) {
    }

    default void onLoadStarted(int i3, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i9) {
    }

    default void onUpstreamDiscarded(int i3, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
    }
}
