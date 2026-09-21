package j$.time;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements j$.time.temporal.p, java.lang.Comparable, java.io.Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j$.time.d f23644c = new j$.time.d(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23646b;

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        j$.time.d dVar = (j$.time.d) obj;
        int iCompare = java.lang.Long.compare(this.f23645a, dVar.f23645a);
        return iCompare != 0 ? iCompare : this.f23646b - dVar.f23646b;
    }

    static {
        java.math.BigInteger.valueOf(androidx.media3.common.C.NANOS_PER_SECOND);
    }

    public static j$.time.d r(long j, int i3) {
        if ((((long) i3) | j) == 0) {
            return f23644c;
        }
        return new j$.time.d(j, i3);
    }

    public d(long j, int i3) {
        this.f23645a = j;
        this.f23646b = i3;
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m p(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        long j = this.f23645a;
        j$.time.chrono.ChronoLocalDate chronoLocalDateI = chronoLocalDate;
        if (j != 0) {
            chronoLocalDateI = chronoLocalDate.i(j, (j$.time.temporal.s) j$.time.temporal.b.SECONDS);
        }
        int i3 = this.f23646b;
        return i3 != 0 ? chronoLocalDateI.i(i3, (j$.time.temporal.s) j$.time.temporal.b.NANOS) : chronoLocalDateI;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.d) {
            j$.time.d dVar = (j$.time.d) obj;
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

    public final java.lang.String toString() {
        if (this == f23644c) {
            return "PT0S";
        }
        long j = this.f23645a;
        int i3 = this.f23646b;
        long j9 = (j >= 0 || i3 <= 0) ? j : 1 + j;
        long j10 = j9 / 3600;
        int i9 = (int) ((j9 % 3600) / 60);
        int i10 = (int) (j9 % 60);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(24);
        sb.append("PT");
        if (j10 != 0) {
            sb.append(j10);
            sb.append('H');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append(io.ktor.util.date.GMTDateParser.MONTH);
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
                sb.append(((long) i3) + androidx.media3.common.C.NANOS_PER_SECOND);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private java.lang.Object writeReplace() {
        return new j$.time.r((byte) 1, this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }
}
