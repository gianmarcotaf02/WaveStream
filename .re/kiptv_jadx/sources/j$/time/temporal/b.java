package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public enum b implements j$.time.temporal.s {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f23785a;

    static {
        j$.time.d dVar = j$.time.d.f23644c;
        j$.time.d.r(java.lang.Math.addExact(Long.MAX_VALUE, java.lang.Math.floorDiv(999999999L, androidx.media3.common.C.NANOS_PER_SECOND)), (int) java.lang.Math.floorMod(999999999L, androidx.media3.common.C.NANOS_PER_SECOND));
    }

    b(java.lang.String str) {
        this.f23785a = str;
    }

    @Override // j$.time.temporal.s
    public final j$.time.temporal.m p(j$.time.temporal.m mVar, long j) {
        return mVar.i(j, this);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f23785a;
    }
}
