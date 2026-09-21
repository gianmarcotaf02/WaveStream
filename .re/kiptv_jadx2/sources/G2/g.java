package G2;

import F2.l;
import O0.C0718g;
import O0.InterfaceC0719h;
import T2.i;
import kotlin.jvm.internal.m;
import p020c0.C1690l;
import p020c0.C1700q;

public abstract class g {

    public static final long f3782a = p113n1.b.b(0, 0, 5);

    public static final int f3783b = 0;

    public static final i a(InterfaceC0719h interfaceC0719h, C1700q c1700q) {
        Object obj;
        Object obj2;
        boolean zA = m.a(interfaceC0719h, C0718g.f7638d);
        boolean zG = c1700q.g(zA);
        Object objQ = c1700q.Q();
        if (zG || objQ == C1690l.f18284a) {
            if (zA) {
                obj = i.f9741a;
            } else {
                l lVar = new l();
                lVar.f3543b = f3782a;
                obj = lVar;
            }
            Object obj3 = obj;
            c1700q.n0(obj3);
            obj2 = obj3;
        }
        obj2 = objQ;
        return (i) obj2;
    }

    public static void b(String str) {
        throw new IllegalArgumentException(B2.a.m("Unsupported type: ", str, ". ", Y6.f.h("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }
}
