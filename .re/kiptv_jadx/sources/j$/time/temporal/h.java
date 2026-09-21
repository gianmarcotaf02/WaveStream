package j$.time.temporal;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements j$.time.temporal.q {
    public static final j$.time.temporal.h DAY_OF_QUARTER;
    public static final j$.time.temporal.h QUARTER_OF_YEAR;
    public static final j$.time.temporal.h WEEK_BASED_YEAR;
    public static final j$.time.temporal.h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f23787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j$.time.temporal.h[] f23788b;

    @Override // j$.time.temporal.q
    public final boolean W() {
        return true;
    }

    public static j$.time.temporal.h valueOf(java.lang.String str) {
        return (j$.time.temporal.h) java.lang.Enum.valueOf(j$.time.temporal.h.class, str);
    }

    public static j$.time.temporal.h[] values() {
        return (j$.time.temporal.h[]) f23788b.clone();
    }

    static {
        j$.time.temporal.h hVar = new j$.time.temporal.h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final j$.time.temporal.u B() {
                return j$.time.temporal.u.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean Y(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(j$.time.temporal.a.DAY_OF_YEAR) || !temporalAccessor.d(j$.time.temporal.a.MONTH_OF_YEAR) || !temporalAccessor.d(j$.time.temporal.a.YEAR)) {
                    return false;
                }
                j$.time.temporal.h hVar2 = j$.time.temporal.j.f23791a;
                return j$.time.chrono.l.F(temporalAccessor).equals(j$.time.chrono.s.f23629c);
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.u K(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new j$.time.temporal.t("Unsupported field: DayOfQuarter");
                }
                long jF = temporalAccessor.f(j$.time.temporal.h.QUARTER_OF_YEAR);
                if (jF == 1) {
                    return j$.time.chrono.s.f23629c.D(temporalAccessor.f(j$.time.temporal.a.YEAR)) ? j$.time.temporal.u.f(1L, 91L) : j$.time.temporal.u.f(1L, 90L);
                }
                if (jF == 2) {
                    return j$.time.temporal.u.f(1L, 91L);
                }
                if (jF == 3 || jF == 4) {
                    return j$.time.temporal.u.f(1L, 92L);
                }
                return B();
            }

            @Override // j$.time.temporal.q
            public final long r(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new j$.time.temporal.t("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.j(j$.time.temporal.a.DAY_OF_YEAR) - j$.time.temporal.h.f23787a[((temporalAccessor.j(j$.time.temporal.a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.s.f23629c.D(temporalAccessor.f(j$.time.temporal.a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.m p(j$.time.temporal.m mVar, long j) {
                long jR = r(mVar);
                B().b(j, this);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
                return mVar.e((j - jR) + mVar.f(aVar), aVar);
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.TemporalAccessor J(java.util.HashMap map, j$.time.format.C c9, j$.time.format.D d4) {
                long jSubtractExact;
                j$.time.LocalDate localDateI0;
                j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
                java.lang.Long l2 = (java.lang.Long) map.get(aVar);
                j$.time.temporal.q qVar = j$.time.temporal.h.QUARTER_OF_YEAR;
                java.lang.Long l9 = (java.lang.Long) map.get(qVar);
                if (l2 == null || l9 == null) {
                    return null;
                }
                int iA = aVar.f23783b.a(l2.longValue(), aVar);
                long jLongValue = ((java.lang.Long) map.get(j$.time.temporal.h.DAY_OF_QUARTER)).longValue();
                j$.time.temporal.h hVar2 = j$.time.temporal.j.f23791a;
                if (!j$.time.chrono.l.F(c9).equals(j$.time.chrono.s.f23629c)) {
                    throw new j$.time.DateTimeException("Resolve requires IsoChronology");
                }
                if (d4 == j$.time.format.D.LENIENT) {
                    localDateI0 = j$.time.LocalDate.of(iA, 1, 1).i0(java.lang.Math.multiplyExact(java.lang.Math.subtractExact(l9.longValue(), 1L), 3));
                    jSubtractExact = java.lang.Math.subtractExact(jLongValue, 1L);
                } else {
                    j$.time.LocalDate localDateOf = j$.time.LocalDate.of(iA, ((qVar.B().a(l9.longValue(), qVar) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (d4 == j$.time.format.D.STRICT) {
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

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        j$.time.temporal.h hVar2 = new j$.time.temporal.h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final j$.time.temporal.u B() {
                return j$.time.temporal.u.f(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean Y(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(j$.time.temporal.a.MONTH_OF_YEAR)) {
                    return false;
                }
                j$.time.temporal.h hVar3 = j$.time.temporal.j.f23791a;
                return j$.time.chrono.l.F(temporalAccessor).equals(j$.time.chrono.s.f23629c);
            }

            @Override // j$.time.temporal.q
            public final long r(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new j$.time.temporal.t("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.f(j$.time.temporal.a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.u K(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new j$.time.temporal.t("Unsupported field: QuarterOfYear");
                }
                return B();
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.m p(j$.time.temporal.m mVar, long j) {
                long jR = r(mVar);
                B().b(j, this);
                j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
                return mVar.e(((j - jR) * 3) + mVar.f(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        j$.time.temporal.h hVar3 = new j$.time.temporal.h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final j$.time.temporal.u B() {
                return j$.time.temporal.u.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean Y(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                    return false;
                }
                j$.time.temporal.h hVar4 = j$.time.temporal.j.f23791a;
                return j$.time.chrono.l.F(temporalAccessor).equals(j$.time.chrono.s.f23629c);
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.u K(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (Y(temporalAccessor)) {
                    return j$.time.temporal.h.e0(j$.time.LocalDate.J(temporalAccessor));
                }
                throw new j$.time.temporal.t("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final long r(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new j$.time.temporal.t("Unsupported field: WeekOfWeekBasedYear");
                }
                return j$.time.temporal.h.b0(j$.time.LocalDate.J(temporalAccessor));
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.m p(j$.time.temporal.m mVar, long j) {
                B().b(j, this);
                return mVar.i(java.lang.Math.subtractExact(j, r(mVar)), j$.time.temporal.b.WEEKS);
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.TemporalAccessor J(java.util.HashMap map, j$.time.format.C c9, j$.time.format.D d4) {
                j$.time.LocalDate localDateE;
                long j;
                long j9;
                j$.time.temporal.q qVar = j$.time.temporal.h.WEEK_BASED_YEAR;
                java.lang.Long l2 = (java.lang.Long) map.get(qVar);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
                java.lang.Long l9 = (java.lang.Long) map.get(aVar);
                if (l2 == null || l9 == null) {
                    return null;
                }
                int iA = qVar.B().a(l2.longValue(), qVar);
                long jLongValue = ((java.lang.Long) map.get(j$.time.temporal.h.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                j$.time.temporal.h hVar4 = j$.time.temporal.j.f23791a;
                if (!j$.time.chrono.l.F(c9).equals(j$.time.chrono.s.f23629c)) {
                    throw new j$.time.DateTimeException("Resolve requires IsoChronology");
                }
                j$.time.LocalDate localDateOf = j$.time.LocalDate.of(iA, 1, 4);
                if (d4 == j$.time.format.D.LENIENT) {
                    long jLongValue2 = l9.longValue();
                    if (jLongValue2 > 7) {
                        long j10 = jLongValue2 - 1;
                        j = 1;
                        localDateOf = localDateOf.j0(j10 / 7);
                        j9 = j10 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.j0(java.lang.Math.subtractExact(jLongValue2, 7L) / 7);
                            j9 = (jLongValue2 + 6) % 7;
                        }
                        localDateE = localDateOf.j0(java.lang.Math.subtractExact(jLongValue, j)).e(jLongValue2, aVar);
                    }
                    jLongValue2 = j9 + j;
                    localDateE = localDateOf.j0(java.lang.Math.subtractExact(jLongValue, j)).e(jLongValue2, aVar);
                } else {
                    int iA2 = aVar.f23783b.a(l9.longValue(), aVar);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (d4 == j$.time.format.D.STRICT) {
                            j$.time.temporal.h.e0(localDateOf).b(jLongValue, this);
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

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        j$.time.temporal.h hVar4 = new j$.time.temporal.h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final j$.time.temporal.u B() {
                return j$.time.temporal.a.YEAR.f23783b;
            }

            @Override // j$.time.temporal.q
            public final boolean Y(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                    return false;
                }
                j$.time.temporal.h hVar5 = j$.time.temporal.j.f23791a;
                return j$.time.chrono.l.F(temporalAccessor).equals(j$.time.chrono.s.f23629c);
            }

            @Override // j$.time.temporal.q
            public final long r(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (Y(temporalAccessor)) {
                    return j$.time.temporal.h.c0(j$.time.LocalDate.J(temporalAccessor));
                }
                throw new j$.time.temporal.t("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.u K(j$.time.temporal.TemporalAccessor temporalAccessor) {
                if (!Y(temporalAccessor)) {
                    throw new j$.time.temporal.t("Unsupported field: WeekBasedYear");
                }
                return B();
            }

            @Override // j$.time.temporal.q
            public final j$.time.temporal.m p(j$.time.temporal.m mVar, long j) {
                if (!Y(mVar)) {
                    throw new j$.time.temporal.t("Unsupported field: WeekBasedYear");
                }
                int iA = j$.time.temporal.a.YEAR.f23783b.a(j, j$.time.temporal.h.WEEK_BASED_YEAR);
                j$.time.LocalDate localDateJ = j$.time.LocalDate.J(mVar);
                j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
                int iJ = localDateJ.j(aVar);
                int iB0 = j$.time.temporal.h.b0(localDateJ);
                if (iB0 == 53 && j$.time.temporal.h.d0(iA) == 52) {
                    iB0 = 52;
                }
                j$.time.LocalDate localDateOf = j$.time.LocalDate.of(iA, 1, 4);
                return mVar.m(localDateOf.h0(((iB0 - 1) * 7) + (iJ - localDateOf.j(aVar))));
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f23788b = new j$.time.temporal.h[]{hVar, hVar2, hVar3, hVar4};
        f23787a = new int[]{0, 90, 181, org.videolan.libvlc.MediaPlayer.Event.LengthChanged, 0, 91, 182, org.videolan.libvlc.MediaPlayer.Event.Vout};
    }

    public static j$.time.temporal.u e0(j$.time.LocalDate localDate) {
        return j$.time.temporal.u.f(1L, d0(c0(localDate)));
    }

    public static int d0(int i3) {
        j$.time.LocalDate localDateOf = j$.time.LocalDate.of(i3, 1, 1);
        if (localDateOf.getDayOfWeek() != j$.time.DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == j$.time.DayOfWeek.WEDNESDAY && localDateOf.Q()) ? 53 : 52;
        }
        return 53;
    }

    public static int b0(j$.time.LocalDate localDate) {
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
            localDate = j$.time.LocalDate.f0(localDate.f23564a, 180);
        }
        return (int) e0(localDate.k0(-1L)).f23811d;
    }

    public static int c0(j$.time.LocalDate localDate) {
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
