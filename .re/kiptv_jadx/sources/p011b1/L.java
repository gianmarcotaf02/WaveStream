package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f17782b = p011b1.D.b(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17783c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17784a;

    public /* synthetic */ L(long j) {
        this.f17784a = j;
    }

    public static boolean a(long j, java.lang.Object obj) {
        return (obj instanceof p011b1.L) && j == ((p011b1.L) obj).f17784a;
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
        return java.lang.Math.max((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final int f(long j) {
        return java.lang.Math.min((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final boolean g(long j) {
        return ((int) (j >> 32)) > ((int) (j & 4294967295L));
    }

    public static java.lang.String h(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextRange(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return Y6.f.j(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(java.lang.Object obj) {
        return a(this.f17784a, obj);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f17784a);
    }

    public final java.lang.String toString() {
        return h(this.f17784a);
    }
}
