package V7;

import W7.C1007a;

public final class F implements InterfaceC0982h {

    public final int f10381h;

    public final p117n6.i f10382i;
    public final kotlin.jvm.internal.A j;

    public F(p194x6.m mVar, kotlin.jvm.internal.A a2, int i3) {
        this.f10381h = i3;
        switch (i3) {
            case 1:
                this.f10382i = (p117n6.i) mVar;
                this.j = a2;
                break;
            default:
                this.f10382i = (p117n6.i) mVar;
                this.j = a2;
                break;
        }
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        E e6;
        F f9;
        I i3;
        F f10;
        switch (this.f10381h) {
            case 0:
                if (cVar instanceof E) {
                    e6 = (E) cVar;
                    int i9 = e6.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        e6.j = i9 - Integer.MIN_VALUE;
                    } else {
                        e6 = new E(this, cVar);
                    }
                } else {
                    e6 = new E(this, cVar);
                }
                Object objInvoke = e6.f10378i;
                p109m6.a aVar = p109m6.a.f25430h;
                int i10 = e6.j;
                if (i10 == 0) {
                    com.google.common.util.concurrent.P.u0(objInvoke);
                    e6.f10377h = this;
                    e6.f10380l = obj;
                    e6.j = 1;
                    objInvoke = this.f10382i.invoke(obj, e6);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    f9 = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = e6.f10380l;
                    f9 = e6.f10377h;
                    com.google.common.util.concurrent.P.u0(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return p070h6.A.f22523a;
                }
                f9.j.f24539h = obj;
                throw new C1007a(f9);
            default:
                if (cVar instanceof I) {
                    i3 = (I) cVar;
                    int i11 = i3.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        i3.j = i11 - Integer.MIN_VALUE;
                    } else {
                        i3 = new I(this, cVar);
                    }
                } else {
                    i3 = new I(this, cVar);
                }
                Object objInvoke2 = i3.f10390i;
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i12 = i3.j;
                if (i12 == 0) {
                    com.google.common.util.concurrent.P.u0(objInvoke2);
                    i3.f10389h = this;
                    i3.f10392l = obj;
                    i3.j = 1;
                    objInvoke2 = this.f10382i.invoke(obj, i3);
                    if (objInvoke2 == aVar2) {
                        return aVar2;
                    }
                    f10 = this;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = i3.f10392l;
                    f10 = i3.f10389h;
                    com.google.common.util.concurrent.P.u0(objInvoke2);
                }
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return p070h6.A.f22523a;
                }
                f10.j.f24539h = obj;
                throw new C1007a(f10);
        }
    }
}
