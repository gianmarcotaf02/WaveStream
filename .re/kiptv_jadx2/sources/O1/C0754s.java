package O1;

import S7.x0;
import V7.C0975a;
import V7.C0983i;
import V7.C0991q;
import V7.C0999z;
import V7.InterfaceC0981g;
import V7.InterfaceC0982h;
import V7.l0;
import java.util.Iterator;

public final class C0754s implements InterfaceC0981g {

    public final int f7859h;

    public final Object f7860i;

    public C0754s(int i3, Object obj) {
        this.f7859h = i3;
        this.f7860i = obj;
    }

    @Override
    public final Object collect(InterfaceC0982h interfaceC0982h, p100l6.c cVar) throws Throwable {
        C0983i c0983i;
        InterfaceC0982h interfaceC0982h2;
        Iterator it;
        C0975a c0975a;
        Throwable th;
        W7.y yVar;
        switch (this.f7859h) {
            case 0:
                Object objCollect = ((C0999z) this.f7860i).collect(new J5.V(interfaceC0982h, 1), cVar);
                return objCollect == p109m6.a.f25430h ? objCollect : p070h6.A.f22523a;
            case 1:
                if (cVar instanceof C0983i) {
                    c0983i = (C0983i) cVar;
                    int i3 = c0983i.f10465i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0983i.f10465i = i3 - Integer.MIN_VALUE;
                    } else {
                        c0983i = new C0983i(this, cVar);
                    }
                } else {
                    c0983i = new C0983i(this, cVar);
                }
                Object obj = c0983i.f10464h;
                p109m6.a aVar = p109m6.a.f25430h;
                int i9 = c0983i.f10465i;
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(obj);
                    interfaceC0982h2 = interfaceC0982h;
                    it = ((Iterable) this.f7860i).iterator();
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = c0983i.f10467l;
                    InterfaceC0982h interfaceC0982h3 = c0983i.f10466k;
                    com.google.common.util.concurrent.P.u0(obj);
                    interfaceC0982h2 = interfaceC0982h3;
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c0983i.f10466k = interfaceC0982h2;
                    c0983i.f10467l = it;
                    c0983i.f10465i = 1;
                    if (interfaceC0982h2.emit(next, c0983i) == aVar) {
                        return aVar;
                    }
                }
                return p070h6.A.f22523a;
            case 2:
                if (cVar instanceof C0975a) {
                    c0975a = (C0975a) cVar;
                    int i10 = c0975a.f10431k;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0975a.f10431k = i10 - Integer.MIN_VALUE;
                    } else {
                        c0975a = new C0975a(this, cVar);
                    }
                } else {
                    c0975a = new C0975a(this, cVar);
                }
                Object obj2 = c0975a.f10430i;
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i11 = c0975a.f10431k;
                p070h6.A a2 = p070h6.A.f22523a;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = c0975a.f10429h;
                    try {
                        com.google.common.util.concurrent.P.u0(obj2);
                        yVar.releaseIntercepted();
                        return a2;
                    } catch (Throwable th2) {
                        th = th2;
                        yVar.releaseIntercepted();
                        throw th;
                    }
                }
                com.google.common.util.concurrent.P.u0(obj2);
                W7.y yVar2 = new W7.y(interfaceC0982h, c0975a.getContext());
                try {
                    c0975a.f10429h = yVar2;
                    c0975a.f10431k = 1;
                    Object objInvoke = ((p117n6.i) this.f7860i).invoke(yVar2, c0975a);
                    if (objInvoke != aVar2) {
                        objInvoke = a2;
                    }
                    if (objInvoke == aVar2) {
                        return aVar2;
                    }
                    yVar = yVar2;
                    yVar.releaseIntercepted();
                    return a2;
                } catch (Throwable th3) {
                    th = th3;
                    yVar = yVar2;
                    yVar.releaseIntercepted();
                    throw th;
                }
            case 3:
                W7.u uVar = new W7.u((C0991q) this.f7860i, interfaceC0982h, null);
                x0 x0Var = new x0(cVar.getContext(), cVar, 1);
                Object objL0 = P3.e.l0(x0Var, x0Var, uVar);
                return objL0 == p109m6.a.f25430h ? objL0 : p070h6.A.f22523a;
            default:
                Object objCollect2 = ((l0) this.f7860i).collect(new J5.V(interfaceC0982h, 6), cVar);
                return objCollect2 == p109m6.a.f25430h ? objCollect2 : p070h6.A.f22523a;
        }
    }

    public C0754s(p194x6.m mVar) {
        this.f7859h = 2;
        this.f7860i = (p117n6.i) mVar;
    }
}
