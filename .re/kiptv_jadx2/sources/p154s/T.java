package p154s;

import p121o0.p;

public final class T {

    public final float f27097a;

    public final float f27098b;

    public final long f27099c;

    public T(float f9, float f10, long j) {
        this.f27097a = f9;
        this.f27098b = f10;
        this.f27099c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t9 = (T) obj;
        return Float.compare(this.f27097a, t9.f27097a) == 0 && Float.compare(this.f27098b, t9.f27098b) == 0 && this.f27099c == t9.f27099c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27099c) + p.c(this.f27098b, Float.hashCode(this.f27097a) * 31, 31);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f27097a + ", distance=" + this.f27098b + ", duration=" + this.f27099c + ')';
    }
}
