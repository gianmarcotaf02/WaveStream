package j$.time.zone;

import j$.time.Clock;
import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.chrono.s;
import j$.time.l;
import j$.time.temporal.o;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public final class f implements Serializable {

    public static final long[] f23852i = new long[0];
    public static final e[] j = new e[0];

    public static final j$.time.i[] f23853k = new j$.time.i[0];

    public static final b[] f23854l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    public final long[] f23855a;

    public final ZoneOffset[] f23856b;

    public final long[] f23857c;

    public final j$.time.i[] f23858d;

    public final ZoneOffset[] f23859e;

    public final e[] f23860f;
    public final TimeZone g;

    public final transient ConcurrentHashMap f23861h = new ConcurrentHashMap();

    public static Object a(j$.time.i iVar, b bVar) {
        j$.time.i iVar2 = bVar.f23839b;
        ZoneOffset zoneOffset = bVar.f23841d;
        int totalSeconds = zoneOffset.getTotalSeconds();
        ZoneOffset zoneOffset2 = bVar.f23840c;
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

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f23855a = jArr;
        this.f23856b = zoneOffsetArr;
        this.f23857c = jArr2;
        this.f23859e = zoneOffsetArr2;
        this.f23860f = eVarArr;
        if (jArr2.length == 0) {
            this.f23858d = f23853k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            while (i3 < jArr2.length) {
                ZoneOffset zoneOffset = zoneOffsetArr2[i3];
                int i9 = i3 + 1;
                ZoneOffset zoneOffset2 = zoneOffsetArr2[i9];
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

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f23856b = zoneOffsetArr;
        long[] jArr = f23852i;
        this.f23855a = jArr;
        this.f23857c = jArr;
        this.f23858d = f23853k;
        this.f23859e = zoneOffsetArr;
        this.f23860f = j;
        this.g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.f23856b = zoneOffsetArr;
        long[] jArr = f23852i;
        this.f23855a = jArr;
        this.f23857c = jArr;
        this.f23858d = f23853k;
        this.f23859e = zoneOffsetArr;
        this.f23860f = j;
        this.g = timeZone;
    }

    public static ZoneOffset i(int i3) {
        return ZoneOffset.ofTotalSeconds(i3 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    public final boolean h() {
        b bVar;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            if (timeZone.useDaylightTime() || timeZone.getDSTSavings() != 0) {
                return false;
            }
            Instant instantNow = Instant.now();
            long epochSecond = instantNow.getEpochSecond();
            if (instantNow.getNano() > 0 && epochSecond < Long.MAX_VALUE) {
                epochSecond++;
            }
            int iC = c(epochSecond, d(instantNow));
            b[] bVarArrB = b(iC);
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
                b[] bVarArrB2 = b(iC - 1);
                for (int length2 = bVarArrB2.length - 1; length2 >= 0; length2--) {
                    b bVar2 = bVarArrB2[length2];
                    if (epochSecond > bVar2.f23838a) {
                        bVar = bVar2;
                    }
                }
                int offset = timeZone.getOffset((epochSecond - 1) * 1000);
                long epochDay = LocalDate.of(1800, 1, 1).toEpochDay() * 86400;
                for (long jMin = Math.min(epochSecond - 31104000, (Clock.systemUTC().a() / 1000) + 31968000); epochDay <= jMin; jMin -= 7776000) {
                    int offset2 = timeZone.getOffset(jMin * 1000);
                    if (offset != offset2) {
                        int iC2 = c(jMin, i(offset2));
                        b[] bVarArrB3 = b(iC2 + 1);
                        for (int length3 = bVarArrB3.length - 1; length3 >= 0; length3--) {
                            bVar = bVarArrB3[length3];
                            if (epochSecond > bVar.f23838a) {
                                break;
                            }
                        }
                        b[] bVarArrB4 = b(iC2);
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

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f23857c;
        if (jArr.length == 0) {
            return this.f23856b[0];
        }
        long epochSecond = instant.getEpochSecond();
        int length = this.f23860f.length;
        ZoneOffset[] zoneOffsetArr = this.f23859e;
        if (length > 0 && epochSecond > jArr[jArr.length - 1]) {
            b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i3 = 0; i3 < bVarArrB.length; i3++) {
                bVar = bVarArrB[i3];
                if (epochSecond < bVar.f23838a) {
                    return bVar.f23840c;
                }
            }
            return bVar.f23841d;
        }
        int iBinarySearch = Arrays.binarySearch(jArr, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return zoneOffsetArr[iBinarySearch + 1];
    }

    public final List f(j$.time.i iVar) {
        Object objE = e(iVar);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        int totalSeconds = bVar.f23841d.getTotalSeconds();
        ZoneOffset zoneOffset = bVar.f23840c;
        return totalSeconds > zoneOffset.getTotalSeconds() ? Collections.EMPTY_LIST : j$.time.c.c(new Object[]{zoneOffset, bVar.f23841d});
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(j$.time.i iVar) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f23856b;
        int i3 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArrB = b(iVar.f23756a.f23564a);
            if (bVarArrB.length == 0) {
                return i(timeZone.getOffset(iVar.a0(zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i3 < length) {
                b bVar = bVarArrB[i3];
                Object objA = a(iVar, bVar);
                if ((objA instanceof b) || objA.equals(bVar.f23840c)) {
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
            LocalDate localDate = iVar.f23756a;
            if (iVar2 == null) {
                long epochDay = localDate.toEpochDay();
                long epochDay2 = iVar2.f23756a.toEpochDay();
                if (epochDay <= epochDay2) {
                    if (epochDay == epochDay2) {
                    }
                }
                b[] bVarArrB2 = b(localDate.f23564a);
                int length3 = bVarArrB2.length;
                while (i3 < length3) {
                    b bVar2 = bVarArrB2[i3];
                    Object objA2 = a(iVar, bVar2);
                    if ((objA2 instanceof b) || objA2.equals(bVar2.f23840c)) {
                        return objA2;
                    }
                    i3++;
                    obj = objA2;
                }
                return obj;
            }
        }
        int iBinarySearch = Arrays.binarySearch(iVarArr, iVar);
        ZoneOffset[] zoneOffsetArr2 = this.f23859e;
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
            ZoneOffset zoneOffset = zoneOffsetArr2[i10];
            ZoneOffset zoneOffset2 = zoneOffsetArr2[i10 + 1];
            if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                return new b(iVar3, zoneOffset, zoneOffset2);
            }
            return new b(iVar4, zoneOffset, zoneOffset2);
        }
        return zoneOffsetArr2[(iBinarySearch / 2) + 1];
    }

    public final b[] b(int i3) {
        LocalDate localDateB;
        boolean z6;
        Integer num;
        int i9 = 0;
        boolean z9 = true;
        Integer numValueOf = Integer.valueOf(i3);
        ConcurrentHashMap concurrentHashMap = this.f23861h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArr2 = f23854l;
            if (i3 < 1800) {
                return bVarArr2;
            }
            j$.time.i iVar = j$.time.i.f23754c;
            LocalDate localDateOf = LocalDate.of(i3 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.b0(0);
            long jA0 = new j$.time.i(localDateOf, LocalTime.f23568f[0]).a0(this.f23856b[0]);
            int offset = timeZone.getOffset(jA0 * 1000);
            long j9 = 31968000 + jA0;
            while (jA0 < j9) {
                long j10 = jA0 + 7776000;
                if (offset != timeZone.getOffset(j10 * 1000)) {
                    while (j10 - jA0 > 1) {
                        boolean z10 = z9;
                        Integer num2 = numValueOf;
                        long jFloorDiv = Math.floorDiv(j10 + jA0, 2L);
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
                    ZoneOffset zoneOffsetI = i(offset);
                    int offset2 = timeZone.getOffset(jA0 * 1000);
                    ZoneOffset zoneOffsetI2 = i(offset2);
                    if (c(jA0, zoneOffsetI2) == i3) {
                        b[] bVarArr3 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr3[bVarArr3.length - 1] = new b(jA0, zoneOffsetI, zoneOffsetI2);
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
            Integer num3 = numValueOf;
            if (1916 <= i3 && i3 < 2100) {
                concurrentHashMap.putIfAbsent(num3, bVarArr2);
            }
            return bVarArr2;
        }
        int i10 = 1;
        long j11 = 1;
        e[] eVarArr = this.f23860f;
        b[] bVarArr4 = new b[eVarArr.length];
        int i11 = 0;
        while (i11 < eVarArr.length) {
            e eVar = eVarArr[i11];
            DayOfWeek dayOfWeek = eVar.f23846c;
            l lVar = eVar.f23844a;
            byte b9 = eVar.f23845b;
            if (b9 < 0) {
                long j12 = i3;
                int iB = lVar.B(s.f23629c.D(j12)) + 1 + b9;
                LocalDate localDate = LocalDate.MIN;
                j$.time.temporal.a.YEAR.b0(j12);
                j$.time.temporal.a.DAY_OF_MONTH.b0(iB);
                localDateB = LocalDate.B(i3, lVar.p(), iB);
                if (dayOfWeek != null) {
                    localDateB = localDateB.g(new o(dayOfWeek.p(), i10));
                }
            } else {
                LocalDate localDate2 = LocalDate.MIN;
                j$.time.temporal.a.YEAR.b0(i3);
                j$.time.temporal.a.DAY_OF_MONTH.b0(b9);
                localDateB = LocalDate.B(i3, lVar.p(), b9);
                if (dayOfWeek != null) {
                    localDateB = localDateB.g(new o(dayOfWeek.p(), i9));
                }
            }
            long j13 = j11;
            if (eVar.f23848e) {
                localDateB = localDateB.h0(j13);
            }
            j$.time.i iVarK = j$.time.i.K(localDateB, eVar.f23847d);
            int i12 = c.f23842a[eVar.f23849f.ordinal()];
            ZoneOffset zoneOffset = eVar.f23850h;
            if (i12 == 1) {
                iVarK = iVarK.b0(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
            } else if (i12 == 2) {
                iVarK = iVarK.b0(zoneOffset.getTotalSeconds() - eVar.g.getTotalSeconds());
            }
            bVarArr4[i11] = new b(iVarK, zoneOffset, eVar.f23851i);
            i10 = 1;
            i11++;
            j11 = 1;
        }
        if (i3 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr4);
        }
        return bVarArr4;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetI;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetI = i(timeZone.getRawOffset());
        } else {
            int length = this.f23857c.length;
            ZoneOffset[] zoneOffsetArr = this.f23856b;
            if (length == 0) {
                zoneOffsetI = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.f23855a, instant.getEpochSecond());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetI = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetI.equals(d(instant));
    }

    public static int c(long j9, ZoneOffset zoneOffset) {
        return LocalDate.e0(Math.floorDiv(j9 + ((long) zoneOffset.getTotalSeconds()), 86400)).f23564a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.f23855a, fVar.f23855a) && Arrays.equals(this.f23856b, fVar.f23856b) && Arrays.equals(this.f23857c, fVar.f23857c) && Arrays.equals(this.f23859e, fVar.f23859e) && Arrays.equals(this.f23860f, fVar.f23860f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.f23855a)) ^ Arrays.hashCode(this.f23856b)) ^ Arrays.hashCode(this.f23857c)) ^ Arrays.hashCode(this.f23859e)) ^ Arrays.hashCode(this.f23860f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f23856b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }
}
