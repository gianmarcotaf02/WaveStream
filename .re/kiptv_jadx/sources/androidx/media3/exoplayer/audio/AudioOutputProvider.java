package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public interface AudioOutputProvider {
    public static final int FORMAT_SUPPORTED_DIRECTLY = 2;
    public static final int FORMAT_SUPPORTED_WITH_TRANSCODING = 1;
    public static final int FORMAT_UNSUPPORTED = 0;

    public static final class ConfigurationException extends java.lang.Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfigurationException(java.lang.String str) {
            super(str);
            str.getClass();
        }
    }

    public static final class FormatConfig {
        public final androidx.media3.common.AudioAttributes audioAttributes;
        public final int audioSessionId;
        public final boolean enableHighResolutionPcmOutput;
        public final boolean enableOffload;
        public final boolean enablePlaybackParameters;
        public final boolean enableTunneling;
        public final androidx.media3.common.Format format;
        public final int preferredBufferSize;
        public final android.media.AudioDeviceInfo preferredDevice;
        public final int virtualDeviceId;

        public static final class Builder {
            private androidx.media3.common.AudioAttributes audioAttributes;
            private int audioSessionId;
            private boolean enableHighResolutionPcmOutput;
            private boolean enableOffload;
            private boolean enablePlaybackParameters;
            private boolean enableTunneling;
            private final androidx.media3.common.Format format;
            private int preferredBufferSize;
            private android.media.AudioDeviceInfo preferredDevice;
            private int virtualDeviceId;

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig build() {
                return new androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig(this);
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder setAudioSessionId(int i3) {
                this.audioSessionId = i3;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder setEnableHighResolutionPcmOutput(boolean z6) {
                this.enableHighResolutionPcmOutput = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder setEnableOffload(boolean z6) {
                this.enableOffload = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder setEnablePlaybackParameters(boolean z6) {
                this.enablePlaybackParameters = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder setEnableTunneling(boolean z6) {
                this.enableTunneling = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder setPreferredBufferSize(int i3) {
                this.preferredBufferSize = i3;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder setPreferredDevice(android.media.AudioDeviceInfo audioDeviceInfo) {
                this.preferredDevice = audioDeviceInfo;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder setVirtualDeviceId(int i3) {
                this.virtualDeviceId = i3;
                return this;
            }

            public Builder(androidx.media3.common.Format format) {
                this.format = format;
                this.audioAttributes = androidx.media3.common.AudioAttributes.DEFAULT;
                this.audioSessionId = 0;
                this.virtualDeviceId = -1;
                this.preferredBufferSize = -1;
            }

            private Builder(androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig formatConfig) {
                this.format = formatConfig.format;
                this.audioAttributes = formatConfig.audioAttributes;
                this.preferredDevice = formatConfig.preferredDevice;
                this.enableHighResolutionPcmOutput = formatConfig.enableHighResolutionPcmOutput;
                this.enablePlaybackParameters = formatConfig.enablePlaybackParameters;
                this.enableOffload = formatConfig.enableOffload;
                this.audioSessionId = formatConfig.audioSessionId;
                this.virtualDeviceId = formatConfig.virtualDeviceId;
                this.enableTunneling = formatConfig.enableTunneling;
                this.preferredBufferSize = formatConfig.preferredBufferSize;
            }
        }

        public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder buildUpon() {
            return new androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder();
        }

        private FormatConfig(androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig.Builder builder) {
            this.format = builder.format;
            this.audioAttributes = builder.audioAttributes;
            this.preferredDevice = builder.preferredDevice;
            this.enableHighResolutionPcmOutput = builder.enableHighResolutionPcmOutput;
            this.enablePlaybackParameters = builder.enablePlaybackParameters;
            this.enableOffload = builder.enableOffload;
            this.audioSessionId = builder.audioSessionId;
            this.virtualDeviceId = builder.virtualDeviceId;
            this.enableTunneling = builder.enableTunneling;
            this.preferredBufferSize = builder.preferredBufferSize;
        }
    }

    public static final class FormatSupport {
        public static final androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport UNSUPPORTED = new androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport.Builder().build();
        public final boolean isFormatSupportedForOffload;
        public final boolean isGaplessSupportedForOffload;
        public final boolean isSpeedChangeSupportedForOffload;
        public final int supportLevel;

        public static final class Builder {
            private boolean isFormatSupportedForOffload;
            private boolean isGaplessSupportedForOffload;
            private boolean isSpeedChangeSupportedForOffload;
            private int supportLevel;

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport build() {
                if (this.isFormatSupportedForOffload || !(this.isGaplessSupportedForOffload || this.isSpeedChangeSupportedForOffload)) {
                    return new androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport(this);
                }
                throw new java.lang.IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport.Builder setFormatSupportLevel(int i3) {
                this.supportLevel = i3;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport.Builder setIsFormatSupportedForOffload(boolean z6) {
                this.isFormatSupportedForOffload = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport.Builder setIsGaplessSupportedForOffload(boolean z6) {
                this.isGaplessSupportedForOffload = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport.Builder setIsSpeedChangeSupportedForOffload(boolean z6) {
                this.isSpeedChangeSupportedForOffload = z6;
                return this;
            }

            public Builder() {
                this.supportLevel = 0;
            }

            private Builder(androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport formatSupport) {
                this.isFormatSupportedForOffload = formatSupport.isFormatSupportedForOffload;
                this.isGaplessSupportedForOffload = formatSupport.isGaplessSupportedForOffload;
                this.isSpeedChangeSupportedForOffload = formatSupport.isSpeedChangeSupportedForOffload;
                this.supportLevel = formatSupport.supportLevel;
            }
        }

        public androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport.Builder buildUpon() {
            return new androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport.Builder();
        }

        private FormatSupport(androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport.Builder builder) {
            this.isFormatSupportedForOffload = builder.isFormatSupportedForOffload;
            this.isGaplessSupportedForOffload = builder.isGaplessSupportedForOffload;
            this.isSpeedChangeSupportedForOffload = builder.isSpeedChangeSupportedForOffload;
            this.supportLevel = builder.supportLevel;
        }
    }

    public static final class InitializationException extends java.lang.Exception {
        public InitializationException() {
        }

        public InitializationException(java.lang.Throwable th) {
            super(th);
        }
    }

    public interface Listener {
        void onFormatSupportChanged();
    }

    public static final class OutputConfig {
        public final androidx.media3.common.AudioAttributes audioAttributes;
        public final int audioSessionId;
        public final int bufferSize;
        public final int channelMask;
        public final int encoding;
        public final boolean isOffload;
        public final boolean isTunneling;
        public final int sampleRate;
        public final boolean useOffloadGapless;
        public final boolean usePlaybackParameters;
        public final int virtualDeviceId;

        public static final class Builder {
            private androidx.media3.common.AudioAttributes audioAttributes;
            private int audioSessionId;
            private int bufferSize;
            private int channelMask;
            private int encoding;
            private boolean isOffload;
            private boolean isTunneling;
            private int sampleRate;
            private boolean useOffloadGapless;
            private boolean usePlaybackParameters;
            private int virtualDeviceId;

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig build() {
                return new androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig(this);
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setAudioSessionId(int i3) {
                this.audioSessionId = i3;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setBufferSize(int i3) {
                this.bufferSize = i3;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setChannelMask(int i3) {
                this.channelMask = i3;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setEncoding(int i3) {
                this.encoding = i3;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setIsOffload(boolean z6) {
                this.isOffload = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setIsTunneling(boolean z6) {
                this.isTunneling = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setSampleRate(int i3) {
                this.sampleRate = i3;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setUseOffloadGapless(boolean z6) {
                this.useOffloadGapless = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setUsePlaybackParameters(boolean z6) {
                this.usePlaybackParameters = z6;
                return this;
            }

            public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder setVirtualDeviceId(int i3) {
                this.virtualDeviceId = i3;
                return this;
            }

            public Builder() {
                this.audioAttributes = androidx.media3.common.AudioAttributes.DEFAULT;
                this.audioSessionId = 0;
                this.virtualDeviceId = -1;
            }

            private Builder(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig) {
                this.encoding = outputConfig.encoding;
                this.sampleRate = outputConfig.sampleRate;
                this.channelMask = outputConfig.channelMask;
                this.isTunneling = outputConfig.isTunneling;
                this.isOffload = outputConfig.isOffload;
                this.bufferSize = outputConfig.bufferSize;
                this.audioAttributes = outputConfig.audioAttributes;
                this.audioSessionId = outputConfig.audioSessionId;
                this.virtualDeviceId = outputConfig.virtualDeviceId;
                this.usePlaybackParameters = outputConfig.usePlaybackParameters;
                this.useOffloadGapless = outputConfig.useOffloadGapless;
            }
        }

        public androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder buildUpon() {
            return new androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder();
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.class == obj.getClass()) {
                androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig = (androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig) obj;
                if (this.encoding == outputConfig.encoding && this.sampleRate == outputConfig.sampleRate && this.channelMask == outputConfig.channelMask && this.isTunneling == outputConfig.isTunneling && this.isOffload == outputConfig.isOffload && this.bufferSize == outputConfig.bufferSize && this.audioSessionId == outputConfig.audioSessionId && this.virtualDeviceId == outputConfig.virtualDeviceId && this.usePlaybackParameters == outputConfig.usePlaybackParameters && this.useOffloadGapless == outputConfig.useOffloadGapless && this.audioAttributes.equals(outputConfig.audioAttributes)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return java.util.Objects.hash(java.lang.Integer.valueOf(this.encoding), java.lang.Integer.valueOf(this.sampleRate), java.lang.Integer.valueOf(this.channelMask), java.lang.Boolean.valueOf(this.isTunneling), java.lang.Boolean.valueOf(this.isOffload), java.lang.Integer.valueOf(this.bufferSize), this.audioAttributes, java.lang.Integer.valueOf(this.audioSessionId), java.lang.Integer.valueOf(this.virtualDeviceId), java.lang.Boolean.valueOf(this.useOffloadGapless), java.lang.Boolean.valueOf(this.usePlaybackParameters));
        }

        private OutputConfig(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig.Builder builder) {
            this.encoding = builder.encoding;
            this.sampleRate = builder.sampleRate;
            this.channelMask = builder.channelMask;
            this.isTunneling = builder.isTunneling;
            this.isOffload = builder.isOffload;
            this.bufferSize = builder.bufferSize;
            this.audioAttributes = builder.audioAttributes;
            this.audioSessionId = builder.audioSessionId;
            this.virtualDeviceId = builder.virtualDeviceId;
            this.usePlaybackParameters = builder.usePlaybackParameters;
            this.useOffloadGapless = builder.useOffloadGapless;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SupportLevel {
    }

    void addListener(androidx.media3.exoplayer.audio.AudioOutputProvider.Listener listener);

    androidx.media3.exoplayer.audio.AudioOutput getAudioOutput(androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig outputConfig);

    androidx.media3.exoplayer.audio.AudioOutputProvider.FormatSupport getFormatSupport(androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig formatConfig);

    androidx.media3.exoplayer.audio.AudioOutputProvider.OutputConfig getOutputConfig(androidx.media3.exoplayer.audio.AudioOutputProvider.FormatConfig formatConfig);

    void release();

    void removeListener(androidx.media3.exoplayer.audio.AudioOutputProvider.Listener listener);

    default void setClock(androidx.media3.common.util.Clock clock) {
    }
}
