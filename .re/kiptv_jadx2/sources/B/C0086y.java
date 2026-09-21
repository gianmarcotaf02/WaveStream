package B;

public final class C0086y {

    public static final C0086y f581a = new C0086y();

    public static p137q0.p a(p137q0.p pVar, float f9) {
        if (f9 <= 0.0d) {
            C.a.a("invalid weight; must be greater than zero");
        }
        if (f9 > Float.MAX_VALUE) {
            f9 = Float.MAX_VALUE;
        }
        return pVar.d(new H(f9, true));
    }
}
