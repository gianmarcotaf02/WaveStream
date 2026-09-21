package androidx.media3.session.legacy;

import android.media.VolumeProvider;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback callback;
    private final String controlId;
    private final int controlType;
    private int currentVolume;
    private final int maxVolume;
    private VolumeProvider volumeProviderFwk;

    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    public VolumeProviderCompat(int i3, int i9, int i10) {
        this(i3, i9, i10, null);
    }

    public final int getMaxVolume() {
        return this.maxVolume;
    }

    public Object getVolumeProvider() {
        VolumeProviderCompat volumeProviderCompat;
        if (this.volumeProviderFwk != null) {
            volumeProviderCompat = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            volumeProviderCompat = this;
            volumeProviderCompat.volumeProviderFwk = new VolumeProvider(this.controlType, this.maxVolume, this.currentVolume, this.controlId) {
                @Override
                public void onAdjustVolume(int i3) {
                    VolumeProviderCompat.this.onAdjustVolume(i3);
                }

                @Override
                public void onSetVolumeTo(int i3) {
                    VolumeProviderCompat.this.onSetVolumeTo(i3);
                }
            };
        } else {
            volumeProviderCompat = this;
            volumeProviderCompat.volumeProviderFwk = new VolumeProvider(volumeProviderCompat.controlType, volumeProviderCompat.maxVolume, volumeProviderCompat.currentVolume) {
                @Override
                public void onAdjustVolume(int i3) {
                    VolumeProviderCompat.this.onAdjustVolume(i3);
                }

                @Override
                public void onSetVolumeTo(int i3) {
                    VolumeProviderCompat.this.onSetVolumeTo(i3);
                }
            };
        }
        return volumeProviderCompat.volumeProviderFwk;
    }

    public void onAdjustVolume(int i3) {
    }

    public void onSetVolumeTo(int i3) {
    }

    public void setCallback(Callback callback) {
        this.callback = callback;
    }

    public final void setCurrentVolume(int i3) {
        this.currentVolume = i3;
        ((VolumeProvider) getVolumeProvider()).setCurrentVolume(i3);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public VolumeProviderCompat(int i3, int i9, int i10, String str) {
        this.controlType = i3;
        this.maxVolume = i9;
        this.currentVolume = i10;
        this.controlId = str;
    }
}
