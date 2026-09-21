package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements j$.time.temporal.TemporalQuery, j$.time.temporal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23647a;

    public /* synthetic */ e(int i3) {
        this.f23647a = i3;
    }

    @Override // j$.time.temporal.n
    public j$.time.temporal.m c(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVar.e(mVar.l(aVar).f23811d, aVar);
    }

    @Override // j$.time.temporal.TemporalQuery
    public java.lang.Object queryFrom(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.time.e eVar = j$.time.temporal.r.f23802a;
        switch (this.f23647a) {
            case 0:
                return j$.time.Instant.B(temporalAccessor);
            case 1:
                return j$.time.LocalDate.J(temporalAccessor);
            case 2:
                return j$.time.LocalTime.B(temporalAccessor);
            case 3:
                int i3 = j$.time.OffsetDateTime.f23573c;
                if (temporalAccessor instanceof j$.time.OffsetDateTime) {
                    return (j$.time.OffsetDateTime) temporalAccessor;
                }
                try {
                    j$.time.ZoneOffset zoneOffsetFrom = j$.time.ZoneOffset.from(temporalAccessor);
                    j$.time.LocalDate localDate = (j$.time.LocalDate) temporalAccessor.b(j$.time.temporal.r.f23807f);
                    j$.time.LocalTime localTime = (j$.time.LocalTime) temporalAccessor.b(j$.time.temporal.r.g);
                    temporalAccessor = (localDate == null || localTime == null) ? j$.time.OffsetDateTime.r(j$.time.Instant.B(temporalAccessor), zoneOffsetFrom) : new j$.time.OffsetDateTime(j$.time.i.K(localDate, localTime), zoneOffsetFrom);
                    return temporalAccessor;
                } catch (j$.time.DateTimeException e6) {
                    throw new j$.time.DateTimeException("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e6);
                }
            case 4:
                j$.time.e eVar2 = j$.time.format.DateTimeFormatterBuilder.f23670h;
                j$.time.ZoneId zoneId = (j$.time.ZoneId) temporalAccessor.b(eVar);
                if (zoneId == null || (zoneId instanceof j$.time.ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 5:
            default:
                j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_DAY;
                if (temporalAccessor.d(aVar)) {
                    return j$.time.LocalTime.K(temporalAccessor.f(aVar));
                }
                return null;
            case 6:
                return (j$.time.ZoneId) temporalAccessor.b(eVar);
            case 7:
                return (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.r.f23803b);
            case 8:
                return (j$.time.temporal.s) temporalAccessor.b(j$.time.temporal.r.f23804c);
            case 9:
                j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                if (temporalAccessor.d(aVar2)) {
                    return j$.time.ZoneOffset.ofTotalSeconds(temporalAccessor.j(aVar2));
                }
                return null;
            case 10:
                j$.time.ZoneId zoneId2 = (j$.time.ZoneId) temporalAccessor.b(eVar);
                return zoneId2 != null ? zoneId2 : (j$.time.ZoneId) temporalAccessor.b(j$.time.temporal.r.f23805d);
            case 11:
                j$.time.temporal.a aVar3 = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.d(aVar3)) {
                    return j$.time.LocalDate.e0(temporalAccessor.f(aVar3));
                }
                return null;
        }
    }

    public java.lang.String toString() {
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
