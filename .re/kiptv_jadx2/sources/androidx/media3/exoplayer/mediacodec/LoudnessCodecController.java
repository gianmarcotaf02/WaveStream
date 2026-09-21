package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.common.util.concurrent.z;
import java.util.HashSet;
import java.util.Iterator;

public final class LoudnessCodecController {
    private android.media.LoudnessCodecController loudnessCodecController;
    private final HashSet<MediaCodec> mediaCodecs;
    private final LoudnessParameterUpdateListener updateListener;

    public interface LoudnessParameterUpdateListener {
        public static final LoudnessParameterUpdateListener DEFAULT = new e(2);

        static Bundle lambda$static$0(Bundle bundle) {
            return bundle;
        }

        Bundle onLoudnessParameterUpdate(Bundle bundle);
    }

    public LoudnessCodecController() {
        this(LoudnessParameterUpdateListener.DEFAULT);
    }

    public void addMediaCodec(MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC1864o0.Y(this.mediaCodecs.add(mediaCodec));
        }
    }

    public void release() {
        this.mediaCodecs.clear();
        android.media.LoudnessCodecController loudnessCodecController = this.loudnessCodecController;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void removeMediaCodec(MediaCodec mediaCodec) {
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
        android.media.LoudnessCodecController loudnessCodecControllerCreate = android.media.LoudnessCodecController.create(i3, z.f19464h, new LoudnessCodecController$OnLoudnessCodecUpdateListener() {
            public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
                return LoudnessCodecController.this.updateListener.onLoudnessParameterUpdate(bundle);
            }
        });
        this.loudnessCodecController = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.mediaCodecs.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public LoudnessCodecController(LoudnessParameterUpdateListener loudnessParameterUpdateListener) {
        this.mediaCodecs = new HashSet<>();
        this.updateListener = loudnessParameterUpdateListener;
    }
}
