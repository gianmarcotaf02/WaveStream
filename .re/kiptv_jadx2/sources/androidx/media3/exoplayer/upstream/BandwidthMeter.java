package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import androidx.media3.common.C;
import androidx.media3.datasource.TransferListener;
import java.util.concurrent.CopyOnWriteArrayList;

public interface BandwidthMeter {

    public interface EventListener {

        public static final class EventDispatcher {
            private final CopyOnWriteArrayList<HandlerAndListener> listeners = new CopyOnWriteArrayList<>();

            public static final class HandlerAndListener {
                private final Handler handler;
                private final EventListener listener;
                private boolean released;

                public HandlerAndListener(Handler handler, EventListener eventListener) {
                    this.handler = handler;
                    this.listener = eventListener;
                }

                public void release() {
                    this.released = true;
                }
            }

            public static void lambda$bandwidthSample$0(HandlerAndListener handlerAndListener, int i3, long j, long j9) {
                handlerAndListener.listener.onBandwidthSample(i3, j, j9);
            }

            public void addListener(Handler handler, EventListener eventListener) {
                handler.getClass();
                eventListener.getClass();
                removeListener(eventListener);
                this.listeners.add(new HandlerAndListener(handler, eventListener));
            }

            public void bandwidthSample(int i3, long j, long j9) {
                final int i9;
                final long j10;
                final long j11;
                for (final HandlerAndListener handlerAndListener : this.listeners) {
                    if (handlerAndListener.released) {
                        i9 = i3;
                        j10 = j;
                        j11 = j9;
                    } else {
                        i9 = i3;
                        j10 = j;
                        j11 = j9;
                        handlerAndListener.handler.post(new Runnable() {
                            @Override
                            public final void run() {
                                BandwidthMeter.EventListener.EventDispatcher.lambda$bandwidthSample$0(handlerAndListener, i9, j10, j11);
                            }
                        });
                    }
                    i3 = i9;
                    j = j10;
                    j9 = j11;
                }
            }

            public void removeListener(EventListener eventListener) {
                for (HandlerAndListener handlerAndListener : this.listeners) {
                    if (handlerAndListener.listener == eventListener) {
                        handlerAndListener.release();
                        this.listeners.remove(handlerAndListener);
                    }
                }
            }
        }

        void onBandwidthSample(int i3, long j, long j9);
    }

    void addEventListener(Handler handler, EventListener eventListener);

    long getBitrateEstimate();

    default long getTimeToFirstByteEstimateUs() {
        return C.TIME_UNSET;
    }

    TransferListener getTransferListener();

    void removeEventListener(EventListener eventListener);
}
