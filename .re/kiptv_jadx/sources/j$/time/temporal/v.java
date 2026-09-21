package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements j$.time.temporal.q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j$.time.temporal.u f23812f = j$.time.temporal.u.f(1, 7);
    public static final j$.time.temporal.u g = j$.time.temporal.u.g(0, 4, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final j$.time.temporal.u f23813h = j$.time.temporal.u.g(0, 52, 54);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final j$.time.temporal.u f23814i = j$.time.temporal.u.g(1, 52, 53);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f23815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j$.time.temporal.w f23816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Enum f23817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Enum f23818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j$.time.temporal.u f23819e;

    @Override // j$.time.temporal.q
    public final boolean W() {
        return true;
    }

    public final int b(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return java.lang.Math.floorMod(temporalAccessor.j(j$.time.temporal.a.DAY_OF_WEEK) - this.f23816b.f23821a.p(), 7) + 1;
    }

    public final j$.time.chrono.ChronoLocalDate e(j$.time.chrono.l lVar, int i3, int i9, int i10) {
        j$.time.chrono.ChronoLocalDate chronoLocalDateG = lVar.G(i3, 1, 1);
        int iH = h(1, b(chronoLocalDateG));
        return chronoLocalDateG.i(((java.lang.Math.min(i9, a(iH, chronoLocalDateG.L() + this.f23816b.f23822b) - 1) - 1) * 7) + (i10 - 1) + (-iH), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(java.lang.String str, j$.time.temporal.w wVar, j$.time.temporal.s sVar, j$.time.temporal.s sVar2, j$.time.temporal.u uVar) {
        this.f23815a = str;
        this.f23816b = wVar;
        this.f23817c = (java.lang.Enum) sVar;
        this.f23818d = (java.lang.Enum) sVar2;
        this.f23819e = uVar;
    }

    @Override // j$.time.temporal.q
    public final long r(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int iC;
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        java.lang.Enum r9 = this.f23818d;
        if (r9 == bVar) {
            iC = b(temporalAccessor);
        } else if (r9 != j$.time.temporal.b.MONTHS) {
            if (r9 != j$.time.temporal.b.YEARS) {
                if (r9 == j$.time.temporal.w.f23820h) {
                    iC = d(temporalAccessor);
                } else if (r9 == j$.time.temporal.b.FOREVER) {
                    iC = c(temporalAccessor);
                } else {
                    throw new java.lang.IllegalStateException("unreachable, rangeUnit: " + r9 + ", this: " + this);
                }
            } else {
                int iB = b(temporalAccessor);
                int iJ = temporalAccessor.j(j$.time.temporal.a.DAY_OF_YEAR);
                iC = a(h(iJ, iB), iJ);
            }
        } else {
            int iB2 = b(temporalAccessor);
            int iJ2 = temporalAccessor.j(j$.time.temporal.a.DAY_OF_MONTH);
            iC = a(h(iJ2, iB2), iJ2);
        }
        return iC;
    }

    public final int c(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int iB = b(temporalAccessor);
        int iJ = temporalAccessor.j(j$.time.temporal.a.YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
        int iJ2 = temporalAccessor.j(aVar);
        int iH = h(iJ2, iB);
        int iA = a(iH, iJ2);
        if (iA == 0) {
            return iJ - 1;
        }
        return iA >= a(iH, ((int) temporalAccessor.l(aVar).f23811d) + this.f23816b.f23822b) ? iJ + 1 : iJ;
    }

    public final int d(j$.time.temporal.TemporalAccessor temporalAccessor) {
        int iA;
        int iB = b(temporalAccessor);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
        int iJ = temporalAccessor.j(aVar);
        int iH = h(iJ, iB);
        int iA2 = a(iH, iJ);
        if (iA2 == 0) {
            return d(j$.time.chrono.l.F(temporalAccessor).t(temporalAccessor).a(iJ, (j$.time.temporal.s) j$.time.temporal.b.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) temporalAccessor.l(aVar).f23811d) + this.f23816b.f23822b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i3, int i9) {
        int iFloorMod = java.lang.Math.floorMod(i3 - i9, 7);
        return iFloorMod + 1 > this.f23816b.f23822b ? 7 - iFloorMod : -iFloorMod;
    }

    public static int a(int i3, int i9) {
        return ((i9 - 1) + (i3 + 7)) / 7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.s, java.lang.Enum] */
    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(j$.time.temporal.m mVar, long j) {
        int iA = this.f23819e.a(j, this);
        int iJ = mVar.j(this);
        if (iA == iJ) {
            return mVar;
        }
        if (this.f23818d != j$.time.temporal.b.FOREVER) {
            return mVar.i(iA - iJ, this.f23817c);
        }
        j$.time.temporal.w wVar = this.f23816b;
        return e(j$.time.chrono.l.F(mVar), (int) j, mVar.j(wVar.f23825e), mVar.j(wVar.f23823c));
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.TemporalAccessor J(java.util.HashMap map, j$.time.format.C c9, j$.time.format.D d4) {
        j$.time.chrono.ChronoLocalDate chronoLocalDateI;
        j$.time.chrono.ChronoLocalDate chronoLocalDateI2;
        j$.time.chrono.ChronoLocalDate chronoLocalDateI3;
        long jLongValue = ((java.lang.Long) map.get(this)).longValue();
        int intExact = java.lang.Math.toIntExact(jLongValue);
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        java.lang.Enum r9 = this.f23818d;
        j$.time.temporal.u uVar = this.f23819e;
        j$.time.temporal.w wVar = this.f23816b;
        if (r9 == bVar) {
            long jFloorMod = java.lang.Math.floorMod((uVar.a(jLongValue, this) - 1) + (wVar.f23821a.p() - 1), 7) + 1;
            map.remove(this);
            map.put(j$.time.temporal.a.DAY_OF_WEEK, java.lang.Long.valueOf(jFloorMod));
            return null;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar)) {
            return null;
        }
        int iFloorMod = java.lang.Math.floorMod(aVar.f23783b.a(((java.lang.Long) map.get(aVar)).longValue(), aVar) - wVar.f23821a.p(), 7) + 1;
        j$.time.chrono.l lVarF = j$.time.chrono.l.F(c9);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            if (r9 != j$.time.temporal.w.f23820h && r9 != j$.time.temporal.b.FOREVER) {
                return null;
            }
            j$.time.temporal.v vVar = wVar.f23826f;
            if (!map.containsKey(vVar)) {
                return null;
            }
            j$.time.temporal.v vVar2 = wVar.f23825e;
            if (!map.containsKey(vVar2)) {
                return null;
            }
            int iA = vVar.f23819e.a(((java.lang.Long) map.get(vVar)).longValue(), vVar);
            if (d4 == j$.time.format.D.LENIENT) {
                chronoLocalDateI = e(lVarF, iA, 1, iFloorMod).i(java.lang.Math.subtractExact(((java.lang.Long) map.get(vVar2)).longValue(), 1L), (j$.time.temporal.s) bVar);
            } else {
                j$.time.chrono.ChronoLocalDate chronoLocalDateE = e(lVarF, iA, vVar2.f23819e.a(((java.lang.Long) map.get(vVar2)).longValue(), vVar2), iFloorMod);
                if (d4 == j$.time.format.D.STRICT && c(chronoLocalDateE) != iA) {
                    throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different week-based-year");
                }
                chronoLocalDateI = chronoLocalDateE;
            }
            map.remove(this);
            map.remove(vVar);
            map.remove(vVar2);
            map.remove(aVar);
            return chronoLocalDateI;
        }
        int iA2 = aVar2.f23783b.a(((java.lang.Long) map.get(aVar2)).longValue(), aVar2);
        j$.time.temporal.b bVar2 = j$.time.temporal.b.MONTHS;
        if (r9 == bVar2) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                long jLongValue2 = ((java.lang.Long) map.get(aVar3)).longValue();
                long j = intExact;
                if (d4 == j$.time.format.D.LENIENT) {
                    j$.time.chrono.ChronoLocalDate chronoLocalDateI4 = lVarF.G(iA2, 1, 1).i(java.lang.Math.subtractExact(jLongValue2, 1L), (j$.time.temporal.s) bVar2);
                    int iB = b(chronoLocalDateI4);
                    int iJ = chronoLocalDateI4.j(j$.time.temporal.a.DAY_OF_MONTH);
                    chronoLocalDateI3 = chronoLocalDateI4.i(java.lang.Math.addExact(java.lang.Math.multiplyExact(java.lang.Math.subtractExact(j, a(h(iJ, iB), iJ)), 7), iFloorMod - b(chronoLocalDateI4)), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                } else {
                    j$.time.chrono.ChronoLocalDate chronoLocalDateG = lVarF.G(iA2, aVar3.f23783b.a(jLongValue2, aVar3), 1);
                    long jA = uVar.a(j, this);
                    int iB2 = b(chronoLocalDateG);
                    int iJ2 = chronoLocalDateG.j(j$.time.temporal.a.DAY_OF_MONTH);
                    j$.time.chrono.ChronoLocalDate chronoLocalDateI5 = chronoLocalDateG.i((((int) (jA - ((long) a(h(iJ2, iB2), iJ2)))) * 7) + (iFloorMod - b(chronoLocalDateG)), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
                    if (d4 == j$.time.format.D.STRICT && chronoLocalDateI5.f(aVar3) != jLongValue2) {
                        throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different month");
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
        if (r9 != j$.time.temporal.b.YEARS) {
            return null;
        }
        long j9 = intExact;
        j$.time.chrono.ChronoLocalDate chronoLocalDateG2 = lVarF.G(iA2, 1, 1);
        if (d4 == j$.time.format.D.LENIENT) {
            int iB3 = b(chronoLocalDateG2);
            int iJ3 = chronoLocalDateG2.j(j$.time.temporal.a.DAY_OF_YEAR);
            chronoLocalDateI2 = chronoLocalDateG2.i(java.lang.Math.addExact(java.lang.Math.multiplyExact(java.lang.Math.subtractExact(j9, a(h(iJ3, iB3), iJ3)), 7), iFloorMod - b(chronoLocalDateG2)), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
        } else {
            long jA2 = uVar.a(j9, this);
            int iB4 = b(chronoLocalDateG2);
            int iJ4 = chronoLocalDateG2.j(j$.time.temporal.a.DAY_OF_YEAR);
            j$.time.chrono.ChronoLocalDate chronoLocalDateI6 = chronoLocalDateG2.i((((int) (jA2 - ((long) a(h(iJ4, iB4), iJ4)))) * 7) + (iFloorMod - b(chronoLocalDateG2)), (j$.time.temporal.s) j$.time.temporal.b.DAYS);
            if (d4 == j$.time.format.D.STRICT && chronoLocalDateI6.f(aVar2) != iA2) {
                throw new j$.time.DateTimeException("Strict mode rejected resolved date as it is in a different year");
            }
            chronoLocalDateI2 = chronoLocalDateI6;
        }
        map.remove(this);
        map.remove(aVar2);
        map.remove(aVar);
        return chronoLocalDateI2;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.u B() {
        return this.f23819e;
    }

    @Override // j$.time.temporal.q
    public final boolean Y(j$.time.temporal.TemporalAccessor temporalAccessor) {
        if (!temporalAccessor.d(j$.time.temporal.a.DAY_OF_WEEK)) {
            return false;
        }
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        java.lang.Enum r9 = this.f23818d;
        if (r9 == bVar) {
            return true;
        }
        if (r9 == j$.time.temporal.b.MONTHS) {
            return temporalAccessor.d(j$.time.temporal.a.DAY_OF_MONTH);
        }
        if (r9 == j$.time.temporal.b.YEARS) {
            return temporalAccessor.d(j$.time.temporal.a.DAY_OF_YEAR);
        }
        if (r9 == j$.time.temporal.w.f23820h) {
            return temporalAccessor.d(j$.time.temporal.a.DAY_OF_YEAR);
        }
        if (r9 == j$.time.temporal.b.FOREVER) {
            return temporalAccessor.d(j$.time.temporal.a.YEAR);
        }
        return false;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.u K(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.time.temporal.b bVar = j$.time.temporal.b.WEEKS;
        java.lang.Enum r9 = this.f23818d;
        if (r9 == bVar) {
            return this.f23819e;
        }
        if (r9 == j$.time.temporal.b.MONTHS) {
            return f(temporalAccessor, j$.time.temporal.a.DAY_OF_MONTH);
        }
        if (r9 == j$.time.temporal.b.YEARS) {
            return f(temporalAccessor, j$.time.temporal.a.DAY_OF_YEAR);
        }
        if (r9 == j$.time.temporal.w.f23820h) {
            return g(temporalAccessor);
        }
        if (r9 == j$.time.temporal.b.FOREVER) {
            return j$.time.temporal.a.YEAR.f23783b;
        }
        throw new java.lang.IllegalStateException("unreachable, rangeUnit: " + r9 + ", this: " + this);
    }

    public final j$.time.temporal.u f(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.temporal.a aVar) {
        int iH = h(temporalAccessor.j(aVar), b(temporalAccessor));
        j$.time.temporal.u uVarL = temporalAccessor.l(aVar);
        return j$.time.temporal.u.f(a(iH, (int) uVarL.f23808a), a(iH, (int) uVarL.f23811d));
    }

    public final j$.time.temporal.u g(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_YEAR;
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
                return g(j$.time.chrono.l.F(temporalAccessor).t(temporalAccessor).i((i3 - iJ) + 8, (j$.time.temporal.s) j$.time.temporal.b.DAYS));
            }
            return j$.time.temporal.u.f(1L, iA2 - 1);
        }
        return g(j$.time.chrono.l.F(temporalAccessor).t(temporalAccessor).a(iJ + 7, (j$.time.temporal.s) j$.time.temporal.b.DAYS));
    }

    public final java.lang.String toString() {
        return this.f23815a + "[" + this.f23816b.toString() + "]";
    }
}
