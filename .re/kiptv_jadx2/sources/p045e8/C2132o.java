package p045e8;

import V1.b;
import androidx.media3.common.util.Log;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.r;
import p036d8.a;
import p036d8.c;
import p036d8.d;
import p036d8.i;
import p036d8.k;

public final class C2132o {

    public static final b f21586b;

    public final C2133p f21587a;

    static {
        r rVar = new r(C2132o.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0);
        C c9 = B.f24540a;
        c9.f(rVar);
        c9.f(new r(C2132o.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0));
        c9.f(new r(C2132o.class, "hour", "getHour()Ljava/lang/Integer;", 0));
        c9.f(new r(C2132o.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0));
        c9.f(new r(C2132o.class, "minute", "getMinute()Ljava/lang/Integer;", 0));
        c9.f(new r(C2132o.class, "second", "getSecond()Ljava/lang/Integer;", 0));
        c9.f(new r(C2132o.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0));
        c9.f(new r(C2132o.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0));
        c9.f(new r(C2132o.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0));
        f21586b = new b(14);
    }

    public C2132o(C2133p contents) {
        m.e(contents, "contents");
        this.f21587a = contents;
    }

    public final d a() {
        int i3;
        C2133p c2133p = this.f21587a;
        k kVarB = c2133p.f21591c.b();
        F f9 = c2133p.f21590b;
        i iVarC = f9.c();
        E e6 = c2133p.f21589a;
        Integer num = e6.f21487a;
        E e9 = new E(num, e6.f21488b, e6.f21489c, e6.f21490d);
        K.a(num, "year");
        e9.f21487a = Integer.valueOf(num.intValue() % 10000);
        try {
            Integer num2 = e6.f21487a;
            m.b(num2);
            long jMultiplyExact = Math.multiplyExact(num2.intValue() / 10000, 315569520000L);
            long epochDay = e9.b().f21305h.toEpochDay();
            if (epochDay > 2147483647L) {
                i3 = Log.LOG_LEVEL_OFF;
            } else {
                i3 = epochDay < -2147483648L ? Integer.MIN_VALUE : (int) epochDay;
            }
            long jAddExact = Math.addExact(jMultiplyExact, ((((long) i3) * ((long) 86400)) + ((long) iVarC.f21306h.toSecondOfDay())) - ((long) kVarB.f21307a.getTotalSeconds()));
            d.Companion.getClass();
            if (jAddExact < d.f21302i.f21303h.getEpochSecond() || jAddExact > d.j.f21303h.getEpochSecond()) {
                throw new a("The parsed date is outside the range representable by Instant");
            }
            Integer num3 = f9.f21496f;
            return c.a(jAddExact, num3 != null ? num3.intValue() : 0);
        } catch (ArithmeticException e10) {
            throw new a("The parsed date is outside the range representable by Instant", (Throwable) e10);
        }
    }
}
