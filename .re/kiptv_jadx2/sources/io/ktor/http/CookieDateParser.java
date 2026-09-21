package io.ktor.http;

import D6.g;
import androidx.media3.container.NalUnitUtil;
import io.ktor.util.date.GMTDate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/http/CookieDateParser;", "", "<init>", "()V", "T", "", "source", "name", "field", "Lh6/A;", "checkFieldNotNull", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "", "requirement", "Lkotlin/Function0;", "msg", "checkRequirement", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "Lio/ktor/util/date/GMTDate;", "parse", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CookieDateParser {
    private final <T> void checkFieldNotNull(String source, String name, T field) {
        if (field == null) {
            throw new InvalidCookieDateException(source, p.C("Could not find ", name));
        }
    }

    private final void checkRequirement(String source, boolean requirement, Function0 msg) {
        if (!requirement) {
            throw new InvalidCookieDateException(source, (String) msg.invoke());
        }
    }

    public static final String parse$lambda$5() {
        return "day-of-month not in [1,31]";
    }

    public static final String parse$lambda$6() {
        return "year >= 1601";
    }

    public static final String parse$lambda$7() {
        return "hours > 23";
    }

    public static final String parse$lambda$8() {
        return "minutes > 59";
    }

    public static final String parse$lambda$9() {
        return "seconds > 59";
    }

    public final GMTDate parse(String source) {
        m.e(source, "source");
        StringLexer stringLexer = new StringLexer(source);
        CookieDateBuilder cookieDateBuilder = new CookieDateBuilder();
        stringLexer.acceptWhile(new io.ktor.client.plugins.sse.c(23));
        while (stringLexer.getHasRemaining()) {
            if (stringLexer.test(new io.ktor.client.plugins.sse.c(24))) {
                int index = stringLexer.getIndex();
                stringLexer.acceptWhile(new io.ktor.client.plugins.sse.c(25));
                String strSubstring = stringLexer.getSource().substring(index, stringLexer.getIndex());
                m.d(strSubstring, "substring(...)");
                CookieUtilsKt.handleToken(cookieDateBuilder, strSubstring);
                stringLexer.acceptWhile(new io.ktor.client.plugins.sse.c(26));
            }
        }
        Integer year = cookieDateBuilder.getYear();
        g gVar = new g(70, 99, 1);
        if (year == null || !gVar.d(year.intValue())) {
            g gVar2 = new g(0, 69, 1);
            if (year != null && gVar2.d(year.intValue())) {
                Integer year2 = cookieDateBuilder.getYear();
                m.b(year2);
                cookieDateBuilder.setYear(Integer.valueOf(year2.intValue() + 2000));
            }
        } else {
            Integer year3 = cookieDateBuilder.getYear();
            m.b(year3);
            cookieDateBuilder.setYear(Integer.valueOf(year3.intValue() + 1900));
        }
        checkFieldNotNull(source, "day-of-month", cookieDateBuilder.getDayOfMonth());
        checkFieldNotNull(source, "month", cookieDateBuilder.getMonth());
        checkFieldNotNull(source, "year", cookieDateBuilder.getYear());
        checkFieldNotNull(source, "time", cookieDateBuilder.getHours());
        checkFieldNotNull(source, "time", cookieDateBuilder.getMinutes());
        checkFieldNotNull(source, "time", cookieDateBuilder.getSeconds());
        g gVar3 = new g(1, 31, 1);
        Integer dayOfMonth = cookieDateBuilder.getDayOfMonth();
        checkRequirement(source, dayOfMonth != null && gVar3.d(dayOfMonth.intValue()), new p026c6.a(24));
        Integer year4 = cookieDateBuilder.getYear();
        m.b(year4);
        checkRequirement(source, year4.intValue() >= 1601, new p026c6.a(25));
        Integer hours = cookieDateBuilder.getHours();
        m.b(hours);
        checkRequirement(source, hours.intValue() <= 23, new p026c6.a(26));
        Integer minutes = cookieDateBuilder.getMinutes();
        m.b(minutes);
        checkRequirement(source, minutes.intValue() <= 59, new p026c6.a(27));
        Integer seconds = cookieDateBuilder.getSeconds();
        m.b(seconds);
        checkRequirement(source, seconds.intValue() <= 59, new p026c6.a(28));
        return cookieDateBuilder.build();
    }
}
