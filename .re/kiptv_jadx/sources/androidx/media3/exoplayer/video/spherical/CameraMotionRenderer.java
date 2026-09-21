package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
public final class CameraMotionRenderer extends androidx.media3.exoplayer.BaseRenderer {
    private static final int SAMPLE_WINDOW_DURATION_US = 100000;
    private static final java.lang.String TAG = "CameraMotionRenderer";
    private final androidx.media3.decoder.DecoderInputBuffer buffer;
    private long lastTimestampUs;
    private androidx.media3.exoplayer.video.spherical.CameraMotionListener listener;
    private final androidx.media3.common.util.ParsableByteArray scratch;

    public CameraMotionRenderer() {
        super(6);
        this.buffer = new androidx.media3.decoder.DecoderInputBuffer(1);
        this.scratch = new androidx.media3.common.util.ParsableByteArray();
    }

    private float[] parseMetadata(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.scratch.reset(byteBuffer.array(), byteBuffer.limit());
        this.scratch.setPosition(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i3 = 0; i3 < 3; i3++) {
            fArr[i3] = java.lang.Float.intBitsToFloat(this.scratch.readLittleEndianInt());
        }
        return fArr;
    }

    private void resetListener() {
        androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener = this.listener;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public java.lang.String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i3, java.lang.Object obj) {
        if (i3 == 8) {
            this.listener = (androidx.media3.exoplayer.video.spherical.CameraMotionListener) obj;
        } else {
            super.handleMessage(i3, obj);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onDisabled() {
        resetListener();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void onPositionReset(long j, boolean z6, boolean z9) {
        this.lastTimestampUs = Long.MIN_VALUE;
        resetListener();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j9) {
        while (!hasReadStreamToEnd() && this.lastTimestampUs < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + j) {
            this.buffer.clear();
            if (readSource(getFormatHolder(), this.buffer, 0) != -4 || this.buffer.isEndOfStream()) {
                return;
            }
            long j10 = this.buffer.timeUs;
            this.lastTimestampUs = j10;
            boolean z6 = j10 < getLastResetPositionUs();
            if (this.listener != null && !z6) {
                this.buffer.flip();
                float[] metadata = parseMetadata((java.nio.ByteBuffer) androidx.media3.common.util.Util.castNonNull(this.buffer.data));
                if (metadata != null) {
                    ((androidx.media3.exoplayer.video.spherical.CameraMotionListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onCameraMotion(this.lastTimestampUs - getStreamOffsetUs(), metadata);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(androidx.media3.common.Format format) {
        return androidx.media3.common.MimeTypes.APPLICATION_CAMERA_MOTION.equals(format.sampleMimeType) ? androidx.media3.exoplayer.RendererCapabilities.create(4) : androidx.media3.exoplayer.RendererCapabilities.create(0);
    }
}
