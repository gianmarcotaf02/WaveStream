package p202z;

import V7.InterfaceC0982h;
import java.util.ArrayList;
import p020c0.X;
import p070h6.A;
import p100l6.c;

public final class f implements InterfaceC0982h {

    public final int f32112h;

    public final ArrayList f32113i;
    public final X j;

    public f(ArrayList arrayList, X x9, int i3) {
        this.f32112h = i3;
        this.f32113i = arrayList;
        this.j = x9;
    }

    @Override
    public final Object emit(Object obj, c cVar) {
        switch (this.f32112h) {
            case 0:
                j jVar = (j) obj;
                boolean z6 = jVar instanceof d;
                ArrayList arrayList = this.f32113i;
                if (z6) {
                    arrayList.add(jVar);
                } else if (jVar instanceof e) {
                    arrayList.remove(((e) jVar).f32111a);
                }
                this.j.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                j jVar2 = (j) obj;
                boolean z9 = jVar2 instanceof m;
                ArrayList arrayList2 = this.f32113i;
                if (z9) {
                    arrayList2.add(jVar2);
                } else if (jVar2 instanceof n) {
                    arrayList2.remove(((n) jVar2).f32120a);
                } else if (jVar2 instanceof l) {
                    arrayList2.remove(((l) jVar2).f32118a);
                }
                this.j.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
        }
        return A.f22523a;
    }
}
