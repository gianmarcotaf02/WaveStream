package p033d3;

import java.util.ArrayList;

public final class i extends o {

    public final ArrayList f21205a;

    public i(ArrayList arrayList) {
        this.f21205a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f21205a.equals(((i) ((o) obj)).f21205a);
    }

    public final int hashCode() {
        return this.f21205a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f21205a + "}";
    }
}
