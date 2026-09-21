package Q6;

import java.util.ArrayList;
import java.util.List;
import p062g7.X;

public final class z {

    public final List f8712a;

    public z(X typeTable) {
        kotlin.jvm.internal.m.e(typeTable, "typeTable");
        List list = typeTable.j;
        if ((typeTable.f22088i & 1) == 1) {
            int i3 = typeTable.f22089k;
            kotlin.jvm.internal.m.d(list, "getTypeList(...)");
            ArrayList arrayList = new ArrayList(p078i6.q.I0(list, 10));
            int i9 = 0;
            for (Object obj : list) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    p078i6.p.H0();
                    throw null;
                }
                p062g7.Q qF = (p062g7.Q) obj;
                if (i9 >= i3) {
                    qF.getClass();
                    p062g7.P p2 = p062g7.Q.p(qF);
                    p2.f22006k |= 2;
                    p2.f22008m = true;
                    qF = p2.f();
                    if (!qF.isInitialized()) {
                        throw new I3.b(12);
                    }
                }
                arrayList.add(qF);
                i9 = i10;
            }
            list = arrayList;
        }
        kotlin.jvm.internal.m.d(list, "run(...)");
        this.f8712a = list;
    }

    public p062g7.Q a(int i3) {
        return (p062g7.Q) this.f8712a.get(i3);
    }

    public z(List list) {
        this.f8712a = list;
    }
}
