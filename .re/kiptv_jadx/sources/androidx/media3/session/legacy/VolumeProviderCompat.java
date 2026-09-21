package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private androidx.media3.session.legacy.VolumeProviderCompat.Callback callback;
    private final java.lang.String controlId;
    private final int controlType;
    private int currentVolume;
    private final int maxVolume;
    private android.media.VolumeProvider volumeProviderFwk;

    public static abstract class Callback {
        public abstract void onVolumeChanged(androidx.media3.session.legacy.VolumeProviderCompat volumeProviderCompat);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ControlType {
    }

    public VolumeProviderCompat(int i3, int i9, int i10) {
        this(i3, i9, i10, null);
    }

    public final int getMaxVolume() {
        return this.maxVolume;
    }

    public java.lang.Object getVolumeProvider() {
        androidx.media3.session.legacy.VolumeProviderCompat volumeProviderCompat;
        if (this.volumeProviderFwk != null) {
            volumeProviderCompat = this;
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            volumeProviderCompat = this;
            volumeProviderCompat.volumeProviderFwk = new android.media.VolumeProvider(this.controlType, this.maxVolume, this.currentVolume, this.controlId) { // from class: androidx.media3.session.legacy.VolumeProviderCompat.1
                @Override // android.media.VolumeProvider
                public void onAdjustVolume(int i3) {
                    androidx.media3.session.legacy.VolumeProviderCompat.this.onAdjustVolume(i3);
                }

                @Override // android.media.VolumeProvider
                public void onSetVolumeTo(int i3) {
                    androidx.media3.session.legacy.VolumeProviderCompat.this.onSetVolumeTo(i3);
                }
            };
        } else {
            volumeProviderCompat = this;
            volumeProviderCompat.volumeProviderFwk = new android.media.VolumeProvider(volumeProviderCompat.controlType, volumeProviderCompat.maxVolume, volumeProviderCompat.currentVolume) { // from class: androidx.media3.session.legacy.VolumeProviderCompat.2
                @Override // android.media.VolumeProvider
                public void onAdjustVolume(int i3) {
                    androidx.media3.session.legacy.VolumeProviderCompat.this.onAdjustVolume(i3);
                }

                @Override // android.media.VolumeProvider
                public void onSetVolumeTo(int i3) {
                    androidx.media3.session.legacy.VolumeProviderCompat.this.onSetVolumeTo(i3);
                }
            };
        }
        return volumeProviderCompat.volumeProviderFwk;
    }

    public void onAdjustVolume(int i3) {
    }

    public void onSetVolumeTo(int i3) {
    }

    public void setCallback(androidx.media3.session.legacy.VolumeProviderCompat.Callback callback) {
        this.callback = callback;
    }

    public final void setCurrentVolume(int i3) {
        this.currentVolume = i3;
        ((android.media.VolumeProvider) getVolumeProvider()).setCurrentVolume(i3);
        androidx.media3.session.legacy.VolumeProviderCompat.Callback callback = this.callback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }

    public VolumeProviderCompat(int i3, int i9, int i10, java.lang.String str) {
        this.controlType = i3;
        this.maxVolume = i9;
        this.currentVolume = i10;
        this.controlId = str;
    }
}
