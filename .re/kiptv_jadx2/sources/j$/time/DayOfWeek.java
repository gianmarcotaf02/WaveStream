package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

public final class DayOfWeek implements TemporalAccessor, j$.time.temporal.n {
    public static final DayOfWeek FRIDAY;
    public static final DayOfWeek MONDAY;
    public static final DayOfWeek SATURDAY;
    public static final DayOfWeek SUNDAY;
    public static final DayOfWeek THURSDAY;
    public static final DayOfWeek TUESDAY;
    public static final DayOfWeek WEDNESDAY;

    public static final DayOfWeek[] f23559a;

    public static final DayOfWeek[] f23560b;

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) f23560b.clone();
    }

    static {
        DayOfWeek dayOfWeek = new DayOfWeek("MONDAY", 0);
        MONDAY = dayOfWeek;
        DayOfWeek dayOfWeek2 = new DayOfWeek("TUESDAY", 1);
        TUESDAY = dayOfWeek2;
        DayOfWeek dayOfWeek3 = new DayOfWeek("WEDNESDAY", 2);
        WEDNESDAY = dayOfWeek3;
        DayOfWeek dayOfWeek4 = new DayOfWeek("THURSDAY", 3);
        THURSDAY = dayOfWeek4;
        DayOfWeek dayOfWeek5 = new DayOfWeek("FRIDAY", 4);
        FRIDAY = dayOfWeek5;
        DayOfWeek dayOfWeek6 = new DayOfWeek("SATURDAY", 5);
        SATURDAY = dayOfWeek6;
        DayOfWeek dayOfWeek7 = new DayOfWeek("SUNDAY", 6);
        SUNDAY = dayOfWeek7;
        f23560b = new DayOfWeek[]{dayOfWeek, dayOfWeek2, dayOfWeek3, dayOfWeek4, dayOfWeek5, dayOfWeek6, dayOfWeek7};
        f23559a = values();
    }

    public static DayOfWeek r(int i3) {
        if (i3 < 1 || i3 > 7) {
            throw new DateTimeException("Invalid value for DayOfWeek: " + i3);
        }
        return f23559a[i3 - 1];
    }

    public final int p() {
        return ordinal() + 1;
    }

    @Override
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.DAY_OF_WEEK;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return qVar.B();
        }
        return super.l(qVar);
    }

    @Override
    public final int j(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return p();
        }
        return super.j(qVar);
    }

    @Override
    public final long f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return p();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }

    @Override
    public final Object b(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return j$.time.temporal.b.DAYS;
        }
        return super.b(temporalQuery);
    }

    @Override
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(p(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
