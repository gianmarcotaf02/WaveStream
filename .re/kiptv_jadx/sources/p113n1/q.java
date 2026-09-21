package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25572a;

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p113n1.q) {
            return this.f25572a == ((p113n1.q) obj).f25572a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f25572a);
    }

    public final java.lang.String toString() {
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
