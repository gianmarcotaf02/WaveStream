package p033d3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p033d3.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f21205a;

    public i(java.util.ArrayList arrayList) {
        this.f21205a = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p033d3.o)) {
            return false;
        }
        return this.f21205a.equals(((p033d3.i) ((p033d3.o) obj)).f21205a);
    }

    public final int hashCode() {
        return this.f21205a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "BatchedLogRequest{logRequests=" + this.f21205a + "}";
    }
}
