package p045e8;

/* JADX INFO: renamed from: e8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2132o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V1.b f21586b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p045e8.C2133p f21587a;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(p045e8.C2132o.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0);
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        c9.f(rVar);
        c9.f(new kotlin.jvm.internal.r(p045e8.C2132o.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0));
        c9.f(new kotlin.jvm.internal.r(p045e8.C2132o.class, "hour", "getHour()Ljava/lang/Integer;", 0));
        c9.f(new kotlin.jvm.internal.r(p045e8.C2132o.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0));
        c9.f(new kotlin.jvm.internal.r(p045e8.C2132o.class, "minute", "getMinute()Ljava/lang/Integer;", 0));
        c9.f(new kotlin.jvm.internal.r(p045e8.C2132o.class, "second", "getSecond()Ljava/lang/Integer;", 0));
        c9.f(new kotlin.jvm.internal.r(p045e8.C2132o.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0));
        c9.f(new kotlin.jvm.internal.r(p045e8.C2132o.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0));
        c9.f(new kotlin.jvm.internal.r(p045e8.C2132o.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0));
        f21586b = new V1.b(14);
    }

    public C2132o(p045e8.C2133p contents) {
        kotlin.jvm.internal.m.e(contents, "contents");
        this.f21587a = contents;
    }

    public final p036d8.d a() {
        int i3;
        p045e8.C2133p c2133p = this.f21587a;
        p036d8.k kVarB = c2133p.f21591c.b();
        p045e8.F f9 = c2133p.f21590b;
        p036d8.i iVarC = f9.c();
        p045e8.E e6 = c2133p.f21589a;
        java.lang.Integer num = e6.f21487a;
        p045e8.E e9 = new p045e8.E(num, e6.f21488b, e6.f21489c, e6.f21490d);
        p045e8.K.a(num, "year");
        e9.f21487a = java.lang.Integer.valueOf(num.intValue() % 10000);
        try {
            java.lang.Integer num2 = e6.f21487a;
            kotlin.jvm.internal.m.b(num2);
            long jMultiplyExact = java.lang.Math.multiplyExact(num2.intValue() / 10000, 315569520000L);
            long epochDay = e9.b().f21305h.toEpochDay();
            if (epochDay > 2147483647L) {
                i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
            } else {
                i3 = epochDay < -2147483648L ? Integer.MIN_VALUE : (int) epochDay;
            }
            long jAddExact = java.lang.Math.addExact(jMultiplyExact, ((((long) i3) * ((long) 86400)) + ((long) iVarC.f21306h.toSecondOfDay())) - ((long) kVarB.f21307a.getTotalSeconds()));
            p036d8.d.Companion.getClass();
            if (jAddExact < p036d8.d.f21302i.f21303h.getEpochSecond() || jAddExact > p036d8.d.j.f21303h.getEpochSecond()) {
                throw new p036d8.a("The parsed date is outside the range representable by Instant");
            }
            java.lang.Integer num3 = f9.f21496f;
            return p036d8.c.a(jAddExact, num3 != null ? num3.intValue() : 0);
        } catch (java.lang.ArithmeticException e10) {
            throw new p036d8.a("The parsed date is outside the range representable by Instant", (java.lang.Throwable) e10);
        }
    }
}
