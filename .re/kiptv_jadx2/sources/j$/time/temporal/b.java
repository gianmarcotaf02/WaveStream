package j$.time.temporal;

import androidx.media3.common.C;

public enum b implements s {
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


    public final String f23785a;

    static {
        j$.time.d dVar = j$.time.d.f23644c;
        j$.time.d.r(Math.addExact(Long.MAX_VALUE, Math.floorDiv(999999999L, C.NANOS_PER_SECOND)), (int) Math.floorMod(999999999L, C.NANOS_PER_SECOND));
    }

    b(String str) {
        this.f23785a = str;
    }

    @Override
    public final m p(m mVar, long j) {
        return mVar.i(j, this);
    }

    @Override
    public final String toString() {
        return this.f23785a;
    }
}
