package j$.time.temporal;

import j$.time.DateTimeException;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.C;
import j$.time.format.D;
import java.util.HashMap;

public final class v implements q {

    public static final u f23812f = u.f(1, 7);
    public static final u g = u.g(0, 4, 6);

    public static final u f23813h = u.g(0, 52, 54);

    public static final u f23814i = u.g(1, 52, 53);

    public final String f23815a;

    public final w f23816b;

    public final Enum f23817c;

    public final Enum f23818d;

    public final u f23819e;

    @Override
    public final boolean W() {
        return true;
    }

    public final int b(TemporalAccessor temporalAccessor) {
        return Math.floorMod(temporalAccessor.j(a.DAY_OF_WEEK) - this.f23816b.f23821a.p(), 7) + 1;
    }

    public final ChronoLocalDate e(j$.time.chrono.l lVar, int i3, int i9, int i10) {
        ChronoLocalDate chronoLocalDateG = lVar.G(i3, 1, 1);
        int iH = h(1, b(chronoLocalDateG));
        return chronoLocalDateG.i(((Math.min(i9, a(iH, chronoLocalDateG.L() + this.f23816b.f23822b) - 1) - 1) * 7) + (i10 - 1) + (-iH), (s) b.DAYS);
    }

    public v(String str, w wVar, s sVar, s sVar2, u uVar) {
        this.f23815a = str;
        this.f23816b = wVar;
        this.f23817c = (Enum) sVar;
        this.f23818d = (Enum) sVar2;
        this.f23819e = uVar;
    }

    @Override
    public final long r(TemporalAccessor temporalAccessor) {
        int iC;
        b bVar = b.WEEKS;
        Enum r9 = this.f23818d;
        if (r9 == bVar) {
            iC = b(temporalAccessor);
        } else if (r9 != b.MONTHS) {
            if (r9 != b.YEARS) {
                if (r9 == w.f23820h) {
                    iC = d(temporalAccessor);
                } else if (r9 == b.FOREVER) {
                    iC = c(temporalAccessor);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + r9 + ", this: " + this);
                }
            } else {
                int iB = b(temporalAccessor);
                int iJ = temporalAccessor.j(a.DAY_OF_YEAR);
                iC = a(h(iJ, iB), iJ);
            }
        } else {
            int iB2 = b(temporalAccessor);
            int iJ2 = temporalAccessor.j(a.DAY_OF_MONTH);
            iC = a(h(iJ2, iB2), iJ2);
        }
        return iC;
    }

    public final int c(TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iJ = temporalAccessor.j(a.YEAR);
        a aVar = a.DAY_OF_YEAR;
        int iJ2 = temporalAccessor.j(aVar);
        int iH = h(iJ2, iB);
        int iA = a(iH, iJ2);
        if (iA == 0) {
            return iJ - 1;
        }
        return iA >= a(iH, ((int) temporalAccessor.l(aVar).f23811d) + this.f23816b.f23822b) ? iJ + 1 : iJ;
    }

    public final int d(TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        a aVar = a.DAY_OF_YEAR;
        int iJ = temporalAccessor.j(aVar);
        int iH = h(iJ, iB);
        int iA2 = a(iH, iJ);
        if (iA2 == 0) {
            return d(j$.time.chrono.l.F(temporalAccessor).t(temporalAccessor).a(iJ, (s) b.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) temporalAccessor.l(aVar).f23811d) + this.f23816b.f23822b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i3, int i9) {
        int iFloorMod = Math.floorMod(i3 - i9, 7);
        return iFloorMod + 1 > this.f23816b.f23822b ? 7 - iFloorMod : -iFloorMod;
    }

    public static int a(int i3, int i9) {
        return ((i9 - 1) + (i3 + 7)) / 7;
    }

    @Override
    public final m p(m mVar, long j) {
        int iA = this.f23819e.a(j, this);
        int iJ = mVar.j(this);
        if (iA == iJ) {
            return mVar;
        }
        if (this.f23818d != b.FOREVER) {
            return mVar.i(iA - iJ, this.f23817c);
        }
        w wVar = this.f23816b;
        return e(j$.time.chrono.l.F(mVar), (int) j, mVar.j(wVar.f23825e), mVar.j(wVar.f23823c));
    }

    @Override
    public final TemporalAccessor J(HashMap map, C c9, D d4) {
        ChronoLocalDate chronoLocalDateI;
        ChronoLocalDate chronoLocalDateI2;
        ChronoLocalDate chronoLocalDateI3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int intExact = Math.toIntExact(jLongValue);
        b bVar = b.WEEKS;
        Enum r9 = this.f23818d;
        u uVar = this.f23819e;
        w wVar = this.f23816b;
        if (r9 == bVar) {
            long jFloorMod = Math.floorMod((uVar.a(jLongValue, this) - 1) + (wVar.f23821a.p() - 1), 7) + 1;
            map.remove(this);
            map.put(a.DAY_OF_WEEK, Long.valueOf(jFloorMod));
            return null;
        }
        a aVar = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iFloorMod = Math.floorMod(aVar.f23783b.a(((Long) map.get(aVar)).longValue(), aVar) - wVar.f23821a.p(), 7) + 1;
        j$.time.chrono.l lVarF = j$.time.chrono.l.F(c9);
        a aVar2 = a.YEAR;
        if (!map.containsKey(aVar2)) {
            if (r9 != w.f23820h && r9 != b.FOREVER) {
                return null;
            }
            v vVar = wVar.f23826f;
            if (!map.containsKey(vVar)) {
                return null;
            }
            v vVar2 = wVar.f23825e;
            if (!map.containsKey(vVar2)) {
                return null;
            }
            int iA = vVar.f23819e.a(((Long) map.get(vVar)).longValue(), vVar);
            if (d4 == D.LENIENT) {
                chronoLocalDateI = e(lVarF, iA, 1, iFloorMod).i(Math.subtractExact(((Long) map.get(vVar2)).longValue(), 1L), (s) bVar);
            } else {
                ChronoLocalDate chronoLocalDateE = e(lVarF, iA, vVar2.f23819e.a(((Long) map.get(vVar2)).longValue(), vVar2), iFloorMod);
                if (d4 == D.STRICT && c(chronoLocalDateE) != iA) {
                    throw new DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDateI = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(vVar);
            map.remove(vVar2);
            map.remove(aVar);
            return chronoLocalDateI;
        }
        int iA2 = aVar2.f23783b.a(((Long) map.get(aVar2)).longValue(), aVar2);
        b bVar2 = b.MONTHS;
        if (r9 == bVar2) {
            a aVar3 = a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long jLongValue2 = ((Long) map.get(aVar3)).longValue();
                long j = intExact;
                if (d4 == D.LENIENT) {
                    ChronoLocalDate chronoLocalDateI4 = lVarF.G(iA2, 1, 1).i(Math.subtractExact(jLongValue2, 1L), (s) bVar2);
                    int iB = b(chronoLocalDateI4);
                    int iJ = chronoLocalDateI4.j(a.DAY_OF_MONTH);
                    chronoLocalDateI3 = chronoLocalDateI4.i(Math.addExact(Math.multiplyExact(Math.subtractExact(j, a(h(iJ, iB), iJ)), 7), iFloorMod - b(chronoLocalDateI4)), (s) b.DAYS);
                } else {
                    ChronoLocalDate chronoLocalDateG = lVarF.G(iA2, aVar3.f23783b.a(jLongValue2, aVar3), 1);
                    long jA = uVar.a(j, this);
                    int iB2 = b(chronoLocalDateG);
                    int iJ2 = chronoLocalDateG.j(a.DAY_OF_MONTH);
                    ChronoLocalDate chronoLocalDateI5 = chronoLocalDateG.i((((int) (jA - ((long) a(h(iJ2, iB2), iJ2)))) * 7) + (iFloorMod - b(chronoLocalDateG)), (s) b.DAYS);
                    if (d4 == D.STRICT && chronoLocalDateI5.f(aVar3) != jLongValue2) {
                        throw new DateTimeException("Strict mode rejected resolved date as it is in a different month");
                    }
                    chronoLocalDateI3 = chronoLocalDateI5;
                }
                map.remove(this);
                map.remove(aVar2);
                map.remove(aVar3);
                map.remove(aVar);
                return chronoLocalDateI3;
            }
        }
        if (r9 != b.YEARS) {
            return null;
        }
        long j9 = intExact;
        ChronoLocalDate chronoLocalDateG2 = lVarF.G(iA2, 1, 1);
        if (d4 == D.LENIENT) {
            int iB3 = b(chronoLocalDateG2);
            int iJ3 = chronoLocalDateG2.j(a.DAY_OF_YEAR);
            chronoLocalDateI2 = chronoLocalDateG2.i(Math.addExact(Math.multiplyExact(Math.subtractExact(j9, a(h(iJ3, iB3), iJ3)), 7), iFloorMod - b(chronoLocalDateG2)), (s) b.DAYS);
        } else {
            long jA2 = uVar.a(j9, this);
            int iB4 = b(chronoLocalDateG2);
            int iJ4 = chronoLocalDateG2.j(a.DAY_OF_YEAR);
            ChronoLocalDate chronoLocalDateI6 = chronoLocalDateG2.i((((int) (jA2 - ((long) a(h(iJ4, iB4), iJ4)))) * 7) + (iFloorMod - b(chronoLocalDateG2)), (s) b.DAYS);
            if (d4 == D.STRICT && chronoLocalDateI6.f(aVar2) != iA2) {
                throw new DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDateI2 = chronoLocalDateI6;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return chronoLocalDateI2;
    }

    @Override
    public final u B() {
        return this.f23819e;
    }

    @Override
    public final boolean Y(TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.d(a.DAY_OF_WEEK)) {
            return false;
        }
        b bVar = b.WEEKS;
        Enum r9 = this.f23818d;
        if (r9 == bVar) {
            return true;
        }
        if (r9 == b.MONTHS) {
            return temporalAccessor.d(a.DAY_OF_MONTH);
        }
        if (r9 == b.YEARS) {
            return temporalAccessor.d(a.DAY_OF_YEAR);
        }
        if (r9 == w.f23820h) {
            return temporalAccessor.d(a.DAY_OF_YEAR);
        }
        if (r9 == b.FOREVER) {
            return temporalAccessor.d(a.YEAR);
        }
        return false;
    }

    @Override
    public final u K(TemporalAccessor temporalAccessor) {
        b bVar = b.WEEKS;
        Enum r9 = this.f23818d;
        if (r9 == bVar) {
            return this.f23819e;
        }
        if (r9 == b.MONTHS) {
            return f(temporalAccessor, a.DAY_OF_MONTH);
        }
        if (r9 == b.YEARS) {
            return f(temporalAccessor, a.DAY_OF_YEAR);
        }
        if (r9 == w.f23820h) {
            return g(temporalAccessor);
        }
        if (r9 == b.FOREVER) {
            return a.YEAR.f23783b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + r9 + ", this: " + this);
    }

    public final u f(TemporalAccessor temporalAccessor, a aVar) {
        int iH = h(temporalAccessor.j(aVar), b(temporalAccessor));
        u uVarL = temporalAccessor.l(aVar);
        return u.f(a(iH, (int) uVarL.f23808a), a(iH, (int) uVarL.f23811d));
    }

    public final u g(TemporalAccessor temporalAccessor) {
        a aVar = a.DAY_OF_YEAR;
        if (!temporalAccessor.d(aVar)) {
            return f23813h;
        }
        int iB = b(temporalAccessor);
        int iJ = temporalAccessor.j(aVar);
        int iH = h(iJ, iB);
        int iA = a(iH, iJ);
        if (iA != 0) {
            int i3 = (int) temporalAccessor.l(aVar).f23811d;
            int iA2 = a(iH, this.f23816b.f23822b + i3);
            if (iA >= iA2) {
                return g(j$.time.chrono.l.F(temporalAccessor).t(temporalAccessor).i((i3 - iJ) + 8, (s) b.DAYS));
            }
            return u.f(1L, iA2 - 1);
        }
        return g(j$.time.chrono.l.F(temporalAccessor).t(temporalAccessor).a(iJ + 7, (s) b.DAYS));
    }

    public final String toString() {
        return this.f23815a + "[" + this.f23816b.toString() + "]";
    }
}
