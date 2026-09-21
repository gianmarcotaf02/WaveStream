package androidx.media3.common.util;

import android.os.Looper;

public interface HandlerWrapper {

    public interface Message {
        HandlerWrapper getTarget();

        void sendToTarget();
    }

    Looper getLooper();

    boolean hasMessages(int i3);

    Message obtainMessage(int i3);

    Message obtainMessage(int i3, int i9, int i10);

    Message obtainMessage(int i3, int i9, int i10, Object obj);

    Message obtainMessage(int i3, Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j);

    void removeCallbacks(Runnable runnable);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i3);

    boolean sendEmptyMessage(int i3);

    boolean sendEmptyMessageAtTime(int i3, long j);

    boolean sendEmptyMessageDelayed(int i3, int i9);

    boolean sendMessageAtFrontOfQueue(Message message);
}
