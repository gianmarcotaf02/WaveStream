package p076i4;

import java.io.Serializable;

public final class a1 extends O0 implements Serializable {

    public final O0 f22867h;

    public a1(O0 o8) {
        this.f22867h = o8;
    }

    @Override
    public final O0 a() {
        return this.f22867h;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f22867h.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a1) {
            return this.f22867h.equals(((a1) obj).f22867h);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f22867h.hashCode();
    }

    public final String toString() {
        return this.f22867h + ".reverse()";
    }
}
