package p113n1;

import p121o0.p;
import p122o1.a;

public final class o implements a {

    public final float f25568a;

    public o(float f9) {
        this.f25568a = f9;
    }

    @Override
    public final float a(float f9) {
        return f9 / this.f25568a;
    }

    @Override
    public final float b(float f9) {
        return f9 * this.f25568a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Float.compare(this.f25568a, ((o) obj).f25568a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f25568a);
    }

    public final String toString() {
        return p.q(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f25568a, ')');
    }
}
