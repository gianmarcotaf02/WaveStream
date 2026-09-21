package p020c0;

public final class J implements h1 {

    public final C1681g0 f18121a;

    public J(C1681g0 c1681g0) {
        this.f18121a = c1681g0;
    }

    @Override
    public final Object a(InterfaceC1691l0 interfaceC1691l0) {
        return this.f18121a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && this.f18121a.equals(((J) obj).f18121a);
    }

    public final int hashCode() {
        return this.f18121a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f18121a + ')';
    }
}
