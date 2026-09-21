package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.TemporalAccessor f23746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j$.time.format.DateTimeFormatter f23747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23748c;

    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00bd, please report this as an issue */
    public x(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.DateTimeFormatter dateTimeFormatter) {
        int i3;
        j$.time.ZoneId zoneIdD;
        j$.time.chrono.s sVar = dateTimeFormatter.f23668e;
        j$.time.ZoneId zoneId = dateTimeFormatter.f23669f;
        if (sVar != null || zoneId != null) {
            j$.time.chrono.l lVar = (j$.time.chrono.l) temporalAccessor.b(j$.time.temporal.r.f23803b);
            j$.time.ZoneId zoneId2 = (j$.time.ZoneId) temporalAccessor.b(j$.time.temporal.r.f23802a);
            j$.time.chrono.ChronoLocalDate chronoLocalDateT = null;
            sVar = java.util.Objects.equals(sVar, lVar) ? null : sVar;
            zoneId = java.util.Objects.equals(zoneId, zoneId2) ? null : zoneId;
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
                                    throw new j$.time.DateTimeException("Unable to apply override chronology '" + sVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                                }
                            }
                        }
                    }
                    temporalAccessor = new j$.time.format.w(chronoLocalDateT, temporalAccessor, lVar2, zoneId2);
                } else if (temporalAccessor.d(j$.time.temporal.a.INSTANT_SECONDS)) {
                    j$.time.chrono.s sVar2 = j$.time.chrono.s.f23629c;
                    if (lVar2 == null) {
                        java.util.Objects.requireNonNull(sVar2, "defaultObj");
                        lVar2 = sVar2;
                    }
                    temporalAccessor = lVar2.x(j$.time.Instant.B(temporalAccessor), zoneId);
                } else {
                    try {
                        j$.time.zone.f fVarR = zoneId.r();
                        zoneIdD = fVarR.h() ? fVarR.d(j$.time.Instant.f23561c) : zoneId;
                    } catch (j$.time.zone.g unused) {
                    }
                    if (zoneIdD instanceof j$.time.ZoneOffset) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.OFFSET_SECONDS;
                        if (temporalAccessor.d(aVar2) && temporalAccessor.j(aVar2) != zoneId.r().d(j$.time.Instant.f23561c).getTotalSeconds()) {
                            throw new j$.time.DateTimeException("Unable to apply override zone '" + zoneId + "' because the temporal object being formatted has a different offset but does not represent an instant: " + temporalAccessor);
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
                    temporalAccessor = new j$.time.format.w(chronoLocalDateT, temporalAccessor, lVar2, zoneId2);
                }
            }
        }
        this.f23746a = temporalAccessor;
        this.f23747b = dateTimeFormatter;
    }

    public final java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        j$.time.temporal.TemporalAccessor temporalAccessor = this.f23746a;
        java.lang.Object objB = temporalAccessor.b(temporalQuery);
        if (objB != null || this.f23748c != 0) {
            return objB;
        }
        throw new j$.time.DateTimeException("Unable to extract " + temporalQuery + " from temporal " + temporalAccessor);
    }

    public final java.lang.Long a(j$.time.temporal.q qVar) {
        int i3 = this.f23748c;
        j$.time.temporal.TemporalAccessor temporalAccessor = this.f23746a;
        if (i3 <= 0 || temporalAccessor.d(qVar)) {
            return java.lang.Long.valueOf(temporalAccessor.f(qVar));
        }
        return null;
    }

    public final java.lang.String toString() {
        return this.f23746a.toString();
    }
}
