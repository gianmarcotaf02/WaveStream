package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DayOfWeek implements j$.time.temporal.TemporalAccessor, j$.time.temporal.n {
    public static final j$.time.DayOfWeek FRIDAY;
    public static final j$.time.DayOfWeek MONDAY;
    public static final j$.time.DayOfWeek SATURDAY;
    public static final j$.time.DayOfWeek SUNDAY;
    public static final j$.time.DayOfWeek THURSDAY;
    public static final j$.time.DayOfWeek TUESDAY;
    public static final j$.time.DayOfWeek WEDNESDAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j$.time.DayOfWeek[] f23559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j$.time.DayOfWeek[] f23560b;

    public static j$.time.DayOfWeek valueOf(java.lang.String str) {
        return (j$.time.DayOfWeek) java.lang.Enum.valueOf(j$.time.DayOfWeek.class, str);
    }

    public static j$.time.DayOfWeek[] values() {
        return (j$.time.DayOfWeek[]) f23560b.clone();
    }

    static {
        j$.time.DayOfWeek dayOfWeek = new j$.time.DayOfWeek("MONDAY", 0);
        MONDAY = dayOfWeek;
        j$.time.DayOfWeek dayOfWeek2 = new j$.time.DayOfWeek("TUESDAY", 1);
        TUESDAY = dayOfWeek2;
        j$.time.DayOfWeek dayOfWeek3 = new j$.time.DayOfWeek("WEDNESDAY", 2);
        WEDNESDAY = dayOfWeek3;
        j$.time.DayOfWeek dayOfWeek4 = new j$.time.DayOfWeek("THURSDAY", 3);
        THURSDAY = dayOfWeek4;
        j$.time.DayOfWeek dayOfWeek5 = new j$.time.DayOfWeek("FRIDAY", 4);
        FRIDAY = dayOfWeek5;
        j$.time.DayOfWeek dayOfWeek6 = new j$.time.DayOfWeek("SATURDAY", 5);
        SATURDAY = dayOfWeek6;
        j$.time.DayOfWeek dayOfWeek7 = new j$.time.DayOfWeek("SUNDAY", 6);
        SUNDAY = dayOfWeek7;
        f23560b = new j$.time.DayOfWeek[]{dayOfWeek, dayOfWeek2, dayOfWeek3, dayOfWeek4, dayOfWeek5, dayOfWeek6, dayOfWeek7};
        f23559a = values();
    }

    public static j$.time.DayOfWeek r(int i3) {
        if (i3 < 1 || i3 > 7) {
            throw new j$.time.DateTimeException("Invalid value for DayOfWeek: " + i3);
        }
        return f23559a[i3 - 1];
    }

    public final int p() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.DAY_OF_WEEK;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return qVar.B();
        }
        return super.l(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return p();
        }
        return super.j(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return p();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return j$.time.temporal.b.DAYS;
        }
        return super.b(temporalQuery);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(p(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
