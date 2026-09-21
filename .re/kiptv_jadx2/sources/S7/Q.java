package S7;

public final class Q implements InterfaceC0881c0 {

    public final boolean f9554h;

    public Q(boolean z6) {
        this.f9554h = z6;
    }

    @Override
    public final r0 a() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.f9554h;
    }

    public final String toString() {
        return Y6.f.l(new StringBuilder("Empty{"), this.f9554h ? "Active" : "New", '}');
    }
}
