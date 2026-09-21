package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.videolan.libvlc.media.MediaPlayer;

public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.n, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    public final int f23580b;

    public final transient String f23581c;

    public static final ConcurrentHashMap f23577d = new ConcurrentHashMap(16, 0.75f, 4);

    public static final ConcurrentHashMap f23578e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = ofTotalSeconds(0);

    public static final ZoneOffset f23579f = ofTotalSeconds(-64800);
    public static final ZoneOffset g = ofTotalSeconds(64800);

    @Override
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f23580b - this.f23580b;
    }

    public static ZoneOffset Y(String str) {
        int iB0;
        int iB1;
        int iB2;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) f23578e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iB0 = b0(str, 1, false);
                    iB1 = b0(str, 3, false);
                } else if (length == 6) {
                    iB0 = b0(str, 1, false);
                    iB1 = b0(str, 4, true);
                } else if (length == 7) {
                    iB0 = b0(str, 1, false);
                    iB1 = b0(str, 3, false);
                    iB2 = b0(str, 5, false);
                } else if (length == 9) {
                    iB0 = b0(str, 1, false);
                    iB1 = b0(str, 4, true);
                    iB2 = b0(str, 7, true);
                } else {
                    throw new DateTimeException("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iB2 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new DateTimeException("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt == '-') {
                return ofHoursMinutesSeconds(-iB0, -iB1, -iB2);
            }
            return ofHoursMinutesSeconds(iB0, iB1, iB2);
        }
        iB0 = b0(str, 1, false);
        iB1 = 0;
        iB2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return ofHoursMinutesSeconds(-iB0, -iB1, -iB2);
        }
        return ofHoursMinutesSeconds(iB0, iB1, iB2);
    }

    @Override
    public final j$.time.zone.f r() {
        return new j$.time.zone.f(this);
    }

    public static int b0(String str, int i3, boolean z6) {
        if (z6 && str.charAt(i3 - 1) != ':') {
            throw new DateTimeException("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i3);
        char cCharAt2 = str.charAt(i3 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new DateTimeException("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset from(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        ZoneOffset zoneOffset = (ZoneOffset) temporalAccessor.b(j$.time.temporal.r.f23805d);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        throw new DateTimeException("Unable to obtain ZoneOffset from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static ZoneOffset ofHoursMinutesSeconds(int i3, int i9, int i10) {
        if (i3 < -18 || i3 > 18) {
            throw new DateTimeException("Zone offset hours not in valid range: value " + i3 + " is not in the range -18 to 18");
        }
        if (i3 > 0) {
            if (i9 < 0 || i10 < 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i3 < 0) {
            if (i9 > 0 || i10 > 0) {
                throw new DateTimeException("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i9 > 0 && i10 < 0) || (i9 < 0 && i10 > 0)) {
            throw new DateTimeException("Zone offset minutes and seconds must have the same sign");
        }
        if (i9 < -59 || i9 > 59) {
            throw new DateTimeException("Zone offset minutes not in valid range: value " + i9 + " is not in the range -59 to 59");
        }
        if (i10 < -59 || i10 > 59) {
            throw new DateTimeException("Zone offset seconds not in valid range: value " + i10 + " is not in the range -59 to 59");
        }
        if (Math.abs(i3) == 18 && (i9 | i10) != 0) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        return ofTotalSeconds((i9 * 60) + (i3 * 3600) + i10);
    }

    public static ZoneOffset ofTotalSeconds(int i3) {
        if (i3 < -64800 || i3 > 64800) {
            throw new DateTimeException("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i3 % MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR == 0) {
            Integer numValueOf = Integer.valueOf(i3);
            ConcurrentHashMap concurrentHashMap = f23577d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i3));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
            f23578e.putIfAbsent(zoneOffset2.f23581c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i3);
    }

    public ZoneOffset(int i3) {
        String string;
        this.f23580b = i3;
        if (i3 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i3);
            StringBuilder sb = new StringBuilder();
            int i9 = iAbs / 3600;
            int i10 = (iAbs / 60) % 60;
            sb.append(i3 < 0 ? "-" : "+");
            sb.append(i9 < 10 ? "0" : "");
            sb.append(i9);
            sb.append(i10 < 10 ? ":0" : ":");
            sb.append(i10);
            int i11 = iAbs % 60;
            if (i11 != 0) {
                sb.append(i11 < 10 ? ":0" : ":");
                sb.append(i11);
            }
            string = sb.toString();
        }
        this.f23581c = string;
    }

    public int getTotalSeconds() {
        return this.f23580b;
    }

    @Override
    public final String s() {
        return this.f23581c;
    }

    @Override
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return qVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return qVar != null && qVar.Y(this);
    }

    @Override
    public final int j(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f23580b;
        }
        if (qVar == null) {
            return super.l(qVar).a(f(qVar), qVar);
        }
        throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
    }

    @Override
    public final long f(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f23580b;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(b.a("Unsupported field: ", qVar));
        }
        return qVar.r(this);
    }

    @Override
    public final Object b(TemporalQuery temporalQuery) {
        return (temporalQuery == j$.time.temporal.r.f23805d || temporalQuery == j$.time.temporal.r.f23806e) ? this : super.b(temporalQuery);
    }

    @Override
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.e(this.f23580b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            if (this.f23580b == ((ZoneOffset) obj).f23580b) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.f23580b;
    }

    @Override
    public String toString() {
        return this.f23581c;
    }

    private Object writeReplace() {
        return new r((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override
    public final void W(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        d0(objectOutput);
    }

    public final void d0(DataOutput dataOutput) throws IOException {
        int i3 = this.f23580b;
        int i9 = i3 % MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR == 0 ? i3 / MediaPlayer.MEDIA_INFO_TIMED_TEXT_ERROR : 127;
        dataOutput.writeByte(i9);
        if (i9 == 127) {
            dataOutput.writeInt(i3);
        }
    }

    public static ZoneOffset c0(ObjectInput objectInput) throws IOException {
        byte b9 = objectInput.readByte();
        return b9 == 127 ? ofTotalSeconds(objectInput.readInt()) : ofTotalSeconds(b9 * 900);
    }
}
