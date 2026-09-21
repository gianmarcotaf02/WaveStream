package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {
            private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener> listeners = new java.util.concurrent.CopyOnWriteArrayList<>();

            public static final class HandlerAndListener {
                private final android.os.Handler handler;
                private final androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener listener;
                private boolean released;

                public HandlerAndListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
                    this.handler = handler;
                    this.listener = eventListener;
                }

                public void release() {
                    this.released = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$bandwidthSample$0(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener, int i3, long j, long j9) {
                handlerAndListener.listener.onBandwidthSample(i3, j, j9);
            }

            public void addListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
                handler.getClass();
                eventListener.getClass();
                removeListener(eventListener);
                this.listeners.add(new androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener(handler, eventListener));
            }

            public void bandwidthSample(int i3, long j, long j9) {
                final int i9;
                final long j10;
                final long j11;
                for (final androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener : this.listeners) {
                    if (handlerAndListener.released) {
                        i9 = i3;
                        j10 = j;
                        j11 = j9;
                    } else {
                        i9 = i3;
                        j10 = j;
                        j11 = j9;
                        handlerAndListener.handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.upstream.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.lambda$bandwidthSample$0(handlerAndListener, i9, j10, j11);
                            }
                        });
                    }
                    i3 = i9;
                    j = j10;
                    j9 = j11;
                }
            }

            public void removeListener(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener) {
                for (androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener.EventDispatcher.HandlerAndListener handlerAndListener : this.listeners) {
                    if (handlerAndListener.listener == eventListener) {
                        handlerAndListener.release();
                        this.listeners.remove(handlerAndListener);
                    }
                }
            }
        }

        void onBandwidthSample(int i3, long j, long j9);
    }

    void addEventListener(android.os.Handler handler, androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return androidx.media3.common.C.TIME_UNSET;
    }

    androidx.media3.datasource.TransferListener getTransferListener();

    void removeEventListener(androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener eventListener);
}
