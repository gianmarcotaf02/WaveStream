package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalDate implements j$.time.temporal.m, j$.time.temporal.n, j$.time.chrono.ChronoLocalDate, java.io.Serializable {
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f23565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final short f23566c;
    public static final j$.time.LocalDate MIN = of(-999999999, 1, 1);
    public static final j$.time.LocalDate MAX = of(999999999, 12, 31);

    static {
        of(1970, 1, 1);
    }

    public static j$.time.LocalDate now() {
        return d0(j$.time.Clock.b());
    }

    public static j$.time.LocalDate d0(j$.time.a aVar) {
        j$.time.Instant instant = aVar.instant();
        java.util.Objects.requireNonNull(instant, "instant");
        j$.time.ZoneId zoneId = aVar.f23586a;
        java.util.Objects.requireNonNull(zoneId, "zone");
        return e0(java.lang.Math.floorDiv(instant.getEpochSecond() + ((long) zoneId.r().d(instant).getTotalSeconds()), 86400));
    }

    public static j$.time.LocalDate of(int i3, int i9, int i10) {
        j$.time.temporal.a.YEAR.b0(i3);
        j$.time.temporal.a.MONTH_OF_YEAR.b0(i9);
        j$.time.temporal.a.DAY_OF_MONTH.b0(i10);
        return B(i3, i9, i10);
    }

    public static j$.time.LocalDate f0(int i3, int i9) {
        long j = i3;
        j$.time.temporal.a.YEAR.b0(j);
        j$.time.temporal.a.DAY_OF_YEAR.b0(i9);
        boolean zD = j$.time.chrono.s.f23629c.D(j);
        if (i9 == 366 && !zD) {
            throw new j$.time.DateTimeException("Invalid date 'DayOfYear 366' as '" + i3 + "' is not a leap year");
        }
        j$.time.l lVarK = j$.time.l.K(((i9 - 1) / 31) + 1);
        if (i9 > (lVarK.B(zD) + lVarK.r(zD)) - 1) {
            lVarK = j$.time.l.f23761a[((((int) 1) + 12) + lVarK.ordinal()) % 12];
        }
        return new j$.time.LocalDate(i3, lVarK.p(), (i9 - lVarK.r(zD)) + 1);
    }

    public static j$.time.LocalDate e0(long j) {
        long j9;
        j$.time.temporal.a.EPOCH_DAY.b0(j);
        long j10 = 719468 + j;
        if (j10 < 0) {
            long j11 = ((j + 719469) / 146097) - 1;
            j9 = j11 * 400;
            j10 += (-j11) * 146097;
        } else {
            j9 = 0;
        }
        long j12 = ((j10 * 400) + 591) / 146097;
        long j13 = j10 - ((j12 / 400) + (((j12 / 4) + (j12 * 365)) - (j12 / 100)));
        if (j13 < 0) {
            j12--;
            j13 = j10 - ((j12 / 400) + (((j12 / 4) + (365 * j12)) - (j12 / 100)));
        }
        int i3 = (int) j13;
        int i9 = ((i3 * 5) + 2) / 153;
        int i10 = ((i9 + 2) % 12) + 1;
        int i11 = (i3 - (((i9 * 306) + 5) / 10)) + 1;
        long j14 = j12 + j9 + ((long) (i9 / 10));
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new j$.time.LocalDate(aVar.f23783b.a(j14, aVar), i10, i11);
    }

    public static j$.time.LocalDate J(j$.time.temporal.TemporalAccessor temporalAccessor) {
        java.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.time.LocalDate localDate = (j$.time.LocalDate) temporalAccessor.b(j$.time.temporal.r.f23807f);
        if (localDate != null) {
            return localDate;
        }
        throw new j$.time.DateTimeException("Unable to obtain LocalDate from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static j$.time.LocalDate parse(java.lang.CharSequence charSequence) {
        return parse(charSequence, j$.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static j$.time.LocalDate parse(java.lang.CharSequence charSequence, j$.time.format.DateTimeFormatter dateTimeFormatter) {
        java.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (j$.time.LocalDate) dateTimeFormatter.parse(charSequence, new j$.time.e(1));
    }

    public static j$.time.LocalDate B(int i3, int i9, int i10) {
        int i11 = 28;
        if (i10 > 28) {
            if (i9 != 2) {
                i11 = (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) ? 30 : 31;
            } else if (j$.time.chrono.s.f23629c.D(i3)) {
                i11 = 29;
            }
            if (i10 > i11) {
                if (i10 == 29) {
                    throw new j$.time.DateTimeException("Invalid date 'February 29' as '" + i3 + "' is not a leap year");
                }
                throw new j$.time.DateTimeException("Invalid date '" + j$.time.l.K(i9).name() + io.ktor.sse.ServerSentEventKt.SPACE + i10 + "'");
            }
        }
        return new j$.time.LocalDate(i3, i9, i10);
    }

    public static j$.time.LocalDate l0(int i3, int i9, int i10) {
        if (i9 == 2) {
            i10 = java.lang.Math.min(i10, j$.time.chrono.s.f23629c.D((long) i3) ? 29 : 28);
        } else if (i9 == 4 || i9 == 6 || i9 == 9 || i9 == 11) {
            i10 = java.lang.Math.min(i10, 30);
        }
        return new j$.time.LocalDate(i3, i9, i10);
    }

    public LocalDate(int i3, int i9, int i10) {
        this.f23564a = i3;
        this.f23565b = (short) i9;
        this.f23566c = (short) i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.K(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.W()) {
            throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        int i3 = j$.time.g.f23751a[aVar.ordinal()];
        if (i3 == 1) {
            return j$.time.temporal.u.f(1L, b0());
        }
        if (i3 == 2) {
            return j$.time.temporal.u.f(1L, L());
        }
        if (i3 == 3) {
            return j$.time.temporal.u.f(1L, (j$.time.l.K(this.f23565b) != j$.time.l.FEBRUARY || Q()) ? 5L : 4L);
        }
        if (i3 != 4) {
            return ((j$.time.temporal.a) qVar).f23783b;
        }
        return this.f23564a <= 0 ? j$.time.temporal.u.f(1L, androidx.media3.common.C.NANOS_PER_SECOND) : j$.time.temporal.u.f(1L, 999999999L);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int j(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return K(qVar);
        }
        return super.j(qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long f(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return toEpochDay();
            }
            if (qVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return K(qVar);
            }
            return ((((long) this.f23564a) * 12) + ((long) this.f23565b)) - 1;
        }
        return qVar.r(this);
    }

    public final int K(j$.time.temporal.q qVar) {
        int i3;
        int i9 = j$.time.g.f23751a[((j$.time.temporal.a) qVar).ordinal()];
        short s9 = this.f23566c;
        int i10 = this.f23564a;
        switch (i9) {
            case 1:
                return s9;
            case 2:
                return W();
            case 3:
                i3 = (s9 - 1) / 7;
                break;
            case 4:
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return getDayOfWeek().p();
            case 6:
                i3 = (s9 - 1) % 7;
                break;
            case 7:
                return ((W() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.t("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((W() - 1) / 7) + 1;
            case 10:
                return this.f23565b;
            case 11:
                throw new j$.time.temporal.t("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i10;
            case 13:
                return i10 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
        return i3 + 1;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.l h() {
        return j$.time.chrono.s.f23629c;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.m u() {
        return this.f23564a >= 1 ? j$.time.chrono.t.CE : j$.time.chrono.t.BCE;
    }

    public final int W() {
        return (j$.time.l.K(this.f23565b).r(Q()) + this.f23566c) - 1;
    }

    public j$.time.DayOfWeek getDayOfWeek() {
        return j$.time.DayOfWeek.r(((int) java.lang.Math.floorMod(toEpochDay() + 3, 7)) + 1);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean Q() {
        return j$.time.chrono.s.f23629c.D(this.f23564a);
    }

    public final int b0() {
        short s9 = this.f23565b;
        if (s9 != 2) {
            return (s9 == 4 || s9 == 6 || s9 == 9 || s9 == 11) ? 30 : 31;
        }
        return Q() ? 29 : 28;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final int L() {
        return Q() ? 366 : 365;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final j$.time.LocalDate m(j$.time.temporal.n nVar) {
        if (nVar instanceof j$.time.LocalDate) {
            return (j$.time.LocalDate) nVar;
        }
        return (j$.time.LocalDate) nVar.c(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDate e(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (j$.time.LocalDate) qVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.b0(j);
        int i3 = j$.time.g.f23751a[aVar.ordinal()];
        int i9 = this.f23564a;
        short s9 = this.f23566c;
        short s10 = this.f23565b;
        switch (i3) {
            case 1:
                int i10 = (int) j;
                if (s9 != i10) {
                    return of(i9, s10, i10);
                }
                return this;
            case 2:
                int i11 = (int) j;
                if (W() != i11) {
                    return f0(i9, i11);
                }
                return this;
            case 3:
                return j0(j - f(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i9 < 1) {
                    j = 1 - j;
                }
                return o0((int) j);
            case 5:
                return h0(j - ((long) getDayOfWeek().p()));
            case 6:
                return h0(j - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return h0(j - f(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return e0(j);
            case 9:
                return j0(j - f(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i12 = (int) j;
                if (s10 != i12) {
                    j$.time.temporal.a.MONTH_OF_YEAR.b0(i12);
                    return l0(i9, i12, s9);
                }
                return this;
            case 11:
                return i0(j - (((((long) i9) * 12) + ((long) s10)) - 1));
            case 12:
                return o0((int) j);
            case 13:
                if (f(j$.time.temporal.a.ERA) != j) {
                    return o0(1 - i9);
                }
                return this;
            default:
                throw new j$.time.temporal.t(j$.time.b.a("Unsupported field: ", qVar));
        }
    }

    public final j$.time.LocalDate o0(int i3) {
        if (this.f23564a == i3) {
            return this;
        }
        j$.time.temporal.a.YEAR.b0(i3);
        return l0(i3, this.f23565b, this.f23566c);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.ChronoLocalDate P(j$.time.temporal.p pVar) {
        if (pVar != null) {
            j$.time.q qVar = (j$.time.q) pVar;
            return i0((((long) qVar.f23772a) * 12) + ((long) qVar.f23773b)).h0(qVar.f23774c);
        }
        java.util.Objects.requireNonNull(pVar, "amountToAdd");
        return (j$.time.LocalDate) ((j$.time.q) pVar).p(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDate i(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof j$.time.temporal.b)) {
            return (j$.time.LocalDate) sVar.p(this, j);
        }
        switch (j$.time.g.f23752b[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return h0(j);
            case 2:
                return j0(j);
            case 3:
                return i0(j);
            case 4:
                return k0(j);
            case 5:
                return k0(java.lang.Math.multiplyExact(j, 10));
            case 6:
                return k0(java.lang.Math.multiplyExact(j, 100));
            case 7:
                return k0(java.lang.Math.multiplyExact(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return e(java.lang.Math.addExact(f(aVar), j), aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public final j$.time.LocalDate k0(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return l0(aVar.f23783b.a(((long) this.f23564a) + j, aVar), this.f23565b, this.f23566c);
    }

    public final j$.time.LocalDate i0(long j) {
        if (j == 0) {
            return this;
        }
        long j9 = (((long) this.f23564a) * 12) + ((long) (this.f23565b - 1)) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j10 = 12;
        return l0(aVar.f23783b.a(java.lang.Math.floorDiv(j9, j10), aVar), ((int) java.lang.Math.floorMod(j9, j10)) + 1, this.f23566c);
    }

    public final j$.time.LocalDate j0(long j) {
        return h0(java.lang.Math.multiplyExact(j, 7));
    }

    public final j$.time.LocalDate h0(long j) {
        if (j == 0) {
            return this;
        }
        long j9 = ((long) this.f23566c) + j;
        if (j9 > 0) {
            short s9 = this.f23565b;
            int i3 = this.f23564a;
            if (j9 <= 28) {
                return new j$.time.LocalDate(i3, s9, (int) j9);
            }
            if (j9 <= 59) {
                long jB0 = b0();
                if (j9 <= jB0) {
                    return new j$.time.LocalDate(i3, s9, (int) j9);
                }
                if (s9 < 12) {
                    return new j$.time.LocalDate(i3, s9 + 1, (int) (j9 - jB0));
                }
                int i9 = i3 + 1;
                j$.time.temporal.a.YEAR.b0(i9);
                return new j$.time.LocalDate(i9, 1, (int) (j9 - jB0));
            }
        }
        return e0(java.lang.Math.addExact(toEpochDay(), j));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final j$.time.LocalDate a(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? i(Long.MAX_VALUE, bVar).i(1L, bVar) : i(-j, bVar);
    }

    public j$.time.LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? h0(Long.MAX_VALUE).h0(1L) : h0(-j);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.r.f23807f ? this : super.b(temporalQuery);
    }

    public java.lang.String format(j$.time.format.DateTimeFormatter dateTimeFormatter) {
        java.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.format(this);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final j$.time.chrono.InterfaceC2497d M(j$.time.LocalTime localTime) {
        return j$.time.i.K(this, localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public long toEpochDay() {
        long j;
        long j9 = this.f23564a;
        long j10 = this.f23565b;
        long j11 = 365 * j9;
        if (j9 >= 0) {
            j = ((j9 + 399) / 400) + (((3 + j9) / 4) - ((99 + j9) / 100)) + j11;
        } else {
            j = j11 - ((j9 / (-400)) + ((j9 / (-4)) - (j9 / (-100))));
        }
        long j12 = (((367 * j10) - 362) / 12) + j + ((long) (this.f23566c - 1));
        if (j10 > 2) {
            j12 = !Q() ? j12 - 2 : j12 - 1;
        }
        return j12 - 719528;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDate, java.lang.Comparable
    public int compareTo(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        if (chronoLocalDate instanceof j$.time.LocalDate) {
            return r((j$.time.LocalDate) chronoLocalDate);
        }
        return super.compareTo(chronoLocalDate);
    }

    public final int r(j$.time.LocalDate localDate) {
        int i3 = this.f23564a - localDate.f23564a;
        if (i3 != 0) {
            return i3;
        }
        int i9 = this.f23565b - localDate.f23565b;
        return i9 == 0 ? this.f23566c - localDate.f23566c : i9;
    }

    public final boolean Y(j$.time.LocalDate localDate) {
        if (localDate != null) {
            return r(localDate) < 0;
        }
        return toEpochDay() < localDate.toEpochDay();
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.LocalDate) && r((j$.time.LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public int hashCode() {
        int i3 = this.f23564a;
        return (((i3 << 11) + (this.f23565b << 6)) + this.f23566c) ^ (i3 & (-2048));
    }

    @Override // j$.time.chrono.ChronoLocalDate
    public java.lang.String toString() {
        int i3 = this.f23564a;
        int iAbs = java.lang.Math.abs(i3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(10);
        if (iAbs >= 1000) {
            if (i3 > 9999) {
                sb.append('+');
            }
            sb.append(i3);
        } else if (i3 < 0) {
            sb.append(i3 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i3 + 10000);
            sb.deleteCharAt(0);
        }
        short s9 = this.f23565b;
        sb.append(s9 < 10 ? "-0" : "-");
        sb.append((int) s9);
        short s10 = this.f23566c;
        sb.append(s10 < 10 ? "-0" : "-");
        sb.append((int) s10);
        return sb.toString();
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 3, this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }
}
