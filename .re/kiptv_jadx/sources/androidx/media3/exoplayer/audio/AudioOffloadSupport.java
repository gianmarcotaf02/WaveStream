package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class AudioOffloadSupport {
    public static final androidx.media3.exoplayer.audio.AudioOffloadSupport DEFAULT_UNSUPPORTED = new androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder().build();
    public final boolean isFormatSupported;
    public final boolean isGaplessSupported;
    public final boolean isSpeedChangeSupported;

    public static final class Builder {
        private boolean isFormatSupported;
        private boolean isGaplessSupported;
        private boolean isSpeedChangeSupported;

        public Builder() {
        }

        public androidx.media3.exoplayer.audio.AudioOffloadSupport build() {
            if (this.isFormatSupported || !(this.isGaplessSupported || this.isSpeedChangeSupported)) {
                return new androidx.media3.exoplayer.audio.AudioOffloadSupport(this);
            }
            throw new java.lang.IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder setIsFormatSupported(boolean z6) {
            this.isFormatSupported = z6;
            return this;
        }

        public androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder setIsGaplessSupported(boolean z6) {
            this.isGaplessSupported = z6;
            return this;
        }

        public androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder setIsSpeedChangeSupported(boolean z6) {
            this.isSpeedChangeSupported = z6;
            return this;
        }

        public Builder(androidx.media3.exoplayer.audio.AudioOffloadSupport audioOffloadSupport) {
            this.isFormatSupported = audioOffloadSupport.isFormatSupported;
            this.isGaplessSupported = audioOffloadSupport.isGaplessSupported;
            this.isSpeedChangeSupported = audioOffloadSupport.isSpeedChangeSupported;
        }
    }

    public androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder buildUpon() {
        return new androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder(this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.exoplayer.audio.AudioOffloadSupport.class == obj.getClass()) {
            androidx.media3.exoplayer.audio.AudioOffloadSupport audioOffloadSupport = (androidx.media3.exoplayer.audio.AudioOffloadSupport) obj;
            if (this.isFormatSupported == audioOffloadSupport.isFormatSupported && this.isGaplessSupported == audioOffloadSupport.isGaplessSupported && this.isSpeedChangeSupported == audioOffloadSupport.isSpeedChangeSupported) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.isFormatSupported ? 1 : 0) << 2) + ((this.isGaplessSupported ? 1 : 0) << 1) + (this.isSpeedChangeSupported ? 1 : 0);
    }

    private AudioOffloadSupport(androidx.media3.exoplayer.audio.AudioOffloadSupport.Builder builder) {
        this.isFormatSupported = builder.isFormatSupported;
        this.isGaplessSupported = builder.isGaplessSupported;
        this.isSpeedChangeSupported = builder.isSpeedChangeSupported;
    }
}
