package androidx.media3.extractor.text;

/* JADX INFO: loaded from: classes.dex */
public interface SubtitleParser {

    public interface Factory {
        public static final androidx.media3.extractor.text.SubtitleParser.Factory UNSUPPORTED = new androidx.media3.extractor.text.SubtitleParser.Factory() { // from class: androidx.media3.extractor.text.SubtitleParser.Factory.1
            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public androidx.media3.extractor.text.SubtitleParser create(androidx.media3.common.Format format) {
                throw new java.lang.IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public int getCueReplacementBehavior(androidx.media3.common.Format format) {
                return 1;
            }

            @Override // androidx.media3.extractor.text.SubtitleParser.Factory
            public boolean supportsFormat(androidx.media3.common.Format format) {
                return false;
            }
        };

        androidx.media3.extractor.text.SubtitleParser create(androidx.media3.common.Format format);

        int getCueReplacementBehavior(androidx.media3.common.Format format);

        boolean supportsFormat(androidx.media3.common.Format format);
    }

    public static class OutputOptions {
        private static final androidx.media3.extractor.text.SubtitleParser.OutputOptions ALL = new androidx.media3.extractor.text.SubtitleParser.OutputOptions(androidx.media3.common.C.TIME_UNSET, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        private OutputOptions(long j, boolean z6) {
            this.startTimeUs = j;
            this.outputAllCues = z6;
        }

        public static androidx.media3.extractor.text.SubtitleParser.OutputOptions allCues() {
            return ALL;
        }

        public static androidx.media3.extractor.text.SubtitleParser.OutputOptions cuesAfterThenRemainingCuesBefore(long j) {
            return new androidx.media3.extractor.text.SubtitleParser.OutputOptions(j, true);
        }

        public static androidx.media3.extractor.text.SubtitleParser.OutputOptions onlyCuesAfter(long j) {
            return new androidx.media3.extractor.text.SubtitleParser.OutputOptions(j, false);
        }
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i3, int i9, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer);

    default void parse(byte[] bArr, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    default androidx.media3.extractor.text.Subtitle parseToLegacySubtitle(byte[] bArr, int i3, int i9) {
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        parse(bArr, i3, i9, androidx.media3.extractor.text.SubtitleParser.OutputOptions.ALL, new F1.e(13, yS));
        return new androidx.media3.extractor.text.CuesWithTimingSubtitle(yS.f());
    }

    default void reset() {
    }
}
