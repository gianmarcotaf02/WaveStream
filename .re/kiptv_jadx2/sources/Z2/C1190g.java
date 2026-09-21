package Z2;

public final class C1190g implements InterfaceC1186e {

    public final int f12877a;

    @Override
    public final boolean a(AbstractC1181b0 abstractC1181b0) {
        switch (this.f12877a) {
            case 0:
                return !(abstractC1181b0 instanceof Z) || ((Z) abstractC1181b0).b().size() == 0;
            case 1:
                return abstractC1181b0.f12870b == null;
            default:
                return false;
        }
    }

    public final String toString() {
        switch (this.f12877a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
