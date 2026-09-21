package Z;

/* JADX INFO: renamed from: Z.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1175x extends kotlin.jvm.internal.o implements p194x6.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z.C1175x f12573i = new Z.C1175x(3, 0);
    public static final Z.C1175x j = new Z.C1175x(3, 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12574h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1175x(int i3, int i9) {
        super(i3);
        this.f12574h = i9;
    }

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        switch (this.f12574h) {
            case 0:
                Z.C1165p0 c1165p0 = (Z.C1165p0) obj;
                p020c0.C1700q c1700q = (p020c0.C1700q) obj2;
                int iIntValue = ((java.lang.Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1700q.f(c1165p0) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c1700q.F()) {
                    c1700q.W();
                } else {
                    Z.z0.b(c1165p0, null, null, 0L, 0L, 0L, 0L, 0L, c1700q, iIntValue & 14);
                }
                return p070h6.A.f22523a;
            default:
                O0.U u6 = (O0.U) obj;
                long j9 = ((p113n1.a) obj3).f25547a;
                int iK0 = u6.k0(Z.Z.f12352a);
                int i3 = iK0 * 2;
                O0.g0 g0VarC = ((O0.Q) obj2).C(p113n1.b.i(0, i3, j9));
                return u6.q0(g0VarC.f7639h, g0VarC.f7640i - i3, p078i6.x.f23206h, new Z.Q(g0VarC, iK0, 0));
        }
    }
}
