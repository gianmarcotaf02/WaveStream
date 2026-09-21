package C5;

import E5.C0324y;
import E5.C0326z;
import J5.C0613n;
import J5.C0617o;
import J5.InterfaceC0621p;
import V7.InterfaceC0982h;
import kotlin.jvm.functions.Function0;

public final class C0141q0 implements InterfaceC0982h {

    public final int f1428h;

    public final Function0 f1429i;
    public final Function0 j;

    public C0141q0(Function0 function0, Function0 function1, int i3) {
        this.f1428h = i3;
        this.f1429i = function0;
        this.j = function1;
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        switch (this.f1428h) {
            case 0:
                AbstractC0117i0 abstractC0117i0 = (AbstractC0117i0) obj;
                if (kotlin.jvm.internal.m.a(abstractC0117i0, C0114h0.f1343a)) {
                    this.f1429i.invoke();
                } else {
                    if (!kotlin.jvm.internal.m.a(abstractC0117i0, C0111g0.f1333a)) {
                        throw new I3.b();
                    }
                    this.j.invoke();
                }
                return p070h6.A.f22523a;
            case 1:
                E5.U u6 = (E5.U) obj;
                if (kotlin.jvm.internal.m.a(u6, E5.P.f2928a)) {
                    this.f1429i.invoke();
                } else if (kotlin.jvm.internal.m.a(u6, E5.S.f2936a)) {
                    this.j.invoke();
                }
                return p070h6.A.f22523a;
            case 2:
                E5.B b9 = (E5.B) obj;
                if (kotlin.jvm.internal.m.a(b9, E5.A.f2839a) || kotlin.jvm.internal.m.a(b9, C0324y.f3180a)) {
                    this.f1429i.invoke();
                } else {
                    if (!kotlin.jvm.internal.m.a(b9, C0326z.f3187a)) {
                        throw new I3.b();
                    }
                    this.j.invoke();
                }
                return p070h6.A.f22523a;
            default:
                InterfaceC0621p interfaceC0621p = (InterfaceC0621p) obj;
                if (kotlin.jvm.internal.m.a(interfaceC0621p, C0617o.f6520a)) {
                    this.f1429i.invoke();
                } else {
                    if (!kotlin.jvm.internal.m.a(interfaceC0621p, C0613n.f6511a)) {
                        throw new I3.b();
                    }
                    this.j.invoke();
                }
                return p070h6.A.f22523a;
        }
    }
}
