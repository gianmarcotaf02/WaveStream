package p070h6;

import kotlin.jvm.internal.m;

public final class r implements Comparable {

    public final byte f22549h;

    public r(byte b9) {
        this.f22549h = b9;
    }

    @Override
    public final int compareTo(Object obj) {
        return m.f(this.f22549h & 255, ((r) obj).f22549h & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f22549h == ((r) obj).f22549h;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f22549h);
    }

    public final String toString() {
        return String.valueOf(this.f22549h & 255);
    }
}
