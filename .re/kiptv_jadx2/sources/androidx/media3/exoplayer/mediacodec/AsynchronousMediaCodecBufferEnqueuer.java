package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

class AsynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    private static final int MSG_OPEN_CV = 3;
    private static final int MSG_QUEUE_INPUT_BUFFER = 1;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 2;
    private static final int MSG_SET_PARAMETERS = 4;
    private final boolean asyncCryptoSynchronizationEnabled;
    private final MediaCodec codec;
    private final ConditionVariable conditionVariable;
    private Handler handler;
    private final HandlerThread handlerThread;
    private final AtomicReference<RuntimeException> pendingRuntimeException;
    private boolean started;
    private static final ArrayDeque<MessageParams> MESSAGE_PARAMS_INSTANCE_POOL = new ArrayDeque<>();
    private static final Object QUEUE_SECURE_LOCK = new Object();

    public static class MessageParams {
        public final MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
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

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z6) {
        this(mediaCodec, handlerThread, new ConditionVariable(), z6);
    }

    private void blockUntilHandlerThreadIsIdle() {
        this.conditionVariable.close();
        Handler handler = this.handler;
        handler.getClass();
        handler.obtainMessage(3).sendToTarget();
        this.conditionVariable.block();
    }

    private static void copy(CryptoInfo cryptoInfo, MediaCodec.CryptoInfo cryptoInfo2) {
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
        cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
    }

    public void doHandleMessage(Message message) {
        MessageParams messageParams;
        MessageParams messageParams2;
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 != 2) {
                messageParams2 = null;
                if (i3 == 3) {
                    this.conditionVariable.open();
                } else if (i3 != 4) {
                    AtomicReference<RuntimeException> atomicReference = this.pendingRuntimeException;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                    }
                } else {
                    doSetParameters((Bundle) message.obj);
                }
            } else {
                messageParams = (MessageParams) message.obj;
                doQueueSecureInputBuffer(messageParams.index, messageParams.offset, messageParams.cryptoInfo, messageParams.presentationTimeUs, messageParams.flags);
            }
            if (messageParams2 != null) {
                recycleMessageParams(messageParams2);
            }
        }
        messageParams = (MessageParams) message.obj;
        doQueueInputBuffer(messageParams.index, messageParams.offset, messageParams.size, messageParams.presentationTimeUs, messageParams.flags);
        messageParams2 = messageParams;
        if (messageParams2 != null) {
            recycleMessageParams(messageParams2);
        }
    }

    private void doQueueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        try {
            this.codec.queueInputBuffer(i3, i9, i10, j, i11);
        } catch (RuntimeException e6) {
            AtomicReference<RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e6) && atomicReference.get() == null) {
            }
        }
    }

    private void doQueueSecureInputBuffer(int i3, int i9, MediaCodec.CryptoInfo cryptoInfo, long j, int i10) {
        try {
            if (Build.VERSION.SDK_INT >= 31 && !this.asyncCryptoSynchronizationEnabled) {
                this.codec.queueSecureInputBuffer(i3, i9, cryptoInfo, j, i10);
                return;
            }
            synchronized (QUEUE_SECURE_LOCK) {
                this.codec.queueSecureInputBuffer(i3, i9, cryptoInfo, j, i10);
            }
        } catch (RuntimeException e6) {
            AtomicReference<RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e6) && atomicReference.get() == null) {
            }
        }
    }

    private void doSetParameters(Bundle bundle) {
        try {
            this.codec.setParameters(bundle);
        } catch (RuntimeException e6) {
            AtomicReference<RuntimeException> atomicReference = this.pendingRuntimeException;
            while (!atomicReference.compareAndSet(null, e6) && atomicReference.get() == null) {
            }
        }
    }

    private void flushHandlerThread() {
        Handler handler = this.handler;
        handler.getClass();
        handler.removeCallbacksAndMessages(null);
        blockUntilHandlerThreadIsIdle();
    }

    private static MessageParams getMessageParams() {
        ArrayDeque<MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new MessageParams();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void recycleMessageParams(MessageParams messageParams) {
        ArrayDeque<MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            arrayDeque.add(messageParams);
        }
    }

    @Override
    public void flush() {
        if (this.started) {
            try {
                flushHandlerThread();
            } catch (InterruptedException e6) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e6);
            }
        }
    }

    @Override
    public void maybeThrowException() {
        RuntimeException andSet = this.pendingRuntimeException.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i3, i9, i10, j, i11);
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(1, messageParams).sendToTarget();
    }

    @Override
    public void queueSecureInputBuffer(int i3, int i9, CryptoInfo cryptoInfo, long j, int i10) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i3, i9, 0, j, i10);
        copy(cryptoInfo, messageParams.cryptoInfo);
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(2, messageParams).sendToTarget();
    }

    @Override
    public void setParameters(Bundle bundle) {
        maybeThrowException();
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(4, bundle).sendToTarget();
    }

    public void setPendingRuntimeException(RuntimeException runtimeException) {
        this.pendingRuntimeException.set(runtimeException);
    }

    @Override
    public void shutdown() {
        if (this.started) {
            flush();
            this.handlerThread.quit();
        }
        this.started = false;
    }

    @Override
    public void start() {
        if (this.started) {
            return;
        }
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper()) {
            @Override
            public void handleMessage(Message message) {
                AsynchronousMediaCodecBufferEnqueuer.this.doHandleMessage(message);
            }
        };
        this.started = true;
    }

    @Override
    public void waitUntilQueueingComplete() {
        blockUntilHandlerThreadIsIdle();
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, ConditionVariable conditionVariable, boolean z6) {
        this.codec = mediaCodec;
        this.handlerThread = handlerThread;
        this.conditionVariable = conditionVariable;
        this.asyncCryptoSynchronizationEnabled = z6;
        this.pendingRuntimeException = new AtomicReference<>();
    }

    private static int[] copy(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    private static byte[] copy(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
