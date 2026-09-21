package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2500g implements j$.time.temporal.p, java.io.Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f23604e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.chrono.l f23605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23608d;

    static {
        j$.time.c.c(new java.lang.Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public C2500g(j$.time.chrono.l lVar, int i3, int i9, int i10) {
        this.f23605a = lVar;
        this.f23606b = i3;
        this.f23607c = i9;
        this.f23608d = i10;
    }

    public final java.lang.String toString() {
        j$.time.chrono.l lVar = this.f23605a;
        int i3 = this.f23608d;
        int i9 = this.f23607c;
        int i10 = this.f23606b;
        if (i10 == 0 && i9 == 0 && i3 == 0) {
            return lVar.toString() + " P0D";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(lVar.toString());
        sb.append(" P");
        if (i10 != 0) {
            sb.append(i10);
            sb.append(io.ktor.util.date.GMTDateParser.YEAR);
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append(io.ktor.util.date.GMTDateParser.MONTH);
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a  */
    @Override // j$.time.temporal.p
    public final j$.time.temporal.m p(j$.time.chrono.ChronoLocalDate chronoLocalDate) {
        long j;
        j$.time.chrono.l lVar = (j$.time.chrono.l) chronoLocalDate.b(j$.time.temporal.r.f23803b);
        j$.time.chrono.l lVar2 = this.f23605a;
        if (lVar == null || lVar2.equals(lVar)) {
            int i3 = this.f23606b;
            int i9 = this.f23607c;
            j$.time.temporal.m mVarI = chronoLocalDate;
            if (i9 != 0) {
                j$.time.temporal.u uVarX = lVar2.X(j$.time.temporal.a.MONTH_OF_YEAR);
                if (uVarX.f23808a == uVarX.f23809b) {
                    long j9 = uVarX.f23810c;
                    long j10 = uVarX.f23811d;
                    if (j9 == j10 && uVarX.d()) {
                        j = (j10 - uVarX.f23808a) + 1;
                    } else {
                        j = -1;
                    }
                } else {
                    j = -1;
                }
                j$.time.chrono.ChronoLocalDate chronoLocalDateI = chronoLocalDate;
                if (j > 0) {
                    mVarI = chronoLocalDate.i((((long) i3) * j) + ((long) i9), (j$.time.temporal.s) j$.time.temporal.b.MONTHS);
                } else {
                    if (i3 != 0) {
                        chronoLocalDateI = chronoLocalDate.i(i3, (j$.time.temporal.s) j$.time.temporal.b.YEARS);
                    }
                    mVarI = chronoLocalDateI.i(i9, (j$.time.temporal.s) j$.time.temporal.b.MONTHS);
                }
            } else if (i3 != 0) {
                mVarI = chronoLocalDate.i(i3, (j$.time.temporal.s) j$.time.temporal.b.YEARS);
            }
            int i10 = this.f23608d;
            return i10 != 0 ? mVarI.i(i10, j$.time.temporal.b.DAYS) : mVarI;
        }
        throw new j$.time.DateTimeException("Chronology mismatch, expected: " + lVar2.s() + ", actual: " + lVar.s());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j$.time.chrono.C2500g) {
            j$.time.chrono.C2500g c2500g = (j$.time.chrono.C2500g) obj;
            if (this.f23606b == c2500g.f23606b && this.f23607c == c2500g.f23607c && this.f23608d == c2500g.f23608d && this.f23605a.equals(c2500g.f23605a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23605a.hashCode() ^ (java.lang.Integer.rotateLeft(this.f23608d, 16) + (java.lang.Integer.rotateLeft(this.f23607c, 8) + this.f23606b));
    }

    public java.lang.Object writeReplace() {
        return new j$.time.chrono.E((byte) 9, this);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization via serialization delegate");
    }
}
