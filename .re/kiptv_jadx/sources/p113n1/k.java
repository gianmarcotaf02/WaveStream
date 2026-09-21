package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    public static java.lang.String d(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return Y6.f.j(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p113n1.k) {
            return this.f25559a == ((p113n1.k) obj).f25559a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f25559a);
    }

    public final java.lang.String toString() {
        return d(this.f25559a);
    }
}
