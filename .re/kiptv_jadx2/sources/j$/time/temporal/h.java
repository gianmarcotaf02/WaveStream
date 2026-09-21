package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.format.C;
import j$.time.format.D;
import java.util.HashMap;
import org.videolan.libvlc.MediaPlayer;

public abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    public static final int[] f23787a;

    public static final h[] f23788b;

    @Override
    public final boolean W() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f23788b.clone();
    }

    static {
        h hVar = new h() {
            @Override
            public final u B() {
                return u.g(1L, 90L, 92L);
            }

            @Override
            public final boolean Y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.DAY_OF_YEAR) || !temporalAccessor.d(a.MONTH_OF_YEAR) || !temporalAccessor.d(a.YEAR)) {
                    return false;
                }
                h hVar2 = j.f23791a;
                return j$.time.chrono.l.F(temporalAccessor).equals(j$.time.chrono.s.f23629c);
            }

            @Override
            public final u K(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                long jF = temporalAccessor.f(h.QUARTER_OF_YEAR);
                if (jF == 1) {
                    return j$.time.chrono.s.f23629c.D(temporalAccessor.f(a.YEAR)) ? u.f(1L, 91L) : u.f(1L, 90L);
                }
                if (jF == 2) {
                    return u.f(1L, 91L);
                }
                if (jF == 3 || jF == 4) {
                    return u.f(1L, 92L);
                }
                return B();
            }

            @Override
            public final long r(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new t("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.j(a.DAY_OF_YEAR) - h.f23787a[((temporalAccessor.j(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.s.f23629c.D(temporalAccessor.f(a.YEAR)) ? 4 : 0)];
            }

            @Override
            public final m p(m mVar, long j) {
                long jR = r(mVar);
                B().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.e((j - jR) + mVar.f(aVar), aVar);
            }

            @Override
            public final TemporalAccessor J(HashMap map, C c9, D d4) {
                long jSubtractExact;
                LocalDate localDateI0;
                a aVar = a.YEAR;
                Long l2 = (Long) map.get(aVar);
                q qVar = h.QUARTER_OF_YEAR;
                Long l9 = (Long) map.get(qVar);
                if (l2 == null || l9 == null) {
                    return null;
                }
                int iA = aVar.f23783b.a(l2.longValue(), aVar);
                long jLongValue = ((Long) map.get(h.DAY_OF_QUARTER)).longValue();
                h hVar2 = j.f23791a;
                if (!j$.time.chrono.l.F(c9).equals(j$.time.chrono.s.f23629c)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                if (d4 == D.LENIENT) {
                    localDateI0 = LocalDate.of(iA, 1, 1).i0(Math.multiplyExact(Math.subtractExact(l9.longValue(), 1L), 3));
                    jSubtractExact = Math.subtractExact(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iA, ((qVar.B().a(l9.longValue(), qVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (d4 == D.STRICT) {
                            K(localDateOf).b(jLongValue, this);
                        } else {
                            B().b(jLongValue, this);
                        }
                    }
                    jSubtractExact = jLongValue - 1;
                    localDateI0 = localDateOf;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(qVar);
                return localDateI0.h0(jSubtractExact);
            }

            @Override
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() {
            @Override
            public final u B() {
                return u.f(1L, 4L);
            }

            @Override
            public final boolean Y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.MONTH_OF_YEAR)) {
                    return false;
                }
                h hVar3 = j.f23791a;
                return j$.time.chrono.l.F(temporalAccessor).equals(j$.time.chrono.s.f23629c);
            }

            @Override
            public final long r(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.f(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override
            public final u K(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new t("Unsupported field: QuarterOfYear");
                }
                return B();
            }

            @Override
            public final m p(m mVar, long j) {
                long jR = r(mVar);
                B().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.e(((j - jR) * 3) + mVar.f(aVar), aVar);
            }

            @Override
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() {
            @Override
            public final u B() {
                return u.g(1L, 52L, 53L);
            }

            @Override
            public final boolean Y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar4 = j.f23791a;
                return j$.time.chrono.l.F(temporalAccessor).equals(j$.time.chrono.s.f23629c);
            }

            @Override
            public final u K(TemporalAccessor temporalAccessor) {
                if (Y(temporalAccessor)) {
                    return h.e0(LocalDate.J(temporalAccessor));
                }
                throw new t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override
            public final long r(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new t("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.b0(LocalDate.J(temporalAccessor));
            }

            @Override
            public final m p(m mVar, long j) {
                B().b(j, this);
                return mVar.i(Math.subtractExact(j, r(mVar)), b.WEEKS);
            }

            @Override
            public final TemporalAccessor J(HashMap map, C c9, D d4) {
                LocalDate localDateE;
                long j;
                long j9;
                q qVar = h.WEEK_BASED_YEAR;
                Long l2 = (Long) map.get(qVar);
                a aVar = a.DAY_OF_WEEK;
                Long l9 = (Long) map.get(aVar);
                if (l2 == null || l9 == null) {
                    return null;
                }
                int iA = qVar.B().a(l2.longValue(), qVar);
                long jLongValue = ((Long) map.get(h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                h hVar4 = j.f23791a;
                if (!j$.time.chrono.l.F(c9).equals(j$.time.chrono.s.f23629c)) {
                    throw new DateTimeException("Resolve requires IsoChronology");
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                if (d4 == D.LENIENT) {
                    long jLongValue2 = l9.longValue();
                    if (jLongValue2 > 7) {
                        long j10 = jLongValue2 - 1;
                        j = 1;
                        localDateOf = localDateOf.j0(j10 / 7);
                        j9 = j10 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.j0(Math.subtractExact(jLongValue2, 7L) / 7);
                            j9 = (jLongValue2 + 6) % 7;
                        }
                        localDateE = localDateOf.j0(Math.subtractExact(jLongValue, j)).e(jLongValue2, aVar);
                    }
                    jLongValue2 = j9 + j;
                    localDateE = localDateOf.j0(Math.subtractExact(jLongValue, j)).e(jLongValue2, aVar);
                } else {
                    int iA2 = aVar.f23783b.a(l9.longValue(), aVar);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (d4 == D.STRICT) {
                            h.e0(localDateOf).b(jLongValue, this);
                        } else {
                            B().b(jLongValue, this);
                        }
                    }
                    localDateE = localDateOf.j0(jLongValue - 1).e(iA2, aVar);
                }
                map.remove(this);
                map.remove(qVar);
                map.remove(aVar);
                return localDateE;
            }

            @Override
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() {
            @Override
            public final u B() {
                return a.YEAR.f23783b;
            }

            @Override
            public final boolean Y(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(a.EPOCH_DAY)) {
                    return false;
                }
                h hVar5 = j.f23791a;
                return j$.time.chrono.l.F(temporalAccessor).equals(j$.time.chrono.s.f23629c);
            }

            @Override
            public final long r(TemporalAccessor temporalAccessor) {
                if (Y(temporalAccessor)) {
                    return h.c0(LocalDate.J(temporalAccessor));
                }
                throw new t("Unsupported field: WeekBasedYear");
            }

            @Override
            public final u K(TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                return B();
            }

            @Override
            public final m p(m mVar, long j) {
                if (!Y(mVar)) {
                    throw new t("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.f23783b.a(j, h.WEEK_BASED_YEAR);
                LocalDate localDateJ = LocalDate.J(mVar);
                a aVar = a.DAY_OF_WEEK;
                int iJ = localDateJ.j(aVar);
                int iB0 = h.b0(localDateJ);
                if (iB0 == 53 && h.d0(iA) == 52) {
                    iB0 = 52;
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                return mVar.m(localDateOf.h0(((iB0 - 1) * 7) + (iJ - localDateOf.j(aVar))));
            }

            @Override
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f23788b = new h[]{hVar, hVar2, hVar3, hVar4};
        f23787a = new int[]{0, 90, 181, MediaPlayer.Event.LengthChanged, 0, 91, 182, MediaPlayer.Event.Vout};
    }

    public static u e0(LocalDate localDate) {
        return u.f(1L, d0(c0(localDate)));
    }

    public static int d0(int i3) {
        LocalDate localDateOf = LocalDate.of(i3, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.Q()) ? 53 : 52;
        }
        return 53;
    }

    public static int b0(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int iW = localDate.W() - 1;
        int i3 = (3 - iOrdinal) + iW;
        int i9 = i3 - ((i3 / 7) * 7);
        int i10 = i9 - 3;
        if (i10 < -3) {
            i10 = i9 + 4;
        }
        if (iW >= i10) {
            int i11 = ((iW - i10) / 7) + 1;
            if (i11 != 53 || i10 == -3 || (i10 == -2 && localDate.Q())) {
                return i11;
            }
            return 1;
        }
        if (localDate.W() != 180) {
            localDate = LocalDate.f0(localDate.f23564a, 180);
        }
        return (int) e0(localDate.k0(-1L)).f23811d;
    }

    public static int c0(LocalDate localDate) {
        int i3 = localDate.f23564a;
        int iW = localDate.W();
        if (iW <= 3) {
            return iW - localDate.getDayOfWeek().ordinal() < -2 ? i3 - 1 : i3;
        }
        if (iW >= 363) {
            return ((iW - 363) - (localDate.Q() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? i3 + 1 : i3;
        }
        return i3;
    }
}
