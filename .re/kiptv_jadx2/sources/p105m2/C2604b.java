package p105m2;

import java.util.ArrayList;

public final class C2604b {

    public final C2608f f25271a;

    public void a(AbstractC2620s abstractC2620s, C2617o c2617o, ArrayList arrayList) {
        C2608f c2608f = this.f25271a;
        if (abstractC2620s != c2608f.f25307v || c2617o == null) {
            if (abstractC2620s == c2608f.f25305t) {
                if (c2617o != null) {
                    c2608f.n(c2608f.f25304s, c2617o);
                }
                c2608f.f25304s.j(arrayList);
                return;
            }
            return;
        }
        C2627z c2627z = c2608f.f25306u.f25193a;
        String strD = c2617o.d();
        A a2 = new A(c2627z, strD, c2608f.b(c2627z, strD));
        a2.f(c2617o);
        if (c2608f.f25304s == a2) {
            return;
        }
        c2608f.h(c2608f, a2, c2608f.f25307v, 3, c2608f.f25306u, arrayList);
        c2608f.f25306u = null;
        c2608f.f25307v = null;
    }
}
