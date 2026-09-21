package p179v4;

import java.util.Objects;

public final class r {

    public final Class f29187a;

    public final Class f29188b;

    public r(Class cls, Class cls2) {
        this.f29187a = cls;
        this.f29188b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rVar.f29187a.equals(this.f29187a) && rVar.f29188b.equals(this.f29188b);
    }

    public final int hashCode() {
        return Objects.hash(this.f29187a, this.f29188b);
    }

    public final String toString() {
        return this.f29187a.getSimpleName() + " with serialization type: " + this.f29188b.getSimpleName();
    }
}
