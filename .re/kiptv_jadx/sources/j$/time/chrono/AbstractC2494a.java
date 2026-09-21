package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2494a implements j$.time.chrono.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f23598a = new java.util.concurrent.ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f23599b = new java.util.concurrent.ConcurrentHashMap();

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return s().compareTo(((j$.time.chrono.l) obj).s());
    }

    static {
        new java.util.Locale("ja", "JP", "JP");
    }

    public static j$.time.chrono.l r(j$.time.chrono.AbstractC2494a abstractC2494a, java.lang.String str) {
        java.lang.String strV;
        j$.time.chrono.l lVar = (j$.time.chrono.l) f23598a.putIfAbsent(str, abstractC2494a);
        if (lVar == null && (strV = abstractC2494a.V()) != null) {
            f23599b.putIfAbsent(strV, abstractC2494a);
        }
        return lVar;
    }

    @Override // j$.time.chrono.l
    public j$.time.chrono.ChronoLocalDate T(java.util.Map map, j$.time.format.D d4) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return q(((java.lang.Long) map.remove(aVar)).longValue());
        }
        J(map, d4);
        j$.time.chrono.ChronoLocalDate chronoLocalDateW = W(map, d4);
        if (chronoLocalDateW != null) {
            return chronoLocalDateW;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return K(map, d4);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int iA = X(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
                    if (d4 == j$.time.format.D.LENIENT) {
                        long jSubtractExact = java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar3)).longValue(), 1L);
                        return G(iA, 1, 1).i(jSubtractExact, (j$.time.temporal.s) j$.time.temporal.b.MONTHS).i(java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar4)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.WEEKS).i(java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar5)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                    }
                    int iA2 = X(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
                    j$.time.chrono.ChronoLocalDate chronoLocalDateI = G(iA, iA2, 1).i((X(aVar5).a(((java.lang.Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((X(aVar4).a(((java.lang.Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                    if (d4 != j$.time.format.D.STRICT || chronoLocalDateI.j(aVar3) == iA2) {
                        return chronoLocalDateI;
                    }
                    throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int iA3 = X(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
                    if (d4 == j$.time.format.D.LENIENT) {
                        return B(G(iA3, 1, 1), java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar3)).longValue(), 1L), java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar4)).longValue(), 1L), java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int iA4 = X(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
                    j$.time.chrono.ChronoLocalDate chronoLocalDateM = G(iA3, iA4, 1).i((X(aVar4).a(((java.lang.Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (j$.time.temporal.s) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(j$.time.DayOfWeek.r(X(aVar6).a(((java.lang.Long) map.remove(aVar6)).longValue(), aVar6)).p(), 0));
                    if (d4 != j$.time.format.D.STRICT || chronoLocalDateM.j(aVar3) == iA4) {
                        return chronoLocalDateM;
                    }
                    throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int iA5 = X(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
            if (d4 != j$.time.format.D.LENIENT) {
                return z(iA5, X(aVar7).a(((java.lang.Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return z(iA5, 1).i(java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar7)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int iA6 = X(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
            if (d4 == j$.time.format.D.LENIENT) {
                return z(iA6, 1).i(java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar8)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.WEEKS).i(java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar9)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
            }
            j$.time.chrono.ChronoLocalDate chronoLocalDateI2 = z(iA6, 1).i((X(aVar9).a(((java.lang.Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((X(aVar8).a(((java.lang.Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
            if (d4 != j$.time.format.D.STRICT || chronoLocalDateI2.j(aVar2) == iA6) {
                return chronoLocalDateI2;
            }
            throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int iA7 = X(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
        if (d4 == j$.time.format.D.LENIENT) {
            return B(z(iA7, 1), 0L, java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar8)).longValue(), 1L), java.lang.Math.subtractExact(((java.lang.Long) map.remove(aVar10)).longValue(), 1L));
        }
        j$.time.chrono.ChronoLocalDate chronoLocalDateM2 = z(iA7, 1).i((X(aVar8).a(((java.lang.Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (j$.time.temporal.s) j$.time.temporal.b.DAYS).m(new j$.time.temporal.o(j$.time.DayOfWeek.r(X(aVar10).a(((java.lang.Long) map.remove(aVar10)).longValue(), aVar10)).p(), 0));
        if (d4 != j$.time.format.D.STRICT || chronoLocalDateM2.j(aVar2) == iA7) {
            return chronoLocalDateM2;
        }
        throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different year");
    }

    public void J(java.util.Map map, j$.time.format.D d4) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        java.lang.Long l2 = (java.lang.Long) map.remove(aVar);
        if (l2 != null) {
            if (d4 != j$.time.format.D.LENIENT) {
                aVar.b0(l2.longValue());
            }
            j$.time.chrono.ChronoLocalDate chronoLocalDateE = N().e(1L, (j$.time.temporal.q) j$.time.temporal.a.DAY_OF_MONTH).e(l2.longValue(), (j$.time.temporal.q) aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            p(map, aVar2, chronoLocalDateE.j(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            p(map, aVar3, chronoLocalDateE.j(aVar3));
        }
    }

    public j$.time.chrono.ChronoLocalDate W(java.util.Map map, j$.time.format.D d4) {
        int intExact;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        java.lang.Long l2 = (java.lang.Long) map.remove(aVar);
        if (l2 != null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            java.lang.Long l9 = (java.lang.Long) map.remove(aVar2);
            if (d4 != j$.time.format.D.LENIENT) {
                intExact = X(aVar).a(l2.longValue(), aVar);
            } else {
                intExact = java.lang.Math.toIntExact(l2.longValue());
            }
            if (l9 != null) {
                p(map, j$.time.temporal.a.YEAR, v(R(X(aVar2).a(l9.longValue(), aVar2)), intExact));
                return null;
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar3)) {
                p(map, aVar3, v(z(X(aVar3).a(((java.lang.Long) map.get(aVar3)).longValue(), aVar3), 1).u(), intExact));
                return null;
            }
            if (d4 == j$.time.format.D.STRICT) {
                map.put(aVar, l2);
                return null;
            }
            java.util.List listC = C();
            if (listC.isEmpty()) {
                p(map, aVar3, intExact);
                return null;
            }
            p(map, aVar3, v((j$.time.chrono.m) listC.get(listC.size() - 1), intExact));
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar4)) {
            return null;
        }
        X(aVar4).b(((java.lang.Long) map.get(aVar4)).longValue(), aVar4);
        return null;
    }

    public j$.time.chrono.ChronoLocalDate K(java.util.Map map, j$.time.format.D d4) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int iA = X(aVar).a(((java.lang.Long) map.remove(aVar)).longValue(), aVar);
        if (d4 == j$.time.format.D.LENIENT) {
            long jSubtractExact = java.lang.Math.subtractExact(((java.lang.Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return G(iA, 1, 1).i(jSubtractExact, (j$.time.temporal.s) j$.time.temporal.b.MONTHS).i(java.lang.Math.subtractExact(((java.lang.Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int iA2 = X(aVar2).a(((java.lang.Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int iA3 = X(aVar3).a(((java.lang.Long) map.remove(aVar3)).longValue(), aVar3);
        if (d4 != j$.time.format.D.SMART) {
            return G(iA, iA2, iA3);
        }
        try {
            return G(iA, iA2, iA3);
        } catch (j$.time.DateTimeException unused) {
            return G(iA, iA2, 1).m(new j$.time.e(5));
        }
    }

    public static j$.time.chrono.ChronoLocalDate B(j$.time.chrono.ChronoLocalDate chronoLocalDate, long j, long j9, long j10) {
        long j11;
        j$.time.chrono.ChronoLocalDate chronoLocalDateI = chronoLocalDate.i(j, (j$.time.temporal.s) j$.time.temporal.b.MONTHS);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        j$.time.chrono.ChronoLocalDate chronoLocalDateI2 = chronoLocalDateI.i(j9, (j$.time.temporal.s) bVar);
        if (j10 > 7) {
            long j12 = j10 - 1;
            chronoLocalDateI2 = chronoLocalDateI2.i(j12 / 7, (j$.time.temporal.s) bVar);
            j11 = j12 % 7;
        } else {
            if (j10 < 1) {
                chronoLocalDateI2 = chronoLocalDateI2.i(java.lang.Math.subtractExact(j10, 7L) / 7, (j$.time.temporal.s) bVar);
                j11 = (j10 + 6) % 7;
            }
            return chronoLocalDateI2.m(new j$.time.temporal.o(j$.time.DayOfWeek.r((int) j10).p(), 0));
        }
        j10 = j11 + 1;
        return chronoLocalDateI2.m(new j$.time.temporal.o(j$.time.DayOfWeek.r((int) j10).p(), 0));
    }

    public static void p(java.util.Map map, j$.time.temporal.a aVar, long j) {
        java.lang.Long l2 = (java.lang.Long) map.get(aVar);
        if (l2 != null && l2.longValue() != j) {
            throw new j$.time.DateTimeException("Conflict found: " + aVar + io.ktor.sse.ServerSentEventKt.SPACE + l2 + " differs from " + aVar + io.ktor.sse.ServerSentEventKt.SPACE + j);
        }
        map.put(aVar, java.lang.Long.valueOf(j));
    }

    @Override // j$.time.chrono.l
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j$.time.chrono.AbstractC2494a) && s().compareTo(((j$.time.chrono.AbstractC2494a) obj).s()) == 0;
    }

    @Override // j$.time.chrono.l
    public final int hashCode() {
        return getClass().hashCode() ^ s().hashCode();
    }

    @Override // j$.time.chrono.l
    public final java.lang.String toString() {
        return s();
    }
}
