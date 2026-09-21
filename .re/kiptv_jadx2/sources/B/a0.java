package B;

public final class a0 {

    public static final a0 f511a = new a0();

    public static p137q0.p a(a0 a0Var, float f9) {
        a0Var.getClass();
        if (f9 <= 0.0d) {
            C.a.a("invalid weight; must be greater than zero");
        }
        if (f9 > Float.MAX_VALUE) {
            f9 = Float.MAX_VALUE;
        }
        return new H(f9, true);
    }
}
