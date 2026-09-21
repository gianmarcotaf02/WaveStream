package j$.time.temporal;

public enum i implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    public final String f23790a;

    static {
        j$.time.d dVar = j$.time.d.f23644c;
    }

    i(String str) {
        this.f23790a = str;
    }

    @Override
    public final m p(m mVar, long j) {
        int i3 = c.f23786a[ordinal()];
        if (i3 == 1) {
            h hVar = j.f23793c;
            return mVar.e(Math.addExact(mVar.j(hVar), j), hVar);
        }
        if (i3 == 2) {
            return mVar.i(j / 4, b.YEARS).i((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override
    public final String toString() {
        return this.f23790a;
    }
}
