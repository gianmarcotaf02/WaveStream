package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.decoder.CryptoInfo;
import java.nio.ByteBuffer;
import java.util.List;
import p068h4.v;

final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_SHUT_DOWN = 2;
    private final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final MediaCodecBufferEnqueuer bufferEnqueuer;
    private final MediaCodec codec;
    private boolean codecReleased;
    private final LoudnessCodecController loudnessCodecController;
    private int state;

    public static final class Factory implements MediaCodecAdapter.Factory {
        private final v callbackThreadSupplier;
        private boolean enableAsyncCryptoSynchronization;
        private boolean enableSynchronousBufferQueueingWithAsyncCryptoFlag;
        private final v queueingThreadSupplier;

        public Factory(final int i3) {
            final int i9 = 0;
            final int i10 = 1;
            this(new v() {
                @Override
                public final Object get() {
                    switch (i9) {
                        case 0:
                            return AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i3);
                        default:
                            return AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i3);
                    }
                }
            }, new v() {
                @Override
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i3);
                        default:
                            return AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i3);
                    }
                }
            });
        }

        public static HandlerThread lambda$new$0(int i3) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createCallbackThreadLabel(i3));
        }

        public static HandlerThread lambda$new$1(int i3) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createQueueingThreadLabel(i3));
        }

        private static boolean useSynchronousBufferQueueingWithAsyncCryptoFlag() {
            return Build.VERSION.SDK_INT >= 36;
        }

        public void experimentalSetAsyncCryptoFlagEnabled(boolean z6) {
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = z6;
        }

        public void setAsyncCryptoSynchronizationEnabled(boolean z6) {
            this.enableAsyncCryptoSynchronization = z6;
        }

        public Factory(v vVar, v vVar2) {
            this.callbackThreadSupplier = vVar;
            this.queueingThreadSupplier = vVar2;
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = true;
        }

        @Override
        public AsynchronousMediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            MediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer;
            int i3;
            String str = configuration.codecInfo.name;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                TraceUtil.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.enableSynchronousBufferQueueingWithAsyncCryptoFlag && useSynchronousBufferQueueingWithAsyncCryptoFlag()) {
                        asynchronousMediaCodecBufferEnqueuer = new SynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName);
                        i3 = 4;
                    } else {
                        asynchronousMediaCodecBufferEnqueuer = new AsynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName, (HandlerThread) this.queueingThreadSupplier.get(), this.enableAsyncCryptoSynchronization);
                        i3 = 0;
                    }
                    AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, (HandlerThread) this.callbackThreadSupplier.get(), asynchronousMediaCodecBufferEnqueuer, configuration.loudnessCodecController);
                    try {
                        TraceUtil.endSection();
                        Surface surface = configuration.surface;
                        if (surface == null && configuration.codecInfo.detachedSurfaceSupported && Build.VERSION.SDK_INT >= 35) {
                            i3 |= 8;
                        }
                        asynchronousMediaCodecAdapter2.initialize(configuration.mediaFormat, surface, configuration.crypto, i3);
                        return asynchronousMediaCodecAdapter2;
                    } catch (Exception e6) {
                        exc = e6;
                        asynchronousMediaCodecAdapter = asynchronousMediaCodecAdapter2;
                        if (asynchronousMediaCodecAdapter != null) {
                            asynchronousMediaCodecAdapter.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e9) {
                    exc = e9;
                }
            } catch (Exception e10) {
                exc = e10;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public static String createCallbackThreadLabel(int i3) {
        return createThreadLabel(i3, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String createQueueingThreadLabel(int i3) {
        return createThreadLabel(i3, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String createThreadLabel(int i3, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i3 == 1) {
            sb.append("Audio");
        } else if (i3 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i3);
            sb.append(")");
        }
        return sb.toString();
    }

    public void initialize(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i3) {
        LoudnessCodecController loudnessCodecController;
        this.asynchronousMediaCodecCallback.initialize(this.codec);
        TraceUtil.beginSection("configureCodec");
        this.codec.configure(mediaFormat, surface, mediaCrypto, i3);
        TraceUtil.endSection();
        this.bufferEnqueuer.start();
        TraceUtil.beginSection("startCodec");
        this.codec.start();
        TraceUtil.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
            loudnessCodecController.addMediaCodec(this.codec);
        }
        this.state = 1;
    }

    public void lambda$setOnFrameRenderedListener$1(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j9) {
        onFrameRenderedListener.onFrameRendered(this, j, j9);
    }

    public void lambda$useInputBuffer$0(Runnable runnable) {
        this.bufferEnqueuer.maybeThrowException();
        this.asynchronousMediaCodecCallback.useInputBuffer(runnable);
    }

    @Override
    public int dequeueInputBufferIndex() {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueInputBufferIndex();
    }

    @Override
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override
    public void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        this.asynchronousMediaCodecCallback.flush();
        this.codec.start();
    }

    @Override
    public ByteBuffer getInputBuffer(int i3) {
        return this.codec.getInputBuffer(i3);
    }

    @Override
    public PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }

    @Override
    public ByteBuffer getOutputBuffer(int i3) {
        return this.codec.getOutputBuffer(i3);
    }

    @Override
    public MediaFormat getOutputFormat() {
        return this.asynchronousMediaCodecCallback.getOutputFormat();
    }

    @Override
    public boolean needsReconfiguration() {
        return false;
    }

    public void onError(MediaCodec.CodecException codecException) {
        this.asynchronousMediaCodecCallback.onError(this.codec, codecException);
    }

    public void onOutputFormatChanged(MediaFormat mediaFormat) {
        this.asynchronousMediaCodecCallback.onOutputFormatChanged(this.codec, mediaFormat);
    }

    @Override
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        this.bufferEnqueuer.queueInputBuffer(i3, i9, i10, j, i11);
    }

    @Override
    public void queueSecureInputBuffer(int i3, int i9, CryptoInfo cryptoInfo, long j, int i10) {
        this.bufferEnqueuer.queueSecureInputBuffer(i3, i9, cryptoInfo, j, i10);
    }

    @Override
    public boolean registerOnBufferAvailableListener(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        this.asynchronousMediaCodecCallback.setOnBufferAvailableListener(onBufferAvailableListener);
        return true;
    }

    @Override
    public void release() {
        LoudnessCodecController loudnessCodecController;
        LoudnessCodecController loudnessCodecController2;
        try {
            if (this.state == 1) {
                this.bufferEnqueuer.shutdown();
                this.asynchronousMediaCodecCallback.shutdown();
            }
            this.state = 2;
            if (this.codecReleased) {
                return;
            }
            try {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30 && i3 < 33) {
                    this.codec.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController2 = this.loudnessCodecController) != null) {
                    loudnessCodecController2.removeMediaCodec(this.codec);
                }
                this.codec.release();
                this.codecReleased = true;
            }
        } catch (Throwable th) {
            if (!this.codecReleased) {
                try {
                    int i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 30 && i9 < 33) {
                        this.codec.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                        loudnessCodecController.removeMediaCodec(this.codec);
                    }
                    this.codec.release();
                    this.codecReleased = true;
                }
            }
            throw th;
        }
    }

    @Override
    public void releaseOutputBuffer(int i3, boolean z6) {
        this.codec.releaseOutputBuffer(i3, z6);
    }

    @Override
    public void setOnFrameRenderedListener(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new b(this, onFrameRenderedListener, 0), handler);
    }

    @Override
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override
    public void setParameters(Bundle bundle) {
        this.bufferEnqueuer.setParameters(bundle);
    }

    @Override
    public void setVideoScalingMode(int i3) {
        this.codec.setVideoScalingMode(i3);
    }

    @Override
    public void subscribeToVendorParameters(List<String> list) {
        this.codec.subscribeToVendorParameters(list);
    }

    @Override
    public void unsubscribeFromVendorParameters(List<String> list) {
        this.codec.unsubscribeFromVendorParameters(list);
    }

    @Override
    public void useInputBuffer(Runnable runnable) {
        this.asynchronousMediaCodecCallback.useInputBuffer(new a(this, runnable, 0));
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer, LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = mediaCodecBufferEnqueuer;
        this.loudnessCodecController = loudnessCodecController;
        this.state = 0;
    }

    @Override
    public void releaseOutputBuffer(int i3, long j) {
        this.codec.releaseOutputBuffer(i3, j);
    }
}
