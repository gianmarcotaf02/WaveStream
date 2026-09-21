package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
class AsynchronousMediaCodecBufferEnqueuer implements androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer {
    private static final int MSG_OPEN_CV = 3;
    private static final int MSG_QUEUE_INPUT_BUFFER = 1;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 2;
    private static final int MSG_SET_PARAMETERS = 4;
    private final boolean asyncCryptoSynchronizationEnabled;
    private final android.media.MediaCodec codec;
    private final androidx.media3.common.util.ConditionVariable conditionVariable;
    private android.os.Handler handler;
    private final android.os.HandlerThread handlerThread;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> pendingRuntimeException;
    private boolean started;
    private static final java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams> MESSAGE_PARAMS_INSTANCE_POOL = new java.util.ArrayDeque<>();
    private static final java.lang.Object QUEUE_SECURE_LOCK = new java.lang.Object();

    public static class MessageParams {
        public final android.media.MediaCodec.CryptoInfo cryptoInfo = new android.media.MediaCodec.CryptoInfo();
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        public void setQueueParams(int i3, int i9, int i10, long j, int i11) {
            this.index = i3;
            this.offset = i9;
            this.size = i10;
            this.presentationTimeUs = j;
            this.flags = i11;
        }
    }

    public AsynchronousMediaCodecBufferEnqueuer(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, boolean z6) {
        this(mediaCodec, handlerThread, new androidx.media3.common.util.ConditionVariable(), z6);
    }

    private void blockUntilHandlerThreadIsIdle() {
        this.conditionVariable.close();
        android.os.Handler handler = this.handler;
        handler.getClass();
        handler.obtainMessage(3).sendToTarget();
        this.conditionVariable.block();
    }

    private static void copy(androidx.media3.decoder.CryptoInfo cryptoInfo, android.media.MediaCodec.CryptoInfo cryptoInfo2) {
        cryptoInfo2.numSubSamples = cryptoInfo.numSubSamples;
        cryptoInfo2.numBytesOfClearData = copy(cryptoInfo.numBytesOfClearData, cryptoInfo2.numBytesOfClearData);
        cryptoInfo2.numBytesOfEncryptedData = copy(cryptoInfo.numBytesOfEncryptedData, cryptoInfo2.numBytesOfEncryptedData);
        byte[] bArrCopy = copy(cryptoInfo.key, cryptoInfo2.key);
        bArrCopy.getClass();
        cryptoInfo2.key = bArrCopy;
        byte[] bArrCopy2 = copy(cryptoInfo.iv, cryptoInfo2.iv);
        bArrCopy2.getClass();
        cryptoInfo2.iv = bArrCopy2;
        cryptoInfo2.mode = cryptoInfo.mode;
        cryptoInfo2.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public void doHandleMessage(android.os.Message message) {
        androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams;
        androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams2;
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 != 2) {
                messageParams2 = null;
                if (i3 == 3) {
                    this.conditionVariable.open();
                } else if (i3 != 4) {
                    java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> atomicReference = this.pendingRuntimeException;
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException(java.lang.String.valueOf(message.what));
                    while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                    }
                } else {
                    doSetParameters((android.os.Bundle) message.obj);
                }
            } else {
                messageParams = (androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) message.obj;
                doQueueSecureInputBuffer(messageParams.index, messageParams.offset, messageParams.cryptoInfo, messageParams.presentationTimeUs, messageParams.flags);
            }
            if (messageParams2 != null) {
                recycleMessageParams(messageParams2);
            }
        }
        messageParams = (androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) message.obj;
        doQueueInputBuffer(messageParams.index, messageParams.offset, messageParams.size, messageParams.presentationTimeUs, messageParams.flags);
        messageParams2 = messageParams;
        if (messageParams2 != null) {
            recycleMessageParams(messageParams2);
        }
    }

    private void doQueueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        try {
            this.codec.queueInputBuffer(i3, i9, i10, j, i11);
        } catch (java.lang.RuntimeException e6) {
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e6) && atomicReference.get() == null) {
            }
        }
    }

    private void doQueueSecureInputBuffer(int i3, int i9, android.media.MediaCodec.CryptoInfo cryptoInfo, long j, int i10) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 31 && !this.asyncCryptoSynchronizationEnabled) {
                this.codec.queueSecureInputBuffer(i3, i9, cryptoInfo, j, i10);
                return;
            }
            synchronized (QUEUE_SECURE_LOCK) {
                this.codec.queueSecureInputBuffer(i3, i9, cryptoInfo, j, i10);
            }
        } catch (java.lang.RuntimeException e6) {
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e6) && atomicReference.get() == null) {
            }
        }
    }

    private void doSetParameters(android.os.Bundle bundle) {
        try {
            this.codec.setParameters(bundle);
        } catch (java.lang.RuntimeException e6) {
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e6) && atomicReference.get() == null) {
            }
        }
    }

    private void flushHandlerThread() {
        android.os.Handler handler = this.handler;
        handler.getClass();
        handler.removeCallbacksAndMessages(null);
        blockUntilHandlerThreadIsIdle();
    }

    private static androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams getMessageParams() {
        java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams();
                }
                return arrayDeque.removeFirst();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static void recycleMessageParams(androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams) {
        java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            arrayDeque.add(messageParams);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void flush() {
        if (this.started) {
            try {
                flushHandlerThread();
            } catch (java.lang.InterruptedException e6) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e6);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void maybeThrowException() {
        java.lang.RuntimeException andSet = this.pendingRuntimeException.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        maybeThrowException();
        androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i3, i9, i10, j, i11);
        ((android.os.Handler) androidx.media3.common.util.Util.castNonNull(this.handler)).obtainMessage(1, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueSecureInputBuffer(int i3, int i9, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i10) {
        maybeThrowException();
        androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i3, i9, 0, j, i10);
        copy(cryptoInfo, messageParams.cryptoInfo);
        ((android.os.Handler) androidx.media3.common.util.Util.castNonNull(this.handler)).obtainMessage(2, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void setParameters(android.os.Bundle bundle) {
        maybeThrowException();
        ((android.os.Handler) androidx.media3.common.util.Util.castNonNull(this.handler)).obtainMessage(4, bundle).sendToTarget();
    }

    public void setPendingRuntimeException(java.lang.RuntimeException runtimeException) {
        this.pendingRuntimeException.set(runtimeException);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void shutdown() {
        if (this.started) {
            flush();
            this.handlerThread.quit();
        }
        this.started = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void start() {
        if (this.started) {
            return;
        }
        this.handlerThread.start();
        this.handler = new android.os.Handler(this.handlerThread.getLooper()) { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.this.doHandleMessage(message);
            }
        };
        this.started = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void waitUntilQueueingComplete() {
        blockUntilHandlerThreadIsIdle();
    }

    public AsynchronousMediaCodecBufferEnqueuer(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, androidx.media3.common.util.ConditionVariable conditionVariable, boolean z6) {
        this.codec = mediaCodec;
        this.handlerThread = handlerThread;
        this.conditionVariable = conditionVariable;
        this.asyncCryptoSynchronizationEnabled = z6;
        this.pendingRuntimeException = new java.util.concurrent.atomic.AtomicReference<>();
    }

    private static int[] copy(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return java.util.Arrays.copyOf(iArr, iArr.length);
    }

    private static byte[] copy(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return java.util.Arrays.copyOf(bArr, bArr.length);
    }
}
