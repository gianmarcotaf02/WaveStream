package io.ktor.util.date;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/ktor/util/date/GMTDateParser;", "", "", "pattern", "<init>", "(Ljava/lang/String;)V", "Lio/ktor/util/date/GMTDateBuilder;", "", "type", "chunk", "Lh6/A;", "handleToken", "(Lio/ktor/util/date/GMTDateBuilder;CLjava/lang/String;)V", "dateString", "Lio/ktor/util/date/GMTDate;", "parse", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;", "Ljava/lang/String;", "Companion", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GMTDateParser {
    public static final char ANY = '*';
    public static final char DAY_OF_MONTH = 'd';
    public static final char HOURS = 'h';
    public static final char MINUTES = 'm';
    public static final char MONTH = 'M';
    public static final char SECONDS = 's';
    public static final char YEAR = 'Y';
    public static final char ZONE = 'z';
    private final java.lang.String pattern;

    public GMTDateParser(java.lang.String pattern) {
        kotlin.jvm.internal.m.e(pattern, "pattern");
        this.pattern = pattern;
        if (pattern.length() <= 0) {
            throw new java.lang.IllegalStateException("Date parser pattern shouldn't be empty.");
        }
    }

    private final void handleToken(io.ktor.util.date.GMTDateBuilder gMTDateBuilder, char c9, java.lang.String str) {
        if (c9 != '*') {
            if (c9 == 'M') {
                gMTDateBuilder.setMonth(io.ktor.util.date.Month.INSTANCE.from(str));
                return;
            }
            if (c9 == 'Y') {
                gMTDateBuilder.setYear(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c9 == 'd') {
                gMTDateBuilder.setDayOfMonth(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c9 == 'h') {
                gMTDateBuilder.setHours(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c9 == 'm') {
                gMTDateBuilder.setMinutes(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c9 == 's') {
                gMTDateBuilder.setSeconds(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c9 == 'z') {
                if (!kotlin.jvm.internal.m.a(str, "GMT")) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                return;
            }
            for (int i3 = 0; i3 < str.length(); i3++) {
                if (str.charAt(i3) != c9) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
            }
        }
    }

    public final io.ktor.util.date.GMTDate parse(java.lang.String dateString) {
        kotlin.jvm.internal.m.e(dateString, "dateString");
        io.ktor.util.date.GMTDateBuilder gMTDateBuilder = new io.ktor.util.date.GMTDateBuilder();
        char cCharAt = this.pattern.charAt(0);
        int i3 = 0;
        int i9 = 1;
        int i10 = 0;
        while (i9 < this.pattern.length()) {
            try {
                if (this.pattern.charAt(i9) == cCharAt) {
                    i9++;
                } else {
                    int i11 = (i10 + i9) - i3;
                    java.lang.String strSubstring = dateString.substring(i10, i11);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    handleToken(gMTDateBuilder, cCharAt, strSubstring);
                    try {
                        cCharAt = this.pattern.charAt(i9);
                        i3 = i9;
                        i9++;
                        i10 = i11;
                    } catch (java.lang.Throwable unused) {
                        i10 = i11;
                        throw new io.ktor.util.date.InvalidDateStringException(dateString, i10, this.pattern);
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
        if (i10 < dateString.length()) {
            java.lang.String strSubstring2 = dateString.substring(i10);
            kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
            handleToken(gMTDateBuilder, cCharAt, strSubstring2);
        }
        return gMTDateBuilder.build();
    }
}
