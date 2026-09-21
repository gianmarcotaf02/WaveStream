package K0;

public final class H {

    public final int f6656a;

    public final boolean equals(Object obj) {
        if (obj instanceof H) {
            return this.f6656a == ((H) obj).f6656a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6656a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f6656a + ')';
    }
}
