package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class MediaItem {
    public static final java.lang.String DEFAULT_MEDIA_ID = "";
    public final androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration;

    @java.lang.Deprecated
    public final androidx.media3.common.MediaItem.ClippingProperties clippingProperties;
    public final androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration;
    public final androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
    public final java.lang.String mediaId;
    public final androidx.media3.common.MediaMetadata mediaMetadata;

    @java.lang.Deprecated
    public final androidx.media3.common.MediaItem.LocalConfiguration playbackProperties;
    public final androidx.media3.common.MediaItem.RequestMetadata requestMetadata;
    public static final androidx.media3.common.MediaItem EMPTY = new androidx.media3.common.MediaItem.Builder().build();
    private static final java.lang.String FIELD_MEDIA_ID = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_LIVE_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_MEDIA_METADATA = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_CLIPPING_PROPERTIES = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_REQUEST_METADATA = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_LOCAL_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    public static final class AdsConfiguration {
        private static final java.lang.String FIELD_AD_TAG_URI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        public final android.net.Uri adTagUri;
        public final java.lang.Object adsId;

        public static final class Builder {
            private android.net.Uri adTagUri;
            private java.lang.Object adsId;

            public Builder(android.net.Uri uri) {
                this.adTagUri = uri;
            }

            public androidx.media3.common.MediaItem.AdsConfiguration build() {
                return new androidx.media3.common.MediaItem.AdsConfiguration(this);
            }

            public androidx.media3.common.MediaItem.AdsConfiguration.Builder setAdTagUri(android.net.Uri uri) {
                this.adTagUri = uri;
                return this;
            }

            public androidx.media3.common.MediaItem.AdsConfiguration.Builder setAdsId(java.lang.Object obj) {
                this.adsId = obj;
                return this;
            }
        }

        public static androidx.media3.common.MediaItem.AdsConfiguration fromBundle(android.os.Bundle bundle) {
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable(FIELD_AD_TAG_URI);
            uri.getClass();
            return new androidx.media3.common.MediaItem.AdsConfiguration.Builder(uri).build();
        }

        public androidx.media3.common.MediaItem.AdsConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.AdsConfiguration.Builder(this.adTagUri).setAdsId(this.adsId);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.AdsConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = (androidx.media3.common.MediaItem.AdsConfiguration) obj;
            return this.adTagUri.equals(adsConfiguration.adTagUri) && java.util.Objects.equals(this.adsId, adsConfiguration.adsId);
        }

        public int hashCode() {
            int iHashCode = this.adTagUri.hashCode() * 31;
            java.lang.Object obj = this.adsId;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(FIELD_AD_TAG_URI, this.adTagUri);
            return bundle;
        }

        private AdsConfiguration(androidx.media3.common.MediaItem.AdsConfiguration.Builder builder) {
            this.adTagUri = builder.adTagUri;
            this.adsId = builder.adsId;
        }
    }

    public static final class Builder {
        private androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration;
        private androidx.media3.common.MediaItem.ClippingConfiguration.Builder clippingConfiguration;
        private java.lang.String customCacheKey;
        private androidx.media3.common.MediaItem.DrmConfiguration.Builder drmConfiguration;
        private long imageDurationMs;
        private androidx.media3.common.MediaItem.LiveConfiguration.Builder liveConfiguration;
        private java.lang.String mediaId;
        private androidx.media3.common.MediaMetadata mediaMetadata;
        private java.lang.String mimeType;
        private androidx.media3.common.MediaItem.RequestMetadata requestMetadata;
        private java.util.List<androidx.media3.common.StreamKey> streamKeys;
        private p076i4.AbstractC2186b0 subtitleConfigurations;
        private java.lang.Object tag;
        private android.net.Uri uri;

        public androidx.media3.common.MediaItem build() {
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.drmConfiguration.licenseUri == null || this.drmConfiguration.scheme != null);
            android.net.Uri uri = this.uri;
            if (uri != null) {
                localConfiguration = new androidx.media3.common.MediaItem.LocalConfiguration(uri, this.mimeType, this.drmConfiguration.scheme != null ? this.drmConfiguration.build() : null, this.adsConfiguration, this.streamKeys, this.customCacheKey, this.subtitleConfigurations, this.tag, this.imageDurationMs);
            } else {
                localConfiguration = null;
            }
            java.lang.String str = this.mediaId;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            androidx.media3.common.MediaItem.ClippingProperties clippingPropertiesBuildClippingProperties = this.clippingConfiguration.buildClippingProperties();
            androidx.media3.common.MediaItem.LiveConfiguration liveConfigurationBuild = this.liveConfiguration.build();
            androidx.media3.common.MediaMetadata mediaMetadata = this.mediaMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = androidx.media3.common.MediaMetadata.EMPTY;
            }
            return new androidx.media3.common.MediaItem(str2, clippingPropertiesBuildClippingProperties, localConfiguration, liveConfigurationBuild, mediaMetadata, this.requestMetadata);
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setAdTagUri(java.lang.String str) {
            return setAdTagUri(str != null ? android.net.Uri.parse(str) : null);
        }

        public androidx.media3.common.MediaItem.Builder setAdsConfiguration(androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration) {
            this.adsConfiguration = adsConfiguration;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipEndPositionMs(long j) {
            this.clippingConfiguration.setEndPositionMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipRelativeToDefaultPosition(boolean z6) {
            this.clippingConfiguration.setRelativeToDefaultPosition(z6);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipRelativeToLiveWindow(boolean z6) {
            this.clippingConfiguration.setRelativeToLiveWindow(z6);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipStartPositionMs(long j) {
            this.clippingConfiguration.setStartPositionMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setClipStartsAtKeyFrame(boolean z6) {
            this.clippingConfiguration.setStartsAtKeyFrame(z6);
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setClippingConfiguration(androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration) {
            this.clippingConfiguration = clippingConfiguration.buildUpon();
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setCustomCacheKey(java.lang.String str) {
            this.customCacheKey = str;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setDrmConfiguration(androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration) {
            this.drmConfiguration = drmConfiguration != null ? drmConfiguration.buildUpon() : new androidx.media3.common.MediaItem.DrmConfiguration.Builder();
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmForceDefaultLicenseUri(boolean z6) {
            this.drmConfiguration.setForceDefaultLicenseUri(z6);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmKeySetId(byte[] bArr) {
            this.drmConfiguration.setKeySetId(bArr);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmLicenseRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder builder = this.drmConfiguration;
            if (map == null) {
                map = p076i4.X0.f22848n;
            }
            builder.setLicenseRequestHeaders(map);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmLicenseUri(android.net.Uri uri) {
            this.drmConfiguration.setLicenseUri(uri);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmMultiSession(boolean z6) {
            this.drmConfiguration.setMultiSession(z6);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmPlayClearContentWithoutKey(boolean z6) {
            this.drmConfiguration.setPlayClearContentWithoutKey(z6);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmSessionForClearPeriods(boolean z6) {
            this.drmConfiguration.setForceSessionsForAudioAndVideoTracks(z6);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmSessionForClearTypes(java.util.List<java.lang.Integer> list) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder builder = this.drmConfiguration;
            if (list == null) {
                p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                list = p076i4.S0.f22832l;
            }
            builder.setForcedSessionTrackTypes(list);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmUuid(java.util.UUID uuid) {
            this.drmConfiguration.setNullableScheme(uuid);
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setImageDurationMs(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j > 0 || j == androidx.media3.common.C.TIME_UNSET);
            this.imageDurationMs = j;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setLiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
            this.liveConfiguration = liveConfiguration.buildUpon();
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveMaxOffsetMs(long j) {
            this.liveConfiguration.setMaxOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveMaxPlaybackSpeed(float f9) {
            this.liveConfiguration.setMaxPlaybackSpeed(f9);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveMinOffsetMs(long j) {
            this.liveConfiguration.setMinOffsetMs(j);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveMinPlaybackSpeed(float f9) {
            this.liveConfiguration.setMinPlaybackSpeed(f9);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setLiveTargetOffsetMs(long j) {
            this.liveConfiguration.setTargetOffsetMs(j);
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setMediaId(java.lang.String str) {
            str.getClass();
            this.mediaId = str;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setMediaMetadata(androidx.media3.common.MediaMetadata mediaMetadata) {
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setMimeType(java.lang.String str) {
            this.mimeType = str;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setRequestMetadata(androidx.media3.common.MediaItem.RequestMetadata requestMetadata) {
            this.requestMetadata = requestMetadata;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setStreamKeys(java.util.List<androidx.media3.common.StreamKey> list) {
            this.streamKeys = (list == null || list.isEmpty()) ? java.util.Collections.EMPTY_LIST : java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setSubtitleConfigurations(java.util.List<androidx.media3.common.MediaItem.SubtitleConfiguration> list) {
            this.subtitleConfigurations = p076i4.AbstractC2186b0.u(list);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setSubtitles(java.util.List<androidx.media3.common.MediaItem.Subtitle> list) {
            p076i4.AbstractC2186b0 abstractC2186b0U;
            if (list != null) {
                abstractC2186b0U = p076i4.AbstractC2186b0.u(list);
            } else {
                p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                abstractC2186b0U = p076i4.S0.f22832l;
            }
            this.subtitleConfigurations = abstractC2186b0U;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setTag(java.lang.Object obj) {
            this.tag = obj;
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setUri(java.lang.String str) {
            return setUri(str == null ? null : android.net.Uri.parse(str));
        }

        public Builder() {
            this.clippingConfiguration = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
            this.drmConfiguration = new androidx.media3.common.MediaItem.DrmConfiguration.Builder();
            this.streamKeys = java.util.Collections.EMPTY_LIST;
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            this.subtitleConfigurations = p076i4.S0.f22832l;
            this.liveConfiguration = new androidx.media3.common.MediaItem.LiveConfiguration.Builder();
            this.requestMetadata = androidx.media3.common.MediaItem.RequestMetadata.EMPTY;
            this.imageDurationMs = androidx.media3.common.C.TIME_UNSET;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setAdTagUri(android.net.Uri uri) {
            return setAdTagUri(uri, null);
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setDrmLicenseUri(java.lang.String str) {
            this.drmConfiguration.setLicenseUri(str);
            return this;
        }

        public androidx.media3.common.MediaItem.Builder setUri(android.net.Uri uri) {
            this.uri = uri;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.common.MediaItem.Builder setAdTagUri(android.net.Uri uri, java.lang.Object obj) {
            this.adsConfiguration = uri != null ? new androidx.media3.common.MediaItem.AdsConfiguration.Builder(uri).setAdsId(obj).build() : null;
            return this;
        }

        private Builder(androidx.media3.common.MediaItem mediaItem) {
            androidx.media3.common.MediaItem.DrmConfiguration.Builder builder;
            this();
            this.clippingConfiguration = mediaItem.clippingConfiguration.buildUpon();
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            this.liveConfiguration = mediaItem.liveConfiguration.buildUpon();
            this.requestMetadata = mediaItem.requestMetadata;
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = mediaItem.localConfiguration;
            if (localConfiguration != null) {
                this.customCacheKey = localConfiguration.customCacheKey;
                this.mimeType = localConfiguration.mimeType;
                this.uri = localConfiguration.uri;
                this.streamKeys = localConfiguration.streamKeys;
                this.subtitleConfigurations = localConfiguration.subtitleConfigurations;
                this.tag = localConfiguration.tag;
                androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = localConfiguration.drmConfiguration;
                if (drmConfiguration != null) {
                    builder = drmConfiguration.buildUpon();
                } else {
                    builder = new androidx.media3.common.MediaItem.DrmConfiguration.Builder();
                }
                this.drmConfiguration = builder;
                this.adsConfiguration = localConfiguration.adsConfiguration;
                this.imageDurationMs = localConfiguration.imageDurationMs;
            }
        }
    }

    public static class ClippingConfiguration {
        public final boolean allowUnseekableMedia;
        public final long endPositionMs;
        public final long endPositionUs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final long startPositionUs;
        public final boolean startsAtKeyFrame;
        public static final androidx.media3.common.MediaItem.ClippingConfiguration UNSET = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().build();
        private static final java.lang.String FIELD_START_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_END_POSITION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_RELATIVE_TO_LIVE_WINDOW = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_RELATIVE_TO_DEFAULT_POSITION = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_STARTS_AT_KEY_FRAME = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        static final java.lang.String FIELD_START_POSITION_US = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        static final java.lang.String FIELD_END_POSITION_US = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String FIELD_ALLOW_UNSEEKABLE_MEDIA = androidx.media3.common.util.Util.intToStringMaxRadix(7);

        public static final class Builder {
            private boolean allowUnseekableMedia;
            private long endPositionUs;
            private boolean relativeToDefaultPosition;
            private boolean relativeToLiveWindow;
            private long startPositionUs;
            private boolean startsAtKeyFrame;

            public androidx.media3.common.MediaItem.ClippingConfiguration build() {
                return new androidx.media3.common.MediaItem.ClippingConfiguration(this);
            }

            @java.lang.Deprecated
            public androidx.media3.common.MediaItem.ClippingProperties buildClippingProperties() {
                return new androidx.media3.common.MediaItem.ClippingProperties(this);
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setAllowUnseekableMedia(boolean z6) {
                this.allowUnseekableMedia = z6;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setEndPositionMs(long j) {
                return setEndPositionUs(androidx.media3.common.util.Util.msToUs(j));
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setEndPositionUs(long j) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j == Long.MIN_VALUE || j >= 0);
                this.endPositionUs = j;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setRelativeToDefaultPosition(boolean z6) {
                this.relativeToDefaultPosition = z6;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setRelativeToLiveWindow(boolean z6) {
                this.relativeToLiveWindow = z6;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setStartPositionMs(long j) {
                return setStartPositionUs(androidx.media3.common.util.Util.msToUs(j));
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setStartPositionUs(long j) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j >= 0);
                this.startPositionUs = j;
                return this;
            }

            public androidx.media3.common.MediaItem.ClippingConfiguration.Builder setStartsAtKeyFrame(boolean z6) {
                this.startsAtKeyFrame = z6;
                return this;
            }

            public Builder() {
                this.endPositionUs = Long.MIN_VALUE;
            }

            private Builder(androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration) {
                this.startPositionUs = clippingConfiguration.startPositionUs;
                this.endPositionUs = clippingConfiguration.endPositionUs;
                this.relativeToLiveWindow = clippingConfiguration.relativeToLiveWindow;
                this.relativeToDefaultPosition = clippingConfiguration.relativeToDefaultPosition;
                this.startsAtKeyFrame = clippingConfiguration.startsAtKeyFrame;
                this.allowUnseekableMedia = clippingConfiguration.allowUnseekableMedia;
            }
        }

        public static androidx.media3.common.MediaItem.ClippingProperties fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
            java.lang.String str = FIELD_START_POSITION_MS;
            androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = UNSET;
            androidx.media3.common.MediaItem.ClippingConfiguration.Builder allowUnseekableMedia = builder.setStartPositionMs(bundle.getLong(str, clippingConfiguration.startPositionMs)).setEndPositionMs(bundle.getLong(FIELD_END_POSITION_MS, clippingConfiguration.endPositionMs)).setRelativeToLiveWindow(bundle.getBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, clippingConfiguration.relativeToLiveWindow)).setRelativeToDefaultPosition(bundle.getBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, clippingConfiguration.relativeToDefaultPosition)).setStartsAtKeyFrame(bundle.getBoolean(FIELD_STARTS_AT_KEY_FRAME, clippingConfiguration.startsAtKeyFrame)).setAllowUnseekableMedia(bundle.getBoolean(FIELD_ALLOW_UNSEEKABLE_MEDIA, clippingConfiguration.allowUnseekableMedia));
            long j = bundle.getLong(FIELD_START_POSITION_US, clippingConfiguration.startPositionUs);
            if (j != clippingConfiguration.startPositionUs) {
                allowUnseekableMedia.setStartPositionUs(j);
            }
            long j9 = bundle.getLong(FIELD_END_POSITION_US, clippingConfiguration.endPositionUs);
            if (j9 != clippingConfiguration.endPositionUs) {
                allowUnseekableMedia.setEndPositionUs(j9);
            }
            return allowUnseekableMedia.buildClippingProperties();
        }

        public androidx.media3.common.MediaItem.ClippingConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.ClippingConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.ClippingConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = (androidx.media3.common.MediaItem.ClippingConfiguration) obj;
            return this.startPositionUs == clippingConfiguration.startPositionUs && this.endPositionUs == clippingConfiguration.endPositionUs && this.relativeToLiveWindow == clippingConfiguration.relativeToLiveWindow && this.relativeToDefaultPosition == clippingConfiguration.relativeToDefaultPosition && this.startsAtKeyFrame == clippingConfiguration.startsAtKeyFrame && this.allowUnseekableMedia == clippingConfiguration.allowUnseekableMedia;
        }

        public int hashCode() {
            long j = this.startPositionUs;
            int i3 = ((int) (j ^ (j >>> 32))) * 31;
            long j9 = this.endPositionUs;
            return ((((((((i3 + ((int) ((j9 >>> 32) ^ j9))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0)) * 31) + (this.allowUnseekableMedia ? 1 : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            long j = this.startPositionMs;
            androidx.media3.common.MediaItem.ClippingConfiguration clippingConfiguration = UNSET;
            if (j != clippingConfiguration.startPositionMs) {
                bundle.putLong(FIELD_START_POSITION_MS, j);
            }
            long j9 = this.endPositionMs;
            if (j9 != clippingConfiguration.endPositionMs) {
                bundle.putLong(FIELD_END_POSITION_MS, j9);
            }
            long j10 = this.startPositionUs;
            if (j10 != clippingConfiguration.startPositionUs) {
                bundle.putLong(FIELD_START_POSITION_US, j10);
            }
            long j11 = this.endPositionUs;
            if (j11 != clippingConfiguration.endPositionUs) {
                bundle.putLong(FIELD_END_POSITION_US, j11);
            }
            boolean z6 = this.relativeToLiveWindow;
            if (z6 != clippingConfiguration.relativeToLiveWindow) {
                bundle.putBoolean(FIELD_RELATIVE_TO_LIVE_WINDOW, z6);
            }
            boolean z9 = this.relativeToDefaultPosition;
            if (z9 != clippingConfiguration.relativeToDefaultPosition) {
                bundle.putBoolean(FIELD_RELATIVE_TO_DEFAULT_POSITION, z9);
            }
            boolean z10 = this.startsAtKeyFrame;
            if (z10 != clippingConfiguration.startsAtKeyFrame) {
                bundle.putBoolean(FIELD_STARTS_AT_KEY_FRAME, z10);
            }
            boolean z11 = this.allowUnseekableMedia;
            if (z11 != clippingConfiguration.allowUnseekableMedia) {
                bundle.putBoolean(FIELD_ALLOW_UNSEEKABLE_MEDIA, z11);
            }
            return bundle;
        }

        private ClippingConfiguration(androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder) {
            this.startPositionMs = androidx.media3.common.util.Util.usToMs(builder.startPositionUs);
            this.endPositionMs = androidx.media3.common.util.Util.usToMs(builder.endPositionUs);
            this.startPositionUs = builder.startPositionUs;
            this.endPositionUs = builder.endPositionUs;
            this.relativeToLiveWindow = builder.relativeToLiveWindow;
            this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
            this.startsAtKeyFrame = builder.startsAtKeyFrame;
            this.allowUnseekableMedia = builder.allowUnseekableMedia;
        }
    }

    @java.lang.Deprecated
    public static final class ClippingProperties extends androidx.media3.common.MediaItem.ClippingConfiguration {
        public static final androidx.media3.common.MediaItem.ClippingProperties UNSET = new androidx.media3.common.MediaItem.ClippingConfiguration.Builder().buildClippingProperties();

        private ClippingProperties(androidx.media3.common.MediaItem.ClippingConfiguration.Builder builder) {
            super(builder);
        }
    }

    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        public final p076i4.AbstractC2186b0 forcedSessionTrackTypes;
        private final byte[] keySetId;
        public final p076i4.AbstractC2194f0 licenseRequestHeaders;
        public final android.net.Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;

        @java.lang.Deprecated
        public final p076i4.AbstractC2194f0 requestHeaders;
        public final java.util.UUID scheme;

        @java.lang.Deprecated
        public final p076i4.AbstractC2186b0 sessionForClearTypes;

        @java.lang.Deprecated
        public final java.util.UUID uuid;
        private static final java.lang.String FIELD_SCHEME = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_LICENSE_URI = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_LICENSE_REQUEST_HEADERS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_MULTI_SESSION = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        static final java.lang.String FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String FIELD_FORCE_DEFAULT_LICENSE_URI = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String FIELD_FORCED_SESSION_TRACK_TYPES = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String FIELD_KEY_SET_ID = androidx.media3.common.util.Util.intToStringMaxRadix(7);

        public static final class Builder {
            private boolean forceDefaultLicenseUri;
            private p076i4.AbstractC2186b0 forcedSessionTrackTypes;
            private byte[] keySetId;
            private p076i4.AbstractC2194f0 licenseRequestHeaders;
            private android.net.Uri licenseUri;
            private boolean multiSession;
            private boolean playClearContentWithoutKey;
            private java.util.UUID scheme;

            /* JADX INFO: Access modifiers changed from: private */
            @java.lang.Deprecated
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setNullableScheme(java.util.UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration build() {
                return new androidx.media3.common.MediaItem.DrmConfiguration(this);
            }

            @java.lang.Deprecated
            public androidx.media3.common.MediaItem.DrmConfiguration.Builder forceSessionsForAudioAndVideoTracks(boolean z6) {
                return setForceSessionsForAudioAndVideoTracks(z6);
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setForceDefaultLicenseUri(boolean z6) {
                this.forceDefaultLicenseUri = z6;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setForceSessionsForAudioAndVideoTracks(boolean z6) {
                p076i4.S0 s0Z;
                if (z6) {
                    s0Z = p076i4.AbstractC2186b0.z(2, 1);
                } else {
                    p076i4.Z z9 = p076i4.AbstractC2186b0.f22868i;
                    s0Z = p076i4.S0.f22832l;
                }
                setForcedSessionTrackTypes(s0Z);
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setForcedSessionTrackTypes(java.util.List<java.lang.Integer> list) {
                this.forcedSessionTrackTypes = p076i4.AbstractC2186b0.u(list);
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setKeySetId(byte[] bArr) {
                this.keySetId = bArr != null ? java.util.Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setLicenseRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
                this.licenseRequestHeaders = p076i4.AbstractC2194f0.a(map);
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setLicenseUri(android.net.Uri uri) {
                this.licenseUri = uri;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setMultiSession(boolean z6) {
                this.multiSession = z6;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setPlayClearContentWithoutKey(boolean z6) {
                this.playClearContentWithoutKey = z6;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setScheme(java.util.UUID uuid) {
                this.scheme = uuid;
                return this;
            }

            public androidx.media3.common.MediaItem.DrmConfiguration.Builder setLicenseUri(java.lang.String str) {
                this.licenseUri = str == null ? null : android.net.Uri.parse(str);
                return this;
            }

            public Builder(java.util.UUID uuid) {
                this();
                this.scheme = uuid;
            }

            @java.lang.Deprecated
            private Builder() {
                this.licenseRequestHeaders = p076i4.X0.f22848n;
                this.playClearContentWithoutKey = true;
                p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                this.forcedSessionTrackTypes = p076i4.S0.f22832l;
            }

            private Builder(androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration) {
                this.scheme = drmConfiguration.scheme;
                this.licenseUri = drmConfiguration.licenseUri;
                this.licenseRequestHeaders = drmConfiguration.licenseRequestHeaders;
                this.multiSession = drmConfiguration.multiSession;
                this.playClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                this.forceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                this.forcedSessionTrackTypes = drmConfiguration.forcedSessionTrackTypes;
                this.keySetId = drmConfiguration.keySetId;
            }
        }

        public static androidx.media3.common.MediaItem.DrmConfiguration fromBundle(android.os.Bundle bundle) {
            java.lang.String string = bundle.getString(FIELD_SCHEME);
            string.getClass();
            java.util.UUID uuidFromString = java.util.UUID.fromString(string);
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable(FIELD_LICENSE_URI);
            p076i4.AbstractC2194f0 abstractC2194f0BundleToStringImmutableMap = androidx.media3.common.util.BundleCollectionUtil.bundleToStringImmutableMap(androidx.media3.common.util.BundleCollectionUtil.getBundleWithDefault(bundle, FIELD_LICENSE_REQUEST_HEADERS, android.os.Bundle.EMPTY));
            boolean z6 = bundle.getBoolean(FIELD_MULTI_SESSION, false);
            boolean z9 = bundle.getBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, false);
            boolean z10 = bundle.getBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, false);
            p076i4.AbstractC2186b0 abstractC2186b0U = p076i4.AbstractC2186b0.u(androidx.media3.common.util.BundleCollectionUtil.getIntegerArrayListWithDefault(bundle, FIELD_FORCED_SESSION_TRACK_TYPES, new java.util.ArrayList()));
            return new androidx.media3.common.MediaItem.DrmConfiguration.Builder(uuidFromString).setLicenseUri(uri).setLicenseRequestHeaders(abstractC2194f0BundleToStringImmutableMap).setMultiSession(z6).setForceDefaultLicenseUri(z10).setPlayClearContentWithoutKey(z9).setForcedSessionTrackTypes(abstractC2186b0U).setKeySetId(bundle.getByteArray(FIELD_KEY_SET_ID)).build();
        }

        public androidx.media3.common.MediaItem.DrmConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.DrmConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.DrmConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = (androidx.media3.common.MediaItem.DrmConfiguration) obj;
            return this.scheme.equals(drmConfiguration.scheme) && java.util.Objects.equals(this.licenseUri, drmConfiguration.licenseUri) && java.util.Objects.equals(this.licenseRequestHeaders, drmConfiguration.licenseRequestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.forcedSessionTrackTypes.equals(drmConfiguration.forcedSessionTrackTypes) && java.util.Arrays.equals(this.keySetId, drmConfiguration.keySetId);
        }

        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return java.util.Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int iHashCode = this.scheme.hashCode() * 31;
            android.net.Uri uri = this.licenseUri;
            return java.util.Arrays.hashCode(this.keySetId) + ((this.forcedSessionTrackTypes.hashCode() + ((((((((this.licenseRequestHeaders.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31)) * 31);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(FIELD_SCHEME, this.scheme.toString());
            android.net.Uri uri = this.licenseUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_LICENSE_URI, uri);
            }
            if (!this.licenseRequestHeaders.isEmpty()) {
                bundle.putBundle(FIELD_LICENSE_REQUEST_HEADERS, androidx.media3.common.util.BundleCollectionUtil.stringMapToBundle(this.licenseRequestHeaders));
            }
            boolean z6 = this.multiSession;
            if (z6) {
                bundle.putBoolean(FIELD_MULTI_SESSION, z6);
            }
            boolean z9 = this.playClearContentWithoutKey;
            if (z9) {
                bundle.putBoolean(FIELD_PLAY_CLEAR_CONTENT_WITHOUT_KEY, z9);
            }
            boolean z10 = this.forceDefaultLicenseUri;
            if (z10) {
                bundle.putBoolean(FIELD_FORCE_DEFAULT_LICENSE_URI, z10);
            }
            if (!this.forcedSessionTrackTypes.isEmpty()) {
                bundle.putIntegerArrayList(FIELD_FORCED_SESSION_TRACK_TYPES, new java.util.ArrayList<>(this.forcedSessionTrackTypes));
            }
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                bundle.putByteArray(FIELD_KEY_SET_ID, bArr);
            }
            return bundle;
        }

        private DrmConfiguration(androidx.media3.common.MediaItem.DrmConfiguration.Builder builder) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y((builder.forceDefaultLicenseUri && builder.licenseUri == null) ? false : true);
            java.util.UUID uuid = builder.scheme;
            uuid.getClass();
            this.scheme = uuid;
            this.uuid = uuid;
            this.licenseUri = builder.licenseUri;
            this.requestHeaders = builder.licenseRequestHeaders;
            this.licenseRequestHeaders = builder.licenseRequestHeaders;
            this.multiSession = builder.multiSession;
            this.forceDefaultLicenseUri = builder.forceDefaultLicenseUri;
            this.playClearContentWithoutKey = builder.playClearContentWithoutKey;
            this.sessionForClearTypes = builder.forcedSessionTrackTypes;
            this.forcedSessionTrackTypes = builder.forcedSessionTrackTypes;
            this.keySetId = builder.keySetId != null ? java.util.Arrays.copyOf(builder.keySetId, builder.keySetId.length) : null;
        }
    }

    public static final class LiveConfiguration {
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;
        public static final androidx.media3.common.MediaItem.LiveConfiguration UNSET = new androidx.media3.common.MediaItem.LiveConfiguration.Builder().build();
        private static final java.lang.String FIELD_TARGET_OFFSET_MS = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_MIN_OFFSET_MS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_MAX_OFFSET_MS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_MIN_PLAYBACK_SPEED = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_MAX_PLAYBACK_SPEED = androidx.media3.common.util.Util.intToStringMaxRadix(4);

        public static final class Builder {
            private long maxOffsetMs;
            private float maxPlaybackSpeed;
            private long minOffsetMs;
            private float minPlaybackSpeed;
            private long targetOffsetMs;

            public androidx.media3.common.MediaItem.LiveConfiguration build() {
                return new androidx.media3.common.MediaItem.LiveConfiguration(this);
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setMaxOffsetMs(long j) {
                this.maxOffsetMs = j;
                return this;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setMaxPlaybackSpeed(float f9) {
                this.maxPlaybackSpeed = f9;
                return this;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setMinOffsetMs(long j) {
                this.minOffsetMs = j;
                return this;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setMinPlaybackSpeed(float f9) {
                this.minPlaybackSpeed = f9;
                return this;
            }

            public androidx.media3.common.MediaItem.LiveConfiguration.Builder setTargetOffsetMs(long j) {
                this.targetOffsetMs = j;
                return this;
            }

            public Builder() {
                this.targetOffsetMs = androidx.media3.common.C.TIME_UNSET;
                this.minOffsetMs = androidx.media3.common.C.TIME_UNSET;
                this.maxOffsetMs = androidx.media3.common.C.TIME_UNSET;
                this.minPlaybackSpeed = -3.4028235E38f;
                this.maxPlaybackSpeed = -3.4028235E38f;
            }

            private Builder(androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration) {
                this.targetOffsetMs = liveConfiguration.targetOffsetMs;
                this.minOffsetMs = liveConfiguration.minOffsetMs;
                this.maxOffsetMs = liveConfiguration.maxOffsetMs;
                this.minPlaybackSpeed = liveConfiguration.minPlaybackSpeed;
                this.maxPlaybackSpeed = liveConfiguration.maxPlaybackSpeed;
            }
        }

        public static androidx.media3.common.MediaItem.LiveConfiguration fromBundle(android.os.Bundle bundle) {
            androidx.media3.common.MediaItem.LiveConfiguration.Builder builder = new androidx.media3.common.MediaItem.LiveConfiguration.Builder();
            java.lang.String str = FIELD_TARGET_OFFSET_MS;
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = UNSET;
            return builder.setTargetOffsetMs(bundle.getLong(str, liveConfiguration.targetOffsetMs)).setMinOffsetMs(bundle.getLong(FIELD_MIN_OFFSET_MS, liveConfiguration.minOffsetMs)).setMaxOffsetMs(bundle.getLong(FIELD_MAX_OFFSET_MS, liveConfiguration.maxOffsetMs)).setMinPlaybackSpeed(bundle.getFloat(FIELD_MIN_PLAYBACK_SPEED, liveConfiguration.minPlaybackSpeed)).setMaxPlaybackSpeed(bundle.getFloat(FIELD_MAX_PLAYBACK_SPEED, liveConfiguration.maxPlaybackSpeed)).build();
        }

        public androidx.media3.common.MediaItem.LiveConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.LiveConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.LiveConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = (androidx.media3.common.MediaItem.LiveConfiguration) obj;
            return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
        }

        public int hashCode() {
            long j = this.targetOffsetMs;
            long j9 = this.minOffsetMs;
            int i3 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            long j10 = this.maxOffsetMs;
            int i9 = (i3 + ((int) ((j10 >>> 32) ^ j10))) * 31;
            float f9 = this.minPlaybackSpeed;
            int iFloatToIntBits = (i9 + (f9 != 0.0f ? java.lang.Float.floatToIntBits(f9) : 0)) * 31;
            float f10 = this.maxPlaybackSpeed;
            return iFloatToIntBits + (f10 != 0.0f ? java.lang.Float.floatToIntBits(f10) : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            long j = this.targetOffsetMs;
            androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration = UNSET;
            if (j != liveConfiguration.targetOffsetMs) {
                bundle.putLong(FIELD_TARGET_OFFSET_MS, j);
            }
            long j9 = this.minOffsetMs;
            if (j9 != liveConfiguration.minOffsetMs) {
                bundle.putLong(FIELD_MIN_OFFSET_MS, j9);
            }
            long j10 = this.maxOffsetMs;
            if (j10 != liveConfiguration.maxOffsetMs) {
                bundle.putLong(FIELD_MAX_OFFSET_MS, j10);
            }
            float f9 = this.minPlaybackSpeed;
            if (f9 != liveConfiguration.minPlaybackSpeed) {
                bundle.putFloat(FIELD_MIN_PLAYBACK_SPEED, f9);
            }
            float f10 = this.maxPlaybackSpeed;
            if (f10 != liveConfiguration.maxPlaybackSpeed) {
                bundle.putFloat(FIELD_MAX_PLAYBACK_SPEED, f10);
            }
            return bundle;
        }

        private LiveConfiguration(androidx.media3.common.MediaItem.LiveConfiguration.Builder builder) {
            this(builder.targetOffsetMs, builder.minOffsetMs, builder.maxOffsetMs, builder.minPlaybackSpeed, builder.maxPlaybackSpeed);
        }

        @java.lang.Deprecated
        public LiveConfiguration(long j, long j9, long j10, float f9, float f10) {
            this.targetOffsetMs = j;
            this.minOffsetMs = j9;
            this.maxOffsetMs = j10;
            this.minPlaybackSpeed = f9;
            this.maxPlaybackSpeed = f10;
        }
    }

    public static final class LocalConfiguration {
        public final androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration;
        public final java.lang.String customCacheKey;
        public final androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration;
        public final long imageDurationMs;
        public final java.lang.String mimeType;
        public final java.util.List<androidx.media3.common.StreamKey> streamKeys;
        public final p076i4.AbstractC2186b0 subtitleConfigurations;

        @java.lang.Deprecated
        public final java.util.List<androidx.media3.common.MediaItem.Subtitle> subtitles;
        public final java.lang.Object tag;
        public final android.net.Uri uri;
        private static final java.lang.String FIELD_URI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_MIME_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_DRM_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_ADS_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_STREAM_KEYS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String FIELD_CUSTOM_CACHE_KEY = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String FIELD_SUBTITLE_CONFIGURATION = androidx.media3.common.util.Util.intToStringMaxRadix(6);
        private static final java.lang.String FIELD_IMAGE_DURATION_MS = androidx.media3.common.util.Util.intToStringMaxRadix(7);

        public static androidx.media3.common.MediaItem.LocalConfiguration fromBundle(android.os.Bundle bundle) {
            java.util.List listFromBundleList;
            p076i4.AbstractC2186b0 abstractC2186b0FromBundleList;
            android.os.Bundle bundle2 = bundle.getBundle(FIELD_DRM_CONFIGURATION);
            androidx.media3.common.MediaItem.DrmConfiguration drmConfigurationFromBundle = bundle2 == null ? null : androidx.media3.common.MediaItem.DrmConfiguration.fromBundle(bundle2);
            android.os.Bundle bundle3 = bundle.getBundle(FIELD_ADS_CONFIGURATION);
            androidx.media3.common.MediaItem.AdsConfiguration adsConfigurationFromBundle = bundle3 != null ? androidx.media3.common.MediaItem.AdsConfiguration.fromBundle(bundle3) : null;
            java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_STREAM_KEYS);
            if (parcelableArrayList == null) {
                p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
                listFromBundleList = p076i4.S0.f22832l;
            } else {
                listFromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.b(5), parcelableArrayList);
            }
            java.util.List list = listFromBundleList;
            java.util.ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION);
            if (parcelableArrayList2 == null) {
                p076i4.Z z9 = p076i4.AbstractC2186b0.f22868i;
                abstractC2186b0FromBundleList = p076i4.S0.f22832l;
            } else {
                abstractC2186b0FromBundleList = androidx.media3.common.util.BundleCollectionUtil.fromBundleList(new androidx.media3.common.b(6), parcelableArrayList2);
            }
            p076i4.AbstractC2186b0 abstractC2186b0 = abstractC2186b0FromBundleList;
            long j = bundle.getLong(FIELD_IMAGE_DURATION_MS, androidx.media3.common.C.TIME_UNSET);
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable(FIELD_URI);
            uri.getClass();
            return new androidx.media3.common.MediaItem.LocalConfiguration(uri, bundle.getString(FIELD_MIME_TYPE), drmConfigurationFromBundle, adsConfigurationFromBundle, list, bundle.getString(FIELD_CUSTOM_CACHE_KEY), abstractC2186b0, null, j);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.LocalConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = (androidx.media3.common.MediaItem.LocalConfiguration) obj;
            return this.uri.equals(localConfiguration.uri) && java.util.Objects.equals(this.mimeType, localConfiguration.mimeType) && java.util.Objects.equals(this.drmConfiguration, localConfiguration.drmConfiguration) && java.util.Objects.equals(this.adsConfiguration, localConfiguration.adsConfiguration) && this.streamKeys.equals(localConfiguration.streamKeys) && java.util.Objects.equals(this.customCacheKey, localConfiguration.customCacheKey) && this.subtitleConfigurations.equals(localConfiguration.subtitleConfigurations) && java.util.Objects.equals(this.tag, localConfiguration.tag) && this.imageDurationMs == localConfiguration.imageDurationMs;
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            java.lang.String str = this.mimeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = this.drmConfiguration;
            int iHashCode3 = (iHashCode2 + (drmConfiguration == null ? 0 : drmConfiguration.hashCode())) * 31;
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = this.adsConfiguration;
            int iHashCode4 = (this.streamKeys.hashCode() + ((iHashCode3 + (adsConfiguration == null ? 0 : adsConfiguration.hashCode())) * 31)) * 31;
            java.lang.String str2 = this.customCacheKey;
            int iHashCode5 = (this.subtitleConfigurations.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            java.lang.Object obj = this.tag;
            return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.imageDurationMs);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            java.lang.String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration = this.drmConfiguration;
            if (drmConfiguration != null) {
                bundle.putBundle(FIELD_DRM_CONFIGURATION, drmConfiguration.toBundle());
            }
            androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration = this.adsConfiguration;
            if (adsConfiguration != null) {
                bundle.putBundle(FIELD_ADS_CONFIGURATION, adsConfiguration.toBundle());
            }
            if (!this.streamKeys.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_STREAM_KEYS, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.streamKeys, new androidx.media3.common.b(3)));
            }
            java.lang.String str2 = this.customCacheKey;
            if (str2 != null) {
                bundle.putString(FIELD_CUSTOM_CACHE_KEY, str2);
            }
            if (!this.subtitleConfigurations.isEmpty()) {
                bundle.putParcelableArrayList(FIELD_SUBTITLE_CONFIGURATION, androidx.media3.common.util.BundleCollectionUtil.toBundleArrayList(this.subtitleConfigurations, new androidx.media3.common.b(4)));
            }
            long j = this.imageDurationMs;
            if (j != androidx.media3.common.C.TIME_UNSET) {
                bundle.putLong(FIELD_IMAGE_DURATION_MS, j);
            }
            return bundle;
        }

        private LocalConfiguration(android.net.Uri uri, java.lang.String str, androidx.media3.common.MediaItem.DrmConfiguration drmConfiguration, androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration, java.util.List<androidx.media3.common.StreamKey> list, java.lang.String str2, p076i4.AbstractC2186b0 abstractC2186b0, java.lang.Object obj, long j) {
            this.uri = uri;
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitleConfigurations = abstractC2186b0;
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            for (int i3 = 0; i3 < abstractC2186b0.size(); i3++) {
                yS.c(((androidx.media3.common.MediaItem.SubtitleConfiguration) abstractC2186b0.get(i3)).buildUpon().buildSubtitle());
            }
            this.subtitles = yS.f();
            this.tag = obj;
            this.imageDurationMs = j;
        }
    }

    public static final class RequestMetadata {
        public final android.os.Bundle extras;
        public final android.net.Uri mediaUri;
        public final java.lang.String searchQuery;
        public static final androidx.media3.common.MediaItem.RequestMetadata EMPTY = new androidx.media3.common.MediaItem.RequestMetadata.Builder().build();
        private static final java.lang.String FIELD_MEDIA_URI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_SEARCH_QUERY = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(2);

        public static final class Builder {
            private android.os.Bundle extras;
            private android.net.Uri mediaUri;
            private java.lang.String searchQuery;

            public androidx.media3.common.MediaItem.RequestMetadata build() {
                return new androidx.media3.common.MediaItem.RequestMetadata(this);
            }

            public androidx.media3.common.MediaItem.RequestMetadata.Builder setExtras(android.os.Bundle bundle) {
                this.extras = bundle;
                return this;
            }

            public androidx.media3.common.MediaItem.RequestMetadata.Builder setMediaUri(android.net.Uri uri) {
                this.mediaUri = uri;
                return this;
            }

            public androidx.media3.common.MediaItem.RequestMetadata.Builder setSearchQuery(java.lang.String str) {
                this.searchQuery = str;
                return this;
            }

            public Builder() {
            }

            private Builder(androidx.media3.common.MediaItem.RequestMetadata requestMetadata) {
                this.mediaUri = requestMetadata.mediaUri;
                this.searchQuery = requestMetadata.searchQuery;
                this.extras = requestMetadata.extras;
            }
        }

        public static androidx.media3.common.MediaItem.RequestMetadata fromBundle(android.os.Bundle bundle) {
            return new androidx.media3.common.MediaItem.RequestMetadata.Builder().setMediaUri((android.net.Uri) bundle.getParcelable(FIELD_MEDIA_URI)).setSearchQuery(bundle.getString(FIELD_SEARCH_QUERY)).setExtras(androidx.media3.common.util.Util.convertToNullIfInvalid(bundle.getBundle(FIELD_EXTRAS))).build();
        }

        public androidx.media3.common.MediaItem.RequestMetadata.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.RequestMetadata.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.RequestMetadata)) {
                return false;
            }
            androidx.media3.common.MediaItem.RequestMetadata requestMetadata = (androidx.media3.common.MediaItem.RequestMetadata) obj;
            if (java.util.Objects.equals(this.mediaUri, requestMetadata.mediaUri) && java.util.Objects.equals(this.searchQuery, requestMetadata.searchQuery)) {
                if ((this.extras == null) == (requestMetadata.extras == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            android.net.Uri uri = this.mediaUri;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            java.lang.String str = this.searchQuery;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.extras != null ? 1 : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            android.net.Uri uri = this.mediaUri;
            if (uri != null) {
                bundle.putParcelable(FIELD_MEDIA_URI, uri);
            }
            java.lang.String str = this.searchQuery;
            if (str != null) {
                bundle.putString(FIELD_SEARCH_QUERY, str);
            }
            android.os.Bundle bundle2 = this.extras;
            if (bundle2 != null) {
                bundle.putBundle(FIELD_EXTRAS, bundle2);
            }
            return bundle;
        }

        private RequestMetadata(androidx.media3.common.MediaItem.RequestMetadata.Builder builder) {
            this.mediaUri = builder.mediaUri;
            this.searchQuery = builder.searchQuery;
            this.extras = builder.extras;
        }
    }

    @java.lang.Deprecated
    public static final class Subtitle extends androidx.media3.common.MediaItem.SubtitleConfiguration {
        @java.lang.Deprecated
        public Subtitle(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
            this(uri, str, str2, 0);
        }

        @java.lang.Deprecated
        public Subtitle(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i3) {
            this(uri, str, str2, i3, 0, null);
        }

        @java.lang.Deprecated
        public Subtitle(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i3, int i9, java.lang.String str3) {
            super(uri, str, str2, i3, i9, str3, null);
        }

        private Subtitle(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder builder) {
            super(builder);
        }
    }

    @java.lang.Deprecated
    public static androidx.media3.common.MediaItem fromBundle(android.os.Bundle bundle) {
        return fromBundle(bundle, 9);
    }

    public static androidx.media3.common.MediaItem fromUri(java.lang.String str) {
        return new androidx.media3.common.MediaItem.Builder().setUri(str).build();
    }

    private android.os.Bundle toBundle(boolean z6, int i3) {
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!this.mediaId.equals("")) {
            bundle.putString(FIELD_MEDIA_ID, this.mediaId);
        }
        if (!this.liveConfiguration.equals(androidx.media3.common.MediaItem.LiveConfiguration.UNSET)) {
            bundle.putBundle(FIELD_LIVE_CONFIGURATION, this.liveConfiguration.toBundle());
        }
        if (!this.mediaMetadata.equals(androidx.media3.common.MediaMetadata.EMPTY)) {
            bundle.putBundle(FIELD_MEDIA_METADATA, this.mediaMetadata.toBundle(i3));
        }
        if (!this.clippingConfiguration.equals(androidx.media3.common.MediaItem.ClippingConfiguration.UNSET)) {
            bundle.putBundle(FIELD_CLIPPING_PROPERTIES, this.clippingConfiguration.toBundle());
        }
        if (!this.requestMetadata.equals(androidx.media3.common.MediaItem.RequestMetadata.EMPTY)) {
            bundle.putBundle(FIELD_REQUEST_METADATA, this.requestMetadata.toBundle());
        }
        if (z6 && (localConfiguration = this.localConfiguration) != null) {
            bundle.putBundle(FIELD_LOCAL_CONFIGURATION, localConfiguration.toBundle());
        }
        return bundle;
    }

    public androidx.media3.common.MediaItem.Builder buildUpon() {
        return new androidx.media3.common.MediaItem.Builder();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.common.MediaItem)) {
            return false;
        }
        androidx.media3.common.MediaItem mediaItem = (androidx.media3.common.MediaItem) obj;
        return java.util.Objects.equals(this.mediaId, mediaItem.mediaId) && this.clippingConfiguration.equals(mediaItem.clippingConfiguration) && java.util.Objects.equals(this.localConfiguration, mediaItem.localConfiguration) && java.util.Objects.equals(this.liveConfiguration, mediaItem.liveConfiguration) && java.util.Objects.equals(this.mediaMetadata, mediaItem.mediaMetadata) && java.util.Objects.equals(this.requestMetadata, mediaItem.requestMetadata);
    }

    public int hashCode() {
        int iHashCode = this.mediaId.hashCode() * 31;
        androidx.media3.common.MediaItem.LocalConfiguration localConfiguration = this.localConfiguration;
        return this.requestMetadata.hashCode() + ((this.mediaMetadata.hashCode() + ((this.clippingConfiguration.hashCode() + ((this.liveConfiguration.hashCode() + ((iHashCode + (localConfiguration != null ? localConfiguration.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @java.lang.Deprecated
    public android.os.Bundle toBundleIncludeLocalConfiguration() {
        return toBundleIncludeLocalConfiguration(9);
    }

    public static class SubtitleConfiguration {
        public final java.lang.String id;
        public final java.lang.String label;
        public final java.lang.String language;
        public final java.lang.String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final android.net.Uri uri;
        private static final java.lang.String FIELD_URI = androidx.media3.common.util.Util.intToStringMaxRadix(0);
        private static final java.lang.String FIELD_MIME_TYPE = androidx.media3.common.util.Util.intToStringMaxRadix(1);
        private static final java.lang.String FIELD_LANGUAGE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
        private static final java.lang.String FIELD_SELECTION_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(3);
        private static final java.lang.String FIELD_ROLE_FLAGS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
        private static final java.lang.String FIELD_LABEL = androidx.media3.common.util.Util.intToStringMaxRadix(5);
        private static final java.lang.String FIELD_ID = androidx.media3.common.util.Util.intToStringMaxRadix(6);

        public static final class Builder {
            private java.lang.String id;
            private java.lang.String label;
            private java.lang.String language;
            private java.lang.String mimeType;
            private int roleFlags;
            private int selectionFlags;
            private android.net.Uri uri;

            /* JADX INFO: Access modifiers changed from: private */
            public androidx.media3.common.MediaItem.Subtitle buildSubtitle() {
                return new androidx.media3.common.MediaItem.Subtitle(this);
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration build() {
                return new androidx.media3.common.MediaItem.SubtitleConfiguration(this);
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setId(java.lang.String str) {
                this.id = str;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setLabel(java.lang.String str) {
                this.label = str;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setLanguage(java.lang.String str) {
                this.language = str;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setMimeType(java.lang.String str) {
                this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setRoleFlags(int i3) {
                this.roleFlags = i3;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setSelectionFlags(int i3) {
                this.selectionFlags = i3;
                return this;
            }

            public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder setUri(android.net.Uri uri) {
                this.uri = uri;
                return this;
            }

            public Builder(android.net.Uri uri) {
                this.uri = uri;
            }

            private Builder(androidx.media3.common.MediaItem.SubtitleConfiguration subtitleConfiguration) {
                this.uri = subtitleConfiguration.uri;
                this.mimeType = subtitleConfiguration.mimeType;
                this.language = subtitleConfiguration.language;
                this.selectionFlags = subtitleConfiguration.selectionFlags;
                this.roleFlags = subtitleConfiguration.roleFlags;
                this.label = subtitleConfiguration.label;
                this.id = subtitleConfiguration.id;
            }
        }

        public static androidx.media3.common.MediaItem.SubtitleConfiguration fromBundle(android.os.Bundle bundle) {
            android.net.Uri uri = (android.net.Uri) bundle.getParcelable(FIELD_URI);
            uri.getClass();
            java.lang.String string = bundle.getString(FIELD_MIME_TYPE);
            java.lang.String string2 = bundle.getString(FIELD_LANGUAGE);
            int i3 = bundle.getInt(FIELD_SELECTION_FLAGS, 0);
            int i9 = bundle.getInt(FIELD_ROLE_FLAGS, 0);
            java.lang.String string3 = bundle.getString(FIELD_LABEL);
            return new androidx.media3.common.MediaItem.SubtitleConfiguration.Builder(uri).setMimeType(string).setLanguage(string2).setSelectionFlags(i3).setRoleFlags(i9).setLabel(string3).setId(bundle.getString(FIELD_ID)).build();
        }

        public androidx.media3.common.MediaItem.SubtitleConfiguration.Builder buildUpon() {
            return new androidx.media3.common.MediaItem.SubtitleConfiguration.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.MediaItem.SubtitleConfiguration)) {
                return false;
            }
            androidx.media3.common.MediaItem.SubtitleConfiguration subtitleConfiguration = (androidx.media3.common.MediaItem.SubtitleConfiguration) obj;
            return this.uri.equals(subtitleConfiguration.uri) && java.util.Objects.equals(this.mimeType, subtitleConfiguration.mimeType) && java.util.Objects.equals(this.language, subtitleConfiguration.language) && this.selectionFlags == subtitleConfiguration.selectionFlags && this.roleFlags == subtitleConfiguration.roleFlags && java.util.Objects.equals(this.label, subtitleConfiguration.label) && java.util.Objects.equals(this.id, subtitleConfiguration.id);
        }

        public int hashCode() {
            int iHashCode = this.uri.hashCode() * 31;
            java.lang.String str = this.mimeType;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.String str2 = this.language;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            java.lang.String str3 = this.label;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            java.lang.String str4 = this.id;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public android.os.Bundle toBundle() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable(FIELD_URI, this.uri);
            java.lang.String str = this.mimeType;
            if (str != null) {
                bundle.putString(FIELD_MIME_TYPE, str);
            }
            java.lang.String str2 = this.language;
            if (str2 != null) {
                bundle.putString(FIELD_LANGUAGE, str2);
            }
            int i3 = this.selectionFlags;
            if (i3 != 0) {
                bundle.putInt(FIELD_SELECTION_FLAGS, i3);
            }
            int i9 = this.roleFlags;
            if (i9 != 0) {
                bundle.putInt(FIELD_ROLE_FLAGS, i9);
            }
            java.lang.String str3 = this.label;
            if (str3 != null) {
                bundle.putString(FIELD_LABEL, str3);
            }
            java.lang.String str4 = this.id;
            if (str4 != null) {
                bundle.putString(FIELD_ID, str4);
            }
            return bundle;
        }

        private SubtitleConfiguration(android.net.Uri uri, java.lang.String str, java.lang.String str2, int i3, int i9, java.lang.String str3, java.lang.String str4) {
            this.uri = uri;
            this.mimeType = androidx.media3.common.MimeTypes.normalizeMimeType(str);
            this.language = str2;
            this.selectionFlags = i3;
            this.roleFlags = i9;
            this.label = str3;
            this.id = str4;
        }

        private SubtitleConfiguration(androidx.media3.common.MediaItem.SubtitleConfiguration.Builder builder) {
            this.uri = builder.uri;
            this.mimeType = builder.mimeType;
            this.language = builder.language;
            this.selectionFlags = builder.selectionFlags;
            this.roleFlags = builder.roleFlags;
            this.label = builder.label;
            this.id = builder.id;
        }
    }

    private MediaItem(java.lang.String str, androidx.media3.common.MediaItem.ClippingProperties clippingProperties, androidx.media3.common.MediaItem.LocalConfiguration localConfiguration, androidx.media3.common.MediaItem.LiveConfiguration liveConfiguration, androidx.media3.common.MediaMetadata mediaMetadata, androidx.media3.common.MediaItem.RequestMetadata requestMetadata) {
        this.mediaId = str;
        this.localConfiguration = localConfiguration;
        this.playbackProperties = localConfiguration;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingConfiguration = clippingProperties;
        this.clippingProperties = clippingProperties;
        this.requestMetadata = requestMetadata;
    }

    public static androidx.media3.common.MediaItem fromBundle(android.os.Bundle bundle, int i3) {
        java.lang.String string = bundle.getString(FIELD_MEDIA_ID, "");
        string.getClass();
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_LIVE_CONFIGURATION);
        androidx.media3.common.MediaItem.LiveConfiguration liveConfigurationFromBundle = bundle2 == null ? androidx.media3.common.MediaItem.LiveConfiguration.UNSET : androidx.media3.common.MediaItem.LiveConfiguration.fromBundle(bundle2);
        android.os.Bundle bundle3 = bundle.getBundle(FIELD_MEDIA_METADATA);
        androidx.media3.common.MediaMetadata mediaMetadataFromBundle = bundle3 == null ? androidx.media3.common.MediaMetadata.EMPTY : androidx.media3.common.MediaMetadata.fromBundle(bundle3, i3);
        android.os.Bundle bundle4 = bundle.getBundle(FIELD_CLIPPING_PROPERTIES);
        androidx.media3.common.MediaItem.ClippingProperties clippingPropertiesFromBundle = bundle4 == null ? androidx.media3.common.MediaItem.ClippingProperties.UNSET : androidx.media3.common.MediaItem.ClippingConfiguration.fromBundle(bundle4);
        android.os.Bundle bundle5 = bundle.getBundle(FIELD_REQUEST_METADATA);
        androidx.media3.common.MediaItem.RequestMetadata requestMetadataFromBundle = bundle5 == null ? androidx.media3.common.MediaItem.RequestMetadata.EMPTY : androidx.media3.common.MediaItem.RequestMetadata.fromBundle(bundle5);
        android.os.Bundle bundle6 = bundle.getBundle(FIELD_LOCAL_CONFIGURATION);
        return new androidx.media3.common.MediaItem(string, clippingPropertiesFromBundle, bundle6 == null ? null : androidx.media3.common.MediaItem.LocalConfiguration.fromBundle(bundle6), liveConfigurationFromBundle, mediaMetadataFromBundle, requestMetadataFromBundle);
    }

    public static androidx.media3.common.MediaItem fromUri(android.net.Uri uri) {
        return new androidx.media3.common.MediaItem.Builder().setUri(uri).build();
    }

    public android.os.Bundle toBundleIncludeLocalConfiguration(int i3) {
        return toBundle(true, i3);
    }

    @java.lang.Deprecated
    public android.os.Bundle toBundle() {
        return toBundle(9);
    }

    public android.os.Bundle toBundle(int i3) {
        return toBundle(false, i3);
    }
}
