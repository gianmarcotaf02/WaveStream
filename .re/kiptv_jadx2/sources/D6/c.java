package D6;

import kotlin.jvm.internal.m;

public final class c extends a {
    static {
        new c((char) 1, (char) 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f2451h == cVar.f2451h && this.f2452i == cVar.f2452i;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2451h * 31) + this.f2452i;
    }

    public final boolean isEmpty() {
        return m.f(this.f2451h, this.f2452i) > 0;
    }

    public final String toString() {
        return this.f2451h + ".." + this.f2452i;
    }
}
