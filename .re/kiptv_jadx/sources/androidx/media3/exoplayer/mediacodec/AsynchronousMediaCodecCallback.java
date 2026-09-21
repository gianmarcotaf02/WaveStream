package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
final class AsynchronousMediaCodecCallback extends android.media.MediaCodec.Callback {
    private final android.os.HandlerThread callbackThread;
    private android.media.MediaFormat currentFormat;
    private android.os.Handler handler;
    private java.lang.IllegalStateException internalException;
    private android.media.MediaCodec.CryptoException mediaCodecCryptoException;
    private android.media.MediaCodec.CodecException mediaCodecException;
    private androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener;
    private long pendingFlushCount;
    private android.media.MediaFormat pendingOutputFormat;
    private boolean shutDown;
    private final java.lang.Object lock = new java.lang.Object();
    private final androidx.media3.common.util.CircularIntArray availableInputBuffers = new androidx.media3.common.util.CircularIntArray();
    private final androidx.media3.common.util.CircularIntArray availableOutputBuffers = new androidx.media3.common.util.CircularIntArray();
    private final java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> bufferInfos = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<android.media.MediaFormat> formats = new java.util.ArrayDeque<>();

    public AsynchronousMediaCodecCallback(android.os.HandlerThread handlerThread) {
        this.callbackThread = handlerThread;
    }

    private void addOutputFormat(android.media.MediaFormat mediaFormat) {
        this.availableOutputBuffers.addLast(-2);
        this.formats.add(mediaFormat);
    }

    private void flushInternal() {
        if (!this.formats.isEmpty()) {
            this.pendingOutputFormat = this.formats.getLast();
        }
        this.availableInputBuffers.clear();
        this.availableOutputBuffers.clear();
        this.bufferInfos.clear();
        this.formats.clear();
    }

    private boolean isFlushingOrShutdown() {
        return this.pendingFlushCount > 0 || this.shutDown;
    }

    private void maybeThrowException() {
        maybeThrowInternalException();
        maybeThrowMediaCodecException();
        maybeThrowMediaCodecCryptoException();
    }

    private void maybeThrowInternalException() {
        java.lang.IllegalStateException illegalStateException = this.internalException;
        if (illegalStateException == null) {
            return;
        }
        this.internalException = null;
        throw illegalStateException;
    }

    private void maybeThrowMediaCodecCryptoException() {
        android.media.MediaCodec.CryptoException cryptoException = this.mediaCodecCryptoException;
        if (cryptoException == null) {
            return;
        }
        this.mediaCodecCryptoException = null;
        throw cryptoException;
    }

    private void maybeThrowMediaCodecException() {
        android.media.MediaCodec.CodecException codecException = this.mediaCodecException;
        if (codecException == null) {
            return;
        }
        this.mediaCodecException = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFlushCompleted() {
        synchronized (this.lock) {
            try {
                if (this.shutDown) {
                    return;
                }
                long j = this.pendingFlushCount - 1;
                this.pendingFlushCount = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    setInternalException(new java.lang.IllegalStateException());
                } else {
                    flushInternal();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private void setInternalException(java.lang.IllegalStateException illegalStateException) {
        synchronized (this.lock) {
            this.internalException = illegalStateException;
        }
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                int iPopFirst = -1;
                if (isFlushingOrShutdown()) {
                    return -1;
                }
                if (!this.availableInputBuffers.isEmpty()) {
                    iPopFirst = this.availableInputBuffers.popFirst();
                }
                return iPopFirst;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (isFlushingOrShutdown()) {
                    return -1;
                }
                if (this.availableOutputBuffers.isEmpty()) {
                    return -1;
                }
                int iPopFirst = this.availableOutputBuffers.popFirst();
                if (iPopFirst >= 0) {
                    this.currentFormat.getClass();
                    android.media.MediaCodec.BufferInfo bufferInfoRemove = this.bufferInfos.remove();
                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                } else if (iPopFirst == -2) {
                    this.currentFormat = this.formats.remove();
                }
                return iPopFirst;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public void flush() {
        synchronized (this.lock) {
            this.pendingFlushCount++;
            ((android.os.Handler) androidx.media3.common.util.Util.castNonNull(this.handler)).post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.mediacodec.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16692h.onFlushCompleted();
                }
            });
        }
    }

    public android.media.MediaFormat getOutputFormat() {
        android.media.MediaFormat mediaFormat;
        synchronized (this.lock) {
            try {
                mediaFormat = this.currentFormat;
                if (mediaFormat == null) {
                    throw new java.lang.IllegalStateException();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void initialize(android.media.MediaCodec mediaCodec) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.handler == null);
        this.callbackThread.start();
        android.os.Handler handler = new android.os.Handler(this.callbackThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.handler = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CryptoException cryptoException) {
        synchronized (this.lock) {
            this.mediaCodecCryptoException = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        synchronized (this.lock) {
            this.mediaCodecException = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i3) {
        synchronized (this.lock) {
            try {
                this.availableInputBuffers.addLast(i3);
                androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.onBufferAvailableListener;
                if (onBufferAvailableListener != null) {
                    onBufferAvailableListener.onInputBufferAvailable();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i3, android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            try {
                android.media.MediaFormat mediaFormat = this.pendingOutputFormat;
                if (mediaFormat != null) {
                    addOutputFormat(mediaFormat);
                    this.pendingOutputFormat = null;
                }
                this.availableOutputBuffers.addLast(i3);
                this.bufferInfos.add(bufferInfo);
                androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.onBufferAvailableListener;
                if (onBufferAvailableListener != null) {
                    onBufferAvailableListener.onOutputBufferAvailable();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        synchronized (this.lock) {
            addOutputFormat(mediaFormat);
            this.pendingOutputFormat = null;
        }
    }

    public void setOnBufferAvailableListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        synchronized (this.lock) {
            this.onBufferAvailableListener = onBufferAvailableListener;
        }
    }

    public void shutdown() {
        synchronized (this.lock) {
            this.shutDown = true;
            this.callbackThread.quit();
            flushInternal();
        }
    }

    public void useInputBuffer(java.lang.Runnable runnable) {
        synchronized (this.lock) {
            maybeThrowException();
            runnable.run();
        }
    }
}
