package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public enum i implements j$.time.temporal.s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f23790a;

    static {
        j$.time.d dVar = j$.time.d.f23644c;
    }

    i(java.lang.String str) {
        this.f23790a = str;
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.m p(j$.time.temporal.m mVar, long j) {
        int i3 = j$.time.temporal.c.f23786a[ordinal()];
        if (i3 == 1) {
            j$.time.temporal.h hVar = j$.time.temporal.j.f23793c;
            return mVar.e(java.lang.Math.addExact(mVar.j(hVar), j), hVar);
        }
        if (i3 == 2) {
            return mVar.i(j / 4, j$.time.temporal.b.YEARS).i((j % 4) * 3, j$.time.temporal.b.MONTHS);
        }
        throw new java.lang.IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f23790a;
    }
}
