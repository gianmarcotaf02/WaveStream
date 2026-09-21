package j$.time;

import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

public final class e implements TemporalQuery, j$.time.temporal.n {

    public final int f23647a;

    public e(int i3) {
        this.f23647a = i3;
    }

    @Override
    public j$.time.temporal.m c(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVar.e(mVar.l(aVar).f23811d, aVar);
    }

    @Override
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        e eVar = j$.time.temporal.r.f23802a;
        switch (this.f23647a) {
            case 0:
                return Instant.B(temporalAccessor);
            case 1:
                return LocalDate.J(temporalAccessor);
            case 2:
                return LocalTime.B(temporalAccessor);
            case 3:
                int i3 = OffsetDateTime.f23573c;
                if (temporalAccessor instanceof OffsetDateTime) {
                    return (OffsetDateTime) temporalAccessor;
                }
                try {
                    ZoneOffset zoneOffsetFrom = ZoneOffset.from(temporalAccessor);
                    LocalDate localDate = (LocalDate) temporalAccessor.b(j$.time.temporal.r.f23807f);
                    LocalTime localTime = (LocalTime) temporalAccessor.b(j$.time.temporal.r.g);
                    temporalAccessor = (localDate == null || localTime == null) ? OffsetDateTime.r(Instant.B(temporalAccessor), zoneOffsetFrom) : new OffsetDateTime(i.K(localDate, localTime), zoneOffsetFrom);
                    return temporalAccessor;
                } catch (DateTimeException e6) {
                    throw new DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e6);
                }
            case 4:
                e eVar2 = DateTimeFormatterBuilder.f23670h;
                ZoneId zoneId = (ZoneId) temporalAccessor.b(eVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 5:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.d(aVar)) {
                    return LocalTime.K(temporalAccessor.f(aVar));
                }
                return null;
            case 6:
                return (ZoneId) temporalAccessor.b(eVar);
            case 7:
                return (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.r.f23803b);
            case 8:
                return (j$.time.temporal.s) temporalAccessor.b(j$.time.temporal.r.f23804c);
            case 9:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.d(aVar2)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.j(aVar2));
                }
                return null;
            case 10:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.b(eVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.b(j$.time.temporal.r.f23805d);
            case 11:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.d(aVar3)) {
                    return LocalDate.e0(temporalAccessor.f(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f23647a) {
            case 6:
                return "ZoneId";
            case 7:
                return "Chronology";
            case 8:
                return "Precision";
            case 9:
                return "ZoneOffset";
            case 10:
                return "Zone";
            case 11:
                return "LocalDate";
            case 12:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
