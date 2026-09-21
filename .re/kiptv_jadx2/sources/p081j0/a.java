package p081j0;

import Y6.f;

public final class a {

    public int f23867a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f23867a == ((a) obj).f23867a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23867a);
    }

    public final String toString() {
        return f.j(new StringBuilder("DeltaCounter(count="), this.f23867a, ')');
    }
}
