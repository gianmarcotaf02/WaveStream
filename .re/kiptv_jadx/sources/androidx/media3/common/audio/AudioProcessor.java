package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {
    public static final java.nio.ByteBuffer EMPTY_BUFFER = java.nio.ByteBuffer.allocateDirect(0).order(java.nio.ByteOrder.nativeOrder());

    public static final class AudioFormat {
        public static final androidx.media3.common.audio.AudioProcessor.AudioFormat NOT_SET = new androidx.media3.common.audio.AudioProcessor.AudioFormat(-1, -1, -1);
        public final int bytesPerFrame;
        public final int channelCount;
        public final int encoding;
        public final int sampleRate;

        public AudioFormat(androidx.media3.common.Format format) {
            this(format.sampleRate, format.channelCount, format.pcmEncoding);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.media3.common.audio.AudioProcessor.AudioFormat)) {
                return false;
            }
            androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat = (androidx.media3.common.audio.AudioProcessor.AudioFormat) obj;
            return this.sampleRate == audioFormat.sampleRate && this.channelCount == audioFormat.channelCount && this.encoding == audioFormat.encoding;
        }

        public int hashCode() {
            return java.util.Objects.hash(java.lang.Integer.valueOf(this.sampleRate), java.lang.Integer.valueOf(this.channelCount), java.lang.Integer.valueOf(this.encoding));
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.sampleRate);
            sb.append(", channelCount=");
            sb.append(this.channelCount);
            sb.append(", encoding=");
            return Y6.f.j(sb, this.encoding, ']');
        }

        public AudioFormat(int i3, int i9, int i10) {
            this.sampleRate = i3;
            this.channelCount = i9;
            this.encoding = i10;
            this.bytesPerFrame = androidx.media3.common.util.Util.isEncodingLinearPcm(i10) ? androidx.media3.common.util.Util.getPcmFrameSize(i10, i9) : -1;
        }
    }

    public static final class StreamMetadata {
        public static final androidx.media3.common.audio.AudioProcessor.StreamMetadata DEFAULT = new androidx.media3.common.audio.AudioProcessor.StreamMetadata(0);
        public final long positionOffsetUs;

        public StreamMetadata(long j) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(j >= 0);
            this.positionOffsetUs = j;
        }
    }

    public static final class UnhandledAudioFormatException extends java.lang.Exception {
        public final androidx.media3.common.audio.AudioProcessor.AudioFormat inputAudioFormat;

        public UnhandledAudioFormatException(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
            this("Unhandled input format:", audioFormat);
        }

        public UnhandledAudioFormatException(java.lang.String str, androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat) {
            super(str + io.ktor.sse.ServerSentEventKt.SPACE + audioFormat);
            this.inputAudioFormat = audioFormat;
        }
    }

    androidx.media3.common.audio.AudioProcessor.AudioFormat configure(androidx.media3.common.audio.AudioProcessor.AudioFormat audioFormat);

    @java.lang.Deprecated
    default void flush() {
        throw new java.lang.IllegalStateException("AudioProcessor must implement at least one #flush() overload.");
    }

    default long getDurationAfterProcessorApplied(long j) {
        return j;
    }

    java.nio.ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(java.nio.ByteBuffer byteBuffer);

    void reset();

    default void flush(androidx.media3.common.audio.AudioProcessor.StreamMetadata streamMetadata) {
        flush();
    }
}
