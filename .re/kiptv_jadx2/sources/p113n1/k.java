package p113n1;

import Y6.f;

public final class k {

    public final long f25559a;

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static final long b(long j, long j9) {
        return (((long) (((int) (j >> 32)) - ((int) (j9 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j9 & 4294967295L)))) & 4294967295L);
    }

    public static final long c(long j, long j9) {
        return (((long) (((int) (j >> 32)) + ((int) (j9 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j9 & 4294967295L)))) & 4294967295L);
    }

    public static String d(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return f.j(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f25559a == ((k) obj).f25559a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25559a);
    }

    public final String toString() {
        return d(this.f25559a);
    }
}
