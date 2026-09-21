package p184w3;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29898a;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p184w3.p) {
            return this.f29898a == ((p184w3.p) obj).f29898a && H3.q.j(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Long.valueOf(this.f29898a), 0, java.lang.Boolean.FALSE, null});
    }
}
