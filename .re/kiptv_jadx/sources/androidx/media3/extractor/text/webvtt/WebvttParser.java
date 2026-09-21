package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttParser implements androidx.media3.extractor.text.SubtitleParser {
    private static final java.lang.String COMMENT_START = "NOTE";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int EVENT_COMMENT = 1;
    private static final int EVENT_CUE = 3;
    private static final int EVENT_END_OF_FILE = 0;
    private static final int EVENT_NONE = -1;
    private static final int EVENT_STYLE_BLOCK = 2;
    private static final java.lang.String STYLE_START = "STYLE";
    private final androidx.media3.common.util.ParsableByteArray parsableWebvttData = new androidx.media3.common.util.ParsableByteArray();
    private final androidx.media3.extractor.text.webvtt.WebvttCssParser cssParser = new androidx.media3.extractor.text.webvtt.WebvttCssParser();

    private static int getNextEvent(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int i3 = -1;
        int position = 0;
        while (i3 == -1) {
            position = parsableByteArray.getPosition();
            java.lang.String line = parsableByteArray.readLine();
            if (line == null) {
                i3 = 0;
            } else if (STYLE_START.equals(line)) {
                i3 = 2;
            } else {
                i3 = line.startsWith(COMMENT_START) ? 1 : 3;
            }
        }
        parsableByteArray.setPosition(position);
        return i3;
    }

    private static void skipComment(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        while (!android.text.TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i3, int i9, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        androidx.media3.extractor.text.webvtt.WebvttCueInfo cue;
        this.parsableWebvttData.reset(bArr, i9 + i3);
        this.parsableWebvttData.setPosition(i3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            androidx.media3.extractor.text.webvtt.WebvttParserUtil.validateWebvttHeaderLine(this.parsableWebvttData);
            while (!android.text.TextUtils.isEmpty(this.parsableWebvttData.readLine())) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (true) {
                int nextEvent = getNextEvent(this.parsableWebvttData);
                if (nextEvent == 0) {
                    androidx.media3.extractor.text.LegacySubtitleUtil.toCuesWithTiming(new androidx.media3.extractor.text.webvtt.WebvttSubtitle(arrayList2), outputOptions, consumer);
                    return;
                }
                if (nextEvent == 1) {
                    skipComment(this.parsableWebvttData);
                } else if (nextEvent == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new java.lang.IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.parsableWebvttData.readLine();
                    arrayList.addAll(this.cssParser.parseBlock(this.parsableWebvttData));
                } else if (nextEvent == 3 && (cue = androidx.media3.extractor.text.webvtt.WebvttCueParser.parseCue(this.parsableWebvttData, arrayList)) != null) {
                    arrayList2.add(cue);
                }
            }
        } catch (androidx.media3.common.ParserException e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
    }
}
