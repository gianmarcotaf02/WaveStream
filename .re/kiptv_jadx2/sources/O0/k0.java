package O0;

import java.util.ArrayList;

public final class k0 extends kotlin.jvm.internal.o implements p194x6.j {

    public final int f7653h;

    public final ArrayList f7654i;

    public k0(int i3, ArrayList arrayList) {
        super(1);
        this.f7653h = i3;
        this.f7654i = arrayList;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f7653h) {
            case 0:
                f0 f0Var = (f0) obj;
                ArrayList arrayList = this.f7654i;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f0.k(f0Var, (g0) arrayList.get(i3), 0, 0);
                }
                break;
            case 1:
                f0 f0Var2 = (f0) obj;
                ArrayList arrayList2 = this.f7654i;
                int size2 = arrayList2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    f0.j(f0Var2, (g0) arrayList2.get(i9), 0, 0);
                }
                break;
            case 2:
                f0 f0Var3 = (f0) obj;
                ArrayList arrayList3 = this.f7654i;
                int iA0 = p078i6.p.A0(arrayList3);
                if (iA0 >= 0) {
                    int i10 = 0;
                    while (true) {
                        f0.j(f0Var3, (g0) arrayList3.get(i10), 0, 0);
                        if (i10 != iA0) {
                            i10++;
                        }
                    }
                }
                break;
            default:
                f0 f0Var4 = (f0) obj;
                ArrayList arrayList4 = this.f7654i;
                int size3 = arrayList4.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    f0Var4.g((g0) arrayList4.get(i11), 0, 0, 0.0f);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
