package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.decoder.CryptoInfo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

public final class SynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private final MediaCodec codec;
    private final LoudnessCodecController loudnessCodecController;

    public static class Factory implements MediaCodecAdapter.Factory {
        @Override
        public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws Throwable {
            MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                MediaCodec mediaCodecCreateCodec = createCodec(configuration);
                try {
                    TraceUtil.beginSection("configureCodec");
                    Surface surface = configuration.surface;
                    mediaCodecCreateCodec.configure(configuration.mediaFormat, surface, configuration.crypto, (surface == null && configuration.codecInfo.detachedSurfaceSupported && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    TraceUtil.endSection();
                    TraceUtil.beginSection("startCodec");
                    mediaCodecCreateCodec.start();
                    TraceUtil.endSection();
                    return new SynchronousMediaCodecAdapter(mediaCodecCreateCodec, configuration.loudnessCodecController);
                } catch (IOException e6) {
                    e = e6;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (RuntimeException e9) {
                    e = e9;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e10) {
                e = e10;
            } catch (RuntimeException e11) {
                e = e11;
            }
        }

        public MediaCodec createCodec(MediaCodecAdapter.Configuration configuration) throws IOException {
            configuration.codecInfo.getClass();
            String str = configuration.codecInfo.name;
            TraceUtil.beginSection("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            TraceUtil.endSection();
            return mediaCodecCreateByCodecName;
        }
    }

    public void lambda$setOnFrameRenderedListener$0(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j, long j9) {
        onFrameRenderedListener.onFrameRendered(this, j, j9);
    }

    @Override
    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override
    public void flush() {
        this.codec.flush();
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
        return this.codec.getOutputFormat();
    }

    @Override
    public boolean needsReconfiguration() {
        return false;
    }

    @Override
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        this.codec.queueInputBuffer(i3, i9, i10, j, i11);
    }

    @Override
    public void queueSecureInputBuffer(int i3, int i9, CryptoInfo cryptoInfo, long j, int i10) {
        this.codec.queueSecureInputBuffer(i3, i9, cryptoInfo.getFrameworkCryptoInfo(), j, i10);
    }

    @Override
    public void release() {
        LoudnessCodecController loudnessCodecController;
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && i3 < 33) {
                this.codec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                loudnessCodecController.removeMediaCodec(this.codec);
            }
            this.codec.release();
        }
    }

    @Override
    public void releaseOutputBuffer(int i3, boolean z6) {
        this.codec.releaseOutputBuffer(i3, z6);
    }

    @Override
    public void setOnFrameRenderedListener(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new b(this, onFrameRenderedListener, 1), handler);
    }

    @Override
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override
    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
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

    private SynchronousMediaCodecAdapter(MediaCodec mediaCodec, LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.loudnessCodecController = loudnessCodecController;
        if (Build.VERSION.SDK_INT < 35 || loudnessCodecController == null) {
            return;
        }
        loudnessCodecController.addMediaCodec(mediaCodec);
    }

    @Override
    public void releaseOutputBuffer(int i3, long j) {
        this.codec.releaseOutputBuffer(i3, j);
    }
}
