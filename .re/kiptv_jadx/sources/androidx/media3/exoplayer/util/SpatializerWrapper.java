package androidx.media3.exoplayer.util;

/* JADX INFO: loaded from: classes.dex */
public class SpatializerWrapper {
    private final android.os.Handler handler;
    private final android.media.Spatializer$OnSpatializerStateChangedListener listener;
    private final boolean spatializationSupported;
    private final android.media.Spatializer spatializer;

    public SpatializerWrapper(android.content.Context context, final java.lang.Runnable runnable, java.lang.Boolean bool) {
        android.media.AudioManager audioManager = context == null ? null : androidx.media3.common.audio.AudioManagerCompat.getAudioManager(context);
        if (audioManager == null || (bool != null && bool.booleanValue())) {
            this.spatializer = null;
            this.spatializationSupported = false;
            this.handler = null;
            this.listener = null;
            return;
        }
        android.media.Spatializer spatializer = audioManager.getSpatializer();
        this.spatializer = spatializer;
        this.spatializationSupported = spatializer.getImmersiveAudioLevel() != 0;
        if (runnable == null) {
            this.handler = null;
            this.listener = null;
            return;
        }
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        looperMyLooper.getClass();
        android.os.Handler handler = new android.os.Handler(looperMyLooper);
        this.handler = handler;
        android.media.Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = new android.media.Spatializer$OnSpatializerStateChangedListener() { // from class: androidx.media3.exoplayer.util.SpatializerWrapper.1
            public void onSpatializerAvailableChanged(android.media.Spatializer spatializer2, boolean z6) {
                runnable.run();
            }

            public void onSpatializerEnabledChanged(android.media.Spatializer spatializer2, boolean z6) {
                runnable.run();
            }
        };
        this.listener = spatializer$OnSpatializerStateChangedListener;
        spatializer.addOnSpatializerStateChangedListener(new androidx.media3.common.util.d(handler), spatializer$OnSpatializerStateChangedListener);
    }

    public boolean canBeSpatialized(androidx.media3.common.AudioAttributes audioAttributes, androidx.media3.common.Format format) {
        int i3;
        if (!isSupportedAvailableAndEnabled()) {
            return false;
        }
        if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC)) {
            i3 = format.channelCount;
            if (i3 == 16) {
                i3 = 12;
            }
        } else if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_IAMF)) {
            i3 = format.channelCount;
            if (i3 == -1) {
                i3 = 6;
            }
        } else if (java.util.Objects.equals(format.sampleMimeType, androidx.media3.common.MimeTypes.AUDIO_AC4)) {
            i3 = format.channelCount;
            if (i3 == 18 || i3 == 21) {
                i3 = 24;
            }
        } else {
            i3 = format.channelCount;
        }
        int audioTrackChannelConfig = androidx.media3.common.util.Util.getAudioTrackChannelConfig(i3);
        if (audioTrackChannelConfig == 0) {
            return false;
        }
        android.media.AudioFormat.Builder channelMask = new android.media.AudioFormat.Builder().setEncoding(2).setChannelMask(audioTrackChannelConfig);
        int i9 = format.sampleRate;
        if (i9 != -1) {
            channelMask.setSampleRate(i9);
        }
        android.media.Spatializer spatializer = this.spatializer;
        spatializer.getClass();
        return E1.b.d(spatializer).canBeSpatialized(audioAttributes.getPlatformAudioAttributes(), channelMask.build());
    }

    public java.util.List<java.lang.Integer> getSpatializedChannelMasks() {
        if (!isSupportedAvailableAndEnabled()) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            return p076i4.S0.f22832l;
        }
        if (android.os.Build.VERSION.SDK_INT < 36) {
            return p076i4.AbstractC2186b0.y(252);
        }
        android.media.Spatializer spatializer = this.spatializer;
        spatializer.getClass();
        return E1.b.d(spatializer).getSpatializedChannelMasks();
    }

    public boolean isAvailable() {
        android.media.Spatializer spatializer = this.spatializer;
        return spatializer != null && spatializer.isAvailable();
    }

    public boolean isEnabled() {
        android.media.Spatializer spatializer = this.spatializer;
        return spatializer != null && spatializer.isEnabled();
    }

    public boolean isSpatializationSupported() {
        return this.spatializationSupported;
    }

    public boolean isSupportedAvailableAndEnabled() {
        return this.spatializer != null && this.spatializationSupported && isAvailable() && isEnabled();
    }

    public void release() {
        android.media.Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
        android.media.Spatializer spatializer = this.spatializer;
        if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.listener) == null || this.handler == null) {
            return;
        }
        spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
        this.handler.removeCallbacksAndMessages(null);
    }
}
