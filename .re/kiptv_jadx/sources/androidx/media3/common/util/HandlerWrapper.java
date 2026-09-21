package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public interface HandlerWrapper {

    public interface Message {
        androidx.media3.common.util.HandlerWrapper getTarget();

        void sendToTarget();
    }

    android.os.Looper getLooper();

    boolean hasMessages(int i3);

    androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i3);

    androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i3, int i9, int i10);

    androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i3, int i9, int i10, java.lang.Object obj);

    androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i3, java.lang.Object obj);

    boolean post(java.lang.Runnable runnable);

    boolean postAtFrontOfQueue(java.lang.Runnable runnable);

    boolean postDelayed(java.lang.Runnable runnable, long j);

    void removeCallbacks(java.lang.Runnable runnable);

    void removeCallbacksAndMessages(java.lang.Object obj);

    void removeMessages(int i3);

    boolean sendEmptyMessage(int i3);

    boolean sendEmptyMessageAtTime(int i3, long j);

    boolean sendEmptyMessageDelayed(int i3, int i9);

    boolean sendMessageAtFrontOfQueue(androidx.media3.common.util.HandlerWrapper.Message message);
}
