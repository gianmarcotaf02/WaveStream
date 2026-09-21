package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.ArrayList;
import java.util.List;

final class SystemHandlerWrapper implements HandlerWrapper {
    private static final int MAX_POOL_SIZE = 50;
    private static final List<SystemMessage> messagePool = new ArrayList(50);
    private final Handler handler;

    public static final class SystemMessage implements HandlerWrapper.Message {
        private SystemHandlerWrapper handler;
        private Message message;

        private SystemMessage() {
        }

        private void recycle() {
            this.message = null;
            this.handler = null;
            SystemHandlerWrapper.recycleMessage(this);
        }

        @Override
        public HandlerWrapper getTarget() {
            SystemHandlerWrapper systemHandlerWrapper = this.handler;
            systemHandlerWrapper.getClass();
            return systemHandlerWrapper;
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            Message message = this.message;
            message.getClass();
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            recycle();
            return zSendMessageAtFrontOfQueue;
        }

        @Override
        public void sendToTarget() {
            Message message = this.message;
            message.getClass();
            message.sendToTarget();
            recycle();
        }

        public SystemMessage setMessage(Message message, SystemHandlerWrapper systemHandlerWrapper) {
            this.message = message;
            this.handler = systemHandlerWrapper;
            return this;
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    private static SystemMessage obtainSystemMessage() {
        SystemMessage systemMessage;
        List<SystemMessage> list = messagePool;
        synchronized (list) {
            try {
                systemMessage = list.isEmpty() ? new SystemMessage() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemMessage;
    }

    public static void recycleMessage(SystemMessage systemMessage) {
        List<SystemMessage> list = messagePool;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(systemMessage);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override
    public boolean hasMessages(int i3) {
        AbstractC1864o0.L(i3 != 0);
        return this.handler.hasMessages(i3);
    }

    @Override
    public HandlerWrapper.Message obtainMessage(int i3) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i3), this);
    }

    @Override
    public boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.handler.postAtFrontOfQueue(runnable);
    }

    @Override
    public boolean postDelayed(Runnable runnable, long j) {
        return this.handler.postDelayed(runnable, j);
    }

    @Override
    public void removeCallbacks(Runnable runnable) {
        this.handler.removeCallbacks(runnable);
    }

    @Override
    public void removeCallbacksAndMessages(Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override
    public void removeMessages(int i3) {
        AbstractC1864o0.L(i3 != 0);
        this.handler.removeMessages(i3);
    }

    @Override
    public boolean sendEmptyMessage(int i3) {
        return this.handler.sendEmptyMessage(i3);
    }

    @Override
    public boolean sendEmptyMessageAtTime(int i3, long j) {
        return this.handler.sendEmptyMessageAtTime(i3, j);
    }

    @Override
    public boolean sendEmptyMessageDelayed(int i3, int i9) {
        return this.handler.sendEmptyMessageDelayed(i3, i9);
    }

    @Override
    public boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        return ((SystemMessage) message).sendAtFrontOfQueue(this.handler);
    }

    @Override
    public HandlerWrapper.Message obtainMessage(int i3, Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i3, obj), this);
    }

    @Override
    public HandlerWrapper.Message obtainMessage(int i3, int i9, int i10) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i3, i9, i10), this);
    }

    @Override
    public HandlerWrapper.Message obtainMessage(int i3, int i9, int i10, Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i3, i9, i10, obj), this);
    }
}
