package I7;

public final class y extends n {

    public static final y f5609d = new y("must have no value parameters", 0);

    public static final y f5610e = new y("must have a single value parameter", 1);

    public final int f5611c;

    public y(String str, int i3) {
        super(str, 1);
        this.f5611c = i3;
    }

    @Override
    public final boolean a(Y6.g gVar) {
        switch (this.f5611c) {
            case 0:
                return gVar.O().isEmpty();
            default:
                return gVar.O().size() == 1;
        }
    }
}
