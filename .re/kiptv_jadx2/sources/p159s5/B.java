package p159s5;

import Y6.f;

public final class B implements C {

    public final int f27268a;

    public B(int i3) {
        this.f27268a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B) && this.f27268a == ((B) obj).f27268a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27268a);
    }

    public final String toString() {
        return f.k(new StringBuilder("RecentlyAddedSeries(days="), this.f27268a, ")");
    }
}
