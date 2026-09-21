package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p113n1.q[] f25569b = {new p113n1.q(0), new p113n1.q(4294967296L), new p113n1.q(8589934592L)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f25570c = com.google.common.util.concurrent.D.C(0, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25571a;

    public /* synthetic */ p(long j) {
        this.f25571a = j;
    }

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static final long b(long j) {
        return f25569b[(int) ((j & 1095216660480L) >>> 32)].f25572a;
    }

    public static final float c(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static java.lang.String d(long j) {
        long jB = b(j);
        if (p113n1.q.a(jB, 0L)) {
            return "Unspecified";
        }
        if (p113n1.q.a(jB, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!p113n1.q.a(jB, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p113n1.p) {
            return this.f25571a == ((p113n1.p) obj).f25571a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f25571a);
    }

    public final java.lang.String toString() {
        return d(this.f25571a);
    }
}
