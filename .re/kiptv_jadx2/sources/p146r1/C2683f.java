package p146r1;

import O0.Q;
import O0.S;
import O0.T;
import O0.U;
import O0.g0;
import O0.j0;
import O0.k0;
import java.util.ArrayList;
import java.util.List;
import p078i6.x;
import p113n1.a;

public final class C2683f implements S {

    public static final C2683f f26739b = new C2683f(0);

    public static final C2683f f26740c = new C2683f(1);

    public final int f26741a;

    public C2683f(int i3) {
        this.f26741a = i3;
    }

    @Override
    public final T g(U u6, List list, long j) {
        switch (this.f26741a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i3 = 0;
                for (int i9 = 0; i9 < size; i9++) {
                    g0 g0VarC = ((Q) list.get(i9)).C(j);
                    iJ = Math.max(iJ, g0VarC.f7639h);
                    i3 = Math.max(i3, g0VarC.f7640i);
                    arrayList.add(g0VarC);
                }
                if (list.isEmpty()) {
                    iJ = a.j(j);
                    i3 = a.i(j);
                }
                return u6.q0(iJ, i3, x.f23206h, new k0(1, arrayList));
            default:
                int size2 = list.size();
                x xVar = x.f23206h;
                if (size2 == 0) {
                    return u6.q0(0, 0, xVar, C2681d.f26732m);
                }
                if (size2 == 1) {
                    g0 g0VarC2 = ((Q) list.get(0)).C(j);
                    return u6.q0(g0VarC2.f7639h, g0VarC2.f7640i, xVar, new j0(g0VarC2, 2));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i10 = 0; i10 < size3; i10++) {
                    g0 g0VarC3 = ((Q) list.get(i10)).C(j);
                    iMax = Math.max(iMax, g0VarC3.f7639h);
                    iMax2 = Math.max(iMax2, g0VarC3.f7640i);
                    arrayList2.add(g0VarC3);
                }
                return u6.q0(iMax, iMax2, xVar, new k0(2, arrayList2));
        }
    }
}
