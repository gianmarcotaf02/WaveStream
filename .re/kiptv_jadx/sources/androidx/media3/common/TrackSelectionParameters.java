package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionParameters {
    public static final androidx.media3.common.TrackSelectionParameters DEFAULT;

    @java.lang.Deprecated
    public static final androidx.media3.common.TrackSelectionParameters DEFAULT_WITHOUT_CONTEXT;
    private static final java.lang.String FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE;
    private static final java.lang.String FIELD_AUDIO_OFFLOAD_PREFERENCES;
    protected static final int FIELD_CUSTOM_ID_BASE = 1000;
    private static final java.lang.String FIELD_DISABLED_TRACK_TYPE;
    private static final java.lang.String FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE;
    private static final java.lang.String FIELD_FORCE_LOWEST_BITRATE;
    private static final java.lang.String FIELD_IGNORED_TEXT_SELECTION_FLAGS;
    private static final java.lang.String FIELD_IS_GAPLESS_SUPPORT_REQUIRED;
    private static final java.lang.String FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED;
    private static final java.lang.String FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED;
    private static final java.lang.String FIELD_IS_VIEWPORT_SIZE_LIMITED_BY_PHYSICAL_DISPLAY_SIZE;
    private static final java.lang.String FIELD_MAX_AUDIO_BITRATE;
    private static final java.lang.String FIELD_MAX_AUDIO_CHANNEL_COUNT;
    private static final java.lang.String FIELD_MAX_VIDEO_BITRATE;
    private static final java.lang.String FIELD_MAX_VIDEO_FRAMERATE;
    private static final java.lang.String FIELD_MAX_VIDEO_HEIGHT;
    private static final java.lang.String FIELD_MAX_VIDEO_WIDTH;
    private static final java.lang.String FIELD_MIN_VIDEO_BITRATE;
    private static final java.lang.String FIELD_MIN_VIDEO_FRAMERATE;
    private static final java.lang.String FIELD_MIN_VIDEO_HEIGHT;
    private static final java.lang.String FIELD_MIN_VIDEO_WIDTH;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_LABELS;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_LANGUAGES;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_MIME_TYPES;
    private static final java.lang.String FIELD_PREFERRED_AUDIO_ROLE_FLAGS;
    private static final java.lang.String FIELD_PREFERRED_TEXT_LABELS;
    private static final java.lang.String FIELD_PREFERRED_TEXT_LANGUAGES;
    private static final java.lang.String FIELD_PREFERRED_TEXT_ROLE_FLAGS;
    private static final java.lang.String FIELD_PREFERRED_VIDEO_LABELS;
    private static final java.lang.String FIELD_PREFERRED_VIDEO_LANGUAGES;
    private static final java.lang.String FIELD_PREFERRED_VIDEO_MIMETYPES;
    private static final java.lang.String FIELD_PREFERRED_VIDEO_ROLE_FLAGS;
    private static final java.lang.String FIELD_SELECTION_OVERRIDES;
    private static final java.lang.String FIELD_SELECT_TEXT_BY_DEFAULT;
    private static final java.lang.String FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE;
    private static final java.lang.String FIELD_USE_PREFERRED_TEXT_LANGUAGES_AND_ROLE_FLAGS_FROM_CAPTIONING_MANAGER;
    private static final java.lang.String FIELD_VIEWPORT_HEIGHT;
    private static final java.lang.String FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE;
    private static final java.lang.String FIELD_VIEWPORT_WIDTH;
    public final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences;
    public final p076i4.AbstractC2214p0 disabledTrackTypes;
    public final boolean forceHighestSupportedBitrate;
    public final boolean forceLowestBitrate;
    public final int ignoredTextSelectionFlags;
    public final boolean isPrioritizeImageOverVideoEnabled;
    public final boolean isViewportSizeLimitedByPhysicalDisplaySize;
    public final int maxAudioBitrate;
    public final int maxAudioChannelCount;
    public final int maxVideoBitrate;
    public final int maxVideoFrameRate;
    public final int maxVideoHeight;
    public final int maxVideoWidth;
    public final int minVideoBitrate;
    public final int minVideoFrameRate;
    public final int minVideoHeight;
    public final int minVideoWidth;
    public final p076i4.AbstractC2194f0 overrides;
    public final p076i4.AbstractC2186b0 preferredAudioLabels;
    public final p076i4.AbstractC2186b0 preferredAudioLanguages;
    public final p076i4.AbstractC2186b0 preferredAudioMimeTypes;
    public final int preferredAudioRoleFlags;
    public final p076i4.AbstractC2186b0 preferredTextLabels;
    public final p076i4.AbstractC2186b0 preferredTextLanguages;
    public final int preferredTextRoleFlags;
    public final p076i4.AbstractC2186b0 preferredVideoLabels;
    public final p076i4.AbstractC2186b0 preferredVideoLanguages;
    public final p076i4.AbstractC2186b0 preferredVideoMimeTypes;
    public final int preferredVideoRoleFlags;
    public final boolean selectTextByDefault;
    public final boolean selectUndeterminedTextLanguage;
    public final boolean usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
    public final int viewportHeight;
    public final boolean viewportOrientationMayChange;
    public final int viewportWidth;

    public static final class AudioOffloadPreferences {
        public static final int AUDIO_OFFLOAD_MODE_DISABLED = 0;
        public static final int AUDIO_OFFLOAD_MODE_ENABLED = 1;
        public static final int AUDIO_OFFLOAD_MODE_REQUIRED = 2;
        public static final androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences DEFAULT = new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder().build();
        private static final java.lang.String FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_IS_GAPLESS_SUPPORT_REQUIRED = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        public final int audioOffloadMode;
        public final boolean isGaplessSupportRequired;
        public final boolean isSpeedChangeSupportRequired;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface AudioOffloadMode {
        }

        public static final class Builder {
            private int audioOffloadMode = 0;
            private boolean isGaplessSupportRequired = false;
            private boolean isSpeedChangeSupportRequired = false;

            public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences build() {
                return new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences(this);
            }

            public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder setAudioOffloadMode(int i3) {
                this.audioOffloadMode = i3;
                return this;
            }

            public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder setIsGaplessSupportRequired(boolean z6) {
                this.isGaplessSupportRequired = z6;
                return this;
            }

            public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder setIsSpeedChangeSupportRequired(boolean z6) {
                this.isSpeedChangeSupportRequired = z6;
                return this;
            }
        }

        public static androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder builder = new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder();
            java.lang.String str = FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE;
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences = DEFAULT;
            return builder.setAudioOffloadMode(bundle.getInt(str, audioOffloadPreferences.audioOffloadMode)).setIsGaplessSupportRequired(bundle.getBoolean(FIELD_IS_GAPLESS_SUPPORT_REQUIRED, audioOffloadPreferences.isGaplessSupportRequired)).setIsSpeedChangeSupportRequired(bundle.getBoolean(FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, audioOffloadPreferences.isSpeedChangeSupportRequired)).build();
        }

        public androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder buildUpon() {
            return new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder().setAudioOffloadMode(this.audioOffloadMode).setIsGaplessSupportRequired(this.isGaplessSupportRequired).setIsSpeedChangeSupportRequired(this.isSpeedChangeSupportRequired);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.class == obj.getClass()) {
                androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences = (androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences) obj;
                if (this.audioOffloadMode == audioOffloadPreferences.audioOffloadMode && this.isGaplessSupportRequired == audioOffloadPreferences.isGaplessSupportRequired && this.isSpeedChangeSupportRequired == audioOffloadPreferences.isSpeedChangeSupportRequired) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.audioOffloadMode + 31) * 31) + (this.isGaplessSupportRequired ? 1 : 0)) * 31) + (this.isSpeedChangeSupportRequired ? 1 : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt(FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE, this.audioOffloadMode);
            bundle.putBoolean(FIELD_IS_GAPLESS_SUPPORT_REQUIRED, this.isGaplessSupportRequired);
            bundle.putBoolean(FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, this.isSpeedChangeSupportRequired);
            return bundle;
        }

        private AudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder builder) {
            this.audioOffloadMode = builder.audioOffloadMode;
            this.isGaplessSupportRequired = builder.isGaplessSupportRequired;
            this.isSpeedChangeSupportRequired = builder.isSpeedChangeSupportRequired;
        }
    }

    static {
        androidx.media3.common.TrackSelectionParameters trackSelectionParametersBuild = new androidx.media3.common.TrackSelectionParameters.Builder().build();
        DEFAULT = trackSelectionParametersBuild;
        DEFAULT_WITHOUT_CONTEXT = trackSelectionParametersBuild;
        FIELD_PREFERRED_AUDIO_LANGUAGES = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        FIELD_PREFERRED_AUDIO_ROLE_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        FIELD_PREFERRED_TEXT_LANGUAGES = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        FIELD_PREFERRED_TEXT_ROLE_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        FIELD_MAX_VIDEO_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        FIELD_MAX_VIDEO_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(7);
        FIELD_MAX_VIDEO_FRAMERATE = androidx.media3.common.util.Util.intToStringMaxRadix(8);
        FIELD_MAX_VIDEO_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(9);
        FIELD_MIN_VIDEO_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(10);
        FIELD_MIN_VIDEO_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(11);
        FIELD_MIN_VIDEO_FRAMERATE = androidx.media3.common.util.Util.intToStringMaxRadix(12);
        FIELD_MIN_VIDEO_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(13);
        FIELD_VIEWPORT_WIDTH = androidx.media3.common.util.Util.intToStringMaxRadix(14);
        FIELD_VIEWPORT_HEIGHT = androidx.media3.common.util.Util.intToStringMaxRadix(15);
        FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE = androidx.media3.common.util.Util.intToStringMaxRadix(16);
        FIELD_PREFERRED_VIDEO_MIMETYPES = androidx.media3.common.util.Util.intToStringMaxRadix(17);
        FIELD_MAX_AUDIO_CHANNEL_COUNT = androidx.media3.common.util.Util.intToStringMaxRadix(18);
        FIELD_MAX_AUDIO_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(19);
        FIELD_PREFERRED_AUDIO_MIME_TYPES = androidx.media3.common.util.Util.intToStringMaxRadix(20);
        FIELD_FORCE_LOWEST_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(21);
        FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE = androidx.media3.common.util.Util.intToStringMaxRadix(22);
        FIELD_SELECTION_OVERRIDES = androidx.media3.common.util.Util.intToStringMaxRadix(23);
        FIELD_DISABLED_TRACK_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(24);
        FIELD_PREFERRED_VIDEO_ROLE_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(25);
        FIELD_IGNORED_TEXT_SELECTION_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(26);
        FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE = androidx.media3.common.util.Util.intToStringMaxRadix(27);
        FIELD_IS_GAPLESS_SUPPORT_REQUIRED = androidx.media3.common.util.Util.intToStringMaxRadix(28);
        FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED = androidx.media3.common.util.Util.intToStringMaxRadix(29);
        FIELD_AUDIO_OFFLOAD_PREFERENCES = androidx.media3.common.util.Util.intToStringMaxRadix(30);
        FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED = androidx.media3.common.util.Util.intToStringMaxRadix(31);
        FIELD_PREFERRED_VIDEO_LANGUAGES = androidx.media3.common.util.Util.intToStringMaxRadix(32);
        FIELD_IS_VIEWPORT_SIZE_LIMITED_BY_PHYSICAL_DISPLAY_SIZE = androidx.media3.common.util.Util.intToStringMaxRadix(33);
        FIELD_USE_PREFERRED_TEXT_LANGUAGES_AND_ROLE_FLAGS_FROM_CAPTIONING_MANAGER = androidx.media3.common.util.Util.intToStringMaxRadix(34);
        FIELD_SELECT_TEXT_BY_DEFAULT = androidx.media3.common.util.Util.intToStringMaxRadix(35);
        FIELD_PREFERRED_VIDEO_LABELS = androidx.media3.common.util.Util.intToStringMaxRadix(36);
        FIELD_PREFERRED_AUDIO_LABELS = androidx.media3.common.util.Util.intToStringMaxRadix(37);
        FIELD_PREFERRED_TEXT_LABELS = androidx.media3.common.util.Util.intToStringMaxRadix(38);
    }

    public TrackSelectionParameters(androidx.media3.common.TrackSelectionParameters.Builder builder) {
        this.maxVideoWidth = builder.maxVideoWidth;
        this.maxVideoHeight = builder.maxVideoHeight;
        this.maxVideoFrameRate = builder.maxVideoFrameRate;
        this.maxVideoBitrate = builder.maxVideoBitrate;
        this.minVideoWidth = builder.minVideoWidth;
        this.minVideoHeight = builder.minVideoHeight;
        this.minVideoFrameRate = builder.minVideoFrameRate;
        this.minVideoBitrate = builder.minVideoBitrate;
        this.viewportWidth = builder.viewportWidth;
        this.viewportHeight = builder.viewportHeight;
        this.isViewportSizeLimitedByPhysicalDisplaySize = builder.isViewportSizeLimitedByPhysicalDisplaySize;
        this.viewportOrientationMayChange = builder.viewportOrientationMayChange;
        this.preferredVideoMimeTypes = builder.preferredVideoMimeTypes;
        this.preferredVideoLabels = builder.preferredVideoLabels;
        this.preferredVideoLanguages = builder.preferredVideoLanguages;
        this.preferredVideoRoleFlags = builder.preferredVideoRoleFlags;
        this.preferredAudioLanguages = builder.preferredAudioLanguages;
        this.preferredAudioRoleFlags = builder.preferredAudioRoleFlags;
        this.maxAudioChannelCount = builder.maxAudioChannelCount;
        this.preferredAudioLabels = builder.preferredAudioLabels;
        this.maxAudioBitrate = builder.maxAudioBitrate;
        this.preferredAudioMimeTypes = builder.preferredAudioMimeTypes;
        this.audioOffloadPreferences = builder.audioOffloadPreferences;
        this.selectTextByDefault = builder.selectTextByDefault;
        this.preferredTextLanguages = builder.preferredTextLanguages;
        this.preferredTextRoleFlags = builder.preferredTextRoleFlags;
        this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = builder.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
        this.preferredTextLabels = builder.preferredTextLabels;
        this.ignoredTextSelectionFlags = builder.ignoredTextSelectionFlags;
        this.selectUndeterminedTextLanguage = builder.selectUndeterminedTextLanguage;
        this.isPrioritizeImageOverVideoEnabled = builder.isPrioritizeImageOverVideoEnabled;
        this.forceLowestBitrate = builder.forceLowestBitrate;
        this.forceHighestSupportedBitrate = builder.forceHighestSupportedBitrate;
        this.overrides = p076i4.AbstractC2194f0.a(builder.overrides);
        this.disabledTrackTypes = p076i4.AbstractC2214p0.t(builder.disabledTrackTypes);
    }

    public static androidx.media3.common.TrackSelectionParameters fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.TrackSelectionParameters.Builder(bundle).build();
    }

    @java.lang.Deprecated
    public static androidx.media3.common.TrackSelectionParameters getDefaults(android.content.Context context) {
        return DEFAULT;
    }

    public androidx.media3.common.TrackSelectionParameters.Builder buildUpon() {
        return new androidx.media3.common.TrackSelectionParameters.Builder(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            androidx.media3.common.TrackSelectionParameters trackSelectionParameters = (androidx.media3.common.TrackSelectionParameters) obj;
            if (this.maxVideoWidth == trackSelectionParameters.maxVideoWidth && this.maxVideoHeight == trackSelectionParameters.maxVideoHeight && this.maxVideoFrameRate == trackSelectionParameters.maxVideoFrameRate && this.maxVideoBitrate == trackSelectionParameters.maxVideoBitrate && this.minVideoWidth == trackSelectionParameters.minVideoWidth && this.minVideoHeight == trackSelectionParameters.minVideoHeight && this.minVideoFrameRate == trackSelectionParameters.minVideoFrameRate && this.minVideoBitrate == trackSelectionParameters.minVideoBitrate && this.viewportOrientationMayChange == trackSelectionParameters.viewportOrientationMayChange && this.viewportWidth == trackSelectionParameters.viewportWidth && this.viewportHeight == trackSelectionParameters.viewportHeight && this.isViewportSizeLimitedByPhysicalDisplaySize == trackSelectionParameters.isViewportSizeLimitedByPhysicalDisplaySize && this.preferredVideoMimeTypes.equals(trackSelectionParameters.preferredVideoMimeTypes) && this.preferredVideoLabels.equals(trackSelectionParameters.preferredVideoLabels) && this.preferredVideoLanguages.equals(trackSelectionParameters.preferredVideoLanguages) && this.preferredVideoRoleFlags == trackSelectionParameters.preferredVideoRoleFlags && this.preferredAudioLanguages.equals(trackSelectionParameters.preferredAudioLanguages) && this.preferredAudioRoleFlags == trackSelectionParameters.preferredAudioRoleFlags && this.maxAudioChannelCount == trackSelectionParameters.maxAudioChannelCount && this.preferredAudioLabels.equals(trackSelectionParameters.preferredAudioLabels) && this.maxAudioBitrate == trackSelectionParameters.maxAudioBitrate && this.preferredAudioMimeTypes.equals(trackSelectionParameters.preferredAudioMimeTypes) && this.audioOffloadPreferences.equals(trackSelectionParameters.audioOffloadPreferences) && this.selectTextByDefault == trackSelectionParameters.selectTextByDefault && this.preferredTextLabels.equals(trackSelectionParameters.preferredTextLabels) && this.preferredTextLanguages.equals(trackSelectionParameters.preferredTextLanguages) && this.preferredTextRoleFlags == trackSelectionParameters.preferredTextRoleFlags && this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager == trackSelectionParameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager && this.ignoredTextSelectionFlags == trackSelectionParameters.ignoredTextSelectionFlags && this.selectUndeterminedTextLanguage == trackSelectionParameters.selectUndeterminedTextLanguage && this.isPrioritizeImageOverVideoEnabled == trackSelectionParameters.isPrioritizeImageOverVideoEnabled && this.forceLowestBitrate == trackSelectionParameters.forceLowestBitrate && this.forceHighestSupportedBitrate == trackSelectionParameters.forceHighestSupportedBitrate) {
                p076i4.AbstractC2194f0 abstractC2194f0 = this.overrides;
                p076i4.AbstractC2194f0 abstractC2194f1 = trackSelectionParameters.overrides;
                abstractC2194f0.getClass();
                if (p076i4.AbstractC2230y.h(abstractC2194f1, abstractC2194f0) && this.disabledTrackTypes.equals(trackSelectionParameters.disabledTrackTypes)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.disabledTrackTypes.hashCode() + ((this.overrides.hashCode() + ((((((((((((this.preferredTextLabels.hashCode() + ((((((((((this.audioOffloadPreferences.hashCode() + ((this.preferredAudioMimeTypes.hashCode() + ((((this.preferredAudioLabels.hashCode() + ((((((this.preferredAudioLanguages.hashCode() + ((((this.preferredVideoLanguages.hashCode() + ((this.preferredVideoLabels.hashCode() + ((this.preferredVideoMimeTypes.hashCode() + ((((((((((((((((((((((((this.maxVideoWidth + 31) * 31) + this.maxVideoHeight) * 31) + this.maxVideoFrameRate) * 31) + this.maxVideoBitrate) * 31) + this.minVideoWidth) * 31) + this.minVideoHeight) * 31) + this.minVideoFrameRate) * 31) + this.minVideoBitrate) * 31) + (this.viewportOrientationMayChange ? 1 : 0)) * 31) + this.viewportWidth) * 31) + this.viewportHeight) * 31) + (this.isViewportSizeLimitedByPhysicalDisplaySize ? 1 : 0)) * 31)) * 31)) * 31)) * 31) + this.preferredVideoRoleFlags) * 31)) * 31) + this.preferredAudioRoleFlags) * 31) + this.maxAudioChannelCount) * 31)) * 31) + this.maxAudioBitrate) * 31)) * 31)) * 31) + (this.selectTextByDefault ? 1 : 0)) * 31) + this.preferredTextLanguages.hashCode()) * 31) + this.preferredTextRoleFlags) * 31) + (this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager ? 1 : 0)) * 31)) * 31) + this.ignoredTextSelectionFlags) * 31) + (this.selectUndeterminedTextLanguage ? 1 : 0)) * 31) + (this.isPrioritizeImageOverVideoEnabled ? 1 : 0)) * 31) + (this.forceLowestBitrate ? 1 : 0)) * 31) + (this.forceHighestSupportedBitrate ? 1 : 0)) * 31)) * 31);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_MAX_VIDEO_WIDTH, this.maxVideoWidth);
        bundle.putInt(FIELD_MAX_VIDEO_HEIGHT, this.maxVideoHeight);
        bundle.putInt(FIELD_MAX_VIDEO_FRAMERATE, this.maxVideoFrameRate);
        bundle.putInt(FIELD_MAX_VIDEO_BITRATE, this.maxVideoBitrate);
        bundle.putInt(FIELD_MIN_VIDEO_WIDTH, this.minVideoWidth);
        bundle.putInt(FIELD_MIN_VIDEO_HEIGHT, this.minVideoHeight);
        bundle.putInt(FIELD_MIN_VIDEO_FRAMERATE, this.minVideoFrameRate);
        bundle.putInt(FIELD_MIN_VIDEO_BITRATE, this.minVideoBitrate);
        bundle.putInt(FIELD_VIEWPORT_WIDTH, this.viewportWidth);
        bundle.putInt(FIELD_VIEWPORT_HEIGHT, this.viewportHeight);
        bundle.putBoolean(FIELD_IS_VIEWPORT_SIZE_LIMITED_BY_PHYSICAL_DISPLAY_SIZE, this.isViewportSizeLimitedByPhysicalDisplaySize);
        bundle.putBoolean(FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE, this.viewportOrientationMayChange);
        bundle.putStringArray(FIELD_PREFERRED_VIDEO_MIMETYPES, (java.lang.String[]) this.preferredVideoMimeTypes.toArray(new java.lang.String[0]));
        bundle.putStringArray(FIELD_PREFERRED_VIDEO_LANGUAGES, (java.lang.String[]) this.preferredVideoLanguages.toArray(new java.lang.String[0]));
        bundle.putStringArray(FIELD_PREFERRED_VIDEO_LABELS, (java.lang.String[]) this.preferredVideoLabels.toArray(new java.lang.String[0]));
        bundle.putInt(FIELD_PREFERRED_VIDEO_ROLE_FLAGS, this.preferredVideoRoleFlags);
        bundle.putStringArray(FIELD_PREFERRED_AUDIO_LANGUAGES, (java.lang.String[]) this.preferredAudioLanguages.toArray(new java.lang.String[0]));
        bundle.putInt(FIELD_PREFERRED_AUDIO_ROLE_FLAGS, this.preferredAudioRoleFlags);
        bundle.putInt(FIELD_MAX_AUDIO_CHANNEL_COUNT, this.maxAudioChannelCount);
        bundle.putInt(FIELD_MAX_AUDIO_BITRATE, this.maxAudioBitrate);
        bundle.putStringArray(FIELD_PREFERRED_AUDIO_LABELS, (java.lang.String[]) this.preferredAudioLabels.toArray(new java.lang.String[0]));
        bundle.putStringArray(FIELD_PREFERRED_AUDIO_MIME_TYPES, (java.lang.String[]) this.preferredAudioMimeTypes.toArray(new java.lang.String[0]));
        bundle.putBoolean(FIELD_SELECT_TEXT_BY_DEFAULT, this.selectTextByDefault);
        bundle.putStringArray(FIELD_PREFERRED_TEXT_LANGUAGES, (java.lang.String[]) this.preferredTextLanguages.toArray(new java.lang.String[0]));
        bundle.putInt(FIELD_PREFERRED_TEXT_ROLE_FLAGS, this.preferredTextRoleFlags);
        bundle.putBoolean(FIELD_USE_PREFERRED_TEXT_LANGUAGES_AND_ROLE_FLAGS_FROM_CAPTIONING_MANAGER, this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager);
        bundle.putStringArray(FIELD_PREFERRED_TEXT_LABELS, (java.lang.String[]) this.preferredTextLabels.toArray(new java.lang.String[0]));
        bundle.putInt(FIELD_IGNORED_TEXT_SELECTION_FLAGS, this.ignoredTextSelectionFlags);
        bundle.putBoolean(FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE, this.selectUndeterminedTextLanguage);
        bundle.putInt(FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE, this.audioOffloadPreferences.audioOffloadMode);
        bundle.putBoolean(FIELD_IS_GAPLESS_SUPPORT_REQUIRED, this.audioOffloadPreferences.isGaplessSupportRequired);
        bundle.putBoolean(FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, this.audioOffloadPreferences.isSpeedChangeSupportRequired);
        bundle.putBundle(FIELD_AUDIO_OFFLOAD_PREFERENCES, this.audioOffloadPreferences.toBundle());
        bundle.putBoolean(FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED, this.isPrioritizeImageOverVideoEnabled);
        bundle.putBoolean(FIELD_FORCE_LOWEST_BITRATE, this.forceLowestBitrate);
        bundle.putBoolean(FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE, this.forceHighestSupportedBitrate);
        bundle.putParcelableArrayList(FIELD_SELECTION_OVERRIDES, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.overrides.values(), new androidx.media3.common.b(8)));
        bundle.putIntArray(FIELD_DISABLED_TRACK_TYPE, com.google.crypto.tink.shaded.protobuf.q0.H(this.disabledTrackTypes));
        return bundle;
    }

    public static class Builder {
        private androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences;
        private java.util.HashSet<java.lang.Integer> disabledTrackTypes;
        private boolean forceHighestSupportedBitrate;
        private boolean forceLowestBitrate;
        private int ignoredTextSelectionFlags;
        private boolean isPrioritizeImageOverVideoEnabled;
        private boolean isViewportSizeLimitedByPhysicalDisplaySize;
        private int maxAudioBitrate;
        private int maxAudioChannelCount;
        private int maxVideoBitrate;
        private int maxVideoFrameRate;
        private int maxVideoHeight;
        private int maxVideoWidth;
        private int minVideoBitrate;
        private int minVideoFrameRate;
        private int minVideoHeight;
        private int minVideoWidth;
        private java.util.HashMap<androidx.media3.common.TrackGroup, androidx.media3.common.TrackSelectionOverride> overrides;
        private p076i4.AbstractC2186b0 preferredAudioLabels;
        private p076i4.AbstractC2186b0 preferredAudioLanguages;
        private p076i4.AbstractC2186b0 preferredAudioMimeTypes;
        private int preferredAudioRoleFlags;
        private p076i4.AbstractC2186b0 preferredTextLabels;
        private p076i4.AbstractC2186b0 preferredTextLanguages;
        private int preferredTextRoleFlags;
        private p076i4.AbstractC2186b0 preferredVideoLabels;
        private p076i4.AbstractC2186b0 preferredVideoLanguages;
        private p076i4.AbstractC2186b0 preferredVideoMimeTypes;
        private int preferredVideoRoleFlags;
        private boolean selectTextByDefault;
        private boolean selectUndeterminedTextLanguage;
        private boolean usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
        private int viewportHeight;
        private boolean viewportOrientationMayChange;
        private int viewportWidth;

        public Builder() {
            this.maxVideoWidth = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.maxVideoHeight = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.maxVideoFrameRate = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.maxVideoBitrate = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.viewportWidth = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.viewportHeight = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.isViewportSizeLimitedByPhysicalDisplaySize = true;
            this.viewportOrientationMayChange = true;
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            p076i4.S0 s9 = p076i4.S0.f22832l;
            this.preferredVideoMimeTypes = s9;
            this.preferredVideoLabels = s9;
            this.preferredVideoLanguages = s9;
            this.preferredVideoRoleFlags = 0;
            this.preferredAudioLanguages = s9;
            this.preferredAudioLabels = s9;
            this.preferredAudioRoleFlags = 0;
            this.maxAudioChannelCount = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.maxAudioBitrate = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.preferredAudioMimeTypes = s9;
            this.audioOffloadPreferences = androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT;
            this.selectTextByDefault = false;
            this.preferredTextLanguages = s9;
            this.preferredTextRoleFlags = 0;
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = true;
            this.preferredTextLabels = s9;
            this.ignoredTextSelectionFlags = 0;
            this.selectUndeterminedTextLanguage = false;
            this.isPrioritizeImageOverVideoEnabled = false;
            this.forceLowestBitrate = false;
            this.forceHighestSupportedBitrate = false;
            this.overrides = new java.util.HashMap<>();
            this.disabledTrackTypes = new java.util.HashSet<>();
        }

        private static androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences getAudioOffloadPreferencesFromBundle(android.os.Bundle bundle) {
            android.os.Bundle bundle2 = bundle.getBundle(androidx.media3.common.TrackSelectionParameters.FIELD_AUDIO_OFFLOAD_PREFERENCES);
            if (bundle2 != null) {
                return androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.fromBundle(bundle2);
            }
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder builder = new androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.Builder();
            java.lang.String str = androidx.media3.common.TrackSelectionParameters.FIELD_AUDIO_OFFLOAD_MODE_PREFERENCE;
            androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences = androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences.DEFAULT;
            return builder.setAudioOffloadMode(bundle.getInt(str, audioOffloadPreferences.audioOffloadMode)).setIsGaplessSupportRequired(bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_IS_GAPLESS_SUPPORT_REQUIRED, audioOffloadPreferences.isGaplessSupportRequired)).setIsSpeedChangeSupportRequired(bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_IS_SPEED_CHANGE_SUPPORT_REQUIRED, audioOffloadPreferences.isSpeedChangeSupportRequired)).build();
        }

        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"preferredVideoMimeTypes", "preferredVideoLanguages", "preferredAudioLanguages", "preferredAudioMimeTypes", "audioOffloadPreferences", "preferredTextLanguages", "overrides", "disabledTrackTypes", "preferredVideoLabels", "preferredAudioLabels", "preferredTextLabels"})
        private void init(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            this.maxVideoWidth = trackSelectionParameters.maxVideoWidth;
            this.maxVideoHeight = trackSelectionParameters.maxVideoHeight;
            this.maxVideoFrameRate = trackSelectionParameters.maxVideoFrameRate;
            this.maxVideoBitrate = trackSelectionParameters.maxVideoBitrate;
            this.minVideoWidth = trackSelectionParameters.minVideoWidth;
            this.minVideoHeight = trackSelectionParameters.minVideoHeight;
            this.minVideoFrameRate = trackSelectionParameters.minVideoFrameRate;
            this.minVideoBitrate = trackSelectionParameters.minVideoBitrate;
            this.viewportWidth = trackSelectionParameters.viewportWidth;
            this.viewportHeight = trackSelectionParameters.viewportHeight;
            this.isViewportSizeLimitedByPhysicalDisplaySize = trackSelectionParameters.isViewportSizeLimitedByPhysicalDisplaySize;
            this.viewportOrientationMayChange = trackSelectionParameters.viewportOrientationMayChange;
            this.preferredVideoLabels = trackSelectionParameters.preferredVideoLabels;
            this.preferredVideoMimeTypes = trackSelectionParameters.preferredVideoMimeTypes;
            this.preferredVideoLanguages = trackSelectionParameters.preferredVideoLanguages;
            this.preferredVideoRoleFlags = trackSelectionParameters.preferredVideoRoleFlags;
            this.preferredAudioLanguages = trackSelectionParameters.preferredAudioLanguages;
            this.preferredAudioRoleFlags = trackSelectionParameters.preferredAudioRoleFlags;
            this.preferredAudioLabels = trackSelectionParameters.preferredAudioLabels;
            this.maxAudioChannelCount = trackSelectionParameters.maxAudioChannelCount;
            this.maxAudioBitrate = trackSelectionParameters.maxAudioBitrate;
            this.preferredAudioMimeTypes = trackSelectionParameters.preferredAudioMimeTypes;
            this.audioOffloadPreferences = trackSelectionParameters.audioOffloadPreferences;
            this.selectTextByDefault = trackSelectionParameters.selectTextByDefault;
            this.preferredTextLanguages = trackSelectionParameters.preferredTextLanguages;
            this.preferredTextRoleFlags = trackSelectionParameters.preferredTextRoleFlags;
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = trackSelectionParameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager;
            this.preferredTextLabels = trackSelectionParameters.preferredTextLabels;
            this.ignoredTextSelectionFlags = trackSelectionParameters.ignoredTextSelectionFlags;
            this.selectUndeterminedTextLanguage = trackSelectionParameters.selectUndeterminedTextLanguage;
            this.isPrioritizeImageOverVideoEnabled = trackSelectionParameters.isPrioritizeImageOverVideoEnabled;
            this.forceLowestBitrate = trackSelectionParameters.forceLowestBitrate;
            this.forceHighestSupportedBitrate = trackSelectionParameters.forceHighestSupportedBitrate;
            this.disabledTrackTypes = new java.util.HashSet<>(trackSelectionParameters.disabledTrackTypes);
            this.overrides = new java.util.HashMap<>(trackSelectionParameters.overrides);
        }

        private static p076i4.AbstractC2186b0 normalizeLanguageCodes(java.lang.String[] strArr) {
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            strArr.getClass();
            for (java.lang.String str : strArr) {
                str.getClass();
                yS.c(androidx.media3.common.util.Util.normalizeLanguageCode(str));
            }
            return yS.f();
        }

        public androidx.media3.common.TrackSelectionParameters.Builder addOverride(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            this.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters build() {
            return new androidx.media3.common.TrackSelectionParameters(this);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearOverride(androidx.media3.common.TrackGroup trackGroup) {
            this.overrides.remove(trackGroup);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearOverrides() {
            this.overrides.clear();
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearOverridesOfType(int i3) {
            java.util.Iterator<androidx.media3.common.TrackSelectionOverride> it = this.overrides.values().iterator();
            while (it.hasNext()) {
                if (it.next().getType() == i3) {
                    it.remove();
                }
            }
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearVideoSizeConstraints() {
            return setMaxVideoSize(androidx.media3.common.util.Log.LOG_LEVEL_OFF, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder clearViewportSizeConstraints() {
            return setViewportSize(androidx.media3.common.util.Log.LOG_LEVEL_OFF, androidx.media3.common.util.Log.LOG_LEVEL_OFF, true);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder set(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            init(trackSelectionParameters);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setAudioOffloadPreferences(androidx.media3.common.TrackSelectionParameters.AudioOffloadPreferences audioOffloadPreferences) {
            this.audioOffloadPreferences = audioOffloadPreferences;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setDisabledTrackTypes(java.util.Set<java.lang.Integer> set) {
            this.disabledTrackTypes.clear();
            this.disabledTrackTypes.addAll(set);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setForceHighestSupportedBitrate(boolean z6) {
            this.forceHighestSupportedBitrate = z6;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setForceLowestBitrate(boolean z6) {
            this.forceLowestBitrate = z6;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setIgnoredTextSelectionFlags(int i3) {
            this.ignoredTextSelectionFlags = i3;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxAudioBitrate(int i3) {
            this.maxAudioBitrate = i3;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxAudioChannelCount(int i3) {
            this.maxAudioChannelCount = i3;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoBitrate(int i3) {
            this.maxVideoBitrate = i3;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoFrameRate(int i3) {
            this.maxVideoFrameRate = i3;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoSize(int i3, int i9) {
            this.maxVideoWidth = i3;
            this.maxVideoHeight = i9;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMaxVideoSizeSd() {
            return setMaxVideoSize(androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMinVideoBitrate(int i3) {
            this.minVideoBitrate = i3;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMinVideoFrameRate(int i3) {
            this.minVideoFrameRate = i3;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setMinVideoSize(int i3, int i9) {
            this.minVideoWidth = i3;
            this.minVideoHeight = i9;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setOverrideForType(androidx.media3.common.TrackSelectionOverride trackSelectionOverride) {
            clearOverridesOfType(trackSelectionOverride.getType());
            this.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioLabels(java.lang.String... strArr) {
            this.preferredAudioLabels = p076i4.AbstractC2186b0.v(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioLanguage(java.lang.String str) {
            return str == null ? setPreferredAudioLanguages(new java.lang.String[0]) : setPreferredAudioLanguages(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioLanguages(java.lang.String... strArr) {
            this.preferredAudioLanguages = normalizeLanguageCodes(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioMimeType(java.lang.String str) {
            return str == null ? setPreferredAudioMimeTypes(new java.lang.String[0]) : setPreferredAudioMimeTypes(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioMimeTypes(java.lang.String... strArr) {
            this.preferredAudioMimeTypes = p076i4.AbstractC2186b0.v(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredAudioRoleFlags(int i3) {
            this.preferredAudioRoleFlags = i3;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLabels(java.lang.String... strArr) {
            this.preferredTextLabels = p076i4.AbstractC2186b0.v(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguage(java.lang.String str) {
            return str == null ? setPreferredTextLanguages(new java.lang.String[0]) : setPreferredTextLanguages(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings() {
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = true;
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            this.preferredTextLanguages = p076i4.S0.f22832l;
            this.preferredTextRoleFlags = 0;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguages(java.lang.String... strArr) {
            this.preferredTextLanguages = normalizeLanguageCodes(strArr);
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = false;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextRoleFlags(int i3) {
            this.preferredTextRoleFlags = i3;
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = false;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoLabels(java.lang.String... strArr) {
            this.preferredVideoLabels = p076i4.AbstractC2186b0.v(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoLanguage(java.lang.String str) {
            return str == null ? setPreferredVideoLanguages(new java.lang.String[0]) : setPreferredVideoLanguages(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoLanguages(java.lang.String... strArr) {
            this.preferredVideoLanguages = normalizeLanguageCodes(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoMimeType(java.lang.String str) {
            return str == null ? setPreferredVideoMimeTypes(new java.lang.String[0]) : setPreferredVideoMimeTypes(str);
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoMimeTypes(java.lang.String... strArr) {
            this.preferredVideoMimeTypes = p076i4.AbstractC2186b0.v(strArr);
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredVideoRoleFlags(int i3) {
            this.preferredVideoRoleFlags = i3;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setPrioritizeImageOverVideoEnabled(boolean z6) {
            this.isPrioritizeImageOverVideoEnabled = z6;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setSelectTextByDefault(boolean z6) {
            this.selectTextByDefault = z6;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setSelectUndeterminedTextLanguage(boolean z6) {
            this.selectUndeterminedTextLanguage = z6;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setTrackTypeDisabled(int i3, boolean z6) {
            if (z6) {
                this.disabledTrackTypes.add(java.lang.Integer.valueOf(i3));
                return this;
            }
            this.disabledTrackTypes.remove(java.lang.Integer.valueOf(i3));
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setViewportSize(int i3, int i9, boolean z6) {
            this.viewportWidth = i3;
            this.viewportHeight = i9;
            this.viewportOrientationMayChange = z6;
            this.isViewportSizeLimitedByPhysicalDisplaySize = false;
            return this;
        }

        public androidx.media3.common.TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(boolean z6) {
            this.isViewportSizeLimitedByPhysicalDisplaySize = true;
            this.viewportOrientationMayChange = z6;
            this.viewportHeight = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            this.viewportWidth = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.TrackSelectionParameters.Builder setViewportSizeToPhysicalDisplaySize(android.content.Context context, boolean z6) {
            return setViewportSizeToPhysicalDisplaySize(z6);
        }

        @java.lang.Deprecated
        public androidx.media3.common.TrackSelectionParameters.Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(android.content.Context context) {
            return setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings();
        }

        @java.lang.Deprecated
        public Builder(android.content.Context context) {
            this();
        }

        public Builder(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            init(trackSelectionParameters);
        }

        public Builder(android.os.Bundle bundle) {
            java.util.List listFromBundleList;
            java.lang.String str = androidx.media3.common.TrackSelectionParameters.FIELD_MAX_VIDEO_WIDTH;
            androidx.media3.common.TrackSelectionParameters trackSelectionParameters = androidx.media3.common.TrackSelectionParameters.DEFAULT;
            this.maxVideoWidth = bundle.getInt(str, trackSelectionParameters.maxVideoWidth);
            this.maxVideoHeight = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_VIDEO_HEIGHT, trackSelectionParameters.maxVideoHeight);
            this.maxVideoFrameRate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_VIDEO_FRAMERATE, trackSelectionParameters.maxVideoFrameRate);
            this.maxVideoBitrate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_VIDEO_BITRATE, trackSelectionParameters.maxVideoBitrate);
            this.minVideoWidth = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MIN_VIDEO_WIDTH, trackSelectionParameters.minVideoWidth);
            this.minVideoHeight = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MIN_VIDEO_HEIGHT, trackSelectionParameters.minVideoHeight);
            this.minVideoFrameRate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MIN_VIDEO_FRAMERATE, trackSelectionParameters.minVideoFrameRate);
            this.minVideoBitrate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MIN_VIDEO_BITRATE, trackSelectionParameters.minVideoBitrate);
            this.viewportWidth = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_VIEWPORT_WIDTH, trackSelectionParameters.viewportWidth);
            int i3 = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_VIEWPORT_HEIGHT, trackSelectionParameters.viewportHeight);
            this.viewportHeight = i3;
            this.isViewportSizeLimitedByPhysicalDisplaySize = this.viewportWidth == Integer.MAX_VALUE && i3 == Integer.MAX_VALUE && bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_IS_VIEWPORT_SIZE_LIMITED_BY_PHYSICAL_DISPLAY_SIZE, trackSelectionParameters.isViewportSizeLimitedByPhysicalDisplaySize);
            this.viewportOrientationMayChange = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_VIEWPORT_ORIENTATION_MAY_CHANGE, trackSelectionParameters.viewportOrientationMayChange);
            this.preferredVideoMimeTypes = p076i4.AbstractC2186b0.v((java.lang.String[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_MIMETYPES), new java.lang.String[0]));
            this.preferredVideoLabels = p076i4.AbstractC2186b0.v((java.lang.String[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_LABELS), new java.lang.String[0]));
            this.preferredVideoLanguages = p076i4.AbstractC2186b0.v((java.lang.String[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_LANGUAGES), new java.lang.String[0]));
            this.preferredVideoRoleFlags = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_VIDEO_ROLE_FLAGS, trackSelectionParameters.preferredVideoRoleFlags);
            this.preferredAudioLanguages = normalizeLanguageCodes((java.lang.String[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_LANGUAGES), new java.lang.String[0]));
            this.preferredAudioLabels = p076i4.AbstractC2186b0.v((java.lang.String[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_LABELS), new java.lang.String[0]));
            this.preferredAudioRoleFlags = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_ROLE_FLAGS, trackSelectionParameters.preferredAudioRoleFlags);
            this.maxAudioChannelCount = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_AUDIO_CHANNEL_COUNT, trackSelectionParameters.maxAudioChannelCount);
            this.maxAudioBitrate = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_MAX_AUDIO_BITRATE, trackSelectionParameters.maxAudioBitrate);
            this.preferredAudioMimeTypes = p076i4.AbstractC2186b0.v((java.lang.String[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_AUDIO_MIME_TYPES), new java.lang.String[0]));
            this.audioOffloadPreferences = getAudioOffloadPreferencesFromBundle(bundle);
            this.selectTextByDefault = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_SELECT_TEXT_BY_DEFAULT, trackSelectionParameters.selectTextByDefault);
            this.preferredTextLanguages = normalizeLanguageCodes((java.lang.String[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_TEXT_LANGUAGES), new java.lang.String[0]));
            this.preferredTextRoleFlags = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_TEXT_ROLE_FLAGS, trackSelectionParameters.preferredTextRoleFlags);
            this.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager = this.preferredTextLanguages.isEmpty() && this.preferredTextRoleFlags == 0 && bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_USE_PREFERRED_TEXT_LANGUAGES_AND_ROLE_FLAGS_FROM_CAPTIONING_MANAGER, trackSelectionParameters.usePreferredTextLanguagesAndRoleFlagsFromCaptioningManager);
            this.ignoredTextSelectionFlags = bundle.getInt(androidx.media3.common.TrackSelectionParameters.FIELD_IGNORED_TEXT_SELECTION_FLAGS, trackSelectionParameters.ignoredTextSelectionFlags);
            this.preferredTextLabels = p076i4.AbstractC2186b0.v((java.lang.String[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getStringArray(androidx.media3.common.TrackSelectionParameters.FIELD_PREFERRED_TEXT_LABELS), new java.lang.String[0]));
            this.selectUndeterminedTextLanguage = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_SELECT_UNDETERMINED_TEXT_LANGUAGE, trackSelectionParameters.selectUndeterminedTextLanguage);
            this.isPrioritizeImageOverVideoEnabled = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_IS_PREFER_IMAGE_OVER_VIDEO_ENABLED, trackSelectionParameters.isPrioritizeImageOverVideoEnabled);
            this.forceLowestBitrate = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_FORCE_LOWEST_BITRATE, trackSelectionParameters.forceLowestBitrate);
            this.forceHighestSupportedBitrate = bundle.getBoolean(androidx.media3.common.TrackSelectionParameters.FIELD_FORCE_HIGHEST_SUPPORTED_BITRATE, trackSelectionParameters.forceHighestSupportedBitrate);
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(androidx.media3.common.TrackSelectionParameters.FIELD_SELECTION_OVERRIDES);
            if (parcelableArrayList == null) {
                listFromBundleList = p076i4.S0.f22832l;
            } else {
                listFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.b(9), parcelableArrayList);
            }
            this.overrides = new java.util.HashMap<>();
            for (int i9 = 0; i9 < listFromBundleList.size(); i9++) {
                androidx.media3.common.TrackSelectionOverride trackSelectionOverride = (androidx.media3.common.TrackSelectionOverride) listFromBundleList.get(i9);
                this.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
            }
            int[] iArr = (int[]) com.google.crypto.tink.shaded.protobuf.AbstractC1911f.t(bundle.getIntArray(androidx.media3.common.TrackSelectionParameters.FIELD_DISABLED_TRACK_TYPE), new int[0]);
            this.disabledTrackTypes = new java.util.HashSet<>();
            for (int i10 : iArr) {
                this.disabledTrackTypes.add(java.lang.Integer.valueOf(i10));
            }
        }
    }
}
