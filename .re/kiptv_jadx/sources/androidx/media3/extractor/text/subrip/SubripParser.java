package androidx.media3.extractor.text.subrip;

/* JADX INFO: loaded from: classes.dex */
public final class SubripParser implements androidx.media3.extractor.text.SubtitleParser {
    private static final java.lang.String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final java.lang.String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final java.lang.String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final java.lang.String ALIGN_MID_LEFT = "{\\an4}";
    private static final java.lang.String ALIGN_MID_MID = "{\\an5}";
    private static final java.lang.String ALIGN_MID_RIGHT = "{\\an6}";
    private static final java.lang.String ALIGN_TOP_LEFT = "{\\an7}";
    private static final java.lang.String ALIGN_TOP_MID = "{\\an8}";
    private static final java.lang.String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final java.lang.String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final java.lang.String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?";
    private static final java.lang.String TAG = "SubripParser";
    private static final java.util.regex.Pattern SUBRIP_TIMING_LINE = java.util.regex.Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final java.util.regex.Pattern SUBRIP_TAG_PATTERN = java.util.regex.Pattern.compile("\\{\\\\.*?\\}");
    private final java.lang.StringBuilder textBuilder = new java.lang.StringBuilder();
    private final java.util.ArrayList<java.lang.String> tags = new java.util.ArrayList<>();
    private final androidx.media3.common.util.ParsableByteArray parsableByteArray = new androidx.media3.common.util.ParsableByteArray();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    private androidx.media3.common.text.Cue buildCue(android.text.Spanned spanned, java.lang.String str) {
        byte b9;
        byte b10;
        androidx.media3.common.text.Cue.Builder text = new androidx.media3.common.text.Cue.Builder().setText(spanned);
        if (str == null) {
            return text.build();
        }
        switch (str) {
            case "{\an1}":
                b9 = 0;
                break;
            case "{\an2}":
                b9 = 6;
                break;
            case "{\an3}":
                b9 = 3;
                break;
            case "{\an4}":
                b9 = 1;
                break;
            case "{\an5}":
                b9 = 7;
                break;
            case "{\an6}":
                b9 = 4;
                break;
            case "{\an7}":
                b9 = 2;
                break;
            case "{\an8}":
                b9 = 8;
                break;
            case "{\an9}":
                b9 = 5;
                break;
            default:
                b9 = -1;
                break;
        }
        if (b9 == 0 || b9 == 1 || b9 == 2) {
            text.setPositionAnchor(0);
        } else if (b9 == 3 || b9 == 4 || b9 == 5) {
            text.setPositionAnchor(2);
        } else {
            text.setPositionAnchor(1);
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 1;
                break;
            case "{\an3}":
                b10 = 2;
                break;
            case "{\an4}":
                b10 = 6;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 8;
                break;
            case "{\an7}":
                b10 = 3;
                break;
            case "{\an8}":
                b10 = 4;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            text.setLineAnchor(2);
        } else if (b10 == 3 || b10 == 4 || b10 == 5) {
            text.setLineAnchor(0);
        } else {
            text.setLineAnchor(1);
        }
        return text.setPosition(getFractionalPositionForAnchorType(text.getPositionAnchor())).setLine(getFractionalPositionForAnchorType(text.getLineAnchor()), 0).build();
    }

    private java.nio.charset.Charset detectUtfCharset(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.nio.charset.Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : java.nio.charset.StandardCharsets.UTF_8;
    }

    public static float getFractionalPositionForAnchorType(int i3) {
        if (i3 == 0) {
            return 0.08f;
        }
        if (i3 == 1) {
            return 0.5f;
        }
        if (i3 == 2) {
            return END_FRACTION;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static long parseTimecode(java.util.regex.Matcher matcher, int i3) {
        java.lang.String strGroup = matcher.group(i3 + 1);
        long j = strGroup != null ? java.lang.Long.parseLong(strGroup) * 3600000 : 0L;
        java.lang.String strGroup2 = matcher.group(i3 + 2);
        strGroup2.getClass();
        long j9 = (java.lang.Long.parseLong(strGroup2) * 60000) + j;
        java.lang.String strGroup3 = matcher.group(i3 + 3);
        strGroup3.getClass();
        long j10 = (java.lang.Long.parseLong(strGroup3) * 1000) + j9;
        java.lang.String strGroup4 = matcher.group(i3 + 4);
        if (strGroup4 != null) {
            j10 += java.lang.Long.parseLong(strGroup4);
        }
        return j10 * 1000;
    }

    private java.lang.String processLine(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        java.lang.String strTrim = str.trim();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(strTrim);
        java.util.regex.Matcher matcher = SUBRIP_TAG_PATTERN.matcher(strTrim);
        int i3 = 0;
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i3;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i3 += length;
        }
        return sb.toString();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i3, int i9, androidx.media3.extractor.text.SubtitleParser.OutputOptions outputOptions, androidx.media3.common.util.Consumer<androidx.media3.extractor.text.CuesWithTiming> consumer) {
        java.lang.String str;
        this.parsableByteArray.reset(bArr, i3 + i9);
        this.parsableByteArray.setPosition(i3);
        java.nio.charset.Charset charsetDetectUtfCharset = detectUtfCharset(this.parsableByteArray);
        long j = outputOptions.startTimeUs;
        long j9 = androidx.media3.common.C.TIME_UNSET;
        java.util.ArrayList arrayList = (j == androidx.media3.common.C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new java.util.ArrayList();
        while (true) {
            java.lang.String line = this.parsableByteArray.readLine(charsetDetectUtfCharset);
            if (line == null) {
                break;
            }
            if (!line.isEmpty()) {
                try {
                    java.lang.Integer.parseInt(line);
                    java.lang.String line2 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    if (line2 == null) {
                        androidx.media3.common.util.Log.w(TAG, "Unexpected end");
                        break;
                    }
                    java.util.regex.Matcher matcher = SUBRIP_TIMING_LINE.matcher(line2);
                    if (matcher.matches()) {
                        long timecode = parseTimecode(matcher, 1);
                        long timecode2 = parseTimecode(matcher, 6);
                        int i10 = 0;
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        java.lang.String line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                        while (!android.text.TextUtils.isEmpty(line3)) {
                            if (this.textBuilder.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(line3, this.tags));
                            line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                        }
                        android.text.Spanned spannedFromHtml = android.text.Html.fromHtml(this.textBuilder.toString());
                        while (true) {
                            if (i10 >= this.tags.size()) {
                                str = null;
                                break;
                            }
                            str = this.tags.get(i10);
                            if (str.matches(SUBRIP_ALIGNMENT_TAG)) {
                                break;
                            } else {
                                i10++;
                            }
                        }
                        long j10 = j9;
                        long j11 = outputOptions.startTimeUs;
                        if (j11 == j10 || timecode2 >= j11) {
                            consumer.accept(new androidx.media3.extractor.text.CuesWithTiming(p076i4.AbstractC2186b0.y(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                        } else if (arrayList != null) {
                            arrayList.add(new androidx.media3.extractor.text.CuesWithTiming(p076i4.AbstractC2186b0.y(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                        }
                        j9 = j10;
                    } else {
                        androidx.media3.common.util.Log.w(TAG, "Skipping invalid timing: ".concat(line2));
                    }
                } catch (java.lang.NumberFormatException unused) {
                    androidx.media3.common.util.Log.w(TAG, "Skipping invalid index: ".concat(line));
                }
            }
        }
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer.accept((androidx.media3.extractor.text.CuesWithTiming) it.next());
            }
        }
    }
}
