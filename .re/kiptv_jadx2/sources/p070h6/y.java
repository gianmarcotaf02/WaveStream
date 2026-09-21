package p070h6;

import kotlin.jvm.internal.m;

public final class y implements Comparable {

    public final short f22556h;

    public y(short s9) {
        this.f22556h = s9;
    }

    @Override
    public final int compareTo(Object obj) {
        return m.f(this.f22556h & 65535, ((y) obj).f22556h & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return this.f22556h == ((y) obj).f22556h;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f22556h);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f22556h);
    }
}
