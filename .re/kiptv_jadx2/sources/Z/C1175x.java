package Z;

import p020c0.C1700q;

public final class C1175x extends kotlin.jvm.internal.o implements p194x6.n {

    public static final C1175x f12573i = new C1175x(3, 0);
    public static final C1175x j = new C1175x(3, 1);

    public final int f12574h;

    public C1175x(int i3, int i9) {
        super(i3);
        this.f12574h = i9;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f12574h) {
            case 0:
                C1165p0 c1165p0 = (C1165p0) obj;
                C1700q c1700q = (C1700q) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c1700q.f(c1165p0) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18 && c1700q.F()) {
                    c1700q.W();
                } else {
                    z0.b(c1165p0, null, null, 0L, 0L, 0L, 0L, 0L, c1700q, iIntValue & 14);
                }
                return p070h6.A.f22523a;
            default:
                O0.U u6 = (O0.U) obj;
                long j9 = ((p113n1.a) obj3).f25547a;
                int iK0 = u6.k0(Z.f12352a);
                int i3 = iK0 * 2;
                O0.g0 g0VarC = ((O0.Q) obj2).C(p113n1.b.i(0, i3, j9));
                return u6.q0(g0VarC.f7639h, g0VarC.f7640i - i3, p078i6.x.f23206h, new Q(g0VarC, iK0, 0));
        }
    }
}
