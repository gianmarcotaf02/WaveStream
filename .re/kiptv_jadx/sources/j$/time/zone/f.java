package j$.time.zone;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements java.io.Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long[] f23852i = new long[0];
    public static final j$.time.zone.e[] j = new j$.time.zone.e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j$.time.i[] f23853k = new j$.time.i[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final j$.time.zone.b[] f23854l = new j$.time.zone.b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f23855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j$.time.ZoneOffset[] f23856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f23857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j$.time.i[] f23858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j$.time.ZoneOffset[] f23859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j$.time.zone.e[] f23860f;
    public final java.util.TimeZone g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient java.util.concurrent.ConcurrentHashMap f23861h = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:20:0x004f A[RETURN] */
    public static java.lang.Object a(j$.time.i iVar, j$.time.zone.b bVar) {
        j$.time.i iVar2 = bVar.f23839b;
        j$.time.ZoneOffset zoneOffset = bVar.f23841d;
        int totalSeconds = zoneOffset.getTotalSeconds();
        j$.time.ZoneOffset zoneOffset2 = bVar.f23840c;
        boolean z6 = totalSeconds > zoneOffset2.getTotalSeconds();
        j$.time.i iVar3 = bVar.f23839b;
        if (z6) {
            if (!iVar.J(iVar2)) {
                if (iVar.J(iVar3.b0(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds()))) {
                    return bVar;
                }
                return zoneOffset;
            }
            return zoneOffset2;
        }
        if (iVar.J(iVar2)) {
            if (iVar.J(iVar3.b0(zoneOffset.getTotalSeconds() - zoneOffset2.getTotalSeconds()))) {
                return zoneOffset2;
            }
            return bVar;
        }
        return zoneOffset;
    }

    public f(long[] jArr, j$.time.ZoneOffset[] zoneOffsetArr, long[] jArr2, j$.time.ZoneOffset[] zoneOffsetArr2, j$.time.zone.e[] eVarArr) {
        this.f23855a = jArr;
        this.f23856b = zoneOffsetArr;
        this.f23857c = jArr2;
        this.f23859e = zoneOffsetArr2;
        this.f23860f = eVarArr;
        if (jArr2.length == 0) {
            this.f23858d = f23853k;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i3 = 0;
            while (i3 < jArr2.length) {
                j$.time.ZoneOffset zoneOffset = zoneOffsetArr2[i3];
                int i9 = i3 + 1;
                j$.time.ZoneOffset zoneOffset2 = zoneOffsetArr2[i9];
                j$.time.i iVarW = j$.time.i.W(jArr2[i3], 0, zoneOffset);
                if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                    arrayList.add(iVarW);
                    arrayList.add(iVarW.b0(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                } else {
                    arrayList.add(iVarW.b0(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()));
                    arrayList.add(iVarW);
                }
                i3 = i9;
            }
            this.f23858d = (j$.time.i[]) arrayList.toArray(new j$.time.i[arrayList.size()]);
        }
        this.g = null;
    }

    public f(j$.time.ZoneOffset zoneOffset) {
        j$.time.ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f23856b = zoneOffsetArr;
        long[] jArr = f23852i;
        this.f23855a = jArr;
        this.f23857c = jArr;
        this.f23858d = f23853k;
        this.f23859e = zoneOffsetArr;
        this.f23860f = j;
        this.g = null;
    }

    public f(java.util.TimeZone timeZone) {
        j$.time.ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.f23856b = zoneOffsetArr;
        long[] jArr = f23852i;
        this.f23855a = jArr;
        this.f23857c = jArr;
        this.f23858d = f23853k;
        this.f23859e = zoneOffsetArr;
        this.f23860f = j;
        this.g = timeZone;
    }

    public static j$.time.ZoneOffset i(int i3) {
        return j$.time.ZoneOffset.ofTotalSeconds(i3 / 1000);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }

    private java.lang.Object writeReplace() {
        return new j$.time.zone.a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public final boolean h() {
        j$.time.zone.b bVar;
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
                return false;
            }
            j$.time.Instant instantNow = j$.time.Instant.now();
            long epochSecond = instantNow.getEpochSecond();
            if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                epochSecond++;
            }
            int iC = c(epochSecond, d(instantNow));
            j$.time.zone.b[] bVarArrB = b(iC);
            for (int length = bVarArrB.length - 1; length >= 0; length--) {
                bVar = bVarArrB[length];
                if (epochSecond > bVar.f23838a) {
                    if (bVar == null) {
                        return false;
                    }
                }
            }
            bVar = null;
            if (iC > 1800) {
                j$.time.zone.b[] bVarArrB2 = b(iC - 1);
                for (int length2 = bVarArrB2.length - 1; length2 >= 0; length2--) {
                    j$.time.zone.b bVar2 = bVarArrB2[length2];
                    if (epochSecond > bVar2.f23838a) {
                        bVar = bVar2;
                    }
                }
                int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                long epochDay = j$.time.LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                for (long jMin = java.lang.Math.min(epochSecond - 31104000, (j$.time.Clock.systemUTC().a() / 1000) + 31968000); epochDay <= jMin; jMin -= 7776000) {
                    int offset2 = timeZone.getOffset(jMin * 1000);
                    if (offset != offset2) {
                        int iC2 = c(jMin, i(offset2));
                        j$.time.zone.b[] bVarArrB3 = b(iC2 + 1);
                        for (int length3 = bVarArrB3.length - 1; length3 >= 0; length3--) {
                            bVar = bVarArrB3[length3];
                            if (epochSecond > bVar.f23838a) {
                                break;
                            }
                        }
                        j$.time.zone.b[] bVarArrB4 = b(iC2);
                        bVar = bVarArrB4[bVarArrB4.length - 1];
                        break;
                    }
                }
            }
            if (bVar == null) {
                return false;
            }
        } else if (this.f23857c.length != 0) {
            return false;
        }
        return true;
    }

    public final j$.time.ZoneOffset d(j$.time.Instant instant) {
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f23857c;
        if (jArr.length == 0) {
            return this.f23856b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f23860f.length;
        j$.time.ZoneOffset[] zoneOffsetArr = this.f23859e;
        if (length > 0 && epochSecond > jArr[jArr.length - 1]) {
            j$.time.zone.b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
            j$.time.zone.b bVar = null;
            for (int i3 = 0; i3 < bVarArrB.length; i3++) {
                bVar = bVarArrB[i3];
                if (epochSecond < bVar.f23838a) {
                    return bVar.f23840c;
                }
            }
            return bVar.f23841d;
        }
        int iBinarySearch = java.util.Arrays.binarySearch(jArr, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return zoneOffsetArr[iBinarySearch + 1];
    }

    public final java.util.List f(j$.time.i iVar) {
        java.lang.Object objE = e(iVar);
        if (!(objE instanceof j$.time.zone.b)) {
            return java.util.Collections.singletonList((j$.time.ZoneOffset) objE);
        }
        j$.time.zone.b bVar = (j$.time.zone.b) objE;
        int totalSeconds = bVar.f23841d.getTotalSeconds();
        j$.time.ZoneOffset zoneOffset = bVar.f23840c;
        return totalSeconds > zoneOffset.getTotalSeconds() ? java.util.Collections.EMPTY_LIST : j$.time.c.c(new java.lang.Object[]{zoneOffset, bVar.f23841d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r10.r(r1) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r10.f23757b.f0() <= r1.f23757b.f0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object e(j$.time.i iVar) {
        java.lang.Object obj = null;
        j$.time.ZoneOffset[] zoneOffsetArr = this.f23856b;
        int i3 = 0;
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            j$.time.zone.b[] bVarArrB = b(iVar.f23756a.f23564a);
            if (bVarArrB.length == 0) {
                return i(timeZone.getOffset(iVar.a0(zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i3 < length) {
                j$.time.zone.b bVar = bVarArrB[i3];
                java.lang.Object objA = a(iVar, bVar);
                if ((objA instanceof j$.time.zone.b) || objA.equals(bVar.f23840c)) {
                    return objA;
                }
                i3++;
                obj = objA;
            }
            return obj;
        }
        if (this.f23857c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f23860f.length;
        j$.time.i[] iVarArr = this.f23858d;
        if (length2 > 0) {
            j$.time.i iVar2 = iVarArr[iVarArr.length - 1];
            iVar.getClass();
            j$.time.LocalDate localDate = iVar.f23756a;
            if (iVar2 == null) {
                long epochDay = localDate.toEpochDay();
                long epochDay2 = iVar2.f23756a.toEpochDay();
                if (epochDay <= epochDay2) {
                    if (epochDay == epochDay2) {
                    }
                }
                j$.time.zone.b[] bVarArrB2 = b(localDate.f23564a);
                int length3 = bVarArrB2.length;
                while (i3 < length3) {
                    j$.time.zone.b bVar2 = bVarArrB2[i3];
                    java.lang.Object objA2 = a(iVar, bVar2);
                    if ((objA2 instanceof j$.time.zone.b) || objA2.equals(bVar2.f23840c)) {
                        return objA2;
                    }
                    i3++;
                    obj = objA2;
                }
                return obj;
            }
        }
        int iBinarySearch = java.util.Arrays.binarySearch(iVarArr, iVar);
        j$.time.ZoneOffset[] zoneOffsetArr2 = this.f23859e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < iVarArr.length - 1) {
            int i9 = iBinarySearch + 1;
            if (iVarArr[iBinarySearch].equals(iVarArr[i9])) {
                iBinarySearch = i9;
            }
        }
        if ((iBinarySearch & 1) == 0) {
            j$.time.i iVar3 = iVarArr[iBinarySearch];
            j$.time.i iVar4 = iVarArr[iBinarySearch + 1];
            int i10 = iBinarySearch / 2;
            j$.time.ZoneOffset zoneOffset = zoneOffsetArr2[i10];
            j$.time.ZoneOffset zoneOffset2 = zoneOffsetArr2[i10 + 1];
            if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                return new j$.time.zone.b(iVar3, zoneOffset, zoneOffset2);
            }
            return new j$.time.zone.b(iVar4, zoneOffset, zoneOffset2);
        }
        return zoneOffsetArr2[(iBinarySearch / 2) + 1];
    }

    public final j$.time.zone.b[] b(int i3) {
        j$.time.LocalDate localDateB;
        boolean z6;
        java.lang.Integer num;
        int i9 = 0;
        boolean z9 = true;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f23861h;
        j$.time.zone.b[] bVarArr = (j$.time.zone.b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            j$.time.zone.b[] bVarArr2 = f23854l;
            if (i3 < 1800) {
                return bVarArr2;
            }
            j$.time.i iVar = j$.time.i.f23754c;
            j$.time.LocalDate localDateOf = j$.time.LocalDate.of(i3 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.b0(0);
            long jA0 = new j$.time.i(localDateOf, j$.time.LocalTime.f23568f[0]).a0(this.f23856b[0]);
            int offset = timeZone.getOffset(jA0 * 1000);
            long j9 = 31968000 + jA0;
            while (jA0 < j9) {
                long j10 = jA0 + 7776000;
                if (offset != timeZone.getOffset(j10 * 1000)) {
                    while (j10 - jA0 > 1) {
                        boolean z10 = z9;
                        java.lang.Integer num2 = numValueOf;
                        long jFloorDiv = java.lang.Math.floorDiv(j10 + jA0, 2L);
                        if (timeZone.getOffset(jFloorDiv * 1000) == offset) {
                            jA0 = jFloorDiv;
                        } else {
                            j10 = jFloorDiv;
                        }
                        z9 = z10;
                        numValueOf = num2;
                    }
                    z6 = z9;
                    num = numValueOf;
                    if (timeZone.getOffset(jA0 * 1000) == offset) {
                        jA0 = j10;
                    }
                    j$.time.ZoneOffset zoneOffsetI = i(offset);
                    int offset2 = timeZone.getOffset(jA0 * 1000);
                    j$.time.ZoneOffset zoneOffsetI2 = i(offset2);
                    if (c(jA0, zoneOffsetI2) == i3) {
                        j$.time.zone.b[] bVarArr3 = (j$.time.zone.b[]) java.util.Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr3[bVarArr3.length - 1] = new j$.time.zone.b(jA0, zoneOffsetI, zoneOffsetI2);
                        offset = offset2;
                        bVarArr2 = bVarArr3;
                    } else {
                        offset = offset2;
                    }
                } else {
                    z6 = z9;
                    num = numValueOf;
                    jA0 = j10;
                }
                z9 = z6;
                numValueOf = num;
            }
            java.lang.Integer num3 = numValueOf;
            if (1916 <= i3 && i3 < 2100) {
                concurrentHashMap.putIfAbsent(num3, bVarArr2);
            }
            return bVarArr2;
        }
        int i10 = 1;
        long j11 = 1;
        j$.time.zone.e[] eVarArr = this.f23860f;
        j$.time.zone.b[] bVarArr4 = new j$.time.zone.b[eVarArr.length];
        int i11 = 0;
        while (i11 < eVarArr.length) {
            j$.time.zone.e eVar = eVarArr[i11];
            j$.time.DayOfWeek dayOfWeek = eVar.f23846c;
            j$.time.l lVar = eVar.f23844a;
            byte b9 = eVar.f23845b;
            if (b9 < 0) {
                long j12 = i3;
                int iB = lVar.B(j$.time.chrono.s.f23629c.D(j12)) + 1 + b9;
                j$.time.LocalDate localDate = j$.time.LocalDate.MIN;
                j$.time.temporal.a.YEAR.b0(j12);
                j$.time.temporal.a.DAY_OF_MONTH.b0(iB);
                localDateB = j$.time.LocalDate.B(i3, lVar.p(), iB);
                if (dayOfWeek != null) {
                    localDateB = localDateB.g(new j$.time.temporal.o(dayOfWeek.p(), i10));
                }
            } else {
                j$.time.LocalDate localDate2 = j$.time.LocalDate.MIN;
                j$.time.temporal.a.YEAR.b0(i3);
                j$.time.temporal.a.DAY_OF_MONTH.b0(b9);
                localDateB = j$.time.LocalDate.B(i3, lVar.p(), b9);
                if (dayOfWeek != null) {
                    localDateB = localDateB.g(new j$.time.temporal.o(dayOfWeek.p(), i9));
                }
            }
            long j13 = j11;
            if (eVar.f23848e) {
                localDateB = localDateB.h0(j13);
            }
            j$.time.i iVarK = j$.time.i.K(localDateB, eVar.f23847d);
            int i12 = j$.time.zone.c.f23842a[eVar.f23849f.ordinal()];
            j$.time.ZoneOffset zoneOffset = eVar.f23850h;
            if (i12 == 1) {
                iVarK = iVarK.b0(zoneOffset.getTotalSeconds() - j$.time.ZoneOffset.UTC.getTotalSeconds());
            } else if (i12 == 2) {
                iVarK = iVarK.b0(zoneOffset.getTotalSeconds() - eVar.g.getTotalSeconds());
            }
            bVarArr4[i11] = new j$.time.zone.b(iVarK, zoneOffset, eVar.f23851i);
            i10 = 1;
            i11++;
            j11 = 1;
        }
        if (i3 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr4);
        }
        return bVarArr4;
    }

    public final boolean g(j$.time.Instant instant) {
        j$.time.ZoneOffset zoneOffsetI;
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetI = i(timeZone.getRawOffset());
        } else {
            int length = this.f23857c.length;
            j$.time.ZoneOffset[] zoneOffsetArr = this.f23856b;
            if (length == 0) {
                zoneOffsetI = zoneOffsetArr[0];
            } else {
                int iBinarySearch = java.util.Arrays.binarySearch(this.f23855a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetI = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetI.equals(d(instant));
    }

    public static int c(long j9, j$.time.ZoneOffset zoneOffset) {
        return j$.time.LocalDate.e0(java.lang.Math.floorDiv(j9 + ((long) zoneOffset.getTotalSeconds()), 86400)).f23564a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.zone.f) {
            j$.time.zone.f fVar = (j$.time.zone.f) obj;
            if (java.util.Objects.equals(this.g, fVar.g) && java.util.Arrays.equals(this.f23855a, fVar.f23855a) && java.util.Arrays.equals(this.f23856b, fVar.f23856b) && java.util.Arrays.equals(this.f23857c, fVar.f23857c) && java.util.Arrays.equals(this.f23859e, fVar.f23859e) && java.util.Arrays.equals(this.f23860f, fVar.f23860f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((java.util.Objects.hashCode(this.g) ^ java.util.Arrays.hashCode(this.f23855a)) ^ java.util.Arrays.hashCode(this.f23856b)) ^ java.util.Arrays.hashCode(this.f23857c)) ^ java.util.Arrays.hashCode(this.f23859e)) ^ java.util.Arrays.hashCode(this.f23860f);
    }

    public final java.lang.String toString() {
        java.util.TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        j$.time.ZoneOffset[] zoneOffsetArr = this.f23856b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }
}
