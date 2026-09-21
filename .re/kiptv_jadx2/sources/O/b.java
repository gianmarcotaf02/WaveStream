package O;

import C5.C0119j;
import D5.C0261o;
import O0.InterfaceC0732v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.A;

public final class b implements Function0 {

    public final int f7516h;

    public final i f7517i;
    public final Q.e j;

    public b(i iVar, Q.e eVar, int i3) {
        this.f7516h = i3;
        this.f7517i = iVar;
        this.j = eVar;
    }

    @Override
    public final Object invoke() {
        switch (this.f7516h) {
            case 0:
                i iVar = this.f7517i;
                a aVar = iVar.f7538f;
                C0261o c0261o = new C0261o(13, this.j);
                A a2 = new A();
                iVar.f7537e.d("dataBuilder", aVar, new C0119j(a2, c0261o, 20));
                Object obj = a2.f24539h;
                if (obj != null) {
                    return (M.c) obj;
                }
                kotlin.jvm.internal.m.k("result");
                throw null;
            case 1:
                i iVar2 = this.f7517i;
                a aVar2 = iVar2.g;
                b bVar = new b(iVar2, this.j, 2);
                A a9 = new A();
                iVar2.f7537e.d("positioner", aVar2, new C0119j(a9, bVar, 20));
                Object obj2 = a9.f24539h;
                if (obj2 != null) {
                    return (p181w0.b) obj2;
                }
                kotlin.jvm.internal.m.k("result");
                throw null;
            default:
                Object objInvoke = this.f7517i.f7535c.invoke();
                if (!((InterfaceC0732v) objInvoke).i()) {
                    objInvoke = null;
                }
                InterfaceC0732v interfaceC0732v = (InterfaceC0732v) objInvoke;
                return interfaceC0732v == null ? p181w0.b.f29745e : this.j.i0(interfaceC0732v).i(interfaceC0732v.R(0L));
        }
    }
}
