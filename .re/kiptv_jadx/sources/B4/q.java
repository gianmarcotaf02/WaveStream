package B4;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B4.q f723b = new B4.q(new B3.o(1));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B4.q f724c = new B4.q(new B3.o(5));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B4.q f725d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B4.p f726a;

    static {
        new B4.q(new B3.o(7));
        f725d = new B4.q(new B3.o(6));
        new B4.q(new B3.o(2));
        new B4.q(new B3.o(4));
        new B4.q(new B3.o(3));
    }

    public q(B3.o oVar) {
        if (p158s4.a.a()) {
            this.f726a = new B4.o(oVar, 1);
        } else if ("The Android Project".equals(java.lang.System.getProperty("java.vendor"))) {
            this.f726a = new B4.o(oVar, 0);
        } else {
            this.f726a = new p166t3.i(2, oVar);
        }
    }
}
