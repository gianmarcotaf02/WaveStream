package androidx.media3.common;

import android.os.Build;
import android.os.Bundle;
import androidx.media3.common.util.Util;

public final class AudioAttributes {
    public final int allowedCapturePolicy;
    public final int contentType;
    public final int flags;
    public final boolean hapticChannelsMuted;
    public final boolean isContentSpatialized;
    private android.media.AudioAttributes platformAudioAttributes;
    public final int spatializationBehavior;
    public final int usage;
    public static final AudioAttributes DEFAULT = new Builder().build();
    private static final String FIELD_CONTENT_TYPE = Util.intToStringMaxRadix(0);
    private static final String FIELD_FLAGS = Util.intToStringMaxRadix(1);
    private static final String FIELD_USAGE = Util.intToStringMaxRadix(2);
    private static final String FIELD_ALLOWED_CAPTURE_POLICY = Util.intToStringMaxRadix(3);
    private static final String FIELD_SPATIALIZATION_BEHAVIOR = Util.intToStringMaxRadix(4);
    private static final String FIELD_IS_CONTENT_SPATIALIZED = Util.intToStringMaxRadix(5);
    private static final String FIELD_HAPTIC_CHANNELS_MUTED = Util.intToStringMaxRadix(6);

    public static final class Api29 {
        private Api29() {
        }

        public static void setAllowedCapturePolicy(android.media.AudioAttributes.Builder builder, int i3) {
            builder.setAllowedCapturePolicy(i3);
        }

        public static void setHapticChannelsMuted(android.media.AudioAttributes.Builder builder, boolean z6) {
            builder.setHapticChannelsMuted(z6);
        }
    }

    public static final class Api32 {
        private Api32() {
        }

        public static void setIsContentSpatialized(android.media.AudioAttributes.Builder builder, boolean z6) {
            builder.setIsContentSpatialized(z6);
        }

        public static void setSpatializationBehavior(android.media.AudioAttributes.Builder builder, int i3) {
            builder.setSpatializationBehavior(i3);
        }
    }

    @Deprecated
    public static final class AudioAttributesV21 {
        public final android.media.AudioAttributes audioAttributes;

        private AudioAttributesV21(android.media.AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
        }
    }

    public static final class Builder {
        private int contentType = 0;
        private int flags = 0;
        private int usage = 1;
        private int allowedCapturePolicy = 1;
        private int spatializationBehavior = 0;
        private boolean isContentSpatialized = false;
        private boolean hapticChannelsMuted = true;

        public AudioAttributes build() {
            return new AudioAttributes(this.contentType, this.flags, this.usage, this.allowedCapturePolicy, this.spatializationBehavior, this.isContentSpatialized, this.hapticChannelsMuted);
        }

        public Builder setAllowedCapturePolicy(int i3) {
            this.allowedCapturePolicy = i3;
            return this;
        }

        public Builder setContentType(int i3) {
            this.contentType = i3;
            return this;
        }

        public Builder setFlags(int i3) {
            this.flags = i3;
            return this;
        }

        public Builder setHapticChannelsMuted(boolean z6) {
            this.hapticChannelsMuted = z6;
            return this;
        }

        public Builder setIsContentSpatialized(boolean z6) {
            this.isContentSpatialized = z6;
            return this;
        }

        public Builder setSpatializationBehavior(int i3) {
            this.spatializationBehavior = i3;
            return this;
        }

        public Builder setUsage(int i3) {
            this.usage = i3;
            return this;
        }
    }

    public static AudioAttributes fromBundle(Bundle bundle) {
        Builder builder = new Builder();
        String str = FIELD_CONTENT_TYPE;
        if (bundle.containsKey(str)) {
            builder.setContentType(bundle.getInt(str));
        }
        String str2 = FIELD_FLAGS;
        if (bundle.containsKey(str2)) {
            builder.setFlags(bundle.getInt(str2));
        }
        String str3 = FIELD_USAGE;
        if (bundle.containsKey(str3)) {
            builder.setUsage(bundle.getInt(str3));
        }
        String str4 = FIELD_ALLOWED_CAPTURE_POLICY;
        if (bundle.containsKey(str4)) {
            builder.setAllowedCapturePolicy(bundle.getInt(str4));
        }
        String str5 = FIELD_SPATIALIZATION_BEHAVIOR;
        if (bundle.containsKey(str5)) {
            builder.setSpatializationBehavior(bundle.getInt(str5));
        }
        String str6 = FIELD_IS_CONTENT_SPATIALIZED;
        if (bundle.containsKey(str6)) {
            builder.setIsContentSpatialized(bundle.getBoolean(str6));
        }
        String str7 = FIELD_HAPTIC_CHANNELS_MUTED;
        if (bundle.containsKey(str7)) {
            builder.setHapticChannelsMuted(bundle.getBoolean(str7));
        }
        return builder.build();
    }

    public static AudioAttributes fromPlatformAudioAttributes(android.media.AudioAttributes audioAttributes) {
        Builder usage = new Builder().setContentType(audioAttributes.getContentType()).setFlags(audioAttributes.getFlags()).setUsage(audioAttributes.getUsage());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            usage.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
            usage.setHapticChannelsMuted(audioAttributes.areHapticChannelsMuted());
        }
        if (i3 >= 32) {
            usage.setSpatializationBehavior(audioAttributes.getSpatializationBehavior());
            usage.setIsContentSpatialized(audioAttributes.isContentSpatialized());
        }
        return usage.build();
    }

    private int getStreamTypeInternal() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                int volumeControlStream = getPlatformAudioAttributes().getVolumeControlStream();
                if (volumeControlStream == Integer.MIN_VALUE) {
                    return 3;
                }
                return volumeControlStream;
            } catch (RuntimeException unused) {
                return 3;
            }
        }
        if ((this.flags & 1) != 1) {
            switch (this.usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 12:
                default:
                    return 3;
                case 13:
                    break;
            }
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AudioAttributes.class == obj.getClass()) {
            AudioAttributes audioAttributes = (AudioAttributes) obj;
            if (this.contentType == audioAttributes.contentType && this.flags == audioAttributes.flags && this.usage == audioAttributes.usage && this.allowedCapturePolicy == audioAttributes.allowedCapturePolicy && this.spatializationBehavior == audioAttributes.spatializationBehavior && this.isContentSpatialized == audioAttributes.isContentSpatialized && this.hapticChannelsMuted == audioAttributes.hapticChannelsMuted) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public AudioAttributesV21 getAudioAttributesV21() {
        return new AudioAttributesV21(getPlatformAudioAttributes());
    }

    public android.media.AudioAttributes getPlatformAudioAttributes() {
        if (this.platformAudioAttributes == null) {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(this.contentType).setFlags(this.flags).setUsage(this.usage);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                Api29.setAllowedCapturePolicy(usage, this.allowedCapturePolicy);
                Api29.setHapticChannelsMuted(usage, this.hapticChannelsMuted);
            }
            if (i3 >= 32) {
                Api32.setSpatializationBehavior(usage, this.spatializationBehavior);
                Api32.setIsContentSpatialized(usage, this.isContentSpatialized);
            }
            this.platformAudioAttributes = usage.build();
        }
        return this.platformAudioAttributes;
    }

    @Deprecated
    public int getStreamType() {
        return getStreamTypeInternal();
    }

    public int getVolumeControlStream() {
        return getStreamTypeInternal();
    }

    public int hashCode() {
        return ((((((((((((527 + this.contentType) * 31) + this.flags) * 31) + this.usage) * 31) + this.allowedCapturePolicy) * 31) + this.spatializationBehavior) * 31) + (this.isContentSpatialized ? 1 : 0)) * 31) + (this.hapticChannelsMuted ? 1 : 0);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i3 = this.contentType;
        if (i3 != 0) {
            bundle.putInt(FIELD_CONTENT_TYPE, i3);
        }
        int i9 = this.flags;
        if (i9 != 0) {
            bundle.putInt(FIELD_FLAGS, i9);
        }
        int i10 = this.usage;
        if (i10 != 1) {
            bundle.putInt(FIELD_USAGE, i10);
        }
        int i11 = this.allowedCapturePolicy;
        if (i11 != 1) {
            bundle.putInt(FIELD_ALLOWED_CAPTURE_POLICY, i11);
        }
        int i12 = this.spatializationBehavior;
        if (i12 != 0) {
            bundle.putInt(FIELD_SPATIALIZATION_BEHAVIOR, i12);
        }
        boolean z6 = this.isContentSpatialized;
        if (z6) {
            bundle.putBoolean(FIELD_IS_CONTENT_SPATIALIZED, z6);
        }
        boolean z9 = this.hapticChannelsMuted;
        if (!z9) {
            bundle.putBoolean(FIELD_HAPTIC_CHANNELS_MUTED, z9);
        }
        return bundle;
    }

    private AudioAttributes(int i3, int i9, int i10, int i11, int i12, boolean z6, boolean z9) {
        this.contentType = i3;
        this.flags = i9;
        this.usage = i10;
        this.allowedCapturePolicy = i11;
        this.spatializationBehavior = i12;
        this.isContentSpatialized = z6;
        this.hapticChannelsMuted = z9;
    }
}
