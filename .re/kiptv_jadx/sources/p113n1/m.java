package p113n1;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25565a;

    public static final boolean a(long j, long j9) {
        return j == j9;
    }

    public static java.lang.String b(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p113n1.m) {
            return this.f25565a == ((p113n1.m) obj).f25565a;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f25565a);
    }

    public final java.lang.String toString() {
        return b(this.f25565a);
    }
}
