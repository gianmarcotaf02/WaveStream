package j$.time.temporal;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements java.io.Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23811d;

    public static j$.time.temporal.u f(long j, long j9) {
        if (j > j9) {
            throw new java.lang.IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new j$.time.temporal.u(j, j, j9, j9);
    }

    public static j$.time.temporal.u g(long j, long j9, long j10) {
        if (j > 1) {
            throw new java.lang.IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j9 > j10) {
            throw new java.lang.IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j10) {
            throw new java.lang.IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new j$.time.temporal.u(j, 1L, j9, j10);
    }

    public u(long j, long j9, long j10, long j11) {
        this.f23808a = j;
        this.f23809b = j9;
        this.f23810c = j10;
        this.f23811d = j11;
    }

    public final boolean d() {
        return this.f23808a >= -2147483648L && this.f23811d <= 2147483647L;
    }

    public final boolean e(long j) {
        return j >= this.f23808a && j <= this.f23811d;
    }

    public final int a(long j, j$.time.temporal.q qVar) {
        if (d() && e(j)) {
            return (int) j;
        }
        throw new j$.time.DateTimeException(c(j, qVar));
    }

    public final void b(long j, j$.time.temporal.q qVar) {
        if (!e(j)) {
            throw new j$.time.DateTimeException(c(j, qVar));
        }
    }

    public final java.lang.String c(long j, j$.time.temporal.q qVar) {
        if (qVar != null) {
            return "Invalid value for " + qVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        long j = this.f23808a;
        long j9 = this.f23809b;
        if (j > j9) {
            throw new java.io.InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j10 = this.f23810c;
        long j11 = this.f23811d;
        if (j10 > j11) {
            throw new java.io.InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j9 > j11) {
            throw new java.io.InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j$.time.temporal.u) {
            j$.time.temporal.u uVar = (j$.time.temporal.u) obj;
            if (this.f23808a == uVar.f23808a && this.f23809b == uVar.f23809b && this.f23810c == uVar.f23810c && this.f23811d == uVar.f23811d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f23809b;
        long j9 = this.f23808a + (j << 16) + (j >> 48);
        long j10 = this.f23810c;
        long j11 = j9 + (j10 << 32) + (j10 >> 32);
        long j12 = this.f23811d;
        long j13 = j11 + (j12 << 48) + (j12 >> 16);
        return (int) ((j13 >>> 32) ^ j13);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long j = this.f23808a;
        sb.append(j);
        long j9 = this.f23809b;
        if (j != j9) {
            sb.append('/');
            sb.append(j9);
        }
        sb.append(" - ");
        long j10 = this.f23810c;
        sb.append(j10);
        long j11 = this.f23811d;
        if (j10 != j11) {
            sb.append('/');
            sb.append(j11);
        }
        return sb.toString();
    }
}
