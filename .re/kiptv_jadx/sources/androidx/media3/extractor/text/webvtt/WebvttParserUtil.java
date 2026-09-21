package androidx.media3.extractor.text.webvtt;

/* JADX INFO: loaded from: classes.dex */
public final class WebvttParserUtil {
    private static final java.util.regex.Pattern COMMENT = java.util.regex.Pattern.compile("^NOTE([ \t].*)?$");
    private static final java.lang.String WEBVTT_HEADER = "WEBVTT";

    private WebvttParserUtil() {
    }

    public static java.util.regex.Matcher findNextCueHeader(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.lang.String line;
        while (true) {
            java.lang.String line2 = parsableByteArray.readLine();
            if (line2 == null) {
                return null;
            }
            if (COMMENT.matcher(line2).matches()) {
                do {
                    line = parsableByteArray.readLine();
                    if (line == null) {
                        break;
                    }
                } while (!line.isEmpty());
            } else {
                java.util.regex.Matcher matcher = androidx.media3.extractor.text.webvtt.WebvttCueParser.CUE_HEADER_PATTERN.matcher(line2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean isWebvttHeaderLine(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        java.lang.String line = parsableByteArray.readLine();
        return line != null && line.startsWith(WEBVTT_HEADER);
    }

    public static float parsePercentage(java.lang.String str) {
        if (str.endsWith("%")) {
            return java.lang.Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new java.lang.NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(java.lang.String str) {
        java.lang.String[] strArrSplitAtFirst = androidx.media3.common.util.Util.splitAtFirst(str, "\\.");
        long j = 0;
        for (java.lang.String str2 : androidx.media3.common.util.Util.split(strArrSplitAtFirst[0], ":")) {
            j = (j * 60) + java.lang.Long.parseLong(str2);
        }
        long j9 = j * 1000;
        if (strArrSplitAtFirst.length == 2) {
            java.lang.String strTrim = strArrSplitAtFirst[1].trim();
            if (strTrim.length() != 3) {
                throw new java.lang.IllegalArgumentException("Expected 3 decimal places, got: ".concat(strTrim));
            }
            j9 += java.lang.Long.parseLong(strTrim);
        }
        return j9 * 1000;
    }

    public static void validateWebvttHeaderLine(androidx.media3.common.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        if (isWebvttHeaderLine(parsableByteArray)) {
            return;
        }
        parsableByteArray.setPosition(position);
        throw androidx.media3.common.ParserException.createForMalformedContainer("Expected WEBVTT. Got " + parsableByteArray.readLine(), null);
    }
}
