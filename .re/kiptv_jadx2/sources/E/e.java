package E;

public final class e {

    public final long f2617a;

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f2617a == ((e) obj).f2617a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2617a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.f2617a + ')';
    }
}
