package androidx.media3.extractor.text;

import F1.e;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.util.Consumer;
import p076i4.AbstractC2186b0;
import p076i4.Y;

public interface SubtitleParser {

    public interface Factory {
        public static final Factory UNSUPPORTED = new Factory() {
            @Override
            public SubtitleParser create(Format format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override
            public int getCueReplacementBehavior(Format format) {
                return 1;
            }

            @Override
            public boolean supportsFormat(Format format) {
                return false;
            }
        };

        SubtitleParser create(Format format);

        int getCueReplacementBehavior(Format format);

        boolean supportsFormat(Format format);
    }

    public static class OutputOptions {
        private static final OutputOptions ALL = new OutputOptions(C.TIME_UNSET, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        private OutputOptions(long j, boolean z6) {
            this.startTimeUs = j;
            this.outputAllCues = z6;
        }

        public static OutputOptions allCues() {
            return ALL;
        }

        public static OutputOptions cuesAfterThenRemainingCuesBefore(long j) {
            return new OutputOptions(j, true);
        }

        public static OutputOptions onlyCuesAfter(long j) {
            return new OutputOptions(j, false);
        }
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i3, int i9, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer);

    default void parse(byte[] bArr, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    default Subtitle parseToLegacySubtitle(byte[] bArr, int i3, int i9) {
        Y yS = AbstractC2186b0.s();
        parse(bArr, i3, i9, OutputOptions.ALL, new e(13, yS));
        return new CuesWithTimingSubtitle(yS.f());
    }

    default void reset() {
    }
}
