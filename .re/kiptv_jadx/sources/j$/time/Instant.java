package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.n, java.lang.Comparable<j$.time.Instant>, java.io.Serializable {
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j$.time.Instant f23561c = new j$.time.Instant(0, 0);
    public static final j$.time.Instant MIN = ofEpochSecond(-31557014167219200L, 0);
    public static final j$.time.Instant MAX = ofEpochSecond(31556889864403199L, 999999999);

    public static j$.time.Instant now() {
        return j$.time.Clock.systemUTC().instant();
    }

    public static j$.time.Instant ofEpochSecond(long j, long j9) {
        return r(java.lang.Math.addExact(j, java.lang.Math.floorDiv(j9, androidx.media3.common.C.NANOS_PER_SECOND)), (int) java.lang.Math.floorMod(j9, androidx.media3.common.C.NANOS_PER_SECOND));
    }

    public static j$.time.Instant ofEpochMilli(long j) {
        long j9 = 1000;
        return r(java.lang.Math.floorDiv(j, j9), ((int) java.lang.Math.floorMod(j, j9)) * 1000000);
    }

    public static j$.time.Instant B(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof j$.time.Instant) {
            return (j$.time.Instant) temporalAccessor;
        }
        java.util.Objects.requireNonNull(temporalAccessor, "temporal");
        try {
            return ofEpochSecond(temporalAccessor.f(j$.time.temporal.a.INSTANT_SECONDS), temporalAccessor.j(j$.time.temporal.a.NANO_OF_SECOND));
        } catch (j$.time.DateTimeException e6) {
            throw new j$.time.DateTimeException("Unable to obtain Instant from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e6);
        }
    }

    public static j$.time.Instant parse(java.lang.CharSequence charSequence) {
        return (j$.time.Instant) j$.time.format.DateTimeFormatter.f23663i.parse(charSequence, new j$.time.e(0));
    }

    public static j$.time.Instant r(long j, int i3) {
        if ((((long) i3) | j) == 0) {
            return f23561c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new j$.time.DateTimeException("Instant exceeds minimum or maximum instant");
        }
        return new j$.time.Instant(j, i3);
    }

    public j$.time.ZonedDateTime atZone(j$.time.ZoneId zoneId) {
        java.util.Objects.requireNonNull(zoneId, "zone");
        return j$.time.ZonedDateTime.r(getEpochSecond(), getNano(), zoneId);
    }

    public Instant(long j, int i3) {
        this.f23562a = j;
        this.f23563b = i3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return super.l(qVar).a(qVar.r(this), qVar);
        }
        int i3 = j$.time.f.f23648a[((j$.time.temporal.a) qVar).ordinal()];
        int i9 = this.f23563b;
        if (i3 == 1) {
            return i9;
        }
        if (i3 == 2) {
            return i9 / 1000;
        }
        if (i3 == 3) {
            return i9 / 1000000;
        }
        if (i3 == 4) {
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            aVar.f23783b.a(this.f23562a, aVar);
        }
        throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.q qVar) {
        int i3;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.r(this);
        }
        int i9 = j$.time.f.f23648a[((j$.time.temporal.a) qVar).ordinal()];
        int i10 = this.f23563b;
        if (i9 == 1) {
            return i10;
        }
        if (i9 == 2) {
            i3 = i10 / 1000;
        } else {
            if (i9 != 3) {
                if (i9 == 4) {
                    return this.f23562a;
                }
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
            }
            i3 = i10 / 1000000;
        }
        return i3;
    }

    public long getEpochSecond() {
        return this.f23562a;
    }

    public int getNano() {
        return this.f23563b;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g */
    public final j$.time.temporal.m m(j$.time.LocalDate localDate) {
        return (j$.time.Instant) localDate.c(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m e(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (j$.time.Instant) qVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.b0(j);
        int i3 = j$.time.f.f23648a[aVar.ordinal()];
        int i9 = this.f23563b;
        long j9 = this.f23562a;
        if (i3 != 1) {
            if (i3 == 2) {
                int i10 = ((int) j) * 1000;
                if (i10 != i9) {
                    return r(j9, i10);
                }
            } else if (i3 == 3) {
                int i11 = ((int) j) * 1000000;
                if (i11 != i9) {
                    return r(j9, i11);
                }
            } else {
                if (i3 != 4) {
                    throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
                }
                if (j != j9) {
                    return r(j, i9);
                }
            }
        } else if (j != i9) {
            return r(j9, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final j$.time.Instant i(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (j$.time.Instant) sVar.p(this, j);
        }
        switch (j$.time.f.f23649b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return J(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(java.lang.Math.multiplyExact(j, 60));
            case 6:
                return plusSeconds(java.lang.Math.multiplyExact(j, 3600));
            case 7:
                return plusSeconds(java.lang.Math.multiplyExact(j, 43200));
            case 8:
                return plusSeconds(java.lang.Math.multiplyExact(j, 86400));
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public j$.time.Instant plusSeconds(long j) {
        return J(j, 0L);
    }

    public j$.time.Instant plusMillis(long j) {
        return J(j / 1000, (j % 1000) * 1000000);
    }

    public j$.time.Instant plusNanos(long j) {
        return J(0L, j);
    }

    public final j$.time.Instant J(long j, long j9) {
        if ((j | j9) == 0) {
            return this;
        }
        return ofEpochSecond(java.lang.Math.addExact(java.lang.Math.addExact(this.f23562a, j), j9 / androidx.media3.common.C.NANOS_PER_SECOND), ((long) this.f23563b) + (j9 % androidx.media3.common.C.NANOS_PER_SECOND));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.s sVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, sVar).i(1L, sVar) : i(-j, sVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.r.f23804c) {
            return j$.time.temporal.b.NANOS;
        }
        if (temporalQuery == j$.time.temporal.r.f23803b || temporalQuery == j$.time.temporal.r.f23802a || temporalQuery == j$.time.temporal.r.f23806e || temporalQuery == j$.time.temporal.r.f23805d || temporalQuery == j$.time.temporal.r.f23807f || temporalQuery == j$.time.temporal.r.g) {
            return null;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(this.f23562a, j$.time.temporal.a.INSTANT_SECONDS).e(this.f23563b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public long toEpochMilli() {
        long j = this.f23562a;
        int i3 = this.f23563b;
        return (j >= 0 || i3 <= 0) ? java.lang.Math.addExact(java.lang.Math.multiplyExact(j, 1000), i3 / 1000000) : java.lang.Math.addExact(java.lang.Math.multiplyExact(j + 1, 1000), (i3 / 1000000) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(j$.time.Instant instant) {
        int iCompare = java.lang.Long.compare(this.f23562a, instant.f23562a);
        return iCompare != 0 ? iCompare : this.f23563b - instant.f23563b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.Instant) {
            j$.time.Instant instant = (j$.time.Instant) obj;
            if (this.f23562a == instant.f23562a && this.f23563b == instant.f23563b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f23562a;
        return (this.f23563b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public java.lang.String toString() {
        return j$.time.format.DateTimeFormatter.f23663i.format(this);
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 2, this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }
}
