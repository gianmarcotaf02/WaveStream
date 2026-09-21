package p159s5;

import Y6.f;

public final class A implements C {

    public final int f27267a;

    public A(int i3) {
        this.f27267a = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A) && this.f27267a == ((A) obj).f27267a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27267a);
    }

    public final String toString() {
        return f.k(new StringBuilder("RecentlyAddedMovies(days="), this.f27267a, ")");
    }
}
