package p184w3;

import H3.q;
import java.util.Arrays;

public final class p {

    public final long f29898a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f29898a == ((p) obj).f29898a && q.j(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f29898a), 0, Boolean.FALSE, null});
    }
}
