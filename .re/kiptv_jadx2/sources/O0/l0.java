package O0;

import java.util.ArrayList;
import java.util.List;

public final class l0 extends Q0.C {

    public static final l0 f7656b = new l0("Undefined intrinsics block and it is required");

    @Override
    public final T g(U u6, List list, long j) {
        int size = list.size();
        p078i6.x xVar = p078i6.x.f23206h;
        if (size == 0) {
            return u6.q0(p113n1.a.j(j), p113n1.a.i(j), xVar, h0.j);
        }
        if (size == 1) {
            g0 g0VarC = ((Q) list.get(0)).C(j);
            return u6.q0(p113n1.b.g(g0VarC.f7639h, j), p113n1.b.f(g0VarC.f7640i, j), xVar, new j0(g0VarC, 0));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            g0 g0VarC2 = ((Q) list.get(i3)).C(j);
            iMax = Math.max(g0VarC2.f7639h, iMax);
            iMax2 = Math.max(g0VarC2.f7640i, iMax2);
            arrayList.add(g0VarC2);
        }
        return u6.q0(p113n1.b.g(iMax, j), p113n1.b.f(iMax2, j), xVar, new k0(0, arrayList));
    }
}
