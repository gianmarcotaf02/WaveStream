package p050f3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21683b;

    public a(int i3, long j) {
        if (i3 == 0) {
            throw new java.lang.NullPointerException("Null status");
        }
        this.f21682a = i3;
        this.f21683b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p050f3.a)) {
            return false;
        }
        p050f3.a aVar = (p050f3.a) obj;
        return Z.AbstractC1149h0.a(this.f21682a, aVar.f21682a) && this.f21683b == aVar.f21683b;
    }

    public final int hashCode() {
        int iC = (Z.AbstractC1149h0.c(this.f21682a) ^ 1000003) * 1000003;
        long j = this.f21683b;
        return iC ^ ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackendResponse{status=");
        int i3 = this.f21682a;
        if (i3 == 1) {
            str = "OK";
        } else if (i3 == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i3 != 3) {
            str = i3 != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return Y6.f.g(this.f21683b, "}", sb);
    }
}
