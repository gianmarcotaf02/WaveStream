package p113n1;

public final class m {

    public final long f25565a;

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static String b(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return this.f25565a == ((m) obj).f25565a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25565a);
    }

    public final String toString() {
        return b(this.f25565a);
    }
}
