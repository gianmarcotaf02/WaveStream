package p013b3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f17868a;

    public b(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("name is null");
        }
        this.f17868a = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p013b3.b)) {
            return false;
        }
        return this.f17868a.equals(((p013b3.b) obj).f17868a);
    }

    public final int hashCode() {
        return this.f17868a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("Encoding{name=\""), this.f17868a, "\"}");
    }
}
