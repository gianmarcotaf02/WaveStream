package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class LoudnessCodecController {
    private android.media.LoudnessCodecController loudnessCodecController;
    private final java.util.HashSet<android.media.MediaCodec> mediaCodecs;
    private final androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener updateListener;

    public interface LoudnessParameterUpdateListener {
        public static final androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener DEFAULT = new androidx.media3.exoplayer.mediacodec.e(2);

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ android.os.Bundle lambda$static$0(android.os.Bundle bundle) {
            return bundle;
        }

        android.os.Bundle onLoudnessParameterUpdate(android.os.Bundle bundle);
    }

    public LoudnessCodecController() {
        this(androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener.DEFAULT);
    }

    public void addMediaCodec(android.media.MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.mediaCodecs.add(mediaCodec));
        }
    }

    public void release() {
        this.mediaCodecs.clear();
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void removeMediaCodec(android.media.MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController;
        if (!this.mediaCodecs.remove(mediaCodec) || (loudnessCodecController = this.loudnessCodecController) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void setAudioSessionId(int i3) {
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.loudnessCodecController = null;
        }
        android.media.LoudnessCodecController loudnessCodecControllerCreate = android.media.LoudnessCodecController.create(i3, com.google.common.util.concurrent.z.f19464h, new android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener() { // from class: androidx.media3.exoplayer.mediacodec.LoudnessCodecController.1
            public android.os.Bundle onLoudnessCodecUpdate(android.media.MediaCodec mediaCodec, android.os.Bundle bundle) {
                return androidx.media3.exoplayer.mediacodec.LoudnessCodecController.this.updateListener.onLoudnessParameterUpdate(bundle);
            }
        });
        this.loudnessCodecController = loudnessCodecControllerCreate;
        java.util.Iterator<android.media.MediaCodec> it = this.mediaCodecs.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public LoudnessCodecController(androidx.media3.exoplayer.mediacodec.LoudnessCodecController.LoudnessParameterUpdateListener loudnessParameterUpdateListener) {
        this.mediaCodecs = new java.util.HashSet<>();
        this.updateListener = loudnessParameterUpdateListener;
    }
}
