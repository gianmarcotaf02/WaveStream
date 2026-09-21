package Y4;

public final class S0 extends V0 {

    public final int f11726h;

    public S0(int i3) {
        super(Y6.f.f(i3, "TMDB HTTP error (", ")"));
        this.f11726h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S0) && this.f11726h == ((S0) obj).f11726h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11726h);
    }

    @Override
    public final String toString() {
        return Y6.f.k(new StringBuilder("HttpError(code="), this.f11726h, ")");
    }
}
