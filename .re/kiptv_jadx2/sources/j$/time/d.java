package j$.time;

import androidx.media3.common.C;
import io.ktor.util.date.GMTDateParser;
import j$.time.chrono.ChronoLocalDate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;

public final class d implements j$.time.temporal.p, Comparable, Serializable {

    public static final d f23644c = new d(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    public final long f23645a;

    public final int f23646b;

    @Override
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int iCompare = Long.compare(this.f23645a, dVar.f23645a);
        return iCompare != 0 ? iCompare : this.f23646b - dVar.f23646b;
    }

    static {
        BigInteger.valueOf(C.NANOS_PER_SECOND);
    }

    public static d r(long j, int i3) {
        if ((((long) i3) | j) == 0) {
            return f23644c;
        }
        return new d(j, i3);
    }

    public d(long j, int i3) {
        this.f23645a = j;
        this.f23646b = i3;
    }

    @Override
    public final j$.time.temporal.m p(ChronoLocalDate chronoLocalDate) {
        long j = this.f23645a;
        ChronoLocalDate chronoLocalDateI = chronoLocalDate;
        if (j != 0) {
            chronoLocalDateI = chronoLocalDate.i(j, (j$.time.temporal.s) j$.time.temporal.b.SECONDS);
        }
        int i3 = this.f23646b;
        return i3 != 0 ? chronoLocalDateI.i(i3, (j$.time.temporal.s) j$.time.temporal.b.NANOS) : chronoLocalDateI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f23645a == dVar.f23645a && this.f23646b == dVar.f23646b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f23645a;
        return (this.f23646b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f23644c) {
            return "PT0S";
        }
        long j = this.f23645a;
        int i3 = this.f23646b;
        long j9 = (j >= 0 || i3 <= 0) ? j : 1 + j;
        long j10 = j9 / 3600;
        int i9 = (int) ((j9 % 3600) / 60);
        int i10 = (int) (j9 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j10 != 0) {
            sb.append(j10);
            sb.append('H');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append(GMTDateParser.MONTH);
        }
        if (i10 == 0 && i3 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j < 0 && i3 > 0 && i10 == 0) {
            sb.append("-0");
        } else {
            sb.append(i10);
        }
        if (i3 > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - ((long) i3));
            } else {
                sb.append(((long) i3) + C.NANOS_PER_SECOND);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
