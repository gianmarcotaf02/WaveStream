package Y4;

public final class D2 extends E2 {

    public final int f11575h;

    public D2(int i3) {
        super(Y6.f.f(i3, "Server error (", ")"));
        this.f11575h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D2) && this.f11575h == ((D2) obj).f11575h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11575h);
    }

    @Override
    public final String toString() {
        return Y6.f.k(new StringBuilder("ServerError(code="), this.f11575h, ")");
    }
}
