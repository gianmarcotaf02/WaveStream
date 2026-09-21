package p113n1;

public final class q {

    public final long f25572a;

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f25572a == ((q) obj).f25572a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25572a);
    }

    public final String toString() {
        long j = this.f25572a;
        if (a(j, 0L)) {
            return "Unspecified";
        }
        if (a(j, 4294967296L)) {
            return "Sp";
        }
        return a(j, 8589934592L) ? "Em" : "Invalid";
    }
}
