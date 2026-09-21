package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultMediaCodecAdapterFactory implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory {
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_DISABLED = 2;
    private static final int MODE_ENABLED = 1;
    private static final java.lang.String TAG = "DMCodecAdapterFactory";
    private boolean asyncCryptoFlagEnabled;
    private boolean asyncCryptoSynchronizationEnabled;
    private int asynchronousMode;
    private final p068h4.v callbackThreadSupplier;
    private final android.content.Context context;
    private final p068h4.v queueingThreadSupplier;

    @java.lang.Deprecated
    public DefaultMediaCodecAdapterFactory() {
        this.asynchronousMode = 0;
        this.context = null;
        this.callbackThreadSupplier = null;
        this.queueingThreadSupplier = null;
    }

    private boolean shouldUseAsynchronousAdapterInDefaultMode() {
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            return true;
        }
        android.content.Context context = this.context;
        return context != null && i3 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public androidx.media3.exoplayer.mediacodec.MediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration) {
        p068h4.v vVar;
        int i3 = this.asynchronousMode;
        if (i3 != 1 && (i3 != 0 || !shouldUseAsynchronousAdapterInDefaultMode())) {
            return new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
        }
        int trackType = androidx.media3.common.MimeTypes.getTrackType(configuration.format.sampleMimeType);
        androidx.media3.common.util.Log.i(TAG, "Creating an asynchronous MediaCodec adapter for track type " + androidx.media3.common.util.Util.getTrackTypeString(trackType));
        p068h4.v vVar2 = this.callbackThreadSupplier;
        androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory factory = (vVar2 == null || (vVar = this.queueingThreadSupplier) == null) ? new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory(trackType) : new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory(vVar2, vVar);
        factory.experimentalSetAsyncCryptoFlagEnabled(this.asyncCryptoFlagEnabled);
        factory.setAsyncCryptoSynchronizationEnabled(this.asyncCryptoSynchronizationEnabled);
        return factory.createAdapter(configuration);
    }

    public androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory experimentalSetAsyncCryptoFlagEnabled(boolean z6) {
        this.asyncCryptoFlagEnabled = z6;
        return this;
    }

    public androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
        this.asynchronousMode = 2;
        return this;
    }

    public androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
        this.asynchronousMode = 1;
        return this;
    }

    public androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory setAsyncCryptoSynchronizationEnabled(boolean z6) {
        this.asyncCryptoSynchronizationEnabled = z6;
        return this;
    }

    public DefaultMediaCodecAdapterFactory(android.content.Context context) {
        this(context, null, null);
    }

    public DefaultMediaCodecAdapterFactory(android.content.Context context, p068h4.v vVar, p068h4.v vVar2) {
        this.context = context;
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = true;
        this.callbackThreadSupplier = vVar;
        this.queueingThreadSupplier = vVar2;
    }
}
