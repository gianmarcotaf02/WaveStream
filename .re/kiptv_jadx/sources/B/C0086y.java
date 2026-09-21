package B;

/* JADX INFO: renamed from: B.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0086y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B.C0086y f581a = new B.C0086y();

    public static p137q0.p a(p137q0.p pVar, float f9) {
        if (f9 <= 0.0d) {
            C.a.a("invalid weight; must be greater than zero");
        }
        if (f9 > Float.MAX_VALUE) {
            f9 = Float.MAX_VALUE;
        }
        return pVar.d(new B.H(f9, true));
    }
}
