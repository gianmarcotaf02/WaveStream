package W7;

import S7.x0;
import U7.EnumC0955c;
import V7.InterfaceC0981g;
import V7.InterfaceC0982h;
import com.google.common.util.concurrent.P;
import kotlin.jvm.functions.Function0;

public abstract class AbstractC1009c {

    public static final p100l6.c[] f10730a = new p100l6.c[0];

    public static final N6.A f10731b;

    public static final N6.A f10732c;

    public static final N6.A f10733d;

    static {
        int i3 = 2;
        f10731b = new N6.A("NULL", i3);
        f10732c = new N6.A("UNINITIALIZED", i3);
        f10733d = new N6.A("DONE", i3);
    }

    public static final Object a(InterfaceC0982h interfaceC0982h, Function0 function0, p100l6.c cVar, p194x6.n nVar, InterfaceC0981g[] interfaceC0981gArr) {
        s sVar = new s(interfaceC0982h, function0, null, nVar, interfaceC0981gArr);
        x0 x0Var = new x0(cVar.getContext(), cVar, 1);
        Object objL0 = P3.e.l0(x0Var, x0Var, sVar);
        return objL0 == p109m6.a.f25430h ? objL0 : p070h6.A.f22523a;
    }

    public static InterfaceC0981g b(v vVar, Z7.d dVar, int i3, EnumC0955c enumC0955c, int i9) {
        p100l6.h hVar = dVar;
        if ((i9 & 1) != 0) {
            hVar = p100l6.i.f24820h;
        }
        if ((i9 & 2) != 0) {
            i3 = -3;
        }
        if ((i9 & 4) != 0) {
            enumC0955c = EnumC0955c.f10175h;
        }
        return vVar.a(hVar, i3, enumC0955c);
    }

    public static final Object c(p100l6.h hVar, Object obj, Object obj2, p194x6.m mVar, p100l6.c frame) {
        Object objInvoke;
        Object objN = X7.a.n(hVar, obj2);
        try {
            C c9 = new C(frame, hVar);
            if (mVar == null) {
                objInvoke = P.w0(mVar, obj, c9);
            } else {
                kotlin.jvm.internal.E.c(2, mVar);
                objInvoke = mVar.invoke(obj, c9);
            }
            X7.a.g(hVar, objN);
            if (objInvoke == p109m6.a.f25430h) {
                kotlin.jvm.internal.m.e(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            X7.a.g(hVar, objN);
            throw th;
        }
    }
}
