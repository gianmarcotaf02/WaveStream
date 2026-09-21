package K0;

public final class C0663k {

    public final long f6709a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0663k) {
            return this.f6709a == ((C0663k) obj).f6709a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6709a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.f6709a + ')';
    }
}
