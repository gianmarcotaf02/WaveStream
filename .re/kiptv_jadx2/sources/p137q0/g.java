package p137q0;

import p121o0.p;

public final class g {

    public final float f26466a;

    public g(float f9) {
        this.f26466a = f9;
    }

    public final int a(int i3, int i9) {
        return Math.round((1 + this.f26466a) * ((i9 - i3) / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.f26466a, ((g) obj).f26466a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26466a);
    }

    public final String toString() {
        return p.q(new StringBuilder("Vertical(bias="), this.f26466a, ')');
    }
}
