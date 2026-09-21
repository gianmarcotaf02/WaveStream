package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryReplayOptions {
    public static final java.lang.String ANDROIDX_MEDIA_VIEW_CLASS_NAME = "androidx.media3.ui.PlayerView";
    public static final java.lang.String EXOPLAYER_CLASS_NAME = "com.google.android.exoplayer2.ui.PlayerView";
    public static final java.lang.String EXOPLAYER_STYLED_CLASS_NAME = "com.google.android.exoplayer2.ui.StyledPlayerView";
    public static final java.lang.String IMAGE_VIEW_CLASS_NAME = "android.widget.ImageView";
    public static final java.lang.String TEXT_VIEW_CLASS_NAME = "android.widget.TextView";
    public static final java.lang.String VIDEO_VIEW_CLASS_NAME = "android.widget.VideoView";
    public static final java.lang.String WEB_VIEW_CLASS_NAME = "android.webkit.WebView";
    private long errorReplayDuration;
    private int frameRate;
    private java.util.Set<java.lang.String> maskViewClasses;
    private java.lang.String maskViewContainerClass;
    private java.lang.Double onErrorSampleRate;
    private io.sentry.SentryReplayOptions.SentryReplayQuality quality;
    private io.sentry.protocol.SdkVersion sdkVersion;
    private long sessionDuration;
    private java.lang.Double sessionSampleRate;
    private long sessionSegmentDuration;
    private boolean trackOrientationChange;
    private java.util.Set<java.lang.String> unmaskViewClasses;
    private java.lang.String unmaskViewContainerClass;

    public enum SentryReplayQuality {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, androidx.media3.extractor.AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        SentryReplayQuality(float f9, int i3, int i9) {
            this.sizeScale = f9;
            this.bitRate = i3;
            this.screenshotQuality = i9;
        }

        public java.lang.String serializedName() {
            return name().toLowerCase(java.util.Locale.ROOT);
        }
    }

    public SentryReplayOptions(boolean z6, io.sentry.protocol.SdkVersion sdkVersion) {
        this.maskViewClasses = new java.util.concurrent.CopyOnWriteArraySet();
        this.unmaskViewClasses = new java.util.concurrent.CopyOnWriteArraySet();
        this.maskViewContainerClass = null;
        this.unmaskViewContainerClass = null;
        this.quality = io.sentry.SentryReplayOptions.SentryReplayQuality.MEDIUM;
        this.frameRate = 1;
        this.errorReplayDuration = 30000L;
        this.sessionSegmentDuration = 5000L;
        this.sessionDuration = 3600000L;
        this.trackOrientationChange = true;
        if (z6) {
            return;
        }
        setMaskAllText(true);
        setMaskAllImages(true);
        this.maskViewClasses.add(WEB_VIEW_CLASS_NAME);
        this.maskViewClasses.add(VIDEO_VIEW_CLASS_NAME);
        this.maskViewClasses.add(ANDROIDX_MEDIA_VIEW_CLASS_NAME);
        this.maskViewClasses.add(EXOPLAYER_CLASS_NAME);
        this.maskViewClasses.add(EXOPLAYER_STYLED_CLASS_NAME);
        this.sdkVersion = sdkVersion;
    }

    public void addMaskViewClass(java.lang.String str) {
        this.maskViewClasses.add(str);
    }

    public void addUnmaskViewClass(java.lang.String str) {
        this.unmaskViewClasses.add(str);
    }

    public long getErrorReplayDuration() {
        return this.errorReplayDuration;
    }

    public int getFrameRate() {
        return this.frameRate;
    }

    public java.util.Set<java.lang.String> getMaskViewClasses() {
        return this.maskViewClasses;
    }

    public java.lang.String getMaskViewContainerClass() {
        return this.maskViewContainerClass;
    }

    public java.lang.Double getOnErrorSampleRate() {
        return this.onErrorSampleRate;
    }

    public io.sentry.SentryReplayOptions.SentryReplayQuality getQuality() {
        return this.quality;
    }

    public io.sentry.protocol.SdkVersion getSdkVersion() {
        return this.sdkVersion;
    }

    public long getSessionDuration() {
        return this.sessionDuration;
    }

    public java.lang.Double getSessionSampleRate() {
        return this.sessionSampleRate;
    }

    public long getSessionSegmentDuration() {
        return this.sessionSegmentDuration;
    }

    public java.util.Set<java.lang.String> getUnmaskViewClasses() {
        return this.unmaskViewClasses;
    }

    public java.lang.String getUnmaskViewContainerClass() {
        return this.unmaskViewContainerClass;
    }

    public boolean isSessionReplayEnabled() {
        return getSessionSampleRate() != null && getSessionSampleRate().doubleValue() > 0.0d;
    }

    public boolean isSessionReplayForErrorsEnabled() {
        return getOnErrorSampleRate() != null && getOnErrorSampleRate().doubleValue() > 0.0d;
    }

    public boolean isTrackOrientationChange() {
        return this.trackOrientationChange;
    }

    public void setMaskAllImages(boolean z6) {
        if (z6) {
            addMaskViewClass(IMAGE_VIEW_CLASS_NAME);
            this.unmaskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        } else {
            addUnmaskViewClass(IMAGE_VIEW_CLASS_NAME);
            this.maskViewClasses.remove(IMAGE_VIEW_CLASS_NAME);
        }
    }

    public void setMaskAllText(boolean z6) {
        if (z6) {
            addMaskViewClass(TEXT_VIEW_CLASS_NAME);
            this.unmaskViewClasses.remove(TEXT_VIEW_CLASS_NAME);
        } else {
            addUnmaskViewClass(TEXT_VIEW_CLASS_NAME);
            this.maskViewClasses.remove(TEXT_VIEW_CLASS_NAME);
        }
    }

    public void setMaskViewContainerClass(java.lang.String str) {
        addMaskViewClass(str);
        this.maskViewContainerClass = str;
    }

    public void setOnErrorSampleRate(java.lang.Double d4) {
        if (io.sentry.util.SampleRateUtils.isValidSampleRate(d4)) {
            this.onErrorSampleRate = d4;
            return;
        }
        throw new java.lang.IllegalArgumentException("The value " + d4 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setQuality(io.sentry.SentryReplayOptions.SentryReplayQuality sentryReplayQuality) {
        this.quality = sentryReplayQuality;
    }

    public void setSdkVersion(io.sentry.protocol.SdkVersion sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public void setSessionSampleRate(java.lang.Double d4) {
        if (io.sentry.util.SampleRateUtils.isValidSampleRate(d4)) {
            this.sessionSampleRate = d4;
            return;
        }
        throw new java.lang.IllegalArgumentException("The value " + d4 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setTrackOrientationChange(boolean z6) {
        this.trackOrientationChange = z6;
    }

    public void setUnmaskViewContainerClass(java.lang.String str) {
        this.unmaskViewContainerClass = str;
    }

    public SentryReplayOptions(java.lang.Double d4, java.lang.Double d6, io.sentry.protocol.SdkVersion sdkVersion) {
        this(false, sdkVersion);
        this.sessionSampleRate = d4;
        this.onErrorSampleRate = d6;
        this.sdkVersion = sdkVersion;
    }
}
