package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "Lio/ktor/util/date/GMTDate;", "fromHttpToGmtDate", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;", "fromCookieToGmtDate", "toHttpDate", "(Lio/ktor/util/date/GMTDate;)Ljava/lang/String;", "", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "padZero", "(II)Ljava/lang/String;", "", "HTTP_DATE_FORMATS", "Ljava/util/List;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DateUtilsKt {
    private static final java.util.List<java.lang.String> HTTP_DATE_FORMATS = p078i6.p.B0("***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz");

    public static final io.ktor.util.date.GMTDate fromCookieToGmtDate(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        java.lang.String string = O7.q.r1(str).toString();
        try {
            return new io.ktor.http.CookieDateParser().parse(string);
        } catch (io.ktor.http.InvalidCookieDateException unused) {
            return fromHttpToGmtDate(string);
        }
    }

    public static final io.ktor.util.date.GMTDate fromHttpToGmtDate(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        java.lang.String string = O7.q.r1(str).toString();
        java.util.Iterator<java.lang.String> it = HTTP_DATE_FORMATS.iterator();
        while (it.hasNext()) {
            try {
                return new io.ktor.util.date.GMTDateParser(it.next()).parse(str);
            } catch (io.ktor.util.date.InvalidDateStringException unused) {
            }
        }
        throw new java.lang.IllegalStateException(("Failed to parse date: " + string).toString());
    }

    private static final java.lang.String padZero(int i3, int i9) {
        return O7.q.S0(i9, java.lang.String.valueOf(i3));
    }

    public static final java.lang.String toHttpDate(io.ktor.util.date.GMTDate gMTDate) {
        kotlin.jvm.internal.m.e(gMTDate, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(gMTDate.getDayOfWeek().getValue() + ", ");
        sb.append(padZero(gMTDate.getDayOfMonth(), 2) + ' ');
        sb.append(gMTDate.getMonth().getValue() + ' ');
        sb.append(padZero(gMTDate.getYear(), 4));
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE + padZero(gMTDate.getHours(), 2) + ':' + padZero(gMTDate.getMinutes(), 2) + ':' + padZero(gMTDate.getSeconds(), 2) + ' ');
        sb.append("GMT");
        return sb.toString();
    }
}
