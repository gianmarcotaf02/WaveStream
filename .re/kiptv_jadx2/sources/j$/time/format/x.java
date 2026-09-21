package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.util.Objects;

public final class x {

    public final TemporalAccessor f23746a;

    public final DateTimeFormatter f23747b;

    public int f23748c;

    public x(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        int i3;
        ZoneId zoneIdD;
        j$.time.chrono.s sVar = dateTimeFormatter.f23668e;
        ZoneId zoneId = dateTimeFormatter.f23669f;
        if (sVar != null || zoneId != null) {
            j$.time.chrono.l lVar = (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.r.f23803b);
            ZoneId zoneId2 = (ZoneId) temporalAccessor.b(j$.time.temporal.r.f23802a);
            ChronoLocalDate chronoLocalDateT = null;
            sVar = Objects.equals(sVar, lVar) ? null : sVar;
            zoneId = Objects.equals(zoneId, zoneId2) ? null : zoneId;
            if (sVar != null || zoneId != null) {
                j$.time.chrono.l lVar2 = sVar != null ? sVar : lVar;
                if (zoneId == null) {
                    zoneId2 = zoneId != null ? zoneId : zoneId2;
                    if (sVar != null) {
                        if (temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                            chronoLocalDateT = lVar2.t(temporalAccessor);
                        } else if (sVar == j$.time.chrono.s.f23629c || lVar != null) {
                            for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                                if (!aVar.W() && temporalAccessor.d(aVar)) {
                                    throw new DateTimeException("Unable to apply override chronology '" + sVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                                }
                            }
                        }
                    }
                    temporalAccessor = new w(chronoLocalDateT, temporalAccessor, lVar2, zoneId2);
                } else if (temporalAccessor.d(j$.time.temporal.a.INSTANT_SECONDS)) {
                    j$.time.chrono.s sVar2 = j$.time.chrono.s.f23629c;
                    if (lVar2 == null) {
                        Objects.requireNonNull(sVar2, "defaultObj");
                        lVar2 = sVar2;
                    }
                    temporalAccessor = lVar2.x(Instant.B(temporalAccessor), zoneId);
                } else {
                    try {
                        j$.time.zone.f fVarR = zoneId.r();
                        zoneIdD = fVarR.h() ? fVarR.d(Instant.f23561c) : zoneId;
                    } catch (j$.time.zone.g unused) {
                    }
                    if (zoneIdD instanceof ZoneOffset) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                        if (temporalAccessor.d(aVar2) && temporalAccessor.j(aVar2) != zoneId.r().d(Instant.f23561c).getTotalSeconds()) {
                            throw new DateTimeException("Unable to apply override zone '" + zoneId + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
                        }
                    }
                    if (zoneId != null) {
                    }
                    if (sVar != null) {
                        if (temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                            chronoLocalDateT = lVar2.t(temporalAccessor);
                        } else if (sVar == j$.time.chrono.s.f23629c) {
                            while (i3 < r2) {
                                if (!aVar.W()) {
                                }
                            }
                        } else {
                            while (i3 < r2) {
                                if (!aVar.W()) {
                                }
                            }
                        }
                    }
                    temporalAccessor = new w(chronoLocalDateT, temporalAccessor, lVar2, zoneId2);
                }
            }
        }
        this.f23746a = temporalAccessor;
        this.f23747b = dateTimeFormatter;
    }

    public final Object b(TemporalQuery temporalQuery) {
        TemporalAccessor temporalAccessor = this.f23746a;
        Object objB = temporalAccessor.b(temporalQuery);
        if (objB != null || this.f23748c != 0) {
            return objB;
        }
        throw new DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    public final Long a(j$.time.temporal.q qVar) {
        int i3 = this.f23748c;
        TemporalAccessor temporalAccessor = this.f23746a;
        if (i3 <= 0 || temporalAccessor.d(qVar)) {
            return Long.valueOf(temporalAccessor.f(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.f23746a.toString();
    }
}
