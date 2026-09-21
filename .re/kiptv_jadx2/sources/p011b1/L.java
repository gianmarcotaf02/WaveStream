package p011b1;

import Y6.f;

public final class L {

    public static final long f17782b = D.b(0, 0);

    public static final int f17783c = 0;

    public final long f17784a;

    public L(long j) {
        this.f17784a = j;
    }

    public static boolean a(long j, Object obj) {
        return (obj instanceof L) && j == ((L) obj).f17784a;
    }

    public static final boolean b(long j, long j9) {
        return j == j9;
    }

    public static final boolean c(long j) {
        return ((int) (j >> 32)) == ((int) (j & 4294967295L));
    }

    public static final int d(long j) {
        return e(j) - f(j);
    }

    public static final int e(long j) {
        return Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int f(long j) {
        return Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static String h(long j) {
        StringBuilder sb = new StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return f.j(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        return a(this.f17784a, obj);
    }

    public final int hashCode() {
        return Long.hashCode(this.f17784a);
    }

    public final String toString() {
        return h(this.f17784a);
    }
}
