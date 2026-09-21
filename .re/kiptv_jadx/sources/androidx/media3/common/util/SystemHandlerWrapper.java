package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
final class SystemHandlerWrapper implements androidx.media3.common.util.HandlerWrapper {
    private static final int MAX_POOL_SIZE = 50;
    private static final java.util.List<androidx.media3.common.util.SystemHandlerWrapper.SystemMessage> messagePool = new java.util.ArrayList(50);
    private final android.os.Handler handler;

    public static final class SystemMessage implements androidx.media3.common.util.HandlerWrapper.Message {
        private androidx.media3.common.util.SystemHandlerWrapper handler;
        private android.os.Message message;

        private SystemMessage() {
        }

        private void recycle() {
            this.message = null;
            this.handler = null;
            androidx.media3.common.util.SystemHandlerWrapper.recycleMessage(this);
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public androidx.media3.common.util.HandlerWrapper getTarget() {
            androidx.media3.common.util.SystemHandlerWrapper systemHandlerWrapper = this.handler;
            systemHandlerWrapper.getClass();
            return systemHandlerWrapper;
        }

        public boolean sendAtFrontOfQueue(android.os.Handler handler) {
            android.os.Message message = this.message;
            message.getClass();
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            recycle();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public void sendToTarget() {
            android.os.Message message = this.message;
            message.getClass();
            message.sendToTarget();
            recycle();
        }

        public androidx.media3.common.util.SystemHandlerWrapper.SystemMessage setMessage(android.os.Message message, androidx.media3.common.util.SystemHandlerWrapper systemHandlerWrapper) {
            this.message = message;
            this.handler = systemHandlerWrapper;
            return this;
        }
    }

    public SystemHandlerWrapper(android.os.Handler handler) {
        this.handler = handler;
    }

    private static androidx.media3.common.util.SystemHandlerWrapper.SystemMessage obtainSystemMessage() {
        androidx.media3.common.util.SystemHandlerWrapper.SystemMessage systemMessage;
        java.util.List<androidx.media3.common.util.SystemHandlerWrapper.SystemMessage> list = messagePool;
        synchronized (list) {
            try {
                systemMessage = list.isEmpty() ? new androidx.media3.common.util.SystemHandlerWrapper.SystemMessage() : list.remove(list.size() - 1);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return systemMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(androidx.media3.common.util.SystemHandlerWrapper.SystemMessage systemMessage) {
        java.util.List<androidx.media3.common.util.SystemHandlerWrapper.SystemMessage> list = messagePool;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(systemMessage);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public android.os.Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean hasMessages(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 != 0);
        return this.handler.hasMessages(i3);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i3) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i3), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean post(java.lang.Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean postAtFrontOfQueue(java.lang.Runnable runnable) {
        return this.handler.postAtFrontOfQueue(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean postDelayed(java.lang.Runnable runnable, long j) {
        return this.handler.postDelayed(runnable, j);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeCallbacks(java.lang.Runnable runnable) {
        this.handler.removeCallbacks(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeCallbacksAndMessages(java.lang.Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeMessages(int i3) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i3 != 0);
        this.handler.removeMessages(i3);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessage(int i3) {
        return this.handler.sendEmptyMessage(i3);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i3, long j) {
        return this.handler.sendEmptyMessageAtTime(i3, j);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i3, int i9) {
        return this.handler.sendEmptyMessageDelayed(i3, i9);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(androidx.media3.common.util.HandlerWrapper.Message message) {
        return ((androidx.media3.common.util.SystemHandlerWrapper.SystemMessage) message).sendAtFrontOfQueue(this.handler);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i3, java.lang.Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i3, obj), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i3, int i9, int i10) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i3, i9, i10), this);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public androidx.media3.common.util.HandlerWrapper.Message obtainMessage(int i3, int i9, int i10, java.lang.Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i3, i9, i10, obj), this);
    }
}
