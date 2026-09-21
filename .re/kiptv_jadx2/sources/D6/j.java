package D6;

public final class j extends h {

    public static final j f2469k = new j(1, 0);

    public j(long j, long j9) {
        super(j, j9, 1L);
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (isEmpty() && ((j) obj).isEmpty()) {
            return true;
        }
        j jVar = (j) obj;
        if (this.f2464h == jVar.f2464h) {
            return this.f2465i == jVar.f2465i;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.f2464h;
        long j9 = ((long) 31) * (j ^ (j >>> 32));
        long j10 = this.f2465i;
        return (int) (j9 + (j10 ^ (j10 >>> 32)));
    }

    @Override
    public final boolean isEmpty() {
        return this.f2464h > this.f2465i;
    }

    @Override
    public final String toString() {
        return this.f2464h + ".." + this.f2465i;
    }
}
