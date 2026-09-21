package H5;

import B.AbstractC0065c;
import D0.C0204e;
import D0.C0205f;
import D0.C0206g;
import p020c0.C1700q;
import p188x0.C3098s;

public final class C0378a implements p194x6.m {

    public static final C0378a f4162i = new C0378a(0);
    public static final C0378a j = new C0378a(1);

    public final int f4163h;

    public C0378a(int i3) {
        this.f4163h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        p070h6.A a2 = p070h6.A.f22523a;
        switch (this.f4163h) {
            case 0:
                C1700q c1700q = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q.F()) {
                    c1700q.W();
                } else {
                    C0205f c0205fB = R8.i.f9104l;
                    if (c0205fB == null) {
                        C0204e c0204e = new C0204e("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = D0.I.f1820a;
                        p188x0.S s9 = new p188x0.S(C3098s.f31123b);
                        C0206g c0206g = new C0206g();
                        c0206g.l(1.0f, 21.0f);
                        c0206g.i(22.0f);
                        c0206g.j(12.0f, 2.0f);
                        c0206g.j(1.0f, 21.0f);
                        c0206g.e();
                        c0206g.l(13.0f, 18.0f);
                        c0206g.i(-2.0f);
                        c0206g.p(-2.0f);
                        c0206g.i(2.0f);
                        c0206g.p(2.0f);
                        c0206g.e();
                        c0206g.l(13.0f, 14.0f);
                        c0206g.i(-2.0f);
                        c0206g.p(-4.0f);
                        c0206g.i(2.0f);
                        c0206g.p(4.0f);
                        c0206g.e();
                        C0204e.a(c0204e, c0206g.f1884a, s9);
                        c0205fB = c0204e.b();
                        R8.i.f9104l = c0205fB;
                    }
                    Z.G.b(c0205fB, null, AbstractC0065c.r(p137q0.m.f26474b, 0.0f, 0.0f, 0.0f, 8, 7), C3098s.c(C3098s.f31124c, 0.3f), c1700q, 3504, 0);
                }
                break;
            default:
                C1700q c1700q2 = (C1700q) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c1700q2.F()) {
                    c1700q2.W();
                } else {
                    Z.G.b(R8.i.t(), null, AbstractC0065c.r(p137q0.m.f26474b, 0.0f, 0.0f, 0.0f, 8, 7), C3098s.c(C3098s.f31124c, 0.3f), c1700q2, 3504, 0);
                }
                break;
        }
        return a2;
    }
}
