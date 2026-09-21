package U;

import java.util.ArrayList;
import java.util.List;

public final class U implements O0.S {

    public static final U f9940a = new U();

    @Override
    public final O0.T g(O0.U u6, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            O0.g0 g0VarC = ((O0.Q) list.get(i3)).C(j);
            iMax = Math.max(iMax, g0VarC.f7639h);
            iMax2 = Math.max(iMax2, g0VarC.f7640i);
            arrayList.add(g0VarC);
        }
        return u6.q0(iMax, iMax2, p078i6.x.f23206h, new T(0, arrayList));
    }
}
