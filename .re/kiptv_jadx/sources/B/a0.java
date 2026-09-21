package B;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B.a0 f511a = new B.a0();

    public static p137q0.p a(B.a0 a0Var, float f9) {
        a0Var.getClass();
        if (f9 <= 0.0d) {
            C.a.a("invalid weight; must be greater than zero");
        }
        if (f9 > Float.MAX_VALUE) {
            f9 = Float.MAX_VALUE;
        }
        return new B.H(f9, true);
    }
}
