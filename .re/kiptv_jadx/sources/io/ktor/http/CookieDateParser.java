package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/http/CookieDateParser;", "", "<init>", "()V", "T", "", "source", "name", "field", "Lh6/A;", "checkFieldNotNull", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "", "requirement", "Lkotlin/Function0;", "msg", "checkRequirement", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "Lio/ktor/util/date/GMTDate;", "parse", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CookieDateParser {
    private final <T> void checkFieldNotNull(java.lang.String source, java.lang.String name, T field) {
        if (field == null) {
            throw new io.ktor.http.InvalidCookieDateException(source, p121o0.p.C("Could not find ", name));
        }
    }

    private final void checkRequirement(java.lang.String source, boolean requirement, kotlin.jvm.functions.Function0 msg) {
        if (!requirement) {
            throw new io.ktor.http.InvalidCookieDateException(source, (java.lang.String) msg.invoke());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$5() {
        return "day-of-month not in [1,31]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$6() {
        return "year >= 1601";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$7() {
        return "hours > 23";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$8() {
        return "minutes > 59";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String parse$lambda$9() {
        return "seconds > 59";
    }

    public final io.ktor.util.date.GMTDate parse(java.lang.String source) {
        kotlin.jvm.internal.m.e(source, "source");
        io.ktor.http.StringLexer stringLexer = new io.ktor.http.StringLexer(source);
        io.ktor.http.CookieDateBuilder cookieDateBuilder = new io.ktor.http.CookieDateBuilder();
        stringLexer.acceptWhile(new io.ktor.client.plugins.sse.c(23));
        while (stringLexer.getHasRemaining()) {
            if (stringLexer.test(new io.ktor.client.plugins.sse.c(24))) {
                int index = stringLexer.getIndex();
                stringLexer.acceptWhile(new io.ktor.client.plugins.sse.c(25));
                java.lang.String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                io.ktor.http.CookieUtilsKt.handleToken(cookieDateBuilder, strSubstring);
                stringLexer.acceptWhile(new io.ktor.client.plugins.sse.c(26));
            }
        }
        java.lang.Integer year = cookieDateBuilder.getYear();
        D6.g gVar = new D6.g(70, 99, 1);
        if (year == null || !gVar.d(year.intValue())) {
            D6.g gVar2 = new D6.g(0, 69, 1);
            if (year != null && gVar2.d(year.intValue())) {
                java.lang.Integer year2 = cookieDateBuilder.getYear();
                kotlin.jvm.internal.m.b(year2);
                cookieDateBuilder.setYear(java.lang.Integer.valueOf(year2.intValue() + 2000));
            }
        } else {
            java.lang.Integer year3 = cookieDateBuilder.getYear();
            kotlin.jvm.internal.m.b(year3);
            cookieDateBuilder.setYear(java.lang.Integer.valueOf(year3.intValue() + 1900));
        }
        checkFieldNotNull(source, "day-of-month", cookieDateBuilder.getDayOfMonth());
        checkFieldNotNull(source, "month", cookieDateBuilder.getMonth());
        checkFieldNotNull(source, "year", cookieDateBuilder.getYear());
        checkFieldNotNull(source, "time", cookieDateBuilder.getHours());
        checkFieldNotNull(source, "time", cookieDateBuilder.getMinutes());
        checkFieldNotNull(source, "time", cookieDateBuilder.getSeconds());
        D6.g gVar3 = new D6.g(1, 31, 1);
        java.lang.Integer dayOfMonth = cookieDateBuilder.getDayOfMonth();
        checkRequirement(source, dayOfMonth != null && gVar3.d(dayOfMonth.intValue()), new p026c6.a(24));
        java.lang.Integer year4 = cookieDateBuilder.getYear();
        kotlin.jvm.internal.m.b(year4);
        checkRequirement(source, year4.intValue() >= 1601, new p026c6.a(25));
        java.lang.Integer hours = cookieDateBuilder.getHours();
        kotlin.jvm.internal.m.b(hours);
        checkRequirement(source, hours.intValue() <= 23, new p026c6.a(26));
        java.lang.Integer minutes = cookieDateBuilder.getMinutes();
        kotlin.jvm.internal.m.b(minutes);
        checkRequirement(source, minutes.intValue() <= 59, new p026c6.a(27));
        java.lang.Integer seconds = cookieDateBuilder.getSeconds();
        kotlin.jvm.internal.m.b(seconds);
        checkRequirement(source, seconds.intValue() <= 59, new p026c6.a(28));
        return cookieDateBuilder.build();
    }
}
