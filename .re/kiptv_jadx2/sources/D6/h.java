package D6;

import java.util.Iterator;

public class h implements Iterable, p201y6.a {

    public final long f2464h;

    public final long f2465i;
    public final long j;

    public h(long j, long j9, long j10) {
        if (j10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j10 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2464h = j;
        if (j10 > 0) {
            if (j < j9) {
                long j11 = j9 % j10;
                long j12 = j % j10;
                long j13 = ((j11 < 0 ? j11 + j10 : j11) - (j12 < 0 ? j12 + j10 : j12)) % j10;
                j9 -= j13 < 0 ? j13 + j10 : j13;
            }
        } else {
            if (j10 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (j > j9) {
                long j14 = -j10;
                long j15 = j % j14;
                long j16 = j9 % j14;
                long j17 = ((j15 < 0 ? j15 + j14 : j15) - (j16 < 0 ? j16 + j14 : j16)) % j14;
                j9 += j17 < 0 ? j17 + j14 : j17;
            }
        }
        this.f2465i = j9;
        this.j = j10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (isEmpty() && ((h) obj).isEmpty()) {
            return true;
        }
        h hVar = (h) obj;
        return this.f2464h == hVar.f2464h && this.f2465i == hVar.f2465i && this.j == hVar.j;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j9 = this.f2464h;
        long j10 = this.f2465i;
        long j11 = (((j9 ^ (j9 >>> 32)) * j) + (j10 ^ (j10 >>> 32))) * j;
        long j12 = this.j;
        return (int) (j11 + (j12 ^ (j12 >>> 32)));
    }

    public boolean isEmpty() {
        long j = this.j;
        long j9 = this.f2465i;
        long j10 = this.f2464h;
        if (j > 0) {
            return j10 > j9;
        }
        return j10 < j9;
    }

    @Override
    public final Iterator iterator() {
        return new i(this.f2464h, this.f2465i, this.j);
    }

    public String toString() {
        StringBuilder sb;
        long j = this.j;
        long j9 = this.f2465i;
        long j10 = this.f2464h;
        if (j > 0) {
            sb = new StringBuilder();
            sb.append(j10);
            sb.append("..");
            sb.append(j9);
            sb.append(" step ");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(j10);
            sb.append(" downTo ");
            sb.append(j9);
            sb.append(" step ");
            sb.append(-j);
        }
        return sb.toString();
    }
}
