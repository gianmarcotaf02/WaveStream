package p050f3;

import Y6.f;
import Z.AbstractC1149h0;

public final class a {

    public final int f21682a;

    public final long f21683b;

    public a(int i3, long j) {
        if (i3 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f21682a = i3;
        this.f21683b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1149h0.a(this.f21682a, aVar.f21682a) && this.f21683b == aVar.f21683b;
    }

    public final int hashCode() {
        int iC = (AbstractC1149h0.c(this.f21682a) ^ 1000003) * 1000003;
        long j = this.f21683b;
        return iC ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
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
        return f.g(this.f21683b, "}", sb);
    }
}
