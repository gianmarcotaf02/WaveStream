package Y4;

public final class y2 extends E2 {

    public final int f12163h;

    public y2(int i3) {
        super(Y6.f.f(i3, "HTTP error (", ")"));
        this.f12163h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2) && this.f12163h == ((y2) obj).f12163h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12163h);
    }

    @Override
    public final String toString() {
        return Y6.f.k(new StringBuilder("HttpError(code="), this.f12163h, ")");
    }
}
