package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.media3.decoder.CryptoInfo;
import java.nio.ByteBuffer;
import java.util.List;

public class ForwardingMediaCodecAdapter implements MediaCodecAdapter {
    private final MediaCodecAdapter delegate;

    public ForwardingMediaCodecAdapter(MediaCodecAdapter mediaCodecAdapter) {
        this.delegate = mediaCodecAdapter;
    }

    @Override
    public int dequeueInputBufferIndex() {
        return this.delegate.dequeueInputBufferIndex();
    }

    @Override
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        return this.delegate.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override
    public void detachOutputSurface() {
        this.delegate.detachOutputSurface();
    }

    @Override
    public void flush() {
        this.delegate.flush();
    }

    @Override
    public ByteBuffer getInputBuffer(int i3) {
        return this.delegate.getInputBuffer(i3);
    }

    @Override
    public PersistableBundle getMetrics() {
        return this.delegate.getMetrics();
    }

    @Override
    public ByteBuffer getOutputBuffer(int i3) {
        return this.delegate.getOutputBuffer(i3);
    }

    @Override
    public MediaFormat getOutputFormat() {
        return this.delegate.getOutputFormat();
    }

    @Override
    public boolean needsReconfiguration() {
        return this.delegate.needsReconfiguration();
    }

    @Override
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        this.delegate.queueInputBuffer(i3, i9, i10, j, i11);
    }

    @Override
    public void queueSecureInputBuffer(int i3, int i9, CryptoInfo cryptoInfo, long j, int i10) {
        this.delegate.queueSecureInputBuffer(i3, i9, cryptoInfo, j, i10);
    }

    @Override
    public boolean registerOnBufferAvailableListener(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        return this.delegate.registerOnBufferAvailableListener(onBufferAvailableListener);
    }

    @Override
    public void release() {
        this.delegate.release();
    }

    @Override
    public void releaseOutputBuffer(int i3, boolean z6) {
        this.delegate.releaseOutputBuffer(i3, z6);
    }

    @Override
    public void setOnFrameRenderedListener(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.delegate.setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }

    @Override
    public void setOutputSurface(Surface surface) {
        this.delegate.setOutputSurface(surface);
    }

    @Override
    public void setParameters(Bundle bundle) {
        this.delegate.setParameters(bundle);
    }

    @Override
    public void setVideoScalingMode(int i3) {
        this.delegate.setVideoScalingMode(i3);
    }

    @Override
    public void subscribeToVendorParameters(List<String> list) {
        this.delegate.subscribeToVendorParameters(list);
    }

    @Override
    public void unsubscribeFromVendorParameters(List<String> list) {
        this.delegate.unsubscribeFromVendorParameters(list);
    }

    @Override
    public void useInputBuffer(Runnable runnable) {
        this.delegate.useInputBuffer(runnable);
    }

    @Override
    public void releaseOutputBuffer(int i3, long j) {
        this.delegate.releaseOutputBuffer(i3, j);
    }
}
