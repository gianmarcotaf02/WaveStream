package D;

import O0.f0;
import java.util.ArrayList;
import java.util.List;
import p020c0.X;

public final class s implements p194x6.j {

    public final int f1743h;

    public final X f1744i;
    public final ArrayList j;

    public final Object f1745k;

    public s(X x9, ArrayList arrayList, List list, boolean z6, int i3) {
        this.f1743h = i3;
        this.f1744i = x9;
        this.j = arrayList;
        this.f1745k = list;
    }

    @Override
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        switch (this.f1743h) {
            case 0:
                ArrayList arrayList = this.j;
                ?? r9 = this.f1745k;
                f0Var.f7634h = true;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((u) arrayList.get(i3)).i(f0Var);
                }
                int size2 = r9.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    ((u) r9.get(i9)).i(f0Var);
                }
                f0Var.f7634h = false;
                this.f1744i.getValue();
                break;
            default:
                ArrayList arrayList2 = this.j;
                ?? r10 = this.f1745k;
                f0Var.f7634h = true;
                int size3 = arrayList2.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    ((E.q) arrayList2.get(i10)).i(f0Var);
                }
                int size4 = r10.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    ((E.q) r10.get(i11)).i(f0Var);
                }
                f0Var.f7634h = false;
                this.f1744i.getValue();
                break;
        }
        return p070h6.A.f22523a;
    }
}
