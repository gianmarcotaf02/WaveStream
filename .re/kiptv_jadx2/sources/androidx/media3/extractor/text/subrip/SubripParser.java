package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p076i4.AbstractC2186b0;

public final class SubripParser implements SubtitleParser {
    private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final String ALIGN_MID_LEFT = "{\\an4}";
    private static final String ALIGN_MID_MID = "{\\an5}";
    private static final String ALIGN_MID_RIGHT = "{\\an6}";
    private static final String ALIGN_TOP_LEFT = "{\\an7}";
    private static final String ALIGN_TOP_MID = "{\\an8}";
    private static final String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?";
    private static final String TAG = "SubripParser";
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder textBuilder = new StringBuilder();
    private final ArrayList<String> tags = new ArrayList<>();
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    private Cue buildCue(Spanned spanned, String str) {
        byte b9;
        byte b10;
        Cue.Builder text = new Cue.Builder().setText(spanned);
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

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset utfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return utfCharsetFromBom != null ? utfCharsetFromBom : StandardCharsets.UTF_8;
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
        throw new IllegalArgumentException();
    }

    private static long parseTimecode(Matcher matcher, int i3) {
        String strGroup = matcher.group(i3 + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i3 + 2);
        strGroup2.getClass();
        long j9 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i3 + 3);
        strGroup3.getClass();
        long j10 = (Long.parseLong(strGroup3) * 1000) + j9;
        String strGroup4 = matcher.group(i3 + 4);
        if (strGroup4 != null) {
            j10 += Long.parseLong(strGroup4);
        }
        return j10 * 1000;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(strTrim);
        int i3 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i3;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i3 += length;
        }
        return sb.toString();
    }

    @Override
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override
    public void parse(byte[] bArr, int i3, int i9, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        String str;
        this.parsableByteArray.reset(bArr, i3 + i9);
        this.parsableByteArray.setPosition(i3);
        Charset charsetDetectUtfCharset = detectUtfCharset(this.parsableByteArray);
        long j = outputOptions.startTimeUs;
        long j9 = C.TIME_UNSET;
        ArrayList arrayList = (j == C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new ArrayList();
        while (true) {
            String line = this.parsableByteArray.readLine(charsetDetectUtfCharset);
            if (line == null) {
                break;
            }
            if (!line.isEmpty()) {
                try {
                    Integer.parseInt(line);
                    String line2 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                    if (line2 == null) {
                        Log.w(TAG, "Unexpected end");
                        break;
                    }
                    Matcher matcher = SUBRIP_TIMING_LINE.matcher(line2);
                    if (matcher.matches()) {
                        long timecode = parseTimecode(matcher, 1);
                        long timecode2 = parseTimecode(matcher, 6);
                        int i10 = 0;
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        String line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                        while (!TextUtils.isEmpty(line3)) {
                            if (this.textBuilder.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(line3, this.tags));
                            line3 = this.parsableByteArray.readLine(charsetDetectUtfCharset);
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.textBuilder.toString());
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
                            consumer.accept(new CuesWithTiming(AbstractC2186b0.y(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                        } else if (arrayList != null) {
                            arrayList.add(new CuesWithTiming(AbstractC2186b0.y(buildCue(spannedFromHtml, str)), timecode, timecode2 - timecode));
                        }
                        j9 = j10;
                    } else {
                        Log.w(TAG, "Skipping invalid timing: ".concat(line2));
                    }
                } catch (NumberFormatException unused) {
                    Log.w(TAG, "Skipping invalid index: ".concat(line));
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer.accept((CuesWithTiming) it.next());
            }
        }
    }
}
