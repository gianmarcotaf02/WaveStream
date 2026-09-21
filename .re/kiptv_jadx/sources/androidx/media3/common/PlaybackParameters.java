package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackParameters {
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;
    public static final androidx.media3.common.PlaybackParameters DEFAULT = new androidx.media3.common.PlaybackParameters(1.0f);
    private static final java.lang.String FIELD_SPEED = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_PITCH = androidx.media3.common.util.Util.intToStringMaxRadix(1);

    public PlaybackParameters(float f9) {
        this(f9, 1.0f);
    }

    public static androidx.media3.common.PlaybackParameters fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.PlaybackParameters(bundle.getFloat(FIELD_SPEED, 1.0f), bundle.getFloat(FIELD_PITCH, 1.0f));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.common.PlaybackParameters.class == obj.getClass()) {
            androidx.media3.common.PlaybackParameters playbackParameters = (androidx.media3.common.PlaybackParameters) obj;
            if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j) {
        return j * ((long) this.scaledUsPerMs);
    }

    public int hashCode() {
        return java.lang.Float.floatToRawIntBits(this.pitch) + ((java.lang.Float.floatToRawIntBits(this.speed) + 527) * 31);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat(FIELD_SPEED, this.speed);
        bundle.putFloat(FIELD_PITCH, this.pitch);
        return bundle;
    }

    public java.lang.String toString() {
        return androidx.media3.common.util.Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", java.lang.Float.valueOf(this.speed), java.lang.Float.valueOf(this.pitch));
    }

    public androidx.media3.common.PlaybackParameters withPitch(float f9) {
        return new androidx.media3.common.PlaybackParameters(this.speed, f9);
    }

    public androidx.media3.common.PlaybackParameters withSpeed(float f9) {
        return new androidx.media3.common.PlaybackParameters(f9, this.pitch);
    }

    public PlaybackParameters(float f9, float f10) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(f9 > 0.0f);
        com.google.android.gms.internal.play_billing.AbstractC1864o0.L(f10 > 0.0f);
        this.speed = f9;
        this.pitch = f10;
        this.scaledUsPerMs = java.lang.Math.round(f9 * 1000.0f);
    }
}
