package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public interface MediaCodecAdapter {

    public static final class Configuration {
        public final androidx.media3.exoplayer.mediacodec.MediaCodecInfo codecInfo;
        public final android.media.MediaCrypto crypto;
        public final androidx.media3.common.Format format;
        public final androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController;
        public final android.media.MediaFormat mediaFormat;
        public final android.view.Surface surface;

        private Configuration(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat, androidx.media3.common.Format format, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController) {
            this.codecInfo = mediaCodecInfo;
            this.mediaFormat = mediaFormat;
            this.format = format;
            this.surface = surface;
            this.crypto = mediaCrypto;
            this.loudnessCodecController = loudnessCodecController;
        }

        public static androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration createForAudioDecoding(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat, androidx.media3.common.Format format, android.media.MediaCrypto mediaCrypto, androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController) {
            return new androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, null, mediaCrypto, loudnessCodecController);
        }

        public static androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration createForVideoDecoding(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, android.media.MediaFormat mediaFormat, androidx.media3.common.Format format, android.view.Surface surface, android.media.MediaCrypto mediaCrypto) {
            return new androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration(mediaCodecInfo, mediaFormat, format, surface, mediaCrypto, null);
        }
    }

    public interface Factory {

        @java.lang.Deprecated
        public static final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory DEFAULT = new androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory();

        static androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory getDefault(android.content.Context context) {
            return new androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory(context);
        }

        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration);
    }

    public interface OnBufferAvailableListener {
        default void onInputBufferAvailable() {
        }

        default void onOutputBufferAvailable() {
        }
    }

    public interface OnFrameRenderedListener {
        void onFrameRendered(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, long j, long j9);
    }

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo);

    void detachOutputSurface();

    void flush();

    java.nio.ByteBuffer getInputBuffer(int i3);

    android.os.PersistableBundle getMetrics();

    java.nio.ByteBuffer getOutputBuffer(int i3);

    android.media.MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i3, int i9, int i10, long j, int i11);

    void queueSecureInputBuffer(int i3, int i9, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i10);

    default boolean registerOnBufferAvailableListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        return false;
    }

    void release();

    void releaseOutputBuffer(int i3, long j);

    void releaseOutputBuffer(int i3, boolean z6);

    void setOnFrameRenderedListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler);

    void setOutputSurface(android.view.Surface surface);

    void setParameters(android.os.Bundle bundle);

    void setVideoScalingMode(int i3);

    void subscribeToVendorParameters(java.util.List<java.lang.String> list);

    void unsubscribeFromVendorParameters(java.util.List<java.lang.String> list);

    default void useInputBuffer(java.lang.Runnable runnable) {
        runnable.run();
    }
}
